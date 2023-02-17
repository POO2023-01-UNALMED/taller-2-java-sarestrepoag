package test;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;
    
    public int cantidadAsientos(){
        int cont = 0;
        for(Asiento x : asientos){
            if (x != null){
                ++cont;
            }
        }
        return cont;
    }
    public String verificarIntegridad(){
        if ((motor != null) && (motor.registro != registro)){
            return "Las piezas no son originales";
        }
        for(Asiento x : asientos){
            if ((x != null) && (x.registro != registro)){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
