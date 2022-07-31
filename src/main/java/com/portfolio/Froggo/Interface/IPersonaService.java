
package com.portfolio.Froggo.Interface;

import com.portfolio.Froggo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    /*Traer una lista de personas*/
    public List<Persona> getPersona();
    
    /*Guardar un Objeto del tipo Persona*/
    public void savePersona(Persona persona);
    
    /*Eliminar Persona por Id*/
    public void deletePersona(Long id);
    
    /*Buscar Persona por Id*/
    public Persona findPersona(Long id);
    
}
