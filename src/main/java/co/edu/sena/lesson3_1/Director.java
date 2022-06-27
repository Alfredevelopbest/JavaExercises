package sena.lesson3_1;

public class Director extends Manager{
    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn,salary, deptName);
    }

    public double getBudget(){
        return budget;
    }

}
