package com.doh.theater;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LinearLayout extends JPanel {
    final public static int HORIZONTAL = 0;
    final public static int VERTICAL = 1;

    final public static int CENTER = 0;

    public LinearLayout(int orientation) {
        super();
        setLayout(new BoxLayout(this, orientation));
    }

    //TODO: Add all gravities
    public void setGravity(int gravity){
        Component[] components = getComponents();
        switch (gravity){
            case 0:
                for (Component component: components) {
                    JComponent jComponent = (JComponent) component;
                    jComponent.setAlignmentX(Component.CENTER_ALIGNMENT);
                }
                break;
        }
    }

    //This method should be in a parent class
    public void setPadding(int padding){
        Border border = BorderFactory.createEmptyBorder(padding, padding, padding, padding);
        setBorder(border);
    }
}
