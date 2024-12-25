
<<<<<<< HEAD
=======
public class EnumDemo
{    
    public static void main(String args[])
    {    
        
        System.out.println(ResponseCodes.Success);
        System.out.println(ResponseCodes.ParsingError);
        System.out.println(ResponseCodes.SystemFailure);

        ResponseCodes resp = ResponseCodes.Success;
        System.out.println(resp);
        System.out.println(resp.ordinal()) ; //prints the index of the enum beeing assigned.

        ResponseCodes res[] = ResponseCodes.values(); //assigns all values as array
        for(ResponseCodes ir : res)
            {
                System.out.println(ir + " : " + ir.ordinal());
            }
    }
>>>>>>> 5128a67e096e4675973aeaa6072cf71a64eddd9d
}
