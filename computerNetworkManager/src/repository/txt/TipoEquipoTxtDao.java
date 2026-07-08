package repository.txt;

import java.util.ArrayList;
import java.util.List;
import model.TipoEquipo;
import repository.dao.TipoEquipoDAO;

public class TipoEquipoTxtDao implements TipoEquipoDAO {

    private List<TipoEquipo> equipos;
    private String nombre;
    private boolean actualizar;

    public TipoEquipoTxtDao() {}

    public void insertar(TipoEquipo aTipoEquipo) {}

    public void actualizar(TipoEquipo aTipoEquipo) {}

    public void borrar(TipoEquipo aTipoEquipo) {}

    public List<TipoEquipo> buscarTodos() {
        List<TipoEquipo> result = new ArrayList<>();

        return result;
    }
}
