import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class SpecifyMAXnoINclass extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblRegNum;
    private JLabel lblName;
    private JLabel lblClass;
    private JLabel lblTerm;
    private JLabel lblForm;
    private JLabel lblSubject;
    private JLabel lbldate;
    private JLabel lblDay;
    private JLabel lblMonth;
    private JLabel lblYear;
    private JLabel lblClassWorkNo;
    private JLabel lblHomeWorkNo;
    private JLabel lblClassWorkMarks;
    private JLabel lblHomeWorkMarks;
    private JLabel lblOutput;
    private JTextField txtRegNum;
    private JTextField txtName;
    private JTextField txtClass;
    private JTextField txtClassWorkMarks;
    private JTextField txtHomeWorkMarks;
    private JComboBox ComboTerm;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JComboBox ComboWeekNumber;
    private JComboBox ComboCWorkNo;
    private JComboBox ComboHWorkNo;
    private JButton btnPreview;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnPrint;
    private JLabel lblQuerySection;
    private JLabel lblSearchingARecord;
    private JLabel lblEnterRegNum;
    private JLabel lblQuerySelectSubj;
    private JLabel lblQuerySelectForm;
    private JTextField txtEnterRegNum;
    private JLabel lblQuerySelecTerm;
    private JButton btnSearchARecord;
    private JComboBox ComboQuerySelectSubj;
    private JComboBox ComboQuerySelectForm;
    private JComboBox ComboQuerySelectTerm;
    private JLabel lblSearchingAllRecord;
    private JLabel lblQueryAllSelectSubj;
    private JLabel lblQueryAllSelectForm;
    private JLabel lblQueryAllSelecTerm;
    private JButton btnSearchAllRecord;
    private JComboBox ComboQueryAllSelectForm;
    private JComboBox ComboQueryAllSelectTerm;
    private JButton btnClose;
    private JTextArea TextArea;
    private JScrollPane ScrollPane;
    private JComboBox ComboQueryAllSelectSubj;
    private JButton btnSearch;
    private JButton btnPrevious;
    private JButton btnNext;
    private JTextField txtmyclass;
    private JLabel lblHwPercentage;
    private JLabel lblTermEnd;
    private JLabel lblNextTermBegins;
    private JLabel lblTermMonth;
    private JLabel lblTermYear;
    private JTextField txtTermEnds;
    private JTextField txtNextTermBegins;
    private JComboBox CombomyMonth;
    private JTextField txtTermYear;
    private JTextField txtmaxNoInClass;
    private JTextField txtStaffName;
    private JTextField txtAuthorizedBy;
    private JLabel lblDate;
    private JButton btnExecute;
    private JLabel lblmaxNoInClass;
    private JLabel lblStaffName;
    private JLabel lblAuthorizedBy;
    private JDateChooser picker;
    
    public void SpecifyMAXnoINclass() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblRegNum = new JLabel("REGISTRATION NO:");
        this.lblName = new JLabel("NAME:");
        this.lblClass = new JLabel("CLASS:");
        this.lblTerm = new JLabel("SELECT TERM:");
        this.lblForm = new JLabel("FORM:");
        this.lblSubject = new JLabel("SUBJECT:");
        this.lbldate = new JLabel("DATE:");
        this.lblDay = new JLabel("DAY:");
        this.lblMonth = new JLabel("MONTH");
        this.lblYear = new JLabel("YEAR:");
        this.lblClassWorkNo = new JLabel("CLASSWORK NO:");
        this.lblHomeWorkNo = new JLabel("HOMEWORK NO:");
        this.lblClassWorkMarks = new JLabel("CLASSWORK MARK:");
        this.lblHomeWorkMarks = new JLabel("HOMEWORK MARKS");
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        this.txtRegNum = new JTextField(7);
        this.txtName = new JTextField(35);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtClassWorkMarks = new JTextField(5);
        this.txtHomeWorkMarks = new JTextField(5);
        (this.ComboSelecClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelecClass.addItem("SSS1 A");
        this.ComboSelecClass.addItem("SSS2 A");
        this.ComboSelecClass.addItem("SSS3 A");
        this.ComboSelecClass.addItem("SSS1 B");
        this.ComboSelecClass.addItem("SSS2 B");
        this.ComboSelecClass.addItem("SSS3 B");
        this.ComboSelecClass.addItem("JSS I A");
        this.ComboSelecClass.addItem("JSS II A");
        this.ComboSelecClass.addItem("JSS III A");
        this.ComboSelecClass.addItem("JSS I B");
        this.ComboSelecClass.addItem("JSS II B");
        this.ComboSelecClass.addItem("JSS III B");
        this.ComboSelecClass.setEditable(false);
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("FIRST");
        this.ComboTerm.addItem("SECOND");
        this.ComboTerm.addItem("THIRD");
        (this.ComboForm = new JComboBox()).addItem("SELECT FORM");
        this.ComboForm.addItem("FORM ONE");
        this.ComboForm.addItem("FORM TWO");
        this.ComboForm.addItem("FORM THREE");
        this.ComboForm.addItem("FORM FOUR");
        this.ComboForm.addItem("FORM FIVE");
        this.ComboForm.addItem("FORM SIX");
        this.ComboSelectSubj = new JComboBox();
        (this.ComboDay = new JComboBox()).addItem("dd");
        this.ComboDay.addItem("01");
        this.ComboDay.addItem("02");
        this.ComboDay.addItem("03");
        this.ComboDay.addItem("04");
        this.ComboDay.addItem("05");
        this.ComboDay.addItem("06");
        this.ComboDay.addItem("07");
        this.ComboDay.addItem("08");
        this.ComboDay.addItem("09");
        this.ComboDay.addItem("10");
        this.ComboDay.addItem("11");
        this.ComboDay.addItem("12");
        this.ComboDay.addItem("13");
        this.ComboDay.addItem("14");
        this.ComboDay.addItem("15");
        this.ComboDay.addItem("16");
        this.ComboDay.addItem("17");
        this.ComboDay.addItem("18");
        this.ComboDay.addItem("19");
        this.ComboDay.addItem("20");
        this.ComboDay.addItem("21");
        this.ComboDay.addItem("22");
        this.ComboDay.addItem("23");
        this.ComboDay.addItem("24");
        this.ComboDay.addItem("25");
        this.ComboDay.addItem("26");
        this.ComboDay.addItem("27");
        this.ComboDay.addItem("28");
        this.ComboDay.addItem("29");
        this.ComboDay.addItem("30");
        this.ComboDay.addItem("31");
        (this.ComboMonth = new JComboBox()).addItem("mm");
        this.ComboMonth.addItem("01");
        this.ComboMonth.addItem("02");
        this.ComboMonth.addItem("03");
        this.ComboMonth.addItem("04");
        this.ComboMonth.addItem("05");
        this.ComboMonth.addItem("06");
        this.ComboMonth.addItem("07");
        this.ComboMonth.addItem("08");
        this.ComboMonth.addItem("09");
        this.ComboMonth.addItem("10");
        this.ComboMonth.addItem("11");
        this.ComboMonth.addItem("12");
        (this.ComboYear = new JComboBox()).addItem("yy");
        this.ComboYear.addItem("2013");
        this.ComboYear.addItem("2014");
        this.ComboYear.addItem("2015");
        this.ComboYear.addItem("2016");
        this.ComboYear.addItem("2017");
        this.ComboYear.addItem("2018");
        this.ComboYear.addItem("2019");
        this.ComboYear.addItem("2020");
        this.ComboYear.addItem("2021");
        this.ComboYear.addItem("2022");
        this.ComboYear.addItem("2023");
        this.ComboYear.addItem("2024");
        this.ComboYear.addItem("2025");
        this.btnPreview = new JButton("Preview");
        this.btnSave = new JButton("Save");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.lblQuerySection = new JLabel("QUERY/SEARCH SECTION");
        this.lblSearchingARecord = new JLabel("Searching For A Record:");
        this.lblEnterRegNum = new JLabel("REGISTRATION NO:");
        this.lblQuerySelectSubj = new JLabel("SUBJECT:");
        this.lblQuerySelecTerm = new JLabel("TERM");
        this.btnSearchARecord = new JButton("Search>>>");
        (this.ComboQuerySelectSubj = new JComboBox()).addItem("Qur\ufffdan");
        this.ComboQuerySelectSubj.addItem("Arabic Language");
        this.ComboQuerySelectSubj.addItem("Biology");
        this.ComboQuerySelectSubj.addItem("Chemistry");
        this.ComboQuerySelectSubj.addItem("Computer science");
        this.ComboQuerySelectSubj.addItem("Economics");
        this.ComboQuerySelectSubj.addItem("English Language");
        this.ComboQuerySelectSubj.addItem("Foods and Nutrition");
        this.ComboQuerySelectSubj.addItem("Further mathematics ");
        this.ComboQuerySelectSubj.addItem("Geography");
        this.ComboQuerySelectSubj.addItem("Government");
        this.ComboQuerySelectSubj.addItem("Hausa");
        this.ComboQuerySelectSubj.addItem("History ");
        this.ComboQuerySelectSubj.addItem("Islamic Religion Knowledge ");
        this.ComboQuerySelectSubj.addItem("Literature in English");
        this.ComboQuerySelectSubj.addItem("Mathematics");
        this.ComboQuerySelectSubj.addItem("Physics");
        (this.ComboQuerySelectTerm = new JComboBox()).addItem("FIRST TERM");
        this.ComboQuerySelectTerm.addItem("SECOND TERM");
        this.ComboQuerySelectTerm.addItem("THIRD TERM");
        this.lblQueryAllSelectForm = new JLabel("FORM:");
        (this.ComboQueryAllSelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQueryAllSelectForm.addItem("FORM TWO");
        this.ComboQueryAllSelectForm.addItem("FORM THREE");
        this.lblSearchingAllRecord = new JLabel("SEARCH ALL RECORD");
        this.lblQueryAllSelectSubj = new JLabel("SELECT SUBJECT:");
        this.lblQueryAllSelecTerm = new JLabel("SELECT TERM:");
        (this.ComboQuerySelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQuerySelectForm.addItem("FORM TWO");
        this.ComboQuerySelectForm.addItem("FORM THREE");
        this.lblQuerySelectForm = new JLabel("FORM:");
        this.btnSearchAllRecord = new JButton("search All>>>");
        (this.ComboQueryAllSelectSubj = new JComboBox()).addItem("SELECT SUBJECT");
        this.ComboQueryAllSelectSubj.addItem("Quran & Tajweed");
        this.ComboQueryAllSelectSubj.addItem("Arabic Language");
        this.ComboQueryAllSelectSubj.addItem("Biology");
        this.ComboQueryAllSelectSubj.addItem("Chemistry");
        this.ComboQueryAllSelectSubj.addItem("Computer science");
        this.ComboQueryAllSelectSubj.addItem("Economics");
        this.ComboQueryAllSelectSubj.addItem("English Language");
        this.ComboQueryAllSelectSubj.addItem("Foods and Nutrition");
        this.ComboQueryAllSelectSubj.addItem("Further mathematics ");
        this.ComboQueryAllSelectSubj.addItem("Geography");
        this.ComboQueryAllSelectSubj.addItem("Government");
        this.ComboQueryAllSelectSubj.addItem("Hausa");
        this.ComboQueryAllSelectSubj.addItem("History ");
        this.ComboQueryAllSelectSubj.addItem("Islamic Religion Knowledge ");
        this.ComboQueryAllSelectSubj.addItem("Literature in English");
        this.ComboQueryAllSelectSubj.addItem("Mathematics");
        this.ComboQueryAllSelectSubj.addItem("Physics");
        (this.ComboQueryAllSelectTerm = new JComboBox()).addItem("FIRST TERM");
        this.ComboQueryAllSelectTerm.addItem("SECOND TERM");
        this.ComboQueryAllSelectTerm.addItem("THIRD TERM");
        this.btnClose = new JButton("Close");
        this.btnSearch = new JButton("Search>>");
        this.btnPrevious = new JButton("<<previous");
        this.btnNext = new JButton("next>>");
        this.TextArea = new JTextArea(8, 40);
        this.ScrollPane = new JScrollPane(this.TextArea, 20, 32);
        this.txtmyclass = new JTextField();
        this.lblHwPercentage = new JLabel("10%");
        this.lblTermEnd = new JLabel("TERM ENDS:");
        this.lblNextTermBegins = new JLabel("NEXT TERM BEGINS:");
        this.lblTermMonth = new JLabel("MONTH:");
        this.lblTermYear = new JLabel("YEAR:");
        this.txtTermEnds = new JTextField(10);
        this.txtNextTermBegins = new JTextField(10);
        (this.CombomyMonth = new JComboBox()).addItem("SELECT MONTH");
        this.CombomyMonth.addItem("JANUARY");
        this.CombomyMonth.addItem("FEBRUARY");
        this.CombomyMonth.addItem("MARCH");
        this.CombomyMonth.addItem("APRIL");
        this.CombomyMonth.addItem("MAY");
        this.CombomyMonth.addItem("JUNE");
        this.CombomyMonth.addItem("JULY");
        this.CombomyMonth.addItem("AUGUST");
        this.CombomyMonth.addItem("SEPTEMBER");
        this.CombomyMonth.addItem("OCTOBER");
        this.CombomyMonth.addItem("NOVEMBER");
        this.CombomyMonth.addItem("DECEMBER");
        this.txtTermYear = new JTextField(5);
        this.txtStaffName = new JTextField(10);
        this.txtAuthorizedBy = new JTextField(10);
        this.txtmaxNoInClass = new JTextField(5);
        this.btnExecute = new JButton("Execute");
        this.lblmaxNoInClass = new JLabel("MAXnoINclass: ");
        this.lblStaffName = new JLabel("Staff Name: ");
        this.lblAuthorizedBy = new JLabel("Autorized by: ");
        this.lblDate = new JLabel("Date: ");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(410, 250);
        this.setTitle("Specify MAX No. In Class - For Acasol");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.black);
        this.btnSave.setForeground(Color.white);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.black);
        this.btnClose.setForeground(Color.white);
        this.btnPreview.setBackground(Color.red);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.red);
        this.btnSearch.setBackground(Color.red);
        this.btnPrevious.setBackground(Color.green);
        this.btnExecute.setBackground(Color.red.darker());
        this.btnExecute.setForeground(Color.gray.brighter());
        this.addItem(this.panel, this.lblmaxNoInClass, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.txtmaxNoInClass, 1, 4, 3, 1, 17);
        this.addItem(this.panel, this.lblStaffName, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffName, 1, 5, 3, 1, 17);
        this.addItem(this.panel, this.lblAuthorizedBy, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.txtAuthorizedBy, 1, 6, 3, 1, 17);
        this.addItem(this.panel, this.lblDate, 0, 7, 1, 1, 13);
        this.addItem(this.panel, (JComponent)this.picker, 1, 7, 1, 1, 17);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(this.btnExecute);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 3, 8, 1, 1, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                SpecifyMAXnoINclass.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                SpecifyMAXnoINclass.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                SpecifyMAXnoINclass.this.connectToDB();
                SpecifyMAXnoINclass.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                SpecifyMAXnoINclass.this.connectToDB();
                SpecifyMAXnoINclass.this.btnNextMethod(evt4);
            }
        });
        this.btnExecute.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                SpecifyMAXnoINclass.this.connectToDB();
                SpecifyMAXnoINclass.this.btnExecuteMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                SpecifyMAXnoINclass.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                SpecifyMAXnoINclass.this.btnPreviewMethod(evt7);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                SpecifyMAXnoINclass.this.connectToDB();
                SpecifyMAXnoINclass.this.btnPreviousMethod(evt9);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                SpecifyMAXnoINclass.this.connectToDB();
                SpecifyMAXnoINclass.this.ComboSelecClassMethod(evt10);
            }
        });
    }
    
    public static void main(final String[] args) {
        new SpecifyMAXnoINclass();
    }
    
    public void connectToDB() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
        }
        catch (InstantiationException e2) {
            JOptionPane.showMessageDialog(null, "Please, enter parent phone number", "database connectivity error\n" + e2.getMessage(), 0);
            e2.printStackTrace();
        }
        catch (IllegalAccessException e3) {
            JOptionPane.showMessageDialog(null, "Please, enter parent phone number", "database connectivity error\n" + e3.getMessage(), 0);
            e3.printStackTrace();
        }
        catch (ClassNotFoundException e4) {
            JOptionPane.showMessageDialog(null, "Please, enter parent phone number", "database connectivity error\n" + e4.getMessage(), 0);
            e4.printStackTrace();
        }
    }
    
    public void btnCloseMethod(final ActionEvent e1) {
        this.dispose();
    }
    
    public void btnClearMethod(final ActionEvent e2) {
        this.txtRegNum.setText("");
        this.txtName.setText("");
        this.txtClass.setText("");
        this.txtClassWorkMarks.setText("");
        this.txtHomeWorkMarks.setText("");
        this.TextArea.setText("");
    }
    
    public void btnSearchMethod(final ActionEvent e3) {
        this.txtName.setText("");
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int RegNum = rs.getInt(1);
                    Integer.toString(RegNum);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                a.printStackTrace();
            }
        }
    }
    
    public void btnNextMethod(final ActionEvent e4) {
        this.txtClassWorkMarks.setText("");
        this.txtHomeWorkMarks.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtRegNum.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            Reg = Integer.parseInt(this.txtRegNum.getText().toString());
            final String R = Integer.toString(++Reg);
            this.txtRegNum.setText(R);
            final String RegNumber = this.txtRegNum.getText().toString();
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myClass);
            final ResultSet rs = pstatement.executeQuery();
            if (!rs.isLast()) {
                rs.next();
                final String Name = rs.getObject(2).toString();
                this.txtName.setText(Name);
                final String Class = rs.getObject(3).toString();
                this.txtClass.setText(Class);
                this.panel.repaint();
                rs.close();
                this.connection.close();
                pstatement.close();
            }
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
    }
    
    public void btnExecuteMethod(final ActionEvent evt5) {
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String MaxNoInclass = this.txtmaxNoInClass.getText().toString();
        final String staffname = this.txtStaffName.getText().toString();
        final String authorizedby = this.txtAuthorizedBy.getText().toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final String FDate;
        final String Date = FDate = sdf1.format(this.picker.getDate()).toString();
        final double myMaxNoInclass = Double.parseDouble(MaxNoInclass);
        if (MaxNoInclass.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, specify no in class!", "Error occured", 0);
        }
        else if (myMaxNoInclass < 0.0) {
            JOptionPane.showMessageDialog(null, "Please, negative number not allowed, the recomendation is 50!", "Error occured", 0);
        }
        else if (staffname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter your name!", "Error in student name", 0);
        }
        else if (authorizedby.equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter the name of authority!", "Error in student name", 0);
        }
        else {
            int maximumNo = 0;
            try {
                final String QueryString = "SELECT COUNT(*) maxnoInclass FROM MaxNoinClass";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) maxnoInclass FROM MaxNoinClass");
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    maximumNo = rs.getInt(1);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            if (maximumNo > 0) {
                JOptionPane.showMessageDialog(null, "Attention, MAX no. in class has already been specied.", "Error occured", 0);
            }
            else {
                try {
                    final String InsertQueryString = "INSERT INTO MaxNoinClass VALUES (?,?,?,?)";
                    final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO MaxNoinClass VALUES (?,?,?,?)");
                    pstatement.setString(1, MaxNoInclass);
                    pstatement.setString(2, staffname);
                    pstatement.setString(3, authorizedby);
                    pstatement.setString(4, Date);
                    final int numberOfRowsUpdated = pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(this.btnSave, "the MAX no. in all classes is: = " + MaxNoInclass + " as authorised by:  " + authorizedby);
                    this.connection.close();
                    pstatement.close();
                }
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void btnPrintMethod(final ActionEvent evt6) {
        final MessageFormat header = new MessageFormat("AcaSoft Evaluations & Cont. Assmng PrintoutPage - {0}");
        final MessageFormat footer = new MessageFormat("AcaSoft Evaluations & Continuous Assessment Data Entry Form");
        try {
            final boolean complete = this.TextArea.print(header, footer);
            if (complete) {
                final String message_for_SuccessfulPrint = "printing is successfully done, thank you.";
                JOptionPane.showMessageDialog(this.btnPrint, "printing is successfully done, thank you.", "Successful Ptinting", 1);
            }
            else {
                final String message_for_NonSuccessfulPrint = "Printer error, check your printer and try again";
                JOptionPane.showMessageDialog(this.btnPrint, "Printer error, check your printer and try again", "Error in Ptinting", 1);
            }
        }
        catch (PrinterException printerE) {
            final String message_for_NonSuccessfulPrint = "Sorry, a printer error occurred";
            JOptionPane.showMessageDialog(this.btnPrint, "Sorry, a printer error occurred", "Error in Printing", 1);
            printerE.printStackTrace();
        }
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
        this.TextArea.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final int myRegNum = Integer.parseInt(this.txtRegNum.getText().toString());
        final String RegNum = String.format("%05d", myRegNum);
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String ClassWork = this.txtClassWorkMarks.getText().toString();
        final String HomeWork = this.txtHomeWorkMarks.getText().toString();
        final String WkNumber = (String)this.ComboWeekNumber.getSelectedItem();
        final String CWorkNo = (String)this.ComboCWorkNo.getSelectedItem();
        final String HWorkNo = (String)this.ComboHWorkNo.getSelectedItem();
        if (this.ComboWeekNumber.getSelectedItem().toString().equals("SELECT WEEK")) {
            JOptionPane.showMessageDialog(this.btnPreview, "Please, select week!", "Error Occured", 0);
        }
        else if (this.txtClassWorkMarks.getText().equals("") || this.txtHomeWorkMarks.getText().equals("") || this.txtName.getText().equals("") || this.txtRegNum.getText().equals("")) {
            JOptionPane.showMessageDialog(this.btnPreview, "Some textboxes are empty, check and fill the required data", "Error in Evaluations & Cont Assmng", 0);
        }
        else if (this.ComboCWorkNo.getSelectedItem().toString().equals("SELECT C_WORK NO")) {
            JOptionPane.showMessageDialog(null, "Please, selet Classwork Number", "Error occured", 0);
        }
        else if (this.ComboHWorkNo.getSelectedItem().toString().equals("SELECT H_WORK NO")) {
            JOptionPane.showMessageDialog(null, "Please, selet Homework Number", "Error occured", 0);
        }
        else {
            this.TextArea.append("ACASSOL SOFT.:\n--------------------------------------------------------------\nCOMPUTERIZED EVALUATION AND CONT. ASSESSMENT SLIP\n----------------------------------------------------------------------------------------\n\nWEEK NUMBER: " + WkNumber + "\n" + "NAME OF STUDENT:" + "  " + Name + "\n" + "REG. NUMBER:" + "  " + "ALGC/ " + RegNum + "\n" + "CLASS:" + "  " + myclass + "\n" + "TERM:" + " " + term + "\n" + "FORM:" + "  " + form + "\n" + "SUBJECT:" + "  " + subj + "\n" + "DATE:" + "  " + Date + "\n" + "CLASSWORK NUMBER:  " + CWorkNo + "\n" + "CLASSWORK: " + "  " + ClassWork + "\n" + "HOMEWORK NUMBER:  " + HWorkNo + "\n" + "HOMEWORK:" + "  " + HomeWork + "\n" + "\n");
            this.TextArea.setEditable(true);
        }
    }
    
    public void ComboWeekNumberMethod(final ActionEvent evt8) {
        if (evt8.getSource() == this.ComboWeekNumber) {
            final String cwn = (String)this.ComboWeekNumber.getSelectedItem();
            if (cwn.equals("WEEK ONE")) {
                this.ComboCWorkNo.setSelectedItem("1ST C_WORK");
                this.ComboHWorkNo.setSelectedItem("1ST H_WORK");
            }
            else if (cwn.equals("WEEK TWO")) {
                this.ComboCWorkNo.setSelectedItem("2ND C_WORK");
                this.ComboHWorkNo.setSelectedItem("2ND H_WORK");
            }
            else if (cwn.equals("WEEK THREE")) {
                this.ComboCWorkNo.setSelectedItem("3RD C_WORK");
                this.ComboHWorkNo.setSelectedItem("3RD H_WORK");
            }
            else if (cwn.equals("WEEK FOUR")) {
                this.ComboCWorkNo.setSelectedItem("4TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("4TH H_WORK");
            }
            else if (cwn.equals("WEEK FIVE")) {
                this.ComboCWorkNo.setSelectedItem("5TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("5TH H_WORK");
            }
            else if (cwn.equals("WEEK SIX")) {
                this.ComboCWorkNo.setSelectedItem("6TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("6TH H_WORK");
            }
            else if (cwn.equals("WEEK SEVEN")) {
                this.ComboCWorkNo.setSelectedItem("7TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("7TH H_WORK");
            }
            else if (cwn.equals("WEEK EIGHT")) {
                this.ComboCWorkNo.setSelectedItem("8TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("8TH H_WORK");
            }
            else if (cwn.equals("WEEK NINE")) {
                this.ComboCWorkNo.setSelectedItem("9TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("9TH H_WORK");
            }
            else if (cwn.equals("WEEK TEN")) {
                this.ComboCWorkNo.setSelectedItem("10TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("10TH H_WORK");
            }
            else if (cwn.equals("WEEK ELEVEN")) {
                this.ComboCWorkNo.setSelectedItem("11TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("11TH H_WORK");
            }
            else if (cwn.equals("WEEK TWELVE")) {
                this.ComboCWorkNo.setSelectedItem("12TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("12TH H_WORK");
            }
            else if (cwn.equals("WEEK THIRTEEN")) {
                this.ComboCWorkNo.setSelectedItem("13TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("13TH H_WORK");
            }
            else if (cwn.equals("WEEK FOURTEEN")) {
                this.ComboCWorkNo.setSelectedItem("14TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("14TH H_WORK");
            }
            else if (cwn.equals("WEEK FIFTEEN")) {
                this.ComboCWorkNo.setSelectedItem("15TH C_WORK");
                this.ComboHWorkNo.setSelectedItem("15TH H_WORK");
            }
            this.panel.repaint();
            this.panel.revalidate();
        }
    }
    
    public void btnPreviousMethod(final ActionEvent e9) {
        this.txtClassWorkMarks.setText("");
        this.txtHomeWorkMarks.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtRegNum.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            Reg = Integer.parseInt(this.txtRegNum.getText().toString());
            final String R = Integer.toString(--Reg);
            this.txtRegNum.setText(R);
            final String RegNumber = this.txtRegNum.getText().toString();
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myClass);
            final ResultSet rs = pstatement.executeQuery();
            if (!rs.isLast()) {
                rs.next();
                final String Name = rs.getObject(2).toString();
                this.txtName.setText(Name);
                final String Class = rs.getObject(3).toString();
                this.txtClass.setText(Class);
                this.panel.repaint();
                rs.close();
                this.connection.close();
                pstatement.close();
            }
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
    }
    
    public void ComboSelecClassMethod(final ActionEvent evt10) {
        if (evt10.getSource() == this.ComboSelecClass) {
            final String csc = (String)this.ComboSelecClass.getSelectedItem();
            if (csc.equals("JSS I A") || csc.equals("JSS I B")) {
                this.ComboForm.setSelectedItem("FORM ONE");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISHjss");
                this.ComboSelectSubj.addItem("MATHSjss");
                this.ComboSelectSubj.addItem("IRSjss");
                this.ComboSelectSubj.addItem("ARABICjss");
                this.ComboSelectSubj.addItem("HOME ECONOMICjss");
                this.ComboSelectSubj.addItem("AGRICULTURAL SCIENCEjss");
                this.ComboSelectSubj.addItem("PHEjss");
                this.ComboSelectSubj.addItem("BASIC SCIENCEjss");
                this.ComboSelectSubj.addItem("CIVIC EDUCATIONjss");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISHjss");
                this.ComboSelectSubj.addItem("QURANjss");
                this.ComboSelectSubj.addItem("HAUSAjss");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCEjss");
                this.ComboSelectSubj.addItem("BASIC TECHNOLOGYjss");
                this.ComboSelectSubj.addItem("CCAjss");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("INTEGRATED SCIENCEjss");
                this.ComboSelectSubj.addItem("INTRO TECHNOLOGYjss");
                this.ComboSelectSubj.addItem("BUSINESS STUDIESjss");
                this.ComboSelectSubj.addItem("QURAN & TAJWEEDjss");
            }
            else if (csc.equals("JSS II A") || csc.equals("JSS II B")) {
                this.ComboForm.setSelectedItem("FORM TWO");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISHjss");
                this.ComboSelectSubj.addItem("MATHSjss");
                this.ComboSelectSubj.addItem("IRSjss");
                this.ComboSelectSubj.addItem("ARABICjss");
                this.ComboSelectSubj.addItem("HOME ECONOMICjss");
                this.ComboSelectSubj.addItem("AGRICULTURAL SCIENCEjss");
                this.ComboSelectSubj.addItem("PHEjss");
                this.ComboSelectSubj.addItem("BASIC SCIENCEjss");
                this.ComboSelectSubj.addItem("CIVIC EDUCATIONjss");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISHjss");
                this.ComboSelectSubj.addItem("QURANjss");
                this.ComboSelectSubj.addItem("HAUSAjss");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCEjss");
                this.ComboSelectSubj.addItem("BASIC TECHNOLOGYjss");
                this.ComboSelectSubj.addItem("CCAjss");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("INTEGRATED SCIENCEjss");
                this.ComboSelectSubj.addItem("INTRO TECHNOLOGYjss");
                this.ComboSelectSubj.addItem("BUSINESS STUDIESjss");
                this.ComboSelectSubj.addItem("QURAN & TAJWEEDjss");
            }
            else if (csc.equals("JSS III A") || csc.equals("JSS III B")) {
                this.ComboForm.setSelectedItem("FORM THREE");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("ENGLISHjss");
                this.ComboSelectSubj.addItem("MATHSjss");
                this.ComboSelectSubj.addItem("IRSjss");
                this.ComboSelectSubj.addItem("ARABICjss");
                this.ComboSelectSubj.addItem("HOME ECONOMICjss");
                this.ComboSelectSubj.addItem("AGRICULTURAL SCIENCEjss");
                this.ComboSelectSubj.addItem("PHEjss");
                this.ComboSelectSubj.addItem("BASIC SCIENCEjss");
                this.ComboSelectSubj.addItem("CIVIC EDUCATIONjss");
                this.ComboSelectSubj.addItem("LITERATURE IN ENGLISHjss");
                this.ComboSelectSubj.addItem("QURANjss");
                this.ComboSelectSubj.addItem("HAUSAjss");
                this.ComboSelectSubj.addItem("COMPUTER SCIENCEjss");
                this.ComboSelectSubj.addItem("BASIC TECHNOLOGYjss");
                this.ComboSelectSubj.addItem("CCAjss");
                this.ComboSelectSubj.addItem("SOCIAL STUDIES");
                this.ComboSelectSubj.addItem("INTEGRATED SCIENCEjss");
                this.ComboSelectSubj.addItem("INTRO TECHNOLOGYjss");
                this.ComboSelectSubj.addItem("BUSINESS STUDIESjss");
                this.ComboSelectSubj.addItem("QURAN & TAJWEEDjss");
            }
            else if (csc.equals("SSS1 A") || csc.equals("SSS1 B")) {
                this.ComboForm.setSelectedItem("FORM FOUR");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("Quran & Tajweed");
                this.ComboSelectSubj.addItem("Arabic Language");
                this.ComboSelectSubj.addItem("Biology");
                this.ComboSelectSubj.addItem("Chemistry");
                this.ComboSelectSubj.addItem("Computer Science");
                this.ComboSelectSubj.addItem("Economics");
                this.ComboSelectSubj.addItem("English Language");
                this.ComboSelectSubj.addItem("Foods and Nutrition");
                this.ComboSelectSubj.addItem("Further Mathematics");
                this.ComboSelectSubj.addItem("Geography");
                this.ComboSelectSubj.addItem("Government");
                this.ComboSelectSubj.addItem("Hausa");
                this.ComboSelectSubj.addItem("Home Management");
                this.ComboSelectSubj.addItem("History");
                this.ComboSelectSubj.addItem("Islamic Religion Knowledge");
                this.ComboSelectSubj.addItem("Literature in English");
                this.ComboSelectSubj.addItem("Mathematics");
                this.ComboSelectSubj.addItem("Physics");
            }
            else if (csc.equals("SSS2 A") || csc.equals("SSS2 B")) {
                this.ComboForm.setSelectedItem("FORM FIVE");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("Quran & Tajweed");
                this.ComboSelectSubj.addItem("Arabic Language");
                this.ComboSelectSubj.addItem("Biology");
                this.ComboSelectSubj.addItem("Chemistry");
                this.ComboSelectSubj.addItem("Computer Science");
                this.ComboSelectSubj.addItem("Economics");
                this.ComboSelectSubj.addItem("English Language");
                this.ComboSelectSubj.addItem("Foods and Nutrition");
                this.ComboSelectSubj.addItem("Further Mathematics");
                this.ComboSelectSubj.addItem("Geography");
                this.ComboSelectSubj.addItem("Government");
                this.ComboSelectSubj.addItem("Hausa");
                this.ComboSelectSubj.addItem("Home Management");
                this.ComboSelectSubj.addItem("History");
                this.ComboSelectSubj.addItem("Islamic Religion Knowledge");
                this.ComboSelectSubj.addItem("Literature in English");
                this.ComboSelectSubj.addItem("Mathematics");
                this.ComboSelectSubj.addItem("Physics");
            }
            else if (csc.equals("SSS3 A") || csc.equals("SSS3 B")) {
                this.ComboForm.setSelectedItem("FORM SIX");
                this.ComboSelectSubj.removeAllItems();
                this.ComboSelectSubj.addItem("SELECT SUBJECT");
                this.ComboSelectSubj.addItem("Quran & Tajweed");
                this.ComboSelectSubj.addItem("Arabic Language");
                this.ComboSelectSubj.addItem("Biology");
                this.ComboSelectSubj.addItem("Chemistry");
                this.ComboSelectSubj.addItem("Computer Science");
                this.ComboSelectSubj.addItem("Economics");
                this.ComboSelectSubj.addItem("English Language");
                this.ComboSelectSubj.addItem("Foods and Nutrition");
                this.ComboSelectSubj.addItem("Further Mathematics");
                this.ComboSelectSubj.addItem("Geography");
                this.ComboSelectSubj.addItem("Government");
                this.ComboSelectSubj.addItem("Hausa");
                this.ComboSelectSubj.addItem("Home Management");
                this.ComboSelectSubj.addItem("History");
                this.ComboSelectSubj.addItem("Islamic Religion Knowledge");
                this.ComboSelectSubj.addItem("Literature in English");
                this.ComboSelectSubj.addItem("Mathematics");
                this.ComboSelectSubj.addItem("Physics");
            }
            else {
                this.ComboForm.setSelectedItem("SELECT FORM");
            }
            this.panel.repaint();
            this.panel.revalidate();
        }
    }
    
    private void addItem(final JPanel p, final JComponent c, final int x, final int y, final int width, final int height, final int align) {
        final GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = x;
        gc.gridy = y;
        gc.gridwidth = width;
        gc.gridheight = height;
        gc.weightx = 100.0;
        gc.weighty = 100.0;
        gc.insets = new Insets(5, 5, 5, 5);
        gc.anchor = align;
        gc.fill = 0;
        p.add(c, gc);
    }
}
