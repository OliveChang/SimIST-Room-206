/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.CharacterMovement;
import models.Customer;
import controllers.RoomController;
import models.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author qpm5006
 */
//public final class Room206 extends JPanel implements KeyListener{
    

public class Room206 extends JPanel {
    public static final int ShelfWidth = 80;
    public static final int ShelfHight = 30;
    public static final int LongtableWidth = 309;
    public static final int LongtableHight = 40;
    public static final int ShorttableWidth = 95;
    public static final int ShorttableHight = 45;
    public static final int CornertableWidth = 114;
    public static final int CornertableHight = 62;
    public static final int WallNWidth = 1;
    public static final int WallNHight = 1;
    public static final int WallSWidth= 1;
    public static final int WallSHight = 1;
    public static final int WallWWidth = 1;
    public static final int WallWHight = 1;
    public static final int WallEWidth = 1;
    public static final int WallEHight = 1;


    private Rectangle shelf;
    private Rectangle longtable;
    private Rectangle shorttable;
    private Rectangle cornertable;
    private Rectangle wallN;
    private Rectangle wallS;
    private Rectangle wallW;
    private Rectangle wallE;
    private CharacterMovement characterMovement;
    private Customer student;

    private JLabel temp = new JLabel();

    public Room206(Customer inf_Student, CharacterMovement inf_charMovement) {
        super();
        student = inf_Student;
        characterMovement = inf_charMovement;
        setSize(642, 514);
        setLayout(null);
        add(temp);
        temp.setBounds(200,200,200,200);
        init();
        placeStations();
        this.addKeyListener(characterMovement);

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e)
            {
                //System.out.println(e.getPoint());
           
                temp.setText(e.getPoint().toString());
                
            }
        });
        this.setFocusable(true);
    }

    private void init() {
        shelf = new Rectangle();
        longtable = new Rectangle();
        shorttable = new Rectangle();
        cornertable = new Rectangle();
        wallN = new Rectangle();
        wallS = new Rectangle();
        wallW = new Rectangle();
        wallE = new Rectangle();
   
        
        
    }

    private void placeStations() {
        student.setBounds(475, 150, student.width, student.height);
        shelf.setBounds(383, 128, ShelfWidth, ShelfHight);
        longtable.setBounds(101, 113, LongtableWidth, LongtableHight);
        shorttable.setBounds(286, 258, ShorttableWidth, ShorttableHight);
        cornertable.setBounds(59, 192, CornertableWidth, CornertableHight);
        wallN.setBounds(111,111, WallNWidth, WallNHight);
        wallS.setBounds(111,111, WallSWidth, WallSHight);
        wallW.setBounds(111,111, WallWWidth, WallWHight);
        wallE.setBounds(111,111, WallEWidth, WallEHight);
    }

    public Rectangle getShelf()
    {
        return shelf;
    }
    
    public Rectangle getShorttable()
    {
        return shorttable;
    }
    
    public Rectangle getLongtable()
    {
        return longtable;
    }
    
    public Rectangle getCornertable()
    {
        return cornertable;
    }
     public Rectangle getWallN()
    {
        return cornertable;
    }
      public Rectangle getWallS()
    {
        return cornertable;
    }
       public Rectangle getWallW()
    {
        return cornertable;
    }
        public Rectangle getWallE()
    {
        return cornertable;
    }
    
   
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawImage(new ImageIcon("room206.png").getImage(), 0, 0, null);
        g.drawImage(new ImageIcon(characterMovement.getAnimation()).getImage(), student.x, student.y, null);

    }

}


    
    
//    int max = 3;
//    int[] [] map,maptmp;
//    int manX, manY,boxnum;
//    Image[] myImage;
//    Readmap map1;
//    Readmap maptmp1;
//    int len = 30;
//    int level = 1;
//    Stack mystack = new Stack();
//    
//    public Room206(Customer inf_Student, CharacterMovement inf_charMovement) {
//        super();
//        student = inf_Student;
//        characterMovement = inf_charMovement;
//        setSize(800, 600);
//        setLayout(null);
//        add(temp);
//        temp.setBounds(200, 200, 200, 200);
//        init();
//        placeStations();
//        this.addKeyListener(characterMovement);
//
//        this.addMouseMotionListener(new MouseAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e)
//            {
////                System.out.println(e.getPoint());
//                temp.setText(e.getPoint().toString());
//            }
//        });
//        this.setFocusable(true);
//    }
//    Room206(){
//        setSize(600,620);
//        setBounds(15,50,600,600);
//        setBackground(Color.white);
//        addKeyListener(this);
//       //  myImage = new Image[10];
//       // for(int i=0; i<10; i++){
//       //     myImage[i] = Toolkit.getDefaultToolkit().getImage("pic\\"+i+".gif");
//       // }
//        setVisible(true);
//        this.pushboxes(this.level);
//        this.requestFocus();
//        validate();
//    }
//    
//    void pushboxes(int i){
//        map1 = new Readmap(i);
//        maptmp1 = new Readmap(i);
//        map = map1.getmap();
//        manX = map1.getmanX();
//        manY = map1.getmanY();
//        maptmp = maptmp1.getmap();
//        repaint();
//        
//    }
//    
//   
//    
//    public void paint(Graphics g){
//         super.paint(g);
//
//        g.drawImage(new ImageIcon("new_Room.png").getImage(), 0, 0, null);
//        }
//       
//    
//    @Override
//    public void keyTyped(KeyEvent ke) {
//    }
//
//    @Override
//    public void keyPressed(KeyEvent ke) {
//        if (ke.getKeyCode() == KeyEvent.VK_UP){
//            moverup();
//        }
//        if (ke.getKeyCode() == KeyEvent.VK_DOWN){
//            movedown();
//        }
//        if(ke.getKeyCode() == KeyEvent.VK_LEFT){
//            moveleft();
//        }
//        if(ke.getKeyCode() == KeyEvent.VK_RIGHT){
//            moveright();
//            
//        }
//        if(unlock()){
//           
//                JOptionPane.showMessageDialog(this, "The Door Opened!");
//                mystack.removeAllElements();
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent ke) {
//    }
//    
//    boolean isMystackEmpty(){
//        return mystack.isEmpty();
//    }
//    void remove(){
//        mystack.removeAllElements();
//    }
//    int back() {
//        return (int) mystack.pop();
//    }
//
//    private void moverup() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void movedown() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void moveleft() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void moveright() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private boolean unlock() {
//        boolean num = false;
//        out: for(int i = 0; i<20; i++)
//                for (int j = 0; j<20; j++){
//            if(maptmp [i][j] == 4 || maptmp[i][j] ==9)
//                    if (map[i][j] ==9)
//                        num = true;
//                    else {
//                        num = false;
//                        break out;
//                            }
//            }
//        return num;            
//    }
//                
//
//}
//    
//
//
//class Readmap{
//    private int level , mx, my;
//    private int [] [] mymap = new int[20][20];
//    FileReader r;
//    BufferedReader br;
//    String bb="";
//    int []x;int c = 0;
//    Readmap(int k){
//        level = k;
//        String s;
//        try {
//            File f = new File("maps\\"+level+".map");
//            r = new FileReader (f);
//            br = new BufferedReader(r);
//        }
//        catch (IOException e){
//            System.out.println(e);
//        }
//    
//    try{
//     while ((s=br.readLine())!=null){
//	bb=bb+s;
//        }
//    }
//    catch (IOException g){
//	System.out.println(g);
//	}
//    
//    byte [] d = bb.getBytes();
//    int len = bb.length();
//    int [] x = new int[len];
//    for (int i=0; i<bb.length();i++)x[i] = d[i]-48;
//    for (int i=0; i<20; i++){
//        for(int j = 0; i <20; j++){
//            mymap[i][j]= x[c];
//            if(mymap [i][j] == 5){
//                mx = j;
//                my = i;
//            }
//            c++;
//        }
//    }
//    }
//    int [][] getmap(){
//        return mymap;
//    }
//    int getmanX(){
//        return mx;
//    }
//    int getmanY(){
//        return my;
//    }
//}
