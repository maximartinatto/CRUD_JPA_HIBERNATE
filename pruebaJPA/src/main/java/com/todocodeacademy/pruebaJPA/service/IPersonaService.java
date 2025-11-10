package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Persona;

import java.util.List;

public interface IPersonaService {
    // metodo para traer a todas las personas
    public List<Persona> getPersonas();

    public void savePersona(Persona perso);

    public void deletePersona(Long id);

    // lectura de un solo objeto
    public Persona findPersona (Long id);

    // edicion o modificacion
    public void editPersona (Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);

    public void editPersona(Persona per);
}
