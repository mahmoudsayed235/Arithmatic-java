
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Compress extends javax.swing.JFrame {
    public Compress() {
        initComponents();
    }

    private static double showRandomInteger(double aStart, double aEnd, Random aRandom) {
        if (aStart > aEnd) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        double range = (double) aEnd - (double) aStart;
        // compute a fraction of the range, 0 <= frac < range
        double fraction = (double) (range * aRandom.nextDouble());
        double randomNumber = (double) (fraction + aStart);
//        log("Generated : " + randomNumber);
//System.out.println("Generated : "+ randomNumber);
        return randomNumber;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Decompress_Feld = new javax.swing.JTextField();
        Compress_fild = new javax.swing.JTextField();
        compress = new javax.swing.JButton();
        Decompress = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Decompress_label = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        Decompress_Feld.setEditable(false);

        Compress_fild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Compress_fildActionPerformed(evt);
            }
        });

        compress.setBackground(new java.awt.Color(255, 255, 255));
        compress.setForeground(new java.awt.Color(153, 0, 0));
        compress.setText("Compress>>");
        compress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compressActionPerformed(evt);
            }
        });

        Decompress.setBackground(new java.awt.Color(255, 255, 255));
        Decompress.setForeground(new java.awt.Color(153, 0, 0));
        Decompress.setText("<<Decompress");
        Decompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecompressActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 48));
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Arthimetic");

        Decompress_label.setFont(new java.awt.Font("Aharoni", 0, 14));
        Decompress_label.setForeground(new java.awt.Color(153, 0, 0));

        Clear.setText("<<Clear All>>");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Compress_fild, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Decompress_label, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(Decompress, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(compress, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Decompress_Feld, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(compress))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(Compress_fild, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(Clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exit)
                                .addGap(38, 38, 38)
                                .addComponent(Decompress))
                            .addComponent(Decompress_label, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(243, Short.MAX_VALUE)
                        .addComponent(Decompress_Feld, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compressActionPerformed

        PrintWriter output, table;
        try {
            output = new PrintWriter("compress.txt");
            table = new PrintWriter("table.txt");
            String data = "";
            char[] array;
            String dict = "";
            String comp = "";
            String sub = "";
            String before_char = "";
            double up = 1;
            double lo = 0;
            double dummy_up = 0;
            double dummy_lo = 0;
            int count = 0;
            data = this.Compress_fild.getText();
            array = data.toCharArray();
            ArrayList<String> ch = new ArrayList();
            ArrayList<Double> fl = new ArrayList();
            ArrayList<Double> com = new ArrayList();
            ArrayList<String> dic = new ArrayList();
            double prop = 0;
            double before = 0;
            double nw = 0;
            for (int i = 0; i <= 255; i++) {
                dict += (char) i;
                dic.add(dict);
                dict = "";
            }
            for (int i = 0; i < dic.size(); i++) {
                for (int j = 0; j < data.length(); j++) {
                    comp += array[j];
                    if (comp.equals(dic.get(i))) {
                        count++;
                    }
                    comp = "";

                }
                if (count > 0) {
                    prop = (double) count / (double) data.length();
                    ch.add(dic.get(i));
                    fl.add(prop);

                }
                count = 0;
            }
            table.println(data.length());
            com.add(fl.get(0));
            table.println(ch.get(0) + fl.get(0));
            for (int l = 1; l < fl.size(); l++) {

                com.add(fl.get(l) + com.get(com.size() - 1));
                table.println(ch.get(l) + com.get(l));
            }
            for (int i = 0; i < data.length(); i++) {
                sub += array[i];
                for (int j = 0; j < com.size(); j++) {
                    if (sub.equals(ch.get(j))) {
                        nw = com.get(j);
                        break;
                    }
                }
                if (i > 0) {
                    before_char += array[i];
                    for (int j = 0; j < com.size(); j++) {
                        if (before_char.equals(ch.get(j)) && j - 1 >= 0) {
                            before = com.get(j - 1);
                            break;
                        }

                    }
                }
                dummy_lo = lo + ((up - lo) * before);
                dummy_up = lo + ((up - lo) * nw);
                lo = dummy_lo;
                up = dummy_up;
                before_char = "";
                sub =   "";
                before = 0;
            }
            Random random = new Random();
            double rand = Compress.showRandomInteger(lo, up, random);

            this.Decompress_Feld.setText("Compress : " + rand);
            output.println(rand);
            output.close();
            table.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_compressActionPerformed

    private void DecompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecompressActionPerformed

        File file = new File("Compress.txt");
        File f = new File("table.txt");
        Scanner kb, key;
        try {
            kb = new Scanner(file);
            key = new Scanner(f);


            ArrayList<String> ch = new ArrayList();
            ArrayList<Double> com = new ArrayList();
            double fl = kb.nextDouble();
            int len = key.nextInt();
            String dummy = "";
            double t;
            String h = "";
            key.nextLine();
            while (key.hasNext()) {
                dummy = key.nextLine();
                h += dummy.charAt(0);
                ch.add(h);
                dummy = dummy.substring(1);
                t = Double.parseDouble(dummy);
                com.add(t);
                h = "";
            }
            System.out.println(ch);
            System.out.println(com);
            String result = "";
            for (int k = 0; k < len; k++) {
                int i;
                for (i = 0; i < com.size(); i++) {
                    if (fl < com.get(i)) {
                        break;
                    }
                }
System.out.println(fl +"......"+ com.get(i)+"......."+i);
                result += ch.get(i);
                double dum = 0;
                if (i - 1 < 0) {
                    dum = 0;
                } else {
                    dum = com.get(i - 1);
                }
                fl = (fl - dum) / (com.get(i) - dum);
            System.out.println(fl+"==="+ch.get(i));
            }
            this.Decompress_label.setText(result);
            key.close();
            kb.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DecompressActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
this.Compress_fild.setText("");
this.Decompress_Feld.setText("");
this.Decompress_label.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void Compress_fildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Compress_fildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Compress_fildActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Compress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Compress_fild;
    private javax.swing.JButton Decompress;
    private javax.swing.JTextField Decompress_Feld;
    private javax.swing.JLabel Decompress_label;
    private javax.swing.JButton Exit;
    private javax.swing.JButton compress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
