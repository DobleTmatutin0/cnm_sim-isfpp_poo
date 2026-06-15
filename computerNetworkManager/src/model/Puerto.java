package model;

public class Puerto {
    // attributes
    private long id; 
    private int cantidad;
    private TipoPuerto tipoPuerto;
    
    // Getters
    public long getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public TipoPuerto getTipoPuerto() {
        return tipoPuerto;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setTipoPuerto(TipoPuerto tipoPuerto) {
        this.tipoPuerto = tipoPuerto;
    }

    
}


/*
    Ver Equals
*/