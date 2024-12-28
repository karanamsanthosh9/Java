

import java.util.Scanner;

class Question
{
    private int questionId;
    private String questionText;
    private char[] options = {'a' , 'b'} ;
    private char correctAnswer;
    private char markedOption;

    Question(int q, String str, char ans)
    {
        this.questionId  = q;
        this.questionText = str;
        this.correctAnswer = ans;
    }

    public void displayQuestion(Question q)
    {
        System.out.println(q.questionText);
        System.out.println(options[0] + ") Even Number");
        System.out.println(options[1] + ") Odd Number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option :");
        this.markedOption = sc.next().charAt(0);
        this.correctAnswer = this.questionId % 2 == 0 ? 'a' :'b';
       // System.out.println("correct ans is : " + this.correctAnswer);
       sc.close();
    }
    
    public boolean evaluateQuestion(Question q)
    {
        return q.correctAnswer == q.markedOption;
    }
    
}

class QuestionHandler
{
    Question q[] = new Question[10];
    QuestionHandler()
    {
        for(int i=0; i <10 ; i++)
        {
            String qString = "Q) [" + String.valueOf(i+1) + "] is an Event Number or Odd Number?" ;
            char  correctOption = (i+1) % 2 == 0 ? 'a' : 'b';
            q[i] = new Question((i+1), qString , correctOption);
        }
    }

    public void startQuiz()
    {
        for(Question q1 : q)
        {
            q1.displayQuestion(q1);
        }
    }
    public void publishResults()
    {
        int marks = 0;
        for(Question q1 : q)
        {
            if(q1.evaluateQuestion(q1))
            {
                marks++;
            }

        }
        System.out.println("Marks obtained :" + marks);

    }

}
