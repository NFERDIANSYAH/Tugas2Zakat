/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class MainClass {
    private boolean lagi;  
    private ZakatCalculator zakatCalculator;  

    public MainClass() {
        this.lagi = true;  
        this.zakatCalculator = new ZakatCalculator(2.5);  
    }

    public boolean isLagi() {
        return lagi;
    }

    public void setLagi(boolean lagi) {
        this.lagi = lagi;
    }

    public ZakatCalculator getZakatCalculator() {
        return zakatCalculator;
    }

    public void setZakatCalculator(ZakatCalculator zakatCalculator) {
        this.zakatCalculator = zakatCalculator;
    }

    public void jalankanProgram() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Masukkan jumlah kekayaan (dalam Rupiah): ");
            while (!input.hasNextDouble()) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                input.next();
            }

            double totalKekayaan = input.nextDouble();
            if (totalKekayaan < 0) {
                System.out.println("Jumlah kekayaan tidak bisa negatif.");
                continue;
            }

            Kekayaan kekayaan = new Kekayaan(totalKekayaan);

            double jumlahZakat = zakatCalculator.hitungZakat(kekayaan.getTotalKekayaan());
            System.out.printf("Jumlah zakat yang harus dibayarkan: Rp %.2f%n", jumlahZakat);

            System.out.print("Apakah Anda ingin menghitung lagi? (iya/tidak): ");
            String jawaban = input.next();
            setLagi(jawaban.equalsIgnoreCase("iya"));

        } while (isLagi());

        System.out.println("Terima kasih telah menggunakan program ini.");
    }

    public static void main(String[] args) {
        MainClass program = new MainClass();
        program.jalankanProgram();
    }
}

