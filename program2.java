import java.util.Scanner;
class quiz
{
public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        String a="create quiz";
        String b="attempt quiz";
        System.out.println(a+" or "+b);
        String c=scanner.nextLine();
        if(c.equals(a))
        {
            for (int i = 0; i<=5; i++) {
                System.out.println("enter question??");
                String q1=scanner.nextLine();
                System.out.println("enter choice");
                String ch1=scanner.nextLine();
                String ch2=scanner.nextLine();
                String ch3=scanner.nextLine();
            }
        }
        else
        {
            int score = 0;
            String d="python";
            String e="c language";
            System.out.println(d+" or "+e);
            String f=scanner.nextLine();
            if(f.equals(d))
            {
                System.out.println("Quiz Time!");
                System.out.println("---------");
                System.out.println("Question 1: What is the print function in Python used for?");
                System.out.println("A)To read input from the user ");
                System.out.println("B)To write output to the screen ");
                System.out.println("C)To perform arithmetic operations ");
                System.out.println("D)To compare strings");
                String answer1 = scanner.next();
                if (answer1.equalsIgnoreCase("B")) {
                score++;
                    System.out.println("Correct!");
                } else 
                {
                    System.out.println("Incorrect. The correct answer is B)To write output to the screen ");
                }
                System.out.println("Question 2: Which of the following is the correct syntax for declaring a variable in Python?");
                System.out.println("A) int x = 5");
                System.out.println("B) x = 5");
                System.out.println("C) var x = 5");
                System.out.println("D) let x = 5");

                String answer2 = scanner.next();
                if (answer2.equalsIgnoreCase("B")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is B) x = 5.");
                }

                System.out.println("Question 3:What is the purpose of the 'len' function in Python?");
                System.out.println("A) To calculate the length of a string");
                System.out.println("B) To calculate the length of a list");
                System.out.println("C) To calculate the length of a dictionary");
                System.out.println("D) All of the above");

                String answer3 = scanner.next();
                if (answer3.equalsIgnoreCase("D")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is D) All of the above.");
                }

                System.out.println("Question 4: Which of the following is the correct syntax for declaring a list in Python?");
                System.out.println("A) list = [1, 2, 3]");
                System.out.println("B) array = [1, 2, 3]");
                System.out.println("C) List = [1, 2, 3]");
                System.out.println("D) ArrayList = [1, 2, 3]");

                String answer4 = scanner.next();
                if (answer4.equalsIgnoreCase("A")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is A) list = [1, 2, 3].");
                }

                System.out.println("Question 5: What is the purpose of the 'if' statement in Python?");
                System.out.println("A) To perform a loop");
                System.out.println("B) To perform a conditional operation");
                System.out.println("C) To perform arithmetic operations");
                System.out.println("D) To compare strings");

                String answer5 = scanner.next();
                if (answer5.equalsIgnoreCase("B")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is B) To perform a conditional operation.");
                }

                System.out.println("Your final score is: " + score + "/5");
        
            }
            else
            {
                System.out.println("Quiz Time!");
                System.out.println("---------");

                System.out.println("Question 1: What is the meaning of the keyword 'void' in C?");
                System.out.println("A) It means the function returns no value");
                System.out.println("B) It means the function takes no arguments");
                System.out.println("C) It means the function is recursive");
                System.out.println("D) It means the function is iterative ");

                String answer1 = scanner.next();
                if (answer1.equalsIgnoreCase("A")) {
                score++;
                    System.out.println("Correct!");
                } else 
                {
                    System.out.println("Incorrect. The correct answer is A) It means the function returns no value.");
                }

                System.out.println("Question 2: What is the purpose of the 'printf' function in C?");
                System.out.println("A) To read input from the user");
                System.out.println("B) To write output to the screen");
                System.out.println("C) To perform arithmetic operations");
                System.out.println("D) To compare strings");

                String answer2 = scanner.next();
                if (answer2.equalsIgnoreCase("B")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is B) To write output to the screen.");
                }

                System.out.println("Question 3: What is the difference between 'break' and 'continue' statements in C?");
                System.out.println("A) Break exits the loop, continue skips to the next iteration");
                System.out.println("B) Break skips to the next iteration, continue exits the loop");
                System.out.println("C) Break exits the program, continue skips to the next iteration");
                System.out.println("D) Break skips to the next iteration, continue exits the program");

                String answer3 = scanner.next();
                if (answer3.equalsIgnoreCase("A")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is A) Break exits the loop, continue skips to the next iteration.");
                }

                System.out.println("Question 4: Which of the following is the correct syntax for declaring a structure in C?");
                System.out.println("A) struct { int x; int y; };");
                System.out.println("B) struct { int x, y; };");
                System.out.println("C) struct Point { int x; int y; };");
                System.out.println("D)struct Point ( int x, int y ); ");

                String answer4 = scanner.next();
                if (answer4.equalsIgnoreCase("C")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is C) struct Point { int x; int y; };.");
                }

                System.out.println("Question 5: What is the purpose of the 'return' statement in C?");
                System.out.println("A) To exit a function and return a value");
                System.out.println("B) To start a function");
                System.out.println("C) To declare a variable");
                System.out.println("D) To include a header file");

                String answer5 = scanner.next();
                if (answer5.equalsIgnoreCase("A")) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. The correct answer is A) To exit a function and return a value.");
                }

                System.out.println("Your final score is: " + score + "/5");
            }
        }
    }
}


