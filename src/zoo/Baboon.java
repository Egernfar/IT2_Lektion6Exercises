package zoo;

import java.sql.Date;

public class Baboon extends Animal{
    private boolean aggressive;

    public Baboon(String name, Date birthday, boolean aggressive) {
        super(name, birthday);
        this.aggressive = aggressive;
    }
    public boolean isAggressive() { return aggressive; }
}
