/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class EmployeeDataEntry {
    
    public static void main(String[] args){
        int i=0;
        Scanner input=new Scanner(System.in);
        
        List<EmployeeData> employeeDatas=new ArrayList<>();
        
        while(i<2){
            String name;
            int age;
            System.out.println("Name:");
            name=input.next();
            System.out.println("age:");
            age=input.nextInt();
            EmployeeData employee=new EmployeeData(name, age);
            employeeDatas.add(employee);
            
            i++;
//        System.out.println(employee1.toString());
//        System.out.println(employee2.toString());
        }
        System.out.println(employeeDatas.get(1).toString());
    }
}
