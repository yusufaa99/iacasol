import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
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

public class CASubCommentMenu extends JFrame implements ActionListener
{
    private JPanel panel;
    private JButton btnProprietor;
    private JButton btnPrincipal;
    private JButton btnFormMaster;
    private JButton btnHouseMaster;
    private JButton btnClose;
    
    public void CASubCommentMenu() {
        this.panel = new JPanel();
        this.btnProprietor = new JButton("C.A. Proprietor's Comment");
        this.btnPrincipal = new JButton("C.A. Principal's Comment");
        this.btnFormMaster = new JButton("C.A. Form Master's Comment");
        this.btnHouseMaster = new JButton("C.A. House Master's Comment");
        this.btnClose = new JButton("Close");
        this.panel.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("LogoInReportSheet.gif").getImage());
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(900, 120);
        this.setTitle("C.A. Sub Comment Main Window - For Secondary School");
        this.add(this.panel);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.panel.setBackground(Color.GRAY.brighter());
        this.btnProprietor.setBackground(Color.black);
        this.btnProprietor.setForeground(Color.WHITE);
        this.btnPrincipal.setBackground(Color.black);
        this.btnPrincipal.setForeground(Color.WHITE);
        this.btnClose.setBackground(Color.black);
        this.btnClose.setForeground(Color.WHITE);
        this.btnFormMaster.setBackground(Color.black);
        this.btnFormMaster.setForeground(Color.WHITE);
        this.btnHouseMaster.setBackground(Color.black);
        this.btnHouseMaster.setForeground(Color.WHITE);
        this.addItem(this.panel, this.btnProprietor, 0, 1, 1, 1, 10);
        this.addItem(this.panel, this.btnPrincipal, 1, 1, 1, 1, 10);
        this.addItem(this.panel, this.btnHouseMaster, 2, 1, 1, 1, 13);
        this.addItem(this.panel, this.btnFormMaster, 3, 1, 1, 1, 13);
        this.addItem(this.panel, this.btnClose, 4, 1, 1, 1, 13);
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e1) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt1) {
                CASubCommentMenu.this.btnCloseMethod(evt1);
            }
        });
        this.btnProprietor.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e2) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt2) {
                CASubCommentMenu.this.btnProprietorMethod(evt2);
            }
        });
        this.btnPrincipal.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e3) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt3) {
                CASubCommentMenu.this.btnPrincipalMethod(evt3);
            }
        });
        this.btnFormMaster.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e4) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt4) {
                CASubCommentMenu.this.btnFormMasterMethod(evt4);
            }
        });
        this.btnHouseMaster.addActionListener(new ActionListener() {
            public void actionPerfomed(final ActionEvent e5) {
            }
            
            @Override
            public void actionPerformed(final ActionEvent evt5) {
                CASubCommentMenu.this.btnHouseMasterMethod(evt5);
            }
        });
    }
    
    @Override
    public void actionPerformed(final ActionEvent arg0) {
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
    
    public void btnCloseMethod(final ActionEvent evt1) {
        this.dispose();
    }
    
    public void btnProprietorMethod(final ActionEvent evt2) {
        final CAProprietorComment CAPC = new CAProprietorComment();
        CAPC.CAProprietorComment();
    }
    
    public void btnPrincipalMethod(final ActionEvent evt3) {
        final CAPrincipalCOmment CAPC = new CAPrincipalCOmment();
        CAPC.CAPrincipalCOmment();
    }
    
    public void btnFormMasterMethod(final ActionEvent evt4) {
        final CAFormMasterComment CAFMC = new CAFormMasterComment();
        CAFMC.CAFormMasterComment();
    }
    
    public void btnHouseMasterMethod(final ActionEvent evt5) {
        final CAHouseMasterComment CAHC = new CAHouseMasterComment();
        CAHC.CAHouseMasterComment();
    }
}
