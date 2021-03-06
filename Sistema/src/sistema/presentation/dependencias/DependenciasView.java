
package sistema.presentation.dependencias;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.   Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sistema.Application;
import sistema.logic.Dependencia;
import sistema.logic.Funcionario;
import sistema.logic.Labor;
import sistema.logic.Puesto;

/**
 *
 * @author Rachel
 */
public class DependenciasView extends javax.swing.JInternalFrame implements Observer{
    
    DependenciasModel model;
    DependenciasController controller;
    int filaDependencia;

    public DependenciasModel getModel() {
        return model;
    }

    public DependenciasController getController() {
        return controller;
    }

    public void setModel(DependenciasModel model) {
        this.model = model;
        model.addObserver(this);
    }

    public void setController(DependenciasController controller) {
        this.controller = controller;
    }
    
    public DependenciasView() {
        super("Dependencias", true, true);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        searchLbl = new javax.swing.JLabel();
        searchFld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dependenciasTable = new javax.swing.JTable();
        dependenciasLbl = new javax.swing.JLabel();
        funcionariosLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        funcionariosTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        searchBttn = new javax.swing.JButton();
        addDependenciaBttn = new javax.swing.JButton();
        deleteDependenciaBttn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        addDependenciaLbl = new javax.swing.JLabel();
        addFuncionarioLbl = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        nombreFld = new javax.swing.JTextField();
        adminLbl = new javax.swing.JLabel();
        adminBox = new javax.swing.JComboBox();
        deleteFuncionarioBttn = new javax.swing.JButton();
        funcionarioLbl = new javax.swing.JLabel();
        puestoLbl = new javax.swing.JLabel();
        addFuncionarioBttn = new javax.swing.JButton();
        funcionarioBox = new javax.swing.JComboBox();
        puestoBox = new javax.swing.JComboBox();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/university.png"))); // NOI18N

        searchLbl.setText("Nombre");

        dependenciasTable.setModel(new javax.swing.table.DefaultTableModel(
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
        dependenciasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dependenciasTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dependenciasTable);

        dependenciasLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        dependenciasLbl.setText("Dependencias");

        funcionariosLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        funcionariosLbl.setText("Funcionarios");

        funcionariosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(funcionariosTable);

        searchBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/search.png"))); // NOI18N
        searchBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBttnActionPerformed(evt);
            }
        });

        addDependenciaBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/plus2.png"))); // NOI18N
        addDependenciaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDependenciaBttnActionPerformed(evt);
            }
        });

        deleteDependenciaBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/delete2.png"))); // NOI18N
        deleteDependenciaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDependenciaBttnActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        addDependenciaLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        addDependenciaLbl.setText("Agregar/Modificar Dependencia");

        addFuncionarioLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        addFuncionarioLbl.setText("Agregar Funcionario");

        nombreLbl.setText("Nombre");

        adminLbl.setText("Administrador");

        adminBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        deleteFuncionarioBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/delete2.png"))); // NOI18N
        deleteFuncionarioBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFuncionarioBttnActionPerformed(evt);
            }
        });

        funcionarioLbl.setText("Funcionario");

        puestoLbl.setText("Puesto");

        addFuncionarioBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/plus2.png"))); // NOI18N
        addFuncionarioBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncionarioBttnActionPerformed(evt);
            }
        });

        funcionarioBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        puestoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteDependenciaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(searchLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchFld, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(dependenciasLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(funcionariosLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteFuncionarioBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(addFuncionarioBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(nombreLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreFld, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addDependenciaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(addFuncionarioLbl))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(puestoLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(puestoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(funcionarioLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(funcionarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addDependenciaLbl)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(addDependenciaLbl)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminLbl))
                                .addGap(25, 25, 25)
                                .addComponent(addDependenciaBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addFuncionarioLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(funcionarioLbl)
                                    .addComponent(funcionarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(puestoLbl)
                                    .addComponent(puestoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(addFuncionarioBttn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dependenciasLbl)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(searchFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(searchLbl)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(searchBttn)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(deleteDependenciaBttn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(funcionariosLbl)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(deleteFuncionarioBttn)))
                                .addGap(0, 41, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteDependenciaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDependenciaBttnActionPerformed
        int fila = this.dependenciasTable.getSelectedRow();
        
        if(fila != -1){
            try {
                controller.borrarDependencia(fila);
            } catch (Exception ex) {
                this.mensaje(ex.getMessage());
            }
        }
    }//GEN-LAST:event_deleteDependenciaBttnActionPerformed

    private void searchBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBttnActionPerformed
        if(this.searchFld.getText().isEmpty()){ //si el searchFld esta vacio, entonces muestra todas las dependencias
            try{
                controller.buscarTodos();
            }
            catch(Exception ex){
                this.mensaje(ex.getMessage());
            }
        }
        else{ //si no esta vacio, que busque la dependencia por el nombre que ingreso el usuario en el campo de nombre.
            if(this.validar()){
                try{
                    controller.buscar(this.filtro());
                }
                catch(Exception ex){
                    this.mensaje(ex.getMessage());
                }
            }
            else{
                this.mensaje("Debe ingresar solo letras");
            }
        }
    }//GEN-LAST:event_searchBttnActionPerformed

    private void addDependenciaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDependenciaBttnActionPerformed
        if(validaAgregar()){
        try{
            controller.agregarDependencia(dependencia());
            this.mensajeAgregado("Dependencia agregada con exito");
        }catch(Exception ex){
            this.mensaje(ex.getMessage());
        }}else{
            this.mensaje("Debe ingresar todos los datos");
        }
    }//GEN-LAST:event_addDependenciaBttnActionPerformed

    private void dependenciasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dependenciasTableMouseClicked
       if(evt.getClickCount() == 2){
            filaDependencia = this.dependenciasTable.getSelectedRow();
            int colm = this.dependenciasTable.getSelectedColumn();
            
           controller.setModo(Application.EDITAR, filaDependencia);
           
           try {
               controller.buscarFuncionarios(filaDependencia);
           } catch (Exception ex) {
               this.mensaje(ex.getMessage());
           }
        }
    }//GEN-LAST:event_dependenciasTableMouseClicked

    private void deleteFuncionarioBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFuncionarioBttnActionPerformed
        int fila = this.funcionariosTable.getSelectedRow();
        
        
        if(fila != -1){
            try {
                controller.borrarFuncionario(fila, filaDependencia);
            } catch (Exception ex) {
                this.mensaje(ex.getMessage());
            }
        }
    }//GEN-LAST:event_deleteFuncionarioBttnActionPerformed

    private void addFuncionarioBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuncionarioBttnActionPerformed
        
        try{
            controller.agregarLabor(labor(), filaDependencia);
            this.mensajeAgregado("Funcionario agregado con exito");
        }catch(Exception ex){
            this.mensaje(ex.getMessage());        
    }//GEN-LAST:event_addFuncionarioBttnActionPerformed

    }
    
//    public boolean validaAgregarFuncionario(){
//        boolean valido = true;
//        
//        if(this.laborFld.getText().isEmpty()){
//            this.laborFld.setForeground(Color.red);
//            valido = false;
//        }
//        
//        if(this.cedulaFld.getText().isEmpty()){
//            this.cedulaFld.setForeground(Color.red);
//            valido = false;
//        }
//        
//        return valido;
//    }
    
    public Labor labor(){
        Labor nuevo = new Labor();
        nuevo.setLaborDependencia(controller.getDependencia(this.filaDependencia));
        nuevo.setLaborFuncionario((Funcionario) this.funcionarioBox.getSelectedItem());
        nuevo.setLaborPuesto((Puesto) this.puestoBox.getSelectedItem());
        
        return nuevo;
    }
    
    public Dependencia dependencia(){
        Dependencia nueva = new Dependencia();
        nueva.setDependenciaNombre(this.nombreFld.getText());
        nueva.setDependenciaAdministrador(getAdministrador());
        return nueva;
    }
    
    public Funcionario getAdministrador(){
         return controller.buscarFuncionario((Funcionario) this.adminBox.getSelectedItem());
    }
    
    public boolean validaAgregar(){
        boolean valido = true;
        
        if(this.nombreFld.getText().isEmpty()){
            this.nombreLbl.setForeground(Color.red);
            valido = false;
        }
        
        return valido;
    }
    
    public boolean validar(){ //valida que solo ingrese letras
        boolean valido = true;
        String numeros = "0123456789";
        String busqueda = this.searchFld.getText();
        
        for(int i = 0; i<busqueda.length(); i++){
            if(numeros.indexOf(busqueda.charAt(i),0) != -1){
                valido = false;
                return valido;
            }
        }
        
        return valido;
    }
    
    public void mensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public void mensajeAgregado(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Dependencia filtro(){
        Dependencia dependencia = new Dependencia();
        dependencia.setDependenciaNombre(this.searchFld.getText());
        return dependencia;
    }
    
    public void limpiarPantalla(){
        this.nombreLbl.setForeground(Application.COLOR_OK);
    }
    
    public void inicializaPantalla(Dependencia dependencia){
    
        if(dependencia.getDependenciaNombre() != null)
            this.searchFld.setText(dependencia.getDependenciaNombre());
        
        this.dependenciasTable.setModel(model.getDependenciasTable());
        this.funcionariosTable.setModel(model.getFuncionariosTable());
        
        this.adminBox.setEnabled(true);
        
        this.adminBox.setModel(model.getFuncionarios());
        this.funcionarioBox.setModel(model.getFuncionarios());
        this.puestoBox.setModel(model.getPuestos());
        
       this.funcionarioBox.setEnabled(false);
       this.puestoBox.setEnabled(false);
        
        if(model.getModo() == Application.EDITAR){
            this.funcionariosTable.setModel(model.getFuncionariosTable());
            this.nombreFld.setText(dependencia.getDependenciaNombre());
            // this.nombreFld.setEditable(false);
            
            this.adminBox.setSelectedItem(dependencia.getDependenciaAdministrador());
            this.funcionarioBox.setEnabled(true);
            this.puestoBox.setEnabled(true);
        }
        
          
    }
    
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
            java.util.logging.Logger.getLogger(DependenciasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DependenciasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DependenciasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DependenciasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DependenciasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDependenciaBttn;
    private javax.swing.JLabel addDependenciaLbl;
    private javax.swing.JButton addFuncionarioBttn;
    private javax.swing.JLabel addFuncionarioLbl;
    private javax.swing.JComboBox adminBox;
    private javax.swing.JLabel adminLbl;
    private javax.swing.JButton deleteDependenciaBttn;
    private javax.swing.JButton deleteFuncionarioBttn;
    private javax.swing.JLabel dependenciasLbl;
    private javax.swing.JTable dependenciasTable;
    private javax.swing.JComboBox funcionarioBox;
    private javax.swing.JLabel funcionarioLbl;
    private javax.swing.JLabel funcionariosLbl;
    private javax.swing.JTable funcionariosTable;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombreFld;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JComboBox puestoBox;
    private javax.swing.JLabel puestoLbl;
    private javax.swing.JButton searchBttn;
    private javax.swing.JTextField searchFld;
    private javax.swing.JLabel searchLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
      this.limpiarPantalla();
      Dependencia filtro = model.getFiltro();
      this.inicializaPantalla(filtro);
    }
}
