import java.util.Arrays;

public class ServerNameGenerator {


    public static void main(String[] args) {
        String[] Adjectives = {"alive",
                "better",
                "careful",
                "clever",
                "dead",
                "easy",
                "famous",
                "gifted",
                "hallowed",
                "helpful"
        };
        String[] Nouns = {  "time",
                "year",
                "people",
                "way",
                "day",
                "man",
                "thing",
                "woman",
                "life",
                "child"
        };
        double a = Math.floor(Math.random() * 10 + 1);
        double n = Math.floor(Math.random() * 10 + 1);

        int valueA = (int)a;
        int valueN = (int)n;

        System.out.println(valueA);
        System.out.println(valueN);

        String adj = Adjectives[valueA];
        String noun = Nouns[valueN];
        System.out.printf("%s-%s", adj, noun);

    }
}
