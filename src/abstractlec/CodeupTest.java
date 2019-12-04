package abstractlec;

public class CodeupTest {
    public static void main(String[] args) {
        String[] student1 = {"Kellsey","Neagley","Voyaguers","Macbook"};

        CodeupStudent kellsey = new CodeupStudent(student1, false);

        kellsey.greeting();
        kellsey.study();
        System.out.println(kellsey.giveBusinessCards());
    }
}
