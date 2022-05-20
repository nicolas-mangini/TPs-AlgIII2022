package tp2.utilsTP2;

public class Infraction {
    public final int monthNumber;
    public final int infractionCode;
    public final int numberOfInfractions;

    public Infraction(int monthNumber, int infractionCode, int numberOfInfractions) {
        this.monthNumber = monthNumber;
        this.infractionCode = infractionCode;
        this.numberOfInfractions = numberOfInfractions;
    }
}
