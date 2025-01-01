enum Roommates{
    Nookesh,Veerababu,Chandu,Bhaskar;
}

public class ThrowKeywordDemo
{
    public static void main(String[] args) {
        System.out.println("Main....");
        Roommates mate = Roommates.Bhaskar;
        switch (mate) {
            case Nookesh:
                System.out.println("Nookesh");
                break;
            case Bhaskar:
                System.out.println("Bhaskar");
                break;
            default:
                break;
        }
    }
}