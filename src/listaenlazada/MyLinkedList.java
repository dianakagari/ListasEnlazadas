
package listaenlazada;


public class MyLinkedList {
    
   Node head; //apuntadores para saber cual es el inicio y el fin
   
   void insertAtBeginning(int valor) { //metodo para insertar al inicio
        Node node = new Node(valor);
        if(isEmpty()) {
            this.head = node;
        } else {
            Node siguiente = head;
            head = node;
            node.siguiente = siguiente;
        }
        print();
    }
   
    void insertAtEnd(int valor) {
        Node node = new Node(valor);
        if(isEmpty()) {
            this.head = node;
        } else {
            Node last = this.head;
            while (last.siguiente != null) {
                last = last.siguiente;
            }
            last.siguiente = node;
        }
        print();
    }
    
    void eraseAtBeginning() {
        if(isEmpty()) { 
            System.out.println("La lista está vacía"); 
        } else {
            // Guardamos una referencia al segundo elemento de la lista
            Node siguiente = head.siguiente;
            // Borramos el primerElemento.siguiente
            head.siguiente = null;
            // Ponemos el head en el segundo elemento
            head = siguiente;
        }
        print();
    }
    
    void eraseAtEnd() {
        if(isEmpty()) { 
            System.out.println("La lista está vacía"); 
        } else {
            Node ultimo = head;
            Node penultimo = null;
            while(ultimo.siguiente != null) {
                penultimo = ultimo;
                ultimo = ultimo.siguiente;
            }
            if(penultimo != null) {
                penultimo.siguiente = null;
            } else {
                head = null;
            }
        }
        print();
    }
    
    int search(int value) {
        int position = 0;
        Node node = head;
        while (node != null) {
            if (node.valor == value) {
                return position;
            }
            position += 1;
            node = node.siguiente;
        }
        return -1;
    }
    
    boolean isEmpty() {//metodo para saber si la lista esta vacia
        return head == null;
    }
   
   void print() {//metodo para saber si la lista esta vacia
    if (isEmpty()) {
        System.out.println("La lista está vacía"); 
     } else {//para cuando la lista no esta vacia
            Node node = this.head;
            System.out.print(node.valor);
            while (node.siguiente != null) {//el while pregunta si apunta a algo
                System.out.print(" -> ");
                node = node.siguiente;
                System.out.print(node.valor);
            }
            System.out.println("");
        }
    }
}

