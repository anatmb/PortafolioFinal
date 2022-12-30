
package com.portafolioFinal.Anadeska.Repository;

import com.portafolioFinal.Anadeska.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
