import java.util.Scanner;

public class userlogin{
    
    public static void main(String[] args) {

        String username, password, newpassword;

        int choose;
        

        Scanner input = new Scanner(System.in);

        System.out.print("User Name : ");

        username = input.nextLine();

        System.out.print("Password : ");

        password = input.nextLine();


        if(username.equals("John") && password.equals("newyork")){

            System.out.println("Login Successful !");

        } else if (username.equals("John")){

            System.out.println("Wrong Password !");

            System.out.print("Press 1 to Reset Password : ");

            choose = input.nextInt();

            if (choose == 1){

                System.out.print("New Password : ");

                input.nextLine();

                newpassword = input.nextLine();

                if (newpassword.equals("newyork")){

                    System.out.println("Failed to Create Password. Please Try Again.");

                } else {

                    System.out.println("Password Successfully Created.");

                }
            } else {

                System.out.println("Failed to Create Password. Please Try Again.");

            }

        } else {
            System.out.println("Username or Password is incorrect !");
        }


    }
}
