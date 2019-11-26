public class Person {
    private String personName;

    public static void main(String[] args) {

        Person newPerson = new Person();

        Person person1 = new Person();
        person1.setName("John");
        Person person2 = person1;


        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        person2.setName("Steve");

        System.out.println(person1.getName());
        System.out.println(person2.getName());





        newPerson.setName("Steve");
        System.out.println(newPerson.getName());
        newPerson.sayHello();

    }

    public String getName(){
        return personName;

    }
    public void setName(String name){
        personName = name;
    }
    public void sayHello(){
        System.out.println("Hello " + personName);
    }
}
