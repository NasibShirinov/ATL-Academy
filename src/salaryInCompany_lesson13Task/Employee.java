package salaryInCompany_lesson13Task;

import java.time.Year;

public class Employee {
    public int no;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printInfo () {
        System.out.println("Employee info: Name: " + getName() + ", Number: " +
                getNo() + ", Department: " +
                getDepartment() + ", Year of work: " +
                getYear());
    }

    public void work () {
        System.out.println("Empoyee " + this.name + " is doing relevant job");
    }

    void calculateSalary (int year) {
        System.out.println("Salary of employee " + this.name + " is: " + BASE_SALARY * year);
    }
}
