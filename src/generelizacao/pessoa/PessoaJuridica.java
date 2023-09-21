package generelizacao.pessoa;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String tipoEmpresa;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", tipoEmpresa='" + tipoEmpresa + '\'' +
                "} " + super.toString();
    }
}
