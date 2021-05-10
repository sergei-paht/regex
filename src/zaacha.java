import java.util.Scanner;
public class zaacha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your ip address");
        String str = in.nextLine();// вводим строчку
        boolean answer = str.matches("([0-9]\\.|[0-9][0-9]\\.|1[0-9][0-9]\\.|2[0-4][0-9]\\.|25[0-5]\\.){3}[0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]");
        if(answer){
            System.out.println("The address is correct");
        }
        else{
            System.out.println("Invalid address");
        }
    }
}
