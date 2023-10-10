import javax.swing.text.PlainDocument;

public class Main {
    public static void main(String[] args) {
        System.out.println("variables");
    //nombre de variables y metodos en momenclatura camello

/*

 */
byte numerodeHermano =1;
short cantidadCorta = 350;

int numerodeClientes = 1_234_456_123;
long numeroLargo = 1_2350_2560L;

System.out.println(numerodeHermano);
System.out.println(cantidadCorta);
System.out.println(numerodeClientes);
System.out.println(numeroLargo);

//Numeros con decimales
float numeroConDecimalDouble = 5.5F;
double numeroConDecimal = 123_123_123_123.488578;

System.out.println(numeroConDecimal);
System.out.println(numeroConDecimalDouble);

boolean estaCasado = false;
System.out.println(estaCasado);

char letra = 'a';
        System.out.println(letra);

        //Calcular el area de un cuadrado cuyo lado mide 6
        byte lado = 6;
        int areaCuadrado = lado * lado;
                System.out.println(lado *lado);
//Calcular el area de un circulo cuyo radio es 3
        double radio = 3;
        double areaCirculo = radio * radio * 3.1416;
        System.out.println(areaCirculo);

        //Calcular el perimetro de un rectangulo cuya base es 4 y altura 3
        int base = 4;
        int altura = 3;
        int perimetroCuadrado = 2*base + 2*altura;
        System.out.println(perimetroCuadrado);
        System.out.println(10%3);
        /*Operadores de comparacion
        >, <, <=, >=, ==, !=
        */
        int  num1=5, num2=7;
        System.out.println(num1<num2);

//oferta -> si compras mas de 5 unidades de da el 10% de descuento
        //Decir si se compra 4 unidades se obtiene el descuento
        //Definir una variable para las unidades
        //Hacer una comparacion
        int unidades = 4;
        System.out.println(unidades>5);

        //Oferta -> si compras un importe de  mas de 100€ se da el 5% de descuento
            //se compraron 3 unidades de 15€
            //¿le corresponde el descuento?
            int unidades2 = 3;
            float precio = 15F;
            System.out.println(unidades*precio>100);


    }
}


