package com.example.projetaback.Service;
import com.example.projetaback.Entity.EtudiantEntity;
import com.example.projetaback.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<EtudiantEntity> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public EtudiantEntity getEtudiantById(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    public EtudiantEntity saveOrUpdateEtudiant(EtudiantEntity etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }
}
