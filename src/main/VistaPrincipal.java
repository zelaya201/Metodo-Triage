package main;

import ds.desktop.notify.DesktopNotify;
import ds.desktop.notify.NotifyTheme;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.ColaPrioridadN;
import modelo.ListaEspera;
import modelo.Paciente;

/**
 *
 * @author walte
 */
public class VistaPrincipal extends javax.swing.JFrame {

    ArrayList<Paciente> listaPacientes;
    Paciente atendido;
    DefaultTableModel modelo;

    /**
     * Creates new form VistaPrincipal
     */
    ColaPrioridadN colaP;

    public VistaPrincipal() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        listaPacientes = new ArrayList();
        colaP = new ColaPrioridadN(this.cbnivel.getItemCount());
        
        mostrarTabla();
        btnagregar.setEnabled(false);
        btnatender.setEnabled(false);
    }

    public void enabledbt() {

        if (!jTnom.getText().isEmpty() && !jTedad.getText().isEmpty() && !jTobserv.getText().isEmpty()) {
            btnagregar.setEnabled(true);
        } else {
            btnagregar.setEnabled(false);
        }

            
        if (colaP.isEmpty()) {
            btnatender.setEnabled(false);
        }else {
            btnatender.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTobserv = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLespera = new javax.swing.JList<>();
        btnagregar = new newscomponents.RSButtonIcon_new();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbpaciente = new rojerusan.RSTableMetro();
        jTnom = new javax.swing.JTextField();
        cbgene = new RSMaterialComponent.RSComboBox();
        cbnivel = new RSMaterialComponent.RSComboBox();
        btnatender = new newscomponents.RSButtonIcon_new();
        btnlimpiar = new newscomponents.RSButtonIcon_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTedad.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        jTedad.setMinimumSize(new java.awt.Dimension(6, 18));
        jTedad.setPreferredSize(new java.awt.Dimension(6, 18));
        jTedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTedadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTedadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 12, 20);
        jPanel1.add(jTedad, gridBagConstraints);

        jLabel1.setText("Detalles del Paciente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 15, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel8.setText("Edad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel4.setText("Observaciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jTobserv.setColumns(20);
        jTobserv.setRows(5);
        jTobserv.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTobserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTobservKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTobserv);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 12, 20);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel7.setText("Historial de Pacientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel9.setText("Género");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel5.setText("Nivel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Lista de Espera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(jLabel6, gridBagConstraints);

        jScrollPane3.setViewportView(jLespera);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.ipady = 475;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(jScrollPane3, gridBagConstraints);

        btnagregar.setBackground(new java.awt.Color(61, 137, 248));
        btnagregar.setText("Agregar");
        btnagregar.setHideActionText(true);
        btnagregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregar.setIcons(null);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 12, 0);
        jPanel1.add(btnagregar, gridBagConstraints);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane4.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane4.setOpaque(false);

        tbpaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tbpaciente.setForeground(new java.awt.Color(255, 255, 255));
        tbpaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", ""},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Edad", "Género", "Observaciones", "Nivel", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbpaciente.setAltoHead(30);
        tbpaciente.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tbpaciente.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbpaciente.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tbpaciente.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tbpaciente.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tbpaciente.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tbpaciente.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tbpaciente.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tbpaciente.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbpaciente.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbpaciente.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbpaciente.setFuenteHead(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tbpaciente.setGridColor(new java.awt.Color(255, 255, 255));
        tbpaciente.setGrosorBordeFilas(0);
        tbpaciente.setGrosorBordeHead(0);
        tbpaciente.setMultipleSeleccion(false);
        tbpaciente.setRowHeight(40);
        tbpaciente.getTableHeader().setResizingAllowed(false);
        tbpaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbpaciente);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jPanel1.add(jScrollPane4, gridBagConstraints);

        jTnom.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        jTnom.setMinimumSize(new java.awt.Dimension(6, 18));
        jTnom.setPreferredSize(new java.awt.Dimension(6, 18));
        jTnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnomKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 12, 20);
        jPanel1.add(jTnom, gridBagConstraints);

        cbgene.setForeground(new java.awt.Color(51, 51, 51));
        cbgene.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", "Otro" }));
        cbgene.setColorArrow(new java.awt.Color(58, 66, 226));
        cbgene.setColorBorde(new java.awt.Color(204, 204, 204));
        cbgene.setColorFondo(new java.awt.Color(255, 255, 255));
        cbgene.setColorSeleccion(new java.awt.Color(255, 255, 255));
        cbgene.setColorSeleccionTXT(new java.awt.Color(58, 66, 226));
        cbgene.setConBorde(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 12, 20);
        jPanel1.add(cbgene, gridBagConstraints);

        cbnivel.setForeground(new java.awt.Color(51, 51, 51));
        cbnivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muy Grave", "Grave", "Moderado", "Leve" }));
        cbnivel.setColorArrow(new java.awt.Color(58, 66, 226));
        cbnivel.setColorBorde(new java.awt.Color(204, 204, 204));
        cbnivel.setColorFondo(new java.awt.Color(255, 255, 255));
        cbnivel.setColorSeleccion(new java.awt.Color(255, 255, 255));
        cbnivel.setColorSeleccionTXT(new java.awt.Color(58, 66, 226));
        cbnivel.setConBorde(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 12, 20);
        jPanel1.add(cbnivel, gridBagConstraints);

        btnatender.setBackground(new java.awt.Color(61, 137, 248));
        btnatender.setText("Atender");
        btnatender.setHideActionText(true);
        btnatender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnatender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnatender.setIcons(null);
        btnatender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnatenderFocusLost(evt);
            }
        });
        btnatender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnatenderMouseReleased(evt);
            }
        });
        btnatender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatenderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(btnatender, gridBagConstraints);

        btnlimpiar.setBackground(new java.awt.Color(61, 137, 248));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setHideActionText(true);
        btnlimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlimpiar.setIcons(null);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 12, 0);
        jPanel1.add(btnlimpiar, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        String nombre = this.jTnom.getText();
        String edad = this.jTedad.getText();
        String genero = this.cbgene.getSelectedItem().toString();
        int nivel = 0;
        String nivelCadena = this.cbnivel.getSelectedItem().toString();
        String observacion = this.jTobserv.getText();
        
        if (nivelCadena.equals("Muy Grave")) {
            nivel = 1;
        } else if (nivelCadena.equals("Grave")) {
            nivel = 2;
        } else if (nivelCadena.equals("Moderado")) {
            nivel = 3;
        } else if (nivelCadena.equals("Leve")) {
            nivel = 4;
        }

        Paciente p = new Paciente(String.valueOf(listaPacientes.size() + 1), nombre, edad, genero, nivel, observacion, "En espera");
        listaPacientes.add(p);
        colaP.offer(p, p.getNivel()-1);
        mostrarListaEspera(colaP);
        mostrarTabla();
        limpiar();
        this.btnatender.setEnabled(true);
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnatenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatenderActionPerformed
        if (!colaP.isEmpty()) {
            atendido = (Paciente) colaP.poll();
            mostrarListaEspera(colaP);
            
            DesktopNotify.setDefaultTheme(NotifyTheme.Green);
            DesktopNotify.showDesktopMessage("Paciente atendido", "El paciente " + atendido.getNombre() + " ha sido atendido exitosamente.", DesktopNotify.SUCCESS, 8000);
            
            for (Paciente x: listaPacientes) {
              if (x.equals(atendido)) {
                  x.setEstado("Atendido");
              }
            }
            mostrarTabla();    
        }
    }//GEN-LAST:event_btnatenderActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    public void limpiar() {
        this.jTnom.setText("");
        this.jTedad.setText("");
        this.cbgene.setSelectedIndex(0);
        this.cbnivel.setSelectedIndex(0);
        this.jTobserv.setText("");
        enabledbt();
    }

    public void mostrarListaEspera(ColaPrioridadN colaP) {
        ListaEspera modelo = new ListaEspera(colaP.toArray());
        jLespera.setModel(modelo);
    }

    private void mostrarTabla() {

        modelo = (DefaultTableModel) tbpaciente.getModel();
        modelo.setRowCount(0);

        for (Paciente x: listaPacientes) {

            modelo.addRow(new Object[]{x.getNumero(),
                x.getNombre(),
                x.getEdad(),
                x.getGenero(),
                x.getObservaciones(),
                x.getNivel(),
                x.getEstado()
            });

        }

        tbpaciente.setModel(modelo);
    }

    private void jTnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnomKeyTyped
        char val = evt.getKeyChar();
        if ((val < 'a' || val > 'z') && (val < 'A' || val > 'Z') && (val != ' ') && (val != 'ñ') && (val != 'Ñ') && (val < 'á' || val > 'ú') && (val < 'Á' || val > 'Ú')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTnomKeyTyped

    private void jTedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTedadKeyTyped
        char val = evt.getKeyChar();
        if (val < '0' || val > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTedadKeyTyped

    private void jTnomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnomKeyReleased
        enabledbt();
    }//GEN-LAST:event_jTnomKeyReleased

    private void jTedadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTedadKeyReleased
        enabledbt();
    }//GEN-LAST:event_jTedadKeyReleased

    private void jTobservKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTobservKeyReleased
        enabledbt();
    }//GEN-LAST:event_jTobservKeyReleased

    private void btnatenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnatenderFocusLost
        enabledbt();
    }//GEN-LAST:event_btnatenderFocusLost

    private void btnatenderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatenderMouseReleased
        enabledbt();
    }//GEN-LAST:event_btnatenderMouseReleased

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public newscomponents.RSButtonIcon_new btnagregar;
    public newscomponents.RSButtonIcon_new btnatender;
    public newscomponents.RSButtonIcon_new btnlimpiar;
    public RSMaterialComponent.RSComboBox cbgene;
    public RSMaterialComponent.RSComboBox cbnivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jLespera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTedad;
    private javax.swing.JTextField jTnom;
    private javax.swing.JTextArea jTobserv;
    public rojerusan.RSTableMetro tbpaciente;
    // End of variables declaration//GEN-END:variables
}
