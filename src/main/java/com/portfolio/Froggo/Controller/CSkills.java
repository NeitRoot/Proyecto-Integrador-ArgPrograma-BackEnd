/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Froggo.Controller;

import com.portfolio.Froggo.Dto.DtoSkills;
import com.portfolio.Froggo.Entity.Skills;
import com.portfolio.Froggo.Security.Controller.Mensaje;
import com.portfolio.Froggo.Service.SSkills;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skills")
@CrossOrigin(origins = "*")
public class CSkills {
    @Autowired
    SSkills sSkills;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Skills>> list() {
        List<Skills> list = sSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        sSkills.delete(id);
        return new ResponseEntity(new Mensaje("Item eliminado"), HttpStatus.OK);
    }
        @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody DtoSkills dtoSkills) {
        if (StringUtils.isBlank(dtoSkills.getHabilidad())) {
            return new ResponseEntity(new Mensaje("Nombre Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sSkills.existsByHabilidad(dtoSkills.getHabilidad())) {
            return new ResponseEntity(new Mensaje("Experiencia ya existente"), HttpStatus.BAD_REQUEST);
        }

        Skills skills = new Skills (dtoSkills.getHabilidad(), dtoSkills.getValor(), dtoSkills.getImg());
        sSkills.save(skills);

        return new ResponseEntity(new Mensaje("Habilidad agregada con exito"), HttpStatus.OK);
    }   
    
            @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoSkills dtoSkills) {
        //Validación de existencia del ID
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("Esta habilidad no existe (ID inválido)"), HttpStatus.NOT_FOUND);
        }
        //Comparar nombre de la educacion
        if (sSkills.existsByHabilidad(dtoSkills.getHabilidad()) && sSkills.getByHabilidad(dtoSkills.getHabilidad()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Habilidad existente"), HttpStatus.BAD_REQUEST);
        }
        //Campo Vacío
        if (StringUtils.isBlank(dtoSkills.getHabilidad())) {
            return new ResponseEntity(new Mensaje("Campo vacío. El nombre es OBLIGATORIO"), HttpStatus.BAD_REQUEST);
        }


        Skills skills = sSkills.getOne(id).get();
        skills.setHabilidad(dtoSkills.getHabilidad());
        skills.setValor(dtoSkills.getValor());
        skills.setImg(dtoSkills.getImg());

        sSkills.save(skills);
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Skills> getById(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Skills skills = sSkills.getOne(id).get();
        return new ResponseEntity(skills, HttpStatus.OK);
    }
   
    
    
}
