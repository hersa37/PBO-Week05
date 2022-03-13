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
public class Pegawai_Main {
    
    public static void main(String[] args){

//        int n=1;
//        Scanner input=new Scanner(System.in);
//        
//        List<Pegawai> pegawaiData=new ArrayList<>();
//        
//        for(int i=0;i<n;i++){
//            String name;
//            int age;
//            System.out.print("Name:");
//            name=input.next();
//            System.out.print("Age:");
//            age=input.nextInt();
//            
//            pegawaiData.add(new Pegawai(name, age));
//            
//            i++;
//        }
//        
//        System.out.println("\n"+pegawaiData.toString());
//    }
        System.out.println("\t\t>>Pegawai 1<<");
        
        Pegawai pegawai1=new Pegawai("Echa", 12,2,2002);     
        System.out.println(pegawai1.toString());
        
        pegawai1.setEmployeeID("15");
        pegawai1.setName("Galih");
        pegawai1.setBirthday(29, 3, 1997);
        
        System.out.println("\n\t\t>>Pegawai 1 edited<<");
        System.out.println(pegawai1.toString());
        System.out.println("--------------------------------------\n");
        
        
        System.out.println("\t\t>>Pegawai 2<<");
        
        Pegawai pegawai2=new Pegawai("Hersa", 24,4,1988);
        System.out.println(pegawai2.toString());
        
        pegawai2.setEmployeeID("AX16");
        pegawai2.setName("Prakoso");
        pegawai2.setBirthday(29, 3, 1997);
        
        System.out.println("\n\t\t>>Pegawai 2 edited<<");
        System.out.println(pegawai2.toString());
    }
    
}
