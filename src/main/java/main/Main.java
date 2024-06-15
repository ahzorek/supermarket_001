package main;

import implementation.Supermarket;
import implementation.SupermarketArray;
import java.util.Scanner;

public class Main {
    private final static int LIST_SIZE = 5;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Supermarket shoppingList = new SupermarketArray(LIST_SIZE);
        int op;

        do {
            //limpa o console (imprimindo linhas vazias, via stackoverflow)
            //clearConsole();

            //imprime a abertura do app e instruções
            System.out.println("\nLista de Compras -- (versão 1.1)");
            System.out.println("\n##### Escolha uma opção #####");
            System.out.println("1 - Inserir novo item");
            System.out.println("2 - Imprimir Lista");
            System.out.println("3 - Remover Item");
            System.out.println("4 - Sair do App");

            //usa o scanner pra detectar o proximo int inserido
            op = scanner.nextInt();

            //menu com switch statement

            switch (op){
                case 1:
                    clearConsole();
                    System.out.println("Digite o nome do item: ");
                    String item = scanner.next();
                    shoppingList.add(item);
                    break;
                case 2:
                    clearConsole();
                    System.out.println("Imprimindo");
                    shoppingList.print();
                    System.out.println("\nDigite CONTINUAR para continuar... ");
                    scanner.next();
                    break;
                case 3:
                    clearConsole();
                    System.out.println("Digite a posição do item a ser removido: ");
                    int index = scanner.nextInt();
                    shoppingList.remove(index);
                    break;
                case 4:
                    clearConsole();
                    System.out.println("Saindo do app. Adeuuuuus!");
                    break;
                default:
                    clearConsole();
                    System.err.println("O input é inválido");
            }


        } while (op != 4);
    }

    private static void clearConsole(){
        for(int clear = 0; clear < 50; clear++){
            System.out.println("\b");
        }
    }
}
