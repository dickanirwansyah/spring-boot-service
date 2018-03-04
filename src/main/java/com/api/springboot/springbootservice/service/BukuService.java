package com.api.springboot.springbootservice.service;

import com.api.springboot.springbootservice.entity.Buku;
import com.api.springboot.springbootservice.form.BukuForm;
import com.api.springboot.springbootservice.model.BukuModel;

import java.util.List;

public interface BukuService {

    BukuModel findIdbuku(String idbuku);

    List<Buku> findAll();

    Buku savedBuku(BukuForm bukuForm);
    
    Buku UpdateBuku(BukuForm bukuForm);
    
    Buku disabledBuku(BukuForm bukuForm);

}
