/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Luis Vaquerano
 * @param <T>
 */
public class ColaArrayPrioridad <T> {
    ArrayList cola;
    
    public ColaArrayPrioridad() {
        this.cola = new ArrayList();
    }
    
    public boolean isEmpty() {
        return cola.isEmpty();
    }
    
    public ArrayList toArray() {
        return cola;
    }
    
    public T poll(){
        if (!isEmpty()) {
            return (T)cola.remove(0);
        }
        
        return null;
    }
    
    public <T extends Comparable> void offer(T o) {
        for (int i = 0; i < cola.size(); i++) {
            if (o.compareTo(cola.get(i)) < 0) {
                cola.add(i, o);
                return;
            }
        }
        cola.add(o);
    }
}

