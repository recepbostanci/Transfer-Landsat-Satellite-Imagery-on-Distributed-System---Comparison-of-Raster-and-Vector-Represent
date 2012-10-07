/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdesk2;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.image.RenderedImage;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.jws.WebService;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.naming.BinaryRefAddr;
import javax.swing.JOptionPane;

/**
 *
 * @author BSTNC
 */
public class MainMet {

    /**
     * @param args the command line arguments
     */
//    public String AnaMetot() {
//
//        long t1 = System.currentTimeMillis();
//        try {
//
//            String istekAdi = "2.png";
//
//            ImageTransferServicemService service = new ImageTransferServicemService();
//            ImageTransferServicem port = service.getImageTransferServicemPort();
//
//            byte[] image = port.rasterImageTransfer(istekAdi);
//            Binary2File("C:/resimler/ws-client/" + istekAdi, image);
//
//        } catch (Exception e) {
//        }
//
//        long t2 = System.currentTimeMillis();
//        return String.valueOf(t2 - t1);
//    }

    public ArrayList RasterImageAl(String istekAdi) {

        //JOptionPane.showMessageDialog(null, "client "+istekAdi+" istedi.-1");

        ArrayList al = new ArrayList();
        long t0 = 0, t1 = 0, t2 = 0;
        t0 = System.currentTimeMillis();
        try {
            ImageTransferServicemService service = new ImageTransferServicemService();
            ImageTransferServicem port = service.getImageTransferServicemPort();

            //JOptionPane.showMessageDialog(null, "client baglandi");
            byte[] image = port.rasterImageTransfer(istekAdi);
            //JOptionPane.showMessageDialog(null, "istek gonderildi");
            t1 = System.currentTimeMillis();

            al.add(t1 - t0);
            Binary2File("C:\\resimler\\ws-client\\" + istekAdi, image);
            t2 = System.currentTimeMillis();
            al.add(t2 - t0);
            //JOptionPane.showMessageDialog(null, "istek alindi");

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        //JOptionPane.showMessageDialog(null, "client "+istekAdi+" istedi.-2");
        return al;
    }

    public ArrayList VecctorImageAl(String istekAdi,String YON) {
         long t0 = 0, t1 = 0, t2 = 0;
         ArrayList al = new  ArrayList();
        try {

            t0 = System.currentTimeMillis(); //İSTEGIN GONDERİLDİĞİ YER
            ImageTransferServicemService service = new ImageTransferServicemService();
            ImageTransferServicem port = service.getImageTransferServicemPort();
            //            ArrayList al = (ArrayList) port.vectorImageTransfer(istekAdi,YON);
            //            Image image = drawVectorFromPoints((Vector) al.get(0), Integer.parseInt(al.get(1).toString()), Integer.parseInt(al.get(2).toString()));
            //            File kaydedilecek = new File("C:\\resimler\\ws-client\\v"+istekAdi+".png");
            //            ImageIO.write((RenderedImage) image, "png", kaydedilecek);
            Vector v = new Vector();
//            JOptionPane.showMessageDialog(null, "client baglandi");
            ArrayList l = (ArrayList) port.vectorImageTransfer(istekAdi,YON);
            for (int i = 2; i < l.size(); i = i + 2) {
                Point p = new Point(Integer.parseInt(l.get(i).toString()), Integer.parseInt(l.get(i+1).toString()));
                v.addElement(p);
//                System.out.println(Integer.parseInt(l.get(i).toString())+" "+ Integer.parseInt(l.get(i+1).toString()));
            }
            //Vector v = (Vector) l.get(0);
            //JOptionPane.showMessageDialog(null, port.vectorImageTransfer(istekAdi,YON));
//            JOptionPane.showMessageDialog(null, "client baglandi.2 Client tarafındaym. Vektor geldi");
            t1 = System.currentTimeMillis(); //İSTEGIN GONDERİLDİĞİ YER
            //ArrayList vWH = (ArrayList) port.vectorIcınWH();
            Image image = drawVectorFromPoints(v, Integer.parseInt(l.get(0).toString()), Integer.parseInt(l.get(1).toString()));
            File kaydedilecek = new File("C:\\resimler\\ws-client\\v" + istekAdi + ".png");
            ImageIO.write((RenderedImage) image, "png", kaydedilecek);
            t2 = System.currentTimeMillis(); //İSTEGIN GONDERİLDİĞİ YER
             al.add(t1 - t0);
             al.add(t2 - t0);
//            System.out.println(vWH.get(0).toString()+"  <wi he>  "+ vWH.get(1).toString());
        } catch (IOException ex) {
            Logger.getLogger(MainMet.class.getName()).log(Level.SEVERE, null, ex);
        }
         return al;

    }
     private BufferedImage drawVectorFromPoints(Vector points, int width, int height)
    {
   BufferedImage polygonImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2 = polygonImage.createGraphics();
        g2.setBackground(Color.BLACK);
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2.0f));

        for(int i=0; i<points.size()-1; i++)
        {
            Point p1 = (Point)points.get(i);
            g2.fillRect(p1.y, p1.x,1,1 );
        }

        return polygonImage;
    }

    private void Binary2File(String KaydetmeDizini, byte[] bytes) {

        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            Iterator<?> readers = ImageIO.getImageReadersByFormatName("png");
            ImageReader reader = (ImageReader) readers.next();
            Object source = bis; // File or InputStream, it seems file is OK
            ImageInputStream iis = ImageIO.createImageInputStream(source);
            //Returns an ImageInputStream that will take its input from the given Object
            reader.setInput(iis, true);
            ImageReadParam param = reader.getDefaultReadParam();
            Image image = reader.read(0, param);
            //got an image file
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            //bufferedImage is the RenderedImage to be written
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.drawImage(image, null, null);
            File imageFile = new File(KaydetmeDizini);
            ImageIO.write(bufferedImage, "png", imageFile);
        } catch (IOException ex) {
            //JOptionPane.showMessageDialog(null, ex);
        }
    }

    
}
