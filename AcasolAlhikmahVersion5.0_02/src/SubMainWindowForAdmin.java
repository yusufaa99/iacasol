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
import javax.swing.JLabel;

// 
// Decompiled by Procyon v0.5.36
// 

public class SubMainWindowForAdmin extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnStaffDataEntryWindows;
    private JButton btnUserCreationWindow;
    private JButton btnEditingWindows;
    private JButton btnPromotionWindow;
    private JButton btnMigrationWindow;
    private JButton btnDemotionWindow;
    private JButton btnDeletingWindow;
    private JButton btnClassAndSubjectReg;
    private JButton btnStaffDataEntryWindow;
    private JButton btnPasswordEditing;
    private JButton btnFeesSpec;
    private JButton btnClose;
    private JButton btnSpecifyMAXnoINclass;
    private JLabel lblTest;
    public void SubMainWindowForAdmin() {
        this.panel = new JPanel();
        this.btnStaffDataEntryWindows = new JButton("STAFF DATA ENTRY WINDOWS");
        this.btnUserCreationWindow = new JButton("USER CREATION");
        this.btnEditingWindows = new JButton("EDITING");
        this.btnPromotionWindow = new JButton("PROMOTION");
        this.btnMigrationWindow = new JButton("MIGRATION");
        this.btnDemotionWindow = new JButton("DEMOTION");
        this.btnClassAndSubjectReg = new JButton("(CLASS/SUBJ)_REG");
        this.btnDeletingWindow = new JButton("DELETE");
        this.btnStaffDataEntryWindow = new JButton("STAFF DATA ENTRY");
        this.btnPasswordEditing = new JButton("EDIT PASSWORD");
        this.btnFeesSpec = new JButton("FeesSpec");
        this.btnClose = new JButton("Close");
        this.btnSpecifyMAXnoINclass = new JButton(" SpecifyMAXnoINclass ");
     
         
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1030, 99);
        this.setTitle("Sub Main Window For Admin - For the Schools");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.orange.darker());
        this.btnUserCreationWindow.setBackground(Color.black);
        this.btnUserCreationWindow.setForeground(Color.red);
        this.btnEditingWindows.setBackground(Color.black);
        this.btnEditingWindows.setForeground(Color.red);
        this.btnPromotionWindow.setBackground(Color.black);
        this.btnPromotionWindow.setForeground(Color.red);
        this.btnMigrationWindow.setBackground(Color.black);
        this.btnMigrationWindow.setForeground(Color.WHITE);
        this.btnDemotionWindow.setBackground(Color.black);
        this.btnDemotionWindow.setForeground(Color.WHITE);
        this.btnClassAndSubjectReg.setBackground(Color.black);
        this.btnClassAndSubjectReg.setForeground(Color.WHITE);
        this.btnStaffDataEntryWindow.setBackground(Color.black);
        this.btnStaffDataEntryWindow.setForeground(Color.red);
        this.btnPasswordEditing.setBackground(Color.black);
        this.btnPasswordEditing.setForeground(Color.red);
        this.btnFeesSpec.setBackground(Color.black);
        this.btnFeesSpec.setForeground(Color.red);
        this.btnDeletingWindow.setBackground(Color.black);
        this.btnDeletingWindow.setForeground(Color.red);
        this.btnSpecifyMAXnoINclass.setBackground(Color.black);
        this.btnSpecifyMAXnoINclass.setForeground(Color.white);
        
        
        this.btnClose.setBackground(Color.white);
        this.btnClose.setForeground(Color.black);
        final Box Buttogrp1 = Box.createHorizontalBox();
        Buttogrp1.add(this.btnStaffDataEntryWindows);
        Buttogrp1.add(Box.createVerticalStrut(10));
        final Box Buttogrp2 = Box.createHorizontalBox();
        Buttogrp2.add(this.btnUserCreationWindow);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnEditingWindows);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnPromotionWindow);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnMigrationWindow);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnDeletingWindow);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnStaffDataEntryWindow);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnPasswordEditing);
        Buttogrp2.add(Box.createVerticalStrut(10));
        Buttogrp2.add(this.btnClassAndSubjectReg);
        
        Buttogrp2.add(Box.createVerticalStrut(10));
       // Buttogrp2.add(this.lblTest);
        
        
        this.addItem(this.panel, Buttogrp2, 0, 0, 1, 1, 10);
        final Box Buttogrp3 = Box.createVerticalBox();
        Buttogrp3.add(this.btnClose);
        this.addItem(this.panel, Buttogrp3, 4, 0, 1, 1, 10);
        this.btnStaffDataEntryWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                SubMainWindowForAdmin.this.btnStaffDataEntryWindowsMethod(evt1);
            }
        });
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                SubMainWindowForAdmin.this.btnCloseMethod(evt2);
            }
        });
        this.btnUserCreationWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                SubMainWindowForAdmin.this.btnUserCreationWindowMethod(evt3);
            }
        });
        this.btnStaffDataEntryWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                SubMainWindowForAdmin.this.btnStaffDataEntryWindowMethod(evt4);
            }
        });
        this.btnPromotionWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e6) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt6) {
                SubMainWindowForAdmin.this.btnPromotionWindowMethod(evt6);
            }
        });
        this.btnEditingWindows.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e7) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt7) {
                SubMainWindowForAdmin.this.btnEditingWindowsMethod(evt7);
            }
        });
        this.btnPasswordEditing.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e8) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt8) {
                SubMainWindowForAdmin.this.btnPasswordEditingMethod(evt8);
            }
        });
        this.btnSpecifyMAXnoINclass.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e9) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt9) {
                SubMainWindowForAdmin.this.btnSpecifyMAXnoINclassMethod(evt9);
            }
        });
        this.btnClassAndSubjectReg.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e10) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt10) {
                SubMainWindowForAdmin.this.btnClassAndSubjectReg(evt10);
            }
        });
        this.btnDeletingWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e11) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt11) {
                SubMainWindowForAdmin.this.btnDeletingWindowMethod(evt11);
            }
        });
        this.btnFeesSpec.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e12) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt12) {
                SubMainWindowForAdmin.this.btnFeesSpecMethod(evt12);
            }
        });
        this.btnMigrationWindow.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e13) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt13) {
                SubMainWindowForAdmin.this.btnMigrationWindowMethod(evt13);
            }
        });
    }
    
    public JLabel getLblTest() {
		return lblTest;
	}

	public void setLblTest(JLabel lblTest) {
		this.lblTest = lblTest;
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
    
    public void btnStaffDataEntryWindowsMethod(final ActionEvent evt1) {
        final DataEntryWindowForAdmin sdw = new DataEntryWindowForAdmin();
        sdw.DataEntryWindowForAdmin();
    }
    
    public void btnCloseMethod(final ActionEvent evt2) {
        this.dispose();
    }
    
    public void btnUserCreationWindowMethod(final ActionEvent evt3) {
        final UserCreationWindow ucw = new UserCreationWindow();
        ucw.UserCreationWindow();
    }
    
    public void btnStaffDataEntryWindowMethod(final ActionEvent evt4) {
        final DataEntryWindowForAdmin sdw = new DataEntryWindowForAdmin();
        sdw.DataEntryWindowForAdmin();
    }
    
    public void btnPromotionWindowMethod(final ActionEvent evt6) {
        final Promotion_Sub_Menu p = new Promotion_Sub_Menu();
        p.Promotion_Sub_Menu();
    }
    
    public void btnEditingWindowsMethod(final ActionEvent evt7) {
        final EditAuthenticateWindow eaw = new EditAuthenticateWindow();
        eaw.EditAuthenticateWindow();
    }
    
    public void btnPasswordEditingMethod(final ActionEvent evt8) {
        final PasswordEditing pw = new PasswordEditing();
        pw.PasswordEditing();
    }
    
    public void btnSpecifyMAXnoINclassMethod(final ActionEvent evt9) {
        final SpecifyMAXnoINclass maxinclass = new SpecifyMAXnoINclass();
        maxinclass.SpecifyMAXnoINclass();
    }
    
    public void btnClassAndSubjectReg(final ActionEvent evt10) {
        final ClassAndSubjectReg ds = new ClassAndSubjectReg();
        ds.ClassAndSubjectReg();
    }
    
    public void btnDeletingWindowMethod(final ActionEvent evt11) {
        final DeleteStudent ds = new DeleteStudent();
        ds.DeleteStudent();
    }
    
    public void btnFeesSpecMethod(final ActionEvent evt12) {
        final FeesSpec fs = new FeesSpec();
        fs.FeesSpec();
    }
    
    public void btnMigrationWindowMethod(final ActionEvent evt13) {
        final Migration mg = new Migration();
        mg.Migration();
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
    }
}
