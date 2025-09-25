package Tarefa06;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected String id;
    protected String telefone;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getId() { return id; }
    public String getTelefone() { return telefone; }
    public abstract String getIdentificadorUnico();
}
