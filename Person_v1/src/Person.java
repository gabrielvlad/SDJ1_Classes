public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public int getAge(int age) {
        return age;
    }

    public char getGender(char gender) {
        return gender;
    }

    public void setName(String name) {
        name = name;
    }

    public void setAge(int age) {
        age = age;
    }

    public void setGender(char gender) {
        gender = gender;
    }

}
