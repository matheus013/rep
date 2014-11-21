/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import banco.DAO.BdProfessorDAO;
import banco.DAO.InterfaceDAO;
import banco.FactoryMetody.FactoryBdMateria;
import banco.FactoryMetody.FactoryBdProfessor;
import banco.FactoryMetody.FactoryMetody;
import banco.Memento.ListaProfessorMemento;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javafx.scene.control.SelectionMode;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import negocio.NegocioProfessor;
import objeto.Materia;
import objeto.Professor;

/**
 *
 * @author matheus
 */
public class FormCadastroProfessor extends javax.swing.JInternalFrame {


    NegocioProfessor negocioProfessor;
    public FormCadastroProfessor() throws PropertyVetoException{
        negocioProfessor=new NegocioProfessor();
        initComponents();
        limparCampos();
        preencherTabela();
        this.setVisible(true);
        
        this.jComboBoxMaterias.removeAllItems();
    }
    
        public void limparCampos()
    {
        
        this.jLabelCpfErro.setVisible(false);
        this.jLabelNomeErro.setVisible(false);
        this.jLabelEmailErro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jComboBoxMaterias = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonBuscarCpf = new javax.swing.JButton();
        jTextFieldBuscaCPF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jTextCpf = new javax.swing.JTextField();
        jLabelNomeErro = new javax.swing.JLabel();
        jLabelCpfErro = new javax.swing.JLabel();
        jLabelEmailErro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jComboBoxMaterias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMateriasActionPerformed(evt);
            }
        });

        jLabel4.setText("Materias:");

        jLabel5.setText("CPF:");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonBuscarCpf.setText("Buscar");
        jButtonBuscarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCpfActionPerformed(evt);
            }
        });

        jTextFieldBuscaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscaCPFActionPerformed(evt);
            }
        });

        jLabel7.setText("CPF");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonBuscarCpf))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscarCpf)
                .addContainerGap())
        );

        jLabel9.setText("Email:");

        jLabelNomeErro.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNomeErro.setText("Nome inválido");

        jLabelCpfErro.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCpfErro.setText("CPF inválido");

        jLabelEmailErro.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEmailErro.setText("Email inválido");

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Undo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextEmail))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextNome)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpar)
                    .addComponent(jLabelCpfErro)
                    .addComponent(jLabelEmailErro)
                    .addComponent(jLabelNomeErro))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeErro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCpfErro))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmailErro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfessoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProfessores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscaCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaCPFActionPerformed

    private void jButtonBuscarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCpfActionPerformed
        // TODO add your handling code here:
        Professor objProfessorSelecionado = null;
        String cpf = jTextFieldBuscaCPF.getText();
        FactoryMetody FactoryBd = new FactoryBdProfessor();
        InterfaceDAO  objBdProfessor= FactoryBd.criar_DAO_BD();
        ArrayList<Professor> listProfessor = objBdProfessor.listar();
        objProfessorSelecionado=(Professor) objBdProfessor.procurar(new Professor(cpf));
        if(objProfessorSelecionado!=null)
        {
            jTextNome.setText(objProfessorSelecionado.getNome());
            jTextCpf.setText(objProfessorSelecionado.getCpf());
            jTextCpf.setEditable(false);
            jTextEmail.setText(objProfessorSelecionado.getEmail());
            FactoryBd = new FactoryBdMateria();
            objBdProfessor=FactoryBd.criar_DAO_BD();
            Materia p = (Materia) objBdProfessor.procurar(new Materia(objProfessorSelecionado.getIdMateria()));
            System.out.println(p.getNome());
            jComboBoxMaterias.setSelectedItem(p);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Professor não encontrado!!\nError!");
        }

    }//GEN-LAST:event_jButtonBuscarCpfActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
               
        
        negocioProfessor.cadastrar(this);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        limpar();
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    public void limpar()
    {
        this.jTextNome.setText("");
        this.jTextEmail.setText("");
        this.jTextCpf.setText("");
        this.jTextCpf.setEditable(true);
        this.jComboBoxMaterias.setSelectedIndex(0);
    }
    
    private void jTableProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfessoresMouseClicked
        // TODO add your handling code here:
       jTextCpf.setText(jTableProfessores.getValueAt(
               jTableProfessores.getSelectedRow(), 0).toString());
       jTextNome.setText(jTableProfessores.getValueAt(
               jTableProfessores.getSelectedRow(), 1).toString());
       jTextEmail.setText(jTableProfessores.getValueAt(
               jTableProfessores.getSelectedRow(), 2).toString());
       jTextCpf.setEditable(false);
    }//GEN-LAST:event_jTableProfessoresMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        
        if(negocioProfessor.excluir(this))
        {
            JOptionPane.showMessageDialog(null, "Professor excluido com sucessor!!");
            preencherTabela();
            limpar();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Professor não excluido!!!\nErro!!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jComboBoxMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMateriasActionPerformed
        // TODO add your handling code here:
        FactoryMetody FactoryBd = new FactoryBdMateria();
        InterfaceDAO InterfaceBd = FactoryBd.criar_DAO_BD();
        ArrayList<Materia> lista = InterfaceBd.listar();
        for (Materia objMateria : lista)
        {
            this.jComboBoxMaterias.addItem(objMateria);
        }
    }//GEN-LAST:event_jComboBoxMateriasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        negocioProfessor = new NegocioProfessor();
        if(negocioProfessor.atualizar(this)){
            JOptionPane.showMessageDialog(null, "Professor atualizado!!");
            preencherTabela();
            limpar();
        }else{
            JOptionPane.showMessageDialog(null, "Professor nãoo atualizado!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        negocioProfessor.undo();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void preencherTabela()
    {
        FactoryMetody FactoryBd = new FactoryBdProfessor();
        InterfaceDAO obj_BdProfessor = FactoryBd.criar_DAO_BD();
        ArrayList<Professor> list_Professor= obj_BdProfessor.listar();
        
        DefaultTableModel Model = new DefaultTableModel(){  
        @Override  
            public boolean isCellEditable(int row, int column) {  //sobscrevendo o metodo isCell para deixar as celulas não editáveis  
                return false;  
            }  
    };  
        
        String [] colunas = new String[] { 
                    "CPF", "Nome", "Email", "Carag Horaria", "Materia" };
        Model.setColumnIdentifiers(colunas);
        FactoryBd= new FactoryBdMateria();
        obj_BdProfessor = FactoryBd.criar_DAO_BD();
        for(Professor obj_Professor : list_Professor)
        {
            Materia objMateria =(Materia) obj_BdProfessor.procurar(new Materia(obj_Professor.getIdMateria()));
                Model.addRow(new Object[] {obj_Professor.getCpf(), 
                    obj_Professor.getNome(), obj_Professor.getEmail(), objMateria.getCargahoraria(), objMateria.getNome()}
                    );
        }
        jTableProfessores.setModel(Model);
                
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscarCpf;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    public javax.swing.JComboBox jComboBoxMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelCpfErro;
    public javax.swing.JLabel jLabelEmailErro;
    public javax.swing.JLabel jLabelNomeErro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProfessores;
    public javax.swing.JTextField jTextCpf;
    public javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFieldBuscaCPF;
    public javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
