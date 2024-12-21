import javax.management.Query;

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
        System.out.println(q.questionText
    }

    //public void 
}

class QuestionHandler
{
    Question q[] = new Question[10];
    QuestionHandler()
    {
        for(int i=0; i <10 ; i++)
        {
            String qString = String.valueOf(i+1) + ").  is " + (i+1) + "Event Number or Odd" ;
            char  correctOption = (i+1) % 2 == 0 ? 'a' : 'b';
            q[i] = new Question((i+1), qString , correctOption);
        }
    }

}
