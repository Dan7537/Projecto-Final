/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.finalproject;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

import java.awt.event.ActionListener;
/**
 *
 * @author daniel
 */
public class BaseJInternalFrame extends javax.swing.JInternalFrame {

    
    /**
     * Creates new form BaseJInternalFrame
     */
    public BaseJInternalFrame() {

        
        this.setVisible(true);

        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalirButton = new javax.swing.JButton();
        LimpiarButton = new javax.swing.JButton();
        MostrarButton = new javax.swing.JButton();
        AgregarButton = new javax.swing.JButton();
        ModificarButton = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        IdentificacionTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombresTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ApellidosTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setForeground(java.awt.Color.orange);
        setTitle("Base de datos");
        setOpaque(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        LimpiarButton.setText("Limpiar");
        LimpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarButtonActionPerformed(evt);
            }
        });

        MostrarButton.setText("Mostrar");
        MostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarButtonActionPerformed(evt);
            }
        });

        AgregarButton.setText("Agregar");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });

        ModificarButton.setText("Modificar");
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });

        EliminarButton.setText("Eliminar");
        EliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonActionPerformed(evt);
            }
        });

        IdentificacionTextField.setBackground(new java.awt.Color(0, 0, 153));
        IdentificacionTextField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identificación");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres");

        NombresTextField.setBackground(new java.awt.Color(0, 0, 153));
        NombresTextField.setForeground(new java.awt.Color(255, 255, 255));
        NombresTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos");

        ApellidosTextField.setBackground(new java.awt.Color(0, 0, 153));
        ApellidosTextField.setForeground(new java.awt.Color(255, 255, 255));
        ApellidosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgregarButton)
                            .addComponent(MostrarButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModificarButton)
                            .addComponent(LimpiarButton))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EliminarButton)
                            .addComponent(SalirButton))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ApellidosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(NombresTextField)
                                    .addComponent(IdentificacionTextField)))
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdentificacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EliminarButton)
                    .addComponent(AgregarButton)
                    .addComponent(ModificarButton))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirButton)
                    .addComponent(LimpiarButton)
                    .addComponent(MostrarButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void MostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarButtonActionPerformed
        // TODO add your handling code here:


        lis mo = new lis(base);

    
    }//GEN-LAST:event_MostrarButtonActionPerformed

    private void LimpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarButtonActionPerformed
        // TODO add your handling code here:
        IdentificacionTextField.setText("");
        NombresTextField.setText("");
        ApellidosTextField.setText("");

    }//GEN-LAST:event_LimpiarButtonActionPerformed

    private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonActionPerformed
        // TODO add your handling code here:
        //File 
    	//
        
        
        
        
         try{
            String newName = IdentificacionTextField.getText();
            String nameNumberString;
            String name;
            String sename="";
            // Using file pointer creating the file.
            //File base4 ;
           // 
            base = new File("base.txt");


            // Opening file in reading and write mode.
            RandomAccessFile raf
            = new RandomAccessFile(base, "rw");
            boolean found = false;

            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.

            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit
                = nameNumberString.split(",");

                // separating name and number.
                name = lineSplit[0];

                // if condition to find existence of record.
                if (name.equals(newName)) {
                    found = true;
                    sename = nameNumberString;
                    break;
                }
            }

            // Update the contact if record exists.
            if (found == true) {

                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");

                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                = new RandomAccessFile(tmpFile, "rw");

                // Set file pointer to start
                raf.seek(0);

                newName="";
                while (raf.getFilePointer()
                    < raf.length()) {

                    // Reading the contact from the file
                    nameNumberString = raf.readLine();

                    // Check if the fetched contact
                    // is the one to be updated
                    if (sename.equals(nameNumberString)) {

                        // Update the number of this contact
                        nameNumberString
                        = newName;
                    }
                    else{
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);

                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }}

                // The contact has been updated now
                // So copy the updated content from
                // the temporary file to original file.

                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);

                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()
                    < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());

                // Closing the resources.
                tmpraf.close();
                raf.close();

                // Deleting the temporary file
                tmpFile.delete();

            }

            // The contact to be updated
            // could not be found
            else {

                // Closing the resources.
                raf.close();

                // Print the message

                JOptionPane.showMessageDialog(null,"Identificacion no existe ");

            }

        }
        catch (IOException ioe) {

        }
        
        
        
//            int fl=JOptionPane.showConfirmDialog(null, "¿Quieres eliminar los datos?", "Eliminar", JOptionPane.YES_NO_OPTION);
//           if (fl==JOptionPane.YES_OPTION){
//
//        Path path=Paths.get("base.txt");
//           try{
//         Files.delete(path);
//           }
//           catch(IOException e){
//               e.printStackTrace();
//           }
//       	   
//
//        }
        
    }//GEN-LAST:event_EliminarButtonActionPerformed

    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        // TODO add your handling code here:\

        try {
            boolean BAN = true;
            if (IdentificacionTextField.getText().equals("")){
                BAN=false;
                JOptionPane.showMessageDialog(null, "No se ingresarón datos","ERROR",JOptionPane.ERROR_MESSAGE);
                   
            }
            // Using file pointer creating the file.
            //File 
            base = new File("base.txt");


            // Opening file in reading and write mode.
            RandomAccessFile raf
            = new RandomAccessFile(base, "rw");

            // Creating a temporary file
            // with file pointer as tmpFile.
            File tmpFile = new File("temp.txt");

            // Opening this temporary file
            // in ReadWrite Mode
            RandomAccessFile tmpraf
            = new RandomAccessFile(tmpFile, "rw");
            String nameNumberString;
            String comprobar=IdentificacionTextField.getText()+","+NombresTextField.getText()+","+ApellidosTextField.getText();
            String existe="no";
// Set file pointer to start
            raf.seek(0);

            while (raf.getFilePointer()
                < raf.length()&&BAN) {

                // Reading the contact from the file
                nameNumberString = raf.readLine();

                // Check if the fetched contact
                // is the one to be updated
                if (nameNumberString.equals(comprobar)){
                    existe="yes";
                    JOptionPane.showMessageDialog(null, "El individuo ingresado existe","ERROR",JOptionPane.ERROR_MESSAGE);
                    break;
                }


                // Add this contact in the temporary
                // file
                tmpraf.writeBytes(nameNumberString);

                // Add the line separator in the
                // temporary file
                tmpraf.writeBytes(
                    System.lineSeparator());
            }

            nameNumberString = IdentificacionTextField.getText()+","+NombresTextField.getText()+","+ApellidosTextField.getText();
            tmpraf.writeBytes(nameNumberString);

            tmpraf.writeBytes(
                System.lineSeparator());

            // Set both files pointers to start
            raf.seek(0);
            tmpraf.seek(0);

            // Copy the contents from
            // the temporary file to original file.
            while (tmpraf.getFilePointer()
                < tmpraf.length() && !existe.equals( "yes")&& BAN) {
                raf.writeBytes(tmpraf.readLine());
                raf.writeBytes(System.lineSeparator());
            }

            // Set the length of the original file
            // to that of temporary.
            raf.setLength(tmpraf.length());

            // Closing the resources.
            tmpraf.close();
            raf.close();

            // Deleting the temporary file
            tmpFile.delete();

        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }

        catch (NumberFormatException nef) {
            System.out.println(nef);
        }

    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        // TODO add your handling code here:
        // Get the name of the contact to be updated
        // from the Command line argument
        try{
            String newName = IdentificacionTextField.getText();
            String nameNumberString;
            String name;
            String sename="";
            // Using file pointer creating the file.
            //File base4 ;
           // 
            base = new File("base.txt");


            // Opening file in reading and write mode.
            RandomAccessFile raf
            = new RandomAccessFile(base, "rw");
            boolean found = false;

            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.

            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit
                = nameNumberString.split(",");

                // separating name and number.
                name = lineSplit[0];

                // if condition to find existence of record.
                if (name.equals(newName)) {
                    found = true;
                    sename = nameNumberString;
                    break;
                }
            }

            // Update the contact if record exists.
            if (found == true) {

                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");

                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                = new RandomAccessFile(tmpFile, "rw");

                // Set file pointer to start
                raf.seek(0);

                newName=IdentificacionTextField.getText()+","+NombresTextField.getText()+","+ApellidosTextField.getText();

                while (raf.getFilePointer()
                    < raf.length()) {

                    // Reading the contact from the file
                    nameNumberString = raf.readLine();

                    // Check if the fetched contact
                    // is the one to be updated
                    if (sename.equals(nameNumberString)) {

                        // Update the number of this contact
                        nameNumberString
                        = newName;
                    }

                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);

                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }

                // The contact has been updated now
                // So copy the updated content from
                // the temporary file to original file.

                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);

                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()
                    < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());

                // Closing the resources.
                tmpraf.close();
                raf.close();

                // Deleting the temporary file
                tmpFile.delete();

            }

            // The contact to be updated
            // could not be found
            else {

                // Closing the resources.
                raf.close();

                // Print the message

                JOptionPane.showMessageDialog(null,"Identificacion no existe ");

            }

        }
        catch (IOException ioe) {

        }

    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void NombresTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresTextFieldActionPerformed

    private void ApellidosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosTextFieldActionPerformed
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton;
    private javax.swing.JTextField ApellidosTextField;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JTextField IdentificacionTextField;
    private javax.swing.JButton LimpiarButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JButton MostrarButton;
    private javax.swing.JTextField NombresTextField;
    private javax.swing.JButton SalirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    File base =new File("base.txt");
    // End of variables declaration//GEN-END:variables

}

