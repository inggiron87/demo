package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alumno on 10/07/2017.
 */

//insert y update ya incluye desde la herencia de la clase
public interface EstudianteRepository extends JpaRepository<Estudiante,Long>{
}
