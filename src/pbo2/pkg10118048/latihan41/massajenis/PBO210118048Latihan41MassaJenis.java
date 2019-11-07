/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan41.massajenis;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : hitung Massa Jenis Kubus
 */
public class PBO210118048Latihan41MassaJenis {

    public static void main(String[] args) {
        
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        System.out.println("=====Massa Jenis Kubus=====" +
                "\nSisi : " + kubus.getSisi() +
                "\nMassa : " + kubus.getMassa() +
                "\n\n=====Hasil Perhitungan=====" +
                "\nVolume : " + kubus.hitungVolume(kubus.getSisi()) +
                "\nMassa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(), 
                kubus.hitungVolume(kubus.getSisi()))
        );
    }

}
