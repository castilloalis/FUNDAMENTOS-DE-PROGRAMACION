import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// TODO:
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULAR EL AREA DEL TRIANGULO");

        System.out.println("ingrese la base del triangulo");
        double base = entrada.nextDouble();
        System.out.println("ingrese la altura del triangulo");
        double altura = entrada.nextDouble();

        double area = (base * altura) /2;
        System.out.println("el area es" + area);

        System.out.println("///////////////////////////////////////////////////") ;

        // TODO: 2
        System.out.println("INGRESE DOS NUMEROS POR LA CONSOLA Y SUMARLOS");
        //entrada
        System.out.println("ingrese el primer nùmero ");
        double number1 = entrada.nextDouble();
        System.out.println("ingrese el segundo nùmero");
        double number2 = entrada.nextDouble();
        //proceso
        double suma = number1 + number2 ;
        //salida
        System.out.println("la suma es" + suma);

        System.out.println("////////////////////////////////////////////////////");

        // TODO: 3
        System.out.println("ingrese un numero y visualizarlo el numero elevado al cuadrado");
        //entrada
        System.out.println("ingrese el nùmero");
        double num1 = entrada.nextDouble();
        //proceso
        double cuadrado = num1 * num1 ;
        //salida
        System.out.println("el numero al cuadrado es " + cuadrado);

        System.out.println("/////////////////////////////////////////////////////////////////");

        // TODO: 4
        System.out.println("escribir un programa que convierta de euros a dolares");
        //entrada
        System.out.println(" escriir un programa que convierta de euros a dolares");
        double euro = entrada.nextDouble();

        double dolar = 1.07 ;
        //proceso
        double cambio = euro * dolar ;
        //salida
        System.out.println("el valor de dolar es" + cambio);

        System.out.println("//////////////////////////////////////////////////////////////");

        // TODO: 5
        System.out.println("escribir un programa que pida el lado de un cuadrado y calcule el valor del area y del perimetro");
        //entrada
        System.out.println("escribir un programa que pida el lado de un cuadrado y calcule el valor del area y el perimetro");
        double lado = entrada.nextDouble();
        //proceso
        double areacuadrado = lado * lado ;

        double perimetro = lado + lado + lado + lado ;
        //salida
        System.out.print("el area del cuadrado es" + areacuadrado);
        System.out.println("el perimetro del cuadrado es" + perimetro);

        System.out.println("//////////////////////////////////////////////");

        // TODO: 6
        System.out.println("escribir un programa que determine el programa del area y volumen del cilindro");
        //entrada
        System.out.println("calcular el area y el volumen del cilindro \n ingrese la base del cilindro");
        double basecilindro = entrada.nextDouble();
        System.out.println("ingrese la base del cilindro");
        double alturacilindro = entrada.nextDouble();
        //proceso
        double areacilindro = 2 * 3.1416 * basecilindro * (basecilindro + altura);
        double volumen = 3.1416 * (basecilindro * basecilindro) * alturacilindro;
        //salida
        System.out.println("el area del cilindro es" + areacilindro + "cm²" );
        System.out.println("el volumen del cilindro es" + volumen + "cm³");

        System.out.println("/////////////////////////////////////////////////////////");

        // TODO: 7
        System.out.println("escribir unprograma que lea el radio de una circunferencia y calcule la longitud de la misma " +
                "y el area del circulo inscrito ");
        //entrada
        System.out.println("ingrese el radio de una circunferencia");
        double circunferencia = entrada.nextDouble();
        //proceso
        double longitud = 2 * 3.1416 * circunferencia ;
        double area3 = 3.1416 * (circunferencia * circunferencia) ;
        //salida
        System.out.println("la longitud de una circunferencia es" + longitud);
        System.out.println("el area de un circulo es" + area3);

        System.out.println("/////////////////////////////////////////////////////////");

        // TODO: 8
        System.out.println("Calcular el promedio de 3 numeros ingresados por el sistema");
        //entrada
        System.out.println("ingrese numero");
        double numb1 = entrada.nextDouble();

        System.out.println("ingrese numero");
        double numb2 = entrada.nextDouble();

        System.out.println("ingrese numero");
        double numb3 = entrada.nextDouble();
        //proceso
        double promedio = (numb1 + numb2 + numb3) /3 ;
        //salida
        System.out.println("el promedio es" + promedio);

    }


}