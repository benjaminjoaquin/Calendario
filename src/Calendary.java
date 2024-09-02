import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
//import java.io.*;

public class Calendary extends JFrame{
     int anio;
     String semana;
     int mesn;  
     int maximodias;
     int diasemana;
     String mes;
     int ceb1;
     int diainicio;
     String mesImpreso;  
  public Calendary (){
      semana="";
     semana+= ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n";
     semana+= "    L"+"     M"+"     M"+"     J"+"     V"+"      S"+"     D\n";
     semana+= ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
    int mesn=1; 
   // anio=  Integer.parseInt ( JOptionPane.showInputDialog("Introduzca anio"));

   
                        }
                        
   public void y(int ani){
    anio=ani;
   
    }                     
    
public String  crearMes(){
      
         mesImpreso="";
   //  Dia_semana BuscarDia = new Dia_semana();
           definirMes();
         //  if (mesn==1){diainicio= BuscarDia.calcularDia(anio); }
           
           // System.out.print(BuscarDia.calcularDia(anio));
            
           if (mesn!=1){   diainicio=diasemana+1;}
           // System.out.print(mes+"\n");
            mesImpreso+="     "+ mes+"\n";
          //  System.out.print(semana+"\n");
              mesImpreso+= semana+"\n";
            
             diasemana=1;
                  ceb1=2;
           //aqui creo los espacios en blanco
            while(ceb1<diainicio){
          //  System.out.print("    "); 
            // mesImpreso+= "    ";
                mesImpreso+= "        ";
            ceb1++;
            diasemana++;    
                                  }
  
           //aqui creo los dias del mes
           for(int i=1; i<maximodias+1; i++){  
                
              // if (i==1){  mesImpreso+=  "    "+i;}
               
           if   (i<10&&i!=9){
                      //  System.out.print("   "+i);
                        //   mesImpreso+=  "   "+i;
                            mesImpreso+=  "     "+i;
                        }
              if (i==5){
                       //  System.out.print("  "+ i);
                         //  mesImpreso+="   "+i;
                               mesImpreso+=" ";
                                                        }
          if (i==9){
                       //  System.out.print("  "+ i);
                         //  mesImpreso+="   "+i;
                               mesImpreso+="     "+i+" ";
                                                        }
                        
                    if (i>=10){
                       //  System.out.print("  "+ i);
                         //  mesImpreso+="   "+i;
                               mesImpreso+="   "+i;
                                                        }
                                                        
           if (diasemana==7){
                          //  System.out.print("\n"); 
                             mesImpreso+="\n";
                               diasemana= 0;
                            }
                      diasemana++;                       
                                       }   
                                    
                                    return mesImpreso;      
                                        }

public void definirMes(){
                            
  switch (mesn){
        
        case 1:   maximodias=31;
                  mes="Enero";
                  Dia_semana BuscarDia = new Dia_semana( );
                  
                  diainicio= BuscarDia.calcularDia(anio)+1; 
                //  diainicio=2;
                  break; 
            
        case 2:  if(anio!=0 || anio % 4 !=0){  maximodias=28;}  
                 if(anio==0 || anio % 4 ==0){  maximodias=29;}
        
                  mes="Febrero";
                  break;   
            
        case 3:   maximodias=31;
                  mes="Marzo";
                  break;  
            
        case 4:   maximodias=30;
                  mes="Abril";
                  break;  
            
        case 5:   maximodias=31;
                  mes="Mayo";
                  break;     
            
        case 6:   maximodias=30;
                  mes="Junio";
                  break;    
        
            
        case 7:   maximodias=31;
                  mes="Julio";
                  break;  
                  
        case 8:   maximodias=31;
                  mes="Agosto";
                  break;
            
        case 9:   maximodias=30;
                  mes="Septiembre";
                  break;
            
        case 10:  maximodias=31;
                  mes="Octubre";
                  break;

        case 11:  maximodias=30;
                  mes="Noviembre";
                  break;
            
        case 12:  maximodias=31;
                  mes="Diciembre";
                //  System.out.print(anio);
                  break;

            
       // default:    System.out.println("Aqui se acaba el anio"); break;
            
    }   
}         


                              

                                
                            }