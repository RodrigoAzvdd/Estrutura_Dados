package Estrutura_Dados.Lista_Encadeada;

public class Lista {
    No inicio_lista;
    int numero_elementos;

    public Lista() {
        inicio_lista = null;
        numero_elementos = 0;
    }

    public int getQuantidade() {
        return numero_elementos;
    }

    public boolean lista_vazia() {
        if (inicio_lista == null) return true; else return false;
    }

    public void add_inicio(No elemento) {
        if (!lista_vazia()) {
            elemento.proximo_no = inicio_lista;
            inicio_lista = elemento;
            numero_elementos++;
        } else {
            inicio_lista = elemento;
            numero_elementos++;
        }
    }

    public void add_final(No elemento) {
        if (lista_vazia()) {
            inicio_lista = elemento;
            numero_elementos++;
        } else {
            No aux = inicio_lista;
            while(aux.proximo_no != null) {
                aux = aux.proximo_no;
            }
            aux.proximo_no = elemento;
            numero_elementos++;
        }
    }

    public void add_posicao(No elemento, int index) {
        if (lista_vazia() || index <= 1) {
            add_inicio(elemento);
        } else {
            No novo_no = elemento;
            No aux = inicio_lista;
            int indice = 1;

            while (indice < index && aux != null) {
                aux = aux.proximo_no;
                indice++;
            }

            if (aux == null) {
                add_final(elemento);
            } else {
                novo_no.proximo_no = aux.proximo_no;
                aux.proximo_no = novo_no;
            }
            numero_elementos++;
        }
    }

    public No remover_inicio() {
        No removido = null;
        if (lista_vazia()) {
            System.out.println("ERRO");
        } else {
            removido = inicio_lista;
            inicio_lista = inicio_lista.proximo_no;
            numero_elementos--;
        }
        return removido;
    }

    public No remover_final() {
        No removido = null;
        if (lista_vazia()) {
            System.out.println("ERRO");
        } else {
            No aux = inicio_lista;
            removido = aux;
            while(removido.proximo_no != null) {
                aux = removido;
                removido = removido.proximo_no;
            }
            aux.proximo_no = null;
            numero_elementos--;
        }
        return removido;
    }

    public No remover_posicao(int index) {
        No removido = null;
        if (lista_vazia() || index <= 1) {
            remover_inicio();
        } else {
            No aux = inicio_lista;
            removido = aux;
            int indice = 1;

            while(indice < index && removido != null) {
                aux = removido;
                removido = removido.proximo_no;
                indice++;
            }

            if (removido == null) {
                removido = remover_final();
            } else {
                aux.proximo_no = removido.proximo_no;
            }
            numero_elementos--;
        }
        return removido;
    }

    public void print_vector() {
        No aux = inicio_lista;
        while(aux != null) {
            System.out.println(aux.elemento_armazenado);
            aux = aux.proximo_no;
        }
    }

    public No penultimo() {
        No aux = inicio_lista;
        while (aux != null) {
            if (aux.proximo_no.proximo_no == null) {
                break;
            }
            aux = aux.proximo_no;
        }
        return aux;
    }

    public void invertido() {
        for (int i = getQuantidade(); i >= 1 ; i--) {
            No removido = remover_final();
            System.out.println(removido.elemento_armazenado);
            add_inicio(removido);
        }
    }

    public No retornar_no(int index) {
        No no = inicio_lista;
        int i = 0;

        while (no != null) {
            if (index == i) {
                break;
            }
            no = no.proximo_no;
            i++;
        }

        return no;
    }

    public boolean repetido() {
        int cont = 0;
        for (int i = 0; i < getQuantidade(); i++) {
            for (int j = cont; j < getQuantidade(); j++) {
                if (retornar_no(i).elemento_armazenado == retornar_no(j).elemento_armazenado) {
                    return true;
                }
            }
            cont++;
        }
        return false;
    }
}
