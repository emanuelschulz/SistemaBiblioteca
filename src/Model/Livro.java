
package Model;


public class Livro {
    private int Id_livro;
    private String titulo;
    private String subTitulo;
    private String isbn;
    private String online;
    private String braile;
    private String classificaçao;
    private int numero_de_paginas;
    private int id_editora;
    private boolean status;

    public Livro(int Id_livro, String titulo, String subTitulo, String isbn, String online, String braile, String classificaçao, int numero_de_paginas, int id_editora, boolean status) {
        this.Id_livro = Id_livro;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.isbn = isbn;
        this.online = online;
        this.braile = braile;
        this.classificaçao = classificaçao;
        this.numero_de_paginas = numero_de_paginas;
        this.id_editora = id_editora;
        this.status = status;
    }

    public int getId_livro() {
        return Id_livro;
    }

    public void setId_livro(int Id_livro) {
        this.Id_livro = Id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getBraile() {
        return braile;
    }

    public void setBraile(String braile) {
        this.braile = braile;
    }

    public String getClassificaçao() {
        return classificaçao;
    }

    public void setClassificaçao(String classificaçao) {
        this.classificaçao = classificaçao;
    }

    public int getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public void setNumero_de_paginas(int numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public int getId_editora() {
        return id_editora;
    }

    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
