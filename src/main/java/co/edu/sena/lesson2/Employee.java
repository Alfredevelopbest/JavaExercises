package sena.lesson2;

public class Employee {
    int id;
    String name;
    String ssid;
    double salary;

    public Employee(int id, String name, String ssid, double salary){
        this.id = id;
        this.name = name;
        this.ssid = ssid;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getSsid(){
        return ssid;
    }

    public void setSsid(String ssid){
        this.ssid = ssid;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

}
