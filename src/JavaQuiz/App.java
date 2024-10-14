package JavaQuiz;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Creation of Arraylist to store the Question in QUestionbank
        ArrayList<Question> questionsbank = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String userchoice = "yes";


        // QUestion 1
        ArrayList<String> choices1 = new ArrayList<>(List.of("Paris", "London", "Berlin", "Rome"));
        Question object1 = new Question("What is the capital of France?", choices1, "Paris");
        // Second Question
        ArrayList<String> choices2 = new ArrayList<>(List.of("Paris", "London", "Berlin", "Rome"));
        Question object2 = new Question("What is the capital of France?", choices2, "London");
        //Question 3
        ArrayList<String> choices3 = new ArrayList<>(List.of("Paris", "London", "Berlin", "Rome"));
        Question object3 = new Question("What is the capital of France?", choices3, "Rome");


        questionsbank.add(object1);
        questionsbank.add(object2);
        questionsbank.add(object3);



        for (Question quesTion : questionsbank) {
            quesTion.displayQuestion();
            System.out.println("You want to attempt another question: (YES/NO)");
           userchoice=input.nextLine();

        }






    }
}