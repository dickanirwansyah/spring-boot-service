package com.api.springboot.springbootservice.service;

import com.api.springboot.springbootservice.dao.BukuDao;
import com.api.springboot.springbootservice.entity.Buku;
import com.api.springboot.springbootservice.form.BukuForm;
import com.api.springboot.springbootservice.model.BukuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BukuServiceImpl implements BukuService {

    @Autowired
    private BukuDao bukuDao;

    @Override
    public BukuModel findIdbuku(String idbuku) {
        return bukuDao.findBuku(idbuku);
    }

    @Override
    public List<Buku> findAll() {
        return bukuDao.getListBuku();
    }

    @Override
    public Buku savedBuku(BukuForm bukuForm) {
       return bukuDao.saveBuku(bukuForm);
    }

    @Override
    public Buku disabledBuku(BukuForm bukuForm) {
        return bukuDao.disabledBuku(bukuForm);
    }

	@Override
	public Buku UpdateBuku(BukuForm bukuForm) {
		return bukuDao.updateBuku(bukuForm);
	}
}
