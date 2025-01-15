
@FunctionalInterface
interface Intrface{
    public void show(int i, String str);
}

public class Demo {

    public static void main(String[] args) {
        System.out.println("Demo main");

        Intrface i = (j,k) -> System.out.println(j+"  " + k);
        i.show(1, "sant");
    }
}