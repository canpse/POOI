package generelizacao.pessoa;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String estadoCivil;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                "} " + super.toString();
    }
}
