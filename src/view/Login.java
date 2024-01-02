package view;

import dao.ConsultaUsuario;
import java.awt.Color;
import static java.awt.Color.white;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Usuario;
import org.json.JSONException;
import service.Objetos;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        pnlLogin.setBackground(new Color(255,255,255,230));
        txtSenha.setVisible(false);
        imgOlhoFechado.setVisible(false);
        imgAlerta.setVisible(false);
        imgAlerta1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pwdSenha = new javax.swing.JPasswordField();
        imgOlho = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        imgOlhoFechado = new javax.swing.JLabel();
        imgAlerta = new javax.swing.JLabel();
        imgAlerta1 = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        pnlFundo.setLayout(null);

        pnlLogin.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102))));
        pnlLogin.setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("USUARIO");
        lblUsuario.setToolTipText("");
        pnlLogin.add(lblUsuario);
        lblUsuario.setBounds(0, 140, 320, 40);

        txtUsuario.setBackground(new java.awt.Color(102, 102, 102));
        txtUsuario.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLogin.add(txtUsuario);
        txtUsuario.setBounds(50, 180, 230, 40);

        lblTitulo.setFont(new java.awt.Font("Goudy Old Style", 1, 42)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("LOGIN");
        lblTitulo.setToolTipText("");
        pnlLogin.add(lblTitulo);
        lblTitulo.setBounds(0, 10, 320, 80);

        txtSenha.setBackground(new java.awt.Color(102, 102, 102));
        txtSenha.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLogin.add(txtSenha);
        txtSenha.setBounds(50, 270, 230, 40);

        lblSenha.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("SENHA");
        lblSenha.setToolTipText("");
        pnlLogin.add(lblSenha);
        lblSenha.setBounds(0, 230, 320, 40);

        pwdSenha.setBackground(new java.awt.Color(102, 102, 102));
        pwdSenha.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        pwdSenha.setForeground(new java.awt.Color(0, 0, 0));
        pwdSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLogin.add(pwdSenha);
        pwdSenha.setBounds(50, 270, 230, 40);

        imgOlho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconOlho.png"))); // NOI18N
        imgOlho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgOlhoMousePressed(evt);
            }
        });
        pnlLogin.add(imgOlho);
        imgOlho.setBounds(280, 270, 40, 40);

        btnAcessar.setBackground(new java.awt.Color(102, 102, 102));
        btnAcessar.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        btnAcessar.setForeground(new java.awt.Color(0, 0, 0));
        btnAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconLogIn.png"))); // NOI18N
        btnAcessar.setText("ACESSAR");
        btnAcessar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcessarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcessarMouseExited(evt);
            }
        });
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnAcessar);
        btnAcessar.setBounds(20, 350, 130, 40);

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
        pnlLogin.add(btnRegistrar);
        btnRegistrar.setBounds(170, 350, 130, 40);

        imgOlhoFechado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgOlhoFechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconOlhoFechado.png"))); // NOI18N
        imgOlhoFechado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgOlhoFechadoMouseReleased(evt);
            }
        });
        pnlLogin.add(imgOlhoFechado);
        imgOlhoFechado.setBounds(280, 270, 40, 40);

        imgAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconAlerta24x24.png"))); // NOI18N
        pnlLogin.add(imgAlerta);
        imgAlerta.setBounds(10, 270, 40, 40);

        imgAlerta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgAlerta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/iconAlerta24x24.png"))); // NOI18N
        pnlLogin.add(imgAlerta1);
        imgAlerta1.setBounds(10, 180, 40, 40);

        pnlFundo.add(pnlLogin);
        pnlLogin.setBounds(0, 0, 320, 680);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundoLogin.gif"))); // NOI18N
        pnlFundo.add(imgFundo);
        imgFundo.setBounds(0, 0, 1190, 680);

        getContentPane().add(pnlFundo);
        pnlFundo.setBounds(0, 0, 1190, 690);

        setSize(new java.awt.Dimension(1200, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imgOlhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOlhoMousePressed
        String senha = pwdSenha.getText();
        pwdSenha.setVisible(false);
        txtSenha.setVisible(true);
        pnlLogin.setVisible(false);
        pnlLogin.setVisible(true);
        imgOlhoFechado.setVisible(true);
        imgOlho.setVisible(false);
        txtSenha.setText(senha);
    }//GEN-LAST:event_imgOlhoMousePressed

    private void btnAcessarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcessarMouseEntered
        btnAcessar.setBackground(white);
    }//GEN-LAST:event_btnAcessarMouseEntered

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(white);
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnAcessarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcessarMouseExited
        Color cor = new Color(102, 102, 102);
        btnAcessar.setBackground(cor);
    }//GEN-LAST:event_btnAcessarMouseExited

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        Color cor = new Color(102, 102, 102);
        btnRegistrar.setBackground(cor);
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registro registro = new Registro();
        registro.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void imgOlhoFechadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgOlhoFechadoMouseReleased
        String senha = txtSenha.getText();
        pwdSenha.setVisible(true);
        txtSenha.setVisible(false);
        pnlLogin.setVisible(false);
        pnlLogin.setVisible(true);
        imgOlhoFechado.setVisible(false);
        imgOlho.setVisible(true);
        pwdSenha.setText(senha);
    }//GEN-LAST:event_imgOlhoFechadoMouseReleased

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        try{
            ConsultaUsuario consultar = new ConsultaUsuario();
            String consulta = "usuario";
            String[] usuarios = consultar.consultaString(consulta);
            consulta = "senha";
            String[] senhas = consultar.consultaString(consulta);
            boolean validar = false;
            boolean primeiroAcesso = true;
                for(int i = 0; i <= usuarios.length-1; i++){
                    if(usuarios[i].equalsIgnoreCase(txtUsuario.getText())){
                        System.out.println("Usuario " + usuarios[i] + " encontrado");
                        if(senhas[i].equals(txtSenha.getText()) || senhas[i].equals(pwdSenha.getText())){
                            Objetos objetos = new Objetos();
                            ConsultaUsuario consult = new ConsultaUsuario();
                            Usuario user = consult.consultaDados(i);
                            TelaInicial inicio = new TelaInicial(user, primeiroAcesso);
                            inicio.setVisible(true);
                            validar = true;
                            dispose();
                        }
                        break;
                    }
                }
                if(validar == false){
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    pwdSenha.setText("");
                    Color cor = new Color(255, 171, 171);
                    txtUsuario.setBackground(cor);
                    txtSenha.setBackground(cor);
                    pwdSenha.setBackground(cor);
                    imgAlerta.setVisible(true);
                    imgAlerta1.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado. Verifique as credenciais ou entre em contato com nossa equipe de suporte.");
                    txtUsuario.requestFocus();
                }
        }catch(JSONException e){
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o arquivo usuarios.json");
        }
    }//GEN-LAST:event_btnAcessarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel imgAlerta;
    private javax.swing.JLabel imgAlerta1;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel imgOlho;
    private javax.swing.JLabel imgOlhoFechado;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
