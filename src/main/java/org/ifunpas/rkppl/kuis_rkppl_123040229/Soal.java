/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.kuis_rkppl_123040229;

/**
 *
 * @author SB 604-04
 */
public class Soal {
    public int pangkat(int bilangan, int pangkat){
        int hasil=0;
        int n=1;
        while(n <= pangkat){
            n++;
            hasil *= bilangan;
        }
        return hasil;
    }
    
    public int faktorial(int bil) {
        int hasil = 1;
        for (int i = 0; i <= bil; i++) {
            hasil *= i;
        }
        return hasil;
    }
    
    public int perkalian(int bilA, int bilB){
        return bilA * bilB;
    }
    
    public static void main(String[] args) {
        Soal A = new Soal();
        A.pangkat(10, 2);
        A.faktorial(9);
        A.perkalian(2, 5);
    }
}
