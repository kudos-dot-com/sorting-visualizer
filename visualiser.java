import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
class rec

{
    public static void main()
    {   int i;
         JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(-10,150,1500,750);
        MyFrame x=new MyFrame();
        x.setBackground(Color.BLACK);
        //frame.add(x);
        frame.setTitle("sorting visualiser");
        frame.setResizable(false);
       
        x.input();
        x.bubblesort();
    }
}
class MyFrame extends JPanel
{
    //Container c;
    static int a[];
    int x,y;
    public static void input()
    {a=new int[500];
     for(int c=0;c<330;c++)
        {
            a[c]=((int)Math.ceil(Math.random()*100));
          }
    
    }
    public void disp()
    {
         System.out.println("\nnow");            
         for(int i=0;i<10;i++)
    {
        System.out.print(a[i]+" ");
    }
    }
    public void swap(int a,int b)
    {int t=0;
     t=a;
     a=b;
     b=t;
    }
    public  void sort()
    {  int i,j,t1=0;
        for(i=0;i<10;i++)
    {
        System.out.print(a[i]+" ");
    }
        for(i=0;i<329;i++)
        {
            for(j=i+1;j<330;j++)
            {
                if(a[i]>a[j])
                {   
                    t1=a[i];
                    a[i]=a[j];
                    a[j]=t1;
                    try{
                        disp();
                    TimeUnit.MILLISECONDS.sleep(1);
                repaint();
                x=i;y=j;
            }catch(Exception e)
            {
                System.out.println(e);
            }
                
                }
                
            }
    
  
    }
    repaint();
    System.out.println("sorted");
    for(i=0;i<10;i++)
    {
        System.out.println(a[i]);
    }
   
}
 public  void bubblesort()
    {  int i,j,t1=0;
        for(i=0;i<10;i++)
    {
        System.out.print(a[i]+" ");
    }
        for(i=0;i<329;i++)
        {
            for(j=0;j<(330-i);j++)
            {
                if(a[j]<a[j+1])
                {   
                    t1=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t1;
                    try{
                        disp();
                    TimeUnit.NANOSECONDS.sleep(1);
                repaint();
                x=j+1;y=j;
            }catch(Exception e)
            {
                System.out.println(e);
            }
                
                }
                
            }
    }}
    public void paint(Graphics g)
    {   
        this.setBackground(Color.BLACK);
        super.paint(g);
        
      
        g.setColor(Color.WHITE);
        g.drawLine(5,415,1500,415);
       
        int y=0,z=290;
        for(int i=0;i<330;i++,y+=2){
        if(i==x || i==y){
            g.setColor(Color.RED);}
            else
        {g.setColor(Color.WHITE);}
        g.fill3DRect((2*i)+30+y,415-(3*a[i]),2,3*a[i],true);
    }
    
        
    }}
