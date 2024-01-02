package view;

import javax.swing.JOptionPane;
import model.Classe;
import model.Usuario;


public class TelaInicial extends javax.swing.JFrame {
    private int id;
    private String usuario;
    private String senha;
    private int nivel;
    private Classe classe;
    
    public TelaInicial(Usuario user, boolean primeiroAcesso) {
        initComponents();
        if (primeiroAcesso = true){
            JOptionPane.showMessageDialog(null, "Acesso bem sucedido!");
        }
        id = user.getId();
        usuario = user.getUsuario();
        senha = user.getSenha();
        nivel = user.getNivel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTeste = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblTeste.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(lblTeste);
        lblTeste.setBounds(0, 0, 910, 220);

        jButton1.setText("TESTAR RETORNO DE DADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 340, 270, 40);

        setSize(new java.awt.Dimension(922, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lblTeste.setText("ID: " + id + " - USUARIO: " + usuario + " - SENHA: " + senha + " - NIVEL: " + nivel);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[], Usuario user, boolean primeiroAcesso) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial(user, primeiroAcesso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblTeste;
    // End of variables declaration//GEN-END:variables
}
