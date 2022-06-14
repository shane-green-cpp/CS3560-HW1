public class PTEmployee extends Employee{

    //instance variables
    private float nHours;
    private float wages;

    //constructor
    public PTEmployee(String name, String ssn, String position, Date dateOfBirth, float pay, float nHours, float wages) {
        super(name, ssn, position, dateOfBirth, pay);
        setPay(nHours * wages);
        this.nHours = nHours;
        this.wages = wages;
    }

    public PTEmployee() {

    }

    //getters and setters
    public float getnHours() {
        return nHours;
    }

    public void setnHours(float nHours) {
        this.nHours = nHours;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(float wages) {
        this.wages = wages;
    }


    //methods

    @Override
    public void raise(float amount) {
        this.wages = wages + amount;
        setPay(this.nHours * this.wages);
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "nHours: " + nHours + '\n' +
                "Wages: " + wages;
    }
}
