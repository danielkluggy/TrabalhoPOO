package trabalhopoo;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public PessoaFisica() {
    }

    public PessoaFisica(int id, LocalDate dataCadastro, String fone, String email, String nome, String cpf, LocalDate dataNascimento) {
        super(id, dataCadastro, fone, email);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

   @Override
    public void display() {
        super.display();
        System.out.println ("nome: " + nome + "\ncpf: " + cpf + "\ndataNascimento: " + dataNascimento);
    }

}
