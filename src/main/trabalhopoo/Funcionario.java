package trabalhopoo;

import java.time.LocalDate;

public class Funcionario extends PessoaFisica {
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int id, LocalDate dataCadastro, String fone, String email, String nome, String cpf, LocalDate dataNascimento, LocalDate dataAdmissao, LocalDate dataDemissao, String cargo) {
        super(id, dataCadastro, fone, email, nome, cpf, dataNascimento);
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println ("dataAdmissao: " + dataAdmissao + "\ndataDemissao: " + dataDemissao + "\ncargo: " + cargo);
    }

}
