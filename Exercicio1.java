import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        String CPF;
        double valorGasto = 0;
        String nome;
        int x=0;
        String CPFbusca;


        Scanner leitor = new Scanner (System.in);


        Repositorio repositorio = new Repositorio();

        System.out.println("INICIE O CADASTRO DOS CLIENTES: ");

        for (int i=0; i<2; i++) {

            Cliente cliente = new Cliente ("CPF", valorGasto, "nome");

            System.out.println("Entre o CPF do "+(i+1)+"º cliente: ");
            CPF = leitor.next();
            System.out.println("Entre o valorGasto pelo cliente "+(i+1)+"º: ");
            valorGasto = leitor.nextDouble();
            System.out.println("Entre o nome do cliente "+(i+1)+"º: ");
            nome = leitor.next();
            cliente.setCPF(CPF);
            cliente.setValorGasto(valorGasto);
            cliente.setNome(nome);
            repositorio.Cadastro(cliente);
            //System.out.println();
        }


        while (x != 4) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 para buscar cliente");
            System.out.println("2 para exibir quem gastou mais");
            System.out.println("3 para exibir quem gastou menos");
            System.out.println("4 para finalizar");

            x = leitor.nextInt();

            if (x==1) {
                //System.out.println("TO FAZENDO O 1");
                System.out.println("Entre o CPF que deseja buscar na lista de clientes cadastrada");
                //CPFbusca = leitor.next();
                //repositorio.BuscaIndice(CPFbusca);

            }
            else if (x==2) {
                repositorio.GastouMais();
            }
            else if (x==3) {
                repositorio.GastouMenos();
            }
        }
    }
}



