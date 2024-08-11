import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.Pageable;
import com.wildcrest.j2printerworks.J2ComponentPrinter;
import com.wildcrest.j2printerworks.J2Printer;
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
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import javax.swing.table.TableModel;
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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class ExamsOverallTotalAndAverage extends JFrame
{
    String pulledClassName_Eng;
    int accControlCounter;
    String myUsername_From_Authentication_Class;
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JComboBox ComboSession;
    private JLabel lblSession;
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
    private JButton btnUpdate;
    private JButton btnClear;
    private JButton btnPrint;
    private JButton btnGetAverage;
    private JButton btnGetNoInClass;
    private JButton btnSubjectTotal;
    private JButton btnOverallTotal;
    private JButton btnCOmputeCHTotal;
    private JButton btnComputeSubjTotal;
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
    private JDateChooser picker;
    Vector columnNames;
    Vector data;
    private DefaultTableModel tableModel1;
    private JTable table;
    private JTextPane myreportJTP;
    private JTextPane textPane;
    private JScrollPane paneScrollPane;
    
    public ExamsOverallTotalAndAverage() {
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
        this.columnNames = new Vector();
        this.data = new Vector();
    }
    
    public void ExamsOverallTotalAndAverage() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        final Font tablefont = new Font(null, 1, 14);
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
        this.lbloverallTotal = new JLabel("OvrllTotal");
        this.lblRemark = new JLabel("REMARK:");
        this.lblSession = new JLabel("SESSION:");
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(f);
        this.ComboSession.setBackground(Color.RED);
        this.ComboSession.setForeground(Color.white);
        (this.ComboSelecClass = new JComboBox()).addItem("SELECT CLASS");
        this.ComboSelecClass.setEditable(false);
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
        this.btnSave = new JButton("Compute & Update");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.btnUpdate = new JButton("Update");
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
        this.btnComputeSubjTotal = new JButton("Compute 100% Total");
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
        this.ComboQueryAllSelectSubj.addItem("Qur\ufffdan");
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
        table.setFont(tablefont);
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 32);
        ScrollPane.setPreferredSize(new Dimension(630, 280));
        ScrollPane.setEnabled(true);
        ScrollPane.setVisible(true);
        this.txtmyclass = new JTextField();
        this.textPane = this.createTextPane();
        final JScrollPane paneScrollPane = new JScrollPane(this.textPane);
        this.panel.validate();
        this.panel.repaint();
        this.panel.setLayout(new GridBagLayout());
        this.panel.validate();
        this.panel.repaint();
        paneScrollPane.setVerticalScrollBarPolicy(22);
        paneScrollPane.setHorizontalScrollBarPolicy(32);
        paneScrollPane.setPreferredSize(new Dimension(650, 250));
        paneScrollPane.setBackground(Color.cyan);
        this.textPane.insertIcon(new ImageIcon("overalltotalandaverage.png"));
        this.setIconImage(new ImageIcon("icon.jpg").getImage());
        this.textPane.insertComponent(ScrollPane);
        this.textPane.insertComponent(ScrollPane);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(755, 499);
        this.setTitle("Examinations Overall Total and Average [E.O.T.A.] Processing Window");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.BLACK);
        this.btnSave.setForeground(Color.WHITE);
        this.btnUpdate.setBackground(Color.BLACK);
        this.btnUpdate.setForeground(Color.WHITE);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnClose.setBackground(Color.blue);
        this.btnClose.setForeground(Color.WHITE);
        this.btnPreview.setBackground(Color.red);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.red);
        this.btnSearch.setBackground(Color.red);
        this.btnPrevious.setBackground(Color.green);
        this.addItem(this.panel, this.lblSession, 0, 1, 1, 1, 13);
        this.addItem(this.panel, this.ComboSession, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblClass, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.ComboSelecClass, 1, 3, 3, 1, 17);
        this.addItem(this.panel, this.lblTerm, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.ComboTerm, 1, 4, 3, 1, 17);
        this.addItem(this.panel, this.lbldate, 0, 7, 1, 1, 13);
        this.addItem(this.panel, (JComponent)this.picker, 1, 7, 1, 1, 17);
        final Box CATestBox = Box.createHorizontalBox();
        CATestBox.add(this.txtOverallTotal);
        CATestBox.add(Box.createHorizontalStrut(5));
        CATestBox.add(Box.createHorizontalStrut(5));
        final Box FirstTestBox = Box.createHorizontalBox();
        FirstTestBox.add(this.txtAverage);
        FirstTestBox.add(Box.createHorizontalStrut(5));
        FirstTestBox.add(Box.createHorizontalStrut(5));
        final Box SecondTestBox = Box.createHorizontalBox();
        SecondTestBox.add(this.txtNoInClass);
        SecondTestBox.add(Box.createHorizontalStrut(5));
        SecondTestBox.add(this.btnGetNoInClass);
        SecondTestBox.add(Box.createHorizontalStrut(5));
        final Box CHTotalBox = Box.createHorizontalBox();
        CHTotalBox.add(this.txtCHTotal);
        CHTotalBox.add(Box.createHorizontalStrut(5));
        CHTotalBox.add(this.btnCOmputeCHTotal);
        CHTotalBox.add(Box.createHorizontalStrut(5));
        final Box OverallTotalBox = Box.createHorizontalBox();
        OverallTotalBox.add(this.txtoverallTotal);
        OverallTotalBox.add(Box.createHorizontalStrut(5));
        OverallTotalBox.add(this.OverallTotal);
        OverallTotalBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel, paneScrollPane, 1, 17, 3, 3, 17);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSave);
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
                ExamsOverallTotalAndAverage.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                ExamsOverallTotalAndAverage.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                ExamsOverallTotalAndAverage.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                ExamsOverallTotalAndAverage.this.btnPreviewMethod(evt7);
            }
        });
        this.btnGetAverage.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnGetAverageMethod(evt9);
            }
        });
        this.btnGetNoInClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnGetNoInClassMethod(evt10);
            }
        });
        this.btnCOmputeCHTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnCOmputeCHTotalMethod(evt12);
            }
        });
        this.btnOverallTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnOverallTotalMethod(evt13);
            }
        });
        this.btnComputeSubjTotal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e14) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt14) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnComputeSubjTotalMethod(evt14);
            }
        });
        this.btnSubjectGrading.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e15) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt15) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnSubjectGaringMethod(evt15);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnPreviousMethod(evt16);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.ComboSelecClassMethod(evt16);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e16) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt16) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.ComboSelecClassMethod(evt16);
            }
        });
        this.btnUpdate.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e17) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt17) {
                ExamsOverallTotalAndAverage.this.connectToDB();
                ExamsOverallTotalAndAverage.this.btnUpdateMethod(evt17);
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
        this.fillCoboSelectClass();
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
            JOptionPane.showMessageDialog(null, "database connectivity error", "database connectivity error\n" + e2.getMessage(), 0);
            e2.printStackTrace();
        }
        catch (IllegalAccessException e3) {
            JOptionPane.showMessageDialog(null, "database connectivity error", "database connectivity error\n" + e3.getMessage(), 0);
            e3.printStackTrace();
        }
        catch (ClassNotFoundException e4) {
            JOptionPane.showMessageDialog(null, "database connectivity error", "database connectivity error\n" + e4.getMessage(), 0);
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
                final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM studentReg WHERE StdRegNum = ? AND StdClass = ?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM studentReg WHERE StdRegNum = ? AND StdClass = ?");
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
        String RegNumber = this.txtRegNum.getText().toString();
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        final String TestNo = "1ST TEST";
        this.txtName.setText("");
        int Reg = Integer.parseInt(this.txtRegNum.getText().toString());
        this.txtmyclass.setText(myClass);
        try {
            Reg = Integer.parseInt(this.txtRegNum.getText().toString());
            final String R = Integer.toString(++Reg);
            this.txtRegNum.setText(R);
            RegNumber = this.txtRegNum.getText().toString();
            System.out.print(R);
            final String QueryString = "SELECT StdRegNum,StdName,StdClass FROM StudentReg WHERE StdRegNum = ? AND StdClass = ?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT StdRegNum,StdName,StdClass FROM StudentReg WHERE StdRegNum = ? AND StdClass = ?");
            pstatement.setString(1, RegNumber);
            pstatement.setString(2, myClass);
            final ResultSet rs = pstatement.executeQuery();
            if (!rs.isLast()) {
                rs.next();
                final String myName = rs.getObject(2).toString();
                this.txtName.setText(myName);
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
        this.txtOverallTotal.setText("");
        this.txtAverage.setText("");
        this.txtNoInClass.setText("");
        this.txtSubjectTotal.setText("");
        this.txtCHTotal.setText("");
        this.txtCHTotal.setText("");
        this.txtoverallTotal.setText("");
        this.TextArea.setText("");
        this.panel.repaint();
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString2 = "SELECT SUM(Total) FROM DataEntry WHERE RegNum =? AND Term =? AND Form =? AND Class=?";
                final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT SUM(Total) FROM DataEntry WHERE RegNum =? AND Term =? AND Form =? AND Class=?");
                pstatement2.setString(1, RegNumber);
                pstatement2.setString(2, term);
                pstatement2.setString(3, form);
                pstatement2.setString(4, myclass);
                final ResultSet rs2 = pstatement2.executeQuery();
                while (rs2.next()) {
                    final double ExamsSum;
                    final double OverallTotal = ExamsSum = rs2.getDouble(1);
                    this.txtOverallTotal.setText(String.format("%.2f", OverallTotal));
                }
                rs2.close();
                pstatement2.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
        }
        this.txtAverage.setText("");
        try {
            final String QueryString2 = "SELECT COUNT(*) Subject FROM DataEntry WHERE RegNum = ? AND Term =? AND Form =?  AND Class=?";
            final PreparedStatement pstatement2 = this.connection.prepareStatement("SELECT COUNT(*) Subject FROM DataEntry WHERE RegNum = ? AND Term =? AND Form =?  AND Class=?");
            pstatement2.setString(1, RegNumber);
            pstatement2.setString(2, term);
            pstatement2.setString(3, form);
            pstatement2.setString(4, myclass);
            final ResultSet rs2 = pstatement2.executeQuery();
            final int Regn = 0;
            while (rs2.next()) {
                final double SubjectTotal = rs2.getDouble(1);
                final double Total = Double.parseDouble(this.txtOverallTotal.getText().toString());
                final double Average = Total / SubjectTotal;
                this.txtAverage.setText(String.format("%.2f", Average));
            }
            rs2.close();
            pstatement2.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        this.pulledCLassName_ENG();
        this.accessControlMethod();
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String mySession = this.ComboSession.getSelectedItem().toString();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        final String FDate;
        final String Date = FDate = sdf1.format(this.picker.getDate()).toString();
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final String myAverage = this.txtAverage.getText().toString();
        if (mySession.equalsIgnoreCase("Select Session")) {
            JOptionPane.showMessageDialog(null, "Please, select the current session!", "Error in Session Data Entry", 0);
        }
        else if (myclass.equalsIgnoreCase("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Pls, select class!", "Error Occured", 0);
        }
        else if (term.equalsIgnoreCase("SELECT TERM")) {
            JOptionPane.showMessageDialog(null, "Pls, select term!", "Error Occured", 0);
        }
//        else if (this.accControlCounter <= 0) {
//            JOptionPane.showMessageDialog(null, "USERNAME: [ " + this.myUsername_From_Authentication_Class + " ]" + " NOT ENABLED for the Class: " + "[ " + myclass + " ]", "Error occured", 0);
//        }
        else {
            try {
                final String InsertQueryString = "INSERT INTO overalltotalandaverageacasolarabic(ID,RegNum,Name,Class,Term,Date,OvrllTotal,Average, Session) SELECT t.ID,t.RegNum,t.Name,t.Class,t.Term,t.Date,sum(total),avg(total),Session FROM dataentryacasolarabic t WHERE class=? AND term=? AND Session=? AND RegNum=t.RegNum AND ID=t.ID GROUP BY RegNum ON DUPLICATE KEY UPDATE OvrllTotal=VALUES(OvrllTotal), Average=VALUES(Average)";
                final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO overalltotalandaverageacasolarabic(ID,RegNum,Name,Class,Term,Date,OvrllTotal,Average, Session) SELECT t.ID,t.RegNum,t.Name,t.Class,t.Term,t.Date,sum(total),avg(total),Session FROM dataentryacasolarabic t WHERE class=? AND term=? AND Session=? AND RegNum=t.RegNum AND ID=t.ID GROUP BY RegNum ON DUPLICATE KEY UPDATE OvrllTotal=VALUES(OvrllTotal), Average=VALUES(Average)");
                pstatement.setString(1, myclass);
                pstatement.setString(2, term);
                pstatement.setString(3, mySession);
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
       
        
            try {
                final String QueryString = "SELECT * FROM overalltotalandaverageacasolarabic WHERE Class=? AND term=? AND Session=? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM overalltotalandaverageacasolarabic WHERE Class=? AND term=? AND Session=? ");
                pstatement.setString(1, myclass);
                pstatement.setString(2, term);
                pstatement.setString(3, mySession);
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
    
    public void btnUpdateMethod(final ActionEvent evt17) {
        final String term = (String)this.ComboTerm.getSelectedItem();
        final String form = (String)this.ComboForm.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String subj = (String)this.ComboSelectSubj.getSelectedItem();
        final String day = (String)this.ComboDay.getSelectedItem();
        final String month = (String)this.ComboMonth.getSelectedItem();
        final String year = (String)this.ComboYear.getSelectedItem();
        final String RegNum = this.txtRegNum.getText().toString();
        final String Name = this.txtName.getText().toString();
        final SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        final String FDate;
        final String Date = FDate = sdf1.format(this.picker.getDate()).toString();
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "UPDATE OverallTotalAndAverage SET RegNum=?, Name=?, Class=?, Term=?, Form=?, Date=?, OvrllTotal=?, Average=? where RegNum=?";
            final PreparedStatement pstatement = this.connection.prepareStatement("UPDATE OverallTotalAndAverage SET RegNum=?, Name=?, Class=?, Term=?, Form=?, Date=?, OvrllTotal=?, Average=? where RegNum=?");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            pstatement.setString(9, RegNum);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been updated, for Term: " + term + " . For " + Name + "\n");
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        if (this.txtAverage.getText().equals("") || this.txtName.getText().equals("") || this.txtRegNum.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else if (this.txtOverallTotal.getText().equals("") || this.txtRegNum.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Some textboxes are empty, check and fill the required data", "Error in Test score Data Entry", 0);
        }
        else {
            this.TextArea.append("ACASSOL SOFT:\n------------------------------------------------------------------------\nCOMPUTERIZED OVERALL TOTAL AND AVERAGE SLIP\n------------------------------------------------------------------------+\n\nDATE:  " + Date + "\n" + "NAME OF STUDENT:" + "  " + Name + "\n" + "REG. NUMBER:" + "  " + "ALGC/ " + RegNum + "\n" + "CLASS:" + "  " + myclass + "\n" + "TERM:" + " " + term + "\n" + "FORM:" + "  " + form + "\n" + "OVERALL TOTAL MARKS:" + "  " + OverallTotall + "\n" + "AVERAGE MARKS:" + "  " + Average + "\n");
            this.TextArea.setEditable(true);
        }
    }
    
    public void btnGetAverageMethod(final ActionEvent e9) {
        this.txtAverage.setText("");
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
                final String QueryString = "SELECT COUNT(*) Subject FROM TestDataEntry WHERE TestDataEntry.RegNum = ? AND TestDataEntry.Term =? AND TestDataEntry.Form =? AND TestDataEntry.TESTNO = ? AND Class=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) Subject FROM TestDataEntry WHERE TestDataEntry.RegNum = ? AND TestDataEntry.Term =? AND TestDataEntry.Form =? AND TestDataEntry.TESTNO = ? AND Class=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, "1ST TEST");
                pstatement.setString(5, myclass);
                final ResultSet rs = pstatement.executeQuery();
                final int Reg = 0;
                while (rs.next()) {
                    final double SubjectTotal = rs.getDouble(1);
                    final double Total = Double.parseDouble(this.txtOverallTotal.getText().toString());
                    final double Average = Total / SubjectTotal;
                    this.txtAverage.setText(String.format("%.2f", Average));
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT COUNT(*) TestScore FROM TestDataEntry WHERE TestDataEntry.RegNum = ? AND TestDataEntry.Term =? AND TestDataEntry.Form =? AND TestDataEntry.Subject =? AND TestDataEntry.TESTNO = ? AND Class=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) TestScore FROM TestDataEntry WHERE TestDataEntry.RegNum = ? AND TestDataEntry.Term =? AND TestDataEntry.Form =? AND TestDataEntry.Subject =? AND TestDataEntry.TESTNO = ? AND Class=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, subj);
                pstatement.setString(5, "1ST TEST");
                pstatement.setString(6, myclass);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double result = rs.getDouble(1);
                    this.FirstTestCount = result;
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
    
    public void btnGetNoInClassMethod(final ActionEvent e10) {
        this.txtNoInClass.setText("");
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
        final String TestN02 = "2ND TEST";
        if (myClass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select a class", "Class Selection Error", 0);
        }
        else {
            try {
                final String QueryString = "SELECT COUNT(*) StdName FROM ALCARESREG WHERE StdClass =?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT COUNT(*) StdName FROM ALCARESREG WHERE StdClass =?");
                pstatement.setString(1, myclass);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double result = rs.getDouble(1);
                    this.txtNoInClass.setText(Double.toString(result));
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
    
    public void btnOverallTotalMethod(final ActionEvent evt13) {
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
                final String QueryString = "SELECT SUM(ExamScore) FROM ExamDataEntry WHERE RegNum =? AND Term =? AND Form =? AND Class=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SUM(ExamScore) FROM ExamDataEntry WHERE RegNum =? AND Term =? AND Form =? AND Class=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, myclass);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double ExamScore = rs.getDouble(1);
                    this.ExamScoreGlobalVar = ExamScore;
                }
                rs.close();
                pstatement.close();
            }
            catch (SQLException a) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
                a.printStackTrace();
            }
            try {
                final String QueryString = "SELECT SUM(CAmarks) FROM CA WHERE RegNum =? AND Term =? AND Form =? AND Class=?";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT SUM(CAmarks) FROM CA WHERE RegNum =? AND Term =? AND Form =? AND Class=?");
                pstatement.setString(1, RegNumber);
                pstatement.setString(2, term);
                pstatement.setString(3, form);
                pstatement.setString(4, myclass);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final double MyCA = rs.getDouble(1);
                    final double OverallTotal = this.ExamScoreGlobalVar + MyCA;
                    this.txtOverallTotal.setText(String.format("%.2f", OverallTotal));
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
    
    public void btnComputeSubjTotalMethod(final ActionEvent evt14) {
        this.txtSubjectTotal.setText("");
        double ExamScore = 0.0;
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
                    final double SubjTotal = ExamScore + CAresult;
                    this.txtSubjectTotal.setText(Double.toString(SubjTotal));
                    System.out.print(SubjTotal);
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
    
    public void btnPreviousMethod(final ActionEvent e16) {
        this.txtmyclass.setText("");
        this.txtName.setText("");
        this.txtOverallTotal.setText("");
        this.txtAverage.setText("");
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
    
    public void ExamOverallTotalTerm1JSS1BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1JSS1Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1JSS1Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2JSS1BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2JSS1Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2JSS1Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3JSS1BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3JSS1Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3JSS1Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1JSS1PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1JSS1Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1JSS1Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2JSS1PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2JSS1Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2JSS1Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3JSS1PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3JSS1Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3JSS1Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1JSS2BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1JSS2Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1JSS2Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2JSS2BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2JSS2Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2JSS2Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3JSS2BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3JSS2Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3JSS2Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1JSS2PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1JSS2Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1JSS2Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2JSS2PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2JSS2Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2JSS2Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3JSS2PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3JSS2Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3JSS2Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1JSS3BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1JSS3Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1JSS3Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2JSS3BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2JSS3Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2JSS3Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3JSS3BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3JSS3Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3JSS3Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1JSS3PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1JSS3Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1JSS3Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2JSS3PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2JSS3Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2JSS3Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3JSS3PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3JSS3Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3JSS3Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1SSS1BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1SSS1Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1SSS1Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2SSS1BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2SSS1Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2SSS1Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3SSS1BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3SSS1Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3SSS1Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1SSS1PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1SSS1Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1SSS1Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2SSS1PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2SSS1Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2SSS1Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3SSS1PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3SSS1Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3SSS1Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1SSS2BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1SSS2Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1SSS2Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2SSS2BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2SSS2Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2SSS2Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3SSS2BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3SSS2Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3SSS2Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1SSS2PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1SSS2Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1SSS2Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2SSS2PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2SSS2Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2SSS2Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3SSS2PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3SSS2Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3SSS2Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1SSS3BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1SSS3Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1SSS3Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2SSS3BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2SSS3Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2SSS3Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3SSS3BlueMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3SSS3Blue VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3SSS3Blue VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm1SSS3PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm1SSS3Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm1SSS3Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm2SSS3PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm2SSS3Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm2SSS3Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ExamOverallTotalTerm3SSS3PinkMethod() {
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
        final String myOverallTotall = this.txtOverallTotal.getText().toString();
        final double OverallTotall = Double.parseDouble(myOverallTotall);
        final String myAverage = this.txtAverage.getText().toString();
        final double Average = Double.parseDouble(myAverage);
        try {
            final String InsertQueryString = "INSERT INTO OverallTotalAndAverageTerm3SSS3Pink VALUES (?,?,?,?,?,?,?,?)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO OverallTotalAndAverageTerm3SSS3Pink VALUES (?,?,?,?,?,?,?,?)");
            pstatement.setString(1, RegNum);
            pstatement.setString(2, Name);
            pstatement.setString(3, myclass);
            pstatement.setString(4, term);
            pstatement.setString(5, form);
            pstatement.setString(6, Date);
            pstatement.setDouble(7, OverallTotall);
            pstatement.setDouble(8, Average);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            this.connection.close();
            pstatement.close();
            JOptionPane.showMessageDialog(this.btnSave, "Overall Total and Average have been stored for Term: " + term + " . For " + Name + "\n");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this.btnSave, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void ComboSelecClassMethod(final ActionEvent evt16) {
        if (evt16.getSource() == this.ComboSelecClass) {
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
    
    public void fillCoboSelectClass() {
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
    
    public void pulledCLassName_ENG() {
        ResultSet rs = null;
        PreparedStatement pstatement = null;
        final String myClassName_Ara = this.ComboSelecClass.getSelectedItem().toString();
        Label_0244: {
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
                break Label_0244;
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
