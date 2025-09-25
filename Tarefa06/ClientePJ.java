package Tarefa06;

public class ClientePJ extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(String nome, String email, String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(nome, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCNPJ() { return cnpj; }
    @Override
    public String getIdentificadorUnico() { return cnpj; }
}