import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
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
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Color;
import javax.swing.table.TableModel;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
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

public class CAPrincipalCOmment extends JFrame
{
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
    private JLabel lblID;
    private JTextField txtID;
    private JTextField txtReportID;
    private JLabel lblReportID;
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
    double ReportNoOfCWDone;
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
    private JLabel lblReportForm;
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
    private JTextField txtReportNameCorrect;
    private JTextField txtReportName;
    private JTextField txtReportClass;
    private JTextField txtReportTerm;
    private JTextField txtReportYear;
    private JTextField txtReportFORM;
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
    private JLabel lblReportNoOfCWDone;
    private JLabel lblReportNoOfHWDone;
    private JLabel lblReportTotalCWDone;
    private JLabel lblReportTotalHWDone;
    private JTextField txtReportNoOfCWDone;
    private JTextField txtReportNoOfHWDone;
    private JTextField txtReportCWTotal;
    private JTextField txtReportHWTotal;
    private JTextField txtBlankSpaceForHeading;
    private ImageIcon icon;
    private JTextField txtblankSpace1;
    private JTextField txtblankSpace2;
    private JTextField txtblankSpace3;
    private JTextField txtblankSpace4;
    private JTextField txtblankSpace5;
    private JTextField txtblankSpace;
    private JTextPane textPane;
    private JLabel lblStaffDetails;
    private JLabel lblStaffID;
    private JLabel lblStaffName;
    private JLabel lblStaffComment;
    private JTextField txtStaffID;
    private JTextField txtStaffName;
    private JComboBox ComboStaffComment;
    private JButton btnStaffSearch;
    private JButton btnCommentAndSave;
    private JDateChooser picker;
    
    static {
        CAPrincipalCOmment.printer = new J2Printer("");
    }
    
    public CAPrincipalCOmment() {
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
        this.ReportNoOfCWDone = 0.0;
    }
    
    public static void setOnScreen(final boolean val) {
        CAPrincipalCOmment.onScreen = val;
    }
    
    public void CAPrincipalCOmment() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("dd-MM-yyyy");
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblID = new JLabel("STD. ID:");
        this.txtID = new JTextField(7);
        this.lblRegNum = new JLabel("REG. NO:");
        this.lblName = new JLabel("NAME:");
        this.lblClass = new JLabel("CLASS:");
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
        (this.ComboSelecClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelecClass.addItem("PRIMARY ONE");
        this.ComboSelecClass.addItem("PRIMARY TWO");
        this.ComboSelecClass.addItem("PRIMARY THREE");
        this.ComboSelecClass.addItem("PRIMARY FOUR");
        this.ComboSelecClass.addItem("PRIMARY FIVE");
        this.ComboSelecClass.addItem("PRIMARY SIX");
        this.ComboSelecClass.addItem("NURSERY ONE");
        this.ComboSelecClass.addItem("NURSERY TWO");
        this.ComboSelecClass.addItem("NURSERY THREE");
        this.ComboSelecClass.addItem("NURSERY FOUR");
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
        this.lblStaffDetails = new JLabel("STAFF DETAILS:");
        this.lblStaffID = new JLabel("STAFF ID:");
        this.lblStaffName = new JLabel("STAFF NAME:");
        this.lblStaffComment = new JLabel("COMMENT:");
        this.txtStaffID = new JTextField(5);
        (this.txtStaffName = new JTextField(15)).setEditable(false);
        this.ComboStaffComment = new JComboBox();
        (this.ComboStaffComment = new JComboBox()).addItem("Select Comment");
        this.ComboStaffComment.addItem("Excellent, Keep it up");
        this.ComboStaffComment.addItem("Very Good");
        this.ComboStaffComment.addItem("Good");
        this.ComboStaffComment.addItem("Fair");
        this.ComboStaffComment.addItem("You need to wake up");
        this.ComboStaffComment.addItem("You will repeat class");
        this.ComboStaffComment.setEditable(true);
        this.btnStaffSearch = new JButton("Staff Search");
        final JButton btnCommentAndSave = new JButton("Comment&Save");
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
        this.icon = new ImageIcon();
        this.tableModel1 = new DefaultTableModel();
        final JTable table = new JTable(this.tableModel1);
        table.setAutoCreateRowSorter(true);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setBackground(Color.white);
        table.setGridColor(Color.black);
        table.setForeground(Color.black);
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 31);
        ScrollPane.setPreferredSize(new Dimension(630, 280));
        this.panel.validate();
        this.panel.repaint();
        this.myreportJTP = new JTextPane();
        this.textPane = this.createTextPane();
        final JScrollPane paneScrollPane = new JScrollPane(this.textPane);
        this.panel.validate();
        this.panel.repaint();
        paneScrollPane.setVerticalScrollBarPolicy(22);
        paneScrollPane.setHorizontalScrollBarPolicy(32);
        paneScrollPane.setPreferredSize(new Dimension(610, 220));
        this.textPane.insertIcon(new ImageIcon("CAlogo.jpg"));
        (this.lblReportName = new JLabel("STUDENT'S NAME:")).setAlignmentY(0.5f);
        this.lblReportName.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportName);
        (this.txtReportName = new JTextField(18)).setAlignmentY(0.5f);
        this.txtReportName.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportName);
        (this.lblReportRegNum = new JLabel("REG. NUMBER: ")).setAlignmentY(0.5f);
        this.lblReportRegNum.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportRegNum);
        (this.txtReportRegNum = new JTextField(7)).setAlignmentY(0.5f);
        this.txtReportRegNum.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportRegNum);
        (this.lblReportID = new JLabel("ID: ")).setAlignmentY(0.5f);
        this.lblReportID.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportID);
        (this.txtReportID = new JTextField(5)).setAlignmentY(0.5f);
        this.txtReportID.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportID);
        this.txtReportID.setBackground(Color.GRAY.brighter());
        (this.lblReportClass = new JLabel("CLASS: ")).setAlignmentY(0.5f);
        this.lblReportClass.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportClass);
        (this.txtReportClass = new JTextField(17)).setAlignmentY(0.6f);
        this.txtReportClass.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportClass);
        (this.lblReportTerm = new JLabel("TERM: ")).setAlignmentY(0.5f);
        this.lblReportTerm.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportTerm);
        (this.txtReportTerm = new JTextField(11)).setAlignmentY(0.5f);
        this.txtReportTerm.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportTerm);
        (this.lblReportYear = new JLabel("DATE: ")).setAlignmentY(0.5f);
        this.lblReportYear.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportYear);
        (this.txtReportYear = new JTextField(11)).setAlignmentY(0.5f);
        this.txtReportYear.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportYear);
        (this.lblReportForm = new JLabel("FORM: ")).setAlignmentY(0.5f);
        this.lblReportForm.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportForm);
        (this.txtReportFORM = new JTextField(5)).setAlignmentY(0.5f);
        this.txtReportFORM.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportFORM);
        (this.txtBlankSpaceForHeading = new JTextField(50)).setEditable(false);
        this.txtBlankSpaceForHeading.setVisible(true);
        this.textPane.insertComponent(this.txtBlankSpaceForHeading);
        this.txtBlankSpaceForHeading.setBackground(Color.black);
        (this.lblReportNoOfCWDone = new JLabel("NO. OF CW DONE: ")).setAlignmentY(0.5f);
        this.lblReportNoOfCWDone.setAlignmentX(0.1f);
        (this.txtReportNoOfCWDone = new JTextField(6)).setAlignmentY(0.5f);
        this.txtReportNoOfCWDone.setAlignmentX(0.1f);
        (this.lblReportNoOfHWDone = new JLabel("NO. OF HW DONE: ")).setAlignmentY(0.5f);
        this.lblReportNoOfHWDone.setAlignmentX(0.1f);
        (this.txtReportNoOfHWDone = new JTextField(6)).setAlignmentY(0.5f);
        this.txtReportNoOfHWDone.setAlignmentX(0.1f);
        (this.lblReportTotalCWDone = new JLabel("CW TOTAL: ")).setAlignmentY(0.5f);
        this.lblReportTotalCWDone.setAlignmentX(0.1f);
        (this.txtReportCWTotal = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportCWTotal.setAlignmentX(0.1f);
        (this.lblReportTotalHWDone = new JLabel("HW TOTAL: ")).setAlignmentY(0.5f);
        this.lblReportTotalHWDone.setAlignmentX(0.1f);
        (this.txtReportHWTotal = new JTextField(8)).setAlignmentY(0.5f);
        this.txtReportHWTotal.setAlignmentX(0.1f);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.textPane.insertComponent(ScrollPane);
        (this.txtblankSpace = new JTextField(100)).setAlignmentY(0.5f);
        this.txtblankSpace.setAlignmentX(0.1f);
        this.txtblankSpace.setEditable(false);
        (this.lblReportTatal = new JLabel("TOTAL: ")).setAlignmentY(0.5f);
        this.lblReportTatal.setAlignmentX(0.1f);
        (this.lblReportHouseMasterReport = new JLabel("HOUSE MASTER'S COMMENT: ")).setAlignmentY(0.5f);
        this.lblReportHouseMasterReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportHouseMasterReport);
        (this.txtReportHouseMasterReport = new JTextField(30)).setAlignmentY(0.5f);
        this.txtReportHouseMasterReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportHouseMasterReport);
        (this.lblReportHouseMasterReport = new JLabel("HOUSE MASTER'S SIGN: ")).setAlignmentY(0.5f);
        this.lblReportHouseMasterReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportHouseMasterReport);
        (this.txtblankSpace4 = new JTextField(30)).setEditable(false);
        this.textPane.insertComponent(this.txtblankSpace4);
        (this.lblReportFormMasterReport = new JLabel("FORM MASTER'S REPORT: ")).setAlignmentY(0.5f);
        this.lblReportFormMasterReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportFormMasterReport);
        (this.txtReportFormMasterReport = new JTextField(30)).setAlignmentY(0.5f);
        this.txtReportFormMasterReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportFormMasterReport);
        (this.lblReportFormMasterSignature2 = new JLabel("FORM MASTER'S SIGN: ")).setAlignmentY(0.5f);
        this.lblReportFormMasterSignature2.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportFormMasterSignature2);
        (this.txtblankSpace3 = new JTextField(40)).setEditable(false);
        this.textPane.insertComponent(this.txtblankSpace3);
        (this.lblReportPrincipalReport = new JLabel("PRINCIPAL'S COMMENT: ")).setAlignmentY(0.5f);
        this.lblReportPrincipalReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportPrincipalReport);
        (this.txtReportPrincipalReport = new JTextField(40)).setAlignmentY(0.5f);
        this.txtReportPrincipalReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportPrincipalReport);
        (this.lblReportPrincipalSignature3 = new JLabel("PRINCIPAL'S SIGN: ")).setAlignmentY(-0.1f);
        this.lblReportPrincipalSignature3.setAlignmentX(-0.1f);
        this.textPane.insertComponent(this.lblReportPrincipalSignature3);
        this.textPane.insertIcon(new ImageIcon("principal.jpg"));
        (this.txtblankSpace1 = new JTextField(50)).setEditable(false);
        this.txtblankSpace1.setBackground(Color.gray);
        this.txtblankSpace1.setVisible(false);
        this.textPane.insertComponent(this.txtblankSpace1);
        (this.lblReportProprietorSignature4 = new JLabel("PROPRIETOR'S COMMENT: ")).setAlignmentY(0.5f);
        this.lblReportProprietorSignature4.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportProprietorSignature4);
        (this.txtReportProprietorReport = new JTextField(30)).setAlignmentY(0.5f);
        this.txtReportProprietorReport.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.txtReportProprietorReport);
        (this.lblReportProprietorSignature4 = new JLabel("PROPRIETOR'S SIGN: ")).setAlignmentY(4000.0f);
        this.lblReportProprietorSignature4.setAlignmentX(0.1f);
        this.textPane.insertComponent(this.lblReportProprietorSignature4);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(640, 650);
        this.setTitle("C.A. Principal's Comment [C.A.P.C] Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnClear.setBackground(Color.red.darker());
        this.btnClear.setForeground(Color.white);
        this.btnClose.setBackground(Color.red.darker());
        this.btnClose.setForeground(Color.white);
        this.btnPreview.setBackground(Color.red.darker());
        this.btnPreview.setForeground(Color.white);
        this.btnPrint.setBackground(Color.red.darker());
        this.btnPrint.setForeground(Color.white);
        this.btnNext.setBackground(Color.red.darker());
        this.btnNext.setForeground(Color.white);
        this.btnSearch.setBackground(Color.red.darker());
        this.btnSearch.setForeground(Color.white);
        this.addItem(this.panel, this.lblID, 0, 1, 1, 1, 13);
        this.addItem(this.panel, this.txtID, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblName, 0, 2, 1, 1, 13);
        this.addItem(this.panel, this.txtName, 1, 2, 2, 1, 17);
        this.addItem(this.panel, this.lblClass, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 3, 3, 1, 17);
        this.addItem(this.panel, this.lblTerm, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.ComboTerm, 1, 4, 3, 1, 17);
        this.addItem(this.panel, this.lblForm, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.ComboForm, 1, 5, 3, 1, 17);
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
        this.addItem(this.panel, (JComponent)this.picker, 1, 7, 1, 1, 17);
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
        this.addItem(this.panel, paneScrollPane, 0, 15, 4, 3, 17);
        this.panel.validate();
        this.panel.repaint();
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnNext);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSearch);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClear);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 1, 22, 2, 2, 13);
        this.addItem(this.panel, this.lblStaffDetails, 0, 24, 1, 2, 13);
        this.lblStaffDetails.setForeground(Color.red);
        this.addItem(this.panel, this.lblStaffID, 0, 27, 1, 2, 13);
        this.lblStaffID.setForeground(Color.red);
        this.addItem(this.panel, this.txtStaffID, 1, 27, 1, 2, 17);
        this.addItem(this.panel, this.lblStaffName, 0, 29, 1, 2, 13);
        this.lblStaffName.setForeground(Color.red);
        final Box StaffNameBox = Box.createHorizontalBox();
        StaffNameBox.add(Box.createHorizontalStrut(3));
        StaffNameBox.add(this.txtStaffName);
        StaffNameBox.add(Box.createHorizontalStrut(3));
        StaffNameBox.add(this.btnStaffSearch);
        this.addItem(this.panel, StaffNameBox, 1, 29, 1, 2, 17);
        StaffNameBox.setForeground(Color.blue);
        this.addItem(this.panel, this.lblStaffComment, 0, 31, 1, 2, 13);
        this.lblStaffComment.setForeground(Color.red);
        final Box StaffCommentBox = Box.createHorizontalBox();
        StaffCommentBox.add(Box.createHorizontalStrut(3));
        StaffCommentBox.add(this.ComboStaffComment);
        this.ComboStaffComment.setBackground(Color.pink);
        StaffCommentBox.add(Box.createHorizontalStrut(3));
        StaffCommentBox.add(btnCommentAndSave);
        btnCommentAndSave.setBackground(Color.black);
        btnCommentAndSave.setForeground(Color.white);
        this.btnStaffSearch.setBackground(Color.black);
        this.btnStaffSearch.setForeground(Color.white);
        this.addItem(this.panel, StaffCommentBox, 1, 31, 1, 2, 17);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                CAPrincipalCOmment.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                CAPrincipalCOmment.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                CAPrincipalCOmment.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnPreviewMethod(evt7);
            }
        });
        this.btnGenerateGradePositionAndRemarks.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnGenerateGradePositionAndRemarksMethod(evt9);
            }
        });
        this.btnGenerateCAandExamsandTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnGenerateCAandExamsandTotal(evt10);
            }
        });
        this.btnCOmputeCHTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnCOmputeCHTotalMethod(evt12);
            }
        });
        this.btnGenerateTatalAverageAndActualPosition.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnGenerateTatalAverageAndActualPositionMethod(evt13);
            }
        });
        this.btnGenerateClassTermAnd.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnGenerateClassTermAndMethod(evt14);
            }
        });
        this.btnStaffSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnStaffSearchMethod(evt16);
            }
        });
        btnCommentAndSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e17) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt17) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.btnCommentAndSave(evt17);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e18) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt18) {
                CAPrincipalCOmment.this.connectToDB();
                CAPrincipalCOmment.this.ComboSelecClassMethod(evt18);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(150);
                if (table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("Fail") || table.getModel().getValueAt(row, col).toString().equalsIgnoreCase("F")) {
                    this.setForeground(Color.RED);
                }
                else {
                    this.setForeground(Color.BLACK);
                }
                return this;
            }
        });
    }
    
    public static void main(final String[] args) {
        new CAPrincipalCOmment();
    }
    
    public void connectToDB() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/AcasolVer2";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AcasolVer2", "root", "ash123");
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
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportYear.setText("");
        this.txtReportFORM.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
    }
    
    public void btnSearchMethod(final ActionEvent e3) {
        this.txtName.setText("");
        final String RegNumber = this.txtRegNum.getText().toString();
        final String ID = this.txtID.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else if (myClass.equalsIgnoreCase("SSS1 A")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregSSS1A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregSSS1A WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("SSS1 B")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregSSS1B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregSSS1B WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("SSS2 A")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregSSS2A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregSSS2A WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("SSS2 B")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregSSS2B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregSSS2B WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("SSS3 A")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregSSS3A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregSSS3A WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("SSS3 B")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregSSS3B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregSSS3B WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("JSS I A")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregJSS1A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregJSS1A WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("JSS I B")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregJSS1B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregJSS1B WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("JSS II A")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregJSS2A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregJSS2A WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("JSS II B")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregJSS2B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregJSS2B WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("JSS III A")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregJSS3A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregJSS3A WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        else if (myClass.equalsIgnoreCase("JSS III B")) {
            try {
                final String QueryString = "SELECT StdID,StdName,StdClass FROM studentregJSS3B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass FROM studentregJSS3B WHERE StdID = ? AND StdClass = ?");
                pstatement.setString(1, ID);
                pstatement.setString(2, myClass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final String Name = rs.getObject(2).toString();
                    this.txtName.setText(Name);
                    final int myID = rs.getInt(1);
                    Integer.toString(myID);
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
        int ID = Integer.parseInt(this.txtID.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            ID = Integer.parseInt(this.txtID.getText().toString());
            final String R = Integer.toString(++ID);
            this.txtID.setText(R);
            final String IDNumber = this.txtID.getText().toString();
            if (myClass.equalsIgnoreCase("SSS1 A")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS1A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS1A WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("SSS1 B")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS1B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS1B WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("SSS2 A")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS2A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS2A WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("SSS2 B")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS2B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS2B WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("SSS3 A")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS3A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS3A WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("SSS3 B")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS3B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregSSS3B WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("JSS I A")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS1A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS1A WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("JSS I B")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS1B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS1B WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("JSS II A")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS2A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS2A WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("JSS II B")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS2B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS2B WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("JSS III A")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS3A WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS3A WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
            }
            else if (myClass.equalsIgnoreCase("JSS III B")) {
                final String QueryString = "SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS3B WHERE StdID = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdID,StdName,StdClass,StdRegNum FROM studentregJSS3B WHERE StdID = ? AND StdClass = ?");
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
                    rs.close();
                    pstatement.close();
                }
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
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportYear.setText("");
        this.txtReportFORM.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
        this.panel.repaint();
        this.btnPreviewMethod(e4);
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
    
    public void btnPreviewMethod(final ActionEvent evt7) {
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
        this.txtReportName.setText("");
        this.txtReportClass.setText("");
        this.txtReportTerm.setText("");
        this.txtReportYear.setText("");
        this.txtReportFORM.setText("");
        this.txtReportRegNum.setText("");
        this.txtReportHouseMasterReport.setText("");
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        final String Date;
        final String year = Date = sdf1.format(this.picker.getDate()).toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        String ProprierStaffID = "";
        final String ID = this.txtID.getText().toString();
        if (this.txtName.getText().equals("") || this.txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (this.txtName.getText().equals("") || this.txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                final String URL = "jdbc:mysql://localhost:3306/AcasolVer2";
                final String USERNAME = "root";
                final String PASSWORD = "ash123";
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AcasolVer2", "root", "ash123");
                final String QueryString = "SELECT Subject,HomeWork,Test1,Test2,CA,CA_Percentage FROM dataentry WHERE ID=? and Form=? and Class=? and Term=? ";
                final PreparedStatement pstatement = con.prepareStatement("SELECT Subject,HomeWork,Test1,Test2,CA,CA_Percentage FROM dataentry WHERE ID=? and Form=? and Class=? and Term=? ");
                pstatement.setString(1, ID);
                pstatement.setString(2, form);
                pstatement.setString(3, myclass);
                pstatement.setString(4, term);
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
                final TableColumn col = this.table.getColumnModel().getColumn(k);
                col.setMaxWidth(250);
            }
            this.txtReportName.setText(this.txtName.getText().toString());
            this.txtReportClass.setText(myclass);
            this.txtReportTerm.setText(term);
            this.txtReportYear.setText(year);
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
            try {
                final String QueryString2 = "SELECT Form FROM dataentry WHERE ID=? and Form=? and Class=? and Term=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT Form FROM dataentry WHERE ID=? and Form=? and Class=? and Term=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, form);
                pstatement2.setString(3, myclass);
                pstatement2.setString(4, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final String Form = rs2.getString(1);
                    this.txtReportFORM.setText(Form);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT ID,RegNum FROM dataentry WHERE ID=? and Form=? and Class=? and Term=? ";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT ID,RegNum FROM dataentry WHERE ID=? and Form=? and Class=? and Term=? ");
                pstatement2.setString(1, ID);
                pstatement2.setString(2, form);
                pstatement2.setString(3, myclass);
                pstatement2.setString(4, term);
                final ResultSet rs2 = pstatement2.executeQuery();
                final int Reg = 0;
                while (rs2.next()) {
                    final int id = rs2.getInt(1);
                    final String myID = String.format("%04d", id);
                    this.txtReportID.setText(myID);
                    final String Regnum = rs2.getString(2);
                    this.txtReportRegNum.setText(Regnum);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        try {
            final String QueryString3 = "SELECT Comment FROM CAFormMasterComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT Comment FROM CAFormMasterComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement3.setString(1, ID);
            pstatement3.setString(2, form);
            pstatement3.setString(3, myclass);
            pstatement3.setString(4, term);
            final ResultSet rs3 = pstatement3.executeQuery();
            final int Reg2 = 0;
            while (rs3.next()) {
                final String Comment = rs3.getString(1);
                this.txtReportFormMasterReport.setText(Comment);
            }
            rs3.close();
            pstatement3.close();
        }
        catch (SQLException a2) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
            a2.printStackTrace();
        }
        try {
            final String QueryString3 = "SELECT Comment FROM CAHouseMasterComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT Comment FROM CAHouseMasterComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement3.setString(1, ID);
            pstatement3.setString(2, form);
            pstatement3.setString(3, myclass);
            pstatement3.setString(4, term);
            final ResultSet rs3 = pstatement3.executeQuery();
            final int Reg2 = 0;
            while (rs3.next()) {
                final String Comment = rs3.getString(1);
                this.txtReportHouseMasterReport.setText(Comment);
            }
            rs3.close();
            pstatement3.close();
        }
        catch (SQLException a2) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
            a2.printStackTrace();
        }
        try {
            final String QueryString3 = "SELECT Comment FROM CAPrincipalComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT Comment FROM CAPrincipalComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement3.setString(1, ID);
            pstatement3.setString(2, form);
            pstatement3.setString(3, myclass);
            pstatement3.setString(4, term);
            final ResultSet rs3 = pstatement3.executeQuery();
            final int Reg2 = 0;
            while (rs3.next()) {
                final String Comment = rs3.getString(1);
                this.txtReportPrincipalReport.setText(Comment);
            }
            rs3.close();
            pstatement3.close();
        }
        catch (SQLException a2) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
            a2.printStackTrace();
        }
        try {
            final String QueryString3 = "SELECT Comment,StaffID FROM CAProprietorComment WHERE ID=? and Form=? and Class=? and Term=? ";
            final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT Comment,StaffID FROM CAProprietorComment WHERE ID=? and Form=? and Class=? and Term=? ");
            pstatement3.setString(1, ID);
            pstatement3.setString(2, form);
            pstatement3.setString(3, myclass);
            pstatement3.setString(4, term);
            final ResultSet rs3 = pstatement3.executeQuery();
            final int Reg2 = 0;
            while (rs3.next()) {
                final String Comment = rs3.getString(1);
                this.txtReportProprietorReport.setText(Comment);
                final int myStaffID = rs3.getInt(2);
                ProprierStaffID = Integer.toString(myStaffID);
            }
            rs3.close();
            pstatement3.close();
        }
        catch (SQLException a2) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
            a2.printStackTrace();
        }
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
                final String QueryString = "SELECT CAMarks FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT CAMarks FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
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
            final String QueryString = "SELECT OvrllTotal,Average FROM OverallTotalAndAverage WHERE ID=? and Class=? and Term=? and Form=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT OvrllTotal,Average FROM OverallTotalAndAverage WHERE ID=? and Class=? and Term=? and Form=?");
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
    
    public void btnStaffSearchMethod(final ActionEvent evt16) {
        final double ExamScore = 0.0;
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String TestScore = this.txtCHTotal.getText().toString();
        final String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "3RD TEST";
        final String StaffID = this.txtStaffID.getText().toString();
        if (this.txtStaffID.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, enter Staff ID", "Error Occured", 0);
        }
        else {
            try {
                final String QueryString = "SELECT StaffName FROM StaffDataCapture WHERE StaffID =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StaffName FROM StaffDataCapture WHERE StaffID =?");
                pstatement.setString(1, StaffID);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String StaffName = rs.getString(1);
                    this.txtStaffName.setText(StaffName);
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
    
    public void btnCommentAndSave(final ActionEvent evt17) {
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String StaffID = this.txtStaffID.getText().toString();
        final String StaffName = this.txtStaffName.getText().toString();
        final String Comment = this.ComboStaffComment.getSelectedItem().toString();
        final int ID = Integer.parseInt(this.txtID.getText().toString());
        if (term.equals("SELECT TERM") || form.equals("SELECT FORM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select term, form, class, subject or test!", "Error in Test score Data Entry", 0);
        }
        else if (Comment.equals("Select Comment")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, select comment below!", "Error in Test score Data Entry", 0);
        }
        else if (this.txtStaffName.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(this.btnSave, "Please, Search for a staff name", "Error in Test score Data Entry", 0);
        }
        else {
            try {
                final String InsertQueryString = "INSERT INTO caprincipalcomment VALUES (?,?,?,?,?,?,?,?,?)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO caprincipalcomment VALUES (?,?,?,?,?,?,?,?,?)");
                pstatement.setInt(1, ID);
                pstatement.setString(2, RegNum);
                pstatement.setString(3, Name);
                pstatement.setString(4, myclass);
                pstatement.setString(5, term);
                pstatement.setString(6, form);
                pstatement.setString(7, StaffID);
                pstatement.setString(8, StaffName);
                pstatement.setString(9, Comment);
                final int numberOfRowsUpdated = pstatement.executeUpdate();
                pstatement.close();
                JOptionPane.showMessageDialog(this.btnSave, String.valueOf(String.valueOf(StaffName)) + "  says: " + " ' " + Comment + " ' " + " to  " + Name);
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        this.btnPreviewMethod(evt17);
        this.panel.repaint();
    }
    
    public void ComboSelecClassMethod(final ActionEvent evt18) {
        if (evt18.getSource() == this.ComboSelecClass) {
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
}
