/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ArbolBinario {
   
    
    //Atributos****
    NodoArbol raiz;

    //Constructor***
    ArbolBinario público() {
        esto. raiz = null;
    }
    
    //Método para insertar***
    
    public void InsertarNodo(String genero, Object nombre) {
        NodoArbol nuevo = new NodoArbol(genero);
        nuevo. informacion = nombre;
        if (raiz == null) {
            raiz = nuevo;
        } más {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                Si (genero. compareTo(auxiliar. genero) <0) {
                    auxiliar = auxiliar. NodoIzquierdo;
                    if (auxiliar == null) {
                    padre. NodoIzquierdo = nuevo;
                    devolución;
                }
                
                } más {
                    auxiliar = auxiliar. NodoDerecho;
                    if (auxiliar == null) {
                        padre. NodoDerecho = nuevo;
                        devolución;
                    }
                }
            }

        }
    }
    
    
    //Método para verificar si el arbol esta vacio***
    Vacio booleano  público(){
        return raiz ==null;
    }
    
    //Método Preorden***
    public static void PreOrden(NodoArbol raiz){
        if(raiz!=null){
            sistema. fuera. println(raiz. informacion);        
            PreOrden(raiz. NodoIzquierdo);
            PreOrden(raiz. NodoDerecho);   
        }
    }
    //Método Inorden***
    public static void InOrden(NodoArbol raiz){
        if(raiz!=null){
            InOrden(raiz. getNodoIzquierdo());
            sistema. fuera. println(raiz. informacion);
            InOrden(raiz. getNodoDerecho());
            
        }
    }
    //Método Postorden***
    public  static void Postorden(NodoArbol raiz){
        if(raiz!=null){
            Postorden(raiz. getNodoIzquierdo());
            Postorden(raiz. getNodoDerecho());
            sistema. fuera. println(raiz. informacion);   
        }
    }
    
}
}
