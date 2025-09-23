/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import conexion.conexionbd;

/**
 *
 * @author Marlon
 */
public class Mdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Llamar a la ventana principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        if (conexionbd.getConnection() != null) {
            System.out.println("Conexion exitosa a la base de datos");
        } else {
            System.out.println("Error en la conexión");
        }
    }
    
}
