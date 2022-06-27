package sena.lesson3;
import sena.lesson3_1.Admin;
import sena.lesson3_1.Director;
import sena.lesson3_1.Engineer;
import sena.lesson3_1.Manager;

public class App {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(101, "Jane Smith","012-34-5678", 120_345.27);
        Manager manager = new Manager(207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
        Admin admin = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director director = new Director(12,"Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing");

        engineer.printEmployee();
        manager.printEmployee();
        admin.printEmployee();
        director.printEmployee();


        double budget = director.getBudget();
        System.out.println(budget);

        manager.setName("Barbara Jhonson-Smithe");
        manager.raiseSalary(10_000.00);
        manager.printEmployee();





    }
}
