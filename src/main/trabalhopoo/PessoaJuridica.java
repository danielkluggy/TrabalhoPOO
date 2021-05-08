package trabalhopoo;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscEst;

    public PessoaJuridica() {
    }

    public PessoaJuridica(int id, LocalDate dataCadastro, String fone, String email, String cnpj, String inscEst) {
        super(id, dataCadastro, fone, email);
        this.cnpj = cnpj;
        this.inscEst = inscEst;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEst() {
        return inscEst;
    }

    public void setInscEst(String inscEst) {
        this.inscEst = inscEst;
    }

    @Override
    public void display() {
        super.display();
        System.out.println ("cnpj: " + cnpj + "\ninscEst: " + inscEst);
    }

}
