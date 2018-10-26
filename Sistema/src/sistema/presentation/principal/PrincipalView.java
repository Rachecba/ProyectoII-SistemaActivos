package sistema.presentation.principal;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;

/**
 *
 * @author Rachel
 */
public class PrincipalView extends JFrame implements Observer {
    
    PrincipalController controller;
    PrincipalModel model;

    public PrincipalController getController() {
        return controller;
    }

    public PrincipalModel getModel() {
        return model;
    }

    public void setController(PrincipalController controller) {
        this.controller = controller;
    }

    public void setModel(PrincipalModel model) {
        this.model = model;
        model.addObserver(this);
    }
    
    
   public void addInternalFrame(JInternalFrame f){
       this.desktopPane.add(f);
   }
      
    public PrincipalView() {
        initComponents();
        this.setSize(this.getMaximumSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        salir = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        solicitudes = new javax.swing.JMenu();
        activos = new javax.swing.JMenu();
        articulos = new javax.swing.JMenu();
        funcionarios = new javax.swing.JMenu();
        verFuncionarios = new javax.swing.JMenuItem();
        dependencias = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenu();

        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));
        getContentPane().add(desktopPane);

        /*javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );*/

        salir.setText("Salir");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        salir.add(logout);

        jMenuBar1.add(salir);

        solicitudes.setText("Solicitudes");
        jMenuBar1.add(solicitudes);

        activos.setText("Activos");
        jMenuBar1.add(activos);

        articulos.setText("Articulos");
        jMenuBar1.add(articulos);

        funcionarios.setText("Funcionarios");

        verFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/people.png"))); // NOI18N
        verFuncionarios.setText("Ver Funcionarios");
        verFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFuncionariosActionPerformed(evt);
            }
        });
        funcionarios.add(verFuncionarios);

        jMenuBar1.add(funcionarios);

        dependencias.setText("Dependencias");
        jMenuBar1.add(dependencias);

        ayuda.setText("Ayuda");
        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

      /*  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );*/

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.controller.exit();
    }//GEN-LAST:event_logoutActionPerformed

    private void verFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFuncionariosActionPerformed
        controller.showFuncionarios();
    }//GEN-LAST:event_verFuncionariosActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        if (model.getUsuario() != null){
           this.setTitle("Username: "+model.getUsuario().getUsuarioUsername());
       }     
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu activos;
    private javax.swing.JMenu articulos;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenu dependencias;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu funcionarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu salir;
    private javax.swing.JMenu solicitudes;
    private javax.swing.JMenuItem verFuncionarios;
    // End of variables declaration//GEN-END:variables
}
