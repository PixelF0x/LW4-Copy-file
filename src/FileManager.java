import java.io.*;

public class FileManager {

    public void copyFile (String src, String dst) throws IOException{
        InputStream is = null;
        OutputStream os= null;

        int size=1*1024*1024;//Size 1Mb
        long startTime = System.nanoTime();
        try{
            is = new FileInputStream(src);
            os = new FileOutputStream(dst);
            byte[] buffer = new byte [size];
            int length;
            while ((length = is.read(buffer)) >= 0){
                os.write(buffer,  0, length);
            }
        }
        finally{
            is.close();
            os.close();
        }
        long endTime=System.nanoTime();
        System.out.print("Процесс копирования занял: ");
        System.out.print(endTime-startTime);
        System.out.println(" наносекунд");
    }
}
