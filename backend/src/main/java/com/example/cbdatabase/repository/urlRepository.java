package com.example.cbdatabase.repository;

import com.example.cbdatabase.domain.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface urlRepository extends JpaRepository<URL, Long> {
}
