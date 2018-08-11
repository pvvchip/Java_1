package com.home.java1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Win extends JFrame {
    public Win() throws HeadlessException {
        setBounds(100, 100, 400, 400);
        setTitle("My first GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        JPanel[] jp = new JPanel[4];
        for (int i = 0; i < 4; i++) {
            jp[i] = new JPanel();
            this.add(jp[i]);
            jp[i].setBackground(new Color(100 + i * 40, 100 + i * 40, 100 + i * 40));
        }

        jp[0].setLayout(new BorderLayout());
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        jp[0].add(jsp);

        jp[1].setLayout(new FlowLayout());
        JRadioButton[] rb = new JRadioButton[4];
        ButtonGroup bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            if (i ==2) {
                rb[i] = new JRadioButton("Option #" + i, true);
            } else rb[i] = new JRadioButton("Option #" + i);
            bg.add(rb[i]);
            jp[1].add(rb[i]);
        }
        JCheckBox[] cb = new JCheckBox[4];
        for (int i = 0; i < 4; i++){
            if (i == 3){
                cb[i] = new JCheckBox("Check #" + i, true);
            } else cb[i] = new JCheckBox("Check #" + i);
            jp[1].add(cb[i]);
        }

        jp[2].setLayout(new FlowLayout());
        String[] comboStr = {"Item #1", "Item #2", "Item #3", "Item #4"};
        JComboBox<String> jcombo1 = new JComboBox<>(comboStr);
        JComboBox<String> jcombo2 = new JComboBox<>(comboStr);
        JComboBox<String> jcombo3 = new JComboBox<>(comboStr);
        JComboBox<String> jcombo4 = new JComboBox<>(comboStr);
        jp[2].add(jcombo1);
        jp[2].add(jcombo2);
        jp[2].add(jcombo3);
        jp[2].add(jcombo4);

        jcombo1.addActionListener(actionEvent -> System.out.println("// jcombo #1"));
        jcombo2.addActionListener(actionEvent -> System.out.println("// jcombo #2"));
        jcombo3.addActionListener(actionEvent -> System.out.println("// jcombo #3"));
        jcombo4.addActionListener(actionEvent -> System.out.println("// jcombo #4"));

        jp[3].setLayout(new FlowLayout());
        JSlider js = new JSlider();
        JSlider js2 = new JSlider();
        JLabel jlab = new JLabel("Value: 50");
        js.setMaximum(100);
        js.setMinimum(0);
        js.setValue(50);
        js2.setMaximum(100);
        js2.setMinimum(0);
        js2.setValue(50);
        jp[3].add(jlab);
        jp[3].add(js);
        jp[3].add(js2);
        js.addChangeListener(e -> jlab.setText("Value: " + js.getValue()));
        js.addChangeListener(e -> System.out.println("Value: " + js.getValue()));
        js.addChangeListener(e -> js2.setValue(js.getValue()));
        js2.addChangeListener(e -> jlab.setText("Value: " + js.getValue()));
        js2.addChangeListener(e -> js.setValue(js2.getValue()));

        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileExit = new JMenuItem("Exit");
        JMenuItem miEditCut = new JMenuItem("Cut");
        JMenuItem miEditPaste = new JMenuItem("Paste");



        setJMenuBar(mainMenu);

        mainMenu.add(mFile);
        mainMenu.add(mEdit);

        mFile.add(miFileNew);
        mFile.addSeparator(); // разделительная линия
        mFile.add(miFileExit);
        miFileExit.addActionListener(e -> System.exit(0));

        mEdit.add(miEditCut);
        mEdit.add(miEditPaste);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println("Click");
            }
        });

        setVisible(true);
    }
}
