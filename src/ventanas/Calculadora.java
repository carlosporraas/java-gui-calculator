package ventanas;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnLimpia = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora ");
        setBackground(new java.awt.Color(102, 102, 0));
        setForeground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jLabel1.setText("Numero 1");

        jLabel2.setText("Numero 2");

        txtNum1.setToolTipText("Ingresar numero 1");

        txtNum2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNum2.setToolTipText("Ingresar numero 2");

        btnLimpia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mop.png"))); // NOI18N
        btnLimpia.setToolTipText("Limpia los campos");
        btnLimpia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        btnSuma.setToolTipText("Boton de suma");
        btnSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnMultiplica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/multiplication.png"))); // NOI18N
        btnMultiplica.setToolTipText("Boton de multiplicar");
        btnMultiplica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicaActionPerformed(evt);
            }
        });

        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minus.png"))); // NOI18N
        btnResta.setToolTipText("Boton de resta");
        btnResta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDivide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/division.png"))); // NOI18N
        btnDivide.setToolTipText("Boton de division");
        btnDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        txtResultado.setEditable(false);
        txtResultado.setToolTipText("El resultado se mostrará acá");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNum1)
                            .addComponent(txtNum2)
                            .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDivide)
                            .addComponent(btnSuma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMultiplica)
                            .addComponent(btnResta))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpia)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuma)
                    .addComponent(btnResta))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMultiplica)
                            .addComponent(btnDivide))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpia))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed

        Double n1 = Double.valueOf(this.txtNum1.getText());
        Double n2 = Double.valueOf(this.txtNum2.getText());

        Double total = n1 + n2;
        this.txtResultado.setText(total.toString());

    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed

        Double n1 = Double.valueOf(this.txtNum1.getText());
        Double n2 = Double.valueOf(this.txtNum2.getText());

        Double total = n1 - n2;

        this.txtResultado.setText(total.toString());

    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed

        Double n1 = Double.valueOf(this.txtNum1.getText());
        Double n2 = Double.valueOf(this.txtNum2.getText());

        Double total = n1 / n2;

        if (n2 != 0) {
            this.txtResultado.setText(total.toString());
        } else {
            this.txtResultado.setText("Division entre 0");
        }


    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicaActionPerformed
        Double n1 = Double.valueOf(this.txtNum1.getText());
        Double n2 = Double.valueOf(this.txtNum2.getText());
        Double total = n1 * n2;

        this.txtResultado.setText(total.toString());
    }//GEN-LAST:event_btnMultiplicaActionPerformed


    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed

        this.txtNum1.setText("");
        this.txtNum2.setText("");
        this.txtResultado.setText("");
        this.txtNum1.requestFocus();
    }//GEN-LAST:event_btnLimpiaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnLimpia;
    private javax.swing.JButton btnMultiplica;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
