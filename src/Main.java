public class Main {

    public static void main (String[] args){
        String src = "C:\\Users\\PixelFox\\Desktop\\1.txt";
        String dst = "C:\\Users\\PixelFox\\Desktop\\2.txt";
        FileManager fileManager;
        try{
            fileManager =new FileManager();
            fileManager.copyFile(src,dst);
            System.out.println("Копирование прошло успешно");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
