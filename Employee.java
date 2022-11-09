import java.util.Scanner;

public class Employee {
        int emp_id, ass1, ass2, ass3, percentage,total=0;
        String name;

        void employeeDetails() {

            Scanner s = new Scanner(System.in);

            System.out.print("Enter employee id:");

            emp_id = s.nextInt();
            System.out.println("enter employee name:");

            name = s.next();

            System.out.println("Enter assessments out of 100:");
            ass1 = s.nextInt();
            ass2 = s.nextInt();
            ass3 = s.nextInt();


            if (ass1 > 75 && ass2 > 75 && ass3 > 75) {
                System.out.println("promoted");

            } else {
                System.out.println("demoted");
            }
        }

        void calculate() {

            total = ass1 + ass2 + ass3;
            percentage = total / 3;
        }
        void display(){

        System.out.println("Sum:"+total);

        System.out.println("Percentage:"+percentage);

    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.employeeDetails();
        obj.calculate();
        obj.display();
    }

}