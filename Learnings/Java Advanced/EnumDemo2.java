enum ResponseCodes
{
    Success,
    Failure,
    ParseError,
    SystemError
}



public class EnumDemo2
{
    public static void main(String args[])
    {
        ResponseCodes resp = ResponseCodes.Success;

        switch (resp) {
            case Success:
                System.out.println("Request processed successfully");
                break;
            case Failure:
                System.out.println("Request failed");
                break;
            case ParseError:
                System.out.println("Error encountered in parsing the request, check the request");
                break;
            default:
                System.out.println("System Error");
                break;
        }

    }
}
