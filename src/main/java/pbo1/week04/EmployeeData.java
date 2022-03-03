/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week04;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class EmployeeData {
    private String employeeID;
    private static String uniqueID="0";
    private String name;
    private int age;
    
    public EmployeeData(){
        this("",0);
    }
    
    public EmployeeData(String name, int age){
        employeeID=EmployeeData.getUniqueID();
        this.name=name;
        this.age=age;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public static String getUniqueID(){
        int id=Integer.parseInt(uniqueID);
        uniqueID=Integer.toString(++id);
        return uniqueID;
    }
    @Override
    public String toString(){
        return "ID: "+getEmployeeID()
                +"\nName: "+getName()
                +"\nAge: "+getAge()+"\n";
    }
}
