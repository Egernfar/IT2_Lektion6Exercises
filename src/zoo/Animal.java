package zoo;

import java.sql.Date;

public abstract class Animal {
    private final Date birthday;
    private String name;

    public Animal(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
