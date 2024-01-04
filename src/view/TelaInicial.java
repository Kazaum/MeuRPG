package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.Classe;
import model.Personagem;
import model.Usuario;


public class TelaInicial extends javax.swing.JFrame {
    private int id;
    private String usuario;
    private String senha;
    private int nivel;
    private Classe classe;
    
    public TelaInicial(Usuario user, boolean primeiroAcesso) {
        initComponents();
        //CORES
        Color fundoLayout = new Color(0,0,0,150);
        Color fundoMenu = new Color(0,0,0,200);
        Color transparente = new Color(0,0,0,0);
        
        //MENSAGEM DE PRIMEIRO ACESSO
        if (primeiroAcesso = true){
            JOptionPane.showMessageDialog(null, "Acesso bem sucedido!");
        }
        
        //OBJETOS
        Classe userClasse = user.getClasse();
        Personagem userPersonagem = userClasse.getPersonagem();
        
        
        
        
        id = user.getId();
        usuario = user.getUsuario();
        senha = user.getSenha();
        nivel = user.getNivel();
        
        //LAYOUT
            pnlLayout.setBackground(transparente);
            //DINHEIRO
            pnlDinheiro.setBackground(fundoLayout);
            lblDinheiro.setText("$"+userPersonagem.getDinheiro());
            //SATUS
            pnlStatus.setBackground(fundoLayout);
            lblVida.setText("VIDA: " + userPersonagem.getVida());
            if(userClasse.getClasse().equalsIgnoreCase("mago") || userClasse.getClasse().equalsIgnoreCase("paladino")){
                lblGasto.setText("MANA: " + userPersonagem.getGasto());
            }else if(userClasse.getClasse().equalsIgnoreCase("guerreiro") || userClasse.getClasse().equalsIgnoreCase("engenheiro")){
                lblGasto.setText("ESTAMINA: " + userPersonagem.getGasto());
            }
            lblGasto.setText("MANA: " + userPersonagem.getGasto());
            lblDefesa.setText("DEFESA: " + userPersonagem.getDefesa());
            lblRegeneracao.setText("REGENERAÇÃO: " + userPersonagem.getRegeneracao());
            lblClasse.setText(userClasse.getClasse() + " " + user.getUsuario().toUpperCase());
            if(userClasse.getClasse().equalsIgnoreCase("mago")){
                imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/iconMago.png")));
            }else if(userClasse.getClasse().equalsIgnoreCase("guerreiro")){
                imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/iconGuerreiro.png")));
            }else if(userClasse.getClasse().equalsIgnoreCase("engenheiro")){
                imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/iconEngenheiro.png")));
            }else if(userClasse.getClasse().equalsIgnoreCase("paladino")){
                imgClasse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/personagens/iconPaladino.png")));
            }
        //MENU
        pnlMenu.setVisible(false);
        pnlMenu.setBackground(fundoMenu);
            
            
            

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLayout = new javax.swing.JPanel();
        pnlDinheiro = new javax.swing.JPanel();
        lblDinheiro = new javax.swing.JLabel();
        pnlStatus = new javax.swing.JPanel();
        lblExpansao = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        lblGasto = new javax.swing.JLabel();
        lblDefesa = new javax.swing.JLabel();
        lblRegeneracao = new javax.swing.JLabel();
        lblClasse = new javax.swing.JLabel();
        imgClasse = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnAudio = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblImagemFundoInicioNoite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 800));
        setSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(null);

        pnlLayout.setBackground(new java.awt.Color(204, 255, 204));
        pnlLayout.setLayout(null);

        pnlDinheiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlDinheiro.setLayout(null);

        lblDinheiro.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        lblDinheiro.setForeground(new java.awt.Color(153, 153, 0));
        lblDinheiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDinheiro.setText("$");
        pnlDinheiro.add(lblDinheiro);
        lblDinheiro.setBounds(10, 10, 170, 50);

        pnlLayout.add(pnlDinheiro);
        pnlDinheiro.setBounds(1140, 0, 190, 70);

        pnlStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlStatus.setLayout(null);

        lblExpansao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExpansao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExpansaoMouseClicked(evt);
            }
        });
        pnlStatus.add(lblExpansao);
        lblExpansao.setBounds(0, 0, 420, 160);

        lblVida.setFont(new java.awt.Font("Sitka Banner", 1, 21)); // NOI18N
        lblVida.setForeground(new java.awt.Color(204, 204, 204));
        lblVida.setText("VIDA:");
        pnlStatus.add(lblVida);
        lblVida.setBounds(10, 0, 150, 40);

        lblGasto.setFont(new java.awt.Font("Sitka Banner", 1, 21)); // NOI18N
        lblGasto.setForeground(new java.awt.Color(204, 204, 204));
        lblGasto.setText("GASTO:");
        pnlStatus.add(lblGasto);
        lblGasto.setBounds(10, 40, 150, 40);

        lblDefesa.setFont(new java.awt.Font("Sitka Banner", 1, 21)); // NOI18N
        lblDefesa.setForeground(new java.awt.Color(204, 204, 204));
        lblDefesa.setText("DEFESA:");
        pnlStatus.add(lblDefesa);
        lblDefesa.setBounds(10, 80, 150, 40);

        lblRegeneracao.setFont(new java.awt.Font("Sitka Banner", 1, 21)); // NOI18N
        lblRegeneracao.setForeground(new java.awt.Color(204, 204, 204));
        lblRegeneracao.setText("REGENERAÇÃO:");
        pnlStatus.add(lblRegeneracao);
        lblRegeneracao.setBounds(10, 120, 220, 40);

        lblClasse.setFont(new java.awt.Font("Sitka Banner", 1, 21)); // NOI18N
        lblClasse.setForeground(new java.awt.Color(204, 204, 204));
        lblClasse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClasse.setText("CLASSE:");
        pnlStatus.add(lblClasse);
        lblClasse.setBounds(120, 0, 300, 30);
        pnlStatus.add(imgClasse);
        imgClasse.setBounds(200, 30, 140, 90);

        pnlLayout.add(pnlStatus);
        pnlStatus.setBounds(980, 610, 420, 160);

        pnlMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        pnlMenu.setLayout(null);

        lblMenu.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(153, 153, 153));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("MENU");
        pnlMenu.add(lblMenu);
        lblMenu.setBounds(0, 0, 350, 110);

        btnSair.setBackground(new java.awt.Color(153, 153, 153));
        btnSair.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconLogIn.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSair);
        btnSair.setBounds(30, 400, 280, 50);

        btnAudio.setBackground(new java.awt.Color(153, 153, 153));
        btnAudio.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        btnAudio.setForeground(new java.awt.Color(0, 0, 0));
        btnAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconAudioOn.png"))); // NOI18N
        btnAudio.setText("AUDIOS");
        btnAudio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        btnAudio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioActionPerformed(evt);
            }
        });
        pnlMenu.add(btnAudio);
        btnAudio.setBounds(30, 130, 280, 50);

        btnMapa.setBackground(new java.awt.Color(153, 153, 153));
        btnMapa.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        btnMapa.setForeground(new java.awt.Color(0, 0, 0));
        btnMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconMapa.png"))); // NOI18N
        btnMapa.setText("MAPA");
        btnMapa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        btnMapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMapa);
        btnMapa.setBounds(30, 220, 280, 50);

        btnSalvar.setBackground(new java.awt.Color(153, 153, 153));
        btnSalvar.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconSalvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSalvar);
        btnSalvar.setBounds(30, 310, 280, 50);

        pnlLayout.add(pnlMenu);
        pnlMenu.setBounds(1040, 80, 350, 510);

        btnMenu.setBackground(new java.awt.Color(153, 153, 153));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconMenuLateral.png"))); // NOI18N
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlLayout.add(btnMenu);
        btnMenu.setBounds(1340, 10, 50, 50);

        lblImagemFundoInicioNoite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundoInicioNoite.gif"))); // NOI18N
        pnlLayout.add(lblImagemFundoInicioNoite);
        lblImagemFundoInicioNoite.setBounds(0, 0, 1400, 800);

        getContentPane().add(pnlLayout);
        pnlLayout.setBounds(-10, 0, 1400, 800);

        setSize(new java.awt.Dimension(1415, 811));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void antiBugLayout(){
        pnlLayout.setVisible(false);
        pnlLayout.setVisible(true);
    }
    private void lblExpansaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExpansaoMouseClicked
        JOptionPane.showMessageDialog(null, "Expansao de status ainda não disponivel.");
    }//GEN-LAST:event_lblExpansaoMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (pnlMenu.isVisible()) {
            pnlMenu.setVisible(false);
        } else {
           pnlMenu.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioActionPerformed
        JOptionPane.showMessageDialog(null, btnAudio.getText() + " ainda não disponivel");
    }//GEN-LAST:event_btnAudioActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        JOptionPane.showMessageDialog(null, btnMapa.getText() + " ainda não disponivel");
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        JOptionPane.showMessageDialog(null, btnSalvar.getText() + " ainda não disponivel");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[], Usuario user, boolean primeiroAcesso) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial(user, primeiroAcesso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAudio;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel imgClasse;
    private javax.swing.JLabel lblClasse;
    private javax.swing.JLabel lblDefesa;
    private javax.swing.JLabel lblDinheiro;
    private javax.swing.JLabel lblExpansao;
    private javax.swing.JLabel lblGasto;
    private javax.swing.JLabel lblImagemFundoInicioNoite;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblRegeneracao;
    private javax.swing.JLabel lblVida;
    private javax.swing.JPanel pnlDinheiro;
    private javax.swing.JPanel pnlLayout;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlStatus;
    // End of variables declaration//GEN-END:variables
}
