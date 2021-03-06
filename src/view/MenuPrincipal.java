/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.MenuPrincipalController;

/**
 *
 * @author edson
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController menuprincipal;
    
    public MenuPrincipal() {
        initComponents();
        
        //Criando um objeto controlador menu, passando essa view como parâmetro
         this.menuprincipal = new MenuPrincipalController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuClient = new javax.swing.JMenuItem();
        jMenuIServico = new javax.swing.JMenuItem();
        jMenuUser = new javax.swing.JMenuItem();
        jMenuOperacao = new javax.swing.JMenu();
        jMenuAgenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbershop/view/img/fundo-MenuPrincipal.jpg"))); // NOI18N

        jMenuCadastro.setText("Cadastro");

        jMenuClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbershop/view/img/icons/cliente-icon.png"))); // NOI18N
        jMenuClient.setText("Cliente");
        jMenuCadastro.add(jMenuClient);

        jMenuIServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuIServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbershop/view/img/icons/tesoura-icon.png"))); // NOI18N
        jMenuIServico.setText("Serviço");
        jMenuCadastro.add(jMenuIServico);

        jMenuUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbershop/view/img/icons/usuario-icon.png"))); // NOI18N
        jMenuUser.setText("Usuário");
        jMenuCadastro.add(jMenuUser);

        jMenuBar1.add(jMenuCadastro);

        jMenuOperacao.setText("Operação");

        jMenuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbershop/view/img/icons/agenda-icon.png"))); // NOI18N
        jMenuAgenda.setText("Agenda");
        jMenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendaActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuAgenda);

        jMenuBar1.add(jMenuOperacao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendaActionPerformed
        this.menuprincipal.navegarAgenda();
    }//GEN-LAST:event_jMenuAgendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuClient;
    private javax.swing.JMenuItem jMenuIServico;
    private javax.swing.JMenu jMenuOperacao;
    private javax.swing.JMenuItem jMenuUser;
    // End of variables declaration//GEN-END:variables
}
