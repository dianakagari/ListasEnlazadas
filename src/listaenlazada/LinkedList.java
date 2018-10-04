
package listaenlazada;

import java.util.Scanner;
public class LinkedList {

    
    public static void main(String[] args) {
     
        MyLinkedList lista = new MyLinkedList();
        Scanner teclado = new Scanner(System.in);
        int opcion;
       
   
        System.out.println("1.- Insertar al inicio :D");
        System.out.println("2.- Insertar al final owo");
        System.out.println("3.- Borrar al inicio o3o");
        System.out.println("4.- Borrar al final >w<");
        System.out.println("5.- Mostrar datos! :3");
        System.out.println("6.- Buscar un elemento o..o");
        System.out.println("7.- Salir, Exit, Shindeiru <3");
    
        System.out.println("que opcion desea elegir?");
        opcion=teclado.nextInt();

       
         
        while(opcion !=7)
    {
            
        switch(opcion)
        {
           
            
            case 1:
                int dato;
                System.out.print("Digite el numero: ");
                dato = teclado.nextInt();
                lista.insertAtBeginning(dato);
                break;
            case 2:
                System.out.print("Digite el numero: ");
                dato = teclado.nextInt();
                lista.insertAtEnd(dato);
                break;
            case 3:
                lista.eraseAtBeginning();
                break;
            case 4:
                lista.eraseAtEnd();
                break;
            case 5:
                lista.print();  
                break;
            case 6:
                System.out.print("Digite el numero: ");
                dato = teclado.nextInt();
                int position = lista.search(dato);
                if(position == -1) {
                    System.out.println("No se encontró el dato :(");
                } else {
                    System.out.println("El numero se encuentra en la posición: "+position);
                }            
                break;
            case 7: 
                break;
                
            default:
        }  
        
        System.out.println("1.- Insertar al inicio :D");
        System.out.println("2.- Insertar al final owo");
        System.out.println("3.- Borrar al inicio o3o");
        System.out.println("4.- Borrar al final >w<");
        System.out.println("5.- Mostrar datos! :3");
        System.out.println("6.- Buscar un elemento o..o");
        System.out.println("7.- Salir, Exit, Shindeiru <3");
    
        System.out.println("que opcion desea elegir?");
        opcion=teclado.nextInt();
    
    }
    
        
        
        
    }
    
}
