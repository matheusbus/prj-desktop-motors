
package br.com.lojaveiculo.componentes;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Matheus
 */
public class PainelImagemFundo extends javax.swing.JPanel{
    
    private ImageIcon imagemFundo;
    
    public PainelImagemFundo(){
        imagemFundo = new ImageIcon();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(imagemFundo.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        
    }
     
    public void setImg(ImageIcon img){
        this.imagemFundo = img;
    }
    
    public ImageIcon getImg(){
        return this.imagemFundo;
    }
    
}
