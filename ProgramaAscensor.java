
import java.util.Scanner;
/**
 * Programa para conocer piso arriba, piso abajo y total de pisos 
 * en un ascensor de un edificio
 * @utores Santiago Velasquez, Mario Dorado y Jeimmy Naranjo
 */
public class ProgramaAscensor
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        Ascensor Asc = null;
        int opciones;
           do
           { 
                  System.out.println("\n1. Datos del Ascensor en el edificio");
                  System.out.println("2. Imprimir datos del Ascensor");
                  System.out.println("3. Piso siguiente arriba");
                  System.out.println("4. Piso siguiente abajo");
                  System.out.println("5. Pisos atendidos por el Ascensor");
                  System.out.println("0. Salir");
                  System.out.println("opcion => ");
                  opciones = teclado.nextInt();
                  switch (opciones)
                  {
                      case 1:
                      int pE = 0;
                      System.out.print("Pisos del edificio = ");
                      pE = teclado.nextInt();
                      int nS = 0;
                      System.out.print("Numero de sotanos = ");
                      nS = teclado.nextInt();
                      int pA = 0;
                      System.out.print("Piso actual = ");
                      pA = teclado.nextInt();
                      
                      Asc = new Ascensor (pE, nS, pA);
                      System.out.println("Datos ingresados con exito");
                      break;
                      
                      case 2:
                      System.out.println("Pisos del edificio = " + 
                                     Asc.getPisosEdi() + 
                                     ", Numero de sotanos = "+
                                     Asc.getNumSotanos()+
                                     ", Piso actual = "+
                                     Asc.getPisoActual());
                      break;
                      
                      case 3: //Piso siguiente arriba
                      if (Asc.getPisoActual() == Asc.getPisosEdi()) 
                      {
                             System.out.print("Este es el ultimo piso  " +
                                            Asc.getPisoActual());
                      }
                     
                      
                      System.out.printf("El piso siguiente arriba es  " +
                                            Asc.pisoArriba());
                      break;  
                      
                      
                      case 4: //Piso siguiente abajo
                     
                      if(Asc.getPisoActual() == Asc.getNumSotanos())
                      {
                          System.out.printf("Este es el ultimo sotano  " +
                                            Asc.getPisoActual());
                      }
                      System.out.printf("El piso siguiente abajo es  " +
                                            Asc.pisoAbajo());
                      break;
                      
                      case 5: //Pisos atendidos por el ascensor
                       System.out.printf("Los pisos atendidos por el ascensor son  " +
                                            Asc.pisosTotales());
                      
                  }
           }
           while (opciones != 0);
           {
           }
    }
    
}
