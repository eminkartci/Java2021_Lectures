import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

public class ReaderExample {
    
    public static void main(String[] args) {
        
        try{
            File f = new File("General/EmininSiirleri.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            System.out.println(br.readLine());

        }catch(Exception e){
            System.out.println("Dosya Okunamadi !!");
        }

    }

    public static boolean giveCreadit(String payCond){
        if(payCond.equals("yes")){
            return true;
        }else{
            return false;
        }
    }

}
