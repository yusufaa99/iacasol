import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.sql.ResultSetMetaData;
import java.awt.print.Pageable;
import com.wildcrest.j2printerworks.J2ComponentPrinter;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Color;
import javax.swing.table.TableModel;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.print.PrinterJob;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.JLabel;
import com.wildcrest.j2printerworks.J2Printer;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class studregQueryAdmin extends JFrame
{
    String pulledClassName_Eng;
    String StudClassRegTableName;
    String TemporaryTableName;
    static J2Printer printer;
    public static boolean onScreen;
    static JFrame frame;
    static JLabel status;
    Vector columnNames;
    Vector data;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
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
    private JLabel lblTest;
    private JLabel lblHomeWork;
    private JLabel lblOverallTotal;
    private JLabel lblCHTotal;
    private JLabel lblAverage;
    private JLabel lblNoInClass;
    private JLabel lblSubjectTotal;
    private JLabel lblRemark;
    private JLabel lblOutput;
    private JTextField txtRegNum;
    private JTextField txtName;
    private JTextField txtClass;
    private JTextField txtCHTotal;
    private JTextField txtOverallTotal;
    private JTextField txtAverage;
    private JTextField txtNoInClass;
    private JTextField txtSubjectTotal;
    private JTextField txtSubjectGrading;
    private JTextField txtRemark;
    private JLabel lblSubjectGrading;
    private JComboBox ComboTerm;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JButton btnRearrangeClass;
    private JButton btnPreview;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnPrint;
    private JButton btnGetAverage;
    private JButton btnGetNoInClass;
    private JButton btnSubjectTotal;
    private JButton btnOverallTotal;
    private JButton btnCOmputeCHTotal;
    private JButton btnGenerateClassTermAnd;
    private JButton btnSubjectGrading;
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
    private JButton OverallTotal;
    private JTextField txtoverallTotal;
    private JLabel lbloverallTotal;
    double Hwork;
    double Cwork;
    double CworkRowCount;
    double HworkRowCount;
    double FirstTestCount;
    double SecondTestCount;
    double ThirdTestCount;
    double ExamScoreGlobalVar;
    private JLabel lblmyClass;
    private JLabel lblmyterm;
    private JLabel lblmydate;
    private JLabel lblmyNoinClass;
    private JTextField txtmyClass;
    private JTextField txtmyterm;
    private JTextField txtmydate;
    private JTextField txtmyNoinClass;
    private JLabel lblmyCA;
    private JLabel lblmyExamMarks;
    private JLabel lblmyTotal;
    private JLabel lblmyGrade;
    private JLabel lblmySubjPosition;
    private JLabel lblmyRemarks;
    private JTextField txtmyCA;
    private JTextField txtmyExamMarks;
    private JTextField txtmyTotal;
    private JTextField txtmyGrade;
    private JTextField txtmySubjPosition;
    private JTextField txtmyRemarks;
    private JLabel lblmyOverallTotal;
    private JLabel lblmyAverage;
    private JLabel lblmyActualPosition;
    private JTextField txtmyOverallTotal;
    private JTextField txtmyAverage;
    private JTextField txtmyActualPosition;
    private JButton btnGenerateCAandExamsandTotal;
    private JButton btnGenerateGradePositionAndRemarks;
    private JButton btnGenerateTatalAverageAndActualPosition;
    private JTable table;
    private JScrollPane myreportJSP;
    private JTextPane myreportJTP;
    private StyleContext Styledcontext;
    private DefaultStyledDocument defaultstyleddocument;
    private JScrollPane Scroll;
    private JTextArea queryArea;
    private DefaultTableModel tableModel1;
    private JLabel lblReportName;
    private JLabel lblReportClass;
    private JLabel lblReportTerm;
    private JLabel lblReportYear;
    private JLabel lblReportNoInClass;
    private JLabel lblReportRegNum;
    private JLabel lblReportTatal;
    private JLabel lblReportAverage;
    private JLabel lblReportClassPosition;
    private JLabel lblReportHouseMasterReport;
    private JLabel lblReportHouseMasterSignature;
    private JLabel lblReportHouseMasterSignatureIcon;
    private JLabel lblReportFormMasterReport;
    private JLabel lblReportFormMasterSignature;
    private JLabel lblReportFormMasterSignatureIcon;
    private JLabel lblReportPrincipalReport;
    private JLabel lblReportPrincipalSignature;
    private JLabel lblReportPrincipalSignatureIcon;
    private JLabel lblReportProprietorReport;
    private JLabel lblReportProprietorSignature;
    private JLabel lblReportProprietorSignatureIcon;
    private JTextField txtReportName;
    private JTextField txtReportClass;
    private JTextField txtReportTerm;
    private JTextField txtReportYear;
    private JTextField txtReportNoInClass;
    private JTextField txtReportTatal;
    private JTextField txtReportAverage;
    private JTextField txtReportClassPosition;
    private JTextField txtReportRegNum;
    private JTextField txtReportHouseMasterReport;
    private JLabel lblReportHouseMasterSignature1;
    private JLabel lblReportHouseMasterSignatureIcon1;
    private JTextField txtReportFormMasterReport;
    private JLabel lblReportFormMasterSignature2;
    private JLabel lblReportFormMasterSignatureIcon2;
    private JTextField txtReportPrincipalReport;
    private JLabel lblReportPrincipalSignature3;
    private JLabel lblReportPrincipalSignatureIcon3;
    private JTextField txtReportProprietorReport;
    private JLabel lblReportProprietorSignature4;
    private JLabel lblReportProprietorSignatureIcon4;
    private JTextField txtReportFORM;
    private JLabel lblReportForm;
    private JTextField txtblankSpace;
    private JTextField txtblankSpace1;
    private JTextField txtblankSpace2;
    private JTextField txtblankSpace3;
    private JTextField txtblankSpace4;
    private JTextField txtblankSpace5;
    private JTextPane textPane;
    private JScrollPane paneScrollPane;
    private PrinterJob job;
    
    static {
        studregQueryAdmin.printer = new J2Printer("");
    }
    
    public studregQueryAdmin() {
        this.pulledClassName_Eng = "";
        this.StudClassRegTableName = "";
        this.TemporaryTableName = "";
        this.columnNames = new Vector();
        this.data = new Vector();
        this.Hwork = 0.0;
        this.Cwork = 0.0;
        this.CworkRowCount = 0.0;
        this.HworkRowCount = 0.0;
        this.FirstTestCount = 0.0;
        this.SecondTestCount = 0.0;
        this.ThirdTestCount = 0.0;
        this.ExamScoreGlobalVar = 0.0;
    }
    
    public static void setOnScreen(final boolean val) {
        studregQueryAdmin.onScreen = val;
    }
    
    public void studregQueryAdmin() {
        final Font f2 = new Font(null, 1, 20);
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        final Font f3 = new Font(null, 1, 14);
        final Font f4 = new Font("Arial Unicode MS", 1, 18);
        this.lblRegNum = new JLabel("REG. NO:");
        this.lblName = new JLabel("NAME:");
        (this.lblClass = new JLabel("CLASS:")).setFont(f2);
        this.lblTerm = new JLabel("TERM:");
        this.lblForm = new JLabel("FORM:");
        this.lblSubject = new JLabel("SUBJECT:");
        this.lbldate = new JLabel("DATE:");
        this.lblDay = new JLabel("DAY:");
        this.lblMonth = new JLabel("MONTH");
        this.lblYear = new JLabel("YEAR:");
        this.lblTest = new JLabel("TEST:");
        this.lblHomeWork = new JLabel("HOMEWORK:");
        this.lblOverallTotal = new JLabel("OVERALL TOTAL:");
        this.lblCHTotal = new JLabel("(Cwork&Hwork TOTAL):");
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        this.lblAverage = new JLabel("AVERAGE:");
        this.lblNoInClass = new JLabel("NO. IN CLASS:");
        this.lblSubjectTotal = new JLabel("TOTAL(100%):");
        this.lblSubjectGrading = new JLabel("SUBJECT GRADE:");
        this.txtRegNum = new JTextField(7);
        this.txtName = new JTextField(35);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtCHTotal = new JTextField(5);
        this.txtOverallTotal = new JTextField(5);
        this.txtAverage = new JTextField(5);
        this.txtNoInClass = new JTextField(5);
        this.txtSubjectTotal = new JTextField(5);
        this.txtSubjectGrading = new JTextField(5);
        this.txtRemark = new JTextField(7);
        this.OverallTotal = new JButton("OverallTotal");
        this.txtoverallTotal = new JTextField(5);
        this.lbloverallTotal = new JLabel("OverallTotal");
        this.lblRemark = new JLabel("REMARK:");
        (this.ComboSelecClass = new JComboBox()).setFont(f2);
        this.ComboSelecClass.addItem("SELECT CLASS");
        this.ComboSelecClass.setEditable(false);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        this.ComboSelecClass.setEditable(false);
        this.ComboSelecClass.setFont(f4);
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
        (this.ComboSelectSubj = new JComboBox()).setFont(f2);
        this.ComboSelectSubj.addItem("SELECT SUBJECT");
        this.ComboSelectSubj.addItem("Quran");
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
        this.ComboSelectSubj.addItem("History");
        this.ComboSelectSubj.addItem("Islamic Religion Knowledge");
        this.ComboSelectSubj.addItem("Literature in English");
        this.ComboSelectSubj.addItem("Mathematics");
        this.ComboSelectSubj.addItem("Physics");
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
        this.btnRearrangeClass = new JButton("Rearrange");
        this.btnSave = new JButton("Save");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.btnGetAverage = new JButton("Compute Average");
        this.btnGetNoInClass = new JButton("Get No. InClass");
        this.btnSubjectTotal = new JButton("Compute 100% Total");
        this.btnOverallTotal = new JButton("Compute Overall Total");
        this.btnCOmputeCHTotal = new JButton("GetCwrk&Hwrkotal");
        this.btnSubjectGrading = new JButton("Compute Grade&Remarks");
        this.lblQuerySection = new JLabel("QUERY/SEARCH SECTION");
        this.lblSearchingARecord = new JLabel("Searching For A Record:");
        this.lblEnterRegNum = new JLabel("REG. NO:");
        this.lblQuerySelectSubj = new JLabel("SUBJECT:");
        this.lblQuerySelecTerm = new JLabel("TERM");
        this.btnSearchARecord = new JButton("Search>>>");
        this.btnGenerateClassTermAnd = new JButton("Generate..");
        (this.ComboQuerySelectSubj = new JComboBox()).addItem("Qur\ufffdan");
        this.ComboQuerySelectSubj.addItem("Arabic Language");
        this.ComboQuerySelectSubj.addItem("Biology");
        this.ComboQuerySelectSubj.addItem("Chemistry");
        this.ComboQuerySelectSubj.addItem("Computer science");
        this.ComboQuerySelectSubj.addItem("Economics");
        this.ComboQuerySelectSubj.addItem("English Language");
        this.ComboQuerySelectSubj.addItem("Foods and Nutrition");
        this.ComboQuerySelectSubj.addItem("Further mathematics");
        this.ComboQuerySelectSubj.addItem("Geography");
        this.ComboQuerySelectSubj.addItem("Government");
        this.ComboQuerySelectSubj.addItem("Hausa");
        this.ComboQuerySelectSubj.addItem("History");
        this.ComboQuerySelectSubj.addItem("Islamic Religion Knowledge");
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
        this.ComboQueryAllSelectSubj.addItem("Qur\ufffdan");
        this.ComboQueryAllSelectSubj.addItem("Arabic Language");
        this.ComboQueryAllSelectSubj.addItem("Biology");
        this.ComboQueryAllSelectSubj.addItem("Chemistry");
        this.ComboQueryAllSelectSubj.addItem("Computer science");
        this.ComboQueryAllSelectSubj.addItem("Economics");
        this.ComboQueryAllSelectSubj.addItem("English Language");
        this.ComboQueryAllSelectSubj.addItem("Foods and Nutrition");
        this.ComboQueryAllSelectSubj.addItem("Further mathematics");
        this.ComboQueryAllSelectSubj.addItem("Geography");
        this.ComboQueryAllSelectSubj.addItem("Government");
        this.ComboQueryAllSelectSubj.addItem("Hausa");
        this.ComboQueryAllSelectSubj.addItem("History");
        this.ComboQueryAllSelectSubj.addItem("Islamic Religion Knowledge");
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
        this.TextArea = new JTextArea(6, 40);
        this.txtmyclass = new JTextField();
        this.panel.setLayout(new GridBagLayout());
        this.lblmyClass = new JLabel("CLASS:");
        this.lblmyterm = new JLabel("TERM:");
        this.lblmydate = new JLabel("DATE:");
        this.lblmyNoinClass = new JLabel("NO[C]:");
        this.txtmyClass = new JTextField(8);
        this.txtmyterm = new JTextField(8);
        this.txtmydate = new JTextField(8);
        this.txtmyNoinClass = new JTextField(8);
        this.lblmyCA = new JLabel("30%CA:");
        this.lblmyExamMarks = new JLabel("EXAM:");
        this.lblmyTotal = new JLabel("TOTAL:");
        this.lblmyGrade = new JLabel("GRADE:");
        this.lblmySubjPosition = new JLabel("PSTN:");
        this.lblmyRemarks = new JLabel("REMK:");
        this.txtmyCA = new JTextField(8);
        this.txtmyExamMarks = new JTextField(8);
        this.txtmyTotal = new JTextField(8);
        this.txtmyGrade = new JTextField(8);
        this.txtmySubjPosition = new JTextField(8);
        this.txtmyRemarks = new JTextField(8);
        this.lblmyOverallTotal = new JLabel("OVRLL. TOTAL:");
        this.lblmyAverage = new JLabel("AVERAGE:");
        this.lblmyActualPosition = new JLabel("ACTUAL POSITION");
        this.txtmyOverallTotal = new JTextField(5);
        this.txtmyAverage = new JTextField(5);
        this.txtmyActualPosition = new JTextField(5);
        this.btnGenerateCAandExamsandTotal = new JButton("Generate..");
        this.btnGenerateGradePositionAndRemarks = new JButton("Generate..");
        this.btnGenerateTatalAverageAndActualPosition = new JButton("Generate..");
        this.tableModel1 = new DefaultTableModel(0, 0);
        final JTable table = new JTable(this.tableModel1);
        table.setAutoCreateRowSorter(true);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setBackground(Color.white);
        table.setGridColor(Color.BLACK);
        table.setForeground(Color.BLACK);
        table.setAutoResizeMode(4);
        table.setAutoResizeMode(1);
        table.setAutoResizeMode(2);
        table.setFont(f3);
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 31);
        ScrollPane.setPreferredSize(new Dimension(900, 590));
        ScrollPane.setEnabled(true);
        ScrollPane.setVisible(true);
        this.panel.validate();
        this.panel.repaint();
        this.myreportJTP = new JTextPane();
        this.textPane = this.createTextPane();
        this.paneScrollPane = new JScrollPane(this.textPane);
        this.panel.validate();
        this.panel.repaint();
        this.paneScrollPane.setVerticalScrollBarPolicy(22);
        this.paneScrollPane.setHorizontalScrollBarPolicy(32);
        this.paneScrollPane.setPreferredSize(new Dimension(800, 300));
        this.textPane.insertIcon(new ImageIcon("StudQueryReportlogo.jpg"));
        (this.lblReportName = new JLabel("STUDENT'S NAME:")).setAlignmentY(0.5f);
        this.lblReportName.setAlignmentX(0.1f);
        (this.txtReportName = new JTextField(30)).setAlignmentY(0.5f);
        this.txtReportName.setAlignmentX(0.1f);
        (this.lblReportRegNum = new JLabel("REG. NO: ")).setAlignmentY(0.5f);
        this.lblReportRegNum.setAlignmentX(0.1f);
        (this.txtReportRegNum = new JTextField(6)).setAlignmentY(0.5f);
        this.txtReportRegNum.setAlignmentX(0.1f);
        (this.lblReportClass = new JLabel("CLASS: ")).setAlignmentY(0.5f);
        this.lblReportClass.setAlignmentX(0.1f);
        (this.txtReportClass = new JTextField(18)).setAlignmentY(0.6f);
        this.txtReportClass.setAlignmentX(0.1f);
        (this.lblReportTerm = new JLabel("TERM: ")).setAlignmentY(0.5f);
        this.lblReportTerm.setAlignmentX(0.1f);
        (this.txtReportTerm = new JTextField(20)).setAlignmentY(0.5f);
        this.txtReportTerm.setAlignmentX(0.1f);
        (this.lblReportNoInClass = new JLabel("NO. IN CLASS: ")).setAlignmentY(0.5f);
        this.lblReportNoInClass.setAlignmentX(0.1f);
        (this.txtReportNoInClass = new JTextField(6)).setAlignmentY(0.5f);
        this.txtReportNoInClass.setAlignmentX(0.1f);
        (this.lblReportYear = new JLabel("YEAR: ")).setAlignmentY(0.5f);
        this.lblReportYear.setAlignmentX(0.1f);
        (this.txtReportYear = new JTextField(5)).setAlignmentY(0.5f);
        this.txtReportYear.setAlignmentX(0.1f);
        (this.lblReportForm = new JLabel("FORM: ")).setAlignmentY(0.5f);
        this.lblReportForm.setAlignmentX(0.1f);
        (this.txtReportFORM = new JTextField(10)).setAlignmentY(0.5f);
        this.txtReportFORM.setAlignmentX(0.1f);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.textPane.insertComponent(ScrollPane);
        (this.txtblankSpace = new JTextField(100)).setAlignmentY(0.5f);
        this.txtblankSpace.setAlignmentX(0.1f);
        this.txtblankSpace.setEditable(false);
        this.txtblankSpace.setBackground(Color.white);
        (this.lblReportTatal = new JLabel("TOTAL: ")).setAlignmentY(0.5f);
        this.lblReportTatal.setAlignmentX(0.1f);
        (this.txtReportTatal = new JTextField(10)).setAlignmentY(0.5f);
        this.txtReportTatal.setAlignmentX(0.1f);
        (this.lblReportAverage = new JLabel("AVERAGE: ")).setAlignmentY(0.5f);
        this.lblReportAverage.setAlignmentX(0.1f);
        (this.txtReportAverage = new JTextField(5)).setAlignmentY(0.5f);
        this.txtReportAverage.setAlignmentX(0.1f);
        (this.lblReportClassPosition = new JLabel("CLASS POSITION: ")).setAlignmentY(0.5f);
        this.lblReportClassPosition.setAlignmentX(0.1f);
        (this.txtReportClassPosition = new JTextField(5)).setAlignmentY(0.5f);
        this.txtReportClassPosition.setAlignmentX(0.1f);
        (this.lblReportHouseMasterReport = new JLabel("HOUSE MASTER'S REPORT: ")).setAlignmentY(0.5f);
        this.lblReportHouseMasterReport.setAlignmentX(0.1f);
        (this.txtReportHouseMasterReport = new JTextField(30)).setAlignmentY(0.5f);
        this.txtReportHouseMasterReport.setAlignmentX(0.1f);
        (this.txtblankSpace3 = new JTextField(70)).setEditable(false);
        this.txtblankSpace3.setBackground(Color.gray);
        (this.lblReportHouseMasterReport = new JLabel("HOUSE MASTER'S SIGN: ")).setAlignmentY(0.5f);
        this.lblReportHouseMasterReport.setAlignmentX(0.1f);
        (this.txtblankSpace4 = new JTextField(30)).setEditable(false);
        (this.lblReportFormMasterReport = new JLabel("FORM MASTER'S REPORT: ")).setAlignmentY(0.5f);
        this.lblReportFormMasterReport.setAlignmentX(0.1f);
        (this.txtReportFormMasterReport = new JTextField(30)).setAlignmentY(0.5f);
        this.txtReportFormMasterReport.setAlignmentX(0.1f);
        (this.txtblankSpace3 = new JTextField(70)).setEditable(false);
        this.txtblankSpace3.setBackground(Color.gray);
        (this.lblReportFormMasterSignature2 = new JLabel("FORM MASTER'S SIGN: ")).setAlignmentY(0.5f);
        this.lblReportFormMasterSignature2.setAlignmentX(0.1f);
        (this.txtblankSpace3 = new JTextField(40)).setEditable(false);
        (this.lblReportPrincipalReport = new JLabel("PRINCIPAL'S REPORT: ")).setAlignmentY(0.5f);
        this.lblReportPrincipalReport.setAlignmentX(0.1f);
        (this.txtReportPrincipalReport = new JTextField(40)).setAlignmentY(0.5f);
        this.txtReportPrincipalReport.setAlignmentX(0.1f);
        (this.lblReportPrincipalSignature3 = new JLabel("PRINCIPAL'S SIGN: ")).setAlignmentY(-0.1f);
        this.lblReportPrincipalSignature3.setAlignmentX(-0.1f);
        (this.txtblankSpace1 = new JTextField(50)).setEditable(false);
        this.txtblankSpace1.setBackground(Color.gray);
        this.txtblankSpace1.setVisible(false);
        (this.lblReportProprietorSignature4 = new JLabel("PROPRIETOR'S REPORT: ")).setAlignmentY(0.5f);
        this.lblReportProprietorSignature4.setAlignmentX(0.1f);
        (this.txtReportProprietorReport = new JTextField(30)).setAlignmentY(0.5f);
        this.txtReportProprietorReport.setAlignmentX(0.1f);
        (this.lblReportProprietorSignature4 = new JLabel("PROPRIETOR'S SIGN: ")).setAlignmentY(5.0f);
        this.lblReportProprietorSignature4.setAlignmentX(0.1f);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(850, 450);
        this.setTitle("Stud Reg Query_Admin");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.red);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.red);
        this.btnRearrangeClass.setBackground(Color.red);
        this.btnRearrangeClass.setForeground(Color.white);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.red);
        this.btnSearch.setBackground(Color.red);
        this.btnGenerateClassTermAnd.setBackground(Color.green);
        this.btnGenerateCAandExamsandTotal.setBackground(Color.green);
        this.btnGenerateGradePositionAndRemarks.setBackground(Color.green);
        this.btnGenerateTatalAverageAndActualPosition.setBackground(Color.green);
        this.addItem(this.panel, this.lblClass, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 3, 3, 1, 17);
        final Box DateBox = Box.createHorizontalBox();
        DateBox.add(this.lblDay);
        DateBox.add(Box.createHorizontalStrut(5));
        DateBox.add(this.ComboDay);
        DateBox.add(Box.createHorizontalStrut(5));
        DateBox.add(this.lblMonth);
        DateBox.add(Box.createHorizontalStrut(5));
        DateBox.add(this.ComboMonth);
        DateBox.add(Box.createHorizontalStrut(5));
        DateBox.add(this.lblYear);
        DateBox.add(Box.createHorizontalStrut(5));
        DateBox.add(this.ComboYear);
        final Box GenerateCLassTermAndBox = Box.createHorizontalBox();
        GenerateCLassTermAndBox.add(this.txtmyClass);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(8));
        GenerateCLassTermAndBox.add(this.lblmyterm);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(5));
        GenerateCLassTermAndBox.add(this.txtmyterm);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(5));
        GenerateCLassTermAndBox.add(this.lblmyNoinClass);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(5));
        GenerateCLassTermAndBox.add(this.txtmyNoinClass);
        GenerateCLassTermAndBox.add(Box.createHorizontalStrut(16));
        GenerateCLassTermAndBox.add(this.btnGenerateClassTermAnd);
        final Box GeneradePositionAdnRemarksBox = Box.createHorizontalBox();
        GeneradePositionAdnRemarksBox.add(this.txtmyGrade);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(8));
        GeneradePositionAdnRemarksBox.add(this.lblmySubjPosition);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        GeneradePositionAdnRemarksBox.add(this.txtmySubjPosition);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        GeneradePositionAdnRemarksBox.add(this.lblmyRemarks);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        GeneradePositionAdnRemarksBox.add(this.txtmyRemarks);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(16));
        GeneradePositionAdnRemarksBox.add(this.btnGenerateGradePositionAndRemarks);
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
        final Box GenerateCAandExams = Box.createHorizontalBox();
        GenerateCAandExams.add(this.txtmyCA);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.lblmyExamMarks);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.txtmyExamMarks);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.lblmyTotal);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        GenerateCAandExams.add(this.txtmyTotal);
        GenerateCAandExams.add(Box.createHorizontalStrut(12));
        GenerateCAandExams.add(this.btnGenerateCAandExamsandTotal);
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
        final Box OveralltotaAverageAndPositionBox = Box.createHorizontalBox();
        OveralltotaAverageAndPositionBox.add(this.txtmyOverallTotal);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.lblmyAverage);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.txtmyAverage);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.lblmyActualPosition);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        OveralltotaAverageAndPositionBox.add(this.txtmyActualPosition);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(24));
        OveralltotaAverageAndPositionBox.add(this.btnGenerateTatalAverageAndActualPosition);
        OveralltotaAverageAndPositionBox.add(Box.createHorizontalStrut(5));
        final Box SecondTestBox = Box.createHorizontalBox();
        SecondTestBox.add(this.txtNoInClass);
        SecondTestBox.add(Box.createHorizontalStrut(5));
        SecondTestBox.add(this.btnGetNoInClass);
        SecondTestBox.add(Box.createHorizontalStrut(5));
        final Box OverallTotalBox = Box.createHorizontalBox();
        OverallTotalBox.add(this.txtoverallTotal);
        OverallTotalBox.add(Box.createHorizontalStrut(5));
        OverallTotalBox.add(this.OverallTotal);
        OverallTotalBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel, this.paneScrollPane, 0, 15, 4, 3, 17);
        this.panel.validate();
        this.panel.repaint();
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClear);
        ButtonsBox.add(Box.createHorizontalStrut(3));
       // ButtonsBox.add(this.btnRearrangeClass);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 1, 22, 2, 2, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                studregQueryAdmin.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                studregQueryAdmin.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                studregQueryAdmin.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnPreviewMethod(evt7);
            }
        });
        this.btnRearrangeClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnRearrangeClassMethod(evt8);
            }
        });
        this.btnGenerateGradePositionAndRemarks.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnGenerateGradePositionAndRemarksMethod(evt9);
            }
        });
        this.btnGenerateCAandExamsandTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnGenerateCAandExamsandTotal(evt10);
            }
        });
        this.btnCOmputeCHTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnCOmputeCHTotalMethod(evt12);
            }
        });
        this.btnGenerateTatalAverageAndActualPosition.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnGenerateTatalAverageAndActualPositionMethod(evt13);
            }
        });
        this.btnGenerateClassTermAnd.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnGenerateClassTermAndMethod(evt14);
            }
        });
        this.btnSubjectGrading.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                studregQueryAdmin.this.connectToDB();
                studregQueryAdmin.this.btnSubjectGaringMethod(evt15);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final Font d = new Font("Arial Unicode MS", 1, 12);
                table.setFont(d);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(18);
                final TableColumn column2 = table.getColumnModel().getColumn(1);
                column2.setPreferredWidth(119);
                final TableColumn column3 = table.getColumnModel().getColumn(2);
                column3.setPreferredWidth(120);
                final TableColumn column4 = table.getColumnModel().getColumn(3);
                column4.setPreferredWidth(280);
                final TableColumn column5 = table.getColumnModel().getColumn(4);
                column5.setPreferredWidth(120);
                if (table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("\u0631\u0633\u0648\u0628") || table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("\u0636\u0639\u0641 \u062c\u062f\u0627 \u0641\u064a \u0647\u0630\u0647 \u0627\u0644\u0645\u0627\u062f\u0629")) {
                    this.setForeground(Color.RED);
                }
                else {
                    this.setForeground(Color.BLACK);
                }
                return this;
            }
        });
        this.fillComboSelecClass();
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
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.table.repaint();
        this.txtSubjectGrading.setText("");
        this.txtRemark.setText("");
        this.txtOverallTotal.setText("");
        this.txtName.setText("");
        this.txtClass.setText("");
        this.txtCHTotal.setText("");
        this.TextArea.setText("");
        this.txtCHTotal.setText("");
        this.txtOverallTotal.setText("");
        this.txtAverage.setText("");
        this.txtNoInClass.setText("");
        this.txtSubjectTotal.setText("");
        this.txtoverallTotal.setText("");
        this.txtmyClass.setText("");
        this.txtmyterm.setText("");
        this.txtmyNoinClass.setText("");
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyExamMarks.setText("");
        this.txtmyTotal.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
        this.txtReportFormMasterReport.setText("");
        this.txtReportPrincipalReport.setText("");
        this.txtReportProprietorReport.setText("");
        this.txtReportNoInClass.setText("");
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportYear.setText("");
        this.txtReportFORM.setText("");
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        this.txtReportClassPosition.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
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
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
    
    public void btnNextMethod(final ActionEvent e4) {
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtRegNum.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            Reg = Integer.parseInt(this.txtRegNum.getText().toString());
            final String R = Integer.toString(++Reg);
            this.txtRegNum.setText(R);
            final String RegNumber = this.txtRegNum.getText().toString();
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM Studentreg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM Studentreg WHERE StdRegNum = ? AND StdClass = ?");
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
        this.txtOverallTotal.setText("");
        this.txtAverage.setText("");
        this.txtNoInClass.setText("");
        this.txtSubjectTotal.setText("");
        this.txtCHTotal.setText("");
        this.txtCHTotal.setText("");
        this.txtoverallTotal.setText("");
        this.txtRemark.setText("");
        this.txtSubjectGrading.setText("");
        this.TextArea.setText("");
        this.txtmyClass.setText("");
        this.txtmyterm.setText("");
        this.txtmyNoinClass.setText("");
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyExamMarks.setText("");
        this.txtmyTotal.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
        this.txtReportFormMasterReport.setText("");
        this.txtReportPrincipalReport.setText("");
        this.txtReportProprietorReport.setText("");
        this.txtReportNoInClass.setText("");
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportYear.setText("");
        this.txtReportFORM.setText("");
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        this.txtReportClassPosition.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
        this.panel.repaint();
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String mySubjectTotal = this.txtSubjectTotal.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        final String myCA = this.txtmyCA.getText().toString();
        final double CA = Double.parseDouble(myCA);
        final String myExam = this.txtmyExamMarks.getText().toString();
        final double Exam = Double.parseDouble(myExam);
        final String mytotal = this.txtmyTotal.getText().toString();
        final double total = Double.parseDouble(mytotal);
        if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else if (this.txtName.getText().equals("") || this.txtmyRemarks.getText().equals("") || this.txtmySubjPosition.getText().equals("") || this.txtmyNoinClass.getText().equals("") || this.txtRegNum.getText().equals("") || this.txtRegNum.getText().equals("") || this.txtmyTotal.getText().equals("") || this.txtmyCA.getText().equals("") || this.txtmyExamMarks.getText().equals("")) {
            JOptionPane.showMessageDialog(this.btnSave, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (day.equals("dd") || month.equals("mm") || year.equals("yy")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, enter day, month or year!", "Error in date", 0);
        }
        try {
            final String InsertQueryString = "INSERT INTO CompiledReportSheet VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO CompiledReportSheet VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, form);
            pstatement.setString(4, subj);
            pstatement.setString(5, Date);
            pstatement.setString(6, myclasses);
            pstatement.setString(7, myterm);
            pstatement.setString(8, myNoInClass);
            pstatement.setString(9, myGrade);
            pstatement.setString(10, position);
            pstatement.setString(11, myremarks);
            pstatement.setDouble(12, CA);
            pstatement.setDouble(13, Exam);
            pstatement.setDouble(14, total);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "The Exams compiled result have been stored for Subject: " + subj + ", for " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void btnPrintMethod(final ActionEvent evt6) {
        final J2Printer printer = new J2Printer();
        printer.setSeparatePrintThread(false);
        final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.textPane);
        printer.addPageable((Pageable)componentPrinter);
        printer.showPrintPreviewDialog((Component)this.textPane);
    }
    
    public void btnRearrangeClassMethod(final ActionEvent evt8) {
        this.pulledCLassName_ENG();
        final String PromotedClass = "";
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String classProtingsTo = "";
        final String archivedTable = "";
        final String nextClassTable = "";
        this.StudClassRegTableName = this.pulledClassName_Eng;
        this.TemporaryTableName = "tempo" + this.StudClassRegTableName;
        if (myclass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Pls, select class!\n", "Error Occured", 0);
        }
        else {
            try {
                final String QueryString = "CREATE TEMPORARY TABLE " + this.TemporaryTableName + " LIKE " + this.StudClassRegTableName;
                (this.pstatement = this.connection.prepareStatement(QueryString)).executeUpdate();
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro Occured\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String InsertQueryString = "INSERT INTO " + this.TemporaryTableName + " (StdID,StDName,StdRegNum,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM) SELECT Null,StDName,StdRegNum,StdClass,StdPicture,DOB,SEX,Nationality,State,PlaceOfBirth,ParentName,ParentNationality,ParentOccupation,ParentGSM FROM " + this.StudClassRegTableName;
                final PreparedStatement pstatement = this.connection.prepareStatement(InsertQueryString);
                pstatement.executeUpdate();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
            try {
                final String QueryString = "TRUNCATE " + this.StudClassRegTableName;
                (this.pstatement = this.connection.prepareStatement(QueryString)).executeUpdate();
                this.pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e.getMessage(), "Error occured", 0);
                e.printStackTrace();
            }
            try {
                final String InsertQueryString = "INSERT INTO " + this.StudClassRegTableName + " SELECT * FROM " + this.TemporaryTableName;
                final PreparedStatement pstatement = this.connection.prepareStatement(InsertQueryString);
                pstatement.executeUpdate();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
            try {
                final String InsertQueryString = "DROP TABLE " + this.TemporaryTableName;
                final PreparedStatement pstatement = this.connection.prepareStatement(InsertQueryString);
                pstatement.executeUpdate();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
            final String concatAidingStr = "";
            try {
                final String QueryString2 = "UPDATE " + this.StudClassRegTableName + " SET StdRegNum=concat(LEFT(StdRegNum , 10),StdID+'')";
                (this.pstatement = this.connection.prepareStatement(QueryString2)).executeUpdate();
                this.pstatement.close();
            }
            catch (SQLException e2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e2.getMessage(), "Error occured", 0);
                e2.printStackTrace();
            }
        }
        this.btnPreviewMethod(evt8);
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
        this.pulledCLassName_ENG();
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
        this.txtReportFormMasterReport.setText("");
        this.txtReportPrincipalReport.setText("");
        this.txtReportProprietorReport.setText("");
        this.txtReportNoInClass.setText("");
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportYear.setText("");
        this.txtReportFORM.setText("");
        this.txtReportTatal.setText("");
        this.txtReportAverage.setText("");
        this.txtReportClassPosition.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
       //final String ClassName_Eng = this.pulledClassName_Eng;
        final String TheModifiedpulledClassname_Eng = this.pulledClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();//here we grabbed the classname from the UI e.g; "PRIMARY 1 A" and then REPLACE ALL DASHES "-" TO UNDERSCORE "_" AND ALSO REMOVE ALL SPACES 
 
        try {
            final String QueryString = "SELECT StdID,StdRegNum,StdName,StdClass,DOB,Nationality,State,ParentGSM FROM " + TheModifiedpulledClassname_Eng + " ORDER BY StdID";
            final PreparedStatement pstatement = this.connection.prepareStatement(QueryString);
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
            rs.close();
            pstatement.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        this.tableModel1.setDataVector(this.data, this.columnNames);
        this.table = new JTable(this.tableModel1);
        for (int k = 0; k < this.table.getColumnCount(); ++k) {
            this.table.getColumnModel().getColumn(k);
        }
        this.txtReportName.setText(this.txtName.getText().toString());
        this.txtReportClass.setText(myclass);
        this.txtReportTerm.setText(term);
        this.txtReportYear.setText(year);
        this.table.repaint();
        this.table.revalidate();
        this.panel.validate();
        this.panel.repaint();
    }
    
    public void btnGenerateGradePositionAndRemarksMethod(final ActionEvent e9) {
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "1ST TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            if (subj == "Quran") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforquran where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforquran where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Arabic Language") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforArabic where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforArabic where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Biology") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforBiology where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforBiology where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Chemistry") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforChemistry where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforChemistry where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Computer Science") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforComputerScience where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforComputerScience where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Economics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforeconomics where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforeconomics where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "English Language") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforEnglish where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforEnglish where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Foods and Nutrition") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforFoodsandnut where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforFoodsandnut where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Further Mathematics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforFurtherMaths where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforFurtherMaths where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Geography") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforGeography where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforGeography where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Government") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforGovernment where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforGovernment where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Hausa") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforHausa where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforHausa where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "History") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforHistory where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforHistory where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Islamic Religion Knowledge") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforIslamic where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforIslamic where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Literature in English") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforLiterature where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforLiterature where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Mathematics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforMathematics where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforMathematics where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "Physics") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforPhysics where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforPhysics where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "ENGLISHjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforENGLISHjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforENGLISHjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "MATHSjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforMATHSjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforMATHSjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "IRSjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforIRSjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforIRSjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "ARABICjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforARABICjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforARABICjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "HOME ECONOMICjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforhomeeconsjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforhomeeconsjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "AGRICULTURAL SCIENCEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforagricjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforagricjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "PHEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforPHEjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforPHEjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "BASIC SCIENCEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforBasicscjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforBasicscjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "CIVIC EDUCATIONjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforcivicEdujss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforcivicEdujss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "LITERATURE IN ENGLISHjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforLitInEngjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforLitInEngjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "QURANjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforQURANjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforQURANjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "HAUSAjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforHAUSAjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforHAUSAjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "COMPUTER SCIENCEjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforComputerScjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforComputerScjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "BASIC TECHNOLOGYjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforBasicTechjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforBasicTechjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            else if (subj == "CCAjss") {
                try {
                    final String QueryString = "SELECT grade,remark FROM remarkandgradingforCCAjss where regnum=? and class=? and term=? and form=? and subject=?";
                    final PreparedStatement pstatement = this.connection.prepareStatement("SELECT grade,remark FROM remarkandgradingforCCAjss where regnum=? and class=? and term=? and form=? and subject=?");
                    pstatement.setString(1, RegNumber);
                    pstatement.setString(2, myClass);
                    pstatement.setString(3, term);
                    pstatement.setString(4, form);
                    pstatement.setString(5, subj);
                    final ResultSet rs = pstatement.executeQuery();
                    while (rs.next()) {
                        final String Grade = rs.getString(1);
                        final String Remark = rs.getString(2);
                        System.out.append(Grade);
                        this.txtmyGrade.setText(Grade);
                        this.txtmyRemarks.setText(Remark);
                    }
                    rs.close();
                    pstatement.close();
                }
                catch (SQLException a) {
                    JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                    a.printStackTrace();
                }
            }
            try {
                final String QueryString = "SELECT position FROM PositionPersubj where regnum=? and class=? and term=? and form=? and subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT position FROM PositionPersubj where regnum=? and class=? and term=? and form=? and subject=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Position = rs.getString(1);
                    this.txtmySubjPosition.setText(Position);
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
    
    public void btnGenerateCAandExamsandTotal(final ActionEvent e10) {
        this.txtmyExamMarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyTotal.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "1ST TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            double myCA = 0.0;
            try {
                final String QueryString = "SELECT CAMarks FROM CA WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT CAMarks FROM CA WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    myCA = rs.getDouble(1);
                    this.txtmyCA.setText(Double.toString(myCA));
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT ExamScore FROM ExamDataEntry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ExamScore FROM ExamDataEntry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                pstatement.setString(5, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double ExamScore = rs.getDouble(1);
                    this.txtmyExamMarks.setText(Double.toString(ExamScore));
                    final double total = ExamScore + myCA;
                    this.txtmyTotal.setText(Double.toString(total));
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
    
    public void btnCOmputeCHTotalMethod(final ActionEvent evt12) {
        this.txtCHTotal.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String TestScore = this.txtCHTotal.getText().toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT SUM(C_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SUM(C_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.Cwork = rs.getDouble(1);
                    this.txtCHTotal.setText(Double.toString(this.Cwork));
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT SUM(H_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SUM(H_Work) FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.Hwork = rs.getDouble(1);
                    final double CworkHworkTotal = this.Cwork + this.Hwork;
                    this.txtCHTotal.setText(Double.toString(CworkHworkTotal));
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT COUNT(*) C_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) C_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double result = rs.getDouble(1);
                    this.CworkRowCount = result;
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT COUNT(*) H_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) H_Work FROM EVACA WHERE RegNum = ? AND Term =? AND Form =? AND Subject =?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double result = rs.getDouble(1);
                    this.HworkRowCount = result;
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
    
    public void btnGenerateTatalAverageAndActualPositionMethod(final ActionEvent evt13) {
        this.txtmyOverallTotal.setText("");
        this.txtmyAverage.setText("");
        this.txtmyActualPosition.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "1ST TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT ActualPosion FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ActualPosion FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Position = rs.getString(1);
                    this.txtmyActualPosition.setText(Position);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        try {
            final String QueryString = "SELECT OvrllTotal,Average FROM OverallTotalAndAverage WHERE RegNum=? and Class=? and Term=? and Form=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT OvrllTotal,Average FROM OverallTotalAndAverage WHERE RegNum=? and Class=? and Term=? and Form=?");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, myClass);
            pstatement.setString(3, term);
            pstatement.setString(4, form);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                final String OverallTotal = rs.getString(1);
                final String Average = rs.getString(2);
                this.txtmyOverallTotal.setText(OverallTotal);
                this.txtmyAverage.setText(Average);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void btnGenerateClassTermAndMethod(final ActionEvent evt14) {
        this.txtmyExamMarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyTotal.setText("");
        this.txtSubjectTotal.setText("");
        final double ExamScore = 0.0;
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String TestScore = this.txtCHTotal.getText().toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "3RD TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else {
            try {
                final String QueryString = "SELECT Class,Term,NoInClass FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Class,Term,NoInClass FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myClass);
                pstatement.setString(3, term);
                pstatement.setString(4, form);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String MYClass = rs.getString(1);
                    final String myterm = rs.getString(2);
                    final String NoInClass = rs.getString(3);
                    this.txtmyClass.setText(MYClass);
                    this.txtmyterm.setText(myterm);
                    this.txtmyNoinClass.setText(NoInClass);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
    }
    
    public void btnSubjectGaringMethod(final ActionEvent evt15) {
        double ExamScore = 0.0;
        this.txtRemark.setText("");
        this.txtSubjectGrading.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String TestScore = this.txtCHTotal.getText().toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT ExamScore FROM examdataentry WHERE RegNum =? AND Term =? AND Form =? AND Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ExamScore FROM examdataentry WHERE RegNum =? AND Term =? AND Form =? AND Subject=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    ExamScore = rs.getDouble(1);
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT CAmarks FROM CA WHERE RegNum = ? AND Term =? AND Form = ? AND Subject =? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT CAmarks FROM CA WHERE RegNum = ? AND Term =? AND Form = ? AND Subject =? ");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final double CAresult = rs.getDouble(1);
                    final double SubjTototal = ExamScore + CAresult;
                    String Grade = "";
                    String Remark = "";
                    if (SubjTototal >= 80.0) {
                        Grade = "A+";
                        Remark = "Excellent";
                    }
                    else if (SubjTototal >= 70.0) {
                        Grade = "A";
                        Remark = "Very Good";
                    }
                    else if (SubjTototal >= 60.0) {
                        Grade = "B";
                        Remark = "Good";
                    }
                    else if (SubjTototal >= 50.0) {
                        Grade = "C";
                        Remark = "Pass";
                    }
                    else if (SubjTototal >= 40.0) {
                        Grade = "D";
                        Remark = "Fair";
                    }
                    else if (SubjTototal < 40.0) {
                        Grade = "F";
                        Remark = "Poor";
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "There is no valid entry in column Total!\n", "Error Grading", 0);
                    }
                    this.txtSubjectGrading.setText("");
                    this.txtRemark.setText("");
                    this.txtSubjectGrading.setText(Grade);
                    this.txtRemark.setText(Remark);
                }
                rs.close();
                this.connection.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
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
        final String[] initString = { "\n:  " };
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
    
    public void fillComboSelecClass() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0281: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Ara FROM class_regsitration ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Ara FROM class_regsitration ");
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String ComboClassName = rs.getString("Classname_Ara");
                    this.ComboSelecClass.addItem(ComboClassName);
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
    
    public void pulledCLassName_ENG() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString();
        Label_0250: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Classname_Eng FROM class_regsitration WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    this.pulledClassName_Eng = rs.getString("Classname_Eng");
                    System.out.println("pulled Class: " + this.pulledClassName_Eng);
                    this.panel.repaint();
                    this.panel.revalidate();
                }
                pstatement.close();
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
                break Label_0250;
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
}
