
package com.portfolio.MCP.security.Repository;

import com.portfolio.MCP.security.Entity.Rol;
import com.portfolio.MCP.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
       Optional<Rol> findByRolNombre(RolNombre rolNombre); 
}
