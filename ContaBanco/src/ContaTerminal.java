import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaBanco cb;

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Usuário: ");
        int accNum = sc.nextInt();

        System.out.print("Nome do Cliente: ");
        sc.nextLine();
        String accName = sc.nextLine();

        System.out.print("Digite o valor de deposito inicial: ");
        double addSaldo = sc.nextDouble();
        
        cb = new ContaBanco(agencia, accNum, accName, addSaldo);
        System.out.print(cb);

        System.out.println();
        

        sc.close();
    }
}
