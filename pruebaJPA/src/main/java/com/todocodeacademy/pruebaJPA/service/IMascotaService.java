package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;


import java.util.List;

public interface IMascotaService {
    // Metodo para traer a todas las mascotas
    public List<Mascota> getMascotas();

    // crear mascotas
    public void saveMascota(Mascota masco);

    // borrar mascota
    public void deleteMascota(Long id);

    // lectura de un solo objeto
    public Mascota findMascota(Long id);

    // edicion
    public void editMascota(Long idOriginal, Long idNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor);
}
