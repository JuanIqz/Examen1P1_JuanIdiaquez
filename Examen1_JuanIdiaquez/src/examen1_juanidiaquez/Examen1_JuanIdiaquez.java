/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_juanidiaquez;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Examen1_JuanIdiaquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pd=new Scanner(System.in);
        boolean rep=true;
        while(rep){
            System.out.println("Bienvenido, marque el numero de enfrente de cada opcion para selecionarla:");
            System.out.println();
            System.out.println("1.Ejercicio de Palabras");
            System.out.println("2.Salir");
            int menu=0;
            menu=pd.nextInt();
            //cuerpo del menu
            switch(menu){
                
                case 1:
                    System.out.println("Bienvenido al ejercicio de Examen");
                    System.out.println("Ingrese su primera palabra o frase:");
                    pd.nextLine();
                    String Pfrase=pd.nextLine();
                    System.out.println("Ingrese su segunda palabra o frase:");
                    String Pfrase2=pd.nextLine();
                    String Resf= EjeP(Pfrase,Pfrase2);
                    System.out.println();
                    System.out.println("Su frase final es: "+Resf);
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.println("Adios, gracias por usar el programa ");
                    rep=false;
                    break;
                    
                default:
                    System.out.println("Opcion invalida ingrese un numero nuevamente");
                    System.out.println();
                    rep=true;
                    break;
                       
            }//final del mundo
        }
    }
    //inicio del metodo que da funcionalidad al programa
   public static String EjeP(String PfraseM, String Pfrase2M){
       if (PfraseM.equals(Pfrase2M)) {
           String Vuelta="";
           for (int i = Pfrase2M.length()-1; i >= 0; i--) {
               Vuelta=Vuelta+Pfrase2M.charAt(i);
           }
        String op1=PfraseM+Vuelta;
        return op1;
       }else if(!PfraseM.equals(Pfrase2M)&&(PfraseM.length()==Pfrase2M.length())){
           String p1="",p2="",op2="";
           for (int i = 0; i <= PfraseM.length()-1 ; i++) {
             p1=PfraseM.charAt(i)+"";
             p2=Pfrase2M.charAt(i)+"";
             op2=op2+p1+p2;
           }
           return op2;
       }else{
          String op3=PfraseM+Pfrase2M;
          return op3;
       }  
   }
}
