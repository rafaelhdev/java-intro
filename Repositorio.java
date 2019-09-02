public class Repositorio {

    private Cliente[] listaDeClientes = new Cliente[2];
    private int indice = 0;

    public Repositorio() {

    }

    public void Cadastro(Cliente cliente) {
        this.listaDeClientes[indice] = cliente;
        indice = indice+1;
    }

    public int BuscaIndice(String CPF) {
        int ind = -1; // -1 porque não existe essa posição no array

        for (int i = 0; i < listaDeClientes.length; i++) {
            if ((listaDeClientes[i].getCPF()).equals(CPF)) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    public void GastouMais() {
        double aux = 0;
        int i = 1;
        while (i < listaDeClientes.length) {
            //System.out.println(listaDeClientes[i].getValorGasto());
            if (listaDeClientes[i-1].getValorGasto()<listaDeClientes[i].getValorGasto()) {
                aux = listaDeClientes[i].getValorGasto();
            }
            i = i+1;
        }
        System.out.println(aux);
    }

    public void GastouMenos( ) {
        double aux = 0;
        int i = 1;
        while (i < listaDeClientes.length) {
            //System.out.println(listaDeClientes[i].getValorGasto());
            if (listaDeClientes[i].getValorGasto()<listaDeClientes[i-1].getValorGasto()) {
                aux = listaDeClientes[i].getValorGasto();
            }
            i = i+1;
        }
        System.out.println(aux);
    }
}
