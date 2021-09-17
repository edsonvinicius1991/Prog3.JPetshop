package org.femass.pnl;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.femass.dao.FornecedorDao;
import org.femass.model.CNPJ;
import org.femass.model.CPF;
import org.femass.model.Fornecedor;
import org.femass.model.Selecionar;
import org.femass.model.TipoCliente;
import org.femass.model.WebServiceCep;



public class PnlFornecedor extends javax.swing.JPanel {
    
    
    private boolean alterando;
    private Fornecedor fornecedor;
    
    
    public PnlFornecedor() {
        initComponents();
        
        try{
            LstFornecedores.setListData(new FornecedorDao().getFornecedor().toArray());
        }catch(SQLException e){
            Logger.getLogger(PnlFornecedor.class.getName()).log(Level.SEVERE, null, e);
        }
        preencherComboTipoCliente();
    }
    
    private void preencherComboTipoCliente(){
        for(TipoCliente tipoCliente: TipoCliente.values()){
            CbolTipoCliente.addItem(tipoCliente);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGravar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LblCod = new javax.swing.JLabel();
        TxtCodEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CbolTipoCliente = new javax.swing.JComboBox();
        LblDataCadastro = new javax.swing.JLabel();
        TxtCpfCnpj = new javax.swing.JFormattedTextField();
        LblCpfCnpj = new javax.swing.JLabel();
        TxtNomeNomeFantasia = new javax.swing.JTextField();
        LblNomeNomeFantasia = new javax.swing.JLabel();
        LblRazaoSocial = new javax.swing.JLabel();
        TxtRazaoSocial = new javax.swing.JTextField();
        LblNomeContato = new javax.swing.JLabel();
        TxtNomeContato = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        LblTelFixo = new javax.swing.JLabel();
        TxtTelFixo = new javax.swing.JFormattedTextField();
        LblTelCel = new javax.swing.JLabel();
        TxtTelCelular = new javax.swing.JFormattedTextField();
        TxtDataCadastro = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        LblCep = new javax.swing.JLabel();
        TxtCep = new javax.swing.JFormattedTextField();
        LblEndereco = new javax.swing.JLabel();
        TxtEndereco = new javax.swing.JTextField();
        LblNumEnd = new javax.swing.JLabel();
        TxtNumEnd = new javax.swing.JTextField();
        BtnBuscarCep = new javax.swing.JButton();
        LblBairro = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        LblComplemento = new javax.swing.JLabel();
        TxtComplemento = new javax.swing.JTextField();
        LblCidade = new javax.swing.JLabel();
        TxtCidade = new javax.swing.JTextField();
        LblUf = new javax.swing.JLabel();
        TxtUf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstFornecedores = new javax.swing.JList();
        BtnAlterar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnInserir = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        BtnGravar.setText("Gravar");
        BtnGravar.setEnabled(false);
        BtnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGravarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cadastrais"));

        LblCod.setText("ID");

        TxtCodEmpresa.setEditable(false);

        jLabel2.setText("Tipo");

        CbolTipoCliente.setEnabled(false);
        CbolTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbolTipoClienteActionPerformed(evt);
            }
        });

        LblDataCadastro.setText("Data do Cadastro");

        TxtCpfCnpj.setEditable(false);

        LblCpfCnpj.setText("CPF / CNPJ");

        TxtNomeNomeFantasia.setEditable(false);

        LblNomeNomeFantasia.setText("Nome / Nome Fantasia");

        LblRazaoSocial.setText("Razão Social");

        TxtRazaoSocial.setEditable(false);

        LblNomeContato.setText("Nome do Contato");

        TxtNomeContato.setEditable(false);

        LblEmail.setText("Email");

        TxtEmail.setEditable(false);

        LblTelFixo.setText("Telefone Fixo");

        TxtTelFixo.setEditable(false);
        try {
            TxtTelFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LblTelCel.setText("Telefone Celular");

        TxtTelCelular.setEditable(false);
        try {
            TxtTelCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TxtDataCadastro.setEditable(false);
        try {
            TxtDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNomeContato)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(TxtNomeContato, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(LblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblTelFixo)
                                    .addComponent(LblTelCel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TxtTelFixo)
                            .addComponent(TxtTelCelular)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblNomeNomeFantasia)
                        .addComponent(LblRazaoSocial)
                        .addComponent(TxtRazaoSocial)
                        .addComponent(TxtNomeNomeFantasia)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblCod)
                                .addComponent(TxtCodEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(CbolTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblDataCadastro)
                                .addComponent(TxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblCpfCnpj)
                                .addComponent(TxtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LblDataCadastro)
                            .addComponent(LblCpfCnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbolTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCodEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblNomeNomeFantasia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNomeNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblRazaoSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNomeContato)
                    .addComponent(LblTelFixo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtTelFixo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEmail)
                    .addComponent(LblTelCel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtTelCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        LblCep.setText("CEP");

        TxtCep.setEditable(false);
        try {
            TxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LblEndereco.setText("Endereço");

        TxtEndereco.setEditable(false);

        LblNumEnd.setText("Número");

        TxtNumEnd.setEditable(false);

        BtnBuscarCep.setText("Buscar");
        BtnBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarCepActionPerformed(evt);
            }
        });

        LblBairro.setText("Bairro");

        TxtBairro.setEditable(false);

        LblComplemento.setText("Complemento");

        TxtComplemento.setEditable(false);

        LblCidade.setText("Cidade");

        TxtCidade.setEditable(false);

        LblUf.setText("UF");

        TxtUf.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCep)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBuscarCep)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblEndereco)
                            .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNumEnd)
                            .addComponent(TxtNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblBairro)
                            .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCidade)
                            .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LblUf)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TxtUf))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblComplemento)
                    .addComponent(TxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEndereco)
                            .addComponent(LblCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnBuscarCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNumEnd)
                            .addComponent(LblComplemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEndereco)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LblUf)
                        .addGap(30, 30, 30)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        LstFornecedores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LstFornecedoresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LstFornecedores);

        BtnAlterar.setText("Alterar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnInserir.setText("Inserir Novo");
        BtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInserirActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 27, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGravar)
                    .addComponent(BtnAlterar)
                    .addComponent(BtnExcluir)
                    .addComponent(BtnInserir)
                    .addComponent(BtnCancelar))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarCepActionPerformed
        //Faz a busca para o cep 58043-280
        WebServiceCep webServiceCep = WebServiceCep.searchCep(TxtCep.getText());
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.

        //caso a busca ocorra bem, imprime os resultados.
        if (webServiceCep.wasSuccessful()) {
            TxtEndereco.setText(webServiceCep.getLogradouroFull());
            TxtCidade.setText(webServiceCep.getCidade());
            TxtBairro.setText(webServiceCep.getBairro());
            TxtUf.setText(webServiceCep.getUf());
            //caso haja problemas imprime as exce??es.
        }
        else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
        }
    }//GEN-LAST:event_BtnBuscarCepActionPerformed

    private void CbolTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbolTipoClienteActionPerformed

        int tipoDoc = CbolTipoCliente.getSelectedIndex();
        TxtCpfCnpj.setValue(null);
        switch(tipoDoc){
            case 0:
            TxtCpfCnpj.setFormatterFactory(Selecionar.getFormat());
            break;
            case 1:
            TxtCpfCnpj.setFormatterFactory(CPF.getFormat());
            break;
            case 2:
            TxtCpfCnpj.setFormatterFactory(CNPJ.getFormat());
            break;
        }
       
    }//GEN-LAST:event_CbolTipoClienteActionPerformed

    private void BtnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGravarActionPerformed
        fornecedor.setTipoCliente((TipoCliente) CbolTipoCliente.getSelectedItem());
        fornecedor.setDataCadastro(TxtDataCadastro.getText());
        fornecedor.setCpfCnpj(TxtCpfCnpj.getText());
        fornecedor.setFantasia(TxtNomeNomeFantasia.getText());
        fornecedor.setRazaoSocial(TxtRazaoSocial.getText());
        fornecedor.setNomeContato(TxtNomeContato.getText());
        fornecedor.setTelFixo(TxtTelFixo.getText());
        fornecedor.setTelCelular(TxtTelCelular.getText());
        fornecedor.setEmailFornecedor(TxtEmail.getText());
        fornecedor.setCepFornecedor(TxtCep.getText());
        fornecedor.setLogradouro(TxtEndereco.getText());
        fornecedor.setNumeroLogradouro(TxtNumEnd.getText());
        fornecedor.setComplemento(TxtComplemento.getText());
        fornecedor.setBairro(TxtBairro.getText());
        fornecedor.setCidade(TxtCidade.getText());
        fornecedor.setTipoUf(TxtUf.getText());


        try {
            if(alterando){
                new FornecedorDao().alterar(fornecedor);
            }else{
                new FornecedorDao().gravar(fornecedor);
                TxtCodEmpresa.setText(fornecedor.getIdFornecedor().toString());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            LstFornecedores.setListData(new FornecedorDao().getFornecedor().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(PnlFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        desabilitarTela();
    }//GEN-LAST:event_BtnGravarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir o Registro?","Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
            Fornecedor fornecedor = (Fornecedor)LstFornecedores.getSelectedValue();
            try {
                new FornecedorDao().excluir(fornecedor);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            try {
                LstFornecedores.setListData(new FornecedorDao().getFornecedor().toArray());
            } catch (SQLException ex) {
                Logger.getLogger(PnlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            limparTela();
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void LstFornecedoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LstFornecedoresValueChanged
        if(!LstFornecedores.isSelectionEmpty()){
            Fornecedor fornecedor = (Fornecedor)LstFornecedores.getSelectedValue();
            TxtCodEmpresa.setText(fornecedor.getIdFornecedor().toString());
            CbolTipoCliente.setSelectedItem(fornecedor.getTipoCliente());
            TxtDataCadastro.setText(fornecedor.getDataCadastro());
            TxtCpfCnpj.setText(fornecedor.getCpfCnpj());
            TxtNomeNomeFantasia.setText(fornecedor.getFantasia());
            TxtRazaoSocial.setText(fornecedor.getRazaoSocial());
            TxtNomeContato.setText(fornecedor.getNomeContato());
            TxtTelFixo.setText(fornecedor.getTelFixo());
            TxtTelCelular.setText(fornecedor.getTelCelular());
            TxtEmail.setText(fornecedor.getEmailFornecedor());
            TxtCep.setText(fornecedor.getCepFornecedor());
            TxtEndereco.setText(fornecedor.getLogradouro());
            TxtNumEnd.setText (fornecedor.getNumeroLogradouro().toString());
            TxtComplemento.setText(fornecedor.getComplemento());
            TxtBairro.setText(fornecedor.getBairro());
            TxtCidade.setText(fornecedor.getCidade());
            TxtUf.setText(fornecedor.getTipoUf());
          
        }
    }//GEN-LAST:event_LstFornecedoresValueChanged

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        if(!LstFornecedores.isSelectionEmpty()){
            this.fornecedor = (Fornecedor) LstFornecedores.getSelectedValue();
            alterando = true;
            habilitarTela();
            TxtRazaoSocial.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        }
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInserirActionPerformed
        this.fornecedor = new Fornecedor();
        alterando = false;
        habilitarTela();
        TxtRazaoSocial.requestFocus();
        limparTela();
    }//GEN-LAST:event_BtnInserirActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        desabilitarTela();
        limparTela();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    
     private void habilitarTela(){
        CbolTipoCliente.setEnabled(true);
        TxtDataCadastro.setEditable(true);
        TxtCpfCnpj.setEditable(true);
        TxtNomeNomeFantasia.setEditable(true);
        TxtRazaoSocial.setEditable(true);
        TxtNomeContato.setEditable(true);
        TxtTelFixo.setEditable(true);
        TxtTelCelular.setEditable(true);
        TxtEmail.setEditable(true);
        TxtCep.setEditable(true);
        TxtEndereco.setEditable(true);
        TxtNumEnd.setEditable(true);
        TxtComplemento.setEditable(true);
        TxtBairro.setEditable(true);
        TxtCidade.setEditable(true);
        TxtUf.setEditable(true);
        
        BtnAlterar.setEnabled(false);
        BtnCancelar.setEnabled(true);
        BtnExcluir.setEnabled(false);
        BtnGravar.setEnabled(true);
        BtnInserir.setEnabled(false);
        LstFornecedores.setEnabled(false); 
        
    }
    
    private void desabilitarTela(){
        CbolTipoCliente.setEnabled(false);
        TxtDataCadastro.setEditable(false);
        TxtCpfCnpj.setEditable(false);
        TxtNomeNomeFantasia.setEditable(false);
        TxtRazaoSocial.setEditable(false);
        TxtNomeContato.setEditable(false);
        TxtTelFixo.setEditable(false);
        TxtTelCelular.setEditable(false);
        TxtEmail.setEditable(false);
        TxtCep.setEditable(false);
        TxtEndereco.setEditable(false);
        TxtNumEnd.setEditable(false);
        TxtComplemento.setEditable(false);
        TxtBairro.setEditable(false);
        TxtCidade.setEditable(false);
        TxtUf.setEditable(false);
        
        BtnAlterar.setEnabled(true);
        BtnCancelar.setEnabled(false);
        BtnExcluir.setEnabled(true);
        BtnGravar.setEnabled(false);
        BtnInserir.setEnabled(true);
        LstFornecedores.setEnabled(true); 
        

    }
    
    private void limparTela(){

        CbolTipoCliente.setSelectedItem("Selecionar");
        TxtDataCadastro.setText("");
        TxtCpfCnpj.setText("");
        TxtNomeNomeFantasia.setText("");
        TxtRazaoSocial.setText("");
        TxtNomeContato.setText("");
        TxtTelFixo.setText("");
        TxtTelCelular.setText("");
        TxtEmail.setText("");
        TxtCep.setText("");
        TxtEndereco.setText("");
        TxtNumEnd.setText("");
        TxtComplemento.setText("");
        TxtBairro.setText("");
        TxtCidade.setText("");
        TxtUf.setText("");
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnBuscarCep;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnGravar;
    private javax.swing.JButton BtnInserir;
    private javax.swing.JComboBox CbolTipoCliente;
    private javax.swing.JLabel LblBairro;
    private javax.swing.JLabel LblCep;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblCod;
    private javax.swing.JLabel LblComplemento;
    private javax.swing.JLabel LblCpfCnpj;
    private javax.swing.JLabel LblDataCadastro;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblEndereco;
    private javax.swing.JLabel LblNomeContato;
    private javax.swing.JLabel LblNomeNomeFantasia;
    private javax.swing.JLabel LblNumEnd;
    private javax.swing.JLabel LblRazaoSocial;
    private javax.swing.JLabel LblTelCel;
    private javax.swing.JLabel LblTelFixo;
    private javax.swing.JLabel LblUf;
    private javax.swing.JList LstFornecedores;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JFormattedTextField TxtCep;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtCodEmpresa;
    private javax.swing.JTextField TxtComplemento;
    private javax.swing.JFormattedTextField TxtCpfCnpj;
    private javax.swing.JFormattedTextField TxtDataCadastro;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JTextField TxtNomeContato;
    private javax.swing.JTextField TxtNomeNomeFantasia;
    private javax.swing.JTextField TxtNumEnd;
    private javax.swing.JTextField TxtRazaoSocial;
    private javax.swing.JFormattedTextField TxtTelCelular;
    private javax.swing.JFormattedTextField TxtTelFixo;
    private javax.swing.JTextField TxtUf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
