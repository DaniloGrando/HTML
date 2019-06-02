/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalifsp;

import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.awt.event.WindowEvent;
import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Grando
 */
public class FormularioDeCadastro extends javax.swing.JFrame {


    public FormularioDeCadastro() {
        initComponents();
        carrega_combo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_carga = new javax.swing.JTextField();
        txt_vagas = new javax.swing.JTextField();
        check_diurno = new javax.swing.JCheckBox();
        check_vespertino = new javax.swing.JCheckBox();
        check_noturno = new javax.swing.JCheckBox();
        comboArea = new javax.swing.JComboBox<>();
        btn_cadastrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome da disciplina");

        jLabel2.setText("Carga horaria");

        jLabel3.setText("Área do conhecimento");

        jLabel4.setText("Número de vagas");

        jLabel5.setText("Período");

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        txt_carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cargaActionPerformed(evt);
            }
        });

        txt_vagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vagasActionPerformed(evt);
            }
        });

        check_diurno.setText("Diurno");
        check_diurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_diurnoActionPerformed(evt);
            }
        });

        check_vespertino.setText("Vespertino");
        check_vespertino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_vespertinoActionPerformed(evt);
            }
        });

        check_noturno.setText("Noturno");
        check_noturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_noturnoActionPerformed(evt);
            }
        });

        comboArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAreaItemStateChanged(evt);
            }
        });
        comboArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboAreaMouseClicked(evt);
            }
        });
        comboArea.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                comboAreaComponentShown(evt);
            }
        });
        comboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreaActionPerformed(evt);
            }
        });

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu Medium", 0, 24)); // NOI18N
        jLabel6.setText("Cadastro de disciplina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check_diurno)
                                .addGap(18, 18, 18)
                                .addComponent(check_vespertino)
                                .addGap(10, 10, 10)
                                .addComponent(check_noturno))
                            .addComponent(comboArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nome)
                            .addComponent(txt_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vagas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_vagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(check_diurno)
                    .addComponent(check_vespertino)
                    .addComponent(check_noturno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_cancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carrega_combo()
    {
        ArrayList<String> combo = new ArrayList<>();
            combo.add("Humanas");
            combo.add("Biologicas");
            combo.add("Exatas");
        DefaultComboBoxModel defaultComboModel;
        defaultComboModel = new DefaultComboBoxModel(combo.toArray());
        comboArea.setModel(defaultComboModel);
    }
    public void windowClosed(WindowEvent e) {
        
    }
    private void cancelar()
    {
        this.dispose();
    }
    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        String nome = txt_nome.toString();
    }//GEN-LAST:event_txt_nomeActionPerformed
    private void txt_vagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vagasActionPerformed
        String vagas = txt_vagas.toString();
    }//GEN-LAST:event_txt_vagasActionPerformed
    
    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        System.out.println("Disciplina: " + txt_nome.getText());
        System.out.println("Carga horaria: " + txt_carga.getText()+ " horas");
        System.out.println("Area do conhecimento: " + comboArea.getSelectedItem());
        System.out.println("Qtd de vagas: "+ txt_vagas.getText());
           
        String x = "";
        String y = "";
        String z = "";
            if(check_diurno.isSelected()){
                x = check_diurno.getText();
            }
            if (check_vespertino.isSelected()){
                y = check_vespertino.getText();
            }
            if(check_noturno.isSelected()){
                z = check_noturno.getText();
            } 
            if(z!="" | y!="" | x!=""){
        String periodo = x +" "+ y +" "+ z;
            
        System.out.println("PERIODO: "+ periodo);
            }
    
    
    //--------------------------Conexão com o banco---------------------------------
        Connection con = null;
        try {
            con = ConnectionJava.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(FormularioDeExclusao.class.getName()).log(Level.SEVERE, null, ex);
        }
    //------------------------------------------------------------------------------   
    
//         String Disciplina = "insert into db_disciplina (nome, cargaHoraria, areaConhecimento, numeroVagas) VALUES (" +txt_nome.getText(); 
//         +txt_carga.getText(); + comboArea.getSelectedItem(); +txt_vagas.getText()' " );
//                 
//                 
//                 txt_nome.getText();" ', "+txt_carga.getText(); + " ', " + comboArea.getSelectedItem(); + "'," + txt_vagas.getText(); +
//            ","+ periodo )" ;  

            
        //String teste = "insert into db_disciplina (nome) values (" + txt_nome.getText() + " )";
        String teste = "insert into db_disciplina (nome) values('texto111')";
        System.out.println(teste);
        try {
            PreparedStatement stmt = con.prepareStatement(teste);
            Statement st = con.createStatement();
             ResultSet rs = stmt.executeQuery(teste);
        } catch (SQLException ex) {
            Logger.getLogger(FormularioDeCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void check_diurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_diurnoActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_check_diurnoActionPerformed

    private void txt_cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cargaActionPerformed
        // TODO add your handling code here:
        String carga = txt_carga.getText();
    }//GEN-LAST:event_txt_cargaActionPerformed

    private void comboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreaActionPerformed
        //CHAMA O CARREGAR AREA  
    }//GEN-LAST:event_comboAreaActionPerformed

    private void check_vespertinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_vespertinoActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_check_vespertinoActionPerformed

    private void check_noturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_noturnoActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_check_noturnoActionPerformed

    private void comboAreaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_comboAreaComponentShown
        // TODO add your handling code here:         
    }//GEN-LAST:event_comboAreaComponentShown

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void comboAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAreaItemStateChanged
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "SELECIONADO" + comboArea.getSelectedItem() );
    }//GEN-LAST:event_comboAreaItemStateChanged

    private void comboAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAreaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAreaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {;;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioDeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JCheckBox check_diurno;
    private javax.swing.JCheckBox check_noturno;
    private javax.swing.JCheckBox check_vespertino;
    private javax.swing.JComboBox<String> comboArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_carga;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_vagas;
    // End of variables declaration//GEN-END:variables
}
