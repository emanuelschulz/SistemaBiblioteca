package Control;

import Model.Autor;
import Model.Livro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ControleLivro {

    public void cadastrarLivro(Livro l, Autor[] autores) {
        String sql = "insert into livro (titulo, subtitulo, isbn, edicao, braile, genero, paginas, disponivelOnline, editora_id, ano, status) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, l.getTitulo());
            comando.setString(2, l.getSubTitulo());
            comando.setString(3, l.getIsbn());
            comando.setInt(4, l.getEdicao());
            comando.setBoolean(5, l.getBraile());
            comando.setString(6, l.getGenero());
            comando.setInt(7, l.getNumero_de_paginas());
            comando.setBoolean(8, l.getOnline());
            comando.setInt(9, l.getId_editora());
            comando.setInt(10, l.getAno());
            comando.setBoolean(11, true);
            comando.executeUpdate();

            cadastrarNN(autores);
        } catch (Exception e) {
            System.out.println("deu erro" + this.getClass().getName() + ".cadastrarLivro()");
        }
    }

    public ArrayList<Livro> pesquisarLivroPorNome(String nome) {
        ArrayList<Livro> pesq = new ArrayList<>();

        String sql = "Select * from livro where trim(lower(titulo)) like ?;";
        try {
            nome = nome.trim().toLowerCase() + "%";
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, nome);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Livro liv = new Livro(resultado.getInt("id"),
                        resultado.getString("titulo"),
                        resultado.getString("subtitulo"),
                        resultado.getString("isbn"),
                        resultado.getBoolean("disponivelOnline"),
                        resultado.getBoolean("braile"),
                        resultado.getString("genero"),
                        resultado.getInt("paginas"),
                        resultado.getInt("editora_id"),
                        resultado.getInt("ano"),
                        resultado.getInt("edicao"),
                        resultado.getBoolean("Status"));
                pesq.add(liv);
            }

            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro " + this.getClass().getName() + ".pesquisarLivroPorNome()");
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Livro> pesquisarLivroPorAno(int ano) {
        ArrayList<Livro> pesq = new ArrayList<>();

        String sql = "Select * from livro where ano = ?;";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setInt(1, ano);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Livro liv = new Livro(resultado.getInt("id"),
                        resultado.getString("titulo"),
                        resultado.getString("subtitulo"),
                        resultado.getString("isbn"),
                        resultado.getBoolean("disponivelOnline"),
                        resultado.getBoolean("braile"),
                        resultado.getString("genero"),
                        resultado.getInt("paginas"),
                        resultado.getInt("editora_id"),
                        resultado.getInt("ano"),
                        resultado.getInt("edicao"),
                        resultado.getBoolean("Status"));
                pesq.add(liv);
            }

            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro " + this.getClass().getName() + ".pesquisarLivroPorNome()");
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Livro> pesquisarLivroPorIsbn(String Isbn) {
        ArrayList<Livro> pesq = new ArrayList<>();

        String sql = "Select * from livro where isbn = ?;";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, Isbn);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Livro liv = new Livro(resultado.getInt("id"),
                        resultado.getString("titulo"),
                        resultado.getString("subtitulo"),
                        resultado.getString("isbn"),
                        resultado.getBoolean("disponivelOnline"),
                        resultado.getBoolean("braile"),
                        resultado.getString("genero"),
                        resultado.getInt("paginas"),
                        resultado.getInt("editora_id"),
                        resultado.getInt("ano"),
                        resultado.getInt("edicao"),
                        resultado.getBoolean("Status"));
                pesq.add(liv);
            }

            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro " + this.getClass().getName() + ".pesquisarLivroPorNome()");
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Livro> getTudo() {
        ArrayList<Livro> pesq = new ArrayList<>();

        String sql = "Select * from livro;";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Livro liv = new Livro(resultado.getInt("id"),
                        resultado.getString("titulo"),
                        resultado.getString("subtitulo"),
                        resultado.getString("isbn"),
                        resultado.getBoolean("disponivelOnline"),
                        resultado.getBoolean("braile"),
                        resultado.getString("genero"),
                        resultado.getInt("paginas"),
                        resultado.getInt("editora_id"),
                        resultado.getInt("ano"),
                        resultado.getInt("edicao"),
                        resultado.getBoolean("Status"));
                liv.setAno(resultado.getInt("ano"));
                pesq.add(liv);
            }
            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro" + this.getClass().getName() + ".getTudo()");
            e.printStackTrace();
            return null;            
        }
    }

    public ArrayList<Livro> pesquisarAutor(int codAutor) {
        ArrayList<Livro> pesq = new ArrayList<>();

        String sql = "Select * from livro as l where l.id = n.livro_id inner join livro_has_autor as n where n.Autor_id = ?";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setInt(1, codAutor);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Livro liv = new Livro(resultado.getInt("id"),
                        resultado.getString("titulo"),
                        resultado.getString("subtitulo"),
                        resultado.getString("isbn"),
                        resultado.getBoolean("disponivelOnline"),
                        resultado.getBoolean("braile"),
                        resultado.getString("genero"),
                        resultado.getInt("paginas"),
                        resultado.getInt("editora_id"),
                        resultado.getInt("ano"),
                        resultado.getInt("edicao"),
                        resultado.getBoolean("Status"));
                pesq.add(liv);
            }

            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro" + this.getClass().getName() + ".pesquisarAutor()");
            return null;
        }
    }

    private void cadastrarNN(Autor[] autores) {
        String sql = "INSERT INTO livro_has_Autor (livro_id,Autor_id) VALUES ((select max(id) from livro), ?);";

        for (Autor autor : autores) {
            try {
                PreparedStatement comando = DB.connection().prepareStatement(sql);
                comando.setInt(1, autor.getId_autor());

                comando.executeUpdate();
            } catch (Exception e) {
                System.out.println("deu erro " + this.getClass().getName() + ".cadastrarNN()");
                e.printStackTrace();
            }
        }
    }
}
