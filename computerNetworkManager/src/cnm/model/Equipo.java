package cnm.model;

import java.util.List;

public class Equipo {
    // Attributes
    private long id;
    private String codigo;
    private String descripcion;
    private String marca;
    private String modelo;
    private List<String> direccionesIp;
    private List<Puerto> puertos;
    private TipoEquipo tipoEquipo;
    private Ubicacion ubicacion;
    
    
    // Getters
    public long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public List<String> getDireccionesIp() {
        return direccionesIp;
    }

    public List<Puerto> getPuertos() {
        return puertos;
    }

    public TipoEquipo getTipoEquipo() {
        return tipoEquipo;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDireccionesIp(List<String> direccionesIp) {
        this.direccionesIp = direccionesIp;
    }

    public void setPuertos(List<Puerto> puertos) {
        this.puertos = puertos;
    }

    public void setTipoEquipo(TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipo other = (Equipo) obj;
        if (id != other.id)
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[EQUIPO] tipoEquipo:" + tipoEquipo + "\n"
            + "codigo:" + codigo + "\n"
            + "marca:" + marca + "\n"
            + ", modelo:" + modelo + "\n"
            +  "ubicacion:" + ubicacion
        ;
    }
    
}
