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

        // using ASCII codes

        byte ascii[] = {65, 66, 67, 68, 69, 70 };
        String s3 = new String(ascii);

        System.out.println(s3);
        String s4 = new String(ascii, 1, 3);

        System.out.println(s4);

        int a = 65;

        String s5 = String.valueOf(a);
        String s6 = new String(s5);
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s6);

        char a1 = 'a' ;
        char b2 = 'b';

        String ss = String.valueOf(a1);
        String st = String.valueOf(b2);

        System.out.println(ss.compareTo(st));
        System.out.println(st.compareTo(ss));




    }


}