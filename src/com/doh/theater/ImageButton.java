package com.doh.theater;

import javax.swing.*;

public class ImageButton extends JButton {

    public ImageButton(Icon icon){
        super(icon);
        setFocusPainted(false);
    }

    public ImageButton(Icon iconDefault, Icon iconRollover, Icon iconPressed){
        super(iconDefault);
        setRolloverIcon(iconRollover);
        setPressedIcon(iconPressed);
        setFocusPainted(false);
    }

    //This method should be in a parent class
    //setBackground boolean?
    public void setBackground(boolean background){
        if(!background){
            setContentAreaFilled(false);
            setBorderPainted(false);
            setBorder(BorderFactory.createEmptyBorder());
        }
    }

}
