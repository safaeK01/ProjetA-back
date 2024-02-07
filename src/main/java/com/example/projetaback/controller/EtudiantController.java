package com.example.projetaback.controller;
import com.example.projetaback.Entity.EtudiantEntity;
import com.example.projetaback.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping
    public List<EtudiantEntity> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public EtudiantEntity getEtudiantById(@PathVariable int id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping
    public EtudiantEntity createEtudiant(@RequestBody EtudiantEntity etudiant) {
        return etudiantService.saveOrUpdateEtudiant(etudiant);
    }

    @PutMapping("/{id}")
    public EtudiantEntity updateEtudiant(@PathVariable int id, @RequestBody EtudiantEntity etudiant) {
        etudiant.setId(id);
        return etudiantService.saveOrUpdateEtudiant(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable int id) {
        etudiantService.deleteEtudiant(id);
    }
}
