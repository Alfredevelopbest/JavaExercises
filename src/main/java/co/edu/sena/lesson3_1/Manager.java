package sena.lesson3_1;

public class Manager extends EmployeeL3_1{

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }


    public void deptName(){
        deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }
}
