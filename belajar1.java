/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.util.Scanner;

/**
 *
 * @author H P PAVILION
 */
public class belajar1 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int a [] = new int [100]; 
        int hasil = 100,stop = 0;
        for (int i=0;i<hasil;i++){
            System.out.println("Masukkan Array isi " + (i+1) + " = ");
            a[i] = sc.nextInt();
            if(a[i]==-1){
                hasil = -1;
                stop  = i;
            }
        }
        int maks = a[0],min = a[0];
        for (int i=0;i<stop;i++){
            if (a[i]>maks){
                maks = a[i];
                
            }
            else if(a[i]< min){
                min = a[i];
            }
        }
            
        
        System.out.println(" Nilai Maksimum : " + maks);
        System.out.println(" Nilai Minimum : " + min);
    }    
}
