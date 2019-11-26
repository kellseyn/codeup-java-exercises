package util;

public class InputTest {
    static Input sc = new Input();

    public static void main(String[] args) {

           System.out.println(sc.getDouble(10, 50));
           System.out.println(sc.getInt(10,40));
           System.out.println(sc.getString("String"));
           System.out.println(sc.yesNo("yes"));

    }
}
