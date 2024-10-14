package JavaQuiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question {
    Scanner input=new Scanner(System.in);
        //Attributes
    private String question;
    public ArrayList<String> options;
    private String answer;
    public static String correctanswer, id;
    public static int totalquestion=0;


    // Here is constructor
    public Question(String question, ArrayList<String> options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }


        // To display QUestion
    public void displayQuestion(){
        System.out.println(question);
        // loop to print out the choices
        for(int index=0; index<=options.size()-1; index++){
            System.out.println((index +1)+":" + options.get(index));
        }

            // will try to get anwser from user

        System.out.print("Write the correct Answer Number: ");
        correctanswer=input.nextLine();


        // comparison of answer with equal ignore case
        if(displayanswer().equalsIgnoreCase(correctanswer) || correctanswer.equals(id)) {
            System.out.println("COngrats! It Correct");
            System.out.println();
            totalquestion++;
        }
        else if(correctanswer==null){
            System.out.println("YOu enter Null Value");
            System.out.println("COrrect answer: ");
            System.out.println(displayanswer());
            totalquestion--;
        }
        else{
            System.out.println("OOPss");
            System.out.println();
            System.out.println("COrrect answer: ");
            System.out.println(displayanswer());
            totalquestion--;

        }


        System.out.println();


    }

 public void TotalQuestion(){
     System.out.println(totalquestion);
 }

    // to display ANswer
    public String displayanswer(
    ){
       id= String.valueOf(options.indexOf(answer)+1);
        return  answer;
    }



    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", options=" + options +
                ", answer='" + answer + '\'' +
                '}';
    }
}
