
enum Laptop{
    Windows, Mac, Linux;

    private Laptop()
    {

    }
}

public abstract class Practice
{
    String favouriteColor;
     abstract void getFavouriteColour();
}

 class Handler
{
    public static void main(String ar[])
    {
        System.out.println("AnonymousCalss demo");
        Practice p = new  Practice()
        {

            String  favouriteColor = "Green";
            String eww = "fsd";
             public void getFavouriteColour()
            {
                System.out.println(this.favouriteColor);
            }
        };
        System.out.println(p.favouriteColor);//blue
        p.getFavouriteColour();//green
        //test git commit
    }
}