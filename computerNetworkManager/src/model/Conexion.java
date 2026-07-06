package model;

public class Conexion {
    // Attributes
    private long id;
    private Equipo equipo_uno;
    private TipoPuerto tipoPuerto_uno;
    private Equipo equipo_dos;
    private TipoPuerto tipoPuerto_dos;
    private TipoCable tipoCable;
    
    // Getters
    public long getId() {
        return id;
    }

    public Equipo getEquipo_uno() {
        return equipo_uno;
    }

    public TipoPuerto getTipoPuerto_uno() {
        return tipoPuerto_uno;
    }

    public Equipo getEquipo_dos() {
        return equipo_dos;
    }

    public TipoPuerto getTipoPuerto_dos() {
        return tipoPuerto_dos;
    }
    
    public TipoCable getTipoCable() {
        return tipoCable;
    }
    
    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setEquipo_uno(Equipo equipo_uno) {
        this.equipo_uno = equipo_uno;
    }

    public void setTipoPuerto_uno(TipoPuerto tipoPuerto_uno) {
        this.tipoPuerto_uno = tipoPuerto_uno;
    }

    public void setEquipo_dos(Equipo equipo_dos) {
        this.equipo_dos = equipo_dos;
    }

    public void setTipoPuerto_dos(TipoPuerto tipoPuerto_dos) {
        this.tipoPuerto_dos = tipoPuerto_dos;
    }

    public void setTipoCable(TipoCable tipoCable) {
        this.tipoCable = tipoCable;
    }

    // Aca abria q cambiar los TipoPuerto por Puerto 

}
