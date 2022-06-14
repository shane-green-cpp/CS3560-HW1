public class Employee {
    //instance variables
    protected String name;
    protected String ssn;
    protected String position;
    protected Date dateOfBirth;
    protected float pay;

    //constructor
    public Employee(String name, String ssn, String position, Date dateOfBirth, float pay) {
        this.name = name;
        this.ssn = ssn;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.pay = pay;
    }

    public Employee() {

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    //methods
    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "SSN: " + ssn + '\n' +
                "Position: " + position + '\n' +
                "Date of Birth: " + dateOfBirth + '\n' +
                "Pay: " + pay;
    }

    public void raise(float percent) {
        this.pay = this.pay + (this.pay * (percent/100));
    }
}
