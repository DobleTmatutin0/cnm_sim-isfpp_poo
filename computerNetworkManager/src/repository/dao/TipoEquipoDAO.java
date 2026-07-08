package repository.dao;

import java.util.List;

import model.TipoEquipo;

public interface TipoEquipoDAO {
    void insertar(TipoEquipo aTipoEquipo);

    void actualizar(TipoEquipo aTipoEquipo);

    void borrar(TipoEquipo aTipoEquipo);

    List<TipoEquipo> buscarTodos();
    
}
