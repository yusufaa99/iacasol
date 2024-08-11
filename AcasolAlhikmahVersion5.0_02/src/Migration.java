

/* Decompiler 10010ms, total 14249ms, lines 1797 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Migration extends JFrame {
   String pulledClassName_Migrating_From = "";
   String pulledClassName_Migrating_To = "";
   private Connection connection;
   private Statement statement;
   private PreparedStatement pstatement;
   private JPanel panel;
   private JLabel lblBackup;
   private JLabel lblMigrationGuide;
   private JLabel lblYear;
   private JComboBox ComboYear;
   private JLabel lblSession;
   private JComboBox ComboSession;
   private JLabel lblBackupFileName;
   private JTextField txtBackupFileName;
   private JLabel lblSelectClass;
   private JLabel lblSelectClassMigtatingTo;
   private JComboBox ComboSelectClass;
   private JComboBox ComboSelectClassMigratingTo;
   private JLabel lblMigrationYear;
   private JComboBox ComboMigrationYear;
   private JButton btnBackup;
   private JButton btnPromote;
   private JButton btnMigrate;
   private JButton btnClose;
   private JButton btnPromoteIslamiyya;
   private JButton btnPromoteTahfeez;
   private JButton btnPromoteMutawassit;
   private JButton btnSearch;
   private JLabel lblRegNum;
   private JTextField txtRegNum;
   private JLabel lblName;
   private JTextField txtName;
   String MigratingFromTable = "";
   String MigratingToTable = "";
   String myRegNumber = "";
   String SubRegnum = "";
   int lastStudIDinClass = 0;

   public void Migration() {
      Font f = new Font((String)null, 1, 22);
      Font f2 = new Font("Arial Unicode MS", 1, 18);
      this.panel = new JPanel();
      this.lblBackup = new JLabel("BACKUP:");
      (this.lblMigrationGuide = new JLabel("Note: Migration is done by selecting individual classes, Migration year followed by clicking the promote button")).setForeground(Color.red.darker());
      this.txtRegNum = new JTextField(16);
      (this.txtName = new JTextField(35)).setEditable(false);
      this.txtRegNum.setFont(f);
      this.txtName.setFont(f);
      this.lblRegNum = new JLabel("REG. NUM :");
      this.lblName = new JLabel("STD. NAME :");
      this.lblYear = new JLabel("YEAR:");
      (this.ComboYear = new JComboBox()).addItem("yy");
      this.ComboYear.addItem("2017");
      this.ComboYear.addItem("2018");
      this.ComboYear.addItem("2019");
      this.ComboYear.addItem("2020");
      this.ComboYear.addItem("2021");
      this.ComboYear.addItem("2022");
      this.ComboYear.addItem("2023");
      this.ComboYear.addItem("2024");
      this.ComboYear.addItem("2025");
      this.ComboYear.setFont(f2);
      this.ComboYear.setEditable(true);
      this.lblSession = new JLabel("SESSION:");
      (this.ComboSession = new JComboBox()).addItem("Select Session");
      this.ComboSession.setEditable(true);
      this.ComboSession.setFont(f2);
      this.lblBackupFileName = new JLabel("BACKUP FILE NAME:");
      this.txtBackupFileName = new JTextField(27);
      this.lblSelectClass = new JLabel("   CLASS MIGRATING FROM:");
      this.lblSelectClassMigtatingTo = new JLabel("CLASS MIGRATING TO:");
      (this.ComboSelectClass = new JComboBox()).addItem("SELECT CLASS");
      this.ComboSelectClass.setFont(f2);
      this.ComboSelectClass.setEditable(false);
      ((JLabel)this.ComboSelectClass.getRenderer()).setHorizontalAlignment(4);
      (this.ComboSelectClassMigratingTo = new JComboBox()).setFont(f2);
      this.ComboSelectClassMigratingTo.addItem("SELECT CLASS");
      this.ComboSelectClassMigratingTo.setEditable(false);
      ((JLabel)this.ComboSelectClassMigratingTo.getRenderer()).setHorizontalAlignment(4);
      this.lblMigrationYear = new JLabel("Migration YEAR:");
      (this.ComboMigrationYear = new JComboBox()).setFont(f);
      this.ComboMigrationYear.addItem("yy");
      this.ComboMigrationYear.addItem("2017");
      this.ComboMigrationYear.addItem("2018");
      this.ComboMigrationYear.addItem("2019");
      this.ComboMigrationYear.addItem("2020");
      this.ComboMigrationYear.addItem("2021");
      this.ComboMigrationYear.addItem("2022");
      this.ComboMigrationYear.addItem("2023");
      this.ComboMigrationYear.addItem("2024");
      this.ComboMigrationYear.addItem("2025");
      this.ComboMigrationYear.setEditable(true);
      this.btnBackup = new JButton("Backup");
      this.btnPromote = new JButton("Promote");
      (this.btnPromoteIslamiyya = new JButton("Promote Islamiyya")).setFont(f);
      (this.btnMigrate = new JButton("Migrate")).setFont(f);
      (this.btnSearch = new JButton("Search")).setFont(f);
      (this.btnPromoteTahfeez = new JButton("Promote Tahfeez")).setFont(f);
      this.btnPromote.setFont(f);
      (this.btnPromoteMutawassit = new JButton("Promote Tahfeez")).setFont(f);
      this.btnClose = new JButton("Close");
      this.setIconImage((new ImageIcon("LogoInReportSheet.gif")).getImage());
      this.panel.setLayout(new GridBagLayout());
      this.setVisible(true);
      this.setResizable(true);
      this.setSize(1200, 190);
      this.setTitle("Migration Window - For Secondary School");
      this.add(this.panel);
      this.setDefaultCloseOperation(3);
      this.setLocationRelativeTo((Component)null);
      this.panel.setBackground(Color.orange);
      this.btnBackup.setBackground(Color.red);
      this.btnPromote.setBackground(Color.red);
      this.btnMigrate.setBackground(Color.red);
      this.btnSearch.setBackground(Color.red);
      this.btnPromoteIslamiyya.setBackground(Color.red);
      this.btnPromoteTahfeez.setBackground(Color.red);
      this.btnPromoteMutawassit.setBackground(Color.red);
      this.btnClose.setBackground(Color.black);
      this.btnClose.setForeground(Color.white);
      this.btnClose.setFont(f);
      Box YearBox = Box.createHorizontalBox();
      YearBox.add(this.lblYear);
      YearBox.add(Box.createHorizontalStrut(5));
      YearBox.add(this.ComboYear);
      Box RegNumBox = Box.createHorizontalBox();
      RegNumBox.add(this.lblRegNum);
      RegNumBox.add(Box.createHorizontalStrut(5));
      RegNumBox.add(this.txtRegNum);
      RegNumBox.add(Box.createHorizontalStrut(5));
      this.addItem(this.panel, RegNumBox, 0, 3, 2, 1, 17);
      Box NameBox = Box.createHorizontalBox();
      NameBox.add(this.lblName);
      NameBox.add(Box.createHorizontalStrut(5));
      NameBox.add(this.txtName);
      NameBox.add(Box.createHorizontalStrut(5));
      NameBox.add(this.btnSearch);
      NameBox.add(Box.createHorizontalStrut(5));
      this.addItem(this.panel, NameBox, 0, 5, 1, 1, 17);
      Box MigrationBox = Box.createHorizontalBox();
      MigrationBox.add(this.lblSelectClass);
      MigrationBox.add(Box.createHorizontalStrut(5));
      MigrationBox.add(this.ComboSelectClass);
      MigrationBox.add(Box.createHorizontalStrut(5));
      MigrationBox.add(this.lblSelectClassMigtatingTo);
      MigrationBox.add(Box.createHorizontalStrut(5));
      MigrationBox.add(this.ComboSelectClassMigratingTo);
      MigrationBox.add(Box.createHorizontalStrut(5));
      MigrationBox.add(this.btnMigrate);
      MigrationBox.add(Box.createHorizontalStrut(15));
      MigrationBox.add(this.btnClose);
      this.addItem(this.panel, MigrationBox, 0, 6, 1, 1, 17);
      this.btnClose.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e1) {
         }

         public void actionPerformed(ActionEvent evt1) {
            Migration.this.btnCloseMethod(evt1);
         }
      });
      this.btnBackup.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e2) {
         }

         public void actionPerformed(ActionEvent evt2) {
            Migration.this.btnBackupMethod(evt2);
         }
      });
      this.btnPromote.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e3) {
         }

         public void actionPerformed(ActionEvent evt3) {
            Migration.this.connectToDB();
            Migration.this.btnPromoteMethod(evt3);
         }
      });
      this.btnPromoteIslamiyya.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e4) {
         }

         public void actionPerformed(ActionEvent evt4) {
            Migration.this.connectToDB();
            Migration.this.btnPromoteIslamiyya(evt4);
         }
      });
      this.btnPromoteTahfeez.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e5) {
         }

         public void actionPerformed(ActionEvent evt5) {
            Migration.this.connectToDB();
            Migration.this.btnPromoteTahfeez(evt5);
         }
      });
      this.btnPromoteMutawassit.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e7) {
         }

         public void actionPerformed(ActionEvent evt7) {
            Migration.this.connectToDB();
            Migration.this.btnPromoteMutawassitMthd(evt7);
         }
      });
      this.btnSearch.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e8) {
         }

         public void actionPerformed(ActionEvent evt8) {
            Migration.this.connectToDB();
            Migration.this.btnSearchMthd(evt8);
         }
      });
      this.btnMigrate.addActionListener(new ActionListener() {
         public void actionPerfomed(ActionEvent e9) {
         }

         public void actionPerformed(ActionEvent evt9) {
            Migration.this.connectToDB();
            Migration.this.btnMigrateMthd(evt9);
         }
      });
      this.fillCoboSelectClass();
      this.fillComboSession();
   }

   public static void main(String[] args) {
      new Migration();
   }

   private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
      GridBagConstraints gc = new GridBagConstraints();
      gc.gridx = x;
      gc.gridy = y;
      gc.gridwidth = width;
      gc.gridheight = height;
      gc.weightx = 100.0D;
      gc.weighty = 100.0D;
      gc.insets = new Insets(5, 5, 5, 5);
      gc.anchor = align;
      gc.fill = 0;
      p.add(c, gc);
   }

   public void connectToDB() {
      try {
         String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
         String USERNAME = "root";
         String PASSWORD = "ash123";
         this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
      } catch (SQLException var7) {
         var7.printStackTrace();
      }

      try {
         Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
      } catch (InstantiationException var4) {
         JOptionPane.showMessageDialog((Component)null, "Please, enter parent phone number", "database connectivity error\n" + var4.getMessage(), 0);
         var4.printStackTrace();
      } catch (IllegalAccessException var5) {
         JOptionPane.showMessageDialog((Component)null, "Please, enter parent phone number", "database connectivity error\n" + var5.getMessage(), 0);
         var5.printStackTrace();
      } catch (ClassNotFoundException var6) {
         JOptionPane.showMessageDialog((Component)null, "Please, enter parent phone number", "database connectivity error\n" + var6.getMessage(), 0);
         var6.printStackTrace();
      }

   }

   public void btnCloseMethod(ActionEvent evt1) {
      this.dispose();
   }

   public void btnBackupMethod(ActionEvent evt2) {
      this.dispose();
   }

   public void btnPromoteMethod(ActionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void btnPromoteIslamiyya(ActionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void btnPromoteTahfeez(ActionEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public void btnPromoteMutawassitMthd(ActionEvent evt3) {
      String Class = (String)this.ComboSelectClass.getSelectedItem();
      String MigrationYear = (String)this.ComboMigrationYear.getSelectedItem();
      String PromotedClass = "";
      String InsertQueryString;
      String QueryString2;
      String QueryString3;
      if (Class.equals("الثالث الثانوي")) {
         PromotedClass = "الثالث الثانوي graduated" + MigrationYear;

         try {
            InsertQueryString = "UPDATE\tstudentregAssalissanawi SET StdClass =? WHERE StdClass = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregAssalissanawi SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, Class);
            this.pstatement.executeUpdate();
            QueryString2 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString2, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var96) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var96.getMessage(), "Error occured", 0);
            var96.printStackTrace();
         }

         try {
            InsertQueryString = "BEGIN";
            (this.pstatement = this.connection.prepareStatement("BEGIN")).executeUpdate();
            this.pstatement.close();
         } catch (SQLException var95) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var95.getMessage(), "Error occured", 0);
            var95.printStackTrace();
         }

         try {
            InsertQueryString = "INSERT studentregAssalissanawi_Archive SELECT * FROM studentregAssalissanawi";
            (this.pstatement = this.connection.prepareStatement("INSERT studentregAssalissanawi_Archive SELECT * FROM studentregAssalissanawi")).executeUpdate();
            this.pstatement.close();
         } catch (SQLException var94) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var94.getMessage(), "Error occured", 0);
            var94.printStackTrace();
         }

         try {
            InsertQueryString = "TRUNCATE studentregAssalissanawi";
            (this.pstatement = this.connection.prepareStatement("TRUNCATE studentregAssalissanawi")).executeUpdate();
            this.pstatement.close();
         } catch (SQLException var93) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var93.getMessage(), "Error occured", 0);
            var93.printStackTrace();
         }

         try {
            InsertQueryString = "COMMIT";
            (this.pstatement = this.connection.prepareStatement("COMMIT")).executeUpdate();
            this.pstatement.close();
         } catch (SQLException var92) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var92.getMessage(), "Error occured", 0);
            var92.printStackTrace();
         }

         InsertQueryString = "الثالث الثانوي";

         try {
            QueryString2 = "UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var91) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var91.getMessage(), "Error occured", 0);
            var91.printStackTrace();
         }

         try {
            QueryString2 = "UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var90) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var90.getMessage(), "Error occured", 0);
            var90.printStackTrace();
         }

         try {
            QueryString2 = "UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var89) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var89.getMessage(), "Error occured", 0);
            var89.printStackTrace();
         }

         try {
            QueryString2 = "UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var88) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var88.getMessage(), "Error occured", 0);
            var88.printStackTrace();
         }

         try {
            QueryString2 = "UPDATE\tbehaviour SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tbehaviour SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var87) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var87.getMessage(), "Error occured", 0);
            var87.printStackTrace();
         }

         try {
            QueryString2 = "UPDATE\tattendance SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tattendance SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var86) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var86.getMessage(), "Error occured", 0);
            var86.printStackTrace();
         }

         try {
            QueryString2 = "UPDATE\tattaqdeer SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tattaqdeer SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var85) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var85.getMessage(), "Error occured", 0);
            var85.printStackTrace();
         }

         try {
            QueryString2 = "UPDATE\tcomments SET Class =? WHERE Class = ?";
            (this.pstatement = this.connection.prepareStatement("UPDATE\tcomments SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
            this.pstatement.setString(2, "الثالث الثانوي");
            this.pstatement.executeUpdate();
            QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
            JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
            this.pstatement.close();
         } catch (SQLException var84) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var84.getMessage(), "Error occured", 0);
            var84.printStackTrace();
         }
      } else {
         String message_for_SuccessfulModification3;
         PreparedStatement pstatement;
         if (Class.equals("الثاني الثانوي")) {
            PromotedClass = "الثالث الثانوي";

            try {
               InsertQueryString = "UPDATE\tstudentregAssanisanawi SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregAssanisanawi SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, Class);
               this.pstatement.executeUpdate();
               QueryString2 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString2, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var83) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var83.getMessage(), "Error occured", 0);
               var83.printStackTrace();
            }

            try {
               InsertQueryString = "INSERT INTO studentregAssalissanawi(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregAssanisanawi WHERE StdClass=?";
               pstatement = this.connection.prepareStatement("INSERT INTO studentregAssalissanawi(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregAssanisanawi WHERE StdClass=?");
               pstatement.setString(1, PromotedClass);
               pstatement.executeUpdate();
               pstatement.close();
            } catch (SQLException var82) {
               JOptionPane.showMessageDialog((Component)null, "Error occured,\n" + var82.getMessage());
               var82.printStackTrace();
            }

            PromotedClass = "الثاني الثانوي Promoted" + MigrationYear;
            InsertQueryString = "الثالث الثانوي";

            try {
               QueryString2 = "UPDATE\tstudentregAssanisanawi SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregAssanisanawi SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث الثانوي");
               this.pstatement.executeUpdate();
               QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var81) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var81.getMessage(), "Error occured", 0);
               var81.printStackTrace();
            }

            try {
               QueryString2 = "BEGIN";
               (this.pstatement = this.connection.prepareStatement("BEGIN")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var80) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var80.getMessage(), "Error occured", 0);
               var80.printStackTrace();
            }

            try {
               QueryString2 = "INSERT studentregAssanisanawi_Archive SELECT * FROM studentregAssanisanawi";
               (this.pstatement = this.connection.prepareStatement("INSERT studentregAssanisanawi_Archive SELECT * FROM studentregAssanisanawi")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var79) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var79.getMessage(), "Error occured", 0);
               var79.printStackTrace();
            }

            try {
               QueryString2 = "TRUNCATE studentregAssanisanawi";
               (this.pstatement = this.connection.prepareStatement("TRUNCATE studentregAssanisanawi")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var78) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var78.getMessage(), "Error occured", 0);
               var78.printStackTrace();
            }

            try {
               QueryString2 = "COMMIT";
               (this.pstatement = this.connection.prepareStatement("COMMIT")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var77) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var77.getMessage(), "Error occured", 0);
               var77.printStackTrace();
            }

            QueryString2 = "الثاني الثانوي";

            try {
               QueryString3 = "UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var76) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var76.getMessage(), "Error occured", 0);
               var76.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var75) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var75.getMessage(), "Error occured", 0);
               var75.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var74) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var74.getMessage(), "Error occured", 0);
               var74.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var73) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var73.getMessage(), "Error occured", 0);
               var73.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tbehaviour SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tbehaviour SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var72) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var72.getMessage(), "Error occured", 0);
               var72.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattendance SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattendance SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var71) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var71.getMessage(), "Error occured", 0);
               var71.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattaqdeer SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattaqdeer SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var70) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var70.getMessage(), "Error occured", 0);
               var70.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcomments SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcomments SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var69) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var69.getMessage(), "Error occured", 0);
               var69.printStackTrace();
            }
         } else if (Class.equals("الأول الثانوي")) {
            PromotedClass = "الثاني الثانوي";

            try {
               InsertQueryString = "UPDATE\tstudentregauwalussanawi SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregauwalussanawi SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, Class);
               this.pstatement.executeUpdate();
               QueryString2 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString2, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var68) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var68.getMessage(), "Error occured", 0);
               var68.printStackTrace();
            }

            try {
               InsertQueryString = "INSERT INTO studentregAssanisanawi(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregauwalussanawi WHERE StdClass=?";
               pstatement = this.connection.prepareStatement("INSERT INTO studentregAssanisanawi(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregauwalussanawi WHERE StdClass=?");
               pstatement.setString(1, PromotedClass);
               pstatement.executeUpdate();
               pstatement.close();
            } catch (SQLException var67) {
               JOptionPane.showMessageDialog((Component)null, "Error occured,\n" + var67.getMessage());
               var67.printStackTrace();
            }

            PromotedClass = "الأول الثانوي Promoted" + MigrationYear;
            InsertQueryString = "الثاني الثانوي";

            try {
               QueryString2 = "UPDATE\tstudentregauwalussanawi SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregauwalussanawi SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني الثانوي");
               this.pstatement.executeUpdate();
               QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var66) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var66.getMessage(), "Error occured", 0);
               var66.printStackTrace();
            }

            try {
               QueryString2 = "BEGIN";
               (this.pstatement = this.connection.prepareStatement("BEGIN")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var65) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var65.getMessage(), "Error occured", 0);
               var65.printStackTrace();
            }

            try {
               QueryString2 = "INSERT studentregauwalussanawi_Archive SELECT * FROM studentregauwalussanawi";
               (this.pstatement = this.connection.prepareStatement("INSERT studentregauwalussanawi_Archive SELECT * FROM studentregauwalussanawi")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var64) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var64.getMessage(), "Error occured", 0);
               var64.printStackTrace();
            }

            try {
               QueryString2 = "TRUNCATE studentregauwalussanawi";
               (this.pstatement = this.connection.prepareStatement("TRUNCATE studentregauwalussanawi")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var63) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var63.getMessage(), "Error occured", 0);
               var63.printStackTrace();
            }

            try {
               QueryString2 = "COMMIT";
               (this.pstatement = this.connection.prepareStatement("COMMIT")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var62) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var62.getMessage(), "Error occured", 0);
               var62.printStackTrace();
            }

            QueryString2 = "الأول الثانوي";

            try {
               QueryString3 = "UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var61) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var61.getMessage(), "Error occured", 0);
               var61.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var60) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var60.getMessage(), "Error occured", 0);
               var60.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var59) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var59.getMessage(), "Error occured", 0);
               var59.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var58) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var58.getMessage(), "Error occured", 0);
               var58.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tbehaviour SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tbehaviour SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var57) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var57.getMessage(), "Error occured", 0);
               var57.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattendance SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattendance SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var56) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var56.getMessage(), "Error occured", 0);
               var56.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattaqdeer SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattaqdeer SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var55) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var55.getMessage(), "Error occured", 0);
               var55.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcomments SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcomments SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var54) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var54.getMessage(), "Error occured", 0);
               var54.printStackTrace();
            }
         } else if (Class.equals("الثالث المتوسط")) {
            PromotedClass = "الأول الثانوي";

            try {
               InsertQueryString = "UPDATE\tstudentregassalismutawassit SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregassalismutawassit SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, Class);
               this.pstatement.executeUpdate();
               QueryString2 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString2, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var53) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var53.getMessage(), "Error occured", 0);
               var53.printStackTrace();
            }

            try {
               InsertQueryString = "INSERT INTO studentregauwalussanawi(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregassalismutawassit WHERE StdClass=?";
               pstatement = this.connection.prepareStatement("INSERT INTO studentregauwalussanawi(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregassalismutawassit WHERE StdClass=?");
               pstatement.setString(1, PromotedClass);
               pstatement.executeUpdate();
               pstatement.close();
            } catch (SQLException var52) {
               JOptionPane.showMessageDialog((Component)null, "Error occured,\n" + var52.getMessage());
               var52.printStackTrace();
            }

            PromotedClass = "الثالث المتوسط Promoted" + MigrationYear;
            InsertQueryString = "الأول الثانوي";

            try {
               QueryString2 = "UPDATE\tstudentregassalismutawassit SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregassalismutawassit SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول الثانوي");
               this.pstatement.executeUpdate();
               QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var51) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var51.getMessage(), "Error occured", 0);
               var51.printStackTrace();
            }

            try {
               QueryString2 = "BEGIN";
               (this.pstatement = this.connection.prepareStatement("BEGIN")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var50) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var50.getMessage(), "Error occured", 0);
               var50.printStackTrace();
            }

            try {
               QueryString2 = "INSERT studentregassalismutawassit_Archive SELECT * FROM studentregassalismutawassit";
               (this.pstatement = this.connection.prepareStatement("INSERT studentregassalismutawassit_Archive SELECT * FROM studentregassalismutawassit")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var49) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var49.getMessage(), "Error occured", 0);
               var49.printStackTrace();
            }

            try {
               QueryString2 = "TRUNCATE studentregassalismutawassit";
               (this.pstatement = this.connection.prepareStatement("TRUNCATE studentregassalismutawassit")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var48) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var48.getMessage(), "Error occured", 0);
               var48.printStackTrace();
            }

            try {
               QueryString2 = "COMMIT";
               (this.pstatement = this.connection.prepareStatement("COMMIT")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var47) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var47.getMessage(), "Error occured", 0);
               var47.printStackTrace();
            }

            QueryString2 = "الثالث المتوسط";

            try {
               QueryString3 = "UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var46) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var46.getMessage(), "Error occured", 0);
               var46.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var45) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var45.getMessage(), "Error occured", 0);
               var45.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var44) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var44.getMessage(), "Error occured", 0);
               var44.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var43) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var43.getMessage(), "Error occured", 0);
               var43.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tbehaviour SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tbehaviour SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var42) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var42.getMessage(), "Error occured", 0);
               var42.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattendance SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattendance SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var41) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var41.getMessage(), "Error occured", 0);
               var41.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattaqdeer SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattaqdeer SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var40) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var40.getMessage(), "Error occured", 0);
               var40.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcomments SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcomments SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var39) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var39.getMessage(), "Error occured", 0);
               var39.printStackTrace();
            }
         } else if (Class.equals("الثاني المتوسط")) {
            PromotedClass = "الثالث المتوسط";

            try {
               InsertQueryString = "UPDATE\tstudentregassanimutawassit SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregassanimutawassit SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, Class);
               this.pstatement.executeUpdate();
               QueryString2 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString2, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var38) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var38.getMessage(), "Error occured", 0);
               var38.printStackTrace();
            }

            try {
               InsertQueryString = "INSERT INTO studentregassalismutawassit(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregassanimutawassit WHERE StdClass=?";
               pstatement = this.connection.prepareStatement("INSERT INTO studentregassalismutawassit(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregassanimutawassit WHERE StdClass=?");
               pstatement.setString(1, PromotedClass);
               pstatement.executeUpdate();
               pstatement.close();
            } catch (SQLException var37) {
               JOptionPane.showMessageDialog((Component)null, "Error occured,\n" + var37.getMessage());
               var37.printStackTrace();
            }

            PromotedClass = "الثاني المتوسط Promoted" + MigrationYear;
            InsertQueryString = "الثالث المتوسط";

            try {
               QueryString2 = "UPDATE\tstudentregassanimutawassit SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregassanimutawassit SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثالث المتوسط");
               this.pstatement.executeUpdate();
               QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var36) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var36.getMessage(), "Error occured", 0);
               var36.printStackTrace();
            }

            try {
               QueryString2 = "BEGIN";
               (this.pstatement = this.connection.prepareStatement("BEGIN")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var35) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var35.getMessage(), "Error occured", 0);
               var35.printStackTrace();
            }

            try {
               QueryString2 = "INSERT studentregassanimutawassit_Archive SELECT * FROM studentregassanimutawassit";
               (this.pstatement = this.connection.prepareStatement("INSERT studentregassanimutawassit_Archive SELECT * FROM studentregassanimutawassit")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var34) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var34.getMessage(), "Error occured", 0);
               var34.printStackTrace();
            }

            try {
               QueryString2 = "TRUNCATE studentregassanimutawassit";
               (this.pstatement = this.connection.prepareStatement("TRUNCATE studentregassanimutawassit")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var33) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var33.getMessage(), "Error occured", 0);
               var33.printStackTrace();
            }

            try {
               QueryString2 = "COMMIT";
               (this.pstatement = this.connection.prepareStatement("COMMIT")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var32) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var32.getMessage(), "Error occured", 0);
               var32.printStackTrace();
            }

            QueryString2 = "الثاني المتوسط";

            try {
               QueryString3 = "UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var31) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var31.getMessage(), "Error occured", 0);
               var31.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var30) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var30.getMessage(), "Error occured", 0);
               var30.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var29) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var29.getMessage(), "Error occured", 0);
               var29.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var28) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var28.getMessage(), "Error occured", 0);
               var28.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tbehaviour SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tbehaviour SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var27) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var27.getMessage(), "Error occured", 0);
               var27.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattendance SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattendance SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var26) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var26.getMessage(), "Error occured", 0);
               var26.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattaqdeer SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattaqdeer SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var25) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var25.getMessage(), "Error occured", 0);
               var25.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcomments SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcomments SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var24) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var24.getMessage(), "Error occured", 0);
               var24.printStackTrace();
            }
         } else if (Class.equals("الأول التوسط")) {
            PromotedClass = "الثاني المتوسط";

            try {
               InsertQueryString = "UPDATE\tstudentregauwalulmutawassit SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregauwalulmutawassit SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, Class);
               this.pstatement.executeUpdate();
               QueryString2 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString2, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var23) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var23.getMessage(), "Error occured", 0);
               var23.printStackTrace();
            }

            try {
               InsertQueryString = "INSERT INTO studentregassanimutawassit(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregauwalulmutawassit WHERE StdClass=?";
               pstatement = this.connection.prepareStatement("INSERT INTO studentregassanimutawassit(StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT  StDName,StdRegNum,StdID,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM studentregauwalulmutawassit WHERE StdClass=?");
               pstatement.setString(1, PromotedClass);
               pstatement.executeUpdate();
               pstatement.close();
            } catch (SQLException var22) {
               JOptionPane.showMessageDialog((Component)null, "Error occured,\n" + var22.getMessage());
               var22.printStackTrace();
            }

            PromotedClass = "الأول التوسط Promoted" + MigrationYear;
            InsertQueryString = "الثاني المتوسط";

            try {
               QueryString2 = "UPDATE\tstudentregauwalulmutawassit SET StdClass =? WHERE StdClass = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tstudentregauwalulmutawassit SET StdClass =? WHERE StdClass = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الثاني المتوسط");
               this.pstatement.executeUpdate();
               QueryString3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, QueryString3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var21) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var21.getMessage(), "Error occured", 0);
               var21.printStackTrace();
            }

            try {
               QueryString2 = "BEGIN";
               (this.pstatement = this.connection.prepareStatement("BEGIN")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var20) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var20.getMessage(), "Error occured", 0);
               var20.printStackTrace();
            }

            try {
               QueryString2 = "INSERT studentregauwalulmutawassit_Archive SELECT * FROM studentregauwalulmutawassit";
               (this.pstatement = this.connection.prepareStatement("INSERT studentregauwalulmutawassit_Archive SELECT * FROM studentregauwalulmutawassit")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var19) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var19.getMessage(), "Error occured", 0);
               var19.printStackTrace();
            }

            try {
               QueryString2 = "TRUNCATE studentregauwalulmutawassit";
               (this.pstatement = this.connection.prepareStatement("TRUNCATE studentregauwalulmutawassit")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var18) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var18.getMessage(), "Error occured", 0);
               var18.printStackTrace();
            }

            try {
               QueryString2 = "COMMIT";
               (this.pstatement = this.connection.prepareStatement("COMMIT")).executeUpdate();
               this.pstatement.close();
            } catch (SQLException var17) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var17.getMessage(), "Error occured", 0);
               var17.printStackTrace();
            }

            QueryString2 = "الأول التوسط";

            try {
               QueryString3 = "UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tdataentryacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var16) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var16.getMessage(), "Error occured", 0);
               var16.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcompiledreportsheet SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var15) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var15.getMessage(), "Error occured", 0);
               var15.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\toveralltotalandaverageacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var14) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var14.getMessage(), "Error occured", 0);
               var14.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tposition_persubjacasolarabic SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var13) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var13.getMessage(), "Error occured", 0);
               var13.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tbehaviour SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tbehaviour SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var12) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var12.getMessage(), "Error occured", 0);
               var12.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattendance SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattendance SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var11) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var11.getMessage(), "Error occured", 0);
               var11.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tattaqdeer SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tattaqdeer SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + "successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var10) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var10.getMessage(), "Error occured", 0);
               var10.printStackTrace();
            }

            try {
               QueryString3 = "UPDATE\tcomments SET Class =? WHERE Class = ?";
               (this.pstatement = this.connection.prepareStatement("UPDATE\tcomments SET Class =? WHERE Class = ?")).setString(1, PromotedClass);
               this.pstatement.setString(2, "الأول التوسط");
               this.pstatement.executeUpdate();
               message_for_SuccessfulModification3 = String.valueOf(Class) + " has been Promoted to \n " + "( " + PromotedClass + " )" + " successfully.";
               JOptionPane.showMessageDialog((Component)null, message_for_SuccessfulModification3, "Successful Migration", 1);
               this.pstatement.close();
            } catch (SQLException var9) {
               JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var9.getMessage(), "Error occured", 0);
               var9.printStackTrace();
            }
         }
      }

   }

   public void btnSearchMthd(ActionEvent evt8) {
      this.txtName.setText("");
      String RegNumber = this.txtRegNum.getText().toString();
      String myClassMigratingFrom = (String)this.ComboSelectClass.getSelectedItem();
      if (RegNumber.equals("")) {
         JOptionPane.showMessageDialog((Component)null, "Please, the student regnum!", "Registration Number Error", 0);
      } else if (myClassMigratingFrom.equals("SELECT CLASS")) {
         JOptionPane.showMessageDialog((Component)null, "Please, select a class!", "Class Selection Error", 0);
      } else {
         this.pulledCLassName_For_Migrating_From();
         this.MigratingFromTable = this.pulledClassName_Migrating_From;

         try {
            String QueryString = "SELECT StdName FROM " + this.MigratingFromTable + " WHERE StdRegNum = ? AND StdClass = ?";
            PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myClassMigratingFrom);
            ResultSet rs = pstatement.executeQuery();
            boolean var7 = false;

            while(rs.next()) {
               String Name = rs.getObject(1).toString();
               this.txtName.setText(Name);
            }

            rs.close();
            pstatement.close();
         } catch (SQLException var9) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var9.getMessage(), "Error occured", 0);
            var9.printStackTrace();
         }
      }

   }

   public void btnMigrateMthd(ActionEvent evt9) {
      this.btnSearchMthd(evt9);
      String RegNumber = this.txtRegNum.getText().toString();
      String myClassMigratingTo = (String)this.ComboSelectClassMigratingTo.getSelectedItem();
      String myClassMigratingFrom = (String)this.ComboSelectClass.getSelectedItem();
      String myName = this.txtName.getText().toString();
      String myRegNumber = "";
      if (RegNumber.equals("")) {
         JOptionPane.showMessageDialog((Component)null, "Please, the student regnum!", "Registration Number Error", 0);
      } else if (myClassMigratingTo.equals("SELECT CLASS")) {
         JOptionPane.showMessageDialog((Component)null, "Please, select a class!", "Class Selection Error", 0);
      } else if (myClassMigratingTo.equals(myClassMigratingFrom)) {
         JOptionPane.showMessageDialog((Component)null, "You cant migrate to same class", "Class Migration Selection Error", 0);
      } else if (myName.equals("")) {
         JOptionPane.showMessageDialog((Component)null, "Please, supply NAME by clicking on the SEARCH button", "Class Migration Selection Error", 0);
      } else {
         this.pulledCLassName_For_Migrating_To();
         this.MigratingToTable = this.pulledClassName_Migrating_To;
         this.lastStudIDinClass = 0;

         String QueryString;
         PreparedStatement pstatement;
         ResultSet rs;
         try {
            QueryString = "SELECT StdID FROM " + this.MigratingToTable + " Order by stdID Desc Limit 1";
            pstatement = this.connection.prepareStatement(QueryString);
            rs = pstatement.executeQuery();

            while(rs.next()) {
               this.lastStudIDinClass = Integer.parseInt(rs.getObject(1).toString());
               System.out.println(" Number of Stud: " + this.lastStudIDinClass);
            }
         } catch (SQLException var21) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var21.getMessage(), "Error occured", 0);
            var21.printStackTrace();
         }

         try {
            QueryString = "SELECT StdRegNum FROM " + this.MigratingToTable + " WHERE StdRegNum = ? AND StdClass = ?";
            pstatement = this.connection.prepareStatement(QueryString);
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myClassMigratingTo);
            rs = pstatement.executeQuery();
            int incrReg = 0;
            String NewRegnum = "";
            String QueryString2;
            PreparedStatement pstatement2;
            //int incrReg;
            if (rs.next()) {
               myRegNumber = rs.getObject(1).toString();
               this.SubRegnum = myRegNumber.substring(0, 10);
               incrReg = this.lastStudIDinClass + 1;
               NewRegnum = String.valueOf(this.SubRegnum) + incrReg;
               System.out.println("Such regnum EXISTS: " + myRegNumber);
               System.out.println("SubRegNumber: " + this.SubRegnum);
               System.out.println("New RegNum: " + NewRegnum);

               try {
                  QueryString2 = "INSERT INTO " + this.MigratingToTable + " SELECT StDName,StdRegNum,null,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM " + this.MigratingFromTable + " WHERE StdRegNum = ? AND StdClass = ?";
                  pstatement2 = this.connection.prepareStatement(QueryString2);
                  pstatement2.setString(1, RegNumber);
                  pstatement2.setString(2, myClassMigratingFrom);
                  pstatement2.executeUpdate();
               } catch (Exception var19) {
                  System.out.println("Error in Migration occured: " + var19.getMessage().toString());
               }

               try {
                  QueryString2 = "UPDATE " + this.MigratingToTable + " SET StdRegNum=?, StdClass=? " + " WHERE StdRegNum = ? AND StdClass = ?";
                  pstatement2 = this.connection.prepareStatement(QueryString2);
                  pstatement2.setString(1, NewRegnum);
                  pstatement2.setString(2, myClassMigratingTo);
                  pstatement2.setString(3, RegNumber);
                  pstatement2.setString(4, myClassMigratingFrom);
                  pstatement2.executeUpdate();
               } catch (Exception var18) {
                  System.out.println("Error in Migration occured: " + var18.getMessage().toString());
               }

               try {
                  QueryString2 = "DELETE FROM " + this.MigratingFromTable + " WHERE StdRegNum = ? AND StdClass = ?";
                  pstatement2 = this.connection.prepareStatement(QueryString2);
                  pstatement2.setString(1, RegNumber);
                  pstatement2.setString(2, myClassMigratingFrom);
                  pstatement2.executeUpdate();
               } catch (Exception var17) {
                  System.out.println("Error in Migration occured: " + var17.getMessage().toString());
               }

               JOptionPane.showMessageDialog((Component)null, "A student is successfully migrated From " + myClassMigratingFrom + " to: " + myClassMigratingTo, "Migration Info", 1);
               this.txtName.setText("");
            } else {
               this.SubRegnum = this.txtRegNum.getText().toString().substring(0, 10);
               incrReg = this.lastStudIDinClass + 1;
               NewRegnum = String.valueOf(this.SubRegnum) + incrReg;
               System.out.println("-------- Regnum NOT FOUND ----------- ");
               System.out.println("New RegNum2: " + NewRegnum);

               try {
                  QueryString2 = "INSERT INTO " + this.MigratingToTable + " SELECT StDName,StdRegNum,null,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM " + this.MigratingFromTable + " WHERE StdRegNum = ? AND StdClass = ?";
                  pstatement2 = this.connection.prepareStatement(QueryString2);
                  pstatement2.setString(1, RegNumber);
                  pstatement2.setString(2, myClassMigratingFrom);
                  pstatement2.executeUpdate();
               } catch (Exception var16) {
                  System.out.println("Error in Migration occured: " + var16.getMessage().toString());
               }

               try {
                  QueryString2 = "UPDATE " + this.MigratingToTable + " SET StdRegNum=?, StdClass=? " + " WHERE StdRegNum = ? AND StdClass = ?";
                  pstatement2 = this.connection.prepareStatement(QueryString2);
                  pstatement2.setString(1, NewRegnum);
                  pstatement2.setString(2, myClassMigratingTo);
                  pstatement2.setString(3, RegNumber);
                  pstatement2.setString(4, myClassMigratingFrom);
                  pstatement2.executeUpdate();
               } catch (Exception var15) {
                  System.out.println("Error in Migration occured: " + var15.getMessage().toString());
               }

               try {
                  QueryString2 = "DELETE FROM " + this.MigratingFromTable + " WHERE StdRegNum = ? AND StdClass = ?";
                  pstatement2 = this.connection.prepareStatement(QueryString2);
                  pstatement2.setString(1, RegNumber);
                  pstatement2.setString(2, myClassMigratingFrom);
                  pstatement2.executeUpdate();
               } catch (Exception var14) {
                  System.out.println("Error in Migration occured: " + var14.getMessage().toString());
               }

               JOptionPane.showMessageDialog((Component)null, "A student is successfully migrated From " + myClassMigratingFrom + " to: " + myClassMigratingTo, "Migration Info", 1);
               this.txtName.setText("");
            }
         } catch (SQLException var20) {
            JOptionPane.showMessageDialog((Component)null, "please check your entries\n" + var20.getMessage(), "Error occured", 0);
            var20.printStackTrace();
         }
      }

   }

   public void fillCoboSelectClass() {
      ResultSet rs = null;
      PreparedStatement pstatement = null;

      label95: {
         try {
            this.connectToDB();
            String QueryString = "SELECT Classname_Ara FROM class_regsitration ";
            pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM class_regsitration ");
            rs = pstatement.executeQuery();

            while(true) {
               if (!rs.next()) {
                  pstatement.close();
                  break;
               }

               String ComboClassName = rs.getString("Classname_Ara");
               this.ComboSelectClass.addItem(ComboClassName);
               this.ComboSelectClassMigratingTo.addItem(ComboClassName);
               this.panel.repaint();
               this.panel.revalidate();
            }
         } catch (SQLException var17) {
            JOptionPane.showMessageDialog((Component)null, "Please, check your entries\n" + var17.getMessage(), "Error occured", 0);
            var17.printStackTrace();

            try {
               this.connection.close();
               rs.close();
               pstatement.close();
            } catch (SQLException var16) {
               var16.printStackTrace();
            }
            break label95;
         } finally {
            try {
               this.connection.close();
               rs.close();
               pstatement.close();
            } catch (SQLException var14) {
               var14.printStackTrace();
            }

         }

         try {
            this.connection.close();
            rs.close();
            pstatement.close();
         } catch (SQLException var15) {
            var15.printStackTrace();
         }
      }

      this.panel.repaint();
      this.panel.revalidate();
   }

   public void pulledCLassName_For_Migrating_From() {
      ResultSet rs = null;
      PreparedStatement pstatement = null;
      String myClassName_Ara = this.ComboSelectClass.getSelectedItem().toString();

      label93: {
         try {
            this.connectToDB();
            String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
            pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
            pstatement.setString(1, myClassName_Ara);
            rs = pstatement.executeQuery();

            while(rs.next()) {
               this.pulledClassName_Migrating_From = rs.getString("Classname_Eng");
               this.panel.repaint();
               this.panel.revalidate();
            }
         } catch (SQLException var18) {
            JOptionPane.showMessageDialog((Component)null, "Please, check your entries\n" + var18.getMessage(), "Error occured", 0);
            var18.printStackTrace();

            try {
               pstatement.close();
            } catch (SQLException var17) {
               var17.printStackTrace();
            }
            break label93;
         } finally {
            try {
               pstatement.close();
            } catch (SQLException var15) {
               var15.printStackTrace();
            }

         }

         try {
            pstatement.close();
         } catch (SQLException var16) {
            var16.printStackTrace();
         }
      }

      this.panel.repaint();
      this.panel.revalidate();
   }

   public void pulledCLassName_For_Migrating_To() {
      ResultSet rs = null;
      PreparedStatement pstatement = null;
      String myClassName_Ara = this.ComboSelectClassMigratingTo.getSelectedItem().toString();

      label93: {
         try {
            this.connectToDB();
            String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
            pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
            pstatement.setString(1, myClassName_Ara);
            rs = pstatement.executeQuery();

            while(rs.next()) {
               this.pulledClassName_Migrating_To = rs.getString("Classname_Eng");
               this.panel.repaint();
               this.panel.revalidate();
            }
         } catch (SQLException var18) {
            JOptionPane.showMessageDialog((Component)null, "Please, check your entries\n" + var18.getMessage(), "Error occured", 0);
            var18.printStackTrace();

            try {
               pstatement.close();
            } catch (SQLException var17) {
               var17.printStackTrace();
            }
            break label93;
         } finally {
            try {
               pstatement.close();
            } catch (SQLException var15) {
               var15.printStackTrace();
            }

         }

         try {
            pstatement.close();
         } catch (SQLException var16) {
            var16.printStackTrace();
         }
      }

      this.panel.repaint();
      this.panel.revalidate();
   }

   public void fillComboSession() {
      ResultSet rs = null;
      PreparedStatement pstatement = null;

      label95: {
         try {
            this.connectToDB();
            String QueryString = "SELECT distinct Session FROM terminformation order by Session Asc";
            pstatement = this.connection.prepareStatement("SELECT distinct Session FROM terminformation order by Session Asc");
            rs = pstatement.executeQuery();

            while(true) {
               if (!rs.next()) {
                  pstatement.close();
                  break;
               }

               String Combosuject_Ara = rs.getString("Session");
               this.ComboSession.addItem(Combosuject_Ara);
               this.panel.repaint();
               this.panel.revalidate();
            }
         } catch (SQLException var17) {
            JOptionPane.showMessageDialog((Component)null, "Please, check your entries\n" + var17.getMessage(), "Error occured", 0);
            var17.printStackTrace();

            try {
               this.connection.close();
               rs.close();
               pstatement.close();
            } catch (SQLException var16) {
               var16.printStackTrace();
            }
            break label95;
         } finally {
            try {
               this.connection.close();
               rs.close();
               pstatement.close();
            } catch (SQLException var14) {
               var14.printStackTrace();
            }

         }

         try {
            this.connection.close();
            rs.close();
            pstatement.close();
         } catch (SQLException var15) {
            var15.printStackTrace();
         }
      }

      this.panel.repaint();
      this.panel.revalidate();
   }
}

