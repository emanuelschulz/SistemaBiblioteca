package Model;

import java.util.Date;

public class UsuarioModelo {

    private int Id_usuario;
    private String nome;
    private String email;
    private String tipo_usuario;
    private String cpf;
    private String telefone;
    private Date data_nasc;
    private String endereco;
    private Date suspencao;
    private boolean status;
    private String senha;

    

    public UsuarioModelo(int Id_usuario, String nome, String email, String tipo_usuario, String cpf, String telefone, Date data_nasc, String endereco, Date suspencao, boolean status, String senha) {
        this.Id_usuario = Id_usuario;
        this.nome = nome;
        this.email = email;
        this.tipo_usuario = tipo_usuario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.suspencao = suspencao;
        this.status = status;
        this.senha = senha;
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getSuspencao() {
        return suspencao;
    }

    public void setSuspencao(Date suspencao) {
        this.suspencao = suspencao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
