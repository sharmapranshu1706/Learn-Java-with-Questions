import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class AgeValidator {
    static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or older");
        }
        else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter Your Age: ");
            int age=Integer.parseInt(br.readLine().trim());
            checkAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a Valid Number");;
        }
        catch (IOException e) {
            System.out.println("Inpur error:" + e.getMessage());;
        }
//        try {
//            checkAge(21);
//        }
//        catch (InvalidAgeException e){
//            System.out.println("Exception caught: "+ e.getMessage());
//        }
    }
}
