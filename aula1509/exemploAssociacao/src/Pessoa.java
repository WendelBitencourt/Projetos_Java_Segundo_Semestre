import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int idPessoa;
    private String nomePessoa;
    private String email;
    private List<Carro> carroList;

    public Pessoa(){
        carroList = new ArrayList<>();
    }

    //método para adicionar um novo carro na lista
    public void adicionarCarro(Carro carro){
        carroList.add(carro);
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarroList() {
        return carroList;
    }

    public void setCarroList(List<Carro> carroList) {
        this.carroList = carroList;
    }

    @Override
    public String toString() {
        String string_carros = "\nCarros da pessoa:\n";
        for(Carro carro : carroList){
            string_carros += carro.toString();
            string_carros += "\n";
        }
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", email='" + email + '\'' +
                '}' + string_carros;
    }
}
