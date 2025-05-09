package Game;

import Game.Levels.GameMechanics;
import Game.cursor.CustomCursor;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class MyGame extends JFrame{
    private JPanel mainPnl;
    private JPanel mainMenu;
    private JButton btnPlay;
    private JButton btnAbout;
    private JPanel menuButtons;
    private JPanel aboutPnl;
    private JLabel description;
    private JLabel siteLink;
    private JButton btnBack;
    private JPanel pnlPlay;
    private JButton btn4X;
    private JButton btn6X;
    private JButton btn8X;
    private JButton btn10X;
    private JButton btn12X;
    private JButton btnReturn;
    private JPanel pnlSize4;
    private JButton btn4X13;
    private JButton btn4X1;
    private JButton btn4X9;
    private JButton btn4X5;
    private JButton btn4X2;
    private JButton btn4X3;
    private JButton btn4X4;
    private JButton btn4X8;
    private JButton btn4X12;
    private JButton btn4X11;
    private JButton btn4X7;
    private JButton btn4X6;
    private JButton btn4X10;
    private JButton btn4X14;
    private JButton btn4X15;
    private JButton btn4X16;
    private JButton btnReturn4x;
    private JButton btnReset4x;
    private JPanel pnlSize6;
    private JButton btn6X1;
    private JButton btn6X2;
    private JButton btn6X3;
    private JButton btn6X4;
    private JButton btn6X5;
    private JButton btn6X6;
    private JButton btn6X7;
    private JButton btn6X8;
    private JButton btn6X9;
    private JButton btn6X10;
    private JButton btn6X11;
    private JButton btn6X12;
    private JButton btn6X13;
    private JButton btn6X14;
    private JButton btn6X15;
    private JButton btn6X16;
    private JButton btn6X17;
    private JButton btn6X18;
    private JButton btn6X19;
    private JButton btn6X20;
    private JButton btn6X21;
    private JButton btn6X22;
    private JButton btn6X23;
    private JButton btn6X24;
    private JButton btn6X25;
    private JButton btn6X26;
    private JButton btn6X27;
    private JButton btn6X28;
    private JButton btn6X29;
    private JButton btn6X30;
    private JButton btn6X31;
    private JButton btn6X32;
    private JButton btn6X33;
    private JButton btn6X34;
    private JButton btn6X35;
    private JButton btn6X36;
    private JButton btnReturn6x;
    private JButton btnReset6x;
    private JButton btnExit;
    private JLabel levelName4x;
    private JLabel levelName6x;
    private JPanel endPnl;
    private JButton btnEnd;
    private JPanel pnlSize8;
    private JButton btnReturn8x;
    private JButton btnReset8x;
    private JButton btn8X1;
    private JButton btn8X2;
    private JButton btn8X3;
    private JButton btn8X4;
    private JButton btn8X5;
    private JButton btn8X6;
    private JButton btn8X7;
    private JButton btn8X8;
    private JButton btn8X9;
    private JButton btn8X10;
    private JButton btn8X11;
    private JButton btn8X12;
    private JButton btn8X13;
    private JButton btn8X14;
    private JButton btn8X15;
    private JButton btn8X16;
    private JButton btn8X17;
    private JButton btn8X18;
    private JButton btn8X19;
    private JButton btn8X20;
    private JButton btn8X21;
    private JButton btn8X22;
    private JButton btn8X24;
    private JButton btn8X25;
    private JButton btn8X26;
    private JButton btn8X27;
    private JButton btn8X28;
    private JButton btn8X29;
    private JButton btn8X30;
    private JButton btn8X31;
    private JButton btn8X32;
    private JButton btn8X33;
    private JButton btn8X34;
    private JButton btn8X35;
    private JButton btn8X36;
    private JButton btn8X37;
    private JButton btn8X38;
    private JButton btn8X39;
    private JButton btn8X40;
    private JButton btn8X41;
    private JButton btn8X42;
    private JButton btn8X43;
    private JButton btn8X44;
    private JButton btn8X45;
    private JButton btn8X46;
    private JButton btn8X47;
    private JButton btn8X48;
    private JButton btn8X49;
    private JButton btn8X50;
    private JButton btn8X51;
    private JButton btn8X52;
    private JButton btn8X53;
    private JButton btn8X54;
    private JButton btn8X55;
    private JButton btn8X56;
    private JButton btn8X57;
    private JButton btn8X58;
    private JButton btn8X59;
    private JButton btn8X60;
    private JButton btn8X61;
    private JButton btn8X62;
    private JButton btn8X63;
    private JButton btn8X64;
    private JButton btn8X23;
    private JLabel levelName8x;
    private JPanel pnlSize10;
    private JLabel levelName10x;
    private JButton btnReturn10x;
    private JButton btnReset10x;
    private JButton btn10x1;
    private JButton btn10x2;
    private JButton btn10x3;
    private JButton btn10x4;
    private JButton btn10x5;
    private JButton btn10x6;
    private JButton btn10x7;
    private JButton btn10x8;
    private JButton btn10x9;
    private JButton btn10x10;
    private JButton btn10x11;
    private JButton btn10x12;
    private JButton btn10x13;
    private JButton btn10x14;
    private JButton btn10x15;
    private JButton btn10x16;
    private JButton btn10x17;
    private JButton btn10x18;
    private JButton btn10x19;
    private JButton btn10x20;
    private JButton btn10x21;
    private JButton btn10x22;
    private JButton btn10x23;
    private JButton btn10x24;
    private JButton btn10x25;
    private JButton btn10x26;
    private JButton btn10x27;
    private JButton btn10x28;
    private JButton btn10x29;
    private JButton btn10x30;
    private JButton btn10x31;
    private JButton btn10x32;
    private JButton btn10x33;
    private JButton btn10x34;
    private JButton btn10x35;
    private JButton btn10x36;
    private JButton btn10x37;
    private JButton btn10x38;
    private JButton btn10x39;
    private JButton btn10x40;
    private JButton btn10x41;
    private JButton btn10x42;
    private JButton btn10x43;
    private JButton btn10x44;
    private JButton btn10x45;
    private JButton btn10x46;
    private JButton btn10x47;
    private JButton btn10x48;
    private JButton btn10x49;
    private JButton btn10x50;
    private JButton btn10x51;
    private JButton btn10x52;
    private JButton btn10x53;
    private JButton btn10x54;
    private JButton btn10x55;
    private JButton btn10x56;
    private JButton btn10x57;
    private JButton btn10x58;
    private JButton btn10x59;
    private JButton btn10x60;
    private JButton btn10x61;
    private JButton btn10x62;
    private JButton btn10x63;
    private JButton btn10x64;
    private JButton btn10x65;
    private JButton btn10x66;
    private JButton btn10x67;
    private JButton btn10x68;
    private JButton btn10x69;
    private JButton btn10x70;
    private JButton btn10x71;
    private JButton btn10x72;
    private JButton btn10x73;
    private JButton btn10x74;
    private JButton btn10x75;
    private JButton btn10x76;
    private JButton btn10x77;
    private JButton btn10x78;
    private JButton btn10x79;
    private JButton btn10x80;
    private JButton btn10x81;
    private JButton btn10x82;
    private JButton btn10x83;
    private JButton btn10x84;
    private JButton btn10x85;
    private JButton btn10x86;
    private JButton btn10x87;
    private JButton btn10x88;
    private JButton btn10x89;
    private JButton btn10x90;
    private JButton btn10x91;
    private JButton btn10x92;
    private JButton btn10x93;
    private JButton btn10x94;
    private JButton btn10x95;
    private JButton btn10x96;
    private JButton btn10x97;
    private JButton btn10x98;
    private JButton btn10x99;
    private JButton btn10x100;
    private JPanel pnlSize12;
    private JLabel levelName12x;
    private JButton btnReturn12x;
    private JButton btnReset12x;
    private JButton btn12x1;
    private JButton btn12x2;
    private JButton btn12x3;
    private JButton btn12x4;
    private JButton btn12x5;
    private JButton btn12x6;
    private JButton btn12x7;
    private JButton btn12x8;
    private JButton btn12x9;
    private JButton btn12x10;
    private JButton btn12x11;
    private JButton btn12x12;
    private JButton btn12x13;
    private JButton btn12x14;
    private JButton btn12x15;
    private JButton btn12x16;
    private JButton btn12x17;
    private JButton btn12x18;
    private JButton btn12x19;
    private JButton btn12x20;
    private JButton btn12x21;
    private JButton btn12x22;
    private JButton btn12x23;
    private JButton btn12x24;
    private JButton btn12x25;
    private JButton btn12x26;
    private JButton btn12x27;
    private JButton btn12x28;
    private JButton btn12x29;
    private JButton btn12x30;
    private JButton btn12x31;
    private JButton btn12x32;
    private JButton btn12x33;
    private JButton btn12x34;
    private JButton btn12x35;
    private JButton btn12x36;
    private JButton btn12x37;
    private JButton btn12x38;
    private JButton btn12x39;
    private JButton btn12x40;
    private JButton btn12x41;
    private JButton btn12x42;
    private JButton btn12x43;
    private JButton btn12x44;
    private JButton btn12x45;
    private JButton btn12x46;
    private JButton btn12x47;
    private JButton btn12x48;
    private JButton btn12x49;
    private JButton btn12x50;
    private JButton btn12x51;
    private JButton btn12x52;
    private JButton btn12x53;
    private JButton btn12x54;
    private JButton btn12x55;
    private JButton btn12x56;
    private JButton btn12x57;
    private JButton btn12x58;
    private JButton btn12x59;
    private JButton btn12x60;
    private JButton btn12x61;
    private JButton btn12x62;
    private JButton btn12x63;
    private JButton btn12x64;
    private JButton btn12x65;
    private JButton btn12x66;
    private JButton btn12x67;
    private JButton btn12x68;
    private JButton btn12x69;
    private JButton btn12x70;
    private JButton btn12x71;
    private JButton btn12x72;
    private JButton btn12x73;
    private JButton btn12x74;
    private JButton btn12x75;
    private JButton btn12x76;
    private JButton btn12x77;
    private JButton btn12x78;
    private JButton btn12x79;
    private JButton btn12x80;
    private JButton btn12x81;
    private JButton btn12x82;
    private JButton btn12x83;
    private JButton btn12x84;
    private JButton btn12x85;
    private JButton btn12x86;
    private JButton btn12x87;
    private JButton btn12x88;
    private JButton btn12x89;
    private JButton btn12x90;
    private JButton btn12x91;
    private JButton btn12x92;
    private JButton btn12x93;
    private JButton btn12x94;
    private JButton btn12x95;
    private JButton btn12x96;
    private JButton btn12x97;
    private JButton btn12x98;
    private JButton btn12x99;
    private JButton btn12x100;
    private JButton btn12x101;
    private JButton btn12x102;
    private JButton btn12x103;
    private JButton btn12x104;
    private JButton btn12x105;
    private JButton btn12x106;
    private JButton btn12x107;
    private JButton btn12x108;
    private JButton btn12x109;
    private JButton btn12x110;
    private JButton btn12x111;
    private JButton btn12x112;
    private JButton btn12x113;
    private JButton btn12x114;
    private JButton btn12x115;
    private JButton btn12x116;
    private JButton btn12x117;
    private JButton btn12x118;
    private JButton btn12x119;
    private JButton btn12x120;
    private JButton btn12x121;
    private JButton btn12x122;
    private JButton btn12x123;
    private JButton btn12x124;
    private JButton btn12x125;
    private JButton btn12x126;
    private JButton btn12x127;
    private JButton btn12x128;
    private JButton btn12x129;
    private JButton btn12x130;
    private JButton btn12x131;
    private JButton btn12x132;
    private JButton btn12x133;
    private JButton btn12x134;
    private JButton btn12x135;
    private JButton btn12x136;
    private JButton btn12x137;
    private JButton btn12x138;
    private JButton btn12x139;
    private JButton btn12x140;
    private JButton btn12x141;
    private JButton btn12x142;
    private JButton btn12x143;
    private JButton btn12x144;
    //private JLabel lblSelect;
    public List<JButton> button4x = new ArrayList<>(List.of(
            btn4X1, btn4X2, btn4X3, btn4X4,
            btn4X5, btn4X6, btn4X7, btn4X8,
            btn4X9, btn4X10, btn4X11, btn4X12,
            btn4X13, btn4X14, btn4X15, btn4X16
    ));
    public List<JButton> button6x = new ArrayList<>(List.of(
            btn6X1, btn6X2, btn6X3, btn6X4, btn6X5, btn6X6,
            btn6X7, btn6X8, btn6X9, btn6X10, btn6X11, btn6X12,
            btn6X13, btn6X14, btn6X15, btn6X16, btn6X17, btn6X18,
            btn6X19, btn6X20, btn6X21, btn6X22, btn6X23, btn6X24,
            btn6X25, btn6X26, btn6X27, btn6X28, btn6X29, btn6X30,
            btn6X31, btn6X32, btn6X33, btn6X34, btn6X35, btn6X36
    ));
    public List<JButton> button8x = new ArrayList<>(List.of(
            btn8X1, btn8X2, btn8X3, btn8X4, btn8X5, btn8X6,
            btn8X7, btn8X8, btn8X9, btn8X10, btn8X11, btn8X12,
            btn8X13, btn8X14, btn8X15, btn8X16, btn8X17, btn8X18,
            btn8X19, btn8X20, btn8X21, btn8X22, btn8X23,
            btn8X24, btn8X25, btn8X26, btn8X27, btn8X28, btn8X29,
            btn8X30, btn8X31, btn8X32, btn8X33, btn8X34, btn8X35,
            btn8X36, btn8X37, btn8X38, btn8X39, btn8X40, btn8X41,
            btn8X42, btn8X43, btn8X44, btn8X45, btn8X46, btn8X47,
            btn8X48, btn8X49, btn8X50, btn8X51, btn8X52, btn8X53,
            btn8X54, btn8X55, btn8X56, btn8X57, btn8X58, btn8X59,
            btn8X60, btn8X61, btn8X62, btn8X63, btn8X64
    ));

    public List<JButton> button10x = new ArrayList<>(List.of(
            btn10x1, btn10x2, btn10x3, btn10x4, btn10x5, btn10x6, btn10x7, btn10x8, btn10x9, btn10x10,
            btn10x11, btn10x12, btn10x13, btn10x14, btn10x15, btn10x16, btn10x17, btn10x18, btn10x19, btn10x20,
            btn10x21, btn10x22, btn10x23, btn10x24, btn10x25, btn10x26, btn10x27, btn10x28, btn10x29, btn10x30,
            btn10x31, btn10x32, btn10x33, btn10x34, btn10x35, btn10x36, btn10x37, btn10x38, btn10x39, btn10x40,
            btn10x41, btn10x42, btn10x43, btn10x44, btn10x45, btn10x46, btn10x47, btn10x48, btn10x49, btn10x50,
            btn10x51, btn10x52, btn10x53, btn10x54, btn10x55, btn10x56, btn10x57, btn10x58, btn10x59, btn10x60,
            btn10x61, btn10x62, btn10x63, btn10x64, btn10x65, btn10x66, btn10x67, btn10x68, btn10x69, btn10x70,
            btn10x71, btn10x72, btn10x73, btn10x74, btn10x75, btn10x76, btn10x77, btn10x78, btn10x79, btn10x80,
            btn10x81, btn10x82, btn10x83, btn10x84, btn10x85, btn10x86, btn10x87, btn10x88, btn10x89, btn10x90,
            btn10x91, btn10x92, btn10x93, btn10x94, btn10x95, btn10x96, btn10x97, btn10x98, btn10x99, btn10x100
    ));

    public List<JButton> button12x = new ArrayList<>(List.of(
            btn12x1, btn12x2, btn12x3, btn12x4, btn12x5, btn12x6, btn12x7, btn12x8, btn12x9, btn12x10,
            btn12x11, btn12x12, btn12x13, btn12x14, btn12x15, btn12x16, btn12x17, btn12x18, btn12x19, btn12x20,
            btn12x21, btn12x22, btn12x23, btn12x24, btn12x25, btn12x26, btn12x27, btn12x28, btn12x29, btn12x30,
            btn12x31, btn12x32, btn12x33, btn12x34, btn12x35, btn12x36, btn12x37, btn12x38, btn12x39, btn12x40,
            btn12x41, btn12x42, btn12x43, btn12x44, btn12x45, btn12x46, btn12x47, btn12x48, btn12x49, btn12x50,
            btn12x51, btn12x52, btn12x53, btn12x54, btn12x55, btn12x56, btn12x57, btn12x58, btn12x59, btn12x60,
            btn12x61, btn12x62, btn12x63, btn12x64, btn12x65, btn12x66, btn12x67, btn12x68, btn12x69, btn12x70,
            btn12x71, btn12x72, btn12x73, btn12x74, btn12x75, btn12x76, btn12x77, btn12x78, btn12x79, btn12x80,
            btn12x81, btn12x82, btn12x83, btn12x84, btn12x85, btn12x86, btn12x87, btn12x88, btn12x89, btn12x90,
            btn12x91, btn12x92, btn12x93, btn12x94, btn12x95, btn12x96, btn12x97, btn12x98, btn12x99, btn12x100,
            btn12x101, btn12x102, btn12x103, btn12x104, btn12x105, btn12x106, btn12x107, btn12x108, btn12x109, btn12x110,
            btn12x111, btn12x112, btn12x113, btn12x114, btn12x115, btn12x116, btn12x117, btn12x118, btn12x119, btn12x120,
            btn12x121, btn12x122, btn12x123, btn12x124, btn12x125, btn12x126, btn12x127, btn12x128, btn12x129, btn12x130,
            btn12x131, btn12x132, btn12x133, btn12x134, btn12x135, btn12x136, btn12x137, btn12x138, btn12x139, btn12x140,
            btn12x141, btn12x142, btn12x143, btn12x144
    ));



    MyGame() {
        CardLayout cl = new CardLayout();
        JPanel panelContainer = new JPanel(cl);

        panelContainer.add(mainMenu, "Main Menu");
        panelContainer.add(pnlPlay, "Play");
        panelContainer.add(aboutPnl, "About");
        panelContainer.add(pnlSize4, "Size 4");
        panelContainer.add(pnlSize6, "Size 6");
        panelContainer.add(pnlSize8, "Size 8");
        panelContainer.add(pnlSize10, "Size 10");
        panelContainer.add(pnlSize12, "Size 12");
        panelContainer.add(endPnl, "Ending");

        btnAbout.addActionListener(e -> cl.show(panelContainer, "About"));
        btnBack.addActionListener(e -> cl.show(panelContainer, "Main Menu"));
        btnPlay.addActionListener(e -> cl.show(panelContainer, "Play"));
        btnReturn4x.addActionListener(e -> cl.show(panelContainer, "Play"));
        btnReturn6x.addActionListener(e -> cl.show(panelContainer, "Play"));
        btnReturn8x.addActionListener(e -> cl.show(panelContainer, "Play"));
        btnReturn10x.addActionListener(e -> cl.show(panelContainer, "Play"));
        btnReturn12x.addActionListener(e -> cl.show(panelContainer, "Play"));
        btnReturn.addActionListener(e -> cl.show(panelContainer, "Main Menu"));
        btn4X.addActionListener(e -> {cl.show(panelContainer, "Size 4");});
        btn6X.addActionListener(e -> {cl.show(panelContainer, "Size 6");});
        btn8X.addActionListener(e -> {cl.show(panelContainer, "Size 8");});
        btn10X.addActionListener(e -> {cl.show(panelContainer, "Size 10");});
        btn12X.addActionListener(e -> {cl.show(panelContainer, "Size 12");});
        btnEnd.addActionListener(e -> {cl.show(panelContainer, "Main Menu");});
        btnExit.addActionListener(e -> System.exit(0));

//        setCursor(CustomCursor.getCursor("Game/assets/cursor/arrow.png"));
//        Cursor handCursor = CustomCursor.getCursor("Game/assets/cursor/hand.png");
//
//        btnPlay.setCursor(handCursor);
//        btnAbout.setCursor(handCursor);
//        siteLink.setCursor(handCursor);
//        btnBack.setCursor(handCursor);
//        btnReturn.setCursor(handCursor);
//        btnReturn4x.setCursor(handCursor);
//        btnReset4x.setCursor(handCursor);
//        btnReturn6x.setCursor(handCursor);
//        btnReset6x.setCursor(handCursor);
//        btnReturn8x.setCursor(handCursor);
//        btnReset8x.setCursor(handCursor);
//        btnReturn10x.setCursor(handCursor);
//        btnReset10x.setCursor(handCursor);
//        btnReturn12x.setCursor(handCursor);
//        btnReset12x.setCursor(handCursor);
//        btnExit.setCursor(handCursor);
//        btn4X.setCursor(handCursor);
//        btn6X.setCursor(handCursor);
//        btn8X.setCursor(handCursor);
//        btn10X.setCursor(handCursor);
//        btn12X.setCursor(handCursor);
//        btnEnd.setCursor(handCursor);

        description.setText("<html><center>Oh no is my attempt <br>to replicate the game <br>\"OhHi\". Original game <br>linked below. </html>");
        ImageIcon icon = new ImageIcon("C:/Users/User/Desktop/0hh1/mygame/assets/logo.png");
        siteLink.setIcon(icon);
        siteLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://0hh1.com/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        new GameMechanics(button4x, btnReset4x, btnReturn4x, levelName4x, 4, "Game/Levels/levels4x",panelContainer, cl);
        new GameMechanics(button6x, btnReset6x, btnReturn6x, levelName6x, 6, "Game/Levels/levels6x",panelContainer, cl);
        new GameMechanics(button8x, btnReset8x, btnReturn8x, levelName8x, 8, "Game/Levels/levels8x",panelContainer, cl);
        new GameMechanics(button10x, btnReset10x, btnReturn10x, levelName10x, 10, "Game/Levels/levels10x",panelContainer, cl);
        new GameMechanics(button12x, btnReset12x, btnReturn12x, levelName12x, 12, "Game/Levels/levels12x",panelContainer, cl);
        //System.out.println("Current directory: " + System.getProperty("user.dir"));

        setContentPane(panelContainer);
    }


    public static void main(String[] args){
        MyGame app = new MyGame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setUndecorated(true);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        if (gd.isFullScreenSupported()) {
            gd.setFullScreenWindow(app);
        } else {
            System.out.println("Fullscreen not supported, falling back to maximized window.");
            app.setExtendedState(JFrame.MAXIMIZED_BOTH);
            app.setVisible(true);
        }
    }


}