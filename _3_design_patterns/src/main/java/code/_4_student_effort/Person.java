package code._4_student_effort;
public class Person {

    String name;
    String lastName;
    String CNP;

    Person() {
    }

    Person(String personName, String personLastName, String personCNP) {
        name = personName;
        lastName = personLastName;
        CNP = personCNP;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String CNP() {
        return CNP;
    }

}
