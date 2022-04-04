/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.LimitadorCaracteres;
import javax.swing.JOptionPane;
import model.Petshop;

/**
 *
 * @author Daniel Caumo
 */
public class GUICadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadastro
     */
    public GUICadastro() {
        initComponents();
        jtfNome.setDocument(new LimitadorCaracteres(3));
    }
    
    public void cadastrar(){
        Petshop p = new Petshop();
        p.setNomeAnimal(jtfNome.getText());
        p.setPesoAnimal(Double.parseDouble(jtfPeso.getText()));
        p.setIdadeAnimal(Integer.parseInt(jtfIdade.getText()));
        p.setValorPrimeiroServico(Double.parseDouble(jtfPrimeiroServico.getText()));
        p.setValorSegundoServico(Double.parseDouble(jtfSegundoServico.getText()));
        p.setSexoAnimal(jbgSexo.getSelection().getActionCommand());
        if(jcbEmail.isSelected()){
            p.adicionar(jcbEmail.getActionCommand());
        }
        if(jcbSms.isSelected()){
            p.adicionar(jcbSms.getActionCommand());
        }       
        JOptionPane.showMessageDialog(null,p);
    }
    
    public void limpar() {
        jtfNome.setText(null);
        jtfPeso.setText(null);
        jtfIdade.setText(null);
        jtfPrimeiroServico.setText(null);
        jtfSegundoServico.setText(null);
        jrbMacho.setSelected(true);
        jcbEmail.setSelected(false);
        jcbSms.setSelected(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgSexo = new javax.swing.ButtonGroup();
        jpanelFundo = new javax.swing.JPanel();
        jpanelServicos = new javax.swing.JPanel();
        jlblPrimeiroServico = new javax.swing.JLabel();
        jtfPrimeiroServico = new javax.swing.JTextField();
        jlblSegundoServico = new javax.swing.JLabel();
        jtfSegundoServico = new javax.swing.JTextField();
        jcbEmail = new javax.swing.JCheckBox();
        jcbSms = new javax.swing.JCheckBox();
        jpfSenha = new javax.swing.JPasswordField();
        jftfData = new javax.swing.JFormattedTextField();
        jpanelAnimal = new javax.swing.JPanel();
        jlblNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlblIdade = new javax.swing.JLabel();
        jlblPeso = new javax.swing.JLabel();
        jlblSexo = new javax.swing.JLabel();
        jtfIdade = new javax.swing.JTextField();
        jtfPeso = new javax.swing.JTextField();
        jrbMacho = new javax.swing.JRadioButton();
        jrbFemea = new javax.swing.JRadioButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnCadastrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(380, 450));

        jpanelFundo.setBackground(new java.awt.Color(206, 219, 219));
        jpanelFundo.setPreferredSize(new java.awt.Dimension(430, 420));

        jpanelServicos.setBackground(new java.awt.Color(206, 219, 219));
        jpanelServicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SERVIÇOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jpanelServicos.setPreferredSize(new java.awt.Dimension(340, 175));

        jlblPrimeiroServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblPrimeiroServico.setForeground(new java.awt.Color(0, 102, 102));
        jlblPrimeiroServico.setText("Serviço 1, Valor:");

        jtfPrimeiroServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPrimeiroServico.setForeground(new java.awt.Color(0, 102, 102));

        jlblSegundoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblSegundoServico.setForeground(new java.awt.Color(0, 102, 102));
        jlblSegundoServico.setText("Serviço 2, Valor:");

        jtfSegundoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfSegundoServico.setForeground(new java.awt.Color(0, 102, 102));

        jcbEmail.setBackground(new java.awt.Color(206, 219, 219));
        jcbEmail.setForeground(new java.awt.Color(0, 102, 102));
        jcbEmail.setText("Enviar Nota Fiscal por e-mail");
        jcbEmail.setActionCommand("e-mail");

        jcbSms.setBackground(new java.awt.Color(206, 219, 219));
        jcbSms.setForeground(new java.awt.Color(0, 102, 102));
        jcbSms.setText("Enviar Nota Fiscal por SMS");
        jcbSms.setActionCommand("SMS");
        jcbSms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSmsActionPerformed(evt);
            }
        });

        try {
            jftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpanelServicosLayout = new javax.swing.GroupLayout(jpanelServicos);
        jpanelServicos.setLayout(jpanelServicosLayout);
        jpanelServicosLayout.setHorizontalGroup(
            jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpanelServicosLayout.createSequentialGroup()
                            .addComponent(jlblPrimeiroServico)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfPrimeiroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpanelServicosLayout.createSequentialGroup()
                            .addComponent(jlblSegundoServico)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfSegundoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)))
                    .addGroup(jpanelServicosLayout.createSequentialGroup()
                        .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpfSenha)
                            .addComponent(jftfData, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbSms)
                            .addComponent(jcbEmail))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jpanelServicosLayout.setVerticalGroup(
            jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrimeiroServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPrimeiroServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSegundoServico)
                    .addComponent(jtfSegundoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEmail)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSms)
                    .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelAnimal.setBackground(new java.awt.Color(206, 219, 219));
        jpanelAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DO ANIMAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jpanelAnimal.setPreferredSize(new java.awt.Dimension(340, 150));

        jlblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblNome.setForeground(new java.awt.Color(0, 102, 102));
        jlblNome.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNome.setForeground(new java.awt.Color(0, 102, 102));

        jlblIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblIdade.setForeground(new java.awt.Color(0, 102, 102));
        jlblIdade.setText("Idade:");

        jlblPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblPeso.setForeground(new java.awt.Color(0, 102, 102));
        jlblPeso.setText("Peso:");

        jlblSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblSexo.setForeground(new java.awt.Color(0, 102, 102));
        jlblSexo.setText("Sexo:");

        jtfIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfIdade.setForeground(new java.awt.Color(0, 102, 102));

        jtfPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPeso.setForeground(new java.awt.Color(0, 102, 102));

        jrbMacho.setBackground(new java.awt.Color(206, 219, 219));
        jbgSexo.add(jrbMacho);
        jrbMacho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrbMacho.setForeground(new java.awt.Color(0, 102, 102));
        jrbMacho.setSelected(true);
        jrbMacho.setText("Macho");
        jrbMacho.setActionCommand("Macho");

        jrbFemea.setBackground(new java.awt.Color(206, 219, 219));
        jbgSexo.add(jrbFemea);
        jrbFemea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrbFemea.setForeground(new java.awt.Color(0, 102, 102));
        jrbFemea.setText("Fêmea");
        jrbFemea.setActionCommand("Fêmea");

        javax.swing.GroupLayout jpanelAnimalLayout = new javax.swing.GroupLayout(jpanelAnimal);
        jpanelAnimal.setLayout(jpanelAnimalLayout);
        jpanelAnimalLayout.setHorizontalGroup(
            jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblNome)
                    .addGroup(jpanelAnimalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblIdade)
                            .addComponent(jlblSexo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelAnimalLayout.createSequentialGroup()
                        .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbMacho))
                        .addGap(18, 18, 18)
                        .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbFemea)
                            .addGroup(jpanelAnimalLayout.createSequentialGroup()
                                .addComponent(jlblPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jtfNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelAnimalLayout.setVerticalGroup(
            jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIdade)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSexo)
                    .addComponent(jrbMacho)
                    .addComponent(jrbFemea))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnCancelar.setForeground(new java.awt.Color(0, 102, 102));
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnCadastrar.setForeground(new java.awt.Color(0, 102, 102));
        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelFundoLayout = new javax.swing.GroupLayout(jpanelFundo);
        jpanelFundo.setLayout(jpanelFundoLayout);
        jpanelFundoLayout.setHorizontalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFundoLayout.createSequentialGroup()
                        .addComponent(jbtnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpanelFundoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        jpanelFundoLayout.setVerticalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundoLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jpanelServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnCadastrar))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpanelFundoLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jpanelAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(245, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSmsActionPerformed

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_jbtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup jbgSexo;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JCheckBox jcbEmail;
    private javax.swing.JCheckBox jcbSms;
    private javax.swing.JFormattedTextField jftfData;
    private javax.swing.JLabel jlblIdade;
    private javax.swing.JLabel jlblNome;
    private javax.swing.JLabel jlblPeso;
    private javax.swing.JLabel jlblPrimeiroServico;
    private javax.swing.JLabel jlblSegundoServico;
    private javax.swing.JLabel jlblSexo;
    private javax.swing.JPanel jpanelAnimal;
    private javax.swing.JPanel jpanelFundo;
    private javax.swing.JPanel jpanelServicos;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JRadioButton jrbFemea;
    private javax.swing.JRadioButton jrbMacho;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPeso;
    private javax.swing.JTextField jtfPrimeiroServico;
    private javax.swing.JTextField jtfSegundoServico;
    // End of variables declaration//GEN-END:variables
}
