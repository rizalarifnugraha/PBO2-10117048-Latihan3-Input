/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan3.input;
import java.util.Scanner;

/**
 *
 * @author
 * Nama  : Rizal Arif Nugraha
 * Kelas : PBO2 
 * NIM   : 10117048
 * Deskripsi Program : Program ini berisi program untuk menampilkan data yang 
 * diimput oleh author.
 */
public class PBO210117048Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
                
    }
    
}
