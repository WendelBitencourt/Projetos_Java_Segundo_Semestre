public class GerenciarPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        //Definir dois carros
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.setIdCarro(1);
        carro1.setModelo("Corsa");
        carro1.setAno(1989);
        carro2.setIdCarro(2);
        carro2.setModelo("Fuscao");
        carro2.setAno(1980);
        //vamos falar para nos
        //que os carros pertecem a pessoa1
        pessoa1.setIdPessoa(1);
        pessoa1.setNomePessoa("Ze Vicente");
        pessoa1.setEmail("emaildoze@gmail.com");
        pessoa1.adicionarCarro(carro1);
        pessoa1.adicionarCarro(carro2);
        System.out.println(pessoa1);
    }
}