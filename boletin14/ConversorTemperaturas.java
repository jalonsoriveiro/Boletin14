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
    
    
    
    public float  centigradosAFharenheit(float grados)throws TemperaturaErradaExcepcion{
        if (grados<80){
            throw new TemperaturaErradaExcepcion ("No puedes dividir entre 0");
              
        }
        
        return grados;
        
        
    }
}
