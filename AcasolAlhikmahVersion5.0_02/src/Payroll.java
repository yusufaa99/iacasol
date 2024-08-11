import javax.swing.text.Style;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.Pageable;
import com.wildcrest.j2printerworks.J2ComponentPrinter;
import com.wildcrest.j2printerworks.J2Printer;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.border.Border;
import java.awt.Font;
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
import java.awt.Color;
import java.awt.Component;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
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

public class Payroll extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JPanel panel2;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblID;
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
    private JLabel lblSelectTest;
    private JTextField txtStaffID;
    private JTextField txtStaffNo;
    private JTextField txtStaffName;
    private JTextField txtStafftCategory;
    private JTextField txtStafftPosition;
    private JComboBox ComboPayrollFortheMonthOF;
    private JTextField txtPayrollMonth;
    private JComboBox ComboPayrollYear;
    private JLabel lblOutput;
    private JTextField txtID;
    private JTextField txtRegNum;
    private JTextField txtName;
    private JTextField txtClass;
    private JTextField txtDaysAttended;
    private JTextField txtMaxNoOfDays;
    private JTextField txtTest1Marks;
    private JTextField txtTest2Marks;
    private JTextField txtExamMarks;
    private JTextField txtHouse;
    private JLabel lblStaffID;
    private JLabel lblStaffNo;
    private JLabel lblStaffName;
    private JLabel lblStafftCategory;
    private JLabel lblStafftPosition;
    private JLabel lblPayrollFortheMonthOF;
    private JLabel lblPayrollMonth;
    private JLabel lblPayrollYear;
    private JLabel lblStaffSalary;
    private JLabel lblStaffSalaryIncrement;
    private JLabel lblStaffAllowance1;
    private JLabel lblStaffAllowance1Description;
    private JLabel lblStaffAllowance2;
    private JLabel lblStaffAllowance2Description;
    private JLabel lblStaffDeduction1;
    private JLabel lblStaffDeduction1Description;
    private JLabel lblStaffDeduction2;
    private JLabel lblStaffDeduction2Description;
    private JLabel lblStaffNetSalary;
    private JTextField txtStaffSalary;
    private JTextField txtStaffSalaryIncrement;
    private JTextField txtStaffAllowance1;
    private JTextField txtStaffAllowance1Description;
    private JTextField txtStaffAllowance2;
    private JTextField txtStaffAllowance2Description;
    private JTextField txtStaffDeduction1;
    private JTextField txtStaffDeduction1Description;
    private JTextField txtStaffDeduction2;
    private JTextField txtStaffDeduction2Description;
    private JTextField txtStaffNetSalary;
    private JTextField txtHomeWork;
    private JLabel lblHomeWork;
    private JLabel lblTest1Marks;
    private JLabel lblTest2Marks;
    private JLabel lblExamMarks;
    private JLabel lblDaysAttended;
    private JLabel lblMaxNoOfDays;
    private JLabel lblHouse;
    private JLabel lblBehavior;
    private JLabel lblRate;
    private JComboBox ComboSelectBehaviour;
    private JComboBox ComboSelectRate;
    private JComboBox ComboTerm;
    private JComboBox ComboForm;
    private JComboBox ComboSelecClass;
    private JComboBox ComboSelectSubj;
    private JComboBox ComboDay;
    private JComboBox ComboMonth;
    private JComboBox ComboYear;
    private JComboBox ComboWeekNumber;
    private JComboBox comboTest;
    private JButton btnPreview;
    private JButton btnViewInfo;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnPrint;
    private JButton btnPrepare;
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
    private JLabel lblTest1Percentage;
    private JLabel lblTest2Percentage;
    private JLabel lblHomeWorkPercentage;
    private JLabel lblExamPercentage;
    private DefaultTableModel tableModel1;
    Vector columnNames;
    Vector data;
    private JTable table;
    private JScrollPane myreportJSP;
    private JTextPane myreportJTP;
    private JTextPane textPane;
    private JScrollPane paneScrollPane;
    private JDateChooser picker;
    int flag;
    int result;
    
    public Payroll() {
        this.columnNames = new Vector();
        this.data = new Vector();
        this.flag = 0;
        this.result = 0;
    }
    
    public void Payroll() {
        (this.picker = new JDateChooser()).setDate(Calendar.getInstance().getTime());
        this.picker.setDateFormatString("yyyy-MM-dd");
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblID = new JLabel("STUDENT ID:");
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
        this.lblSelectTest = new JLabel("SELECT TEST:");
        this.lblHomeWork = new JLabel("HOMEWORK:");
        this.lblTest1Marks = new JLabel("TEST1 SCORE: ");
        this.lblTest2Marks = new JLabel("TEST2 SCORE: ");
        this.lblExamMarks = new JLabel("EXAMINATION SCORE: ");
        this.lblMaxNoOfDays = new JLabel("MAX. NO. OF DAYS: ");
        this.lblDaysAttended = new JLabel("DAYS ATTENDED: ");
        this.lblHouse = new JLabel("HOUSE: ");
        this.lblStaffSalary = new JLabel("SALARY: ");
        this.lblStaffSalaryIncrement = new JLabel("SALARY INCREMENT: ");
        this.lblStaffAllowance1 = new JLabel("ALLOWANCE1: ");
        this.lblStaffAllowance1Description = new JLabel("DESCRIPTION: ");
        this.lblStaffAllowance2 = new JLabel("ALLOWANCE2: ");
        this.lblStaffAllowance2Description = new JLabel("DESCRIPTION: ");
        this.lblStaffDeduction1 = new JLabel("DEDUCTION1: ");
        this.lblStaffDeduction1Description = new JLabel("DESCRIPTION: ");
        this.lblStaffDeduction2 = new JLabel("DEDUCTION2: ");
        this.lblStaffDeduction2Description = new JLabel("DESCRIPTION: ");
        this.lblStaffNetSalary = new JLabel("NET SALARY :  N");
        this.txtStaffSalary = new JTextField(8);
        this.txtStaffSalaryIncrement = new JTextField("0", 8);
        this.txtStaffAllowance1 = new JTextField("0", 8);
        this.txtStaffAllowance1Description = new JTextField(8);
        this.txtStaffAllowance2 = new JTextField("0", 8);
        this.txtStaffAllowance2Description = new JTextField(8);
        this.txtStaffDeduction1 = new JTextField("0", 8);
        this.txtStaffDeduction1Description = new JTextField(8);
        this.txtStaffDeduction2 = new JTextField("0", 8);
        this.txtStaffDeduction2Description = new JTextField(8);
        this.txtStaffNetSalary = new JTextField("0", 8);
        this.txtHomeWork = new JTextField(5);
        this.txtTest1Marks = new JTextField(5);
        this.txtTest2Marks = new JTextField(5);
        this.txtExamMarks = new JTextField(5);
        this.txtHouse = new JTextField(12);
        this.txtDaysAttended = new JTextField(5);
        this.txtMaxNoOfDays = new JTextField(5);
        this.lblBehavior = new JLabel("BEHAVIOUR:");
        this.lblRate = new JLabel("RATING :");
        this.lblOutput = new JLabel("OUTPUT SEGMENT:");
        this.txtID = new JTextField(7);
        (this.txtRegNum = new JTextField(16)).setEditable(false);
        this.txtName = new JTextField(25);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtStaffID = new JTextField(7);
        this.txtStaffNo = new JTextField(16);
        this.txtStaffName = new JTextField(25);
        this.txtStafftCategory = new JTextField(20);
        this.txtStafftPosition = new JTextField(25);
        this.txtStaffNo.setEditable(false);
        this.txtStaffName.setEditable(false);
        this.txtStafftCategory.setEditable(false);
        this.txtStafftPosition.setEditable(false);
        this.txtStaffSalary.setEditable(false);
        (this.ComboPayrollFortheMonthOF = new JComboBox()).addItem("SELECT MONTH");
        this.ComboPayrollFortheMonthOF.addItem("JANUARY");
        this.ComboPayrollFortheMonthOF.addItem("FEBRUARY");
        this.ComboPayrollFortheMonthOF.addItem("MARCH");
        this.ComboPayrollFortheMonthOF.addItem("APRILL");
        this.ComboPayrollFortheMonthOF.addItem("MAY");
        this.ComboPayrollFortheMonthOF.addItem("JUNE");
        this.ComboPayrollFortheMonthOF.addItem("JULY");
        this.ComboPayrollFortheMonthOF.addItem("AUGUST");
        this.ComboPayrollFortheMonthOF.addItem("SEPTEMBER");
        this.ComboPayrollFortheMonthOF.addItem("OCTOBER");
        this.ComboPayrollFortheMonthOF.addItem("NOVEMBER");
        this.ComboPayrollFortheMonthOF.addItem("DECEMBER");
        (this.ComboPayrollYear = new JComboBox()).addItem("SELECT YEAR");
        this.ComboPayrollYear.addItem("2016");
        this.ComboPayrollYear.addItem("2017");
        this.ComboPayrollYear.addItem("2018");
        this.ComboPayrollYear.addItem("2019");
        this.ComboPayrollYear.addItem("2020");
        this.ComboPayrollYear.addItem("JUNE");
        this.ComboPayrollYear.addItem("JULY");
        this.ComboPayrollYear.setEditable(true);
        this.lblStaffID = new JLabel("STAFF ID: ");
        this.lblStaffNo = new JLabel("STAFF NO: ");
        this.lblStaffName = new JLabel("STAFF NAME: ");
        this.lblStafftCategory = new JLabel("CATEGORY: ");
        this.lblStafftPosition = new JLabel("POSITION: ");
        this.lblPayrollFortheMonthOF = new JLabel("PAYROLL FOR THE MONTH OF: ");
        this.lblPayrollYear = new JLabel("YEAR: ");
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
        (this.ComboSelectBehaviour = new JComboBox()).addItem("SELECT BEHAVIOUR");
        this.ComboSelectBehaviour.addItem("Punctuality");
        this.ComboSelectBehaviour.addItem("Attendance");
        this.ComboSelectBehaviour.addItem("Nestness");
        this.ComboSelectBehaviour.addItem("Politeness");
        this.ComboSelectBehaviour.addItem("Assignment");
        this.ComboSelectBehaviour.addItem("Class Participation");
        this.ComboSelectBehaviour.addItem("Rel. with Staff");
        this.ComboSelectBehaviour.addItem("Wilingness to Learn");
        (this.ComboSelectRate = new JComboBox()).addItem("SELECT RATING");
        this.ComboSelectRate.addItem("RATE 1");
        this.ComboSelectRate.addItem("RATE 2");
        this.ComboSelectRate.addItem("RATE 3");
        this.ComboSelectRate.addItem("RATE 4");
        this.ComboSelectRate.addItem("RATE 5");
        this.btnPreview = new JButton("Preview");
        this.btnViewInfo = new JButton("ViewInfo");
        this.btnSave = new JButton("Save");
        this.btnClear = new JButton("Clear");
        this.btnPrint = new JButton("Print");
        this.btnPrepare = new JButton("Prepare Payroll");
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
        this.txtmyclass = new JTextField();
        this.lblHomeWorkPercentage = new JLabel("10%");
        this.lblTest2Percentage = new JLabel("15%");
        this.lblTest1Percentage = new JLabel("15%");
        this.lblExamPercentage = new JLabel("60%");
        this.lblHomeWorkPercentage.setForeground(Color.red);
        this.lblTest1Percentage.setForeground(Color.red);
        this.lblTest2Percentage.setForeground(Color.red);
        this.lblHomeWorkPercentage.setForeground(Color.red);
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
        final JScrollPane ScrollPane = new JScrollPane(table, 22, 32);
        ScrollPane.setPreferredSize(new Dimension(900, 280));
        ScrollPane.setEnabled(true);
        ScrollPane.setVisible(true);
        this.panel.validate();
        this.panel.repaint();
        this.myreportJTP = new JTextPane();
        this.textPane = this.createTextPane();
        final JScrollPane paneScrollPane = new JScrollPane(this.textPane);
        this.panel.validate();
        this.panel.repaint();
        paneScrollPane.setVerticalScrollBarPolicy(22);
        paneScrollPane.setHorizontalScrollBarPolicy(32);
        paneScrollPane.setPreferredSize(new Dimension(900, 180));
        paneScrollPane.setBackground(Color.cyan);
        this.textPane.insertIcon(new ImageIcon("payroll.png"));
        this.setIconImage(new ImageIcon("icon.jpg").getImage());
        this.textPane.insertComponent(ScrollPane);
        this.textPane.insertComponent(ScrollPane);
        final Border TB = new TitledBorder("Staff Payroll Section");
        this.panel2.setBorder(TB);
        this.panel.setLayout(new GridBagLayout());
        this.panel2.setLayout(new GridBagLayout());
        this.panel2.setBackground(Color.GREEN);
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1050, 745);
        this.setTitle("Payroll Windoow");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange);
        this.btnSave.setBackground(Color.BLUE);
        this.btnSave.setForeground(Color.WHITE);
        this.btnClear.setBackground(Color.red);
        this.btnClose.setBackground(Color.red);
        this.btnPreview.setBackground(Color.BLACK);
        this.btnPreview.setForeground(Color.CYAN);
        this.btnViewInfo.setBackground(Color.BLACK);
        this.btnViewInfo.setForeground(Color.WHITE);
        this.btnPrint.setBackground(Color.red);
        this.btnNext.setBackground(Color.BLACK);
        this.btnNext.setForeground(Color.CYAN);
        this.btnPrepare.setBackground(Color.RED);
        this.btnPrepare.setForeground(Color.WHITE);
        this.btnSearch.setBackground(Color.red);
        this.btnSearch.setBackground(Color.BLACK);
        this.btnSearch.setForeground(Color.CYAN);
        this.btnPrevious.setBackground(Color.green);
        this.addItem(this.panel, this.lblStaffID, 0, 1, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffID, 1, 1, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffNo, 0, 2, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffNo, 1, 2, 1, 1, 17);
        this.addItem(this.panel, this.lblStaffName, 0, 3, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffName, 1, 3, 2, 1, 17);
        this.addItem(this.panel, this.lblStafftCategory, 0, 4, 1, 1, 13);
        this.addItem(this.panel, this.txtStafftCategory, 1, 4, 3, 1, 17);
        this.addItem(this.panel, this.lblStafftPosition, 0, 5, 1, 1, 13);
        this.addItem(this.panel, this.txtStafftPosition, 1, 5, 3, 1, 17);
        this.addItem(this.panel, this.lblStaffSalary, 0, 6, 1, 1, 13);
        this.addItem(this.panel, this.txtStaffSalary, 1, 6, 3, 1, 17);
        this.addItem(this.panel, this.panel2, 1, 7, 2, 2, 17);
        this.addItem(this.panel2, this.lblPayrollFortheMonthOF, 0, 1, 1, 1, 13);
        this.addItem(this.panel2, this.ComboPayrollFortheMonthOF, 1, 1, 3, 1, 17);
        this.addItem(this.panel2, this.lblPayrollYear, 0, 2, 1, 1, 13);
        this.addItem(this.panel2, this.ComboPayrollYear, 1, 2, 3, 1, 17);
        this.addItem(this.panel2, this.lblStaffSalaryIncrement, 0, 3, 1, 1, 13);
        this.addItem(this.panel2, this.txtStaffSalaryIncrement, 1, 3, 3, 1, 17);
        this.addItem(this.panel2, this.lblStaffAllowance1, 0, 4, 1, 1, 13);
        final Box AllowanceBox = Box.createHorizontalBox();
        AllowanceBox.add(Box.createHorizontalStrut(5));
        AllowanceBox.add(this.txtStaffAllowance1);
        AllowanceBox.add(Box.createHorizontalStrut(5));
        AllowanceBox.add(this.lblStaffAllowance1Description);
        AllowanceBox.add(Box.createHorizontalStrut(8));
        AllowanceBox.add(this.txtStaffAllowance1Description);
        AllowanceBox.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, AllowanceBox, 1, 4, 3, 1, 17);
        this.addItem(this.panel2, this.lblStaffAllowance2, 0, 5, 1, 1, 13);
        final Box Allowan2Box = Box.createHorizontalBox();
        Allowan2Box.add(Box.createHorizontalStrut(5));
        Allowan2Box.add(this.txtStaffAllowance2);
        Allowan2Box.add(Box.createHorizontalStrut(5));
        Allowan2Box.add(this.lblStaffAllowance2Description);
        Allowan2Box.add(Box.createHorizontalStrut(8));
        Allowan2Box.add(this.txtStaffAllowance2Description);
        Allowan2Box.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, Allowan2Box, 1, 5, 3, 1, 17);
        this.addItem(this.panel2, this.lblStaffDeduction1, 0, 6, 1, 1, 13);
        final Box DeductionBox = Box.createHorizontalBox();
        DeductionBox.add(Box.createHorizontalStrut(5));
        DeductionBox.add(this.txtStaffDeduction1);
        DeductionBox.add(Box.createHorizontalStrut(5));
        DeductionBox.add(this.lblStaffDeduction1Description);
        DeductionBox.add(Box.createHorizontalStrut(8));
        DeductionBox.add(this.txtStaffDeduction1Description);
        DeductionBox.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, DeductionBox, 1, 6, 3, 1, 17);
        this.addItem(this.panel2, this.lblStaffDeduction2, 0, 7, 1, 1, 13);
        final Box Deduction2Box = Box.createHorizontalBox();
        Deduction2Box.add(Box.createHorizontalStrut(5));
        Deduction2Box.add(this.txtStaffDeduction2);
        Deduction2Box.add(Box.createHorizontalStrut(5));
        Deduction2Box.add(this.lblStaffDeduction2Description);
        Deduction2Box.add(Box.createHorizontalStrut(8));
        Deduction2Box.add(this.txtStaffDeduction2Description);
        Deduction2Box.add(Box.createHorizontalStrut(8));
        this.addItem(this.panel2, Deduction2Box, 1, 7, 3, 1, 13);
        this.addItem(this.panel2, this.lblStaffNetSalary, 0, 8, 1, 1, 13);
        this.addItem(this.panel2, this.txtStaffNetSalary, 1, 8, 3, 1, 17);
        final Box DateBox = Box.createHorizontalBox();
        DateBox.add((Component)this.picker);
        DateBox.add(Box.createHorizontalStrut(5));
        this.addItem(this.panel, paneScrollPane, 1, 11, 3, 3, 10);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrevious);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnNext);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnViewInfo);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrepare);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSave);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnPrint);
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel, ButtonsBox, 0, 18, 2, 2, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                Payroll.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                Payroll.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                Payroll.this.connectToDB();
                Payroll.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                Payroll.this.connectToDB();
                Payroll.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                Payroll.this.connectToDB();
                Payroll.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                Payroll.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                Payroll.this.btnPreviewMethod(evt7);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                Payroll.this.connectToDB();
                Payroll.this.btnPreviousMethod(evt8);
            }
        });
        this.btnViewInfo.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                Payroll.this.connectToDB();
                Payroll.this.btnViewInfoMethod(evt10);
            }
        });
        this.btnPrepare.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                Payroll.this.connectToDB();
                Payroll.this.btnPrepareMethod(evt11);
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
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                final Font d = new Font(null, 0, 9);
                table.setFont(d);
                final TableColumn column = table.getColumnModel().getColumn(0);
                column.setPreferredWidth(200);
                return this;
            }
        });
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
                this.connection.close();
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
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.txtStaffName.setText("");
        this.txtStaffNo.setText("");
        this.txtStafftCategory.setText("");
        this.txtStafftPosition.setText("");
        this.txtStaffSalary.setText("");
        this.txtStaffSalary.setText("");
        this.txtStaffSalaryIncrement.setText("");
        this.txtStaffAllowance1.setText("");
        this.txtStaffAllowance1Description.setText("");
        this.txtStaffAllowance2.setText("");
        this.txtStaffAllowance2Description.setText("");
        this.txtStaffDeduction1.setText("");
        this.txtStaffDeduction2.setText("");
        this.txtStaffDeduction1Description.setText("");
        this.txtStaffDeduction2Description.setText("");
        this.txtStaffNetSalary.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtStaffID.getText().toString());
        this.txtmyclass.setText(myClass);
        ID = Integer.parseInt(this.txtStaffID.getText().toString());
        final String R = Integer.toString(++ID);
        this.txtStaffID.setText(R);
        final String IDNumber = this.txtStaffID.getText().toString();
        final String StaffID = this.txtStaffID.getText().toString();
        final String StaffNo = this.txtStaffNo.getText().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
            final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
            final String QueryString = "SELECT StaffName,StaffID,StaffCategory,StaffNo,StaffPosition,StaffSalary FROM staffdatacapture WHERE StaffID=?";
            final PreparedStatement pstatement = con.prepareStatement("SELECT StaffName,StaffID,StaffCategory,StaffNo,StaffPosition,StaffSalary FROM staffdatacapture WHERE StaffID=?");
            pstatement.setString(1, StaffID);
            final ResultSet rs = pstatement.executeQuery();
            final ResultSetMetaData md = rs.getMetaData();
            final int columns = md.getColumnCount();
            while (rs.next()) {
                final String mystaffname = rs.getString(1);
                final String mystaffid = rs.getString(2);
                final String mystaffcategory = rs.getString(3);
                final String mystaffno = rs.getString(4);
                final String mystaffposition = rs.getString(5);
                final String mystaffSalary = rs.getString(6);
                this.txtStaffName.setText(mystaffname);
                this.txtStaffID.setText(mystaffid);
                this.txtStafftCategory.setText(mystaffcategory);
                this.txtStaffNo.setText(mystaffno);
                this.txtStafftPosition.setText(mystaffposition);
                this.txtStaffSalary.setText(mystaffSalary);
                this.txtStaffID.setBackground(Color.RED);
                this.txtStaffID.setForeground(Color.WHITE);
            }
            rs.close();
            pstatement.close();
        }
        catch (Exception e5) {
            System.out.println(e5);
        }
        this.panel.validate();
        this.panel.repaint();
    }
    
    public void btnSaveMethod(final ActionEvent evt5) {
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        final int StaffID = Integer.parseInt(this.txtStaffID.getText().toString());
        final String StaffNo = this.txtStaffNo.getText().toString();
        final String StaffName = this.txtStaffName.getText().toString();
        final String StaffCategory = this.txtStafftCategory.getText().toString();
        final String Staffposition = this.txtStafftPosition.getText().toString();
        double StaffSalry = 0.0;
        double salaryIncrement = 0.0;
        double Allowance1 = 0.0;
        double Allowance2 = 0.0;
        double Deduction1 = 0.0;
        double Deduction2 = 0.0;
        double NetSalary = 0.0;
        StaffSalry = Double.parseDouble(this.txtStaffSalary.getText().toString());
        final String month = this.ComboPayrollFortheMonthOF.getSelectedItem().toString();
        final String year = this.ComboPayrollYear.getSelectedItem().toString();
        salaryIncrement = Double.parseDouble(this.txtStaffSalaryIncrement.getText().toString());
        Allowance1 = Double.parseDouble(this.txtStaffAllowance1.getText().toString());
        final String Allowance1Desc = this.txtStaffAllowance1Description.getText().toString();
        Allowance2 = Double.parseDouble(this.txtStaffAllowance2.getText().toString());
        final String Allowance2Desc = this.txtStaffAllowance2Description.getText().toString();
        Deduction1 = Double.parseDouble(this.txtStaffDeduction1.getText().toString());
        final String Deduction1Desc = this.txtStaffDeduction1Description.getText().toString();
        Deduction2 = Double.parseDouble(this.txtStaffDeduction2.getText().toString());
        final String Deduction2Desc = this.txtStaffDeduction2Description.getText().toString();
        NetSalary = StaffSalry + salaryIncrement + Allowance1 + Allowance2 - Deduction1 - Deduction2;
        this.txtStaffNetSalary.setText(Double.toString(NetSalary));
        if (month.equalsIgnoreCase("SELECT MONTH")) {
            JOptionPane.showMessageDialog(null, "Please, select Month");
        }
        else if (year.equalsIgnoreCase("SELECT YEAR")) {
            JOptionPane.showMessageDialog(null, "Please, select Year");
        }
        else if (Allowance1 != 0.0 && Allowance1Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Allowance1");
        }
        else if (Allowance2 != 0.0 && Allowance2Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Allowance2 ");
        }
        else if (Deduction1 != 0.0 && Deduction1Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Deduction1 ");
        }
        else if (Deduction2 != 0.0 && Deduction2Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Deduction2 ");
        }
        else if (NetSalary <= 0.0) {
            JOptionPane.showMessageDialog(null, "Please, check your operations! ");
        }
        try {
            final String InsertQueryString = "INSERT INTO staffpayroll (StaffName,StaffID,Category,StaffNo,Position,Salary,Month,Year,Increment,Allowance1,Allow1Desc,Allowance2,Allow2Desc,Deduction1,Deduc1Desc,Deduction2,Deduc2Desc,NetSalary)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,Salary+Increment+Allowance1+Allowance2-Deduction1-Deduction2) ON DUPLICATE KEY UPDATE Month=VALUES(Month), Year=VALUES(Year), Increment=VALUES(Increment),Allowance1=VALUES(Allowance1), Allow1Desc=VALUES(Allow1Desc), Allowance2=VALUES(Allowance2), Allow2Desc=VALUES(Allow2Desc), Deduction1=VALUES(Deduction1), Deduc1Desc=VALUES(Deduc1Desc),Deduction2=VALUES(Deduction2),Deduc2Desc=VALUES(Deduc2Desc),NetSalary=VALUES(NetSalary)";
            final PreparedStatement pstatement = this.connection.prepareStatement("INSERT INTO staffpayroll (StaffName,StaffID,Category,StaffNo,Position,Salary,Month,Year,Increment,Allowance1,Allow1Desc,Allowance2,Allow2Desc,Deduction1,Deduc1Desc,Deduction2,Deduc2Desc,NetSalary)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,Salary+Increment+Allowance1+Allowance2-Deduction1-Deduction2) ON DUPLICATE KEY UPDATE Month=VALUES(Month), Year=VALUES(Year), Increment=VALUES(Increment),Allowance1=VALUES(Allowance1), Allow1Desc=VALUES(Allow1Desc), Allowance2=VALUES(Allowance2), Allow2Desc=VALUES(Allow2Desc), Deduction1=VALUES(Deduction1), Deduc1Desc=VALUES(Deduc1Desc),Deduction2=VALUES(Deduction2),Deduc2Desc=VALUES(Deduc2Desc),NetSalary=VALUES(NetSalary)");
            pstatement.setString(1, StaffName);
            pstatement.setInt(2, StaffID);
            pstatement.setString(3, StaffCategory);
            pstatement.setString(4, StaffNo);
            pstatement.setString(5, Staffposition);
            pstatement.setDouble(6, StaffSalry);
            pstatement.setString(7, month);
            pstatement.setString(8, year);
            pstatement.setDouble(9, salaryIncrement);
            pstatement.setDouble(10, Allowance1);
            pstatement.setString(11, Allowance1Desc);
            pstatement.setDouble(12, Allowance2);
            pstatement.setString(13, Allowance2Desc);
            pstatement.setDouble(14, Deduction1);
            pstatement.setString(15, Deduction1Desc);
            pstatement.setDouble(16, Deduction2);
            pstatement.setString(17, Deduction2Desc);
            final int numberOfRowsUpdated = pstatement.executeUpdate();
            pstatement.close();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error occured,\n" + e.getMessage());
            e.printStackTrace();
        }
        final double StaffnewSalary = StaffSalry + salaryIncrement;
        if (salaryIncrement > 0.0) {
            try {
                final String QueryString = "UPDATE\tstaffdatacapture SET StaffSalary=? WHERE StaffID = ?";
                (this.pstatement = this.connection.prepareStatement("UPDATE\tstaffdatacapture SET StaffSalary=? WHERE StaffID = ?")).setDouble(1, StaffnewSalary);
                this.pstatement.setInt(2, StaffID);
                this.pstatement.executeUpdate();
                final String ID = String.format("%04d", StaffID);
                final String message_for_SuccessfulModification = "\n Staff name with " + ID + "  has/his her salary update to: " + "( " + StaffnewSalary + " )" + ", Net Salary: " + "( " + NetSalary + " )" + " successfully.";
                JOptionPane.showMessageDialog(null, message_for_SuccessfulModification, "Successful Modification", 1);
                final int numberOfRowsUpdated2 = this.pstatement.executeUpdate();
                this.connection.close();
                this.pstatement.close();
            }
            catch (SQLException e2) {
                JOptionPane.showMessageDialog(null, "please check your entries\n" + e2.getMessage(), "Error occured", 0);
                e2.printStackTrace();
            }
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
            final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
            final String QueryString2 = "SELECT * FROM staffpayroll WHERE Month=? AND Year =?";
            final PreparedStatement pstatement2 = con.prepareStatement("SELECT * FROM staffpayroll WHERE Month=? AND Year =?");
            pstatement2.setString(1, month);
            pstatement2.setString(2, year);
            final ResultSet rs = pstatement2.executeQuery();
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
            pstatement2.close();
        }
        catch (Exception e3) {
            System.out.println(e3);
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
        final J2Printer printer = new J2Printer();
        printer.setSeparatePrintThread(false);
        final J2ComponentPrinter componentPrinter = new J2ComponentPrinter((Component)this.textPane);
        printer.addPageable((Pageable)componentPrinter);
        printer.showPrintPreviewDialog((Component)this.textPane);
    }
    
    public void btnPreviewMethod(final ActionEvent evt7) {
        final String month = this.ComboPayrollFortheMonthOF.getSelectedItem().toString();
        final String year = this.ComboPayrollYear.getSelectedItem().toString();
        this.data.setSize(0);
        this.columnNames.setSize(0);
        this.tableModel1.setRowCount(0);
        this.tableModel1.fireTableDataChanged();
        this.panel.validate();
        this.panel.repaint();
        this.TextArea.setText("");
        final String b = (String)this.ComboSelectBehaviour.getSelectedItem();
        if (month.equalsIgnoreCase("SELECT MONTH")) {
            JOptionPane.showMessageDialog(null, "Pls, select month", "Error Occured", 0);
        }
        else if (year.equalsIgnoreCase("SELECT YEAR")) {
            JOptionPane.showMessageDialog(null, "Pls, select year", "Error Occured", 0);
        }
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
                final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
                final String USERNAME = "root";
                final String PASSWORD = "ash123";
                final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
                final String QueryString = "SELECT * FROM staffpayroll WHERE month=? AND year=? order by StaffID";
                final PreparedStatement pstatement = con.prepareStatement("SELECT * FROM staffpayroll WHERE month=? AND year=? order by StaffID");
                pstatement.setString(1, month);
                pstatement.setString(2, year);
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
            this.table.repaint();
            this.table.revalidate();
            this.panel.validate();
            this.panel.repaint();
        }
    }
    
    public void btnViewInfoMethod(final ActionEvent e10) {
        final String StaffID = this.txtStaffID.getText().toString();
        final String StaffNo = this.txtStaffNo.getText().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" ).newInstance();
            final String URL = "jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8";
            final String USERNAME = "root";
            final String PASSWORD = "ash123";
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acasolalhikmahv5?useUnicode=true&characterEncoding=utf-8", "root", "ash123");
            final String QueryString = "SELECT StaffName,StaffID,StaffCategory,StaffNo,StaffPosition,StaffSalary FROM staffdatacapture WHERE StaffID=?";
            final PreparedStatement pstatement = con.prepareStatement("SELECT StaffName,StaffID,StaffCategory,StaffNo,StaffPosition,StaffSalary FROM staffdatacapture WHERE StaffID=?");
            pstatement.setString(1, StaffID);
            final ResultSet rs = pstatement.executeQuery();
            final ResultSetMetaData md = rs.getMetaData();
            final int columns = md.getColumnCount();
            while (rs.next()) {
                final String mystaffname = rs.getString(1);
                final String mystaffid = rs.getString(2);
                final String mystaffcategory = rs.getString(3);
                final String mystaffno = rs.getString(4);
                final String mystaffposition = rs.getString(5);
                final String mystaffSalary = rs.getString(6);
                this.txtStaffName.setText(mystaffname);
                this.txtStaffID.setText(mystaffid);
                this.txtStafftCategory.setText(mystaffcategory);
                this.txtStaffNo.setText(mystaffno);
                this.txtStafftPosition.setText(mystaffposition);
                this.txtStaffSalary.setText(mystaffSalary);
                this.txtStaffName.setBackground(Color.RED);
                this.txtStaffName.setForeground(Color.WHITE);
                this.txtStaffID.setBackground(Color.RED);
                this.txtStaffID.setForeground(Color.WHITE);
                this.txtStafftCategory.setBackground(Color.RED);
                this.txtStafftCategory.setForeground(Color.WHITE);
                this.txtStafftPosition.setBackground(Color.RED);
                this.txtStafftPosition.setForeground(Color.WHITE);
                this.txtStaffSalary.setBackground(Color.RED);
                this.txtStaffSalary.setForeground(Color.WHITE);
                this.txtStaffNo.setBackground(Color.RED);
                this.txtStaffNo.setForeground(Color.WHITE);
            }
            rs.close();
            pstatement.close();
        }
        catch (Exception e11) {
            System.out.println(e11);
        }
        this.panel.validate();
        this.panel.repaint();
    }
    
    public void btnPreviousMethod(final ActionEvent e8) {
        this.TextArea.setText("");
        this.txtStaffName.setText("");
        this.txtStaffNo.setText("");
        this.txtStafftCategory.setText("");
        this.txtStafftPosition.setText("");
        this.txtStaffSalary.setText("");
        this.txtName.setText("");
        final String myClass = (String)this.ComboSelecClass.getSelectedItem();
        int ID = Integer.parseInt(this.txtStaffID.getText().toString());
        this.txtmyclass.setText(myClass);
        ID = Integer.parseInt(this.txtStaffID.getText().toString());
        final String R = Integer.toString(--ID);
        this.txtStaffID.setText(R);
        final String IDNumber = this.txtStaffID.getText().toString();
        this.txtStaffID.requestFocus();
    }
    
    public void btnPrepareMethod(final ActionEvent e11) {
        final String StaffID = null;
        final String StaffNo = this.txtStaffNo.getText().toString();
        final String StaffName = this.txtStaffName.getText().toString();
        final String StaffCategory = this.txtStafftCategory.getText().toString();
        final String Staffposition = this.txtStafftPosition.getText().toString();
        double StaffSalry = 0.0;
        double salaryIncrement = 0.0;
        double Allowance1 = 0.0;
        double Allowance2 = 0.0;
        double Deduction1 = 0.0;
        double Deduction2 = 0.0;
        double NetSalary = 0.0;
        StaffSalry = Double.parseDouble(this.txtStaffSalary.getText().toString());
        final String month = (String)this.ComboPayrollFortheMonthOF.getSelectedItem();
        final String year = (String)this.ComboPayrollYear.getSelectedItem();
        salaryIncrement = Double.parseDouble(this.txtStaffSalaryIncrement.getText().toString());
        Allowance1 = Double.parseDouble(this.txtStaffAllowance1.getText().toString());
        final String Allowance1Desc = this.txtStaffAllowance1Description.getText().toString();
        Allowance2 = Double.parseDouble(this.txtStaffAllowance2.getText().toString());
        final String Allowance2Desc = this.txtStaffAllowance2Description.getText().toString();
        Deduction1 = Double.parseDouble(this.txtStaffDeduction1.getText().toString());
        final String Deduction1Desc = this.txtStaffDeduction1Description.getText().toString();
        Deduction2 = Double.parseDouble(this.txtStaffDeduction2.getText().toString());
        final String Deduction2Desc = this.txtStaffDeduction2Description.getText().toString();
        NetSalary = StaffSalry + salaryIncrement + Allowance1 + Allowance2 - Deduction1 - Deduction2;
        this.txtStaffNetSalary.setText(Double.toString(NetSalary));
        if (month.equalsIgnoreCase("SELECT MONTH")) {
            JOptionPane.showMessageDialog(null, "Please, select Month");
        }
        else if (year.equalsIgnoreCase("SELECT YEAR")) {
            JOptionPane.showMessageDialog(null, "Please, select Year");
        }
        else if (Allowance1 != 0.0 && Allowance1Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Allowance1");
        }
        else if (Allowance2 != 0.0 && Allowance2Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Allowance2 ");
        }
        else if (Deduction1 != 0.0 && Deduction1Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Deduction1 ");
        }
        else if (Deduction2 != 0.0 && Deduction2Desc.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please, enter description for Deduction2 ");
        }
        else if (NetSalary <= 0.0) {
            JOptionPane.showMessageDialog(null, "Please, check your operations! ");
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
