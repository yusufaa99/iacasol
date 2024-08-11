import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
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
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import javax.swing.table.TableModel;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
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

public class AttaqdeerSpecification extends JFrame
{
    private Connection connection;
    private Statement statement;
    private PreparedStatement pstatement;
    private JPanel panel;
    private JComboBox ComboSession;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel lblHeader1;
    private JLabel lblHeader2;
    private JLabel lblWeekNum;
    private JLabel lblRegNum;
    private JLabel lblName;
    private JLabel lblClass;
    private JLabel lblTerm;
    private JLabel lblSesion;
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
    private JComboBox ComboTermAttribute;
    private JComboBox ComboAttaqdeer;
    private JComboBox ComboSections;
    private JTextField txtTermInformation;
    private JTextField txtTermInformationArabic;
    private JTextField txtOverallTotalMarks;
    private JTextField txtOverallTotalMarks_From;
    private JTextField txtOverallTotalMarks_To;
    private JLabel lblTermAttribute;
    private JLabel lblAttaqdeer;
    private JLabel lblTermInformation;
    private JLabel lblOverallTotalMarks;
    private JLabel lblOverallTotalMarks_From;
    private JLabel lblOverallTotalMarks_To;
    private JLabel lblSection;
    private JLabel lblTermInformationArabic;
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
    private JLabel lblPeriodOfHolidays;
    private JLabel lblNextTermBegins;
    private JLabel lblTermMonth;
    private JLabel lblTermYear;
    private JLabel lblSession;
    private JLabel lblSchoolFeesForNextTerm;
    private JLabel lblFeesOutStanding;
    private JLabel lblMuddatulutlah;
    private JLabel lblBidayatulFatralUlah;
    private JLabel lblRusumalMadrasahLilfatratilKadimar;
    private JLabel lblRusumalmadrasahAladdalibiLamtusaddad;
    private JTextField txtTermEnds;
    private JTextField txtPeriodOfHolidays;
    private JTextField txtNextTermBegins;
    private JComboBox CombomyMonth;
    private JTextField txtTermYear;
    private JTextField txtSession;
    private JTextField txtSchoolFeesForNextTerm;
    private JTextField txtFeesOutStanding;
    private JTextField txtMuddatulutlah;
    private JTextField txtBidayatulFatralUlah;
    private JTextField txtRusumalMadrasahLilfatratilKadimar;
    private JTextField txtRusumalmadrasahAladdalibiLamtusaddad;
    private JTextPane textPane;
    private JScrollPane paneScrollPane;
    private DefaultTableModel tableModel1;
    Vector columnNames;
    Vector data;
    private JTable table;
    
    public AttaqdeerSpecification() {
        this.columnNames = new Vector();
        this.data = new Vector();
    }
    
    public void AttaqdeerSpecification() {
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.lblHeader1 = new JLabel("EVALUATION AND CONTINUOUS ASSESSMENT WINDOW");
        this.lblHeader2 = new JLabel("FOR SENIOR SECONDARY SCHOOL");
        this.lblWeekNum = new JLabel("WEEK NUMBER:");
        this.lblRegNum = new JLabel("REGISTRATION NO:");
        this.lblName = new JLabel("NAME:");
        this.lblClass = new JLabel("CLASS:");
        this.lblTerm = new JLabel("SELECT TERM:");
        this.lblSesion = new JLabel("SESSION:");
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
        final Font f = new Font(null, 1, 20);
        final Font FontTermInformation = new Font("Arial Unicode MS", 1, 20);
        final Font f2 = new Font(null, 1, 20);
        final Font arabfont = new Font("HMSKhabar", 1, 20);
        this.txtRegNum = new JTextField(7);
        this.txtName = new JTextField(35);
        (this.txtClass = new JTextField(20)).setEditable(false);
        this.txtName.setEditable(false);
        this.txtClassWorkMarks = new JTextField(5);
        this.txtHomeWorkMarks = new JTextField(5);
        (this.ComboSession = new JComboBox()).addItem("Select Session");
        this.ComboSession.setEditable(true);
        this.ComboSession.setFont(f);
        this.ComboSession.setBackground(Color.RED);
        this.ComboSession.setForeground(Color.white);
        (this.ComboSelecClass = new JComboBox()).setFont(f);
        this.ComboSelecClass.addItem("SELECT CLASS");
        this.ComboSelecClass.setEditable(false);
        ((JLabel)this.ComboSelecClass.getRenderer()).setHorizontalAlignment(4);
        (this.txtTermInformationArabic = new JTextField(10)).setFont(FontTermInformation);
        (this.txtOverallTotalMarks_From = new JTextField(5)).setFont(f);
        (this.txtOverallTotalMarks_To = new JTextField(5)).setFont(f);
        this.txtTermInformationArabic.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.txtTermInformationArabic.setFont(arabfont);
        (this.txtTermInformation = new JTextField(10)).setFont(f);
        this.lblTermAttribute = new JLabel("TERM ATTRIBUTE: ");
        this.lblAttaqdeer = new JLabel("ATTAQDEER: ");
        this.lblTermInformation = new JLabel("TERM INFORMATION: ");
        this.lblSection = new JLabel("SECTION: ");
        this.lblOverallTotalMarks = new JLabel("OVERALL TOTAL MRKS: ");
        this.lblOverallTotalMarks_From = new JLabel("FROM: ");
        this.lblOverallTotalMarks_To = new JLabel("TO: ");
        this.lblTermInformationArabic = new JLabel("TERM INFORMATION (ARABIC): ");
        (this.ComboTermAttribute = new JComboBox()).addItem("SELECT ATTRIBUTE");
        this.ComboTermAttribute.addItem("Period of Holidays");
        this.ComboTermAttribute.addItem("Next Term Begins");
        this.ComboTermAttribute.addItem("Sch. Fees for the Next Term");
        this.textPane = this.createTextPane();
        final JScrollPane paneScrollPane = new JScrollPane(this.textPane);
        this.panel.validate();
        this.panel.repaint();
        this.tableModel1 = new DefaultTableModel(0, 0);
        final JTable table = new JTable(this.tableModel1);
        table.setAutoCreateRowSorter(true);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setBackground(Color.white);
        table.setGridColor(Color.black);
        table.setForeground(Color.black);
        paneScrollPane.setVerticalScrollBarPolicy(22);
        paneScrollPane.setHorizontalScrollBarPolicy(32);
        paneScrollPane.setPreferredSize(new Dimension(570, 230));
        paneScrollPane.setBackground(Color.cyan);
        (this.ComboAttaqdeer = new JComboBox()).addItem("SELECT ATTAQDEER");
        this.ComboAttaqdeer.addItem("\u0645\u0645\u062a\u0627\u0632");
        this.ComboAttaqdeer.addItem("\u062c\u064a\u062f \u062c\u062f\u0627");
        this.ComboAttaqdeer.addItem("\u062c\u064a\u062f");
        this.ComboAttaqdeer.addItem("\u0645\u0642\u0628\u0648\u0644");
        this.ComboAttaqdeer.addItem("\u0631\u0633\u0648\u0628");
        this.ComboAttaqdeer.setFont(f);
        this.ComboAttaqdeer.setEditable(true);
        ((JLabel)this.ComboAttaqdeer.getRenderer()).setHorizontalAlignment(4);
        (this.ComboSections = new JComboBox()).addItem("SELECT SECTION");
        this.ComboSections.addItem("ISLAMIYYA");
        this.ComboSections.addItem("TAHFEEZ");
        this.ComboSections.addItem("MUTAWASSIT");
        this.ComboSections.addItem("UMMAHAT");
        this.ComboSections.setFont(f);
        this.ComboSections.setForeground(Color.GREEN.darker());
        this.ComboTermAttribute.setFont(f);
        (this.ComboTerm = new JComboBox()).addItem("SELECT TERM");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u0623\u0648\u0644\u0649");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0646\u064a\u0629");
        this.ComboTerm.addItem("\u0627\u0644\u0641\u062a\u0631\u0629 \u0627\u0644\u062b\u0627\u0644\u062b\u0629");
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
        (this.ComboCWorkNo = new JComboBox()).addItem("SELECT C_WORK NO");
        this.ComboCWorkNo.addItem("1ST C_WORK");
        this.ComboCWorkNo.addItem("2ND C_WORK");
        this.ComboCWorkNo.addItem("3RD C_WORK");
        this.ComboCWorkNo.addItem("4TH C_WORK");
        this.ComboCWorkNo.addItem("5TH C_WORK");
        this.ComboCWorkNo.addItem("6TH C_WORK");
        this.ComboCWorkNo.addItem("7TH C_WORK");
        this.ComboCWorkNo.addItem("8TH C_WORK");
        this.ComboCWorkNo.addItem("9TH C_WORK");
        this.ComboCWorkNo.addItem("10TH C_WORK");
        this.ComboCWorkNo.addItem("11TH C_WORK");
        this.ComboCWorkNo.addItem("12TH C_WORK");
        this.ComboCWorkNo.addItem("13TH C_WORK");
        this.ComboCWorkNo.addItem("14TH C_WORK");
        this.ComboCWorkNo.addItem("15TH C_WORK");
        (this.ComboHWorkNo = new JComboBox()).addItem("SELECT H_WORK NO");
        this.ComboHWorkNo.addItem("1ST H_WORK");
        this.ComboHWorkNo.addItem("2ND H_WORK");
        this.ComboHWorkNo.addItem("3RD H_WORK");
        this.ComboHWorkNo.addItem("4TH H_WORK");
        this.ComboHWorkNo.addItem("5TH H_WORK");
        this.ComboHWorkNo.addItem("6TH H_WORK");
        this.ComboHWorkNo.addItem("7TH H_WORK");
        this.ComboHWorkNo.addItem("8TH H_WORK");
        this.ComboHWorkNo.addItem("9TH H_WORK");
        this.ComboHWorkNo.addItem("10TH H_WORK");
        this.ComboHWorkNo.addItem("11TH H_WORK");
        this.ComboHWorkNo.addItem("12TH H_WORK");
        this.ComboHWorkNo.addItem("13TH H_WORK");
        this.ComboHWorkNo.addItem("14TH H_WORK");
        this.ComboHWorkNo.addItem("15TH H_WORK");
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
        (this.ComboQuerySelectSubj = new JComboBox()).addItem("Qur\u00ef\u061f\u0622½an");
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
        (this.ScrollPane = new JScrollPane(this.TextArea, 20, 32)).setVerticalScrollBarPolicy(22);
        this.ScrollPane.setHorizontalScrollBarPolicy(32);
        this.ScrollPane.setPreferredSize(new Dimension(600, 260));
        this.ScrollPane.setBackground(Color.cyan);
        this.txtmyclass = new JTextField();
        this.lblHwPercentage = new JLabel("10%");
        this.lblTermEnd = new JLabel("TERM ENDS:");
        this.lblPeriodOfHolidays = new JLabel("PERIOD OF HOLIDAYS:");
        this.lblNextTermBegins = new JLabel("NEXT TERM BEGINS:");
        this.lblTermMonth = new JLabel("MONTH:");
        this.lblTermYear = new JLabel("YEAR:");
        this.lblMuddatulutlah = new JLabel("\u0638\u2026\u0637\u0622¯\u0637\u0622© \u0637\u0622§\u0638\u201e\u0637\u0622¹\u0637\u0622·\u0638\u201e\u0637\u0622© \u0637\u0622§\u0638\u201e\u0637\u00ad\u0637\u0622¯\u0637\u0622¯\u0637\u0622© :");
        this.lblBidayatulFatralUlah = new JLabel("\u0637\u0622¨\u0637\u0622¯\u0637\u0622§\u0638\u0679\u0637\u0622© \u0637\u0622§\u0638\u201e\u0638\u067e\u0638\u0679\u0637\u0622±\u0637\u0622© \u0637\u0622§\u0638\u201e\u0637\u0622£\u0638\u02c6\u0638\u201e\u0638\u2030 :");
        this.lblRusumalMadrasahLilfatratilKadimar = new JLabel("\u0637\u0622±\u0637\u0622³\u0638\u02c6\u0638\u2026 \u0637\u0622§\u0638\u201e\u0638\u2026\u0637\u0622¯\u0637\u0622±\u0637\u0622© \u0638\u201e\u0638\u201e\u0638\u067e\u0637\u06be\u0637\u0622±\u0637\u0622© \u0637\u0622§\u0638\u201e\u0638\u201a\u0637\u0622§\u0637\u0622¯\u0638\u2026\u0637\u0622© :");
        this.lblRusumalmadrasahAladdalibiLamtusaddad = new JLabel("\u0637\u0622±\u0637\u0622³\u0638\u02c6\u0638\u2026 \u0637\u0622§\u0638\u201e\u0638\u2026\u0637\u0622¯\u0637\u0622±\u0637\u0622© \u0637\u0622¹\u0638\u201e\u0638\u2030 \u0637\u0622§\u0638\u201e\u0637\u0622·\u0637\u0622§\u0638\u201e\u0637\u0622¨ \u0638\u201e\u0638\u2026 \u0637\u06be\u0637\u0622³\u0637\u0622¯\u0637\u0622¯: ");
        this.txtTermEnds = new JTextField(10);
        this.txtPeriodOfHolidays = new JTextField(20);
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
        (this.txtSession = new JTextField(10)).setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.txtSession.setFont(arabfont);
        this.txtTermYear.setFont(f);
        this.txtSchoolFeesForNextTerm = new JTextField(5);
        this.txtFeesOutStanding = new JTextField(5);
        this.lblSession = new JLabel("SESSION :");
        this.lblSchoolFeesForNextTerm = new JLabel("SCHOOL FEES FOR NEXT TERM :");
        this.lblFeesOutStanding = new JLabel("OUTSTANDING FEES :");
        this.txtMuddatulutlah = new JTextField(10);
        this.txtBidayatulFatralUlah = new JTextField(10);
        this.txtRusumalMadrasahLilfatratilKadimar = new JTextField(10);
        this.txtRusumalmadrasahAladdalibiLamtusaddad = new JTextField(10);
        this.txtMuddatulutlah.setFont(f);
        this.txtBidayatulFatralUlah.setFont(f);
        this.txtRusumalMadrasahLilfatratilKadimar.setFont(f);
        this.txtRusumalmadrasahAladdalibiLamtusaddad.setFont(f);
        this.lblMuddatulutlah.setFont(f);
        this.lblBidayatulFatralUlah.setFont(f);
        this.lblRusumalMadrasahLilfatratilKadimar.setFont(f);
        this.lblRusumalmadrasahAladdalibiLamtusaddad.setFont(f);
        this.panel.setLayout(new GridBagLayout());
        this.panel2.setLayout(new GridBagLayout());
        this.panel3.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(760, 535);
        this.setTitle("\u0650Attaqdeer Sepecification");
        this.add(this.panel);
        this.setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.BLACK);
        this.panel2.setBackground(Color.PINK);
        this.panel3.setBackground(Color.cyan.brighter());
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
        this.addItem(this.panel, this.panel2, 0, 0, 1, 1, 17);
        this.addItem(this.panel2, this.lblSesion, 0, 4, 1, 1, 13);
        this.addItem(this.panel2, this.ComboSession, 1, 4, 3, 1, 17);
        this.addItem(this.panel2, this.lblClass, 0, 5, 1, 1, 13);
        this.addItem(this.panel2, this.ComboSelecClass, 1, 5, 3, 1, 17);
        this.addItem(this.panel2, this.lblAttaqdeer, 0, 6, 1, 1, 13);
        this.addItem(this.panel2, this.ComboAttaqdeer, 1, 6, 3, 1, 17);
        final Box OverallTotalMrks = Box.createHorizontalBox();
        OverallTotalMrks.add(this.lblOverallTotalMarks_From);
        OverallTotalMrks.add(this.txtOverallTotalMarks_From);
        OverallTotalMrks.setBorder(BorderFactory.createTitledBorder("OVERALL TOTAL MARKS"));
        this.addItem(this.panel2, this.lblOverallTotalMarks, 0, 7, 1, 1, 13);
        this.addItem(this.panel2, OverallTotalMrks, 1, 7, 3, 1, 17);
        this.addItem(this.panel2, OverallTotalMrks, 1, 7, 3, 1, 17);
        this.addItem(this.panel2, paneScrollPane, 1, 10, 3, 3, 13);
        final Box ButtonsBox = Box.createHorizontalBox();
        ButtonsBox.add(this.btnPreview);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnSave);
        ButtonsBox.add(Box.createHorizontalStrut(3));
        ButtonsBox.add(this.btnClose);
        this.addItem(this.panel2, ButtonsBox, 1, 15, 1, 1, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                AttaqdeerSpecification.this.btnCloseMethod(evt1);
            }
        });
        this.btnClear.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                AttaqdeerSpecification.this.btnClearMethod(evt2);
            }
        });
        this.btnSearch.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                AttaqdeerSpecification.this.connectToDB();
                AttaqdeerSpecification.this.btnSearchMethod(evt3);
            }
        });
        this.btnNext.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                AttaqdeerSpecification.this.connectToDB();
                AttaqdeerSpecification.this.btnNextMethod(evt4);
            }
        });
        this.btnSave.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                AttaqdeerSpecification.this.connectToDB();
                AttaqdeerSpecification.this.btnSaveMethod(evt5);
            }
        });
        this.btnPrint.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                AttaqdeerSpecification.this.btnPrintMethod(evt6);
            }
        });
        this.btnPreview.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                AttaqdeerSpecification.this.btnPreviewMethod(evt7);
            }
        });
        this.ComboWeekNumber.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                AttaqdeerSpecification.this.connectToDB();
                AttaqdeerSpecification.this.ComboWeekNumberMethod(evt8);
            }
        });
        this.btnPrevious.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                AttaqdeerSpecification.this.connectToDB();
                AttaqdeerSpecification.this.btnPreviousMethod(evt9);
            }
        });
        this.ComboSelecClass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                AttaqdeerSpecification.this.connectToDB();
                AttaqdeerSpecification.this.ComboSelecClassMethod(evt10);
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
        this.fillComboSession();
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
            JOptionPane.showMessageDialog(null, "Please, enter parent phone number!", "database connectivity error\n" + e2.getMessage(), 0);
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
    
    public void btnSaveMethod(final ActionEvent evt5) {
        final String myAttaqdeer = (String)this.ComboAttaqdeer.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String mySession = (String)this.ComboSession.getSelectedItem();
        final double mytxtOverallTotalMarks_From = Double.parseDouble(this.txtOverallTotalMarks_From.getText().toString());
        String The_Class = "";
        try {
            this.connectToDB();
            final String QueryString = "SELECT Class FROM attaqdeer_spec WHERE Class =? AND Attaqdeer =?  AND Session =?";
            final PreparedStatement pstatement = this.connection.prepareStatement("SELECT Class FROM attaqdeer_spec WHERE Class =? AND Attaqdeer =?  AND Session =?");
            pstatement.setString(1, myclass);
            pstatement.setString(2, myAttaqdeer);
            pstatement.setString(3, mySession);
            final ResultSet rs = pstatement.executeQuery();
            while (rs.next()) {
                The_Class = rs.getString(1);
            }
            rs.close();
            pstatement.close();
        }
        catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "please check your entries\n" + a.getMessage(), "Error occured", 0);
            a.printStackTrace();
        }
        if (myclass.equals("SELECT CLASS")) {
            JOptionPane.showMessageDialog(null, "Please, select Class!", "Error occured", 0);
        }
        else if (mySession.equals("Select Session")) {
            JOptionPane.showMessageDialog(null, "Please, \u0650Session", "Error in data entry", 0);
        }
        else if (myAttaqdeer.equals("SELECT ATTAQDEER")) {
            JOptionPane.showMessageDialog(null, "Please, Ataqdeer", "Error in data entry", 0);
        }
        else if (this.txtOverallTotalMarks_From.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Please, \u0650Supply the Least Value for Attaqdeer", "Error in data entry", 0);
        }
        else {
            String attaqOPspec = "";
            try {
                final String QueryString2 = "SELECT * FROM attaqdeer_spec WHERE Class=? AND Session=? AND Attaqdeer=? ";
                final PreparedStatement Qpstatement = this.connection.prepareStatement("SELECT * FROM attaqdeer_spec WHERE Class=? AND Session=? AND Attaqdeer=? ");
                Qpstatement.setString(1, myclass);
                Qpstatement.setString(2, mySession);
                Qpstatement.setString(3, myAttaqdeer);
                final ResultSet rs2 = Qpstatement.executeQuery();
                if (rs2.next()) {
                    attaqOPspec = "UPDATED";
                    final String InsertQueryString = "UPDATE attaqdeer_spec SET LeastOverallTOTAL =?  WHERE Class=? AND Session=? AND  Attaqdeer=? ";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("UPDATE attaqdeer_spec SET LeastOverallTOTAL =?  WHERE Class=? AND Session=? AND  Attaqdeer=? ");
                    pstatement2.setDouble(1, mytxtOverallTotalMarks_From);
                    pstatement2.setString(2, myclass);
                    pstatement2.setString(3, mySession);
                    pstatement2.setString(4, myAttaqdeer);
                    pstatement2.executeUpdate();
                }
                else {
                    attaqOPspec = "INSERTED";
                    final String InsertQueryString = "INSERT INTO attaqdeer_spec VALUES(?,?,?,?,?)";
                    final PreparedStatement pstatement2 = this.connection.prepareStatement("INSERT INTO attaqdeer_spec VALUES(?,?,?,?,?)");
                    pstatement2.setString(1, null);
                    pstatement2.setString(2, myclass);
                    pstatement2.setDouble(3, mytxtOverallTotalMarks_From);
                    pstatement2.setString(4, myAttaqdeer);
                    pstatement2.setString(5, mySession);
                    pstatement2.executeUpdate();
                }
                JOptionPane.showMessageDialog(null, "Attaqdeer : = " + myAttaqdeer + " have been " + attaqOPspec + " for: " + myclass);
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error occured: \n" + e.getMessage());
                e.printStackTrace();
            }
        }
        this.txtOverallTotalMarks_From.setText("");
        this.btnPreviewMethod(evt5);
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
        final String myAttaqdeer = (String)this.ComboAttaqdeer.getSelectedItem();
        final String myclass = (String)this.ComboSelecClass.getSelectedItem();
        final String mySession = (String)this.ComboSession.getSelectedItem();
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
            JOptionPane.showMessageDialog(null, "Pls, Class NOT Selected", "Error Occured", 0);
        }
        else if (myAttaqdeer.equalsIgnoreCase("SELECT ATTAQDEER")) {
            JOptionPane.showMessageDialog(null, "Pls, Attaqdeer NOT selected", "Error Occured", 0);
        }
        else {
            try {
                System.out.println("Assalamu alaikum!");
                this.connectToDB();
                final String QueryString = "SELECT * FROM attaqdeer_spec WHERE Class=? AND Session=? AND Attaqdeer=? ";
                final PreparedStatement pstatement = this.connection.prepareStatement("SELECT * FROM attaqdeer_spec WHERE Class=? AND Session=? AND Attaqdeer=? ");
                pstatement.setString(1, myclass);
                pstatement.setString(2, mySession);
                pstatement.setString(3, myAttaqdeer);
                final ResultSet rs = pstatement.executeQuery();
                while (rs.next()) {
                    final String myOverallTotalMarks = rs.getString("LeastOverallTOTAL");
                    this.txtOverallTotalMarks_From.setText(myOverallTotalMarks);
                }
                rs.close();
                pstatement.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showConfirmDialog(null, "Error in Attaqdeer " + e.getMessage(), "Attaqdee Erro", 0);
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
