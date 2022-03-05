/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_comportamientoobjetos;

/**
 *
 * @author CHARLY
 */
public class CuentaBancaria {
    private String RFC;
    private String alias;
    private double saldo;
    
    //un dato re pinche importante es que si qlo tienes que hacer como publico o privado
    //aqui funcionaron los metodos vacion porque estan en la misma clase, pero de no ser el caso nel 
    //ya sabes, asi los atributos en priv no se podran modificar solo por los metodos de la clase 
    
    public void mostrarDatos() //metodo para imprimir en pantalla los datos 
    {
        System.out.println(this);
        System.out.println(RFC + " " + alias + " " +saldo); //ya nose necesita del . porque accedes directo a la var
        
    }
    
    //asi se generan los getters ins code

    public String getRFC() {
        return RFC;
    }



    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null)
        {    
        this.alias = alias;
        }
    }

    public double getSaldo() {
        return saldo;
    }


    
    
    //cuando un metodo devuelve un valor, se tiene que poner un return al finas :
    
    //public double getSaldo() //se escribe en mayuscula el atributo y el get puede tener otro name, pero no lo hagas 
    //{
     //   return saldo;
    //}
    
    /*
    
     public double obtenerSaldo()
    {
        return saldo;
    }
    
    esta madre es un getter , pero me pendejearon y no me di cuenta 
    
   public void setAlias(String nuevoAlias)
   {
       if (nuevoAlias != null)
       {
           alias = nuevoAlias;
       }
   }
   
   public String getAlias()
   {
       return alias;
   }
   /**/
    
    public void depositar(double monto)
    {
        if (monto>0)
        {
            saldo += monto;
        }
        
        else
        {
            System.out.println("Error");
        }
    }
    
    
         public boolean saldoDisponible(double monto)
        {
            return ( monto <= saldo );
          
            
        }
          
          
        public void extraer(double monto)
        {
            if (saldo>=monto)
            {
                saldo -= monto;   
            }
        }
        
        
        
        
        
        
        
        
        //otra maneraen la que se puede expresar esa funcion es esta
        
        /*
            void extraer(double monto)
        {
            if (saldoDisponible(monto)
            {
                saldo -= monto;   
            }
        }
        
        
        */
        //entonces se pueden usar las funciones de la misma clase 
}
