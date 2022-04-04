/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.LimitadorCaracteres;
import controller.LimitadorNumeros;
import controller.LimitadorTexto;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author Daniel Caumo
 */
public class GUICadastrarAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadastrar
     */
    public GUICadastrarAluno() {
        initComponents();
        jtfNome.setDocument(new LimitadorCaracteres(30));
        jtfLogradouro.setDocument(new LimitadorCaracteres(40));
        jtfNumero.setDocument(new LimitadorNumeros(5));
        jtfComplemento.setDocument(new LimitadorNumeros(15));
        jtfCidade.setDocument(new LimitadorCaracteres(15));
        jtaObservacoes.setDocument(new LimitadorTexto(130));
    }
    
    public void cadastrar(){
        Aluno a = new Aluno();
        a.setNome(jtfNome.getText());
        a.setCep(jftfCep.getText());
        a.setLogradouro(jtfLogradouro.getText());
        a.setNumero(jtfNumero.getText());
        a.setComplemento(jtfComplemento.getText());
        a.setCidade(jtfCidade.getText());
        if(jcomboboxEstado.getSelectedIndex()==1){
            a.setEstado("Acre");
        }else if(jcomboboxEstado.getSelectedIndex()==2){
            a.setEstado("Alagoas");
        }else if(jcomboboxEstado.getSelectedIndex()==3){
            a.setEstado("Amapá");
        }else if(jcomboboxEstado.getSelectedIndex()==4){
            a.setEstado("Amazonas");
        }else if(jcomboboxEstado.getSelectedIndex()==5){
            a.setEstado("Bahia");
        }else if(jcomboboxEstado.getSelectedIndex()==6){
            a.setEstado("Ceará");
        }else if(jcomboboxEstado.getSelectedIndex()==7){
            a.setEstado("Distrito Federal");
        }else if(jcomboboxEstado.getSelectedIndex()==8){
            a.setEstado("Espírito Santo");
        }else if(jcomboboxEstado.getSelectedIndex()==9){
            a.setEstado("Goiás");
        }else if(jcomboboxEstado.getSelectedIndex()==10){
            a.setEstado("Maranhão");
        }else if(jcomboboxEstado.getSelectedIndex()==11){
            a.setEstado("Mato Grosso");
        }else if(jcomboboxEstado.getSelectedIndex()==12){
            a.setEstado("Mato Grosso do Sul");
        }else if(jcomboboxEstado.getSelectedIndex()==13){
            a.setEstado("Minas Gerais");
        }else if(jcomboboxEstado.getSelectedIndex()==14){
            a.setEstado("Pará");
        }else if(jcomboboxEstado.getSelectedIndex()==15){
            a.setEstado("Paraíba");
        }else if(jcomboboxEstado.getSelectedIndex()==16){
            a.setEstado("Paraná");
        }else if(jcomboboxEstado.getSelectedIndex()==17){
            a.setEstado("Pernambuco");
        }else if(jcomboboxEstado.getSelectedIndex()==18){
            a.setEstado("Piauí");
        }else if(jcomboboxEstado.getSelectedIndex()==19){
            a.setEstado("Rio de Janeiro");
        }else if(jcomboboxEstado.getSelectedIndex()==20){
            a.setEstado("Rio Grande do Norte");
        }else if(jcomboboxEstado.getSelectedIndex()==21){
            a.setEstado("Rio Grande do Sul");
        }else if(jcomboboxEstado.getSelectedIndex()==22){
            a.setEstado("Rondônia");
        }else if(jcomboboxEstado.getSelectedIndex()==23){
            a.setEstado("Roraima");
        }else if(jcomboboxEstado.getSelectedIndex()==24){
            a.setEstado("Santa Catarina");
        }else if(jcomboboxEstado.getSelectedIndex()==25){
            a.setEstado("São Paulo");
        }else if(jcomboboxEstado.getSelectedIndex()==26){
            a.setEstado("Sergipe");
        }else if(jcomboboxEstado.getSelectedIndex()==27){
            a.setEstado("Tocatins");
        }
        if(jcbSistemas.isSelected()){
            a.adicionar(jcbSistemas.getActionCommand());
        }
        if(jcbInformatica.isSelected()){
            a.adicionar(jcbInformatica.getActionCommand());
        }
        if(jcbRedes.isSelected()){
            a.adicionar(jcbRedes.getActionCommand());
        }
        a.setObservacao(jtaObservacoes.getText());
        JOptionPane.showMessageDialog(null,a,"Cadastro de Aluno",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void cancelar(){
        jtfNome.setText(null);
        jftfCep.setText(null);
        jtfLogradouro.setText(null);
        jtfNumero.setText(null);
        jtfComplemento.setText(null);
        jtfCidade.setText(null);
        jcomboboxEstado.setSelectedIndex(0);        
        jcbSistemas.setSelected(false);
        jcbInformatica.setSelected(false);
        jcbRedes.setSelected(false);
        jtaObservacoes.setText(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFundo1 = new javax.swing.JPanel();
        jlblNome1 = new javax.swing.JLabel();
        jlblEndereco1 = new javax.swing.JLabel();
        jlblCidade1 = new javax.swing.JLabel();
        jlblEstado1 = new javax.swing.JLabel();
        jlblCursos1 = new javax.swing.JLabel();
        jlblEndereco2 = new javax.swing.JLabel();
        jlblNúmero1 = new javax.swing.JLabel();
        jspObservacoes = new javax.swing.JScrollPane();
        jpanelFundo = new javax.swing.JPanel();
        jpanelAluno = new javax.swing.JPanel();
        jlblNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jsSeparadorEndereco = new javax.swing.JSeparator();
        jlblEndereco = new javax.swing.JLabel();
        jlblCep = new javax.swing.JLabel();
        jftfCep = new javax.swing.JFormattedTextField();
        jlblLogradouro = new javax.swing.JLabel();
        jtfLogradouro = new javax.swing.JTextField();
        jlblNumero = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jlblComplemento = new javax.swing.JLabel();
        jtfComplemento = new javax.swing.JTextField();
        jlblCidade = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jlblEstado = new javax.swing.JLabel();
        jcomboboxEstado = new javax.swing.JComboBox<>();
        jpanelCurso = new javax.swing.JPanel();
        jcbSistemas = new javax.swing.JCheckBox();
        jcbInformatica = new javax.swing.JCheckBox();
        jcbRedes = new javax.swing.JCheckBox();
        jpanelObservacoes = new javax.swing.JPanel();
        jtaObservacoes = new javax.swing.JTextArea();
        jbtnCadastrar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();

        jpanelFundo1.setBackground(new java.awt.Color(175, 225, 225));

        jlblNome1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblNome1.setText("Nome:");

        jlblEndereco1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblEndereco1.setText("Endereço:");

        jlblCidade1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblCidade1.setText("Cidade:");

        jlblEstado1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblEstado1.setText("Estado:");

        jlblCursos1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblCursos1.setText("Cursos matriculados:");

        javax.swing.GroupLayout jpanelFundo1Layout = new javax.swing.GroupLayout(jpanelFundo1);
        jpanelFundo1.setLayout(jpanelFundo1Layout);
        jpanelFundo1Layout.setHorizontalGroup(
            jpanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundo1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCursos1)
                    .addComponent(jlblEstado1)
                    .addComponent(jlblCidade1)
                    .addComponent(jlblEndereco1)
                    .addComponent(jlblNome1))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jpanelFundo1Layout.setVerticalGroup(
            jpanelFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundo1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jlblNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblEndereco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCidade1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblEstado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCursos1)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jlblEndereco2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblEndereco2.setText("Endereço:");

        jlblNúmero1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblNúmero1.setText("Número:");

        setPreferredSize(new java.awt.Dimension(430, 560));

        jpanelFundo.setBackground(new java.awt.Color(175, 225, 225));
        jpanelFundo.setPreferredSize(new java.awt.Dimension(425, 560));

        jpanelAluno.setBackground(new java.awt.Color(175, 225, 225));
        jpanelAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jpanelAluno.setPreferredSize(new java.awt.Dimension(400, 250));

        jlblNome.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblNome.setForeground(new java.awt.Color(0, 102, 102));
        jlblNome.setText("Nome:");

        jlblEndereco.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblEndereco.setForeground(new java.awt.Color(0, 102, 102));
        jlblEndereco.setText("Endereço:");

        jlblCep.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblCep.setForeground(new java.awt.Color(0, 102, 102));
        jlblCep.setText("CEP:");

        try {
            jftfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlblLogradouro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblLogradouro.setForeground(new java.awt.Color(0, 102, 102));
        jlblLogradouro.setText("Logradouro:");

        jlblNumero.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblNumero.setForeground(new java.awt.Color(0, 102, 102));
        jlblNumero.setText("Número:");

        jlblComplemento.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblComplemento.setForeground(new java.awt.Color(0, 102, 102));
        jlblComplemento.setText("Complemento:");

        jlblCidade.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblCidade.setForeground(new java.awt.Color(0, 102, 102));
        jlblCidade.setText("Cidade:");

        jlblEstado.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jlblEstado.setForeground(new java.awt.Color(0, 102, 102));
        jlblEstado.setText("Estado:");

        jcomboboxEstado.setBackground(new java.awt.Color(175, 225, 225));
        jcomboboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jpanelAlunoLayout = new javax.swing.GroupLayout(jpanelAluno);
        jpanelAluno.setLayout(jpanelAlunoLayout);
        jpanelAlunoLayout.setHorizontalGroup(
            jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsSeparadorEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelAlunoLayout.createSequentialGroup()
                        .addComponent(jlblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome))
                    .addGroup(jpanelAlunoLayout.createSequentialGroup()
                        .addComponent(jlblLogradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfLogradouro))
                    .addGroup(jpanelAlunoLayout.createSequentialGroup()
                        .addComponent(jlblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfComplemento))
                    .addGroup(jpanelAlunoLayout.createSequentialGroup()
                        .addComponent(jlblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelAlunoLayout.createSequentialGroup()
                        .addComponent(jlblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpanelAlunoLayout.setVerticalGroup(
            jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsSeparadorEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEndereco)
                    .addComponent(jftfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblLogradouro)
                    .addComponent(jtfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNumero)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblComplemento)
                    .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCidade)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblEstado)
                    .addComponent(jcomboboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jpanelCurso.setBackground(new java.awt.Color(175, 225, 225));
        jpanelCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cursos matriculados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jpanelCurso.setPreferredSize(new java.awt.Dimension(400, 120));
        jpanelCurso.setRequestFocusEnabled(false);

        jcbSistemas.setBackground(new java.awt.Color(175, 225, 225));
        jcbSistemas.setForeground(new java.awt.Color(0, 102, 102));
        jcbSistemas.setText("Técnico em Desenvolvimento de Sistemas");
        jcbSistemas.setActionCommand("Técnico em Desenvolvimento de Sistemas");

        jcbInformatica.setBackground(new java.awt.Color(175, 225, 225));
        jcbInformatica.setForeground(new java.awt.Color(0, 102, 102));
        jcbInformatica.setText("Técnico em Informática");
        jcbInformatica.setActionCommand("Técnico em Informática");

        jcbRedes.setBackground(new java.awt.Color(175, 225, 225));
        jcbRedes.setForeground(new java.awt.Color(0, 102, 102));
        jcbRedes.setText("Técnico em Redes");
        jcbRedes.setActionCommand("Técnico em Redes");

        javax.swing.GroupLayout jpanelCursoLayout = new javax.swing.GroupLayout(jpanelCurso);
        jpanelCurso.setLayout(jpanelCursoLayout);
        jpanelCursoLayout.setHorizontalGroup(
            jpanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbSistemas, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(jcbInformatica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbRedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanelCursoLayout.setVerticalGroup(
            jpanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelCursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbSistemas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbInformatica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRedes)
                .addContainerGap())
        );

        jpanelObservacoes.setBackground(new java.awt.Color(175, 225, 225));
        jpanelObservacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jpanelObservacoes.setPreferredSize(new java.awt.Dimension(400, 100));

        jtaObservacoes.setColumns(20);
        jtaObservacoes.setLineWrap(true);
        jtaObservacoes.setRows(5);
        jtaObservacoes.setPreferredSize(new java.awt.Dimension(220, 28));

        javax.swing.GroupLayout jpanelObservacoesLayout = new javax.swing.GroupLayout(jpanelObservacoes);
        jpanelObservacoes.setLayout(jpanelObservacoesLayout);
        jpanelObservacoesLayout.setHorizontalGroup(
            jpanelObservacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtaObservacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        jpanelObservacoesLayout.setVerticalGroup(
            jpanelObservacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelObservacoesLayout.createSequentialGroup()
                .addComponent(jtaObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jbtnCadastrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jbtnCadastrar.setForeground(new java.awt.Color(0, 102, 102));
        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.setPreferredSize(new java.awt.Dimension(100, 25));
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        jbtnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jbtnCancelar.setForeground(new java.awt.Color(0, 102, 102));
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setPreferredSize(new java.awt.Dimension(100, 25));
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnSair.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jbtnSair.setForeground(new java.awt.Color(0, 102, 102));
        jbtnSair.setText("Sair");
        jbtnSair.setPreferredSize(new java.awt.Dimension(100, 25));
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelFundoLayout = new javax.swing.GroupLayout(jpanelFundo);
        jpanelFundo.setLayout(jpanelFundoLayout);
        jpanelFundoLayout.setHorizontalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jpanelFundoLayout.setVerticalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JCheckBox jcbInformatica;
    private javax.swing.JCheckBox jcbRedes;
    private javax.swing.JCheckBox jcbSistemas;
    private javax.swing.JComboBox<String> jcomboboxEstado;
    private javax.swing.JFormattedTextField jftfCep;
    private javax.swing.JLabel jlblCep;
    private javax.swing.JLabel jlblCidade;
    private javax.swing.JLabel jlblCidade1;
    private javax.swing.JLabel jlblComplemento;
    private javax.swing.JLabel jlblCursos1;
    private javax.swing.JLabel jlblEndereco;
    private javax.swing.JLabel jlblEndereco1;
    private javax.swing.JLabel jlblEndereco2;
    private javax.swing.JLabel jlblEstado;
    private javax.swing.JLabel jlblEstado1;
    private javax.swing.JLabel jlblLogradouro;
    private javax.swing.JLabel jlblNome;
    private javax.swing.JLabel jlblNome1;
    private javax.swing.JLabel jlblNumero;
    private javax.swing.JLabel jlblNúmero1;
    private javax.swing.JPanel jpanelAluno;
    private javax.swing.JPanel jpanelCurso;
    private javax.swing.JPanel jpanelFundo;
    private javax.swing.JPanel jpanelFundo1;
    private javax.swing.JPanel jpanelObservacoes;
    private javax.swing.JSeparator jsSeparadorEndereco;
    private javax.swing.JScrollPane jspObservacoes;
    private javax.swing.JTextArea jtaObservacoes;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfLogradouro;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    // End of variables declaration//GEN-END:variables
}
