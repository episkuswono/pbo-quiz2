/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epis.quis2;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Epis Kuswono
 */
public class Transaksi {
    private final String kode;
    private ArrayList<Item> items = new ArrayList<>();
    private float total;
    
    public Transaksi(String kode, ArrayList<Item> items){
        this.kode = kode;
        this.items = items;
    }
}
