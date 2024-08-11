import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
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
import javax.swing.table.TableModel;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class ReportSheetCompilation extends JFrame
{
    String pulledClassName_Eng;
    int accControlCounter;
    String myUsername_From_Authentication_Class;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JComboBox ComboSession;
    private JLabel lblSession;
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
    private JDateChooser picker;
    int result;
    String Position;
    Vector columnNames;
    Vector data;
    private DefaultTableModel tableModel1;
    private JTable table;
    private JTextPane myreportJTP;
    private JTextPane textPane;
    private JScrollPane paneScrollPane;
    
    public ReportSheetCompilation() {
        this.pulledClassName_Eng = "";
        this.accControlCounter = 0;
        this.myUsername_From_Authentication_Class = "";
        this.Hwork = 0.0;
        this.Cwork = 0.0;
        this.CworkRowCount = 0.0;
        this.HworkRowCount = 0.0;
        this.FirstTestCount = 0.0;
        this.SecondTestCount = 0.0;
        this.ThirdTestCount = 0.0;
        this.ExamScoreGlobalVar = 0.0;
        this.result = 0;
        this.Position = "";
        this.columnNames = new Vector();
        this.data = new Vector();
    }
    
    public void ReportSheetCompilation() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        final Font f = new Font("Arial Unicode MS", 1, 18);
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
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
        this.lblSession = new JLabel("SESSION:");
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(f);
        this.ComboSession.setBackground(Color.RED);
        this.ComboSession.setForeground(Color.white);
        (this.ComboSelecClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelecClass.setEditable(false);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        this.ComboSelecClass.setFont(f);
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("FIRST TERM");
        this.ComboTerm.addItem("SECOND TERM");
        this.ComboTerm.addItem("THIRD TERM");
        this.ComboTerm.setFont(f);
        (this.ComboForm = new JComboBox()).addItem("SELECT FORM");
        this.ComboForm.addItem("FORM ONE");
        this.ComboForm.addItem("FORM TWO");
        this.ComboForm.addItem("FORM THREE");
        this.ComboForm.addItem("FORM FOUR");
        this.ComboForm.addItem("FORM FIVE");
        this.ComboForm.addItem("FORM SIX");
        (this.ComboSelectSubj = new JComboBox()).setFont(f);
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
        this.btnSave = new JButton("Compile & Update");
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
        this.TextArea = new JTextArea(6, 48);
        this.ScrollPane = new JScrollPane(this.TextArea, 20, 32);
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
        this.lblmyCA = new JLabel("40%CA:");
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
        this.TextArea = new JTextArea(6, 40);
        this.ScrollPane = new JScrollPane(this.TextArea, 20, 32);
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
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 32);
        ScrollPane.setPreferredSize(new Dimension(630, 280));
        ScrollPane.setEnabled(true);
        ScrollPane.setVisible(true);
        this.txtmyclass = new JTextField();
        this.textPane = this.createTextPane();
        final JScrollPane paneScrollPane = new JScrollPane(this.textPane);
        this.panel.validate();
        this.panel.repaint();
        paneScrollPane.setVerticalScrollBarPolicy(22);
        paneScrollPane.setHorizontalScrollBarPolicy(32);
        paneScrollPane.setPreferredSize(new Dimension(650, 250));
        paneScrollPane.setBackground(Color.cyan);
        this.textPane.insertIcon(new ImageIcon("resultcompilation.png"));
        this.setIconImage(new ImageIcon("icon.jpg").getImage());
        this.textPane.insertComponent(ScrollPane);
        this.textPane.insertComponent(ScrollPane);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(800, 540);
        this.setTitle("Report Sheet Compilation [R.C.] Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.RED);
        this.btnSave.setForeground(Color.WHITE);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.BLACK);
        this.btnClose.setForeground(Color.WHITE);
        this.btnPreview.setBackground(Color.red);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.red);
        this.btnSearch.setBackground(Color.red);
        this.btnPrevious.setBackground(Color.green);
        this.btnGenerateClassTermAnd.setBackground(Color.green);
        this.btnGenerateCAandExamsandTotal.setBackground(Color.green);
        this.btnGenerateGradePositionAndRemarks.setBackground(Color.green);
        this.btnGenerateTatalAverageAndActualPosition.setBackground(Color.green);
        this.addItem(this.panel, this.lblSession, 0, 1, 1, 1, 13);
        this.addItem(this.panel, this.ComboSession, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblClass, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 3, 3, 1, 17);
        this.addItem(this.panel, this.lblTerm, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.ComboTerm, 1, 4, 3, 1, 17);
        this.addItem(this.panel, this.lblSubject, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelectSubj, 1, 6, 3, 1, 17);
        this.addItem(this.panel, this.lbldate, 0, 7, 1, 1, 13);
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
        GenerateCAandExams.add(Box.createHorizontalStrut(5));
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
        GeneradePositionAdnRemarksBox.add(Box.createHorizontalStrut(5));
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
        this.addItem(this.panel, paneScrollPane, 1, 15, 3, 3, 17);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSave);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 1, 22, 1, 2, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                ReportSheetCompilation.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                ReportSheetCompilation.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                ReportSheetCompilation.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                ReportSheetCompilation.this.btnPreviewMethod(evt7);
            }
        });
        this.btnGenerateGradePositionAndRemarks.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnGenerateGradePositionAndRemarksMethod(evt9);
            }
        });
        this.btnGenerateCAandExamsandTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnGenerateCAandExamsandTotal(evt10);
            }
        });
        this.btnCOmputeCHTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnCOmputeCHTotalMethod(evt12);
            }
        });
        this.btnGenerateTatalAverageAndActualPosition.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnGenerateTatalAverageAndActualPositionMethod(evt13);
            }
        });
        this.btnGenerateClassTermAnd.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnGenerateClassTermAndMethod(evt14);
            }
        });
        this.btnSubjectGrading.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnSubjectGaringMethod(evt15);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.btnPreviousMethod(evt16);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                ReportSheetCompilation.this.connectToDB();
                ReportSheetCompilation.this.ComboSelecClassMethod(evt16);
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 1, 11);
                table.setFont(d);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(30);
                return this;
            }
        });
        this.repaint();
        this.fillComboSelecClass();
        this.fillComboSession();
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
    
    private void addStylesToDocument(final StyledDocument doc) {
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
        this.txtRegNum.setText("");
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
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM StudentReg WHERE StdRegNum = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM StudentReg WHERE StdRegNum = ? AND StdClass = ?");
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
        this.txtName.setText("");
        this.txtmyClass.setText("");
        this.txtmyterm.setText("");
        this.txtmyNoinClass.setText("");
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyExamMarks.setText("");
        this.txtmyTotal.setText("");
        this.txtNoInClass.setText("");
        this.txtmyNoinClass.setText("");
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtRegNum.getText().toString());
        this.txtmyclass.setText(myclass);
        try {
            Reg = Integer.parseInt(this.txtRegNum.getText().toString());
            final String R = Integer.toString(++Reg);
            this.txtRegNum.setText(R);
            final String RegNumber = this.txtRegNum.getText().toString();
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentreg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentreg WHERE StdRegNum = ? AND StdClass = ?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myclass);
            final ResultSet rs = pstatement.executeQuery();
            if (!rs.isLast()) {
                rs.next();
                final String Name = rs.getObject(2).toString();
                this.txtName.setText(Name);
                final String Class = rs.getObject(3).toString();
                this.txtClass.setText(Class);
                this.panel.repaint();
                rs.close();
                pstatement.close();
            }
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
        this.txtSubjectTotal.setText("");
        final double ExamScore = 0.0;
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name2 = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
        final String TestScore = this.txtCHTotal.getText().toString();
        final String TestNo = "3RD TEST";
        if (myclass.equals("SELECT CLASS")) {
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
                final String QueryString2 = "SELECT Class,Term FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT Class,Term FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=?");
                pstatement2.setString(1, RegNum);
                pstatement2.setString(2, myclass);
                pstatement2.setString(3, term);
                pstatement2.setString(4, form);
                final ResultSet rs2 = pstatement2.executeQuery();
                while (rs2.next()) {
                    final String MYClass = rs2.getString(1);
                    final String myterm = rs2.getString(2);
                    this.txtmyClass.setText(MYClass);
                    this.txtmyterm.setText(myterm);
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                a2.printStackTrace();
            }
            try {
                final String QueryString2 = "SELECT COUNT(*) Name FROM StudentReg WHERE StdClass =?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT COUNT(*) Name FROM StudentReg WHERE StdClass =?");
                pstatement2.setString(1, myclass);
                final ResultSet rs2 = pstatement2.executeQuery();
                while (rs2.next()) {
                    final double result = rs2.getDouble(1);
                    this.txtmyNoinClass.setText(Double.toString(result));
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a2.getMessage(), "Error occured", 0);
                a2.printStackTrace();
            }
        }
        this.txtmyExamMarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyTotal.setText("");
        if (myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            double myCA = 0.0;
            try {
                final String QueryString3 = "SELECT CA FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT CA FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
                pstatement3.setString(1, RegNum);
                pstatement3.setString(2, myclass);
                pstatement3.setString(3, term);
                pstatement3.setString(4, form);
                pstatement3.setString(5, subj);
                final ResultSet rs3 = pstatement3.executeQuery();
                while (rs3.next()) {
                    myCA = rs3.getDouble(1);
                    this.txtmyCA.setText(Double.toString(myCA));
                }
                rs3.close();
                pstatement3.close();
            }
            catch (SQLException a3) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a3.getMessage(), "Error occured", 0);
                a3.printStackTrace();
            }
            try {
                final String QueryString3 = "SELECT Exam,Total,Grade,Remarks FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement3 = this.connection.prepareStatement("SELECT Exam,Total,Grade,Remarks FROM dataentry WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
                pstatement3.setString(1, RegNum);
                pstatement3.setString(2, myclass);
                pstatement3.setString(3, term);
                pstatement3.setString(4, form);
                pstatement3.setString(5, subj);
                final ResultSet rs3 = pstatement3.executeQuery();
                while (rs3.next()) {
                    final double ExamScores = rs3.getDouble(1);
                    final double total = rs3.getDouble(2);
                    final String grade = rs3.getString(3);
                    final String Remarks = rs3.getString(4);
                    this.txtmyExamMarks.setText(Double.toString(ExamScores));
                    this.txtmyTotal.setText(Double.toString(total));
                    this.txtmyGrade.setText(grade);
                    this.txtmyRemarks.setText(Remarks);
                }
                rs3.close();
                pstatement3.close();
            }
            catch (SQLException a3) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a3.getMessage(), "Error occured", 0);
                a3.printStackTrace();
            }
        }
        ResultSet rs4 = null;
        try {
            final String QueryString4 = "SELECT RegNum,Name, FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentry where subject=? AND Class=? AND Term=? AND Form=?)) As Position FROM dataentry where RegNum=? AND subject=? AND Class=? AND Term=? AND Form=? order by Position";
            final PreparedStatement pstatement4 = this.connection.prepareStatement("SELECT RegNum,Name, FIND_IN_SET(Total, (SELECT GROUP_CONCAT(Total ORDER BY Total DESC) FROM dataentry where subject=? AND Class=? AND Term=? AND Form=?)) As Position FROM dataentry where RegNum=? AND subject=? AND Class=? AND Term=? AND Form=? order by Position");
            pstatement4.setString(1, subj);
            pstatement4.setString(2, myclass);
            pstatement4.setString(3, term);
            pstatement4.setString(4, form);
            pstatement4.setString(5, RegNum);
            pstatement4.setString(6, subj);
            pstatement4.setString(7, myclass);
            pstatement4.setString(8, term);
            pstatement4.setString(9, form);
            rs4 = pstatement4.executeQuery();
            while (rs4.next()) {
                this.RankOrdinalCoverter(this.result = rs4.getInt(3));
            }
            rs4.close();
            this.connection.close();
            pstatement4.close();
        }
        catch (SQLException a4) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a4.getMessage(), "Error occured", 0);
            a4.printStackTrace();
        }
        this.panel.repaint();
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        this.pulledCLassName_ENG();
        this.accessControlMethod();
        String CompilationTableName = "";
        this.pulledCLassName_ENG();
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String myclasse = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final String mySubjectTotal = this.txtSubjectTotal.getText().toString();
        final String Grade = this.txtSubjectGrading.getText().toString();
        final String Remark = this.txtRemark.getText().toString();
        final String myclasses = this.txtmyClass.getText().toString();
        final String myterm = this.txtmyterm.getText().toString();
        final String myNoInClass = this.txtmyNoinClass.getText().toString();
        final String myGrade = this.txtmyGrade.getText().toString();
        final String position = this.txtmySubjPosition.getText().toString();
        final String myremarks = this.txtmyRemarks.getText().toString();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        final String FDate;
        final String Date = FDate = sdf1.format(this.picker.getDate()).toString();
        if (mySession.equals("Select Session")) {
            JOptionPane.showMessageDialog(null, "Please, select Session!", "Error in Result Compilation", 0);
        }
        else if (term.equals("SELECT TERM") || myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select term, form, class, subject or test!", "Error in Result Compilation", 0);
        }
        else if (subj.equals("SELECT SUBJECT")) {
            JOptionPane.showMessageDialog(null, "Please, select subject!", "Error in Result Compilation", 0);
        }
        else if (Date.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter date", "Error in date", 0);
        }
//        else if (this.accControlCounter <= 0) {
//            JOptionPane.showMessageDialog(null, "USERNAME: [ " + this.myUsername_From_Authentication_Class + " ]" + " NOT ENABLED for the Class: " + "[ " + myclass + " ]", "Error occured", 0);
//        }
        else {
            CompilationTableName = this.pulledClassName_Eng.replaceAll("-", "_").replaceAll("\\s","").toLowerCase();
            try {
                final String InsertQueryString = "INSERT INTO compiledreportsheet(ID,RegNum,Name,Subject,Subject_ENG,Date,Class,Term,NoInClass,Grade,Position,Remarks,CA_40,EXAMS_60,Total,Session) SELECT ID,regnum,name,Subject,Subject_ENG,Date,Class,Term,(SELECT count(*) stdname FROM " + CompilationTableName + " WHERE StdClass=?),Grade,Position,Remarks,Test,Exam,Total,Session FROM dataentryacasolarabic where Subject=? AND class=? AND term=? AND Session=? AND RegNum=RegNum AND ID=ID ORDER BY subject " + "ON DUPLICATE KEY UPDATE Grade=VALUES(Grade),Position=VALUES(Position), Remarks=VALUES(Remarks),CA_40=VALUES(CA_40),Exams_60=VALUES(Exams_60),Total=VALUES(Total)";
                final PreparedStatement pstatement = this.connection.prepareStatement(InsertQueryString);
                pstatement.setString(1, myclass);
                pstatement.setString(2, subj);
                pstatement.setString(3, myclass);
                pstatement.setString(4, term);
                pstatement.setString(5, mySession);
                pstatement.executeUpdate();
                pstatement.close();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
                e.printStackTrace();
            }
        }
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
//        if (this.accControlCounter <= 0) {
//            JOptionPane.showMessageDialog(null, "USERNAME: [ " + this.myUsername_From_Authentication_Class + " ]" + " NOT ENABLED for the Class: " + "[ " + myclass + " ]", "Error occured", 0);
//        }
        
            try {
                final String QueryString = "SELECT * FROM compiledreportsheet WHERE Class=? AND term=? AND Subject=? AND Session=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM compiledreportsheet WHERE Class=? AND term=? AND Subject=? AND Session=?");
                pstatement.setString(1, myclass);
                pstatement.setString(2, term);
                pstatement.setString(3, subj);
                pstatement.setString(4, mySession);
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
                this.connection.close();
                pstatement.close();
            }
            catch (Exception e2) {
                System.out.println(e2);
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
        final String RegNum = String.format("%04d", myRegNum);
        final String Name = this.txtName.getText().toString();
        final String Date = String.valueOf(String.valueOf(day)) + "/" + month + "/" + year;
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
        if (this.txtmyCA.getText().equals("") || this.txtName.getText().equals("") || this.txtmyTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (this.txtmyExamMarks.getText().equals("") || this.txtRegNum.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else {
            this.TextArea.append("ACASSOL SOFT.:\n------------------------------------------------------------------------\nCOMPUTERIZED COMPILED RESULT SLIP\n------------------------------------------------------------------------\nFOR SUBJECT: " + subj + "\n" + "------------------------------------------------------------------------" + "\n" + "\n" + "DATE:" + "  " + Date + "\n" + "NAME OF STUDENT:" + "  " + Name + "\n" + "REG. NUMBER:" + "  " + "ALGC/ " + RegNum + "\n" + "CLASS:" + "  " + myclasses + "\n" + "TERM:" + " " + myterm + "\n" + "FORM:" + "  " + form + "\n" + "SUBJECT:  " + subj + "\n" + "NO. IN CLASS:  " + myNoInClass + "\n" + "30%C.A.:  " + CA + "\n" + "EXAM:  " + Exam + "\n" + "TOTAL:  " + total + "\n" + "GRADE OBTAINED:  " + myGrade + "\n" + "REMARK:  " + myremarks + "\n");
            this.TextArea.setEditable(true);
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
        final String TestNo = "1ST TEST";
        if (myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            String myGrade = "";
            String myRemark = "";
            final String SubjTotalStr = this.txtmyTotal.getText().toString();
            final double SubjTotal = Double.parseDouble(SubjTotalStr);
            if (SubjTotal >= 70.0) {
                myGrade = "A";
                myRemark = "Excellent";
            }
            else if (SubjTotal >= 60.0) {
                myGrade = "B";
                myRemark = "Very Good";
            }
            else if (SubjTotal >= 50.0) {
                myGrade = "C";
                myRemark = "Credit";
            }
            else if (SubjTotal >= 45.0) {
                myGrade = "D";
                myRemark = "Pass";
            }
            else if (SubjTotal >= 40.0) {
                myGrade = "E8";
                myRemark = "Pass";
            }
            else if (SubjTotal < 40.0) {
                myGrade = "F";
                myRemark = "Fail";
            }
            else {
                JOptionPane.showMessageDialog(null, "There is no valid entry in column Total!\n", "Error Grading", 0);
            }
            this.txtSubjectGrading.setText("");
            this.txtRemark.setText("");
            this.txtmyGrade.setText(myGrade);
            this.txtmyRemarks.setText(myRemark);
            try {
                final String QueryString = "SELECT position FROM PositionPersubj where regnum=? and class=? and term=? and form=? and subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT position FROM PositionPersubj where regnum=? and class=? and term=? and form=? and subject=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, myclass);
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
        final String TestNo = "1ST TEST";
        if (myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            double myCA = 0.0;
            try {
                final String QueryString = "SELECT CAMarks FROM CA WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT CAMarks FROM CA WHERE RegNum=? and Class=? and Term=? and Form=? and Subject=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myclass);
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
                pstatement.setString(2, myclass);
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
        if (myclass.equals("SELECT CLASS")) {
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
        final String TestNo = "1ST TEST";
        if (myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT ActualPosion FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT ActualPosion FROM RankingAndPositioning WHERE RegNum=? and Class=? and Term=? and Form=?");
                pstatement.setString(1, RegNum);
                pstatement.setString(2, myclass);
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
            pstatement.setString(2, myclass);
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
        final String TestNo = "3RD TEST";
        if (myclass.equals("SELECT CLASS")) {
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
                pstatement.setString(2, myclass);
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
        if (myclass.equals("SELECT CLASS")) {
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
                    if (SubjTototal >= 70.0) {
                        Grade = "A";
                        Remark = "Excellent";
                    }
                    else if (SubjTototal >= 60.0) {
                        Grade = "B";
                        Remark = "Very Good";
                    }
                    else if (SubjTototal >= 50.0) {
                        Grade = "C";
                        Remark = "Credit";
                    }
                    else if (SubjTototal >= 45.0) {
                        Grade = "D";
                        Remark = "Pass";
                    }
                    else if (SubjTototal >= 40.0) {
                        Grade = "E8";
                        Remark = "Pass";
                    }
                    else if (SubjTototal < 40.0) {
                        Grade = "F";
                        Remark = "Fail";
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
    
    public void btnPreviousMethod(final ActionEvent e9) {
        this.txtmyClass.setText("");
        this.txtmyterm.setText("");
        this.txtmyNoinClass.setText("");
        this.txtmyGrade.setText("");
        this.txtmySubjPosition.setText("");
        this.txtmyRemarks.setText("");
        this.txtmyCA.setText("");
        this.txtmyExamMarks.setText("");
        this.txtmyTotal.setText("");
        this.txtName.setText("");
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        int Reg = Integer.parseInt(this.txtRegNum.getText().toString());
        this.txtmyclass.setText(myclass);
        try {
            Reg = Integer.parseInt(this.txtRegNum.getText().toString());
            final String R = Integer.toString(--Reg);
            this.txtRegNum.setText(R);
            final String RegNumber = this.txtRegNum.getText().toString();
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM alcaresreg WHERE StdRegNum = ? AND StdClass = ?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myclass);
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
    
    public void ComboSelecClassMethod(final ActionEvent evt16) {
        if (evt16.getSource() == this.ComboSelecClass) {
            this.ComboSelectSubj.removeAllItems();
            this.fillComboSelectSubj();
            this.panel.validate();
            this.panel.revalidate();
            this.panel.repaint();
            this.panel.repaint();
            this.panel.revalidate();
        }
    }
    
    public void fillComboSelectSubj() {
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString();
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        Label_0306: {
            try {
                this.connectToDB();
                final String QueryString = "SELECT Subject_Ara FROM assign_subject WHERE Classname_Ara = ? ";
                pstatement = this.connection.prepareStatement("SELECT Subject_Ara FROM assign_subject WHERE Classname_Ara = ? ");
                pstatement.setString(1, myClassName_Ara);
                rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String Combosuject_Ara = rs.getString("Subject_Ara");
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
                break Label_0306;
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
    
    public String RankOrdinalCoverter(final int x) {
        this.txtmySubjPosition.setText("");
        if (this.result == 1) {
            this.Position = "1ST";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 2) {
            this.Position = "2ND";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 3) {
            this.Position = "3RD";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 4) {
            this.Position = "4TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 5) {
            this.Position = "5TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 6) {
            this.Position = "6TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 7) {
            this.Position = "7TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 8) {
            this.Position = "8TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 9) {
            this.Position = "9TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 10) {
            this.Position = "10TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 11) {
            this.Position = "11TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 12) {
            this.Position = "12TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 13) {
            this.Position = "13TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 14) {
            this.Position = "14TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 15) {
            this.Position = "15TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 16) {
            this.Position = "16TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 17) {
            this.Position = "17TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 18) {
            this.Position = "18TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 19) {
            this.Position = "19TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 20) {
            this.Position = "20TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 21) {
            this.Position = "21ST";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 22) {
            this.Position = "22ND";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 23) {
            this.Position = "23RD";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 24) {
            this.Position = "24TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 25) {
            this.Position = "25TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 26) {
            this.Position = "26TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 27) {
            this.Position = "27TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 28) {
            this.Position = "28TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 29) {
            this.Position = "29TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 30) {
            this.Position = "30TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 31) {
            this.Position = "31ST";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 32) {
            this.Position = "32ND";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 33) {
            this.Position = "33RD";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 34) {
            this.Position = "34TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 35) {
            this.Position = "35TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 36) {
            this.Position = "36TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 37) {
            this.Position = "37TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 38) {
            this.Position = "38TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 39) {
            this.Position = "39TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 40) {
            this.Position = "40TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 41) {
            this.Position = "41ST";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 42) {
            this.Position = "42ND";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 43) {
            this.Position = "43RD";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 44) {
            this.Position = "44TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 45) {
            this.Position = "45TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 46) {
            this.Position = "46TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 47) {
            this.Position = "47TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 48) {
            this.Position = "48TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 49) {
            this.Position = "49TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 50) {
            this.Position = "50TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 51) {
            this.Position = "51ST";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 52) {
            this.Position = "52ND";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 53) {
            this.Position = "53RD";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 54) {
            this.Position = "54TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 55) {
            this.Position = "55TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 56) {
            this.Position = "56TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 57) {
            this.Position = "57TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 58) {
            this.Position = "58TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 59) {
            this.Position = "59TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 60) {
            this.Position = "60THT";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 61) {
            this.Position = "61ST";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 62) {
            this.Position = "62ND";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 63) {
            this.Position = "63RD";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 64) {
            this.Position = "64TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 65) {
            this.Position = "65TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 66) {
            this.Position = "66TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 67) {
            this.Position = "67TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 68) {
            this.Position = "68TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 69) {
            this.Position = "69TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 70) {
            this.Position = "70THT";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 71) {
            this.Position = "71ST";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 72) {
            this.Position = "72ND";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 73) {
            this.Position = "73RD";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 74) {
            this.Position = "74TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 75) {
            this.Position = "75TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 76) {
            this.Position = "76TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 77) {
            this.Position = "77TH";
            this.txtmySubjPosition.setText(this.Position);
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 78) {
            this.Position = "68TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 79) {
            this.Position = "79TH";
            this.txtmySubjPosition.setText(this.Position);
        }
        else if (this.result == 80) {
            this.Position = "80THT";
            this.txtmySubjPosition.setText(this.Position);
        }
        else {
            this.txtmySubjPosition.setText(Integer.toString(this.result));
        }
        return this.Position;
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
    
    public void accessControlMethod() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        this.myUsername_From_Authentication_Class = AuthenticationWindow.txtUserName.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
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
