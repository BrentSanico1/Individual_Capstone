//package Levels;
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Backup {
//    private final Color bg = new Color(44, 44, 44);
//    private final Color blue = new Color(0, 89, 190);
//    private final Color yellow = new Color(255, 213, 0);
//    private java.util.List<Color> initialColors = new ArrayList<>();
//    private final java.util.List<Color> empty = java.util.List.of(bg, bg, bg, bg);
//    public GameMechanics(java.util.List<JButton> buttons, JButton btnReset, JButton btnReturn4X, int gridSize) {
//
//        btnReturn4X.addActionListener(e->{
//            createLevel(buttons);
//        });
//
//        btnReset.addActionListener(e -> {
//            resetButtons(buttons);
//        });
//        createLevel(buttons);
//        for (JButton b : buttons) {
//            b.addActionListener(e -> {
//                if (b.getBackground().equals(bg)) {
//                    b.setBackground(yellow);
//                } else if (b.getBackground().equals(yellow)) {
//                    b.setBackground(blue);
//                } else {
//                    b.setBackground(bg);
//                }
//                checkRules(buttons);
//            });
//        }
//    }
//
//    private void createLevel(java.util.List<JButton> buttons) {
//        initialColors.clear();
//        java.util.List<String> lines = new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader("src/Levels/levels4x"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                lines.add(line.trim());
//            }
//
//            int totalBlocks = lines.size() / 4;
//            int randomStart = new Random().nextInt(totalBlocks) * 4;
//
//            int buttonIndex = 0;
//            for (int i = randomStart; i < randomStart + 4; i++) {
//                String[] lineArr = lines.get(i).split(",");
//                for (String s : lineArr) {
//                    if (buttonIndex < buttons.size()) {
//                        s = s.trim();
//                        Color color;
//                        if (s.equals("1")) {
//                            color = yellow;
//                        } else if (s.equals("2")) {
//                            color = blue;
//                        } else {
//                            color = bg;
//                        }
//                        buttons.get(buttonIndex).setBackground(color);
//                        initialColors.add(color);
//                        buttonIndex++;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void resetButtons(java.util.List<JButton> buttons) {
//        for (int i = 0; i < buttons.size(); i++) {
//            if (i < initialColors.size()) {
//                buttons.get(i).setBackground(initialColors.get(i));
//            }
//        }
//    }
//
//    private void checkRules(java.util.List<JButton> buttons) {
//        rowChecker(buttons);
//        colChecker(buttons);
//        duplicateChecker(buttons);
//    }
//
//    private void duplicateChecker(java.util.List<JButton> buttons) {
//
//        for (int i = 0; i < 4; i++) {
//            java.util.List<Color> row1 = new ArrayList<>();
//            for (int r1 = 0; r1 < 4; r1++) {
//                row1.add(buttons.get(i * 4 + r1).getBackground());
//            }
//
//            if (row1.equals(empty) || row1.contains(bg)) continue;
//
//            for (int j = i + 1; j < 4; j++) {
//                java.util.List<Color> row2 = new ArrayList<>();
//                for (int r2 = 0; r2 < 4; r2++) {
//                    row2.add(buttons.get(j * 4 + r2).getBackground());
//                }
//                if (row2.equals(empty) || row1.contains(bg)) continue;
//
//                if (row1.equals(row2)) {
//                    System.out.println("Duplicate rows: Row " + (i+1) + " and Row " + (j+1));
//                    return;
//                }
//            }
//        }
//    }
//
//
//    private void rowChecker(java.util.List<JButton> buttons) {
//        for (int i = 0; i < 4; i++) {
//            int yellowCount = 0;
//            int blueCount = 0;
//
//            for (int j = 0; j < 4; j++) {
//                JButton button = buttons.get(i * 4 + j);
//                if (button.getBackground().equals(yellow)) {
//                    yellowCount++;
//                } else if (button.getBackground().equals(blue)) {
//                    blueCount++;
//                }
//            }
//
//            if (yellowCount > 2) {
//                System.out.println("too much yellow (row)");
//            }
//
//            if (blueCount > 2) {
//                System.out.println("too much blue (row)");
//            }
//        }
//    }
//
//    private void colChecker(List<JButton> buttons) {
//        for (int i = 0; i < 4; i++) {
//            int yellowCount = 0;
//            int blueCount = 0;
//
//            for (int j = 0; j < 4; j++) {
//                JButton button = buttons.get(j * 4 + i);
//                if (button.getBackground().equals(yellow)) {
//                    yellowCount++;
//                } else if (button.getBackground().equals(blue)) {
//                    blueCount++;
//                }
//            }
//
//            if (yellowCount > 2) {
//                System.out.println("too much yellow (col)");
//            }
//
//            if (blueCount > 2) {
//                System.out.println("too much blue (col)");
//            }
//        }
//    }
//}
