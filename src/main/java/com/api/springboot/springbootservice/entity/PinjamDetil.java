package com.api.springboot.springbootservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pinjam_detil",
        catalog = "spring_boot_buku")
public class PinjamDetil implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpinjamdetil;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idpinjam", nullable = false)
    private Pinjam pinjam;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idbuku", nullable = false)
    private Buku buku;

    @Column(name = "jumlah_pinjam", nullable = false)
    private int jumlah_pinjam;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column(name = "tanggal_balik", nullable = false)
    private Date tanggal_balik;

    public int getIdpinjamdetil(){
        return idpinjamdetil;
    }

    public void setIdpinjamdetil(int idpinjamdetil){
        this.idpinjamdetil = idpinjamdetil;
    }

    public Pinjam getPinjam() {
        return pinjam;
    }

    public void setPinjam(Pinjam pinjam){
        this.pinjam = pinjam;
    }

    public Buku getBuku(){
        return buku;
    }

    public void setBuku(Buku buku){
        this.buku = buku;
    }

    public int getJumlah_pinjam(){
        return jumlah_pinjam;
    }

    public void setJumlah_pinjam(int jumlah_pinjam){
        this.jumlah_pinjam = jumlah_pinjam;
    }

    public Date getTanggal_balik(){
        return tanggal_balik;
    }

    public void setTanggal_balik(Date tanggal_balik){
        this.tanggal_balik = tanggal_balik;
    }
}
