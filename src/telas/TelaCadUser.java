/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import dao.UsuarioDao;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Usuario;

/**
 *
 * @author marcosfilipi
 */
public class TelaCadUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadUser
     */
    public TelaCadUser() throws SQLException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTUsuario.getModel();
        jTUsuario.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

    public void readJTable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) jTUsuario.getModel();
        modelo.setNumRows(0);

        UsuarioDao udao = new UsuarioDao();
        for (Usuario u : udao.read()) {
            modelo.addRow(new Object[]{
                u.getLogin(),
                u.getSenha(),
                u.getCpf(),
                u.getTelefone()});
        }

    }

    public void readJtableForDesc(String desc) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTUsuario.getModel();
        modelo.setNumRows(0);

        UsuarioDao udao = new UsuarioDao();
        for (Usuario u : udao.readForDesc(desc)) {
            modelo.addRow(new Object[]{
                u.getLogin(),
                u.getSenha(),
                u.getCpf(),
                u.getTelefone(),});
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        edtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtSenha = new javax.swing.JPasswordField();
        v_button_salvar = new javax.swing.JButton();
        v_button_exluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        edtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        edtCpf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edtTelefone = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setAlignmentX(1.0F);
        setAlignmentY(1.0F);
        setMinimumSize(new java.awt.Dimension(960, 960));
        setSize(new java.awt.Dimension(960, 960));

        jLabel5.setText("Login");

        jLabel6.setText("Senha");

        v_button_salvar.setText("SALVAR");
        v_button_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_button_salvarActionPerformed(evt);
            }
        });

        v_button_exluir.setText("EXLUIR");
        v_button_exluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_button_exluirActionPerformed(evt);
            }
        });

        jTUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "LOGIN", "SENHA", "CPF", "TELEFONE"
            }
        ));
        jScrollPane1.setViewportView(jTUsuario);

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(edtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("CPF");

        jLabel8.setText("TELEFONE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(v_button_salvar)
                        .addGap(37, 37, 37)
                        .addComponent(v_button_exluir)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_button_salvar)
                    .addComponent(v_button_exluir))
                .addContainerGap(380, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void v_button_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_button_salvarActionPerformed
        Usuario u = new Usuario();
        UsuarioDao userDao = new UsuarioDao();

        u.setLogin(edtLogin.getText());
        u.setSenha(edtSenha.getText());
        u.setCpf(edtCpf.getText());
        u.setTelefone(edtTelefone.getText());
        userDao.create(u);
        edtLogin.setText("");
        edtSenha.setText("");
        edtCpf.setText("");
        edtTelefone.setText("");

        try {
            readJTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_v_button_salvarActionPerformed

    private void v_button_exluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_button_exluirActionPerformed
        if (jTUsuario.getSelectedRow() != -1) {
            Usuario u = new Usuario();
            UsuarioDao dao = new UsuarioDao();
            u.setLogin((String) jTUsuario.getValueAt(jTUsuario.getSelectedRow(), 0));
            dao.delete(u);
            edtLogin.setText("");
            edtSenha.setText("");
            edtCpf.setText("");
            edtTelefone.setText("");

        }

        try {
            readJTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_v_button_exluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            readJtableForDesc(edtPesquisar.getText());
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtPesquisar;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JTextField edtTelefone;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTUsuario;
    private javax.swing.JButton v_button_exluir;
    private javax.swing.JButton v_button_salvar;
    // End of variables declaration//GEN-END:variables
}
