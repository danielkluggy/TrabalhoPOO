package trabalhopoo;

import java.time.LocalDate;

public class Pessoa {
    private int id;
    private LocalDate dataCadastro;
    private String fone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(int id, LocalDate dataCadastro, String fone, String email) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.fone = fone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println ("id: " + id + "\ndataCadastro: " + dataCadastro + "\nfone: " + fone + "\nemail: " + email);
    }

}
