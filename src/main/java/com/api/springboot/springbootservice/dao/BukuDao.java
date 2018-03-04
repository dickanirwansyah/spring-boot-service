package com.api.springboot.springbootservice.dao;

import com.api.springboot.springbootservice.entity.Buku;
import com.api.springboot.springbootservice.form.BukuForm;
import com.api.springboot.springbootservice.model.BukuModel;

import java.util.List;

public interface BukuDao {

    Buku saveBuku(BukuForm bukuForm);

    Buku disabledBuku(BukuForm bukuForm);
    
    Buku updateBuku(BukuForm bukuForm);

    List<Buku> getListBuku();

    BukuModel findBuku(String idbuku);

    Buku findByIdbuku(String idbuku);
}
