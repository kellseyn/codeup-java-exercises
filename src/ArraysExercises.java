
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));



        String[] Persons = {"Kellsey", "Zackry", "Pocky"};
        for (String Person : Persons){
            System.out.println(Person);
        }

        String[] addPerson = Arrays.copyOf(Persons, 4);
        addPerson[3] = "Polly";
        System.out.println(Arrays.toString(addPerson));


    }
}
