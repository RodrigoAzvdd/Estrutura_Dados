package Estrutura_Dados.Lista_Encadeada;

public class Pilha_Encadeada {
    No inicio_pilha;
    int numero_elementos;

    public Pilha_Encadeada() {
        inicio_pilha = null;
        numero_elementos = 0;
    }

    public int getQuantidade() {
        return numero_elementos;
    }

    public boolean pilha_vazia() {
        if (inicio_pilha == null) return true; else return false;
    }

    public void add_elemento(No elemento) {
        if (pilha_vazia()) {
            elemento.proximo_no = inicio_pilha;
            inicio_pilha = elemento;
            numero_elementos++;
        } else {
            No aux = inicio_pilha;
            while (aux.proximo_no != null) {
                aux = aux.proximo_no;
            }
            aux.proximo_no = elemento;
            numero_elementos++;
        }
    }

    public No remover_elemento() {
        No removido = null;
        if (pilha_vazia()) {
            System.out.println("ERRO");
        } else {
            No aux = inicio_pilha;
            while (aux.proximo_no.proximo_no != null) {
                aux = aux.proximo_no;
            }
            removido = aux.proximo_no;
            aux.proximo_no = null;
            numero_elementos--;
        }
        return removido;
    }

    public void print_fila() {
        No aux = inicio_pilha;
        for (int i = 1; i <= getQuantidade(); i++) {
            System.out.println("Elemento " + i + ": " + aux.elemento_armazenado);
            aux = aux.proximo_no;
        }
    }
}
