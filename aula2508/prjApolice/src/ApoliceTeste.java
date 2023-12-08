public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Joao Carlos");
        apolice.setIdade(30);
        apolice.setValorPremio(1500.00f);
        //invocar o método
        apolice.imprimir();

    }
}