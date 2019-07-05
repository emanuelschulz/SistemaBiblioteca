package Model;

import java.util.Date;
import javax.swing.JTextField;

public class Usuario {

    private int id;
    private String nome;
    private Date dataNasc;
    private String cpf;
    private String email;
    private String senha;
    private Date suspensoAte;
    private String codigoUsuario;
    private String tipo;
    private String logradouro;
    private boolean status;

    public Usuario(int id, String nome, Date dataNasc, String cpf, String email, String senha, Date suspensoAte, String codigoUsuario, String tipo, String logradouro, boolean status) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.suspensoAte = suspensoAte;
        this.codigoUsuario = codigoUsuario;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.status = status;
    }

    public Usuario() {
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getSuspensoAte() {
        return suspensoAte;
    }

    public void setSuspensoAte(Date suspensoAte) {
        this.suspensoAte = suspensoAte;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
