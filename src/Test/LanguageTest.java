package Test;


import java.util.List;
import java.util.Objects;

public class LanguageTest {
    public static void main(String[] args) {

    }
}
class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            Person p = (Person) obj;
            return Objects.equals(this.firstName,p.firstName) && Objects.equals(this.lastName,p.lastName) && this.age == p.age;
        }
        return false;
    }
}