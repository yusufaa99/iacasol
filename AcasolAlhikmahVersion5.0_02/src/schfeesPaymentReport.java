import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import com.wildcrest.j2printerworks.J2ComponentPrinter;
import com.wildcrest.j2printerworks.J2Printer;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.border.Border;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.table.TableModel;
import java.awt.Component;
import java.awt.Color;
import java.util.Calendar;

import com.mysql.cj.Session;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class schfeesPaymentReport extends JFrame
{
    private static final long serialVersionUID = 1L;
    int acctCounter;
    String pulledClassName_Eng;
    int accControlCounter;
    String myUsername_From_Authentication_Class;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private ResultSet rs;
    private JPanel panel;
    private JPanel panel2;
    private String Combosuject_Eng;
    private JComboBox CombPulledosuject_Eng;
    private JComboBox ComboSession;
    private JButton btnDeregister;

    private JLabel lblSession;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblID;
    private JLabel lblRegNum;
    private JLabel lblName;
    private JLabel lblClass;
    private JLabel lblStudentCategory;
    private JLabel lblForm;
    private JLabel lblPercentage;
    private JLabel lbldate;
    private JLabel lbldate2;
    private JLabel lblDay;
    private JLabel lblMonth;
    private JLabel lblYear;
    private JLabel lblTest;
    private JLabel lblSelectTest;
    private JLabel lblOutput;
    private JTextField txtID;
    private JTextField txtRegNum;
    private JTextField txtName;
    private JTextField txtClass;
    private JTextField txtTest1Marks;
    private JTextField txtTest2Marks;
    private JTextField txtExamMarks;
    private JTextField txtHomeWork;
    
    private JLabel lblSumTotalAmountPaid;
    
    
    Font tablefont;
    Font f;
    Font f2;
    private JLabel lblHomeWork;
    private JLabel lblTest1Marks;
    private JLabel lblTest2Marks;
    private JLabel lblExamMarks;
    private JComboBox ComboStudentCategory;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboScholashipPercentage;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JComboBox ComboWeekNumber;
    private JComboBox comboTest;
    private JButton btnPreview;
    private JButton btnPreview2;
    private JButton btnPreview3;
    private JButton btnPayAdvice;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnPrint;
    private JButton btnPrint2;
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
    private JComboBox ComboTerm;    
    private JLabel lblTerm;
    private JComboBox ComboPaymentOption;
    private JLabel lblPaymentOption;
    
    private JTextField txtTotalFeesPaid;
    private JLabel lblTotalFeesPaid;
    
    private JButton btnClose;
    private JTextArea TextArea;
    private JScrollPane ScrollPane;
    private JComboBox ComboQueryAllSelectSubj;
    private JButton btnSearch;
    private JButton btnPrevious;
    private JButton btnNext;
    private JTextField txtmyclass;
    private JLabel lblTest1Percentage;
    private JLabel lblTest2Percentage;
    private JLabel lblHomeWorkPercentage;
    private JLabel lblExamPercentage;
    private DefaultTableModel tableModel1;
    Vector columnNames;
    Vector data;
    private JTable table;
    private JTable table2;
    private JScrollPane myreportJSP;
    private JTextPane myreportJTP;
    private JTextPane textPane;
    private JTextPane textPane2;
    private JScrollPane paneScrollPane;
    private JScrollPane paneScrollPane2;
    private JDateChooser picker;
    private JDateChooser picker2;
    int flag;
    int result;
    ResultSet rscomboClass;
    PreparedStatement pstatementcomboClass;
    
    public schfeesPaymentReport() {
        this.acctCounter = 0;
        this.pulledClassName_Eng = "";
        this.accControlCounter = 0;
        this.myUsername_From_Authentication_Class = "";
        this.Combosuject_Eng = "";
        this.tablefont = new Font("null", 1, 14);
        this.f = new Font("Arial Unicode MS", 1, 18);
        this.f2 = new Font("Arial Unicode MS", 1, 11);
        this.columnNames = new Vector();
        this.data = new Vector();
        this.flag = 0;
        this.result = 0;
    }
    
    public void schfeesPaymentReport() {
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
         
        (this.picker2 = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker2.setDateFormatString("yyyy-MM-dd");
        
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        lblSumTotalAmountPaid = new JLabel("Initial Totalsum");
        
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblID = new JLabel("STUD. ID:");
        this.lblRegNum = new JLabel("REG. NO:");
        this.lblName = new JLabel("NAME:");
        this.lblClass = new JLabel("CLASS:");
        this.lblStudentCategory = new JLabel("CATEGORY:");
        this.lblForm = new JLabel("FORM:");
        this.lblPercentage= new JLabel("PERCENTAGE:");
        this.lbldate = new JLabel("DATE1:");
        this.lbldate2 = new JLabel("DATE2:");
        this.lblDay = new JLabel("DAY:");
        this.lblMonth = new JLabel("MONTH");
        this.lblYear = new JLabel("YEAR:");
        this.lblTest = new JLabel("TEST:");
        this.lblSelectTest = new JLabel("SELECT TEST:");
        this.lblHomeWork = new JLabel("HOMEWORK:");
        this.lblTest1Marks = new JLabel("TEST SCORE: ");
        this.lblTest2Marks = new JLabel("TEST2 SCORE: ");
        this.lblExamMarks = new JLabel("EXAMINATION SCORE: ");
        this.txtHomeWork = new JTextField(5);
        this.txtTest1Marks = new JTextField(5);
        this.txtTest2Marks = new JTextField(5);
        this.txtExamMarks = new JTextField(5);
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        this.txtID = new JTextField("0", 7);
        this.txtRegNum = new JTextField(16);
        (this.txtRegNum = new JTextField(16)).setEditable(false);
        this.txtName = new JTextField(25);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtID.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.txtName.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.txtClass.setFont(this.f);
        this.txtRegNum.setFont(this.f);
        this.lblSession = new JLabel("SESSION:");
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(this.f);
        this.ComboSession.setBackground(Color.RED);
        this.ComboSession.setForeground(Color.white);
        this.CombPulledosuject_Eng = new JComboBox();
        (this.ComboSelecClass = new JComboBox()).setFont(this.f);
        this.ComboSelecClass.addItem("SELECT CLASS");
        this.ComboSelecClass.setEditable(false);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        (this.ComboStudentCategory = new JComboBox()).addItem("SELECT CATEGORY");
        this.ComboStudentCategory.addItem("PAID STUDENT");
        this.ComboStudentCategory.addItem("FULL SCHOLARSHIPS");
        this.ComboStudentCategory.addItem("PARTIAL SCHOLARSHIPS");
        this.ComboStudentCategory.setFont(this.f);
        (this.ComboForm = new JComboBox()).addItem("SELECT FORM");
        this.ComboForm.addItem("FORM ONE");
        this.ComboForm.addItem("FORM TWO");
        this.ComboForm.addItem("FORM THREE");
        this.ComboForm.addItem("FORM FOUR");
        this.ComboForm.addItem("FORM FIVE");
        this.ComboForm.addItem("FORM SIX");
        (this.ComboScholashipPercentage = new JComboBox()).addItem("SELECT SCHOLARSHIP %");
        ComboScholashipPercentage.addItem("Full Scholarship-(Sch. fees off)");
        ComboScholashipPercentage.addItem("Partial Scholarship-(pays 50% of Sch. fees)");
        this.ComboScholashipPercentage.setFont(this.f);
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
        (this.comboTest = new JComboBox()).addItem("1ST TEST");
        (this.ComboWeekNumber = new JComboBox()).addItem("SELECT WEEK");
        this.ComboWeekNumber.addItem("WEEK ONE");
        this.ComboWeekNumber.addItem("WEEK TWO");
        this.ComboWeekNumber.addItem("WEEK THREE");
        this.ComboWeekNumber.addItem("WEEK FOUR");
        this.ComboWeekNumber.addItem("WEEK FIVE");
        this.ComboWeekNumber.addItem("WEEK SIX");
        this.ComboWeekNumber.addItem("WEEK SEVEN");
        this.ComboWeekNumber.addItem("WEEK EIGHT");
        this.ComboWeekNumber.addItem("WEEK NINE");
        this.ComboWeekNumber.addItem("WEEK TEN");
        this.ComboWeekNumber.addItem("WEEK ELEVEN");
        this.ComboWeekNumber.addItem("WEEK TWELVE");
        this.ComboWeekNumber.addItem("WEEK THIRTEEN");
        this.ComboWeekNumber.addItem("WEEK FOURTEEN");
        this.ComboWeekNumber.addItem("WEEK FIFTEEN");
        this.btnPreview = new JButton("Preview By Session and Class");
        this.btnPreview2 = new JButton("Preview By Session, Class and Date");
        this.btnPreview3 = new JButton("Preview (SUM) By Session, Class and Date");
        this.btnPayAdvice = new JButton("Pay Advice");
        
        this.btnSave = new JButton("Save");
        this.btnDeregister = new JButton("Deregister");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        //this.btnPrint = new JButton("Print2");
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
        this.lblQueryAllSelecTerm = new JLabel("TERM:");
        (this.ComboQuerySelectForm = new JComboBox()).addItem("FORM ONE");
        this.ComboQuerySelectForm.addItem("FORM TWO");
        this.ComboQuerySelectForm.addItem("FORM THREE");
        this.lblQuerySelectForm = new JLabel("FORM:");
        this.btnSearchAllRecord = new JButton("search All>>>");
        (this.ComboQueryAllSelectSubj = new JComboBox()).addItem("SELECT SUBJECT");
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
        
        lblTerm = new JLabel("TERM: ");
        ComboTerm = new JComboBox();
        ComboTerm.addItem("SELECT TERM");
        ComboTerm.addItem("FIRST TERM");
        ComboTerm.addItem("SECOND TERM");
        ComboTerm.addItem("THIRD TERM");
        ComboTerm.setFont(f);//assigned a given font
        
        lblPaymentOption = new JLabel("PAYMENT OPTION:");
        ComboPaymentOption = new JComboBox();
        ComboPaymentOption.addItem("COMPULSORY FEES ONLY");
        ComboPaymentOption.addItem("COMPULSORY FEES + BOOKS AND SPORTWEAR");
        ComboPaymentOption.setFont(f);//
        
        txtTotalFeesPaid = new JTextField(8);
        txtTotalFeesPaid.setFont(f);
        lblTotalFeesPaid = new JLabel("AMOUNT PAID: ");
        
        this.btnClose = new JButton("Close");
        this.btnSearch = new JButton("Search>>");
        this.btnPrevious = new JButton("<<previous");
        this.btnNext = new JButton("next>>");
        this.TextArea = new JTextArea(6, 80);
        this.ScrollPane = new JScrollPane(this.TextArea, 20, 32);
        this.txtmyclass = new JTextField();
        this.lblHomeWorkPercentage = new JLabel("10%");
        this.lblTest2Percentage = new JLabel("40%");
        this.lblTest1Percentage = new JLabel("40%");
        this.lblExamPercentage = new JLabel("60%");
        this.lblTest1Percentage.setForeground(Color.red);
        this.lblTest2Percentage.setForeground(Color.red);
        this.lblExamPercentage.setForeground(Color.red);
        this.tableModel1 = new DefaultTableModel(0, 0);
        final JTable table = new JTable(this.tableModel1);
        
        table.setAutoCreateRowSorter(true);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setBackground(Color.white);
        table.setGridColor(Color.black);
        table.setForeground(Color.black);
        table.setAutoResizeMode(4);
        table.setAutoResizeMode(1);
        table.setAutoResizeMode(2);
        table.setFont(this.tablefont);
        
        final JTable table2 = new JTable(this.tableModel1);
       
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 32);
        //ScrollPane.setPreferredSize(new Dimension(670, 280));
        ScrollPane.setEnabled(true);
        ScrollPane.setVisible(true);
        
        final JScrollPane ScrollPane2 = new JScrollPane(table2, 22, 32);
        //ScrollPane2.setPreferredSize(new Dimension(670, 280));
        ScrollPane2.setEnabled(true);
        ScrollPane2.setVisible(true);
        
        this.panel.validate();
        this.panel.repaint();
        this.myreportJTP = new JTextPane();
        this.textPane = this.createTextPane();
        this.textPane2 = this.createTextPane();
        final JScrollPane paneScrollPane = new JScrollPane(this.textPane);
        final JScrollPane paneScrollPane2 = new JScrollPane(this.textPane2);
        this.panel.validate();
        this.panel.repaint();
       paneScrollPane.setVerticalScrollBarPolicy(22);
        paneScrollPane.setHorizontalScrollBarPolicy(32);
        paneScrollPane.setPreferredSize(new Dimension(795, 250));
        paneScrollPane.setBackground(Color.cyan);
        this.textPane.insertIcon(new ImageIcon("dailyPaymentReport.png"));
        this.setIconImage(new ImageIcon("icon.jpg").getImage());
        //textPane.setText(lblSumTotalAmountPaid.toString());
        
        paneScrollPane2.setVerticalScrollBarPolicy(22);
       paneScrollPane2.setHorizontalScrollBarPolicy(32);
        paneScrollPane2.setPreferredSize(new Dimension(795, 250));
        paneScrollPane2.setBackground(Color.cyan);
        this.textPane2.insertIcon(new ImageIcon("dailyPaymentReport.png"));
        this.setIconImage(new ImageIcon("icon.jpg").getImage());
        
        this.textPane.insertComponent(ScrollPane);
        this.textPane.insertComponent(ScrollPane);
        
        this.textPane2.insertComponent(ScrollPane2);
        this.textPane2.insertComponent(ScrollPane2);
        final Border TB = new TitledBorder("Marks Data Entry Section");
        this.panel2.setBorder(TB);
        this.panel.setLayout(new GridBagLayout());
        this.panel2.setLayout(new GridBagLayout());
        this.panel2.setBackground(Color.green.brighter());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(920, 485);
        this.setTitle("School Fees Payment Report");
        this.add(this.panel);
        this.setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.BLUE);
        this.btnDeregister.setForeground(Color.RED);
        this.btnSave.setForeground(Color.WHITE);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.BLACK);
        this.btnPreview.setForeground(Color.CYAN);
        
        this.btnPreview2.setBackground(Color.BLACK);
        this.btnPreview2.setForeground(Color.WHITE);
        
        this.btnPreview3.setBackground(Color.BLACK);
        this.btnPreview3.setForeground(Color.WHITE);
        
        btnPreview.setFont(f2);
        btnPreview2.setFont(f2);
        btnPreview3.setFont(f2);
        
        this.btnPayAdvice.setBackground(Color.BLACK);
        this.btnPayAdvice.setForeground(Color.CYAN);
        
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.BLACK);
        this.btnNext.setForeground(Color.CYAN);
        this.btnSearch.setBackground(Color.red);
        this.btnSearch.setBackground(Color.BLACK);
        this.btnSearch.setForeground(Color.CYAN);
        this.btnPrevious.setBackground(Color.green);
        this.addItem(this.panel, this.lblSession, 0, 1, 1, 1, 13);
        this.addItem(this.panel, this.ComboSession, 1, 1, 1, 1, 17);
        final Box REgIDBox = Box.createHorizontalBox();
        REgIDBox.add(Box.createHorizontalStrut(5));
        REgIDBox.add(this.txtID);
        REgIDBox.add(Box.createHorizontalStrut(8));
        REgIDBox.add(this.lblRegNum);
        REgIDBox.add(Box.createHorizontalStrut(5));
        REgIDBox.add(this.txtRegNum);
        REgIDBox.add(Box.createHorizontalStrut(8));
        
//        this.addItem(this.panel, this.lblID, 0, 2, 1, 1, 13);
//        this.addItem(this.panel, this.txtID, 1, 2, 1, 1, 17);
//        this.addItem(this.panel, this.lblRegNum, 0, 3, 1, 1, 13);
//        this.addItem(this.panel, this.txtRegNum, 1, 3, 1, 1, 17);
//        this.addItem(this.panel, this.lblName, 0, 4, 1, 1, 13);
//        this.addItem(this.panel, this.txtName, 1, 4, 2, 1, 17);
//      
        this.addItem(this.panel, this.lblClass, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 5, 3, 1, 17);
      //  this.addItem(this.panel, this.lblTerm, 0, 6, 1, 1, 13);
      //  this.addItem(this.panel, this.ComboTerm, 1, 6, 3, 1, 17);
        
        final Box DateBox = Box.createHorizontalBox();
        DateBox.add((Component)this.picker);
        DateBox.add(Box.createHorizontalStrut(5));
        DateBox.add((Component)this.picker2);
        DateBox.add(Box.createHorizontalStrut(5));
        
        this.addItem(this.panel, this.lbldate, 0, 7, 1, 1, 13);
        this.addItem(this.panel, this.picker, 1, 7, 3, 1, 17);
        
        this.addItem(this.panel, this.lbldate2, 0, 8, 1, 1, 13);
        this.addItem(this.panel, this.picker2, 1, 8, 3, 1, 17);
     //   this.addItem(this.panel, this.lblPaymentOption, 0, 8, 1, 1, 13);
      //  this.addItem(this.panel, this.ComboPaymentOption, 1, 8, 3, 1, 17);
        
       // this.addItem(this.panel, this.lblPercentage, 0, 7, 1, 1, 13);
       // this.addItem(this.panel, this.ComboScholashipPercentage, 1, 7, 3, 1, 17);
       
       // this.addItem(this.panel, this.panel2, 1, 9, 2, 2, 17);
      //  this.addItem(this.panel2, this.lblTest1Marks, 0, 2, 1, 1, 13);
        final Box MarksBox1 = Box.createHorizontalBox();
        MarksBox1.add(Box.createHorizontalStrut(5));
        MarksBox1.add(this.txtTest1Marks);
        MarksBox1.add(Box.createHorizontalStrut(5));
        MarksBox1.add(this.lblTest1Percentage);
        MarksBox1.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, MarksBox1, 1, 2, 2, 1, 17);
        final Box MarksBox2 = Box.createHorizontalBox();
        MarksBox2.add(Box.createHorizontalStrut(5));
        MarksBox2.add(this.txtTest2Marks);
        MarksBox2.add(Box.createHorizontalStrut(5));
        MarksBox2.add(this.lblTest2Percentage);
        MarksBox2.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, this.lblExamMarks, 0, 4, 1, 1, 13);
        final Box MarksBox3 = Box.createHorizontalBox();
        MarksBox3.add(Box.createHorizontalStrut(5));
        MarksBox3.add(this.txtExamMarks);
        MarksBox3.add(Box.createHorizontalStrut(5));
        MarksBox3.add(this.lblExamPercentage);
        MarksBox3.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, MarksBox3, 1, 4, 3, 1, 17);
       
        this.addItem(this.panel, paneScrollPane, 0, 11, 4, 4, 10);
       // this.addItem(this.panel, paneScrollPane2, 0, 15, 4, 4, 10);
        
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        //ButtonsBox.add(this.btnPrevious);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        //ButtonsBox.add(this.btnNext);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview2);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview3);     
        ButtonsBox.add(Box.createHorizontalStrut(3));
       // ButtonsBox.add(this.btnDeregister);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 0, 18, 2, 2, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
            	schfeesPaymentReport.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
            	schfeesPaymentReport.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
            	schfeesPaymentReport.this.connectToDB();
            	schfeesPaymentReport.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
            	schfeesPaymentReport.this.connectToDB();
            	schfeesPaymentReport.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
            	schfeesPaymentReport.this.connectToDB();
            	schfeesPaymentReport.this.btnSaveMethod(evt5);
            }
        });
        this.btnDeregister.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                btnDeregisterMethod(evt10);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
            	schfeesPaymentReport.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
            	schfeesPaymentReport.this.btnPreviewMethod(evt7);
            }
        });
        
        this.btnPreview2.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
            	schfeesPaymentReport.this.btnPreview2Method(evt11);
            }
        });
        this.btnPreview3.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
            	schfeesPaymentReport.this.btnPreview3Method(evt11);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
            	schfeesPaymentReport.this.connectToDB();
            	schfeesPaymentReport.this.btnPreviousMethod(evt8);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
            	schfeesPaymentReport.this.connectToDB();
            	schfeesPaymentReport.this.ComboSelecClassMethod(evt9);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 1, 10);
                table.setFont(d);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(30);
                
                return this;
            }
        });
        this.txtExamMarks.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 10) {
                	schfeesPaymentReport.this.btnSave.doClick();
                }
            }
        });
        this.txtExamMarks.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if (e.getKeyCode() == 32) {
                	schfeesPaymentReport.this.btnNext.doClick();
                }
            }
        });
        this.setVisible(false);
        this.setVisible(true);
        this.fillCoboSelectClass();
        this.panel.validate();
        this.panel.revalidate();
        this.panel.repaint();
        this.fillComboSession();
        this.panel.validate();
        this.panel.revalidate();
        this.panel.repaint();
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
        final int clouseButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Windows Close Warning", 0);
        if (clouseButton == 0) {
            this.dispose();
        }
        else {
            this.remove(clouseButton);
        }
    }
    
    public void btnClearMethod(final ActionEvent e2) {
        this.txtRegNum.setText("");
        this.txtName.setText("");
        this.txtClass.setText("");
        this.txtTest1Marks.setText("");
        this.txtTest2Marks.setText("");
        this.txtHomeWork.setText("");
        this.TextArea.setText("");
    }
    
    public void btnSearchMethod(final ActionEvent e3) {
        this.txtName.setText("");
        this.txtRegNum.setText("");
        final String ID = this.txtID.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS") || myClass.equals("SELECT TERM") || myClass.equals("SELECT FORM")) {
            JOptionPane.showMessageDialog(null, "Please, select a class, term or form", "Class Selection Error", 0);
        }
        else if (myClass.equalsIgnoreCase("PRIMARY ONE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary1 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary1 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY TWO")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary2 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary2 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY THREE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary3 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary3 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY FOUR")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary4 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary4 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY FIVE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary5 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary5 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY SIX")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary6 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary6 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY ONE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery1 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery1 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY TWO")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery2 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery2 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY THREE")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery3 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery3 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY FOUR")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery4 WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery4 WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary1_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary1_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary2_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary2_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary3_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary3_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary4_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary4_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY FIVE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary5_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary5_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("PRIMARY SIX-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregprimary6_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregprimary6_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY ONE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery1_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery1_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY TWO-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery2_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery2_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY THREE-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery3_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery3_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        else if (myClass.equalsIgnoreCase("NURSERY FOUR-ISLAMIYYA")) {
            try {
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentregnursery4_islamiyya WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentregnursery4_islamiyya WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String regnum = rs.getObject(1).toString();
                    this.txtRegNum.setText(regnum);
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
    
    public void btnNextMethod(final ActionEvent e4) {
        this.connectToDB();
        this.pulledCLassName_ENG();
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.txtTest1Marks.setText("");
        this.txtTest2Marks.setText("");
        this.txtHomeWork.setText("");
        this.txtExamMarks.setText("");
        this.txtName.setText("");
        this.txtRegNum.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        final String ClassName_Eng = this.pulledClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        //String TheModifiedClassname_Eng = myClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();

        Label_0561: {
            try {
                ID = Integer.parseInt(this.txtID.getText().toString());
                final String R = Integer.toString(++ID);
                this.txtID.setText(R);
                final String IDNumber = this.txtID.getText().toString();
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM " + ClassName_Eng + " WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
                pstatement.setString(1, IDNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                if (!rs.isLast()) {
                    rs.next();
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final String Class = rs.getObject(3).toString();
                    this.txtClass.setText(Class);
                    final String Regnnum = rs.getObject(4).toString();
                    this.txtRegNum.setText(Regnnum);
                    this.panel.repaint();
                }
            }
            catch (SQLException e5) {
                JOptionPane.showMessageDialog(null, "btnNext, Error Occured: \n" + " Student ID does NOT exist!", "Error occured: ", 0);
                try {
                    this.connection.close();
                    this.rs.close();
                    this.pstatement.close();
                }
                catch (SQLException e6) {
                    e6.printStackTrace();
                }
                try {
                    this.connection.close();
                    this.rs.close();
                    this.pstatement.close();
                }
                catch (SQLException e7) {
                    e7.printStackTrace();
                }
                break Label_0561;
            }
            finally {
                try {
                    this.connection.close();
                    this.rs.close();
                    this.pstatement.close();
                }
                catch (SQLException e7) {
                    e7.printStackTrace();
                }
            }
            try {
                this.connection.close();
                this.rs.close();
                this.pstatement.close();
            }
            catch (SQLException e7) {
                e7.printStackTrace();
            }
            try {
                this.connection.close();
                this.rs.close();
                this.pstatement.close();
            }
            catch (SQLException e8) {
                e8.printStackTrace();
            }
        }
        this.txtTest1Marks.requestFocus();
    }
    
    public void btnDeregisterMethod(final ActionEvent evt10) {
   	 
        final int DeleteButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to DELETE?", "Deregistration Confirmation Window", 0);
        if (DeleteButton == 0) {
        	
        	  final String mySession = this.ComboSession.getSelectedItem().toString();
              final String myClassName = this.ComboSelecClass.getSelectedItem().toString();
              final String myRegNum = this.txtRegNum.getText().toString();
               
              String TheModifiedClassname_Eng = myClassName.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
             
            int counterForDeletion = 0;
            
            if (mySession.equals("Select Session")) {
                JOptionPane.showMessageDialog(null, "Please, select Session!", "Error in Student Category", 0);
            }           
            else if (myClassName.equals("SELECT CLASS")) {
                JOptionPane.showMessageDialog(null, "Please, select Class", "Error in Student Category", 0);
            }
            else if (myRegNum.equals("")) {
                JOptionPane.showMessageDialog(null, "Please, supply Student RegNum!", "Error in Student Category", 0);
            }  
           else {
                try {
                    this.connectToDB();
                     final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM StudentCategory WHERE session =? AND class=? AND RegNum=? ");
                     pstatement.setString(1, mySession);
                     pstatement.setString(2, myClassName);
                     pstatement.setString(3, myRegNum );
                    final ResultSet rs = pstatement.executeQuery();
                    if (rs.next()) {
                        ++counterForDeletion;
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
                 
                if (counterForDeletion <= 0) {
                    JOptionPane.showMessageDialog(null, "The selected class/session/RegNum do NOT EXIST inside the Databse!", "Error Occured", 0);
                }
                else {
                    try {
                        this.connectToDB();
                         final PreparedStatement pstatement = this.connection.prepareStatement("DELETE FROM StudentCategory WHERE session =? AND class =?  AND RegNum=?   ");
                         pstatement.setString(1, mySession);
                         pstatement.setString(2, myClassName);
                         pstatement.setString(3, myRegNum );
                        pstatement.executeUpdate();
                        pstatement.close();
                        JOptionPane.showMessageDialog(null, "  The  Student Category for " + myClassName + "\n From: " + myClassName + "Session: "+ mySession + "\n " + " is been DELETED!");
                    }
                    catch (SQLException a) {
                        JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                        a.printStackTrace();
                    }
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                        final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                        final String USERNAME = "root";
                        final String PASSWORD = "ash123";
                        final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
 
                        final PreparedStatement pstatement2 = con.prepareStatement(" SELECT * FROM StudentCategory WHERE Session=? AND Class=? ");
                        pstatement.setString(1, mySession);
                        pstatement.setString(2, myClassName);
                        final ResultSet rs2 = pstatement2.executeQuery();
                        final ResultSetMetaData md = rs2.getMetaData();
                        final int columns = md.getColumnCount();
                        for (int i = 1; i <= columns; ++i) {
                            this.columnNames.addElement(md.getColumnName(i));
                        }
                        while (rs2.next()) {
                            final Vector row = new Vector(columns);
                            for (int j = 1; j <= columns; ++j) {
                                row.addElement(rs2.getObject(j));
                            }
                            this.data.addElement(row);
                        }
                        rs2.close();
                        pstatement2.close();
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                    this.tableModel1.setDataVector(this.data, this.columnNames);
                    this.table = new JTable(this.tableModel1);
                    for (int k = 0; k < this.table.getColumnCount(); ++k) {
                        this.table.getColumnModel().getColumn(k);
                    }
                    this.table.repaint();
                    this.table.revalidate();
                    this.panel.validate();
                    this.panel.repaint();
                }
                
              
            }
            this.txtRegNum.setText("");
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
            
         }
        else {
            this.remove(DeleteButton);
        }
    }
  
    
    public void btnSaveMethod(final ActionEvent evt5) {  
    	 final int SaveButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to EXECUTE PAYMENT?", "PAYMENT Transaction Confirmation Window", 0);
         if (SaveButton == 0) {
        	 
        	 double TotalAmountPaid = 0.0;
             this.TextArea.setText("");
             final String studentCategory = ComboStudentCategory.getSelectedItem().toString();
             final String myclass = this.ComboSelecClass.getSelectedItem().toString();
             final String mySession = this.ComboSession.getSelectedItem().toString();
             final String Name = this.txtName.getText().toString();
             final String RegNum = this.txtRegNum.getText().toString();
             String Term = ComboTerm.getSelectedItem().toString();
             
             int counter_checks_stud_category = 0;
             String The_Retrieved_Student_Category = "";
             
             TotalAmountPaid = Double.parseDouble( txtTotalFeesPaid.getText().toString());
             String PaymentOption = ComboPaymentOption.getSelectedItem().toString();
              
              double Student_School_fees =  0.0;
              double Student_Registration_fees =  0.0;
              double Student_Uniform_fees =  0.0;
              double Student_Utility_fees =  0.0;
              double Student_Examination_fees =  0.0;
              double Student_Books_fees =  0.0;
              double Student_Sportwear_fees =  0.0;
              double sum_of_compulsory_fees = 0.0;
              int payment_counter = 0;
               
             this.data.setSize(0);
             this.columnNames.setSize(0);
             this.tableModel1.setRowCount(0);
             this.tableModel1.fireTableDataChanged();
             this.panel.validate();
             this.panel.repaint();
             this.TextArea.setText("");
             
               
             //Payment Advice Activities 
             //Step-1. Check if student have CATEGORIZED!
             //Step-2. Proceed to payment advice 
             //Step-3. Accept Payment 
             
           //Step-1.
             try {
             	
                 this.connectToDB();//established database connection 
                 
                 final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM StudentCategory WHERE RegNum=? AND Class =? ");
                 pstatement.setString(1, RegNum);
                 pstatement.setString(2, myclass);
                 final ResultSet rs = pstatement.executeQuery();
                 if (rs.next()) {
                     ++ counter_checks_stud_category;
                     The_Retrieved_Student_Category = rs.getString("Category");
                 }
                 rs.close();
                 pstatement.close();
             }
             catch (SQLException a) {
                 JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                 a.printStackTrace();
             }
             
             if (mySession.equals("Select Session")) {
                 JOptionPane.showMessageDialog(null, "Please, select Session!", "Error Occured", 0);
             }
             else if (RegNum.equalsIgnoreCase("")) {
                 JOptionPane.showMessageDialog(null, "Pls, select Reg. number!", "Error Occured", 0);
             }       
             else if (myclass.equalsIgnoreCase("SELECT CLASS")) {
                 JOptionPane.showMessageDialog(null, "Pls, select class!", "Error Occured", 0);
             }else if (Term.equalsIgnoreCase("SELECT TERM")) {
                 JOptionPane.showMessageDialog(null, "Pls, select term!", "Error Occured", 0);
             }else if (TotalAmountPaid <= 0.0 || txtTotalFeesPaid.getText().toString().isBlank() ) {
                 JOptionPane.showMessageDialog(null, "Pls, Total Amount Paid not supplied", "Error Occured", 0);
             }else if (counter_checks_stud_category <= 0 ) {
                 JOptionPane.showMessageDialog(null, "Error, this student has NOT been categorized! \n Pls, do so to continue!", "Error Occured", 0);
             } 
             else {
             	////Step-2 - Now proceed to PAYMENT ADVICE
             	//sub-step-i-  sum up the compulsory fees for New students (with the exception of "SCHOOL FEES") ; which are;
             					//a. REGISTRATION FEES b. UNIFORM FESS c. UTILITY FEES d.  EXAMINATION FEES
             	//sub-step-ii- check the STUDENT CATEGORY, and then do the following 
             					//a. If the student is a PAID CATEGORY, then add the complete "SCHOOL FEES"
             					//b. if the student is a FULL SCHOLARSHIP, THEN DO NOT ADD  "SCHOOL FEES"
             					//c. if the student is partial scholarship, then ADD only 50% of "SCHOOL FEES"
                 
             	try {//sub-step-i-  sum up the compulsory fees for New students (with the exception of "SCHOOL FEES") ; which are;
                 	
                     this.connectToDB();//established database connection 
                     
                     final PreparedStatement pstatement = connection.prepareStatement("SELECT sum(fees_amount) FROM feesspecification WHERE  fees_type='REGISTRATION FEES'  OR fees_type='UNIFORM FESS' OR fees_type='UTILITY FEES' OR fees_type='EXAMINATION FEES' AND class=? GROUP BY Class");               
                     pstatement.setString(1, myclass);
                     final ResultSet rs = pstatement.executeQuery();
                     while (rs.next()) {
                                              
                     	sum_of_compulsory_fees = rs.getDouble(1);
                         System.out.println("sum of the comsulsory fees: "+ sum_of_compulsory_fees);
                     }
                     rs.close();
                     pstatement.close();
                 }
                 catch (SQLException a) {
                     JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                     a.printStackTrace();
                 }
             	
             	
             	//sub-step-ii- check the STUDENT CATEGORY, and then do the following 
     			//a. If the student is a PAID CATEGORY, then add the complete "SCHOOL FEES"
     			//b. if the student is a FULL SCHOLARSHIP, THEN DO NOT ADD  "SCHOOL FEES"
     			//c. if the student is partial scholarship, then ADD only 50% of "SCHOOL FEES"
             	
             	
             	
             	try { //checking for the 'FEES SPECIFICATION' based on the student category
                 	
                     this.connectToDB();//established database connection 
                    
                     final PreparedStatement pstatement = connection.prepareStatement(" SELECT fees_amount FROM feesspecification WHERE Class =? AND fees_type='SCHOOL FEES' " );               
                     pstatement.setString(1, myclass);
                     final ResultSet rs = pstatement.executeQuery();
                     while (rs.next()) {
                     	Student_School_fees = rs.getDouble(1);            
                     	System.out.println("Student School fees: "+ Student_School_fees);
                     	if(The_Retrieved_Student_Category.equalsIgnoreCase("PAID STUDENT")) {
                     		Student_School_fees = Student_School_fees;
                     	}else if(The_Retrieved_Student_Category.equalsIgnoreCase("FULL SCHOLARSHIPS")) {
                     		Student_School_fees = 0;//means on full-scholarship
                     	}else if(The_Retrieved_Student_Category.equalsIgnoreCase("PARTIAL SCHOLARSHIPS")) {
                     		Student_School_fees =  Student_School_fees * 0.5;
                     	}
                     }
                     //rs.close();
                     //pstatement.close();
                     
                     ///REETRIVING THE OTHER FEES (books, utilities, exam, etc)
                     
                     //REETRIVING Student_Registration_fees
                     final PreparedStatement pstatement2 = connection.prepareStatement(" SELECT fees_amount FROM feesspecification WHERE Class =? AND fees_type='REGISTRATION FEES' " );               
                     pstatement2.setString(1, myclass);
                     final ResultSet rs2 = pstatement2.executeQuery();
                     while (rs2.next()) {
                     	Student_Registration_fees = rs2.getDouble(1);            
                     	System.out.println("Student Registration Fees:"+ Student_Registration_fees); 
                     }
                     
                     //REETRIVING Student_Uniform_fees
                     final PreparedStatement pstatement3 = connection.prepareStatement(" SELECT fees_amount FROM feesspecification WHERE Class =? AND fees_type='UNIFORM FEES' " );               
                     pstatement3.setString(1, myclass);
                     final ResultSet rs3 = pstatement3.executeQuery();
                     while (rs3.next()) {
                     	Student_Uniform_fees = rs3.getDouble(1);            
                     	System.out.println("Student Uniform Fees:"+ Student_Uniform_fees); 
                     }
                     
                     //REETRIVING Student_Books_fees
                     final PreparedStatement pstatement4 = connection.prepareStatement(" SELECT fees_amount FROM feesspecification WHERE Class =? AND fees_type='BOOKS FEES' " );               
                     pstatement4.setString(1, myclass);
                     final ResultSet rs4 = pstatement4.executeQuery();
                     while (rs4.next()) {
                     	Student_Books_fees = rs4.getDouble(1);            
                     	System.out.println("Student Books Fees:"+ Student_Books_fees); 
                     }
                     
                   //REETRIVING Student_Utility_fees
                     final PreparedStatement pstatement5 = connection.prepareStatement(" SELECT fees_amount FROM feesspecification WHERE Class =? AND fees_type='UTILITY FEES' " );               
                     pstatement5.setString(1, myclass);
                     final ResultSet rs5 = pstatement5.executeQuery();
                     while (rs5.next()) {
                     	Student_Utility_fees = rs5.getDouble(1);            
                     	System.out.println("Student Utility Fees:"+ Student_Utility_fees); 
                     }
                     
                   //REETRIVING Student_Examination_fees
                     final PreparedStatement pstatement6 = connection.prepareStatement(" SELECT fees_amount FROM feesspecification WHERE Class =? AND fees_type='EXAMINATION FEES' " );               
                     pstatement6.setString(1, myclass);
                     final ResultSet rs6 = pstatement6.executeQuery();
                     while (rs6.next()) {
                     	Student_Examination_fees = rs6.getDouble(1);            
                     	System.out.println("Student Exam Fees:"+ Student_Examination_fees); 
                     }
                     
                     //REETRIVING Student_Sportwear_fees
                     final PreparedStatement pstatement7 = connection.prepareStatement(" SELECT fees_amount FROM feesspecification WHERE Class =? AND fees_type='SPORTWEAR FEES' " );               
                     pstatement7.setString(1, myclass);
                     final ResultSet rs7 = pstatement7.executeQuery();
                     while (rs7.next()) {
                     	Student_Sportwear_fees = rs7.getDouble(1);            
                     	System.out.println("Student Sport Wear Fees:"+ Student_Sportwear_fees); 
                     }
                   //  rs.close();
                    // pstatement.close();
                     
                 }
                 catch (SQLException a) {
                     JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                     a.printStackTrace();
                 }
             	
             	
             	///populating the 'student_payment_advice' table
             	
             	  double my_sum_of_compulsory_fees = Student_School_fees + Student_Registration_fees + 
       	                Student_Uniform_fees + Student_Utility_fees 
       	                + Student_Examination_fees;
                
                double my_sum_of_non_compulsory_fees = Student_Books_fees + Student_Sportwear_fees;
                double balance = 0.0;
                
                //CALCULATING BALANCE, IF PAYMENT OPTION IS COMPULSORY ONLY  OR PAYMENT OPTION IS COMPULSORY+BOOK+SPOTWEAR
                if(ComboPaymentOption.getSelectedItem().toString().equalsIgnoreCase("COMPULSORY FEES ONLY")) {
             	   balance = my_sum_of_compulsory_fees - TotalAmountPaid;
                }else if(ComboPaymentOption.getSelectedItem().toString().equalsIgnoreCase("COMPULSORY FEES + BOOKS AND SPORTWEAR")) {
             	   balance = (my_sum_of_compulsory_fees + my_sum_of_non_compulsory_fees)- TotalAmountPaid;
                }
                  
                //CHECKING THE DUPLICATE INSERTION INTO THE 'student_payment_advice'
                //REETRIVING Student_Sportwear_fees
                 
     	        try {
     	        	 final PreparedStatement pstatement_checks  = connection.prepareStatement(" SELECT * FROM student_payment_advice WHERE Class =? AND Session=? AND RegNum=?" );               
     	             pstatement_checks.setString(1, myclass);
     	             pstatement_checks.setString(2, mySession);
     	             pstatement_checks.setString(3, RegNum);
     	             final ResultSet rs_checks = pstatement_checks.executeQuery();
     	             while (rs_checks.next()) {
     	             	payment_counter ++;      
      	             }	             		
     			} catch (SQLException a) {
     	            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
     	            a.printStackTrace();
     	        }
           
                
                if(payment_counter > 0 ) { //check if row exist
     	            JOptionPane.showMessageDialog(null, "Duplicate Entry! \nPayment for this student has been recieved already. But you can clear his balace (if any) in the balance clearance tab. ", "Error occured", 0);
                }else if (ComboPaymentOption.getSelectedItem().toString().equalsIgnoreCase("COMPULSORY FEES ONLY") && TotalAmountPaid > my_sum_of_compulsory_fees || ComboPaymentOption.getSelectedItem().toString().equalsIgnoreCase("COMPULSORY FEES + BOOKS AND SPORTWEAR") && TotalAmountPaid > (my_sum_of_compulsory_fees + my_sum_of_non_compulsory_fees) ) {
                    JOptionPane.showMessageDialog(null, "Error, You cannot pay morethan the EXPECTED AMOUNT! \n Pls, check your entries.", "Error Occured", 0);
                }          
                else {
             	   
             	  	try { ///populating the 'student_payment_advice' table
     	            	
                         this.connectToDB();//established database connection 
                        
                         final PreparedStatement pstatement = connection.prepareStatement(" INSERT INTO student_payment_advice VALUES(null, ?,?,?,?,?,?,?,?,?, ?, ?,?, ?, ?, ?, ?,?, now()) " );               
                         pstatement.setString(1, mySession);
                         pstatement.setString(2, myclass);
                         pstatement.setString(3, RegNum);
                         pstatement.setString(4, Term); 
                         pstatement.setDouble(5, Student_School_fees);
                         pstatement.setDouble(6, Student_Registration_fees);
                         pstatement.setDouble(7, Student_Uniform_fees);
                         pstatement.setDouble(8, Student_Utility_fees);
                         pstatement.setDouble(9, Student_Examination_fees);
                         
                         pstatement.setDouble(10, my_sum_of_compulsory_fees);
                          
                         pstatement.setDouble(11, Student_Books_fees);
                         pstatement.setDouble(12, Student_Sportwear_fees);
                         
                         pstatement.setDouble(13, my_sum_of_non_compulsory_fees);
                         
                         pstatement.setDouble(14, my_sum_of_compulsory_fees + my_sum_of_non_compulsory_fees);
                         
                         pstatement.setDouble(15, TotalAmountPaid);
                         pstatement.setString(16, PaymentOption);
                          
                         pstatement.setDouble(17, balance);
                         
                         int rowCount = pstatement.executeUpdate();
                         
                         if(rowCount >0 ) {
                             JOptionPane.showMessageDialog(null, "Payment successfully received. \n Thank you.", "Payment Information", JOptionPane.INFORMATION_MESSAGE);
                         }
                        
                          
                     }
                     catch (SQLException a) {
                         JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                         a.printStackTrace();
                     }
                 	 
                }
                
           
             	
             	
             	//Displaying the Payment Result
             	try { 
                 	 connectToDB();  
                 	
                      final PreparedStatement pstatement = connection.prepareStatement("SELECT * FROM student_payment_advice where Session=? AND Class=? ");
                     pstatement.setString(1, mySession);
                     pstatement.setString(2, myclass);
                     
                     final ResultSet rs = pstatement.executeQuery();
                     final ResultSetMetaData md = rs.getMetaData();
                     final int columns = md.getColumnCount();
                     for (int i = 1; i <= columns; ++i) {
                         this.columnNames.addElement(md.getColumnName(i));
                     }
                     while (rs.next()) {
                         final Vector row = new Vector(columns);
                         for (int j = 1; j <= columns; ++j) {
                             row.addElement(rs.getObject(j));
                         }
                         this.data.addElement(row);
                     }
                 }
                 catch (Exception e) {
                     System.out.println(e);
                 }
                 this.tableModel1.setDataVector(this.data, this.columnNames);
                 this.table = new JTable(this.tableModel1);
                 for (int k = 0; k < this.table.getColumnCount(); ++k) {
                     this.table.getColumnModel().getColumn(k);
                 }
                 this.table.repaint();
                 this.table.revalidate();
                 this.panel.validate();
                 this.panel.repaint();
                 
                 //clear some variable
                 txtTotalFeesPaid.setText("");
             }
        	 
        	 
         }else {
        	 this.remove(SaveButton);
         }

    	
    	
    }//end of the btnSaveMethod
    
    public void btnPrintMethod(final ActionEvent evt6) {
      
    	final J2Printer printer = new J2Printer();
       printer.setSeparatePrintThread(false);
       final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.textPane);
       printer.addPageable((Pageable)componentPrinter);
      // printer.showPrintPreviewDialog((Component)this.textPane);
       printer.print(); 
      
       
       
//    	final PrinterJob pj = PrinterJob.getPrinterJob();
//        pj.setJobName("Daily Payment Report By Session, Class and Date");
//        pj.setPrintable(new Printable() {
//            @Override
//            public int print(final Graphics pg, final PageFormat pf, final int pageNum) {
//                if (pageNum > 0) {
//                    return 1;
//                }
//                final Graphics2D heder = (Graphics2D)pg.create();
//                heder.translate(30, 20);
//                final Graphics2D heder2 = (Graphics2D)pg.create();
//                heder2.translate(30, 29);
//                final float x = 2.0f;
//                final float y = 3.0f;
//                final Graphics2D g2 = (Graphics2D)pg.create();
//                g2.translate(10, 35);
//                schfeesPaymentReport.this.textPane.paint(g2);  
//                return 0;
//            }
//        });
//        if (pj.printDialog()) {
//            try {
//                pj.print();
//            }
//            catch (PrinterException ex) {
//                System.out.println("Printing error" + ex.getMessage());
//            }
//        }
    
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
    	 
        this.TextArea.setText("");
        final String studentCategory = ComboStudentCategory.getSelectedItem().toString();
        final String myclass = this.ComboSelecClass.getSelectedItem().toString();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final String Name = this.txtName.getText().toString();
        final String RegNum = this.txtRegNum.getText().toString();
        String Term = ComboTerm.getSelectedItem().toString();
        
        int counter_checks_stud_category = 0;
        String The_Retrieved_Student_Category = "";
         
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
          
        if (mySession.equals("Select Session")) {
            JOptionPane.showMessageDialog(null, "Please, select Session!", "Error Occured", 0);
        }
              
        else if (myclass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Pls, class not selected", "Error Occured", 0);
        }
        
//        else if (Term.equalsIgnoreCase("SELECT TERM")) {
//            JOptionPane.showMessageDialog(null, "Pls, term not selected", "Error Occured", 0);
//        } 
        else {
          	
        	//Displaying the Payment Result
        	try { 
            	 connectToDB();  
            	
                 final PreparedStatement pstatement = connection.prepareStatement("SELECT Id,Session,Class,RegNum,Name,Term,SUM_COMPULSORY_FEES,SUM_NON_COMPULSORY_FEES,SUM_TOTAL,TOTAL_AMOUNT_PAID,PAYMENT_OPTION,BALANCE,dateCaptured FROM student_payment_advice where Session=? AND Class=? ");
                pstatement.setString(1, mySession);
                pstatement.setString(2, myclass);
                
                final ResultSet rs = pstatement.executeQuery();
                final ResultSetMetaData md = rs.getMetaData();
                final int columns = md.getColumnCount();
                for (int i = 1; i <= columns; ++i) {
                    this.columnNames.addElement(md.getColumnName(i));
                }
                while (rs.next()) {
                    final Vector row = new Vector(columns);
                    for (int j = 1; j <= columns; ++j) {
                        row.addElement(rs.getObject(j));
                    }
                    this.data.addElement(row);
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
            this.tableModel1.setDataVector(this.data, this.columnNames);
            this.table = new JTable(this.tableModel1);
            for (int k = 0; k < this.table.getColumnCount(); ++k) {
                this.table.getColumnModel().getColumn(k);
            }
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
        }
    }
    
    public void btnPreview2Method(final ActionEvent evt11) {
    	 this.data.setSize(0);
         this.columnNames.setSize(0);
         this.tableModel1.setRowCount(0);
         this.tableModel1.fireTableDataChanged();
         this.panel.validate();
         this.panel.repaint();
         this.TextArea.setText("");
         
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");// formating the date 
		String FDate = sdf.format(picker.getDate()).toString(); //using the formated date string 
		
		 java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat("yyyy-MM-dd");// formating the date 
		 String FDate2 = sdf2.format(picker2.getDate()).toString(); //using the formated date string 
			
        this.TextArea.setText("");
        final String studentCategory = ComboStudentCategory.getSelectedItem().toString();
        final String myclass = this.ComboSelecClass.getSelectedItem().toString();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final String Name = this.txtName.getText().toString();
        final String RegNum = this.txtRegNum.getText().toString();
        String Term = ComboTerm.getSelectedItem().toString();
        
        int counter_checks_stud_category = 0;
        String The_Retrieved_Student_Category = "";
          
        if (mySession.equals("Select Session")) {
            JOptionPane.showMessageDialog(null, "Please, select Session!", "Error Occured", 0);
        }
              
        else if (myclass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Pls, select class", "Error Occured", 0);
        }else if (FDate.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, select DATE1", "Error Occured", 0);
        }else if (FDate2.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, select DATE2", "Error Occured", 0);
        }
        
//        else if (Term.equalsIgnoreCase("SELECT TERM")) {
//            JOptionPane.showMessageDialog(null, "Pls, term not selected", "Error Occured", 0);
//        } 
        else {
          	
        	//Displaying the Payment Result
        	try { 
            	 connectToDB();  
            	 
                final PreparedStatement pstatement = connection.prepareStatement("SELECT * FROM student_payment_advice where Session=? AND Class=? AND ( DATE(dateCaptured) BETWEEN ? AND ? ) ");//AND DATE(dateCaptured)= ?
                pstatement.setString(1, mySession);
                pstatement.setString(2, myclass); //picker
                pstatement.setString(3, FDate);
                pstatement.setString(4, FDate2);
                
                final ResultSet rs = pstatement.executeQuery();
//                while(rs.next()) {
//                	String sumTotalAmountPaid = rs.getString(1);
//                	lblSumTotalAmountPaid.setText(sumTotalAmountPaid);
//                }
                
                final ResultSetMetaData md = rs.getMetaData();
                final int columns = md.getColumnCount();
                for (int i = 1; i <= columns; ++i) {
                    this.columnNames.addElement(md.getColumnName(i));
                }
                while (rs.next()) {
                    final Vector row = new Vector(columns);
                    for (int j = 1; j <= columns; ++j) {
                        row.addElement(rs.getObject(j));
                    }
                    this.data.addElement(row);
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
            this.tableModel1.setDataVector(this.data, this.columnNames);
            this.table = new JTable(this.tableModel1);
            for (int k = 0; k < this.table.getColumnCount(); ++k) {
                this.table.getColumnModel().getColumn(k);
            }
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
        }
    }
    public void btnPreview3Method(final ActionEvent evt11) {
   	 this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        
       java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");// formating the date 
		String FDate = sdf.format(picker.getDate()).toString(); //using the formated date string 
		
		 java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat("yyyy-MM-dd");// formating the date 
		 String FDate2 = sdf2.format(picker2.getDate()).toString(); //using the formated date string 
			
       this.TextArea.setText("");
       final String studentCategory = ComboStudentCategory.getSelectedItem().toString();
       final String myclass = this.ComboSelecClass.getSelectedItem().toString();
       final String mySession = this.ComboSession.getSelectedItem().toString();
       final String Name = this.txtName.getText().toString();
       final String RegNum = this.txtRegNum.getText().toString();
       String Term = ComboTerm.getSelectedItem().toString();
       
       int counter_checks_stud_category = 0;
       String The_Retrieved_Student_Category = "";
         
       if (mySession.equals("Select Session")) {
           JOptionPane.showMessageDialog(null, "Please, select Session!", "Error Occured", 0);
       }
             
       else if (myclass.equalsIgnoreCase("SELECT CLASS")) {
           JOptionPane.showMessageDialog(null, "Pls, select class", "Error Occured", 0);
       }else if (FDate.equalsIgnoreCase("")) {
           JOptionPane.showMessageDialog(null, "Pls, select DATE1", "Error Occured", 0);
       }else if (FDate2.equalsIgnoreCase("")) {
           JOptionPane.showMessageDialog(null, "Pls, select DATE2", "Error Occured", 0);
       }
       
//       else if (Term.equalsIgnoreCase("SELECT TERM")) {
//           JOptionPane.showMessageDialog(null, "Pls, term not selected", "Error Occured", 0);
//       } 
       else {
         	
       	//Displaying the Payment Result
       	try { 
           	 connectToDB();  
           	 
               final PreparedStatement pstatement = connection.prepareStatement("SELECT sum(TOTAL_AMOUNT_PAID) FROM student_payment_advice where Session=? AND Class=? AND ( DATE(dateCaptured) BETWEEN ? AND ? ) ");//AND DATE(dateCaptured)= ?
               pstatement.setString(1, mySession);
               pstatement.setString(2, myclass); //picker
               pstatement.setString(3, FDate);
               pstatement.setString(4, FDate2);
               
               final ResultSet rs = pstatement.executeQuery();
//               while(rs.next()) {
//               	String sumTotalAmountPaid = rs.getString(1);
//               	lblSumTotalAmountPaid.setText(sumTotalAmountPaid);
//               }
               
               final ResultSetMetaData md = rs.getMetaData();
               final int columns = md.getColumnCount();
               for (int i = 1; i <= columns; ++i) {
                   this.columnNames.addElement(md.getColumnName(i));
               }
               while (rs.next()) {
                   final Vector row = new Vector(columns);
                   for (int j = 1; j <= columns; ++j) {
                       row.addElement(rs.getObject(j));
                   }
                   this.data.addElement(row);
               }
           }
           catch (Exception e) {
               System.out.println(e);
           }
           this.tableModel1.setDataVector(this.data, this.columnNames);
           this.table = new JTable(this.tableModel1);
           for (int k = 0; k < this.table.getColumnCount(); ++k) {
               this.table.getColumnModel().getColumn(k);
           }
           this.table.repaint();
           this.table.revalidate();
           this.panel.validate();
           this.panel.repaint();
       }
   }
  
    public void btnPreviousMethod(final ActionEvent e8) {
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.TextArea.setText("");
        
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        this.ComboSelecClass.setFont(this.f);
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        ID = Integer.parseInt(this.txtID.getText().toString());
        final String R = Integer.toString(--ID);
        this.txtID.setText(R);
        final String IDNumber = this.txtID.getText().toString();
        this.txtHomeWork.requestFocus();
        this.txtRegNum.setText("");
    }
    
    public void ComboSelecClassMethod(final ActionEvent evt9) {
        if (evt9.getSource() == this.ComboSelecClass) {
            //this.ComboSelectSubj.removeAllItems();
          //  this.fillComboSelectSubj();
            this.panel.validate();
            this.panel.revalidate();
            this.panel.repaint();
            this.panel.repaint();
            this.panel.revalidate();
        }
        else {
            this.ComboSelectSubj.setSelectedItem("SELECT SUBJECT");
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
    
    private JTextPane createTextPane() {
        final String[] initString = { " " };
        final String[] initStyles = { "regular", "italic", "bold", "small", "large", "regular", "button", "regular", "icon", "regular" };
        final JTextPane textPane = new JTextPane();
        final StyledDocument doc = textPane.getStyledDocument();
        this.addStylesToDocument(doc);
        try {
            for (int i = 0; i < initString.length; ++i) {
                doc.insertString(doc.getLength(), initString[i], doc.getStyle(initStyles[i]));
            }
        }
        catch (BadLocationException ble) {
            System.err.println("Couldn't insert initial text into text pane.");
        }
        return textPane;
    }
    
    protected void addStylesToDocument(final StyledDocument doc) {
        final Style def = StyleContext.getDefaultStyleContext().getStyle("default");
        final Style regular = doc.addStyle("Tahoma", def);
        StyleConstants.setFontFamily(def, "SansSerif");
        Style s = doc.addStyle("italic", regular);
        StyleConstants.setItalic(s, true);
        s = doc.addStyle("bold", regular);
        StyleConstants.setBold(s, true);
        s = doc.addStyle("small", regular);
        StyleConstants.setFontSize(s, 20);
        s = doc.addStyle("large", regular);
        StyleConstants.setFontSize(s, 20);
        StyleConstants.setFontSize(regular, 20);
        s = doc.addStyle("icon", regular);
        StyleConstants.setAlignment(s, 1);
    }
    
    public void fillCoboSelectClass() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0293: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Ara FROM class_regsitration ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM class_regsitration ");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String ComboClassName = rs.getString(1);
                    this.ComboSelecClass.addItem(ComboClassName);
                    this.ComboSelecClass.revalidate();
                    this.ComboSelecClass.repaint();
                    this.panel.revalidate();
                    this.panel.repaint();
                }
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0293;
            }
            finally {
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
    
    public void fillComboSelectSubj() {
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString();
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        this.ComboSelectSubj.addItem("SELECT SUBJECT");
        Label_0314: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Subject_Ara FROM assign_subject WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Subject_Ara FROM assign_subject WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Combosuject_Ara = rs.getString(1);
                    this.ComboSelectSubj.addItem(Combosuject_Ara);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0314;
            }
            finally {
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
    
    public void pulledCLassName_ENG() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString();
        Label_0242: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.pulledClassName_Eng = rs.getString(1).replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
                   // String TheModifiedClassname_Eng = myClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
                    System.out.println("pulled Class: " + this.pulledClassName_Eng);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0242;
            }
            finally {
                try {
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
    
    public void accessControlMethod() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        this.myUsername_From_Authentication_Class = AuthenticationWindow.txtUserName.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem().toString().replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        //String TheModifiedClassname_Eng = myClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
        if (this.myUsername_From_Authentication_Class.equalsIgnoreCase("saif")) {
            ++this.accControlCounter;
        }
        else {
            try {
                this.connectToDB();
                pstatement = this.connection.prepareStatement("SELECT userName FROM accssControl WHERE class=? AND userName=?");
                pstatement.setString(1, myClass);
                pstatement.setString(2, this.myUsername_From_Authentication_Class);
                rs = pstatement.executeQuery();
                if (rs.next()) {
                    ++this.accControlCounter;
                    final String TheSQLretrievedUserNameForAccessControl = rs.getString("userName");
                    System.out.println(" Testing vrariable:  " + this.myUsername_From_Authentication_Class);
                }
                else {
                    this.accControlCounter = 0;
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                return;
            }
            finally {
                try {
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
    }
    
    public void fillComboSession() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0281: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT distinct Session FROM terminformation order by Session Asc";
                pstatement = this.connection.prepareStatement("SELECT distinct Session FROM terminformation order by Session Asc");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Combosuject_Ara = rs.getString("Session");
                    this.ComboSession.addItem(Combosuject_Ara);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "Please, check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
                break Label_0281;
            }
            finally {
                try {
                    this.connection.close();
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
            try {
                this.connection.close();
                rs.close();
                pstatement.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        this.panel.repaint();
        this.panel.revalidate();
    }
}
