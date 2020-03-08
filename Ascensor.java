
/**
 * La clase ascensor tiene como atributos: 
 * pisos que tiene el edificio, numero de sotanos y piso actual.
 * - Operaciones:
 * °piso siguiente arriba
 * °piso siguiente abajo
 * °numero de pisos
 */
public class Ascensor
{
    //Atributos
    private int pisosEdi, numSotanos, pisoActual ;
    
    //Metodo constructor
    public Ascensor(int pE, int nS, int pA)
    {
        this.pisosEdi = pE;
        this.numSotanos = nS;
        this.pisoActual = pA;
    }
    
    //Metodos analizadores
    public int getPisosEdi() //Obtener la cantidad de pisos del edificio
    {
        return this.pisosEdi;   
    }
    
    public int getNumSotanos() //Obtener la cantidad de sotanos del edificio
    {
        return this.numSotanos;   
    }
    
    public int getPisoActual() //Obtener laelpiso actual en el que se encuentra el ascensor
    {
        return this.pisoActual;   
    }
    
    //Metodo modificador
    public void setPisosEdi(int nuevopisos)
    {
        this.pisosEdi = nuevopisos;
    }
    
    public void setNumSotanos(int nuevosotanos)
    {
        this.numSotanos = nuevosotanos;
    }
    
    public void setPisoActual(int nuevopisoa)
    {
        this.pisoActual = nuevopisoa;
    }
    
    //Piso siguiente arriba
    public int pisoArriba()
    {
         int pisoSi = 0; 
          if (pisoActual < -1 || pisoActual > 0)
          {
              pisoSi = pisoActual + 1;
          }
          else if (pisoActual == -1)
          {
              pisoSi = pisoActual + 2;
          }
         return pisoSi;
    }
    
    //Piso siguiente abajo
    public int pisoAbajo()
    {
         int pisoAb = 0; 
          if (pisoActual < -1 || pisoActual > 0)
          {
              pisoAb = pisoActual - 1;
          }
          else if (pisoActual == 1)
          {
              pisoAb = pisoActual - 2;
          }
         return pisoAb;
    }
    
    //Numero total de pisos del edificio
    public int pisosTotales()
    {
         int pisosTotal = 0; 
          pisosTotal = numSotanos + pisosEdi;
         return pisosTotal;
    }
}
