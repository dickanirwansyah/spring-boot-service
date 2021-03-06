package com.api.springboot.springbootservice.form;

import com.api.springboot.springbootservice.entity.Buku;

public class BukuForm {

    private String idbuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private int jumlahHalaman;
    private int jumlah;
    private boolean validated;
    private boolean newBuku = false;


    public BukuForm(){
        newBuku = true;
    }

    public BukuForm(Buku buku){
        this.idbuku = buku.getIdbuku();
        this.judul = buku.getJudul();
        this.pengarang = buku.getPengarang();
        this.penerbit = buku.getPenerbit();
        this.jumlahHalaman = buku.getJumlahHalaman();
        this.jumlah = buku.getJumlah();
        this.validated = buku.isValidated();
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

    public int getJumlahHalaman() {
    	return jumlahHalaman;
    }
    
    public void setJumlahHalaman(int jumlahHalaman) {
    	this.jumlahHalaman = jumlahHalaman;
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

    public boolean isNewBuku(){
        return newBuku;
    }
}
