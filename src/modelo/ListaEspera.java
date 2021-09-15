/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Julio
 */
public class ListaEspera extends AbstractListModel {

    ArrayList datos;

    public ListaEspera(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }

}
