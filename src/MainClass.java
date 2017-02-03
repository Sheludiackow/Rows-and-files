import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * 1) Создать 2 текстовых файла, примерно по 50-100 символов в каждом
 * (особого значения неимеет); on 03.02.2017.
 */
public class MainClass {
    static String ABC = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    static Random rnd = new Random();

    public static void main(String[] args) {
        createFile("1.txt",createString(100));
        createFile("2.txt",createString(100));
    }
    public static String createString(int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++){
            sb.append(ABC.charAt(rnd.nextInt(ABC.length())));
        }
        return sb.toString();
    }

    public static void createFile(String fileName, String text){
        try{
            PrintWriter pw = new PrintWriter(fileName);
            pw.write(text);
            pw.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
