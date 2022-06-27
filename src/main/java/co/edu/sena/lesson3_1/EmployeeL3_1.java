package sena.lesson3_1;

import java.text.NumberFormat;

public class EmployeeL3_1 {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public EmployeeL3_1(int empId, String name, String ssn, double salary){

        this.empId = empId;
        this.name = name;
        this.ssn =ssn;
        this.salary = salary;
    }

    public EmployeeL3_1() {

    }

    public void setName(String name){
        this.name = name;
    }

    public int getEmpId(){
        return empId;
    }

    public String getName(){
        return name;
    }

    public String getSsn(){
        return ssn;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double increase){
        salary += increase;
    }

    public void printEmployee(){
        System.out.println();
        System.out.println("Employee Id: " + getEmpId());
        System.out.println("Employee name " + getName());
        System.out.println("Employee social seucure: " + getSsn());
        System.out.println("Employee salary: "+
                NumberFormat.getCurrencyInstance().format((double) getSalary()));

    }
}
