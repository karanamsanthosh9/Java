class StringOperationDemo
{


    public static void main(String args[])
    {
        String str = new String();
        str  = "new string";
        System.out.println(str);

        char ch[] = {'1', '2','3' };

        String s1 = new String(ch);

        System.out.println(s1);

        String s2 = new String(s1);

        System.out.println(s2);

        char wish[] = { 'w', 'e','l','c','o','m','e'};

        String str_from_charArr = new String(wish, 3, 4);

        System.out.println(str_from_charArr);
    }


}