package repository.txt;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.TipoEquipo;
import repository.dao.TipoEquipoDAO;

public class TipoEquipoTxtDao implements TipoEquipoDAO {

    private String path;
    private List<TipoEquipo> tiposDeEquipoList;

    public TipoEquipoTxtDao(String pathToRead) {
        this.path = pathToRead;
    }

    @Override
    public void insertar(TipoEquipo aTipoEquipo) {
        this.tiposDeEquipoList.add(aTipoEquipo);
        this.escribirArchivo();
    }

    @Override
    public void actualizar(TipoEquipo aTipoEquipo) {
        int poss = this.tiposDeEquipoList.indexOf(aTipoEquipo);
        this.tiposDeEquipoList.set(poss, aTipoEquipo);
        this.escribirArchivo();
    }

    @Override
    public void borrar(TipoEquipo aTipoEquipo) {
        this.tiposDeEquipoList.remove(aTipoEquipo);
        this.escribirArchivo();
    }

    @Override
    public List<TipoEquipo> buscarTodos() {
        if (tiposDeEquipoList == null) {
            tiposDeEquipoList = leerDesdeArchivo();
        }

        return new ArrayList<>(tiposDeEquipoList);
    }

    private List<TipoEquipo> leerDesdeArchivo() {
        List<TipoEquipo> result = new ArrayList<>();
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File(path));
            // \\s* se usa para que ignore los espacios q esten antes o despues de el caracter de separacion
            inFile.useDelimiter("\\s*;\\s*");
            while (inFile.hasNext()) {
                TipoEquipo tipoEquipo = new TipoEquipo();
                tipoEquipo.setId(Long.parseLong(inFile.next()));
                tipoEquipo.setCodigo(inFile.next());
                tipoEquipo.setDescripcion(inFile.next());
                result.add(tipoEquipo);
            }
        } catch (FileNotFoundException fnfExc) {
            System.err.println("Error al abrir el archivo tipo_quipo: " + this.path);
        } catch (IllegalStateException isExc) {
            System.err.println("Error al leer el archivo");
        } catch (NumberFormatException nfExc) {
            System.err.println("Error al convertir el id a Long");
        } finally {
            if (inFile != null) {
                inFile.close();
            }
        }

        return result;
    }

    private void escribirArchivo() {
        FileWriter fileW = null;
        PrintWriter printW = null;
        try {
            fileW = new FileWriter(path);
            printW = new PrintWriter(fileW);

            for (TipoEquipo te : this.tiposDeEquipoList) {
                printW.printf("%d; %s; %s;\n", te.getId(), te.getCodigo(), te.getDescripcion());
            }
        } catch (IOException  ioeExc) {
            System.err.println("Error en la creacion del FileWriter");
        } finally {
            try {
                if (fileW != null ) {
                    fileW.close();
                }
                if (printW != null ) {
                    printW.close();
                }
            } catch (IOException ioeExc) {
                System.err.println("Error al cerrar el FileWriter");
            }

        }
    }
}
