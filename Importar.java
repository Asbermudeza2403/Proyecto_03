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
class Importar {
    Importar javax. columpio. JOptionPane;

director de clase pública static {

    /**
 * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        
        int opcion=0;
        String nombre, gen;
        ArbolBinario árbol =nuevo ArbolBinario ();
        
        árbol. InsertarNodo("M", "Carlos");
        árbol. InsertarNodo("F", "Maria");
        árbol. InsertarNodo("F", "Ana");
        árbol. InsertarNodo("M", "Jorge");
        árbol. InsertarNodo("M", "Luis");
        árbol. InsertarNodo("F", "Alicia");
        árbol. InsertarNodo("M", "Andrés");

        hacer{
            probar{
               opcion=Entero. parseInt(JOptionPane. showInputDialog(null,
                  
            "Bienvenido, digite una opción:\n"+
            "         \n"+
            " 1) Insertar un nuevo miembro\n"+
            " 2) Mostrar PreOrden\n"+
            " 3) Mostrar InOrden\n"+
            " 4) Mostrar PostOredn\n"+
            " 5) Mostrar progenitores femeninos\n"+      
            " 0) Salir\n"+
            "                   \n"+
             "Ingrese una opción: ", "Arbol Binario", JOptionPane. QUESTION_MESSAGE));
               
               switch(opcion){
                   Caso 1: 
                       gen=JOptionPane. showInputDialog(null, 
                               "Ingrese el género del usuario ", "Agregando el género", JOptionPane. QUESTION_MESSAGE);
                       nombre=JOptionPane. showInputDialog(null, 
                               "Ingrese el nombre ", "Agregando nombre", JOptionPane. QUESTION_MESSAGE);
                       árbol. InsertarNodo(gen, nombre);
                       
                       quebrar;
                   Caso 2:
                       sistema. fuera. println("PreOrden:");
                       árbol. PreOrden(arbol. RAIZ);
                       sistema. fuera. println("");
                       quebrar;
                       
                   Caso 3:
                       sistema. fuera. println("InOrden:");
                       árbol. InOrden(arbol. RAIZ);
                       sistema. fuera. println("");
                       quebrar;
                       
                   Caso 4:
                       sistema. fuera. println("Postorden:");
                       árbol. Postorden(arbol. RAIZ);
                       sistema. fuera. println("");
                       quebrar;
                       
                   Caso 5:
                       árbol. InOrden(arbol. raiz. NodoIzquierdo);
                       sistema. fuera. println("");
                   quebrar;
                       
                   Caso 0:
                       JOptionPane. showMessageDialog(null, "Saliendo...",
                        "Final", JOptionPane. INFORMATION_MESSAGE);
                       quebrar;
                       
                   Valor predeterminado:
                        JOptionPane. showMessageDialog(null, "La opción es incorrecta",
                        "¡Peligro!", JOptionPane. INFORMATION_MESSAGE);
               }
            }catch (NumberFormatException n){
                JOptionPane. showMessageDialog(null, "Error");  
            } 
        }while(opcion !=0);
    }
}
