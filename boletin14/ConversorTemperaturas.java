package boletin14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jalonsoriveiro
 */
public class ConversorTemperaturas {
    
    
    final private  float TEMPERATURA = 80;
    float Fharenheir;
    float Reamur;
    
    
    public float  centigradosAFharenheit(float grados)throws TemperaturaErradaExcepcion{
        if (grados<80){
            throw new TemperaturaErradaExcepcion ("No puedes dividir entre 0");                          
        }else{
                        
           Fharenheir = (9f/5f)*grados + 32.4f;
           return Fharenheir;
        
        }        
        
        
    }
     public void  centígradosAReamur(float grados)throws TemperaturaErradaExcepcion{
        if (grados<80){
            throw new TemperaturaErradaExcepcion ("No puede ser menor a 80");                          
        }else{
                        
           Reamur = 4.0f / 5.0f* grados;
            System.out.println(Reamur);
        
        }        
        
        
    }
}
