package com.example.tugas_restapi;

import com.google.gson.annotations.SerializedName;

public class DataModel {

    private String Nama;
    private int NIM;
    private String Jurusan;


    private boolean Completed;

    public String getNama() {
        return Nama;
    }

    public int getNIM() {
        return NIM;
    }

    public String getJurusan() {
        return Jurusan;
    }
}
