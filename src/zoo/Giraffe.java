package zoo;

import java.sql.Date;

public class Giraffe extends Animal{
    private double neckLength;

    public Giraffe( String name, Date birthday, double neckLength) {
        super(name,birthday );
        this.neckLength = neckLength;
    }

    public double getNeckLength() {
        return neckLength;
    }
}
