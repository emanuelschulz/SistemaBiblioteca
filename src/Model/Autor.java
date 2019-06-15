package Model;

import java.util.Date;

public class Autor {

    private int Id_autor;
    private Date ano_nasc;
    private String nome;
    private String email;
    private boolean status;

    public Autor(int Id_autor, Date ano_nasc, String nome, String email, boolean status) {
        this.Id_autor = Id_autor;
        this.ano_nasc = ano_nasc;
        this.nome = nome;
        this.email = email;
        this.status = status;
    }

    public int getId_autor() {
        return Id_autor;
    }

    public void setId_autor(int Id_autor) {
        this.Id_autor = Id_autor;
    }

    public Date getAno_nasc() {
        return ano_nasc;
    }

    public void setAno_nasc(Date ano_nasc) {
        this.ano_nasc = ano_nasc;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

}
