package model;

import java.util.List;

public class Red {
    // Attributes
    private long id;
    private String nombre;
    private List<Ubicacion> ubicaciones;
    private List<Equipo> equipos;
    private List<Conexion> conexiones;
    
    // Getters
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Conexion> getConexiones() {
        return conexiones;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicaciones(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void setConexiones(List<Conexion> conexiones) {
        this.conexiones = conexiones;
    }

    
    
}
