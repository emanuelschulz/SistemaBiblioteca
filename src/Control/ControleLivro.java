package Control;

import Model.Livro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ControleLivro {

    public void cadastrarLivro(Livro l) {
        String sql = "insert into livro (titulo, subtitulo, isbn, edicao, braile, classificacao, paginas, online, editora, ano, status) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, l.getTitulo());
            comando.setString(2, l.getSubTitulo());
            comando.setString(3, l.getIsbn());
            comando.setInt(4, l.getEdicao());
            comando.setBoolean(5, l.getBraile());
            comando.setString(6, l.getClassificaçao());
            comando.setInt(7, l.getNumero_de_paginas());
            comando.setBoolean(8, l.getOnline());
            comando.setInt(9, l.getId_editora());
            comando.setInt(10, l.getAno());
            comando.setBoolean(11, true);
            comando.executeUpdate();
        } catch (Exception e) {
            System.out.println("deu erro");
        }
    }

    public ArrayList<Livro> pesquisarLivroPorNome(String nome) {
        ArrayList<Livro> pesq = new ArrayList<>(); 
        
        String sql = "Select * from livro where nome like ?%";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, nome);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {                
                Livro liv = new Livro(resultado.getInt("id"), resultado.getString("titulo"), resultado.getString("subtitulo"), resultado.getString("isbn"), resultado.getBoolean("online"), resultado.getBoolean("braile"), resultado.getString("genero"), resultado.getInt("paginas"), resultado.getInt("editora"), resultado.getBoolean("Status"));
                pesq.add(liv);
            }
            
            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro");
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
                Livro liv = new Livro(resultado.getInt("id"), resultado.getString("titulo"), resultado.getString("subtitulo"), resultado.getString("isbn"), resultado.getBoolean("online"), resultado.getBoolean("braile"), resultado.getString("genero"), resultado.getInt("paginas"), resultado.getInt("editora"), resultado.getBoolean("Status"));
                liv.setAno(resultado.getInt("ano"));
                pesq.add(liv);
            }            
            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro");
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
                Livro liv = new Livro(resultado.getInt("id"), resultado.getString("titulo"), resultado.getString("subtitulo"), resultado.getString("isbn"), resultado.getBoolean("online"), resultado.getBoolean("braile"), resultado.getString("genero"), resultado.getInt("paginas"), resultado.getInt("editora"), resultado.getBoolean("Status"));
                pesq.add(liv);
            }
            
            return pesq;
        } catch (Exception e) {
            System.out.println("deu erro");
            return null;
        }
    }    
}
