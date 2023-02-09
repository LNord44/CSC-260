import java.util.ArrayList;
import java.text.DecimalFormat;

public class TestEmployees {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        ArrayList<Employee> employees = new ArrayList<Employee>(0);

        employees.add(new Employee("Emil Post", "111-11-1111"));
        employees.add(new ClericalWorker("Clara Barton", "222-22-2222"));

        Programmer programmer = new Programmer("Grace Murray Hopper", "333-33-3333");
        programmer.addTechnology("Assembly");
        programmer.addTechnology("Fortran");
        programmer.addTechnology("Cobol");
        employees.add(programmer);

        programmer = new Programmer("Donald Ervin Knuth", "444-44-4444");
        programmer.addTechnology("Assembly");
        programmer.addTechnology("C");
        employees.add(programmer);

        programmer = new Programmer("William Nelson Joy", "555-55-5555");
        programmer.addTechnology("Java");
        programmer.addTechnology("C");
        programmer.addTechnology("C#");
        programmer.addTechnology("Java");
        programmer.addTechnology("Lisp");
        employees.add(programmer);

        programmer = new WebDeveloper("Sir Timothy John Berners-Lee", "666-66-6666");
        programmer.addTechnology("HTML");
        programmer.addTechnology("JavaScript");
        programmer.addTechnology("Php");
        programmer.addTechnology("ActionScript");
        employees.add(programmer);

        programmer = new ContractProgrammer("Richard Matthew Stallman", "777-77-7777");
        programmer.addTechnology("Scheme");
        programmer.addTechnology("Bash");
        programmer.addTechnology("Scheme");
        employees.add(programmer);

        programmer = new ContractProgrammer("Shafrira Goldwasser", "888-88-8888");
        programmer.addTechnology("SML");
        programmer.addTechnology("ProLog");
        programmer.addTechnology("Java");
        programmer.addTechnology("Haskell");
        employees.add(programmer);



        Employee e;
        int count = 0;
        double totalSalary = 0;
        double programmerSalary = 0;

        for (int i = 0; i < employees.size(); i++) {
            e = employees.get(i);
            if (e instanceof Programmer) {
                programmerSalary = programmerSalary + e.getSalary();
                count++;
                //int javaCount = e.knowsJava();
            }
            totalSalary = totalSalary + e.getSalary();
            System.out.println(e.toString());

        }

        double avgEmpSalary = totalSalary / employees.size();
        double avgProSalary = programmerSalary / count;

        /*
        Employee p;
        int count2 = 0;
        for (int i = 0; i < employees.size(); i++) {
            p = employees.get(i);
            if (p.knowsTechnology("Java") == "True") {
                count++;
            }
        }
        */

        System.out.println("\nNumber of employees: " + employees.size());
        System.out.println("Total of Employee salaries: $" + df.format(totalSalary));
        System.out.println("Average salary of Employee salaries: $" + df.format(avgEmpSalary));

        System.out.println("\nNumber of Programmers: " + count);
        System.out.println("Total of Programmers salaries: $" + df.format(programmerSalary));
        System.out.println("Average salary of Programmer salaries: $" + df.format(avgProSalary));

        //System.out.println("\nNumber of Java Programmers: " + knowsJava());

        //System.out.println("\nNumber of Ocaml Programmers: " + knowsOcaml());


        //you have to cycle through array list and add to a count the number of instance of there are in that array list using the instance of method



        //////////////////// Task 2 ////////////////////
        /* Report or print out the following summary information:

        (2) the total salary of the employees
        (3) the average salary of the employees
        The above should be done for each of the following categories of employee:
        (i) all employees
        (ii) all programmers
        (iii) all programmers who know Java
        -- write a public knowsTechnology method in the programmer class that tests whether the programmer knows a particular technology
        -- for instance, if Programmer p knows "Java" then the call, p.knowsTechnology("Java") should return true.
        -- hint, you may use the contains method of ArrayList class
        (iv) all employees who know Ocaml
        Note, the program should not attempt to print out an average salary if the number of employees in that category is zero.
        * */

    }
}
