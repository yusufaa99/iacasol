import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class subFeesManagement extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnFeesSpecification;
    private JButton btnCategorizeStudent;
    private JButton btnStudentPaymentSystem;
    private JButton btnNewStudentFeesManagement;
    private JButton btnStudentPaymentSystem2;
    private JButton btnStudentPaymentReport;
    private JButton btnStudentInvoiceReport;
    private JButton btnContinousPayment;
    private JButton btnStaffRegQueryWindow;
    private JButton btnEvaAndContAssQuery;
    private JButton btnReportSheetOutputType2;
    private JButton btnFirstCAQuery;
    private JButton btnSecondCAQuery;
    private JButton btnThirdCAQueryWindows;
    private JButton btnClose;
    private JButton btnExamQueryWindow;
    
    public void subFeesManagement() {
        this.panel = new JPanel();
        this.btnFeesSpecification = new JButton("FEES SPECIFICATION");
        btnCategorizeStudent = new JButton("CATEGORIZE STD.");
        this.btnStudentPaymentSystem = new JButton("Students Payment Sys");
        this.btnStudentPaymentSystem2 = new JButton("(New) STUDENTS PAYMENT");
        this.btnStudentPaymentReport = new JButton("PAYMENT (Daily) REPORT");
        btnStudentInvoiceReport  = new JButton("INVOICE REPORT");
        this.btnContinousPayment = new JButton("CONTINOUS PAYMENT");
        this.btnNewStudentFeesManagement = new JButton("NEW STUDENT MANAGEMENT");
        this.btnStaffRegQueryWindow = new JButton("STAFF QUERY OUTPUT WINDOW");
        this.btnEvaAndContAssQuery = new JButton("EVALUATIONS AND CONT. ASSESMT. WINDOW");
        this.btnReportSheetOutputType2 = new JButton("REPORTSHEET OUTPUT TYPE [II]");
        this.btnFirstCAQuery = new JButton("1ST C.A. QUERY WINDOW");
        this.btnSecondCAQuery = new JButton("2ND C.A. QUERY WINDOWS");
        this.btnThirdCAQueryWindows = new JButton("3RD C.A. QUERY WINDOWS");
        this.btnExamQueryWindow = new JButton("EXAM QUERY WINDOW");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(1081, 130);
        this.setTitle("Sub Window - Fees Management ");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.RED.brighter());
        this.btnNewStudentFeesManagement.setBackground(Color.black);
        this.btnNewStudentFeesManagement.setForeground(Color.white);
        this.btnNewStudentFeesManagement.setFocusPainted(false);
        this.btnNewStudentFeesManagement.setBackground(new Color(120, 87, 182));
        this.btnFeesSpecification.setBackground(Color.black);
        this.btnFeesSpecification.setForeground(Color.white);
        this.btnFeesSpecification.setFocusPainted(false);
        this.btnFeesSpecification.setBackground(new Color(120, 87, 182));
        
         
        this.btnCategorizeStudent.setBackground(Color.red);
        this.btnCategorizeStudent.setForeground(Color.black);
        this.btnCategorizeStudent.setFocusPainted(false);
        this.btnCategorizeStudent.setBackground(new Color(120, 200, 182));
        
        
        this.btnStudentPaymentSystem2.setBackground(Color.WHITE);
        this.btnStudentPaymentSystem2.setForeground(Color.RED);
        this.btnStudentPaymentSystem2.setFocusPainted(false);
        //this.btnStudentPaymentSystem2.setBackground(new Color(120, 87, 182));
        
        this.btnStudentPaymentReport.setBackground(Color.WHITE);
        this.btnStudentPaymentReport.setForeground(Color.BLACK);
         
        
        this.btnStudentInvoiceReport.setBackground(Color.WHITE);
        this.btnStudentInvoiceReport.setForeground(Color.BLUE);
        
        this.btnStudentPaymentReport.setFocusPainted(false);
        this.btnStudentPaymentReport.setBackground(new Color(120, 87, 182));
        this.btnContinousPayment.setBackground(Color.white);
        this.btnContinousPayment.setForeground(Color.GREEN);
        this.btnContinousPayment.setFocusPainted(false);
        this.btnContinousPayment.setBackground(new Color(120, 87, 182));
        this.btnStaffRegQueryWindow.setForeground(Color.white);
        this.btnStaffRegQueryWindow.setBackground(Color.black);
        this.btnEvaAndContAssQuery.setBackground(Color.black);
        this.btnEvaAndContAssQuery.setForeground(Color.white);
        this.btnReportSheetOutputType2.setBackground(Color.black);
        this.btnReportSheetOutputType2.setForeground(Color.pink);
        this.btnFirstCAQuery.setBackground(Color.black);
        this.btnFirstCAQuery.setForeground(Color.red);
        this.btnSecondCAQuery.setBackground(Color.black);
        this.btnSecondCAQuery.setForeground(Color.red);
        this.btnThirdCAQueryWindows.setBackground(Color.black);
        this.btnThirdCAQueryWindows.setForeground(Color.red);
        this.btnExamQueryWindow.setBackground(Color.black);
        this.btnExamQueryWindow.setForeground(Color.red);
        this.btnClose.setBackground(Color.white);
        this.btnClose.setForeground(Color.black.darker());
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(this.btnFeesSpecification);
        Buttogrp1.add(Box.createVerticalStrut(20));        
        Buttogrp1.add(this.btnCategorizeStudent);
        Buttogrp1.add(Box.createVerticalStrut(20));
        Buttogrp1.add(this.btnStudentPaymentSystem2);
        Buttogrp1.add(Box.createVerticalStrut(20));
        Buttogrp1.add(this.btnStudentPaymentReport);
        Buttogrp1.add(Box.createVerticalStrut(20));
        Buttogrp1.add(this.btnStudentInvoiceReport);        
        Buttogrp1.add(Box.createVerticalStrut(20));
        Buttogrp1.add(this.btnContinousPayment);
        Buttogrp1.add(Box.createVerticalStrut(20));
        this.addItem(this.panel, Buttogrp1, 0, 0, 1, 1, 10);
        final Box Buttogrp2 = Box.createHorizontalBox();
        Buttogrp2.add(this.btnFirstCAQuery);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnSecondCAQuery);
        Buttogrp2.add(Box.createVerticalStrut(10));
        final Box Buttogrp3 = Box.createVerticalBox();
        Buttogrp3.add(this.btnClose);
        this.addItem(this.panel, Buttogrp3, 3, 0, 1, 1, 10);
        final Box ExamQueryButton = Box.createHorizontalBox();
        ExamQueryButton.add(this.btnExamQueryWindow);
        ExamQueryButton.add(Box.createVerticalStrut(10));
        this.btnFeesSpecification.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                subFeesManagement.this.btnFeesSpecificationWindowthod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                subFeesManagement.this.btnCloseMethod(evt2);
            }
        });
        this.btnStudentPaymentSystem.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                subFeesManagement.this.btnStudentPaymentSystemMethod(evt3);
            }
        });
        this.btnStudentPaymentSystem2.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                subFeesManagement.this.btnStudentPaymentSystemMethod2(evt4);
            }
        });
        this.btnStudentPaymentReport.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                subFeesManagement.this.btnStudentPaymentReport(evt8);
            }
        });
        
        this.btnContinousPayment.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                subFeesManagement.this.btnContinousPaymentMthd(evt9);
            }
        });
        
        this.btnCategorizeStudent.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                subFeesManagement.this.btnCategorizeStudentMthd(evt10);
            }
        });
        this.btnStudentInvoiceReport.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                subFeesManagement.this.btnStudentInvoiceReport(evt11);
            }
        });
        
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
    
    public void btnFeesSpecificationWindowthod(final ActionEvent evt1) {
        final SchoolFeesSpecification fsc = new SchoolFeesSpecification();
        fsc.SchoolFeesSpecification();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnReportSheetOutputType1Method(final ActionEvent evt3) {
        final ReportSheet RS1 = new ReportSheet();
        RS1.ReportSheet();
    }
    
    public void btnStudentPaymentSystemMethod(final ActionEvent evt3) {
        final StudentPaymentSys sps = new StudentPaymentSys();
        sps.newStudentFeesManagement();
    }
    
    public void btnStudentPaymentSystemMethod2(final ActionEvent evt4) {
        final paymentSys sps2 = new paymentSys();
        sps2.paymentSys();
    }
    
    public void btnSecondCAQueryMethod(final ActionEvent evt5) {
        final SecondCAQuery sat = new SecondCAQuery();
        sat.SecondCAQuery();
    }
    
    public void btnThirdCAQueryWindowsMethod(final ActionEvent evt6) {
        final ThirdCAQuery tCA = new ThirdCAQuery();
        tCA.ThirdCAQuery();
    }
    
    public void btnStaffRegQueryWindowthod(final ActionEvent evt7) {
        final StaffRegQuery SRQ = new StaffRegQuery();
        SRQ.StaffRegQuery();
    }
    
    public void btnStudentPaymentReport(final ActionEvent evt8) {
        final schfeesPaymentReport sfp = new schfeesPaymentReport();
        sfp.schfeesPaymentReport();
    }
   
    public void btnContinousPaymentMthd(final ActionEvent evt9) {
        final continousPayment bcl = new continousPayment();
        bcl.continousPayment();
    }
    
    public void btnCategorizeStudentMthd(final ActionEvent evt10) {
        final CategorizeStudents ctztd = new CategorizeStudents();
        ctztd.CategorizeStudents();
    }
   
    
    public void btnStudentInvoiceReport(final ActionEvent evt11) {
        final studentInvoiceReport schfir = new studentInvoiceReport();
        schfir.studentInvoiceReport();
    }
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
