package com.api.springboot.springbootservice.model;

import com.api.springboot.springbootservice.entity.Buku;

public class BukuModel {

    private String idbuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private int jumlah_halaman;
    private int jumlah;
    private boolean validated;

    public BukuModel(){}

    public BukuModel(Buku buku){
        this.idbuku = buku.getIdbuku();
        this.judul = buku.getJudul();
        this.pengarang = buku.getPengarang();
        this.penerbit = buku.getPenerbit();
        this.jumlah_halaman = buku.getJumlahHalaman();
        this.jumlah = buku.getJumlah();
        this.validated = buku.isValidated();
    }

    public BukuModel(String idbuku, String judul, String pengarang, String penerbit,
                     int jumlah_halaman, int jumlah, boolean validated){
        this.idbuku = idbuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.jumlah_halaman = jumlah_halaman;
        this.jumlah = jumlah;
        this.validated = validated;
    }

    public String getIdbuku(){
        return idbuku;
    }

    public void setIdbuku(String idbuku){
        this.idbuku = idbuku;
    }

    public String getJudul(){
        return judul;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getPengarang(){
        return pengarang;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public String getPenerbit(){
        return penerbit;
    }

    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }

    public int getJumlah_halaman(){
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman){
        this.jumlah_halaman = jumlah_halaman;
    }

    public int getJumlah(){
        return jumlah;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public boolean isValidated(){
        return validated;
    }

    public void setValidated(boolean validated){
        this.validated = validated;
    }
}
