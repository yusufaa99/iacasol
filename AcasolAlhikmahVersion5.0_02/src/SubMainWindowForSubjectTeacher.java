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

public class SubMainWindowForSubjectTeacher extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnQueryWindows;
    private JButton btnDataEntryWindow;
    private JButton btnProcessingWindows;
    private JButton btnCompilationWindow;
    private JButton btnOutputWindow;
    private JButton btnClose;
    
    public void SubMainWindowForSubjectTeacher() {
        this.panel = new JPanel();
        this.btnQueryWindows = new JButton("QUERY WINDOWS");
        this.btnDataEntryWindow = new JButton("DATA ENTRY WINDOW");
        this.btnProcessingWindows = new JButton("PROCESSING WINDOWS");
        this.btnCompilationWindow = new JButton("COMPILATION");
        this.btnOutputWindow = new JButton("OUTPUT WINDOW");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(300, 120);
        this.setTitle("Sub Main Window For Subject Teacher- For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange.darker());
        this.btnDataEntryWindow.setForeground(Color.red.darker());
        this.btnProcessingWindows.setBackground(Color.black);
        this.btnProcessingWindows.setForeground(Color.red);
        this.btnCompilationWindow.setBackground(Color.black);
        this.btnCompilationWindow.setForeground(Color.red);
        this.btnOutputWindow.setBackground(Color.black);
        this.btnOutputWindow.setForeground(Color.red);
        this.btnQueryWindows.setBackground(Color.black);
        this.btnQueryWindows.setForeground(Color.red);
        this.btnClose.setBackground(Color.white);
        this.btnClose.setForeground(Color.black);
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(this.btnQueryWindows);
        Buttogrp1.add(Box.createVerticalStrut(10));
        final Box Buttogrp2 = Box.createHorizontalBox();
        Buttogrp2.add(this.btnDataEntryWindow);
        Buttogrp2.add(Box.createVerticalStrut(20));
        this.addItem(this.panel, Buttogrp2, 0, 0, 1, 1, 10);
        final Box Buttogrp3 = Box.createVerticalBox();
        Buttogrp3.add(this.btnClose);
        this.addItem(this.panel, Buttogrp3, 4, 0, 1, 1, 10);
        this.btnQueryWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                SubMainWindowForSubjectTeacher.this.btnQueryWindowsMethod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                SubMainWindowForSubjectTeacher.this.btnCloseMethod(evt2);
            }
        });
        this.btnDataEntryWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                SubMainWindowForSubjectTeacher.this.btnDataEntryWindowMethod(evt3);
            }
        });
        this.btnOutputWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                SubMainWindowForSubjectTeacher.this.btnOutputWindowMethod(evt4);
            }
        });
        this.btnCompilationWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                SubMainWindowForSubjectTeacher.this.btnCompilationWindowMethod(evt6);
            }
        });
        this.btnProcessingWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                SubMainWindowForSubjectTeacher.this.btnProcessingWindowsMethod(evt7);
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
    
    public void btnQueryWindowsMethod(final ActionEvent evt1) {
        final SubQueryWindow sqw = new SubQueryWindow();
        sqw.SubQueryWindow();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnDataEntryWindowMethod(final ActionEvent evt3) {
        final DataEntryWindow dew = new DataEntryWindow();
        dew.DataEntryWindow();
    }
    
    public void btnOutputWindowMethod(final ActionEvent evt4) {
        final SubOutputWindow sow = new SubOutputWindow();
        sow.SubOutputWindow();
    }
    
    public void btnCompilationWindowMethod(final ActionEvent evt6) {
        final ReportSheetCompilation rcw = new ReportSheetCompilation();
        rcw.ReportSheetCompilation();
    }
    
    public void btnProcessingWindowsMethod(final ActionEvent evt7) {
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
