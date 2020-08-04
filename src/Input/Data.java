/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;
import java.util.Scanner;
public class Data {
    public static void main(String[] args) {
        Scanner ah = new Scanner(System.in);
        String nama,fakultas, prodi,nim;
        
    
        System.out.println("Masukkan Data Anda\n");
        System.out.print("Nama      : ");
        nama = ah.next();
        
        System.out.print("Nim       : ");
        nim = ah.next();
        
        System.out.print("Fakultas  : ");
        fakultas = ah.next();
        
        System.out.print("Prodi     : ");
        prodi = ah.next();
        
        System.out.println("\nNama        : "+nama);
        System.out.println("Nim         : "+nim);
        System.out.println("Fakultas    : "+fakultas);
        System.out.println("Prodi       : "+prodi);
    }
    
}


