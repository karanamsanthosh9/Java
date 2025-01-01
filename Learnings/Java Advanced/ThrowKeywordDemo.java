enum Roommates{
    Nookesh,Veerababu,Chandu,Bhaskar;
    Roommates()
    {
        System.out.println("Constructor in enum :" + this);
    }
}



public class ThrowKeywordDemo
{
    public static void main(String[] args) {
        System.out.println("Main....");
        Roommates mate = Roommates.Bhaskar;
/*         switch (mate) {
            case Nookesh:
                System.out.println("Nookesh");
                break;
            case Bhaskar:
                System.out.println("Bhaskar");
                break;
            default:
                break;
        } */
      // System.out.println(mate + " is a good roommate");
       try
       {
            if(mate == Roommates.Bhaskar)
            {
                throw new Exception("Bhaskar is a good roommate");
            }
       }catch(Exception e)
       {
           System.out.println(e);//java.lang.Exception: Bhaskar is a good roommate
           System.out.println(e.getMessage());//Bhaskar is a good roommate
       }
    }
}