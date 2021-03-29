/*
Trabalho POO
Introdução à Programação
Engenharia de Software - UDESC
Acadêmico: Daniel Larion Klug
*/

package trabalhopoo;

import java.time.LocalDate;

public class TrabalhoPOO {

    public static void main(String[] args) {
    System.out.println("Funcionários:\n");
    Funcionario funcionario1 = new Funcionario(1, LocalDate.now(), "(47) 99999-0001", "joao.silva@trabalhopoo.com", "João Silva", "111.111.001-01", LocalDate.of(1988,03,28), LocalDate.of(2020,06,23), LocalDate.of(1,1,1), "CEO");
    funcionario1.display();
    Funcionario funcionario2 = new Funcionario(2, LocalDate.now(), "(47) 99999-0002", "maria.souza@trabalhopoo.com", "Maria Souza", "111.111.002-02", LocalDate.of(1994,11,28), LocalDate.of(2020,06,23), LocalDate.of(1,1,1), "CFO");
    funcionario2.display();
    System.out.println("-----\n\nClientes:\n");
    Cliente cliente1 = new Cliente(3, LocalDate.now(), "(47) 98888-0001", "enzo@cliente.com", "Enzo Costa", "222.222.001-01", LocalDate.of(1993,04,14), "Rua Osvaldo Hadlich, 101, Boa Vista, Rio do Sul/SC. CEP 89.167-190", 7784.21f);
    cliente1.display();
    Cliente cliente2 = new Cliente(4, LocalDate.now(), "(47) 98888-0002", "valentina@cliente.com", "Valentina Braga", "222.222.002-02", LocalDate.of(1989,07,21), "Alameda Trombudo alto, 777, Centro, Agrolândia/SC. CEP 88.420-000", 6421.99f);
    cliente2.display();
    System.out.println("-----\n\nFornecedores:\n");
    Fornecedor fornecedor1 = new Fornecedor(5, LocalDate.now(), "(47) 97777-0001", "wayne@fornecedor.com", "11.111.001/0001-01", "000001", "Wayne Enterprises, Inc.");
    fornecedor1.display();
    Fornecedor fornecedor2 = new Fornecedor(6, LocalDate.now(), "(47) 97777-0002", "oscorp@fornecedor.com", "11.111.002/0001-02", "000002", "Oscorp Industries");
    fornecedor2.display();
    }

}
