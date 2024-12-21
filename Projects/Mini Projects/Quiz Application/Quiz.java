class Quiz
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to Quiz Application");
        QuestionHandler qh = new QuestionHandler();
        qh.startQuiz();
        System.out.println("Quiz is completed....publishing the results now");
        qh.publishResults();
    }

}