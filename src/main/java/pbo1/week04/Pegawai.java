/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Pegawai {
    
    private String employeeID;
    private static String uniqueID="0";
    private String name;
    private LocalDate birthday;
    
    public Pegawai(){
        this("",1,1,1970);
    }
    
    public Pegawai(String name, int day, int month, int year){
        employeeID=Pegawai.getUniqueID();
        this.name=name;
        this.birthday=LocalDate.of(year, month, day);
    }
        
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = String.format("%4s", employeeID);
    }
    
    public static void setUniqueID(int uniqueID){
        Pegawai.uniqueID=String.valueOf(uniqueID);
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(int day, int month, int year) {
        this.birthday = LocalDate.of(year, month, day);
        if(day>=1){
            switch(month){
                case 1: case 3: case 5: case 7:case 8:case 10:case 12:
                    if(day<=31){
                        break;
                    }
                case 4: case 6: case 9:case 11:
                    if(day<=30){
                        break;
                    }
                case 2:
                    if(year%4==0){
                        if(day<=29){
                            break;
                        }
                    } else if(day<=28){
                        break;
                    }
                default: this.birthday=LocalDate.of(1997,1,1);
            }
        }        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
    
    private static String getUniqueID(){
        int id=Integer.parseInt(uniqueID);
        uniqueID=String.format("%04d", ++id);
        return uniqueID;
    }
    
    @Override
    public String toString(){
        return "{ID: "+getEmployeeID()
                +"; Name: "+getName()
                +"; Birthday: "
                +getBirthday().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                +"}";
    }
}
