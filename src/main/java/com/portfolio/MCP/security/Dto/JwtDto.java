package com.portfolio.MCP.security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class JwtDto {

    private String token;
    private String beares = "Beares";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;

    //Constructor

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }
    
    //Getter y Setter

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBeares() {
        return beares;
    }

    public void setBeares(String beares) {
        this.beares = beares;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
    
}
