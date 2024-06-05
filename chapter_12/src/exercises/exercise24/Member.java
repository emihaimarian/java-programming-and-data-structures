package exercises.exercise24;

public class Member {

    private String firstName;
    private String lastName;
    private String rank;
    private double salary;

    public Member() {

    }

    public Member(String firstName, String lastName, String rank, double salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRank() {
        return rank;
    }

    public double getSalary() {
        return salary;
    }
}
