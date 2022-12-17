/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_03;

/**
 *
 * @author User
 */
public class NodoArbol {
        /**Atributos****/
    public String genero;
    public Object informacion;
    público NodoArbol padre, NodoIzquierdo, NodoDerecho ;

    Constructor***
    public NodoArbol(String genero) {
        esto. genero = genero;
        esto. NodoIzquierdo = null;
        esto. NodoDerecho = null;
    }

    /Getters y Setter***/

    public String getGenero() {
        Devolver Genero;
    }

    public void setGenero(String genero) {
        esto. genero = genero;
    }

    public Object getInformacion() {
        Devolver informacion;
    }

    public void setInformacion(Object informacion) {
        esto. informacion = informacion;
    }

     public NodoArbol getPadre() {
        Regreso Padre;
    }

    public void setPadre(NodoArbol padre) {
        esto.  padre = padre;
    }

    public NodoArbol getNodoIzquierdo() {
        volver NodoIzquierdo;
    }

    public void setNodoIzquierdo(NodoArbol NodoIzquierdo ) {
        esto. NodoIzquierdo = NodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        volver NodoDerecho;
    }

    public void setNodoDerecho(NodoArbol NodoDerecho) {
        esto. NodoDerecho = NodoDerecho;
    }

    private static class Atributos {

        public Atributos() {
        }
    }
    
    
    
    
}
