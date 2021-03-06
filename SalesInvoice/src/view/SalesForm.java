/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SalesListener;
import model.InvoiceHeader;
import model.InvoiceHeaderTable;
import model.InvoiceLineTable;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Taroook-3ashry
 */
public class SalesForm extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrame
     */
    public SalesForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoicesTable.getSelectionModel().addListSelectionListener(invoicelistener);
        createNewInvoice = new javax.swing.JButton();
        createNewInvoice.addActionListener(invoicelistener);
        deleteInvoice = new javax.swing.JButton();
        deleteInvoice.addActionListener(invoicelistener);
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoicesItems = new javax.swing.JTable();
        newLine = new javax.swing.JButton();
        newLine.addActionListener(invoicelistener);
        deleteLine = new javax.swing.JButton();
        deleteLine.addActionListener(invoicelistener);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custNameTF = new javax.swing.JTextField();
        invDateTF = new javax.swing.JTextField();
        invNumLbl = new javax.swing.JLabel();
        invTotalLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFile = new javax.swing.JMenuItem();
        loadFile.addActionListener(invoicelistener);
        saveFile = new javax.swing.JMenuItem();
        saveFile.addActionListener(invoicelistener);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoicesTable);

        createNewInvoice.setText("Create New Invoice");
        createNewInvoice.setActionCommand("CreateNewInvoice");

        deleteInvoice.setText("Delete Invoice");
        deleteInvoice.setActionCommand("DeleteInvoice");

        jLabel5.setText("Invoices Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(createNewInvoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteInvoice)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInvoice)
                    .addComponent(createNewInvoice))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        invoicesItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invoicesItems);

        newLine.setText("New Line");
        newLine.setActionCommand("CreateNewLine");

        deleteLine.setText("Delete Line");
        deleteLine.setActionCommand("DeleteLine");
        deleteLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLineActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice ID");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer name");

        jLabel4.setText("Invoice Total");

        jLabel6.setText("Invoices Items");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(invNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(invTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(invDateTF))))
                .addGap(634, 634, 634))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(newLine)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteLine))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addGap(278, 278, 278)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(invDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(custNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invTotalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newLine)
                    .addComponent(deleteLine))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        loadFile.setText("Load File");
        loadFile.setActionCommand("LoadFile");
        jMenu1.add(loadFile);

        saveFile.setText("Save File");
        saveFile.setActionCommand("SaveFile");
        jMenu1.add(saveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteLineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewInvoice;
    private javax.swing.JTextField custNameTF;
    private javax.swing.JButton deleteInvoice;
    private javax.swing.JButton deleteLine;
    private javax.swing.JTextField invDateTF;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTotalLbl;
    private javax.swing.JTable invoicesItems;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFile;
    private javax.swing.JButton newLine;
    private javax.swing.JMenuItem saveFile;
    // End of variables declaration//GEN-END:variables

    private final List<InvoiceHeader> allInvoices = new ArrayList<>();
    private InvoiceHeaderTable invoiceHeaderTable;
    private InvoiceLineTable invoiceLinesTable;
    private InvoiceHeaderPopUp headerPopUp;
    private InvoiceLinePopUp linePopUp;
    private final SalesListener invoicelistener = new SalesListener(this);

    public SalesListener getInvoicelistener() {
        return invoicelistener;
    }

    public void setHeaderPopUp(InvoiceHeaderPopUp headerPopUp) {
        this.headerPopUp = headerPopUp;
    }

    public void setLinePopUp(InvoiceLinePopUp linePopUp) {
        this.linePopUp = linePopUp;
    }

    public void setInvoiceHeaderTable(InvoiceHeaderTable invoiceHeaderTable) {
        this.invoiceHeaderTable = invoiceHeaderTable;
    }

    public void setInvoiceLinesTable(InvoiceLineTable invoiceLinesTable) {
        this.invoiceLinesTable = invoiceLinesTable;
    }

    public JButton getCreateInvBtn() {
        return createNewInvoice;
    }

    public JButton getCreateLineBtn() {
        return newLine;
    }

    public JTextField getCustNameTF() {
        return custNameTF;
    }

    public JButton getDeleteInvBtn() {
        return deleteInvoice;
    }

    public JButton getDeleteLineBtn() {
        return deleteLine;
    }

    public JTextField getInvDateTF() {
        return invDateTF;
    }

    public JTable getInvLinesTable() {
        return invoicesItems;
    }

    public JLabel getInvNum() {
        return invNumLbl;
    }

    public JLabel getInvTotal() {
        return invTotalLbl;
    }

    public JTable getInvoicesTable() {
        return invoicesTable;
    }

    public JMenuItem getLoadFile() {
        return loadFile;
    }

    public JMenuItem getSaveFile() {
        return saveFile;
    }

    public List<InvoiceHeader> getInvoicesHeaders() {
        return allInvoices;
    }

    public InvoiceHeaderTable getInvoiceHeaderTable() {
        return invoiceHeaderTable;
    }

    public InvoiceLineTable getInvoiceLinesTable() {
        return invoiceLinesTable;
    }

    public InvoiceHeaderPopUp getHeaderPopUp() {
        return headerPopUp;
    }

    public InvoiceLinePopUp getLinePopUp() {
        return linePopUp;
    }


}
