package model;

public class TipoEquipo {
    // Attributes
    private long id;
    private String codigo;
    private String descripcion;

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


    @Override
    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        TipoEquipo other = (TipoEquipo) obj;
        return this.id == other.id;
    }


}
// aca hay un temita con los id no tendria q ser posible asignarlos con setter
// lo mismo con el codigo
// pero creo q el txt lo requiere
