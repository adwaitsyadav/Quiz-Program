import java.util.Scanner;

public class quizz {
        public static void main(String[] args) {
                
                Scanner scanner = new Scanner(System.in);

                String[] questions = {"Function of a router ? ",
                                      "Which part is brain of comp ? ",
                                      "facebook launch year ? ",
                                      "Father of comp",
                                      "1st programming lang ?"};

                String[][] options = {{"1. Store files","2.Encrypting data","3.managing passwords","4. directing internet"},
                                      {"1. Mouse","2, CPU", "3. Monitor", "4. Speaker"},
                                      {"1. 2000","2. 2004","3. 2006","4. 2010"},
                                      {"1. steve jobs","2. Charls babage","3. mark zuker","4. narendra modi"},
                                      {"1. cobol","2. java","3. Fortan","4. C++"}};
                                      
                int[] answers = {4 ,2 , 2 , 2, 3};
                int score = 0 ;
                int guess ;

                System.out.println("---Welcome to the Java Quiz game---");

                for (int i = 0 ; i < questions.length ; i++){
                        System.out.println(questions[i]);
                        for (String opt : options[i]){
                                System.out.println(opt);
                        }
                        System.out.print("Enter Your guess : ");
                        guess = scanner.nextInt();

                        if (guess == answers[i]){
                                System.out.println("Correct");
                                score++;

                        }
                        else{
                                System.out.println("Wrong");
                                
                        }
                }
                System.out.print("Your Final Score is "+score +" Out of "+questions.length);
                
                


                scanner.close();
        }        
}
