public class Cliente {

        private String CPF;
        private double valorGasto;
        private String nome;

        public Cliente (String CPF, double valorGasto, String nome) {
            this.CPF = CPF;
            this.valorGasto = valorGasto;
            this.nome = nome;
        }

        public String getCPF() {
            return CPF;
        }

        public void setCPF(String CPF) {
            this.CPF = CPF;
        }

        public double getValorGasto() {
            return valorGasto;
        }

        public void setValorGasto(double valorGasto) {
            this.valorGasto = valorGasto;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }



    }
