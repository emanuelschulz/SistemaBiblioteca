package Model;

public class Editora {

    private int id;
    private String nome;
    private String logradouro;
    private String telefone;
    private String site;
    private boolean status;

    public Editora(int id, String nome, String logradouro, String telefone, String site, boolean status) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.telefone = telefone;
        this.site = site;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}