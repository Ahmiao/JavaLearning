package com.ahmiao.springmergeweb.unitils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public  class FileUnitils {
   private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd/");
    public static String upload(MultipartFile uploadFile, HttpServletRequest req){
        String realpPath=
                req.getSession().getServletContext().getRealPath("/uploadFile/");
        String format=sdf.format(new Date());
        File folder= new File(realpPath+format);
        if(!folder.isDirectory()){
            folder.mkdirs();
        }
        String oldName=uploadFile.getOriginalFilename();
        String newName= UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf(".")
                ,oldName.length());
        try {
            uploadFile.transferTo(new File(folder,newName));
            String filePath=req.getScheme()+"://"+req.getServerName()+":"+
                    req.getServerPort()+"/uploadFile/"+format+newName;
            return filePath;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "上传失败！";
    }
}
