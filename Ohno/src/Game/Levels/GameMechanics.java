package Game.Levels;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Game.Levels.*;

public class GameMechanics {
    private final Color bg = new Color(44, 44, 44);
    private final Color blue = new Color(0, 89, 190);
    private final Color yellow = new Color(255, 213, 0);
    private List<Color> initialColors = new ArrayList<>();
    private List<Color> empty;
    private JLabel levelName;
    private JPanel panelContainer;
    private CardLayout cl;
    private int gridSize;
    private String level;

    public GameMechanics(List<JButton> buttons, JButton btnReset, JButton btnReturn4X, JLabel levelName, int gridSize, String level, JPanel panelContainer, CardLayout cl) {
        this.gridSize = gridSize;
        this.level = level;
        this.levelName = levelName;
        this.panelContainer = panelContainer;
        this.cl = cl;

        empty = new ArrayList<>();
        for (int i = 0; i < gridSize; i++) {
            empty.add(bg);
        }

        btnReturn4X.addActionListener(e->{
            createLevel(buttons);
        });

        btnReset.addActionListener(e -> {
            resetButtons(buttons);
        });
        createLevel(buttons);
        for (JButton b : buttons) {
            b.addActionListener(e -> {
                if (b.getBackground().equals(bg)) {
                    b.setBackground(yellow);
                } else if (b.getBackground().equals(yellow)) {
                    b.setBackground(blue);
                } else {
                    b.setBackground(bg);
                }
                try {
                    checkRules(buttons);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            });
        }
    }

    private void createLevel(List<JButton> buttons) {
        initialColors.clear();
        List<String> lines = new ArrayList<>();
        InputStream in = getClass().getClassLoader().getResourceAsStream(level);


        if(gridSize == 4){
            levelName.setText("4 x 4");
        } else if(gridSize == 6){
            levelName.setText("6 x 6");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(in));) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.trim());
            }

            int totalBlocks = lines.size() / gridSize;
            int randomStart = new Random().nextInt(totalBlocks) * gridSize;

            int buttonIndex = 0;
            for (int i = randomStart; i < randomStart + gridSize; i++) {
                String[] lineArr = lines.get(i).split(",");
                for (String s : lineArr) {
                    if (buttonIndex < buttons.size()) {
                        s = s.trim();
                        Color color;
                        if (s.equals("1")) {
                            color = yellow;
                        } else if (s.equals("2")) {
                            color = blue;
                        } else {
                            color = bg;
                        }
                        buttons.get(buttonIndex).setBackground(color);
                        initialColors.add(color);
                        buttonIndex++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void resetButtons(List<JButton> buttons) {
        for (int i = 0; i < buttons.size(); i++) {
            if (i < initialColors.size()) {
                buttons.get(i).setBackground(initialColors.get(i));
            }
        }
    }

    private void checkRules(List<JButton> buttons) throws InterruptedException {
        checkThreeInARow(buttons);
        duplicateChecker(buttons);
        boolean isValid = checkThreeInARow(buttons);
        boolean hasDuplicate = duplicateChecker(buttons);
        solvedChecker(buttons, isValid, hasDuplicate, cl, panelContainer);
    }

    private boolean duplicateChecker(List<JButton> buttons) {

        for (int i = 0; i < gridSize; i++) {
            List<Color> row1 = new ArrayList<>();
            for (int r1 = 0; r1 < gridSize; r1++) {
                row1.add(buttons.get(i * gridSize + r1).getBackground());
            }

            if (row1.equals(empty) || row1.contains(bg)) continue;

            for (int j = i + 1; j < gridSize; j++) {
                List<Color> row2 = new ArrayList<>();
                for (int r2 = 0; r2 < gridSize; r2++) {
                    row2.add(buttons.get(j * gridSize + r2).getBackground());
                }
                if (row2.equals(empty) || row1.contains(bg)) continue;

                if (row1.equals(row2)) {
                    levelName.setText("Duplicate rows and columns");
                    return false;
                }
            }
        }
        return true;
    }


    private boolean checkThreeInARow(List<JButton> buttons) {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize - 2; j++) {
                Color c1 = buttons.get(i * gridSize + j).getBackground();
                Color c2 = buttons.get(i * gridSize + j + 1).getBackground();
                Color c3 = buttons.get(i * gridSize + j + 2).getBackground();

                if (c1.equals(c2) && c2.equals(c3)) {
                    if (c1.equals(yellow)) {
                        levelName.setText("Cannot have 3 yellows in a row");
                        return false;
                    } else if (c1.equals(blue)) {
                        levelName.setText("Cannot have 3 blues in a row");
                        return false;
                    } else {
                        levelName.setText(" ");
                    }
                }
            }
        }

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize - 2; j++) {
                Color c1 = buttons.get(j * gridSize + i).getBackground();
                Color c2 = buttons.get((j + 1) * gridSize + i).getBackground();
                Color c3 = buttons.get((j + 2) * gridSize + i).getBackground();

                if (c1.equals(c2) && c2.equals(c3)) {
                    if (c1.equals(yellow)) {
                        levelName.setText("Cannot have 3 yellows in a row");
                        return false;
                    } else if (c1.equals(blue)) {
                        levelName.setText("Cannot have 3 blues in a row");
                        return false;
                    } else {
                        levelName.setText(" ");
                    }
                }
            }
        }

        return true;
    }

    private void solvedChecker(List<JButton> buttons, boolean isValid, boolean hasDuplicate, CardLayout cl,JPanel panelContainer) throws InterruptedException {

        if (!isValid && !hasDuplicate) return;

        for (JButton b : buttons) {
            if (b.getBackground().equals(bg)) {
                return;
            }
        }

        if(isValid && hasDuplicate){
            Thread.sleep(2500);
            createLevel(buttons);
            cl.show(panelContainer, "Ending");
        }

    }



}
