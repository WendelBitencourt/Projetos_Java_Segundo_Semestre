public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        Tarefa tarefa2 = new Tarefa();
        tarefa1.setDescricao("Elicitar Requisitos");
        tarefa1.setMesTarefa(Meses.setembro);
        tarefa2.setDescricao("Apresentar Produto");
        tarefa2.setMesTarefa(Meses.novembro);
        int dif = tarefa1.getMesTarefa().ordinal() - tarefa2.getMesTarefa().ordinal();
        System.out.println(dif);
        for(Meses mes : Meses.values()){
            System.out.println(mes);
        }
    }
}