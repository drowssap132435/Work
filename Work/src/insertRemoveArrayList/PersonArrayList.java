/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertRemoveArrayList;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author terr5020
 */
public class PersonArrayList extends javax.swing.JFrame {

    ArrayList<Person>people = new ArrayList();
    DefaultListModel list = new DefaultListModel();
    public PersonArrayList() {
        initComponents();
        people.add(new Person("Bob",25,"M"));
        people.add(new Person("Fran",55,"F"));
        people.add(new Person("Mike",15,"M"));
        people.add(new Person("Sue",30,"F"));
        listPeople.setModel(list);
        for (Person p : people) {
            list.addElement(p.getName());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPeople = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        optmale = new javax.swing.JRadioButton();
        optfemale = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuclear = new javax.swing.JMenuItem();
        mnuadd = new javax.swing.JMenuItem();
        mnudelete = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuall = new javax.swing.JMenuItem();
        mnufemale = new javax.swing.JMenuItem();
        mnumale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPeople);

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btngroup.add(optmale);
        optmale.setText("Male");
        optmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optmaleActionPerformed(evt);
            }
        });

        btngroup.add(optfemale);
        optfemale.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optmale)
                .addGap(18, 18, 18)
                .addComponent(optfemale)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optmale)
                    .addComponent(optfemale))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuclear.setText("Clear");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        mnuadd.setText("Add");
        mnuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuadd);

        mnudelete.setText("Delete");
        mnudelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudeleteActionPerformed(evt);
            }
        });
        jMenu2.add(mnudelete);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuall.setText("Show All");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        jMenu3.add(mnuall);

        mnufemale.setText("Female");
        mnufemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufemaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnufemale);

        mnumale.setText("Male");
        mnumale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnumale);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        clear();
        
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddActionPerformed
        PDialog p=new PDialog(this, true);
        p.setModal(true);
        p.setLocationRelativeTo(this);
        p.setVisible(true);
        people.add(p.getPerson());
        refresh();
    }//GEN-LAST:event_mnuaddActionPerformed

    private void mnudeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudeleteActionPerformed
        String temp=JOptionPane.showInputDialog(this, "Which Person do you want to delete?");
        //if (search(pe;ople,temp)==-1)
           JOptionPane.showMessageDialog(this, "No such person");
        JOptionPane.showMessageDialog(this, temp);
        people.remove(search(people,temp));
        
    }//GEN-LAST:event_mnudeleteActionPerformed

    private void optmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optmaleActionPerformed

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
        clear();
        list.clear();
        for (Person p : people) {
            list.addElement(p.getName());
        }
        
    }//GEN-LAST:event_mnuallActionPerformed

    private void listPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeopleMouseClicked
        String name=""+listPeople.getSelectedValue();
        int loc=search(people,new Person(name,0,""));
        show(people.get(loc));
    }//GEN-LAST:event_listPeopleMouseClicked

    private void mnufemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufemaleActionPerformed
            clear();
            list.clear();
            for (Person p : people) {
            if(p.getSex().equals("F"))
                list.addElement(p.getName());
        }
    }//GEN-LAST:event_mnufemaleActionPerformed

    private void mnumaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumaleActionPerformed
        clear();
        list.clear();
            for (Person p : people) {
            if(p.getSex().equals("M"))
                list.addElement(p.getName());
        }
    }//GEN-LAST:event_mnumaleActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

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
            java.util.logging.Logger.getLogger(PersonArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonArrayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonArrayList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listPeople;
    private javax.swing.JMenuItem mnuadd;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnudelete;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnufemale;
    private javax.swing.JMenuItem mnumale;
    private javax.swing.JRadioButton optfemale;
    private javax.swing.JRadioButton optmale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    public void clear(){
        txtname.setText("");
        txtage.setText("");
        btngroup.clearSelection();
        listPeople.clearSelection();
    }
    public void refresh(){
        list.clear();
        for (Person p : people) {
            list.addElement(p.getName());
        }
    }
    public void show(Person p){
        txtname.setText(p.getName());
        txtage.setText(""+p.getAge());
        if(p.getSex()=="M")
            optmale.setSelected(true);
        else
            optfemale.setSelected(true);
    }
    public static int search (ArrayList a, Object searchValue){
	   int left = 0;
	   int right = a.size()-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = (((Comparable)a.get(midpoint)).compareTo(searchValue)); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
}

public static int findInsertPoint (ArrayList a, Object searchValue){
	   int left = 0;
	   int right = a.size()-1;
	   int midpoint=0;
           Object item=null;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
              item=a.get(midpoint);
	   
	      int result = ((Comparable)item).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)item).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
}
}