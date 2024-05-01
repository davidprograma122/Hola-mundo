package vista;

public class Main {
    public static void main(String[]args){
        // 1 declarar variables atravez de datos primitivos 
        // NUMEROS ENTEROS
//        int nombreInt =0;
//        //numeros decimales
//        double nombreDouble =0.00;
//        // caracteres
//        char nombreChar= 'A';
//        // boleanos 
//        boolean nombreBoolean= false;
        
       // VARIABLE PARA CADENAS 
       //OBJETO
       //CADENA
//       String nombreString = "MAÑANA HAY CLASES";
       
        
        //IMPRIMIR EN CONSOLA 
        
//        System.out.println("El valor del entero es: "+ nombreInt );
//        System.out.println("El valor del decimal es: "+ nombreDouble );
//        System.out.println("El valor del caracter es: "+ nombreChar );
//        System.out.println("El valor del boleano es: "+ nombreBoolean );
//        System.out.println("El valor de la cadena es: "+ nombreString );
//        EJERCCIO POBLACIONAL, vamos a simular la poblacion de conejos 
//        por lo que necesito conocer los siguientes datos
//         1 EL NUMERO DE PAREJAS DE CONEJOS 
//         2 EL NUMERO DE CRIAS POR PAREJA
//         3 EL PORCERTAJE DE TASA DE MORTALIDAD ANUAL
//         4 SIMULAR ESTO DURANTE UN PERIODO 


        int numParejas= 5;
        int numCrias= 3;
        double mortalidad= (0.8);
        int periodoTiempo = 5;
        int poblacionFinal = 0;
        int poblacionInicial =0;
        // invertigar como se hace aproximacion
      
        for(int i=0;i<= periodoTiempo;i++){
            
            poblacionInicial = (numParejas * 2);
            
            if(i>0){
                
                poblacionInicial = (poblacionInicial * numCrias);
                
            }
            poblacionFinal =(int) Math.round(poblacionInicial * mortalidad);
                
                numParejas =(int) Math.round(poblacionFinal/2);
            
            System.out.println("La población Anual en el año: " + i + 
                    " es de: " + poblacionInicial +" conejos");
            
            System.out.println("Por la tasa de mortalidad disminuyo la poblacion anual "+
                     "quedando: " + poblacionFinal+ " conejos al final del año");
            
            System.out.println("El numero de parejas es de: " + numParejas +" parejas");
        }   
    }
}
