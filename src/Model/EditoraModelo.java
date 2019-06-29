package Model;

public class EditoraModelo {

    private int Id_editora;
    private String nome;
    private String lougradouro;
    private String telefone;
    private String site;
    private String ano_da_edicao;
    private boolean status;
    
    public EditoraModelo(){
    }

    public EditoraModelo(int Id_editora, String nome, String lougradouro, String telefone, String site, String ano_da_edicao, boolean status) {
        this.Id_editora = Id_editora;
        this.nome = nome;
        this.lougradouro = lougradouro;
        this.telefone = telefone;
        this.site = site;
        this.ano_da_edicao = ano_da_edicao;
        this.status = status;
    }






    public int getId_editora() {
        return Id_editora;
    }

    public void setId_editora(int Id_editora) {
        this.Id_editora = Id_editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLougradouro() {
        return lougradouro;
    }

    public void setLougradouro(String lougradouro) {
        this.lougradouro = lougradouro;
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

    public String getAno_da_edicao() {
        return ano_da_edicao;
    }

    public void setAno_da_edicao(String ano_da_edicao) {
        this.ano_da_edicao = ano_da_edicao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
