public class PersonTest {
    public static void main(String[] args) {
        String name = "Bob Builder", name2 = "steve", name3 = "sbeve";
        int age = 23, age2 = 33, age3 = 44;
        char gender = 'M', gender2 = 'M', gender3 = 'F';
        Person person = new Person(name, age, gender);

        Person person2 = new Person(name2, age2, gender2);
        Person person3 = new Person(name3, age3, gender3);
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person2.setName(name2);
        person2.setAge(age2);
        person2.setGender(gender2);
        person3.setName(name3);
        person3.setAge(age3);
        person3.setGender(gender3);
        System.out.println(person.getName(name) + ", age =" + person.getAge(age) + ", gender = " + person.getGender(gender));

        System.out.println(person.getName(name) + ", gender = " + person.getGender(gender));
        System.out.println(person.getName(name));
        System.out.println(person.getName(name));
        System.out.println(person.getAge(age));
        System.out.println(person.getGender(gender));
        System.out.println(person);
        System.out.println(person2.getName(name2));
        System.out.println(person2.getAge(age2));
        System.out.println(person2.getGender(gender2));
        System.out.println(person2);
        System.out.println(person3.getName(name3));
        System.out.println(person3.getAge(age3));
        System.out.println(person3.getGender(gender3));
        System.out.println(person3);

    }
}
