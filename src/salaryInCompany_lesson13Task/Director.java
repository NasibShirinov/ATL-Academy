package salaryInCompany_lesson13Task;

public class Director extends Manager{
    public static final int DIRECTOR_PAYMENT = 10000;
    public double bonus;

    public Director(int no, String name, int year, String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = DIRECTOR_PAYMENT;
    }

    @Override
    public void printInfo () {
        System.out.println("Director info: Name: " + getName() + ", Number: " +
                getNo() + ", Department: " +
                getDepartment() + ", Year of work: " +
                getYear());
    }

    void calculateBonus() {
        System.out.println("Bonus is: " + DIRECTOR_PAYMENT * 2.5);
    }

    @Override
    public void work () {
        System.out.println("Director " + this.name + " is doing relevant job");
    }

    @Override
    void calculateSalary (int year) {
        System.out.println("Salary of director " + this.name + " is: " + DIRECTOR_PAYMENT * year);
    }

}
