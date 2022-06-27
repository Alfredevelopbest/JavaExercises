package sena.lesson3;

public class EmployeeL3 {
    public int empId;
    public String name;
    public String ssn;
    public double salary;

    public EmployeeL3(){

    }

    public int getEmpId(int empId){
        return empId;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSsn(){
        return ssn;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
