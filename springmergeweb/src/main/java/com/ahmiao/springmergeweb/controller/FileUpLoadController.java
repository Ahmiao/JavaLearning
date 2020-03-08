package com.ahmiao.springmergeweb.controller;

import com.ahmiao.springmergeweb.unitils.FileUnitils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUpLoadController {

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req){
        return FileUnitils.upload(uploadFile,req);
    }

}
