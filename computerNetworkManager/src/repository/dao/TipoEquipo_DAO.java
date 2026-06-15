package repository.dao;

import java.util.List;

import model.TipoEquipo;

public interface TipoEquipo_DAO {
    void insertar(TipoEquipo aTipoEquipo);

    void actualizar(TipoEquipo aTipoEquipo);

    void borrar(TipoEquipo aTipoEquipo);

    List<TipoEquipo> buscarTodos();
    
}
