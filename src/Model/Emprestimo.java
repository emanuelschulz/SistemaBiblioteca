

package Model;

import java.util.Date;


public class Emprestimo {
  private int Id_emprestimo; 
  private int Id_usuario;
  private int Id_livro;
  private Date emprestimo;
  private Date devolucao;
  private boolean status;

    public Emprestimo(int Id_emprestimo, int Id_usuario, int Id_livro, Date emprestimo, Date devolucao, boolean status) {
        this.Id_emprestimo = Id_emprestimo;
        this.Id_usuario = Id_usuario;
        this.Id_livro = Id_livro;
        this.emprestimo = emprestimo;
        this.devolucao = devolucao;
        this.status = status;
    }

    public int getId_emprestimo() {
        return Id_emprestimo;
    }

    public void setId_emprestimo(int Id_emprestimo) {
        this.Id_emprestimo = Id_emprestimo;
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public int getId_livro() {
        return Id_livro;
    }

    public void setId_livro(int Id_livro) {
        this.Id_livro = Id_livro;
    }

    public Date getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Date emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
}
