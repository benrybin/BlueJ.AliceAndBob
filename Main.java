/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.println("Please enter your name");
        userName = scanner.nextLine();
        
        if (userName.equals("Bob")){
        System.out.println("Welcome Bob");

    }else if (userName.equals("Alice")){
        System.out.println("Welcome Alice");
}else{
    System.out.println("Welcome " + userName + " you must be new");
}
}
}
