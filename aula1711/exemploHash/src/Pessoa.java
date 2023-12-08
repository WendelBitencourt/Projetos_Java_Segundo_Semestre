public class Pessoa implements Comparable<Pessoa> {
    private int idPessoa;
    private String nome;

    public Pessoa(int idPessoa, String nome){
        this.idPessoa = idPessoa;
        this.nome = nome;
    }
    public Pessoa(){

    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Pessoa)
                && ((Pessoa) o).idPessoa == this.idPessoa;
    }

    @Override
    public int hashCode() {
        return nome.length();
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.idPessoa < o.idPessoa) {
            return -1;
        }
        if (this.idPessoa > o.idPessoa) {
            return 1;
        }
        return 0;
    }
}
