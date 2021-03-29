package trabalhopoo;

import java.time.LocalDate;

public class Fornecedor extends PessoaJuridica {
    private String razaoSocial;

    public Fornecedor() {
    }

    public Fornecedor(int id, LocalDate dataCadastro, String fone, String email, String cnpj, String inscEst, String razaoSocial) {
        super(id, dataCadastro, fone, email, cnpj, inscEst);
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void display() {
        super.display();
        System.out.println ("razaoSocial: " + razaoSocial);
    }

}
