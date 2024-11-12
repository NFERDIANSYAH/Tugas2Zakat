/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ZakatCalculator {
    private double persentaseZakat;

    public ZakatCalculator(double persentaseZakat) {
        this.persentaseZakat = persentaseZakat;
    }

    public double getPersentaseZakat() {
        return persentaseZakat;
    }

    public void setPersentaseZakat(double persentaseZakat) {
        this.persentaseZakat = persentaseZakat;
    }

    public double hitungZakat(double totalKekayaan) {
    return totalKekayaan * persentaseZakat / 100;
    }

}

