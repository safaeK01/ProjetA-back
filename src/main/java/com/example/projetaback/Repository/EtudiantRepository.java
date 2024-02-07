package com.example.projetaback.Repository;


import com.example.projetaback.Entity.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;




public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Integer> {
}

