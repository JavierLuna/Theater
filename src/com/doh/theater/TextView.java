package com.doh.theater;

import javax.swing.*;
import java.awt.*;

public class TextView extends JLabel {
    //This variables should be in a parent class
    final static public int WRAP_CONTENT = -2;
    final static public int MATCH_PARENT = -1;

    private Dimension preferredSize;
    private Dimension maximumSize;

    public TextView(String text){
        super(text);
        preferredSize = getPreferredSize();
        maximumSize = getMaximumSize();
    }

    //TODO: Research this
    //How to check that layout_width and layout_height are WRAP_CONTENT or MATCH_PARENT?
    //This method should be in a parent class
    public void setLayoutParams(int layout_width, int layout_height){
        Dimension dimension = new Dimension();
        double width = (layout_width == WRAP_CONTENT) ? preferredSize.getWidth() : maximumSize.getWidth();
        double height = (layout_height == WRAP_CONTENT) ? preferredSize.getHeight() : maximumSize.getWidth();
        dimension.setSize(width, height);
        setMaximumSize(dimension);
    }

    //This method should be in a parent class
    @Override
    public void setBackground(Color bg) {
        setOpaque(true);
        super.setBackground(bg);
    }
}
