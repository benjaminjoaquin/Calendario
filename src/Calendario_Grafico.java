import java.awt.*;
import java.awt.event.*;
//import java.io.*;
import javax.swing.*;
public class Calendario_Grafico extends Calendary
{
    public int ancho=900;
    public int alto=750;
       public JTextField Text1;
       
       public JTextArea area1 ;
       public JTextArea area2 ;
       public JTextArea area3 ;
       public JTextArea area4 ;
       public JTextArea area5 ;
       public JTextArea area6 ;
       public JTextArea area7 ;
       public JTextArea area8 ;
       public JTextArea area9 ;
       public JTextArea area10 ;
       public JTextArea area11 ;
       public JTextArea area12 ;
       
  
 
    public JScrollPane barra;
            
  public JButton consultar;
  public JButton nuevo;
    public JButton salir;
    public JLabel etiqueta1;
  
  public Calendario_Grafico () {
         area1=new JTextArea();
         area2=new JTextArea();
         area3=new JTextArea();
         area4=new JTextArea();
         area5=new JTextArea();
         area6=new JTextArea();
         area7=new JTextArea();
         area8=new JTextArea();
         area9=new JTextArea();
         area10=new JTextArea();
         area11=new JTextArea();
         area12=new JTextArea();
         area1.setEditable (false);
         area2.setEditable (false);
         area3.setEditable (false);
         area4.setEditable (false);
         area5.setEditable (false);
         area6.setEditable (false);
         area7.setEditable (false);
         area8.setEditable (false);
         area9.setEditable (false);
         area10.setEditable (false);
         area11.setEditable (false);
         area12.setEditable (false);
         
        Toolkit kit=Toolkit.getDefaultToolkit();
         Dimension tamaniopantalla=kit.getScreenSize();
         int anchopantalla=tamaniopantalla.width;
         int altopantalla=tamaniopantalla.height;
         setTitle("                            :::CALENDARIO_JULIANO:::");
         setLocation((anchopantalla - ancho)/2,(altopantalla - alto)/2 );
         setSize(ancho, alto);
         setResizable(false);
         getContentPane().setLayout(null);
        // getContentPane().setBackground(Color.pink);
         
         area1.setBackground(Color.white);
         area1.setBounds(50,100,180,180);  
         getContentPane().add(area1);
         
         area2.setBackground(Color.pink);
         area2.setBounds(250,100,180,180);  
         getContentPane().add(area2);
         
         area3.setBackground(Color.white);
         area3.setBounds(450,100,180,180);  
         getContentPane().add(area3);
         
         area4.setBackground(Color.pink);
         area4.setBounds(650,100,180,180);  
         getContentPane().add(area4);
         
         area5.setBackground(Color.pink);
         area5.setBounds(50,300,180,180);  
         getContentPane().add(area5);
         
         area6.setBackground(Color.white);
         area6.setBounds(250,300,180,180);  
         getContentPane().add(area6);
         
         area7.setBackground(Color.pink);
         area7.setBounds(450,300,180,180);  
         getContentPane().add(area7);
       
         area8.setBackground(Color.white);
         area8.setBounds(650,300,180,180);  
         getContentPane().add(area8);
         
         area9.setBackground(Color.white);
         area9.setBounds(50,500,180,180);  
         getContentPane().add(area9);
         
         area10.setBackground(Color.pink);
         area10.setBounds(250,500,180,180);  
         getContentPane().add(area10);
         
         area11.setBackground(Color.white);
         area11.setBounds(450,500,180,180);  
         getContentPane().add(area11);
         
         area12.setBackground(Color.pink);
         area12.setBounds(650,500,180,180);  
         getContentPane().add(area12);
         
           consultar=new JButton("Consultar");
          consultar.setBounds(500,50,90,40);
          getContentPane().add(consultar);
         
            nuevo=new JButton("Nuevo");
          nuevo.setBounds(600,50,90,40);
          getContentPane().add(nuevo);
          
            salir=new JButton("Salir");
          salir.setBounds(700,50,90,40);
          getContentPane().add(salir);
         
        Text1=new JTextField(10);
        Text1.setBounds(410, 50, 60, 30);
        getContentPane().add(Text1);
        
          etiqueta1 = new JLabel();
          etiqueta1.setForeground(Color.black); 
          etiqueta1.setFont(new java.awt.Font("Arial",1,15));
           etiqueta1.setBounds(10,10, 400, 100);
              etiqueta1.setText("Introduzca el año del calendario que desea consultar");
                 getContentPane().add(etiqueta1);
         
             ActionListener accion = new java.awt.event.ActionListener()
       {
         public void actionPerformed(java.awt.event.ActionEvent evento){
                   Object obj=evento.getSource();
                   
                   
                            if (obj==consultar){    
                                    anio  =Integer.parseInt(Text1.getText());
                   //  dispose();
                   if (anio>1&&anio<1000000){
               
                 //  x();
                  
                   crearCalendario();
                }else{Text1.setText("");
                   JOptionPane.showMessageDialog(null, "Introduzca un año en el rango de 1 y 1,000,000");}
           
                        }
                        
                           if (obj==nuevo){  
                            new Calendario_Grafico().setVisible(true);
                             dispose(); 
                        }
                              if (obj==salir){  dispose(); }
                        
                    }                 
       };        
                     
          consultar.addActionListener(accion);     
          nuevo.addActionListener(accion);  
          salir.addActionListener(accion);  
    }

public void x(){
   Calendary Calendario= new Calendary ();
   Calendario.y(anio);
}
  
    public void crearCalendario() {
           while(mesn<=12){
     //   crearMes();
                switch (mesn){
        
        case 1:   area1.append (""+crearMes());
                  break; 
            
        case 2:   area2.append (""+crearMes());
                  break;   
            
        case 3:    area3.append (""+crearMes());
                  break;  
            
        case 4:   area4.append (""+crearMes());
                  break;  
            
        case 5:    area5.append (""+crearMes());
                  break;     
            
        case 6:   area6.append (""+crearMes());
                  break;    
        
            
        case 7:  area7.append (""+crearMes());
                  break;  
                  
        case 8:   area8.append (""+crearMes());
                  break;
            
        case 9:   area9.append (""+crearMes());
                  break;
            
        case 10:   area10.append (""+crearMes());
                  break;

        case 11:   area11.append (""+crearMes());
                  break;
            
        case 12:   area12.append (""+crearMes());
                  break;
                }      
               // System.out.print("\n\n");    
       mesn=mesn+1;
                            }
        
                }                               
                              
    
        public static void main(String args[]) {
        new Calendario_Grafico().setVisible(true);
                                             }
}
