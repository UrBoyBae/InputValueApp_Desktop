/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasinilaisiswa;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Administrator
 */
public class Background extends JDesktopPane{
    //create objek Image
    Image img;
    
    //method untuk memulai setting image ke dalam jDesktopPane
    protected void paintComponent(Graphics g){
        Graphics2D graphics = (Graphics2D) g.create();
        
        //memanggil file image dengan nama bg.jpg
        img = new ImageIcon(getClass().getResource("/images/bgfix3.jpg")).getImage();
        
        //menggambar image serta menyesuaikan ukurannya dengan panjang dan lebar dari ukuran monitor
        graphics.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        //men-set image tersebut sesuai dengan resource dari image tersebut berada
        graphics.dispose();
        
        
    }
}
