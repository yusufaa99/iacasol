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

public class MainMenu extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnAdministrator;
    private JButton btnFormMaster;
    private JButton btnSubjectTeacher;
    private JButton btnReportOrOutputWindows;
    private JButton btnEditingWindows;
    private JButton btnQueryWindows;
    private JButton btnClose;
    
    public MainMenu() {
        this.panel = new JPanel();
        this.btnAdministrator = new JButton("ADMINISTRATOR");
        this.btnFormMaster = new JButton("FORM MASTER");
        this.btnSubjectTeacher = new JButton("SUBJECT TEACHER");
        this.btnReportOrOutputWindows = new JButton("OUTPUT WINDOWS");
        this.btnEditingWindows = new JButton("EDITING WINDOWS");
        this.btnQueryWindows = new JButton("QUERY WINDOWS");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(500, 120);
        this.setTitle("Main Menu Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.green.darker());
        this.btnAdministrator.setBackground(Color.black);
        this.btnAdministrator.setForeground(Color.red);
        this.btnFormMaster.setBackground(Color.black);
        this.btnFormMaster.setForeground(Color.red);
        this.btnSubjectTeacher.setBackground(Color.black);
        this.btnSubjectTeacher.setForeground(Color.red);
        this.btnClose.setBackground(Color.black);
        this.btnClose.setForeground(Color.red);
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(this.btnAdministrator);
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(this.btnFormMaster);
        Buttogrp1.add(Box.createVerticalStrut(30));
        Buttogrp1.add(this.btnSubjectTeacher);
        this.addItem(this.panel, Buttogrp1, 0, 0, 1, 1, 10);
        final Box Buttogrp2 = Box.createVerticalBox();
        Buttogrp2.add(this.btnClose);
        this.addItem(this.panel, Buttogrp2, 1, 0, 1, 1, 10);
        this.btnAdministrator.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                MainMenu.this.btnbtnAdministratorMethod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                MainMenu.this.btnCloseMethod(evt2);
            }
        });
        this.btnReportOrOutputWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                MainMenu.this.btnReportOrOutputWindowsMethod(evt3);
            }
        });
        this.btnFormMaster.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                MainMenu.this.btnbtnFormMasterMethod(evt4);
            }
        });
        this.btnSubjectTeacher.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                MainMenu.this.btnSubjectTeacherMethod(evt5);
            }
        });
    }
    
    public static void main(final String[] args) {
        new MainMenu();
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
    
    public void btnbtnAdministratorMethod(final ActionEvent evt1) {
        final DataEntryWindow dew = new DataEntryWindow();
        dew.DataEntryWindow();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnReportOrOutputWindowsMethod(final ActionEvent evt3) {
        final SubOutputWindow sow = new SubOutputWindow();
        sow.SubOutputWindow();
    }
    
    public void btnbtnFormMasterMethod(final ActionEvent evt4) {
    }
    
    public void btnSubjectTeacherMethod(final ActionEvent evt5) {
        final ReportSheetCompilation rsc = new ReportSheetCompilation();
        rsc.ReportSheetCompilation();
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
