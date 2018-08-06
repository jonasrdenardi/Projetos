package util;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class JDesktopPanePersonalizado extends JDesktopPane {

    private Image img;

    public JDesktopPanePersonalizado(String img_nome) {
        try {
            img = ImageIO.read(new URL(getClass().getResource("/images/"+img_nome), img_nome));
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            int cx = (this.getSize().width-img.getWidth(this))/2;
            int cy = (this.getSize().height-img.getHeight(this))/2;
            
            g.drawImage(img, cx, cy, img.getWidth(this),img.getHeight(this),this);
        }else{
            g.drawString("A imagem não foi encontrada", 100, 100);
        }
    }
    
}