package com.example.tugas4;

import java.io.Serializable;

public class Mobil implements Serializable {
    int ferari;
    int mercedes;
    int mclaren ;

    public int getFerari() {
        return ferari;
    }

    public int getMercedes() {
        return mercedes;
    }

    public int getMclaren() {
        return mclaren;
    }

    public void setFerari(int jumlah){
        this.ferari= jumlah ;
    }

    public void setMercedes(int jumlah) {
        this.mercedes = jumlah;
    }

    public void setMclaren(int jumlah) {
        this.mclaren = jumlah;
    }
}