package salaryInCompany_lesson13Task;

public class Manager extends Employee{
    public String departmentManaged;
    public static final int MANAGEMENT_PAYMENT =5000;

    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void printInfo () {
        System.out.println("Manager info: Name: " + getName() + ", Number: " +
                getNo() + ", Department: " +
                getDepartment() + ", Year of work: " +
                getYear());
    }


    public void manage () {
        System.out.println("Manager " + getName() + " is leading this department " + departmentManaged);
    }


    public void doStrategicPlan (String strategicPlan) {
        System.out.println("Plan for this year is: " + strategicPlan);
    }


    @Override
    public void work () {
        System.out.println("Manager " + this.name + " is doing relevant job");
    }

    @Override
    void calculateSalary (int year) {
        System.out.println("Salary of manager " + this.name + " is: " + MANAGEMENT_PAYMENT * year);
    }
}
