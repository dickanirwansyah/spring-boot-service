package com.api.springboot.springbootservice.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "buku",
        catalog = "spring_boot_buku")
public class Buku implements Serializable{

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idbuku;

    @Column(name = "judul", nullable = false)
    private String judul;

    @Column(name = "pengarang", nullable = false)
    private String pengarang;

    @Column(name = "penerbit", nullable = false)
    private String penerbit;

    @Column(name = "jumlah_halaman", nullable = false)
    private int jumlahHalaman;

    @Column(name = "jumlah", nullable = false)
    private int jumlah;

    @Column(name = "validated")
    private boolean validated;

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

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman){
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
}
