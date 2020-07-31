/*
PROBLEMATICA:
A nivel conceptual, comportamientos erróneos de casos de esquina
en software basado en DNN son análogos a errores lógicos en software tradicional.
Es un problema desafiante, como se señaló
por grandes compañías de software como Google y Tesla que ya han
desplegó técnicas de aprendizaje automático en varios sistemas a escala de producción
incluidos automóviles sin conductor, reconocimiento de voz, búsqueda de imágenes,
etc.

Herencia simple de accidentes del mundo real que involucran autos autónomos
 */
package herenciasimplepaper;

class Empresa{
    long fecha_accidente;
    String causa_accidente;
    String consecuencia_accidente;
    
    
 void MostrarCaracteristicasAccidente(){
     System.out.println("el accidente sucedio el : " + fecha_accidente + " "
             + "\n\nla causa del accidente fue la: " + causa_accidente + " y tuvo como "
                     + "\n consecuencia que: " +consecuencia_accidente);
 }
}
//HERENCIA SIMPLE: una subclase de Empresa es Hyundai 
class Hyundai extends Empresa{
String tipo;

String ExponerAccidente(){
    return "Los sensores no pudieron detectar los letreros de las calles las "
            + "\n\t\t\t\t\t\tmarcas de los carriles e incluso los peatones"
            + "\n\t\t\t\t\t\tdebido al angulo del automovil";
}
void IndicarTipo(){
    System.out.println("Esta empresa es de tipo : " + tipo);
}
}

//herencia simple: una subclase de Empresa es Tesla


public class HerenciaSimplePaper {

    public static void main(String[] args) {
        Hyundai hyundai1 = new Hyundai();
       
        
        hyundai1.fecha_accidente=122014;
        hyundai1.causa_accidente="caida de lluvia";
        hyundai1.consecuencia_accidente="se estreello durante la prueva\n";
        hyundai1.tipo="Automotriz";
        
  
        
    System.out.println("\t\tUniversidad de las Fuerzas Armadas Espe - Sede Latacunga");
    System.out.println("Materia: Programacion");
    System.out.println("NRC: 7450");
    System.out.println("Docente: Ing. Luis Guerra");
    System.out.println("Nombre: Ortiz Hector\n");
    
        System.out.println("Informacion de la empresa Hyundai");
        hyundai1.IndicarTipo();
        hyundai1.MostrarCaracteristicasAccidente();
        System.out.println("Como resultado definieron lo siguiente que: "+hyundai1.ExponerAccidente());
        

    }
    
}
