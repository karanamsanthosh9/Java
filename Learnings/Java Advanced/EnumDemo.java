
enum ResponseCodes
{
    success,
    parsingError ,
    systemFailure 
}

public class EnumDemo
{    
    public static void main(String args[])
    {    
        System.out.println(ResponseCodes.success);
        System.out.println(ResponseCodes.parsingError);
        System.out.println(ResponseCodes.systemFailure);

        ResponseCodes resp = ResponseCodes.success;
        System.out.println(resp);
        System.out.println(resp.ordinal()) ; //prints the index of the enum beeing assigned.
        
    }
}
