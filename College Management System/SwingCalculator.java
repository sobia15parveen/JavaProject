import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

// script package introduced in Java 1.6
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

class SwingCalculator implements ActionListener, KeyListener {

    JTextField io;
    ScriptEngine engine;
    ArrayList<JButton> controls;

    SwingCalculator() {
        // obtain a reference to the JS engine
        engine = new ScriptEngineManager().
            getEngineByExtension( "js" );

        JPanel gui = new JPanel(new BorderLayout(2,2));
        controls = new ArrayList<JButton>();

        JPanel text = new JPanel(new GridLayout(0,1,3,3));
        gui.add(text, BorderLayout.NORTH);
        io = new JTextField(15);
        Font font = io.getFont();
        font = font.deriveFont(font.getSize()*1.7f);
        io.setFont(font);
        io.setHorizontalAlignment(SwingConstants.TRAILING);
        io.setFocusable(false);
        text.add(io);

        JPanel buttons = new JPanel(new GridLayout(4,4,2,2));
        gui.add(buttons, BorderLayout.CENTER);
        addButton(buttons, "7");
        addButton(buttons, "8");
        addButton(buttons, "9");
        addButton(buttons, "/");

        addButton(buttons, "4");
        addButton(buttons, "5");
        addButton(buttons, "6");
        addButton(buttons, "*");

        addButton(buttons, "1");
        addButton(buttons, "2");
        addButton(buttons, "3");
        addButton(buttons, "-");

        addButton(buttons, "0");
        addButton(buttons, ".");
        addButton(buttons, "C");
        addButton(buttons, "+");

        JButton equals = new JButton("=");
        equals.addKeyListener(this);
        controls.add(equals);
        equals.addActionListener(this);
        gui.add(equals,BorderLayout.EAST);

        gui.setBorder(new EmptyBorder(5,5,5,5));

        JFrame f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(gui);
        f.pack();
        f.setMinimumSize(f.getSize());
        f.setLocationByPlatform(true);
        f.setVisible(true);
    }

    public void addButton(Container c, String text) {
        JButton b = new JButton(text);
        b.addActionListener(this);
        b.addKeyListener(this);
        controls.add(b);
        c.add(b);
    }

    public void calculateResult() {
        try {
            Object result = engine.eval(io.getText());
            if (result==null) {
                io.setText( "Output was 'null'" );
            } else {
                io.setText( result.toString() );
            }
        } catch(ScriptException se) {
            io.setText( se.getMessage() );
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("C")) {
            io.setText("");
        } else if (command.equals("=")) {
            calculateResult();
        } else {
            io.setText(io.getText() + command);
        }
    }

    private JButton getButton(String text) {
        for (JButton button : controls) {
            String s = button.getText();
            if (text.endsWith(s) ||
                (s.equals("=") &&
                (text.equals("Equals") || text.equals("Enter"))) ) {

                return button;
            }
        }
        return null;
    }

    /* START - Because I hate mice. */
    public void keyPressed(KeyEvent ke) {}
    public void keyReleased(KeyEvent ke) {
        String s = ke.getKeyText(ke.getKeyCode());
        JButton b = getButton(s);
        if (b!=null) {
            b.requestFocusInWindow();
            b.doClick();
        }
    }
    public void keyTyped(KeyEvent ke) {
    }
    /* END - Because I hate mice. */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SwingCalculator sc = new SwingCalculator();
            }
        });
    }
}