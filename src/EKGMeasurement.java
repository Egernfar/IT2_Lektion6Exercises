import java.sql.Timestamp;

public class EKGMeasurement extends Measurements{
    private Timestamp time;
    private double voltage;
    private String lead; //Afledning
}
