# **USER LOGIN**

# Information

* **Improved user login and password reset method.**

# Technologies Used

* **JAVA**

# Contents

* The variables **String** and **Int** is created.

* Values ​​are taken from the user with the scanner class.

* Log in with username and password using the if construct.

* Use password reset using the if construct.

* If you enter an incorrect username or password, you will receive a warning.
<br />

```Java

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


```

```Java

                if(username.equals("John") && password.equals("newyork")){

                System.out.println("Login Successful !");

                } else if (username.equals("John")){

                System.out.println("Wrong Password !");

                System.out.print("Press 1 to Reset Password : ");

                choose = input.nextInt();


```
```Java

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


```

```bash

        User Name : John
        Password : newyork
        Login Successful !

```
```bash

        User Name : john
        Password : newyork
        Username or Password is incorrect !

```
```bash

        User Name : John
        Password : random
        Wrong Password !
        Press 1 to Reset Password : 1
        New Password : newyork
        Failed to Create Password. Please Try Again.

```
```bash

        User Name : John
        Password : random
        Wrong Password !
        Press 1 to Reset Password : 1
        New Password : newjersey
        Password Successfully Created.

```

<br />

# LINK

* Click here https://github.com/Fogo9/UserLogin.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
