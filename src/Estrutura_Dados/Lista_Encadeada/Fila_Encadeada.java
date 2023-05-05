package Estrutura_Dados.Lista_Encadeada;

public class Fila_Encadeada {
     No inicio_fila;
     int numero_elementos;

     public Fila_Encadeada() {
         inicio_fila = null;
         numero_elementos = 0;
     }

     public int getQuantidade() {
         return numero_elementos;
     }

     public boolean fila_vazia() {
         if (inicio_fila == null) return true; else return false;
     }

     public void add_elemento(No elemento) {
         if (fila_vazia()) {
             inicio_fila = elemento;
             numero_elementos++;
         } else {
             No aux = inicio_fila;
             while(aux.proximo_no != null) {
                 aux = aux.proximo_no;
             }
             aux.proximo_no = elemento;
             numero_elementos++;
         }
     }

     public No remover_elemento() {
         No removido = null;
         if (fila_vazia()) {
             System.out.println("Lista Vazia!");
         } else {
             removido = inicio_fila;
             inicio_fila = inicio_fila.proximo_no;
             numero_elementos--;
         }
         return removido;
     }

     public void print_fila() {
         No aux = inicio_fila;
         for (int i = 1; i <= getQuantidade(); i++) {
             System.out.println("Elemento " + i + ": " + aux.elemento_armazenado);
             aux = aux.proximo_no;
         }
     }
}
