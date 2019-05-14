
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.HeuristicaRefinamento;
import util.Leitor;
import util.PCV;

/* @author Guilherme Afonso Ribeiro Gomes */
public class TelaHeuristicas extends javax.swing.JFrame {
    HeuristicaRefinamento hr = new HeuristicaRefinamento();
    Leitor le = new Leitor();
    PCV pcv = new PCV();
    
    public TelaHeuristicas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.setText("1 - Solucao Gulosa - Vizinho mais proximo");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton5.setText("1 - Solucao Gulosa - Vizinho mais proximo");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Heuristica Refinamento");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Arquivo:");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton2.setText("Método Primeira Melhora");
        jButton2.setToolTipText("");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.setText("Método da Descida");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton6.setText("Método Descida Primeira Melhora");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton7.setText("Método da Descida Randômica");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 2, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Saida:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Trabalho Pratico - Inteligencia Computacional para Otimizacao ");

        jButton8.setText("Voltar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C50.TXT", "A280.TXT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Solução Inicial:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GULOSA VIZINHO MAIS PRÓXIMO", "GULOSA INSERÇÃO MAIS BARATA", "SOLUÇÃO ALEATÓRIA" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton8)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton8))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Double [][] d = null;
        ArrayList<Integer>sol = null;
        int tam = 0;
        if(jComboBox1.getSelectedIndex()==0){
            tam=51;
        } 
        if(jComboBox1.getSelectedIndex()==1){
            tam = 280;
        }
        try {
            d = le.lerArquivo(String.valueOf(jComboBox1.getSelectedItem()),tam);
        } catch (IOException ex) {
            Logger.getLogger(TelaHeuristicas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Gulosa Vizinho mais próximo
        if(jComboBox2.getSelectedIndex()==0){
            sol = pcv.solucaoGulosaVizinhoMaisProximo(tam,d);
        }
        //Gulosa Inserção mais barata
        if(jComboBox2.getSelectedIndex()==1){
            sol = pcv.solucaoGulosaInsercaoMaisBarata(tam,d);
        }
        //Aleatória
        if(jComboBox2.getSelectedIndex()==2){
            sol = pcv.solucaoAleatoria(tam, d);      
        }
        Double custoAnterior = Double.parseDouble(pcv.calculaCusto(d, tam, sol));
        Double custo = hr.metodoPrimeiraMelhora(tam, sol, d, custoAnterior);
        jTextArea1.setText(jComboBox2.getSelectedItem()+"\nArquivo: "+jComboBox1.getSelectedItem()+"\n-> Método Primeira Melhora"
                + "\nCusto Após Refinamento: "+String.valueOf(custo)+"\nROTA: "+sol+
                "\nCusto Anterior: "+String.valueOf(custoAnterior));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:    
//        jTextArea1.setText("\n Arquivo: "+String.valueOf(jComboBox1.getSelectedItem())+"\n Arquivo2: "
//                +String.valueOf(jComboBox2.getSelectedItem()));        
        Double [][] d = null;
        ArrayList<Integer>sol = null;
        int tam = 0;
        if(jComboBox1.getSelectedIndex()==0){
            tam=51;
        } 
        if(jComboBox1.getSelectedIndex()==1){
            tam = 280;
        }
        try {
            d = le.lerArquivo(String.valueOf(jComboBox1.getSelectedItem()),tam);
        } catch (IOException ex) {
            Logger.getLogger(TelaHeuristicas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Gulosa Vizinho mais próximo
        if(jComboBox2.getSelectedIndex()==0){
            sol = pcv.solucaoGulosaVizinhoMaisProximo(tam,d);
        }
        //Gulosa Inserção mais barata
        if(jComboBox2.getSelectedIndex()==1){
            sol = pcv.solucaoGulosaInsercaoMaisBarata(tam,d);
        }
        //Aleatória
        if(jComboBox2.getSelectedIndex()==2){
            sol = pcv.solucaoAleatoria(tam, d);        
        }
        Double custoAnterior = Double.parseDouble(pcv.calculaCusto(d, tam, sol));
        Double custo = hr.metodoDescida(tam, sol, d);
        jTextArea1.setText(jComboBox2.getSelectedItem()+"\nArquivo: "+jComboBox1.getSelectedItem()+"\n-> Método Descida"
                + "\nCusto Após Refinamento: "+String.valueOf(custo)+"\nROTA: "+sol+
                "\nCusto Anterior: "+String.valueOf(custoAnterior));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Double [][] d = null;
        ArrayList<Integer>sol = null;
        int tam = 0;
        if(jComboBox1.getSelectedIndex()==0){
            tam=51;
        } 
        if(jComboBox1.getSelectedIndex()==1){
            tam = 280;
        }
        try {
            d = le.lerArquivo(String.valueOf(jComboBox1.getSelectedItem()),tam);
        } catch (IOException ex) {
            Logger.getLogger(TelaHeuristicas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Gulosa Vizinho mais próximo
        if(jComboBox2.getSelectedIndex()==0){
            sol = pcv.solucaoGulosaVizinhoMaisProximo(tam,d);
        }
        //Gulosa Inserção mais barata
        if(jComboBox2.getSelectedIndex()==1){
            sol = pcv.solucaoGulosaInsercaoMaisBarata(tam,d);
        }
        //Aleatória
        if(jComboBox2.getSelectedIndex()==2){
            sol = pcv.solucaoAleatoria(tam, d);        
        }
        Double custoAnterior = Double.parseDouble(pcv.calculaCusto(d, tam, sol));
        Double custo = hr.metodoDescidaPrimeiraMelhora(tam, sol, d);
        jTextArea1.setText(jComboBox2.getSelectedItem()+"\nArquivo: "+jComboBox1.getSelectedItem()+"\n-> Método Descida Primeira Melhora"
                + "\nCusto Após Refinamento: "+String.valueOf(custo)+"\nROTA: "+sol+
                "\nCusto Anterior: "+String.valueOf(custoAnterior));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Double [][] d = null;
        ArrayList<Integer>sol = null;
        int tam = 0;
        if(jComboBox1.getSelectedIndex()==0){
            tam=51;
        } 
        if(jComboBox1.getSelectedIndex()==1){
            tam = 280;
        }
        try {
            d = le.lerArquivo(String.valueOf(jComboBox1.getSelectedItem()),tam);
        } catch (IOException ex) {
            Logger.getLogger(TelaHeuristicas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Gulosa Vizinho mais próximo
        if(jComboBox2.getSelectedIndex()==0){
            sol = pcv.solucaoGulosaVizinhoMaisProximo(tam,d);
        }
        //Gulosa Inserção mais barata
        if(jComboBox2.getSelectedIndex()==1){
            sol = pcv.solucaoGulosaInsercaoMaisBarata(tam,d);
        }
        //Aleatória
        if(jComboBox2.getSelectedIndex()==2){
            sol = pcv.solucaoAleatoria(tam, d);      
        }
        Double custoAnterior = Double.parseDouble(pcv.calculaCusto(d, tam, sol));
        Double custo = hr.metodoDescidaRandomica(tam, sol, d, (int) (0.7*tam*(tam-1)/2));
        jTextArea1.setText(jComboBox2.getSelectedItem()+"\nArquivo: "+jComboBox1.getSelectedItem()+"\n-> Método Descida Randômica"
                + "\nCusto Após Refinamento: "+String.valueOf(custo)+"\nROTA: "+sol+
                "\nCusto Anterior: "+String.valueOf(custoAnterior));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHeuristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHeuristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHeuristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHeuristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHeuristicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}