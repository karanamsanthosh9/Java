public class Practice
{
    String favouriteColor ="Blue" ;
    public void getFavouriteColour()
    {
        System.out.println(this.favouriteColor);
    }

}

 class Handler
{
    public static void main(String ar[])
    {
        System.out.println("AnonymousCalss demo");
        Practice p = new  Practice()
        {

            String  favouriteColor = "Green";
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