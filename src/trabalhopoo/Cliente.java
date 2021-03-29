package trabalhopoo;

import java.time.LocalDate;

public class Cliente extends PessoaFisica {
    private String endereco;
    private float limiteCredito;

    public Cliente() {
    }

    public Cliente(int id, LocalDate dataCadastro, String fone, String email, String nome, String cpf, LocalDate dataNascimento, String endereco, float limiteCredito) {
        super(id, dataCadastro, fone, email, nome, cpf, dataNascimento);
        this.endereco = endereco;
        this.limiteCredito = limiteCredito;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println ("endereco: " + endereco + "\nlimiteCredito: " + limiteCredito);
    }

}
