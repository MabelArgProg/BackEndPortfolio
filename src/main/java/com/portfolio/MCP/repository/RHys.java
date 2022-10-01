
package com.portfolio.MCP.repository;

import com.portfolio.MCP.model.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RHys extends JpaRepository<Hys, Integer>{
    public Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
