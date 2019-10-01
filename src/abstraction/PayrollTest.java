package abstraction;

public class PayrollTest {

    public static void main(String[] args) {

        Developer tim = new Developer();

        Employee bob = new Accountant();

        Employee[] employees = new Employee[2];

        employees[0] = bob;
        employees[1] = tim;
        bob.setSalary(500);
        tim.setSalary(600);

        for (Employee emp : employees){
            System.out.println(emp.work());
            System.out.println(emp.getSalary());
        }

        System.out.println(Developer.goodbye);

    }

}
