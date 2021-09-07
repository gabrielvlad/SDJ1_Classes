public class Person {
    private Name name;
    private int age;
    private char gender;

    public Person(Name name, int age, char gender) {
        setPerson(name,age,gender);
    }
    public Person(Name name, char gender)
    {
        setPerson(name,0,gender);
    }
    public Person(char gender)
    {
        setPerson(null,0,gender);
    }
    public void setPerson(Name name, int age, char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name+" which is "+age+" years old and also "+gender;
    }
}
