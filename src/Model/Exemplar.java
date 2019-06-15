
package Model;


public class Exemplar {
    private int Id_exemplar;
    private int Id_livro;
    private int Id_emprestimo;
    private int quantidade;
    private boolean status;

    public Exemplar(int Id_exemplar, int Id_livro, int Id_emprestimo, int quantidade, boolean status) {
        this.Id_exemplar = Id_exemplar;
        this.Id_livro = Id_livro;
        this.Id_emprestimo = Id_emprestimo;
        this.quantidade = quantidade;
        this.status = status;
    }

    public int getId_exemplar() {
        return Id_exemplar;
    }

    public void setId_exemplar(int Id_exemplar) {
        this.Id_exemplar = Id_exemplar;
    }

    public int getId_livro() {
        return Id_livro;
    }

    public void setId_livro(int Id_livro) {
        this.Id_livro = Id_livro;
    }

    public int getId_emprestimo() {
        return Id_emprestimo;
    }

    public void setId_emprestimo(int Id_emprestimo) {
        this.Id_emprestimo = Id_emprestimo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
