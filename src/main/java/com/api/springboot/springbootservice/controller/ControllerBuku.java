package com.api.springboot.springbootservice.controller;

import com.api.springboot.springbootservice.entity.Buku;
import com.api.springboot.springbootservice.form.BukuForm;
import com.api.springboot.springbootservice.model.BukuModel;
import com.api.springboot.springbootservice.service.BukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerBuku {

    @Autowired
    private BukuService bukuService;

    @GetMapping(value = "/api/buku")
    public ResponseEntity<List<Buku>> getList(){
        return Optional.ofNullable(bukuService.findAll())
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
                .orElse(new ResponseEntity<List<Buku>>(HttpStatus.BAD_REQUEST));
    }

    @GetMapping(value = "/api/buku/{idbuku}")
    public ResponseEntity<BukuModel> getId(@PathVariable("idbuku")String idbuku){
        return Optional.ofNullable(bukuService.findIdbuku(idbuku))
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
                .orElse(new ResponseEntity<BukuModel>(HttpStatus.BAD_REQUEST));
    }

    @PostMapping(value ="/api/buku/update")
    public ResponseEntity<Buku> updated(@RequestBody BukuForm bukuForm){
    	return Optional.ofNullable(bukuService.UpdateBuku(bukuForm))
    			.map(resulset -> new ResponseEntity<>(resulset, HttpStatus.OK))
    			.orElse(new ResponseEntity<Buku>(HttpStatus.BAD_REQUEST));
    }
    
    @PostMapping(value = "/api/buku/create")
    public ResponseEntity<Buku> created(@RequestBody BukuForm bukuForm){
        return Optional.ofNullable(bukuService.savedBuku(bukuForm))
                .map(resultset -> new ResponseEntity<>(resultset,HttpStatus.CREATED))
                .orElse(new ResponseEntity<Buku>(HttpStatus.BAD_REQUEST));
    }
    
    @PostMapping(value = "/api/buku/disabled")
    public ResponseEntity<Buku> disabled(@RequestBody BukuForm bukuForm){
    	return Optional.ofNullable(bukuService.disabledBuku(bukuForm))
    			.map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
    			.orElse(new ResponseEntity<Buku>(HttpStatus.BAD_REQUEST));
    }
}
