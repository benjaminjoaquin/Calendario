

public class Dia_semana
{
    
    public int anio;// completo
    public int annio;//ultimos dos digitos del año
    public int siglo;
    public int mes=1;
    public int dia=1;
    public int result;
    public int A,B,C,D,E,d;
    
    public Dia_semana(){
        
     }
    
    public int calcularDia(int anio){
        int apuntador=0;
        
        siglo= anio/100;
        if(siglo>=20){
            apuntador=siglo-20;
            A=apuntador * 2;
        }
        if(siglo<20){
            apuntador=20 - siglo;
            A= (apuntador * 2) - 1;
        }
        //******************************************
        siglo= siglo * 100;
        annio= anio-siglo;
        B= annio + (annio / 4 );
        //******************************************
        if(annio==0|| annio % 4 ==0){
            C=-1;} else {C=0;}
            
              switch (mes){
        
        case 1:  D=6; break; 
        case 2:  D=2; break; 
        case 3:  D=2; break; 
        case 4:  D=5; break; 
        case 5:  D=0; break; 
        case 6:  D=3; break; 
        case 7:  D=5; break; 
        case 8:  D=1; break; 
        case 9:  D=4; break; 
        case 10:  D=6; break; 
        case 11:  D=2; break; 
        case 12:  D=4; break; 
                               }
       //*****************************************
       E=dia;
       //***************************************
       result= A+B+C+D+E;
       result= result % 7;
       switch (result){
      /*  case 1:      System.out.println("Lunes"); d=1; break; 
        case 2:   System.out.println("Martes"); d=2; break; 
        case 3:  System.out.println("Miercoles"); d=3; break; 
        case 4:  System.out.println("Jueves"); d=4; break; 
        case 5:   System.out.println("Viernes"); d=5; break; 
        case 6:   System.out.println("Sabado"); d=6; break; 
        case 0:  System.out.println("Domingo"); d=7; break; */
        
        case 1:   d=1; break; 
        case 2:   d=2; break; 
        case 3:   d=3; break; 
        case 4:   d=4; break; 
        case 5:   d=5; break; 
        case 6:   d=6; break; 
        case 0:   d=7; break; 
        
                     }
                     return d;
      //  System.out.println(""+A+"  "+B+" "+C+" "+D+" "+E);
    }
}
