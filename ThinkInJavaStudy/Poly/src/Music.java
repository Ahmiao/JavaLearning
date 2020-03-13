import org.junit.Test;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-13 9:07
 */
public class Music {
    public static void tune(Instrument i){
       i.play(Note.MIDEDL_C);
    }
    @Test
    public void testMusic(){
        Wind flute=new Wind();
        tune(flute);
    }
}
