package j.unknown.www.immutable;

import java.util.Date;

public class Person1 {
    private final String name;
    private final Date birthDate;

    public Person1(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(this.birthDate.getTime());
    }
}
