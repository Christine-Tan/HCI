import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void readFileByChar(String path){
        try {
//            FileReader reader = new FileReader(new File(path));
            FileInputStream reader = new FileInputStream(new File(path));
            int signal = 0;
            int charNum = 1;
//            char [] get = new char[1];
            byte[] get = new byte[1];
            String show = "";
            while(true){
                signal = reader.read(get);
                if(signal == -1){
                    break;
                }
                show = (int)get[0]+"";
                System.out.println(charNum + " : " +show);
                charNum ++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void readFileByRow(String path){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            int lineNum = 1;
            String line = "";
            while(true){
                String show = "";
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                for(int i = 0 ; i < line.length() ; i++){
                    show += ((int)line.charAt(i)+" ");
                }
                System.out.println(lineNum + " : " + show);
                lineNum ++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ReadFile.readFileByChar("F:/b.txt");
//        ReadFile.readFileByRow("F:/b.txt");
    }
}
