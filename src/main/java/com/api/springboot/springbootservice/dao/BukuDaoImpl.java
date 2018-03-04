package com.api.springboot.springbootservice.dao;

import com.api.springboot.springbootservice.entity.Buku;
import com.api.springboot.springbootservice.form.BukuForm;
import com.api.springboot.springbootservice.model.BukuModel;
import com.api.springboot.springbootservice.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class BukuDaoImpl implements BukuDao{

    @Autowired
    private BukuRepository bukuRepository;

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Buku saveBuku(BukuForm bukuForm) {

        String idbuku = bukuForm.getIdbuku();
        Buku buku = null;
        boolean isNew = false;

        if(idbuku == null){
            isNew = true;
            buku = new Buku();
            buku.setValidated(true);

            buku.setJudul(bukuForm.getJudul());
            buku.setPenerbit(bukuForm.getPenerbit());
            buku.setPengarang(bukuForm.getPengarang());
            buku.setJumlah(bukuForm.getJumlah());
            buku.setJumlahHalaman(bukuForm.getJumlahHalaman());

            bukuRepository.save(buku);
        }
        return buku;
    }

    @Override
    public Buku disabledBuku(BukuForm bukuForm) {
        
    	String idbuku = bukuForm.getIdbuku();
    	Buku buku = null;
    	if(idbuku!=null) {
    		buku = new Buku();
    		buku = this.findByIdbuku(idbuku);
    	}
    	
    	buku.setIdbuku(bukuForm.getIdbuku());
    	buku.setJudul(bukuForm.getJudul());
    	buku.setPenerbit(bukuForm.getPenerbit());
    	buku.setPengarang(bukuForm.getPengarang());
    	buku.setJumlah(bukuForm.getJumlah());
    	buku.setJumlahHalaman(bukuForm.getJumlahHalaman());
    	buku.setValidated(false);
    	
    	return bukuRepository.save(buku);
    }

    @Override
    public List<Buku> getListBuku() {
       String jpql="SELECT b FROM Buku b WHERE b.validated=true";
       return entityManager.createQuery(jpql).getResultList();
    }

    

    //ini yang diambil dicontroller
    @Override
    public BukuModel findBuku(String idbuku) {
        Buku buku = this.findByIdbuku(idbuku);
        if(buku == null){
            return null;
        }else{
            return new BukuModel(buku.getIdbuku(),
                    buku.getJudul(), buku.getPengarang(), buku.getPenerbit(),
                    buku.getJumlahHalaman(), buku.getJumlah(), buku.isValidated());
        }
    }

    @Override
    public Buku findByIdbuku(String idbuku) {
        return bukuRepository.getOne(idbuku);
    }

	@Override
	public Buku updateBuku(BukuForm bukuForm) {
		
		String idbuku = bukuForm.getIdbuku();
		Buku buku = null;
		if(idbuku != null) {
			buku = new Buku();
			buku = this.findByIdbuku(idbuku);
		}
		
		buku.setIdbuku(bukuForm.getIdbuku());
		buku.setJudul(bukuForm.getJudul());
		buku.setPenerbit(bukuForm.getPenerbit());
		buku.setPengarang(bukuForm.getPengarang());
		buku.setJumlah(bukuForm.getJumlah());
		buku.setJumlahHalaman(bukuForm.getJumlahHalaman());
		buku.setValidated(bukuForm.isValidated());
		
		return bukuRepository.save(buku);
	}
}
