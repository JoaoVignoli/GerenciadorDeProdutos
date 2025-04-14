import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> values = new ArrayList<>();
        ArrayList<Integer> totalOfProducts = new ArrayList<>();
        String productName = "";
        Double valueOfProduct = 0.0;
        Integer totalOfProduct = 0;
        int taskId = 0;
        char option = 'n';
        String separator = "===============================\n";
        Scanner console = new Scanner(System.in);

        do {
            System.out.print(separator +
                    "    Gerenciador de Produtos    \n" +
                    separator +
                    "1 - Cadastras novos produtos.\n" +
                    "2 - Listar produtos.\n" +
                    "3 - Alterar produto.\n" +
                    separator +
                    "Informe a opção desejada: ");
            taskId = console.nextInt();
            console.nextLine();

            switch (taskId) {
                case 1:
                    System.out.print("\n");
                    System.out.print(separator);
                    System.out.print("Digite o nome do produto que deseja adicionar: ");
                    productName = console.nextLine();
                    products.add(productName);
                    System.out.print("Digite a quantidade inicial desse produto: ");
                    totalOfProduct = console.nextInt();
                    totalOfProducts.add(totalOfProduct);
                    System.out.print("Digite o valor desse produto: ");
                    valueOfProduct = console.nextDouble();
                    values.add(valueOfProduct );
                    System.out.print("\n");
                    System.out.print(separator);
                    System.out.println("Adicionado a lista de produtos: \n" +
                            productName + " | " +
                            totalOfProduct + " | " +
                            valueOfProduct);
                    System.out.println(separator);
                break;
                case 2:
                    System.out.print(separator);
                    if (products.size() == 0) {
                        System.out.println("Lista de produtos vazia...");
                    } else {
                        for (int i = 0;i < products.size();i++){
                            int index = i + 1;
                            System.out.println("[ " + index + " ] " + products.get(i) + " | " + totalOfProducts.get(i) + " | " + values.get(i));
                        }
                    }
                break;
                case 3:
                break;
                default:
                    System.out.println("Tarefa: " + taskId + " não localizada...\n" +
                            "Tente outra opção válida.");
                break;
            }
            System.out.print("Deseja realizar outra tarefa? (s/n): ");
            option = console.next().charAt(0);
        } while (option == 's');
    }
}
