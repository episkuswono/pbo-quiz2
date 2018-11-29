/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Epis Kuswono
 */
public class Item {
    private String nama;
    private float harga;
    private int jumlah;

    public Item(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    
}
