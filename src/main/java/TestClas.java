import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class TestClas {
    public static void main(String args[]) {
        File imageFile = new File("C:\\Users\\Administrator\\Desktop\\ocrimg\\222.png");
        if(imageFile.exists())
            System.out.println("文件存在");
        else
            System.out.println("文件不存在");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        instance.setDatapath("D:\\java\\ocr\\src\\main\\tessdata");
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
//        instance.setDatapath("D:\\java\\ocr\\src\\main\\resources");
        instance.setLanguage("chi_sim");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        //excute();
    }

}
