package com.doh.theater;

import com.sun.istack.internal.Nullable;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class Tooltip extends JToolTip{
    public static void setStyle(int style){
        switch (style){
            case 1:
                UIManager.put("ToolTip.background", new ColorUIResource(250, 250, 250));
                UIManager.put("ToolTip.border", BorderFactory.createLineBorder(new ColorUIResource(50,50,50)));
                UIManager.put("ToolTip.foreground", new ColorUIResource(50,50,50));
                break;
            case 2:
                UIManager.put("ToolTip.background", new ColorUIResource(76,79,83));
                UIManager.put("ToolTip.border", BorderFactory.createLineBorder(new ColorUIResource(76,79,83)));
                UIManager.put("ToolTip.foreground", new ColorUIResource(250, 250, 250));
                break;
            case 3:
                UIManager.put("ToolTip.background", new ColorUIResource(255, 247, 200));
                UIManager.put("ToolTip.border", BorderFactory.createLineBorder(new ColorUIResource(76,79,83)));
                break;
        }
    }

    public static void customTooltip(@Nullable ColorUIResource background, @Nullable ColorUIResource border,
                                        @Nullable FontUIResource font, @Nullable ColorUIResource textColor,
                                        @Nullable int dimissDelay){
        if(background != null) UIManager.put("ToolTip.background", background);
        if(border != null) UIManager.put("ToolTip.border", BorderFactory.createLineBorder(border));
        if(font != null) UIManager.put("ToolTip.font", font);
        if(background != null) UIManager.put("ToolTip.foreground", textColor);
        ToolTipManager.sharedInstance().setDismissDelay(dimissDelay);
    }
}
