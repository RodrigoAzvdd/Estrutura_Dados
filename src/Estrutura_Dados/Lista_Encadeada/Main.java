package Estrutura_Dados.Lista_Encadeada;

public class Main {
    public static void main(String[] args) {
        //Lista Encadeada
        System.out.println("Lista Encadeada:");
        Lista l1 = new Lista();
        l1.add_final(new No(1));
        l1.add_final(new No(2));
        l1.add_inicio(new No(3));

        System.out.println("Print Lista:");
        l1.print_vector();
        //numero de elementos:
        System.out.println("\nNumero de elementos: " + l1.getQuantidade());

        //removendo final
        l1.remover_final();
        System.out.println("\nFinal removido!\nPrint Lista:");
        l1.print_vector();

        System.out.println("___________________________________________\n" +
                "Fila Encadeada:");
        Fila_Encadeada f1 = new Fila_Encadeada();
        f1.add_elemento(new No(1));
        f1.add_elemento(new No(2));
        f1.add_elemento(new No(3));
        f1.add_elemento(new No(4));

        //Fila Encadeada:
        System.out.println("Print Fila:");
        f1.print_fila();

        System.out.println("___________________________________________\n" +
                "Pilha Encadeada:");
        Pilha_Encadeada p1 = new Pilha_Encadeada();
        p1.add_elemento(new No(1));
        p1.add_elemento(new No(2));
        p1.add_elemento(new No(3));
        p1.add_elemento(new No(4));

        //Pilha Encadeada:
        System.out.println("Print Pilha:");
        p1.print_fila();

        System.out.println("\nRemovendo Ultimo Elemento:");
        System.out.println("Elemento removido: " + p1.remover_elemento().elemento_armazenado);
        System.out.println("Print Pilha:");
        p1.print_fila();

    }
}
