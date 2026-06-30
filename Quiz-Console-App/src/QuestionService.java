import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    //Constructor
    public QuestionService(){
        questions[0]=new Questions(1,"What Java is Fully Object Oriented Programming Language?",new String[]{"True","False","None of the above","All of the above"},"False");
        questions[1]=new Questions(2,"What is the size of int variable?",new String[]{"8 bit","16 bit","32 bit","64 bit"},"32 bit");
        questions[2]=new Questions(3,"What is the default value of boolean variable?",new String[]{"true","false","0","1"},"false");
        questions[3]=new Questions(4,"What is the default value of char variable?",new String[]{"0","\\u0000","null","none of the above"},"\\u0000");
        questions[4]=new Questions(5,"What is the default value of String variable?",new String[]{"0","\\u0000","null","none of the above"},"null");
    }


    public void playQuiz(){
            Scanner sc = new Scanner(System.in);
            int score = 0;

            System.out.println("==================================");
            System.out.println("      Please Start The Quiz");
            System.out.println("==================================");
            System.out.println("Press Enter to Start...");
            sc.nextLine();

            for (Questions q : questions) {

                System.out.println("----------------------------------");
                System.out.println("Question " + q.getId());
                System.out.println(q.getQuestions());
                          //Options
                String[] options = q.getOps();

                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }

                System.out.print("Enter Your Answer (1-4): ");
                int choice = sc.nextInt();

                String userAnswer = options[choice - 1];

                if (userAnswer.equalsIgnoreCase(q.getAns())) {

                    System.out.println("✅ Correct Answer");
                    score++;

                } else {

                    System.out.println("❌ Incorrect Answer");
                    System.out.println("Correct Answer : " + q.getAns());
                }
                System.out.println();
            }

            System.out.println("==============================");
            System.out.println("Quiz Completed");
            System.out.println("==============================");

            System.out.println("Correct Answers : " + score);
            System.out.println("Wrong Answers   : " + (questions.length - score));
            System.out.println("Final Score     : " + score + "/" + questions.length);
    }
}
