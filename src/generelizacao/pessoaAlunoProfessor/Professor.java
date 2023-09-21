package generelizacao.pessoaAlunoProfessor;

public class Professor extends Pessoa{

    private String diciplina;

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "diciplina='" + diciplina + '\'' +
                "} " + super.toString();
    }
}
