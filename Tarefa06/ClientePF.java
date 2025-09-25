package Tarefa06;

import java.time.LocalDate;

public class ClientePF extends Cliente {
    private String cpf;
    private LocalDate dataNascimento;

    public ClientePF(String nome, String email, String cpf, LocalDate dataNascimento) {
        super(nome, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() { return cpf; }
    @Override
    public String getIdentificadorUnico() { return cpf; }
}