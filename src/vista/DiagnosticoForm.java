/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import DAO.DiagnosticoDao;
import DAO.RespuestaDao;
import DAO.SesionDao;
import DAO.SesionDiagnosticoDao;
import DAO.UsuarioDao;
import javax.swing.JOptionPane;
import modelos.Diagnostico;
import modelos.Respuesta;
import modelos.Sesion;
import modelos.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;

/**
 *
 * @author Marlon
 */
public class DiagnosticoForm extends javax.swing.JInternalFrame {

    private List<Integer> opcionesSeleccionadas = new ArrayList<>();

    public DiagnosticoForm() {
        initComponents(); // Inicializa todos los componentes creados por NetBeans
        inicializarBotones();
        inicializarOpciones();
    }

    private void inicializarBotones() {
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        buttonGroup5 = new ButtonGroup();

        // Agregar los botones al grupo
        buttonGroup1.add(radiobtn1);
        buttonGroup1.add(radiobtn6);

        buttonGroup2.add(radiobtn2);
        buttonGroup2.add(radiobtn7);

        buttonGroup3.add(radiobtn3);
        buttonGroup3.add(radiobtn8);

        buttonGroup4.add(radiobtn4);
        buttonGroup4.add(radiobtn9);

        buttonGroup5.add(radiobtn5);
        buttonGroup5.add(radiobtn10);
    }

    // ✅ Inicializa el arreglo para las respuestas
    private void inicializarOpciones() {
        opcionesSeleccionadas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            opcionesSeleccionadas.add(-1); // -1 significa que no ha respondido
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbcedula = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbpregunta1 = new javax.swing.JLabel();
        lbpregunta2 = new javax.swing.JLabel();
        lbpregunta3 = new javax.swing.JLabel();
        lbpregunta4 = new javax.swing.JLabel();
        lbpregunta5 = new javax.swing.JLabel();
        radiobtn1 = new javax.swing.JRadioButton();
        radiobtn2 = new javax.swing.JRadioButton();
        radiobtn3 = new javax.swing.JRadioButton();
        radiobtn4 = new javax.swing.JRadioButton();
        radiobtn5 = new javax.swing.JRadioButton();
        radiobtn6 = new javax.swing.JRadioButton();
        radiobtn7 = new javax.swing.JRadioButton();
        radiobtn8 = new javax.swing.JRadioButton();
        radiobtn9 = new javax.swing.JRadioButton();
        radiobtn10 = new javax.swing.JRadioButton();
        btnguardar_enviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Diagnostico");

        lbcedula.setText("Cedula");

        lbnombre.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbcedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Datos del paciente");

        lbpregunta1.setText("¿Experimenta sed intensa y orina con más frecuencia de lo habitual?");

        lbpregunta2.setText("¿Ha notado aumento de peso inexplicado, cansancio y sensación de frío?");

        lbpregunta3.setText("¿Ha perdido peso sin proponérselo, con palpitaciones o intolerancia al calor?");

        lbpregunta4.setText("¿Tiene aumento de grasa en la cara, moretones fáciles o estrías abdominales?");

        lbpregunta5.setText("¿Siente cansancio extremo, pérdida de peso, náuseas o mareos al ponerse de pie (baja presión)?");

        radiobtn1.setText("si");

        radiobtn2.setText("si");

        radiobtn3.setText("si");

        radiobtn4.setText("si");

        radiobtn5.setText("si");

        radiobtn6.setText("no");

        radiobtn7.setText("no");

        radiobtn8.setText("no");
        radiobtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn8ActionPerformed(evt);
            }
        });

        radiobtn9.setText("no");

        radiobtn10.setText("no");

        btnguardar_enviar.setText("Guardar y enviar");
        btnguardar_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbpregunta5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radiobtn5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbpregunta4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radiobtn4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbpregunta3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radiobtn3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbpregunta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radiobtn2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbpregunta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radiobtn1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radiobtn6)
                            .addComponent(radiobtn7)
                            .addComponent(radiobtn8)
                            .addComponent(radiobtn9)
                            .addComponent(radiobtn10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnguardar_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpregunta1)
                    .addComponent(radiobtn1)
                    .addComponent(radiobtn6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpregunta2)
                    .addComponent(radiobtn2)
                    .addComponent(radiobtn7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpregunta3)
                    .addComponent(radiobtn3)
                    .addComponent(radiobtn8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpregunta4)
                    .addComponent(radiobtn4)
                    .addComponent(radiobtn9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpregunta5)
                    .addComponent(radiobtn5)
                    .addComponent(radiobtn10))
                .addGap(33, 33, 33)
                .addComponent(btnguardar_enviar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Preguntas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiobtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn8ActionPerformed

    }//GEN-LAST:event_radiobtn8ActionPerformed

    private void btnguardar_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar_enviarActionPerformed
        try {
            String cedula = txtcedula.getText().trim();
            String nombre = txtnombre.getText().trim();

            if (cedula.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            // Leer selección de cada pregunta (1 = sí, 0 = no, -1 = sin respuesta)
            opcionesSeleccionadas.set(0, radiobtn1.isSelected() ? 1 : (radiobtn6.isSelected() ? 0 : -1));
            opcionesSeleccionadas.set(1, radiobtn2.isSelected() ? 1 : (radiobtn7.isSelected() ? 0 : -1));
            opcionesSeleccionadas.set(2, radiobtn3.isSelected() ? 1 : (radiobtn8.isSelected() ? 0 : -1));
            opcionesSeleccionadas.set(3, radiobtn4.isSelected() ? 1 : (radiobtn9.isSelected() ? 0 : -1));
            opcionesSeleccionadas.set(4, radiobtn5.isSelected() ? 1 : (radiobtn10.isSelected() ? 0 : -1));

            // Validar que todas las preguntas tengan respuesta
            for (int i = 0; i < opcionesSeleccionadas.size(); i++) {
                if (opcionesSeleccionadas.get(i) == -1) {
                    JOptionPane.showMessageDialog(this, "Debe responder todas las preguntas.");
                    return;
                }
            }

            // 1) Crear o buscar usuario
            UsuarioDao usuarioDao = new UsuarioDao();
            int usuarioId = usuarioDao.obtenerIdUsuarioPorCedula(cedula);

            if (usuarioId == -1) {
                Usuario nuevoUsuario = new Usuario(cedula, nombre);
                usuarioId = usuarioDao.insertarUsuario(nuevoUsuario);
            }

            if (usuarioId == -1) {
                JOptionPane.showMessageDialog(this, "Error al registrar el usuario.");
                return;
            }

            // 2) Crear sesión
            SesionDao sesionDao = new SesionDao();
            Sesion sesion = new Sesion();
            sesion.setUsuarioId(usuarioId);
            sesion.setFechaInicio(new Date());
            int sesionId = sesionDao.insertarSesion(sesion);

            if (sesionId == -1) {
                JOptionPane.showMessageDialog(this, "Error al crear la sesión.");
                return;
            }

            // 3) Guardar respuestas
            RespuestaDao respuestaDao = new RespuestaDao();
            for (int i = 0; i < opcionesSeleccionadas.size(); i++) {
                int preguntaId = i + 1;
                int opcionSeleccionada = opcionesSeleccionadas.get(i);
                respuestaDao.guardarRespuesta(sesionId, preguntaId, opcionSeleccionada);
            }

            // 4) Generar diagnóstico
            String diagnosticoTexto = generarDiagnostico(opcionesSeleccionadas);

            // 5) Insertar diagnóstico
            List<Integer> respuestasList = new ArrayList<>(opcionesSeleccionadas);
            Diagnostico diagnostico = new Diagnostico(diagnosticoTexto);
            DiagnosticoDao diagnosticoDao = new DiagnosticoDao();
            int diagnosticoId = diagnosticoDao.insertarDiagnostico(cedula, nombre, respuestasList, diagnostico);

            if (diagnosticoId == -1) {
                JOptionPane.showMessageDialog(this, "Error al guardar el diagnóstico.");
                return;
            }

            // 6) Asociar diagnóstico con la sesión
            SesionDiagnosticoDao sesionDiagnosticoDao = new SesionDiagnosticoDao();
            sesionDiagnosticoDao.insertarSesionDiagnostico(sesionId, diagnosticoId);

            // 7) Mostrar al usuario
            JOptionPane.showMessageDialog(this, "Diagnóstico guardado correctamente:\n" + diagnosticoTexto);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar diagnóstico: " + e.getMessage());
        }
    }//GEN-LAST:event_btnguardar_enviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar_enviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbcedula;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbpregunta1;
    private javax.swing.JLabel lbpregunta2;
    private javax.swing.JLabel lbpregunta3;
    private javax.swing.JLabel lbpregunta4;
    private javax.swing.JLabel lbpregunta5;
    private javax.swing.JRadioButton radiobtn1;
    private javax.swing.JRadioButton radiobtn10;
    private javax.swing.JRadioButton radiobtn2;
    private javax.swing.JRadioButton radiobtn3;
    private javax.swing.JRadioButton radiobtn4;
    private javax.swing.JRadioButton radiobtn5;
    private javax.swing.JRadioButton radiobtn6;
    private javax.swing.JRadioButton radiobtn7;
    private javax.swing.JRadioButton radiobtn8;
    private javax.swing.JRadioButton radiobtn9;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    private String generarDiagnostico(List<Integer> opciones) {
        if (opciones.get(0) == 1) {
            return "Posible diabetes";
        }
        if (opciones.get(1) == 1) {
            return "Posible hipotiroidismo";
        }
        if (opciones.get(2) == 1) {
            return "Posible hipertiroidismo";
        }
        if (opciones.get(3) == 1) {
            return "Posible síndrome de Cushing";
        }
        if (opciones.get(4) == 1) {
            return "Posible insuficiencia suprarrenal";
        }
        return "Sin indicios claros de enfermedad endocrina";

    }

}
