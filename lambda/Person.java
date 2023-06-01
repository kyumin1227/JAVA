package lambda;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String emailAddress;
    private Sex gender;

    public Person(String name, LocalDate birthDate, String emailAddress, Sex gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public int getAge() {
        Period period = Period.between(birthDate, LocalDate.now());
        return period.getYears();
    }

    public void printPerson() {
        System.out.printf("Name: %s, Email: %s, Gender: %d, BirthDate: %s", name, emailAddress, gender,
                birthDate.toString());
    }
}

enum Sex {
    FEMALE, MALE;
}