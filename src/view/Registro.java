package view;

import dao.AdicionaUsuario;
import java.awt.Color;
import static java.awt.Color.white;
import java.io.IOException;
import model.Ataque;
import model.Classe;
import model.Usuario;
import service.Objetos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Personagem;
import org.json.JSONObject;
import service.Jsons;
import service.ReceberId;
import service.ValidaUsuario;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        Color transparente = new Color(0,0,0,0);
        txtSenha.setVisible(false);
        imgOlhoFechado.setVisible(false);
        pnlRegistro.setBackground(new Color(0,0,0,200));
        rdoMago.setBackground(transparente);
        rdoGuerreiro.setBackground(transparente);
        rdoPaladino.setBackground(transparente);
        rdoEngenheiro.setBackground(transparente);
        imgAlerta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        imgOlho = new javax.swing.JLabel();
        imgOlhoFechado = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        rdoMago = new javax.swing.JRadioButton();
        lblClasse = new javax.swing.JLabel();
        imgClasse = new javax.swing.JLabel();
        rdoEngenheiro = new javax.swing.JRadioButton();
        rdoGuerreiro = new javax.swing.JRadioButton();
        rdoPaladino = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblAtaque1 = new javax.swing.JLabel();
        lblAtaque2 = new javax.swing.JLabel();
        lblEspecial = new javax.swing.JLabel();
        lblDano1 = new javax.swing.JLabel();
        lblDano2 = new javax.swing.JLabel();
        lblDanoEspecial = new javax.swing.JLabel();
        lblGasto1 = new javax.swing.JLabel();
        lblGasto2 = new javax.swing.JLabel();
        lblGastoEspecial = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblVida = new javax.swing.JLabel();
        lblGasto = new javax.swing.JLabel();
        lblDefesa = new javax.swing.JLabel();
        lblRegeneração = new javax.swing.JLabel();
        lblValorVida = new javax.swing.JLabel();
        lblValorGasto = new javax.swing.JLabel();
        lblValorDefesa = new javax.swing.JLabel();
        lblValorRegeneracao = new javax.swing.JLabel();
        imgAlerta = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de usuario");
        setPreferredSize(new java.awt.Dimension(1214, 805));
        setResizable(false);
        getContentPane().setLayout(null);

        pnlFundo.setPreferredSize(new java.awt.Dimension(1200, 900));
        pnlFundo.setLayout(null);

        pnlRegistro.setBackground(new java.awt.Color(51, 51, 51));
        pnlRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlRegistro.setLayout(null);

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconVoltarPreto.png"))); // NOI18N
        btnSair.setText("VOLTAR AO LOGIN");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnSair);
        btnSair.setBounds(840, 10, 160, 40);

        lblTitulo.setFont(new java.awt.Font("Goudy Old Style", 1, 55)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 153, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REGISTRO");
        lblTitulo.setToolTipText("");
        pnlRegistro.add(lblTitulo);
        lblTitulo.setBounds(0, 0, 1010, 80);

        lblUsuario.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("USUARIO");
        lblUsuario.setToolTipText("");
        pnlRegistro.add(lblUsuario);
        lblUsuario.setBounds(40, 120, 150, 40);

        txtUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtUsuario.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlRegistro.add(txtUsuario);
        txtUsuario.setBounds(190, 120, 230, 40);

        lblSenha.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(153, 153, 153));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("SENHA");
        lblSenha.setToolTipText("");
        pnlRegistro.add(lblSenha);
        lblSenha.setBounds(40, 180, 150, 40);

        txtSenha.setBackground(new java.awt.Color(153, 153, 153));
        txtSenha.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlRegistro.add(txtSenha);
        txtSenha.setBounds(190, 180, 230, 40);

        pwdSenha.setBackground(new java.awt.Color(153, 153, 153));
        pwdSenha.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        pwdSenha.setForeground(new java.awt.Color(0, 0, 0));
        pwdSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlRegistro.add(pwdSenha);
        pwdSenha.setBounds(190, 180, 230, 40);

        imgOlho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconOlho.png"))); // NOI18N
        imgOlho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgOlhoMousePressed(evt);
            }
        });
        pnlRegistro.add(imgOlho);
        imgOlho.setBounds(420, 180, 50, 40);

        imgOlhoFechado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgOlhoFechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconOlhoFechado.png"))); // NOI18N
        imgOlhoFechado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgOlhoFechadoMouseReleased(evt);
            }
        });
        pnlRegistro.add(imgOlhoFechado);
        imgOlhoFechado.setBounds(420, 180, 50, 40);

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrar.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconRegistro.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlRegistro.add(btnRegistrar);
        btnRegistrar.setBounds(110, 540, 260, 50);

        rdoMago.setFont(new java.awt.Font("Goudy Old Style", 1, 14)); // NOI18N
        rdoMago.setForeground(new java.awt.Color(153, 153, 153));
        rdoMago.setSelected(true);
        rdoMago.setText("MAGO");
        rdoMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdoMagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdoMagoMouseExited(evt);
            }
        });
        rdoMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMagoActionPerformed(evt);
            }
        });
        pnlRegistro.add(rdoMago);
        rdoMago.setBounds(60, 240, 70, 30);

        lblClasse.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lblClasse.setForeground(new java.awt.Color(153, 153, 153));
        lblClasse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClasse.setText("MAGO");
        pnlRegistro.add(lblClasse);
        lblClasse.setBounds(590, 90, 420, 50);

        imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/classeMago.png"))); // NOI18N
        pnlRegistro.add(imgClasse);
        imgClasse.setBounds(590, 140, 420, 320);

        rdoEngenheiro.setFont(new java.awt.Font("Goudy Old Style", 1, 14)); // NOI18N
        rdoEngenheiro.setForeground(new java.awt.Color(153, 153, 153));
        rdoEngenheiro.setText("ENGENHEIRO");
        rdoEngenheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdoEngenheiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdoEngenheiroMouseExited(evt);
            }
        });
        rdoEngenheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoEngenheiroActionPerformed(evt);
            }
        });
        pnlRegistro.add(rdoEngenheiro);
        rdoEngenheiro.setBounds(340, 240, 130, 30);

        rdoGuerreiro.setFont(new java.awt.Font("Goudy Old Style", 1, 14)); // NOI18N
        rdoGuerreiro.setForeground(new java.awt.Color(153, 153, 153));
        rdoGuerreiro.setText("GUERREIRO");
        rdoGuerreiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdoGuerreiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdoGuerreiroMouseExited(evt);
            }
        });
        rdoGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGuerreiroActionPerformed(evt);
            }
        });
        pnlRegistro.add(rdoGuerreiro);
        rdoGuerreiro.setBounds(130, 240, 110, 30);

        rdoPaladino.setFont(new java.awt.Font("Goudy Old Style", 1, 14)); // NOI18N
        rdoPaladino.setForeground(new java.awt.Color(153, 153, 153));
        rdoPaladino.setText("PALADINO");
        rdoPaladino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdoPaladinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdoPaladinoMouseExited(evt);
            }
        });
        rdoPaladino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoPaladinoActionPerformed(evt);
            }
        });
        pnlRegistro.add(rdoPaladino);
        rdoPaladino.setBounds(240, 240, 100, 30);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        lblAtaque1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblAtaque1.setForeground(new java.awt.Color(0, 0, 0));
        lblAtaque1.setText("ATAQUE 1:");
        jPanel2.add(lblAtaque1);
        lblAtaque1.setBounds(10, 20, 100, 30);

        lblAtaque2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblAtaque2.setForeground(new java.awt.Color(0, 0, 0));
        lblAtaque2.setText("ATAQUE 2:");
        jPanel2.add(lblAtaque2);
        lblAtaque2.setBounds(10, 60, 90, 30);

        lblEspecial.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblEspecial.setForeground(new java.awt.Color(0, 0, 0));
        lblEspecial.setText("ESPECIAL:");
        jPanel2.add(lblEspecial);
        lblEspecial.setBounds(10, 100, 80, 30);

        lblDano1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblDano1.setForeground(new java.awt.Color(0, 0, 0));
        lblDano1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDano1.setText("10");
        jPanel2.add(lblDano1);
        lblDano1.setBounds(100, 20, 30, 30);

        lblDano2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblDano2.setForeground(new java.awt.Color(0, 0, 0));
        lblDano2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDano2.setText("20");
        jPanel2.add(lblDano2);
        lblDano2.setBounds(100, 60, 30, 30);

        lblDanoEspecial.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblDanoEspecial.setForeground(new java.awt.Color(0, 0, 0));
        lblDanoEspecial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanoEspecial.setText("30");
        jPanel2.add(lblDanoEspecial);
        lblDanoEspecial.setBounds(100, 100, 30, 30);

        lblGasto1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblGasto1.setForeground(new java.awt.Color(0, 0, 0));
        lblGasto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGasto1.setText("5");
        jPanel2.add(lblGasto1);
        lblGasto1.setBounds(150, 20, 30, 30);

        lblGasto2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblGasto2.setForeground(new java.awt.Color(0, 0, 0));
        lblGasto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGasto2.setText("10");
        jPanel2.add(lblGasto2);
        lblGasto2.setBounds(150, 60, 30, 30);

        lblGastoEspecial.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblGastoEspecial.setForeground(new java.awt.Color(0, 0, 0));
        lblGastoEspecial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGastoEspecial.setText("15");
        jPanel2.add(lblGastoEspecial);
        lblGastoEspecial.setBounds(150, 100, 30, 30);

        jLabel19.setFont(new java.awt.Font("Book Antiqua", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("DANO:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(90, 0, 50, 20);

        jLabel20.setFont(new java.awt.Font("Book Antiqua", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("GASTO:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(150, 0, 50, 20);

        pnlRegistro.add(jPanel2);
        jPanel2.setBounds(800, 470, 200, 150);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        lblVida.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblVida.setForeground(new java.awt.Color(0, 0, 0));
        lblVida.setText("VIDA:");
        jPanel1.add(lblVida);
        lblVida.setBounds(10, 10, 60, 30);

        lblGasto.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblGasto.setForeground(new java.awt.Color(0, 0, 0));
        lblGasto.setText("MANA:");
        jPanel1.add(lblGasto);
        lblGasto.setBounds(10, 40, 90, 30);

        lblDefesa.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblDefesa.setForeground(new java.awt.Color(0, 0, 0));
        lblDefesa.setText("DEFESA:");
        jPanel1.add(lblDefesa);
        lblDefesa.setBounds(10, 70, 90, 30);

        lblRegeneração.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblRegeneração.setForeground(new java.awt.Color(0, 0, 0));
        lblRegeneração.setText("REGENERAÇÃO:");
        jPanel1.add(lblRegeneração);
        lblRegeneração.setBounds(10, 100, 130, 30);

        lblValorVida.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblValorVida.setForeground(new java.awt.Color(0, 0, 0));
        lblValorVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorVida.setText("100");
        jPanel1.add(lblValorVida);
        lblValorVida.setBounds(120, 10, 80, 20);

        lblValorGasto.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblValorGasto.setForeground(new java.awt.Color(0, 0, 0));
        lblValorGasto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorGasto.setText("120");
        jPanel1.add(lblValorGasto);
        lblValorGasto.setBounds(120, 40, 80, 20);

        lblValorDefesa.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblValorDefesa.setForeground(new java.awt.Color(0, 0, 0));
        lblValorDefesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorDefesa.setText("30");
        jPanel1.add(lblValorDefesa);
        lblValorDefesa.setBounds(120, 70, 80, 20);

        lblValorRegeneracao.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblValorRegeneracao.setForeground(new java.awt.Color(0, 0, 0));
        lblValorRegeneracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorRegeneracao.setText("60");
        jPanel1.add(lblValorRegeneracao);
        lblValorRegeneracao.setBounds(120, 100, 80, 20);

        pnlRegistro.add(jPanel1);
        jPanel1.setBounds(590, 470, 200, 150);

        imgAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconAlerta24x24.png"))); // NOI18N
        pnlRegistro.add(imgAlerta);
        imgAlerta.setBounds(420, 120, 50, 40);

        pnlFundo.add(pnlRegistro);
        pnlRegistro.setBounds(100, 80, 1010, 630);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundoRegistro.jpeg"))); // NOI18N
        pnlFundo.add(imgFundo);
        imgFundo.setBounds(0, 0, 1200, 800);

        getContentPane().add(pnlFundo);
        pnlFundo.setBounds(0, 0, 1200, 800);

        setSize(new java.awt.Dimension(1214, 805));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void antiBug(){
        pnlRegistro.setVisible(false);
        pnlRegistro.setVisible(true);
    }
    
    private void imgOlhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOlhoMousePressed
        String senha = pwdSenha.getText();
        pwdSenha.setVisible(false);
        txtSenha.setVisible(true);
        pnlRegistro.setVisible(false);
        pnlRegistro.setVisible(true);
        imgOlhoFechado.setVisible(true);
        imgOlho.setVisible(false);
        txtSenha.setText(senha);
    }//GEN-LAST:event_imgOlhoMousePressed

    private void imgOlhoFechadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOlhoFechadoMouseReleased
        String senha = txtSenha.getText();
        pwdSenha.setVisible(true);
        txtSenha.setVisible(false);
        pnlRegistro.setVisible(false);
        pnlRegistro.setVisible(true);
        imgOlhoFechado.setVisible(false);
        imgOlho.setVisible(true);
        pwdSenha.setText(senha);
    }//GEN-LAST:event_imgOlhoFechadoMouseReleased

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(white);
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
         btnRegistrar.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Declara as variaveis
        ReceberId receberId = new ReceberId();
        String senha = null;
        if (txtSenha.isVisible()){
            senha = txtSenha.getText();
        }else{
            senha = pwdSenha.getText();
        }
        int id = receberId.idUsuario();
        int idUsuario = id;
        String usuario = txtUsuario.getText();
        int nivel = 1;
        String classe = lblClasse.getText();
        int vida = Integer.parseInt(lblValorVida.getText());      
        int gasto = Integer.parseInt(lblValorGasto.getText());
        int defesa = Integer.parseInt(lblValorDefesa.getText());   
        int regeneracao = Integer.parseInt(lblValorRegeneracao.getText());   
        int dano1 = Integer.parseInt(lblDano1.getText()); 
        int dano2 = Integer.parseInt(lblDano2.getText()); 
        int dano3 = Integer.parseInt(lblDanoEspecial.getText()); 
        int gasto1 = Integer.parseInt(lblGasto1.getText()); 
        int gasto2 = Integer.parseInt(lblGasto2.getText()); 
        int gasto3 = Integer.parseInt(lblGastoEspecial.getText());
        
        //Defina os objetos
        Objetos objetos = new Objetos();
        Ataque atq1 = objetos.ataque1(dano1, gasto1);
        Ataque atq2 = objetos.ataque2(dano2, gasto2);
        Ataque atqEspecial = objetos.ataqueEspecial(dano3, gasto3);
        Personagem personagem = objetos.personagem(vida, gasto, defesa, regeneracao, atq1, atq2, atqEspecial, idUsuario);
        Classe newClasse = objetos.classe(classe, personagem);
        Usuario user = objetos.usuario(id, usuario, senha, nivel, newClasse);
        
        ValidaUsuario validar = new ValidaUsuario();
        String consulta = usuario;
        boolean validarNome = validar.validaNome(consulta);
        if(!usuario.isEmpty() || !senha.isEmpty()){
            if(senha.length() >= 8){
                if(validarNome == false){
                    AdicionaUsuario add = new AdicionaUsuario();
                    Jsons retorno = new Jsons();
                    JSONObject jsonUsuario = retorno.jsonUsuario(user, newClasse, personagem, atq1, atq2, atqEspecial);
                    try {
                        add.newUsuario(jsonUsuario);
                        dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("nooop");
                    }
                }else{
                    imgAlerta.setVisible(true);
                    antiBug();
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    pwdSenha.setText("");
                    txtUsuario.setBackground(new Color(255, 171, 171));
                    JOptionPane.showMessageDialog(null, "Usuário já existente, tente outro nome.");
                    txtUsuario.requestFocus();
                }
            }else{
                txtSenha.setText("");
                pwdSenha.setText("");
                txtSenha.setBackground(new Color(255, 171, 171));
                pwdSenha.setBackground(new Color(255, 171, 171));
                JOptionPane.showMessageDialog(null,"A senha deve ter mais de 8 caracteres.");
                if(txtSenha.isVisible()){
                    txtSenha.requestFocus();
                }else{
                    pwdSenha.requestFocus();
                }
            }
        }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                imgAlerta.setVisible(true);
                    antiBug();
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    pwdSenha.setText("");
                    txtUsuario.setBackground(new Color(255, 171, 171));
                    txtSenha.setBackground(new Color(255, 171, 171));
                    pwdSenha.setBackground(new Color(255, 171, 171));
                    txtUsuario.requestFocus();
        }
        
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void rdoMagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoMagoMouseEntered
        antiBug();
    }//GEN-LAST:event_rdoMagoMouseEntered

    private void rdoEngenheiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoEngenheiroMouseEntered
        antiBug();
    }//GEN-LAST:event_rdoEngenheiroMouseEntered

    private void rdoGuerreiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoGuerreiroMouseEntered
        antiBug();
    }//GEN-LAST:event_rdoGuerreiroMouseEntered

    private void rdoPaladinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoPaladinoMouseEntered
        antiBug();
    }//GEN-LAST:event_rdoPaladinoMouseEntered

    private void rdoMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMagoActionPerformed
        antiBug();
        rdoGuerreiro.setSelected(false);
        rdoPaladino.setSelected(false);
        rdoEngenheiro.setSelected(false);
        
        lblClasse.setText("MAGO");
        imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/classeMago.png")));
        lblGasto.setText("MANA");
        lblValorVida.setText("100");
        lblValorGasto.setText("120");
        lblValorDefesa.setText("30");
        lblValorRegeneracao.setText("60");
        lblDano1.setText("10");
        lblDano2.setText("20");
        lblDanoEspecial.setText("30");
        lblGasto1.setText("5");
        lblGasto2.setText("10");
        lblGastoEspecial.setText("15");
        
    }//GEN-LAST:event_rdoMagoActionPerformed

    private void rdoGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGuerreiroActionPerformed
        antiBug();
        rdoMago.setSelected(false);
        rdoPaladino.setSelected(false);
        rdoMago.setSelected(false);
        String imagem = "imagens.personagens.classeGuerreiro.png";
        
        lblClasse.setText("GUERREIRO");
        imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/classeGuerreiro.png")));
        lblGasto.setText("ESTAMINA");
        lblValorVida.setText("120");
        lblValorGasto.setText("100");
        lblValorDefesa.setText("60");
        lblValorRegeneracao.setText("30");
        lblDano1.setText("20");
        lblDano2.setText("30");
        lblDanoEspecial.setText("45");
        lblGasto1.setText("15");
        lblGasto2.setText("20");
        lblGastoEspecial.setText("35");
    }//GEN-LAST:event_rdoGuerreiroActionPerformed

    private void rdoPaladinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoPaladinoActionPerformed
        antiBug();
        rdoGuerreiro.setSelected(false);
        rdoMago.setSelected(false);
        rdoEngenheiro.setSelected(false);
        
        lblClasse.setText("PALADINO");
        imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/classePaladino.png")));
        lblGasto.setText("MANA");
        lblValorVida.setText("60");
        lblValorGasto.setText("100");
        lblValorDefesa.setText("30");
        lblValorRegeneracao.setText("120");
        lblDano1.setText("12");
        lblDano2.setText("24");
        lblDanoEspecial.setText("36");
        lblGasto1.setText("10");
        lblGasto2.setText("15");
        lblGastoEspecial.setText("30");
    }//GEN-LAST:event_rdoPaladinoActionPerformed

    private void rdoEngenheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoEngenheiroActionPerformed
        antiBug();
        rdoGuerreiro.setSelected(false);
        rdoPaladino.setSelected(false);
        rdoMago.setSelected(false);
        
        lblClasse.setText("ENGENHEIRO");
        imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/classeEngenheiro.png")));
        lblGasto.setText("ESTAMINA");
        lblValorVida.setText("60");
        lblValorGasto.setText("30");
        lblValorDefesa.setText("120");
        lblValorRegeneracao.setText("100");
        lblDano1.setText("18");
        lblDano2.setText("26");
        lblDanoEspecial.setText("32");
        lblGasto1.setText("12");
        lblGasto2.setText("16");
        lblGastoEspecial.setText("32");
    }//GEN-LAST:event_rdoEngenheiroActionPerformed

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setBackground(white);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnSairMouseExited

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void rdoGuerreiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoGuerreiroMouseExited
        antiBug();
    }//GEN-LAST:event_rdoGuerreiroMouseExited

    private void rdoMagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoMagoMouseExited
        antiBug();
    }//GEN-LAST:event_rdoMagoMouseExited

    private void rdoPaladinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoPaladinoMouseExited
        antiBug();
    }//GEN-LAST:event_rdoPaladinoMouseExited

    private void rdoEngenheiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoEngenheiroMouseExited
        antiBug();
    }//GEN-LAST:event_rdoEngenheiroMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imgAlerta;
    private javax.swing.JLabel imgClasse;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel imgOlho;
    private javax.swing.JLabel imgOlhoFechado;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAtaque1;
    private javax.swing.JLabel lblAtaque2;
    private javax.swing.JLabel lblClasse;
    private javax.swing.JLabel lblDano1;
    private javax.swing.JLabel lblDano2;
    private javax.swing.JLabel lblDanoEspecial;
    private javax.swing.JLabel lblDefesa;
    private javax.swing.JLabel lblEspecial;
    private javax.swing.JLabel lblGasto;
    private javax.swing.JLabel lblGasto1;
    private javax.swing.JLabel lblGasto2;
    private javax.swing.JLabel lblGastoEspecial;
    private javax.swing.JLabel lblRegeneração;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblValorDefesa;
    private javax.swing.JLabel lblValorGasto;
    private javax.swing.JLabel lblValorRegeneracao;
    private javax.swing.JLabel lblValorVida;
    private javax.swing.JLabel lblVida;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JRadioButton rdoEngenheiro;
    private javax.swing.JRadioButton rdoGuerreiro;
    private javax.swing.JRadioButton rdoMago;
    private javax.swing.JRadioButton rdoPaladino;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
