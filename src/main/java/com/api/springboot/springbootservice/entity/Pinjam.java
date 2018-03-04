package com.api.springboot.springbootservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pinjam",
        catalog = "spring_boot_buku")
public class Pinjam implements Serializable{

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idpinjam;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal", nullable = false)
    private Date tanggal;

    @Column(name = "nama_siswa", nullable = false)
    private String nama_siswa;

    @Column(name = "alamat_siswa", nullable = false)
    private String alamat_siswa;

    @Column(name = "notelp_siswa", nullable = false)
    private String notelp_siswa;

    public String getIdpinjam(){
        return idpinjam;
    }

    public void setIdpinjam(String idpinjam){
        this.idpinjam = idpinjam;
    }

    public Date getTanggal(){
        return tanggal;
    }

    public void setTanggal(Date tanggal){
        this.tanggal = tanggal;
    }

    public String getNama_siswa(){
        return nama_siswa;
    }

    public void setNama_siswa(String nama_siswa){
        this.nama_siswa = nama_siswa;
    }

    public String getAlamat_siswa(){
        return alamat_siswa;
    }

    public void setAlamat_siswa(String alamat_siswa){
        this.alamat_siswa = alamat_siswa;
    }

    public String getNotelp_siswa(){
        return notelp_siswa;
    }

    public void setNotelp_siswa(String notelp_siswa){
        this.notelp_siswa = notelp_siswa;
    }
}
