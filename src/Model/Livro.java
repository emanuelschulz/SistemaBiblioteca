
package Model;


public class Livro {
    private int Id_livro;
    private String titulo;
    private String subTitulo;
    private String isbn;
    private boolean online;
    private boolean braile;
    private String genero;
    private int numero_de_paginas;
    private int id_editora;
    private boolean status;
    private int edicao;
    private int ano;

    public Livro(int Id_livro, String titulo, String subTitulo, String isbn, boolean online, boolean braile, String genero, int numero_de_paginas, int id_editora, int ano, int edicao, boolean status) {
        this.Id_livro = Id_livro;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.isbn = isbn;
        this.online = online;
        this.braile = braile;
        this.genero = genero;
        this.numero_de_paginas = numero_de_paginas;
        this.id_editora = id_editora;
        this.status = status;
        this.ano = ano;
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
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

    public boolean getOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean getBraile() {
        return braile;
    }

    public void setBraile(boolean braile) {
        this.braile = braile;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
