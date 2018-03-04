package com.api.springboot.springbootservice.repository;

import com.api.springboot.springbootservice.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BukuRepository extends JpaRepository<Buku, String> {
}
