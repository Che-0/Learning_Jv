/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class Avion {
    double peso;
    int combustible;
    double alturaDeVuelo;
    String identificador;
    
    public Avion (double peso, int combustible, double alturaDeVuelo, String identificador){
            this.peso = peso;
            this.combustible = combustible;
            this.alturaDeVuelo = alturaDeVuelo;
            this.identificador = identificador; 
    }     
    
    // Getters
    /*Son metodos cuya funcionalidad principal es la de acceder al valor de un atributo específico
    y retornar ese valor
    
    un geeter se puede encargar, por ejemplo, de obtener el peso o nombre de una persona
    
    Los Getters son utilizados para dar acceso a los atributos por fuera de la clase 
    Asi que por medio de ellos les permitos a las clases acceder a otros atributos
    
    Por medio de ellos tambien se puede llevar la cuenta de cuantas veces alguien accedio a un atributo o cuantas veces lo
    modifico.
    
    suelen tener mas sentido en el encapsulamiento
    
    
    Tiene que tener el mismo tippo de dedato y su nombre incluira get
    
    Es bueno tener un accesor por cada atributo 
    */
    
    double getPeso()
    {
        return this.peso;
    }
    
    String getIdentificador()
    {
        return this.identificador;
    }
    
    // Setters
    /*
        Son principalmente para acceder de una clse o paquete externo a los atributos 
        y poder establecerles un valor
    
    Asi que deben de recibir un unico parametro
    
    puesto que van a operar con un valor, son de tipo Void 
    */
    
    void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    void setIdentificador(String identificador)
    {
        this.identificador = identificador;
    }
    
    //auque, puesto que estan en la misma clase, pues es medio ilógico utilizarlo aqui
    
    //metodo despegar
    boolean despegar()
    {
        this.combustible = this.combustible -20;
        this.alturaDeVuelo = this.alturaDeVuelo +20;
        
        return this.combustible > 0;
       /*if (this.combustible > 0 )
        {
            return true;
        }
        else
        {
       return false; 
        }
*/ 
    }
    
    public static void main(String[] args) {
        Avion avion1 = new Avion(35000,5000,0,"hgeger");
       boolean despegue = avion1.despegar();  // despegar retorna un valor, asi que le puedo asignar una vaiable
       
       System.out.println(despegue);
    }

}