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
 */
public class Cola <T>{
    Nodo<T> fr;
    Nodo<T> fn;
    
    public Cola() {
        fr = null;
        fn = null;
    }
    
    public boolean isEmpty() {
        return fr == null;
    }
    
    public ArrayList<T> toArray() {
        Nodo aux = fr;
        ArrayList<T> array = new ArrayList();
        
        while(aux != null) {
            array.add((T)aux.getDato());
            aux = aux.getSiguiente();
        }
        
        return array;
    }
    
    public void offer(T d) {
        Nodo nNodo = new Nodo(d);
        
        if(isEmpty()) {
            fr = nNodo;
        }else {
            fn.setSiguiente(nNodo);
        }
        fn = nNodo;
    }
    
    public T poll() {
        if(isEmpty()) return (T)"Cola vacia";
        T aux = (T)fr.getDato();
        
        if (fr.getSiguiente() == null) {
            fr = fn = null;
        }else {
            fr = fr.getSiguiente();
        }
        
        return aux;
    }
    
}
