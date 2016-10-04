import com.doh.theater.ImageButton;
import com.doh.theater.LinearLayout;
import com.doh.theater.Scene;
import com.doh.theater.TextView;

import javax.swing.*;
import java.awt.*;

/**
 * Created by javierlunamolina on 22/9/16.
 */
public class SceneEjemplo extends Scene {
    @Override
    public void onCreate() {
        LinearLayout linearLayout = new LinearLayout(LinearLayout.VERTICAL);
        setContentPane(linearLayout);

        ImageIcon iconDefault = new ImageIcon("examples//images//iconDefault.png");
        ImageIcon iconRollover = new ImageIcon("examples//images//iconRollover.png");
        ImageIcon iconPressed = new ImageIcon("examples//images//iconPressed.png");


        ImageButton imageButton = new ImageButton(iconDefault, iconRollover, iconPressed);
        imageButton.setBackground(false);

        TextView textView1 = new TextView("<html>Este es un TextView con layout_width = wrap_content " +
                "y layout_height = wrap_content</html>");

        textView1.setLayoutParams(TextView.WRAP_CONTENT, TextView.WRAP_CONTENT);
        textView1.setBackground(new Color(255, 0, 0));

        TextView textView2 = new TextView("<html>Este es un TextView con layout_width = match_parent " +
                "y layout_height = wrap_content</html>");

        textView2.setLayoutParams(TextView.MATCH_PARENT, TextView.WRAP_CONTENT);
        textView2.setBackground(new Color(0, 0, 255));

        TextView textView3 = new TextView("<html>Este es un TextView con layout_width = match_parent " +
                "y layout_height = match_parent</html>");
        textView3.setLayoutParams(TextView.MATCH_PARENT, TextView.MATCH_PARENT);
        textView3.setBackground(new Color(0, 255, 0));

        linearLayout.add(imageButton);
        linearLayout.add(textView1);
        linearLayout.add(textView2);
        linearLayout.add(textView3);

        linearLayout.setGravity(0);
        setSize(1000,800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
