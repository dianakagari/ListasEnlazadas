
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

