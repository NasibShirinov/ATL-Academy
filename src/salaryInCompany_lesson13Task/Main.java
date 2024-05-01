package salaryInCompany_lesson13Task;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(15, "Ramin", 5, "HR");
        Manager manager = new Manager(2, "Nail", 7, "HR", "HR");
        Director director =  new Director(1, "Orxan", 10, "Director", "Company", 2.5);

        employee.printInfo();
        employee.work();
        employee.calculateSalary(employee.year);
        System.out.println("----------");

        manager.printInfo();
        employee.work();
        manager.manage();
        manager.doStrategicPlan("employ 2 new employees");
        manager.calculateSalary(manager.year);
        System.out.println("----------");

        director.printInfo();
        director.work();
        director.calculateSalary(10);
        director.calculateBonus();
    }
}
