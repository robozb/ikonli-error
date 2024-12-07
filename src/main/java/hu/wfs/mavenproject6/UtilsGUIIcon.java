/*
 *  Bela Roboz - WEBFocus
 *  info@webfocus.hu
 */
package hu.wfs.mavenproject6;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;
import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.swing.FontIcon;


/**
 *
 * @author Beci
 */
public class UtilsGUIIcon {
    
    // https://kordamp.org/ikonli/#_bootstrapicons
    // https://kordamp.org/ikonli/#_fontawesome5_latest
    // Refer to: Cheat-Sheet
    public static void setDeafultButtonIcon(JButton button,Ikon ikon) {
        FontIcon ficon=FontIcon.of(ikon);
        ficon.setIconSize(15);
        ficon.setIconColor(Color.decode("#878787"));
        button.setIcon(ficon);
        button.setMargin(new Insets(1, 2, 1, 2)); // Top, Left, Bottom, Righ
        button.setIconTextGap(8);
        //button.setText("");
        //button.setHorizontalAlignment(SwingConstants.LEFT);
    }
    
   
}
