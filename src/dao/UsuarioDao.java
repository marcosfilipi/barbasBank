/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.ConexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author marcosfilipi
 */
public class UsuarioDao {
    public static String aux;
    public void create(Usuario u) {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tb_usuario(login, senha, cpf, telefone) VALUES(?,?,?,?)");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getCpf());
            stmt.setString(4, u.getTelefone());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
    }



      public List<Usuario> read() throws SQLException {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_usuario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setId_usuario(rs.getInt("id_usuario"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setCpf(rs.getString("cpf"));
                user.setTelefone(rs.getString("telefone"));
                usuarios.add(user);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro de Leitura" + ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }
        return usuarios;
    } 


   

    public void update(Usuario u) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("UPDATE tb_usuario SET login=?, senha=? WHERE id_usuario=?");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getId_usuario());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso"); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
        
    }




public void delete(Usuario u) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("DELETE FROM tb_usuario WHERE login=?");
            stmt.setString(1, u.getLogin());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso"); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
        
    }  

public List<Usuario> readForDesc(String desc) throws SQLException {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tb_usuario WHERE login like ?");
            stmt.setString(1,"%"+desc+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setId_usuario(rs.getInt("id_usuario"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setCpf(rs.getString("cpf"));
                user.setTelefone(rs.getString("telefone"));
                usuarios.add(user);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro de Leitura" + ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }
        return usuarios;
    } 

}
