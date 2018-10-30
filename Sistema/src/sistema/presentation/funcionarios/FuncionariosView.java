
package sistema.presentation.funcionarios;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sistema.Application;
import sistema.logic.Dependencia;
import sistema.logic.Funcionario;

/**
 *
 * @author Rachel
 */
public class FuncionariosView extends javax.swing.JInternalFrame implements Observer {
    
    FuncionariosController controller;
    FuncionariosModel model;    

    public FuncionariosController getController() {
        return controller;
    }

    public FuncionariosModel getModel() {
        return model;
    }

    public void setController(FuncionariosController controller) {
        this.controller = controller;
    }

    public void setModel(FuncionariosModel model) {
        this.model = model;
        model.addObserver(this);
    }

    public FuncionariosView() {
        super("Funcionarios", false, true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recibeGroup = new javax.swing.ButtonGroup();
        SearchLbl = new javax.swing.JLabel();
        searchFld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        funcionariosTable = new javax.swing.JTable();
        agregarBttn = new javax.swing.JButton();
        eliminarBttn = new javax.swing.JButton();
        searchBttn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        addFuncionarioLbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreLbl = new javax.swing.JLabel();
        nombreFld = new javax.swing.JTextField();
        idLbl = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        recibeLbl = new javax.swing.JLabel();
        siRadio = new javax.swing.JRadioButton();
        noRadio = new javax.swing.JRadioButton();
        dependenciaLbl = new javax.swing.JLabel();
        dependenciaBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/people.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(62, 32));
        setName(""); // NOI18N

        SearchLbl.setText("Nombre");

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
        funcionariosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcionariosTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(funcionariosTable);

        agregarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/add.png"))); // NOI18N
        agregarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBttnActionPerformed(evt);
            }
        });

        eliminarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/delete.png"))); // NOI18N
        eliminarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBttnActionPerformed(evt);
            }
        });

        searchBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/presentation/iconos/generales/search.png"))); // NOI18N
        searchBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBttnActionPerformed(evt);
            }
        });

        addFuncionarioLbl.setText("Agregar/Modificar Funcionario");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        nombreLbl.setText("Nombre");

        idLbl.setText("Cedula");

        recibeLbl.setText("Recibe Solicitudes");

        recibeGroup.add(siRadio);
        siRadio.setText("Si");

        recibeGroup.add(noRadio);
        noRadio.setText("No");

        dependenciaLbl.setText("Dependencia");

        dependenciaBox.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(SearchLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchFld, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dependenciaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dependenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(idLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(nombreLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nombreFld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(recibeLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(siRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(noRadio)))))
                        .addGap(43, 43, 43)
                        .addComponent(agregarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addFuncionarioLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchLbl)
                    .addComponent(searchFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dependenciaLbl)
                    .addComponent(dependenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addFuncionarioLbl)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreLbl)
                        .addComponent(nombreFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(agregarBttn))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siRadio)
                    .addComponent(recibeLbl)
                    .addComponent(noRadio))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBttn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarBttn)
                        .addGap(53, 53, 53))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBttnActionPerformed
        if(this.searchFld.getText().isEmpty()){ //si el searchFld esta vacio, entonces muestra todos los funcionarios
            try{
                controller.buscarTodos((String) this.dependenciaBox.getSelectedItem());
            }
            catch(Exception ex){
                this.mensaje(ex.getMessage());
            }
        }
        else{ //si no esta vacio, que busque el funcionario por el nombre que ingreso el usuario en el campo de nombre.
            if(this.validar()){
                try{
                    controller.buscar(this.filtro(), (String) this.dependenciaBox.getSelectedItem());
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

    private void agregarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBttnActionPerformed
        if(validaAgregar()){
        try{
            controller.agregar(funcionario(), (String) this.dependenciaBox.getSelectedItem());
            this.mensajeAgregado("Funcionario agregado con exito");
        }catch(Exception ex){
            this.mensaje(ex.getMessage());
        }}else{
            this.mensaje("Debe ingresar todos los datos");
        }
    }//GEN-LAST:event_agregarBttnActionPerformed
    
    private void eliminarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBttnActionPerformed
        int fila = this.funcionariosTable.getSelectedRow();
        
        if(fila != -1){
            try {
                controller.borrar(fila, (String) this.dependenciaBox.getSelectedItem());
            } catch (Exception ex) {
                this.mensaje(ex.getMessage());
            }
        }
    }//GEN-LAST:event_eliminarBttnActionPerformed

    private void funcionariosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionariosTableMouseClicked
        if(evt.getClickCount() == 2){
            int fila = this.funcionariosTable.getSelectedRow();
            int colm = this.funcionariosTable.getSelectedColumn();
            
           controller.setModo(Application.EDITAR, fila);
        }
    }//GEN-LAST:event_funcionariosTableMouseClicked

    public boolean validaAgregar(){
        boolean valido = true;
        
        if(this.idFld.getText().isEmpty()){
            valido = false;
            this.idLbl.setForeground(Color.red);
        }
        
        if(this.nombreFld.getText().isEmpty()){
            valido = false;
            this.nombreLbl.setForeground(Color.red);
        }
        
        if(!this.siRadio.isSelected() && !this.noRadio.isSelected()){
            valido = false;
            this.recibeLbl.setForeground(Color.red);
        }
        
        return valido;
    }
    
    public Funcionario funcionario(){
        Funcionario nuevo = new Funcionario();
        nuevo.setFuncionarioCedula(this.idFld.getText());
        nuevo.setFuncionarioNombre(this.nombreFld.getText());
        nuevo.setFuncionarioRecibeSolicitud(this.recibeSolicitud());
        nuevo.getDependenciaCollection().add(this.getDependencia());
        
        return nuevo;
        
    }
    
    public Dependencia getDependencia(){
        return controller.buscarDependencia((String) this.dependenciaBox.getSelectedItem());
    }
    
    public boolean recibeSolicitud(){
        if(this.siRadio.isSelected())
            return true;
        else
            return false;
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
    
    public Funcionario filtro(){
        Funcionario funcionario = new Funcionario();
        funcionario.setFuncionarioNombre(this.searchFld.getText());
        return funcionario;
    }
    
    public void mensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public void mensajeAgregado(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.limpiarPantalla();
        Funcionario filtro = model.getFiltro();
        this.inicializaPantalla(filtro);
        
    }
    
    public void limpiarPantalla(){
        this.nombreLbl.setForeground(Color.DARK_GRAY);
        this.idLbl.setForeground(Color.DARK_GRAY);
        this.recibeLbl.setForeground(Color.DARK_GRAY);
        
        this.idFld.setText("");
        this.idFld.setEditable(true);
        
        this.nombreFld.setText("");
        
        this.recibeGroup.clearSelection();
    }
    
    public void comboBox(){
        List<String> lista = new ArrayList<String>();
        lista = controller.getDependencias();        
        this.dependenciaBox.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    
    public void inicializaPantalla(Funcionario funcionario){
    
        if(funcionario.getFuncionarioNombre() != null)
            this.searchFld.setText(funcionario.getFuncionarioNombre());
        
        this.funcionariosTable.setModel(model.getTable());
        
        this.dependenciaBox.setEnabled(true);
        this.comboBox();
   
       // this.dependenciaBox.setModel(model.getDependencias());
        
        if(model.getModo() == Application.EDITAR){
            
            this.idFld.setText(funcionario.getFuncionarioCedula());
            this.idFld.setEditable(false);
            
            this.nombreFld.setText(funcionario.getFuncionarioNombre());
            
            if(funcionario.getFuncionarioRecibeSolicitud())
                this.siRadio.setSelected(true);
            else
                this.noRadio.setSelected(true);
        }
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SearchLbl;
    private javax.swing.JLabel addFuncionarioLbl;
    private javax.swing.JButton agregarBttn;
    public javax.swing.JComboBox dependenciaBox;
    private javax.swing.JLabel dependenciaLbl;
    private javax.swing.JButton eliminarBttn;
    private javax.swing.JTable funcionariosTable;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel idLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton noRadio;
    private javax.swing.JTextField nombreFld;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.ButtonGroup recibeGroup;
    private javax.swing.JLabel recibeLbl;
    private javax.swing.JButton searchBttn;
    private javax.swing.JTextField searchFld;
    private javax.swing.JRadioButton siRadio;
    // End of variables declaration//GEN-END:variables
}
