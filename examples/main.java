import com.doh.theater.Scene;
import com.doh.theater.SceneDirector;

import javax.swing.*;

/**
 * Created by javierlunamolina on 22/9/16.
 */
public class main {

    public static void main(String[] args){

    SceneDirector.getInstance().startShow(SceneEjemplo.class);
    }
}
