import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Fifth {
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num =0;
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        catch (IOException e){
            System.out.println("Input read error: "+ e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Please Enter valid Integer Number");
        }
    }
}
