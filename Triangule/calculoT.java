import java.util.Scanner;

public class calculoT {

    public Double ladoA;
    public Double ladoB;
    public Double ladoC;
    public Double altura;
    public Double area;


    public Double getLadoA() {
        return ladoA;
    }
    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }
    public Double getLadoB() {
        return ladoB;
    }
    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }
    public Double getLadoC() {
        return ladoC;
    }
    public void setLadoC(Double ladoC) {
        this.ladoC = ladoC;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    calculoT() {}



public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    
        
        System.out.println("CALCULANDO TRIANGULOS");
            
        System.out.println("Digite el lado A de su Triangulo: ");
        double ladoA = scanner.nextDouble();

        System.out.println("Digite el lado B de su Triangulo: ");
        double ladoB = scanner.nextDouble();

        System.out.println("Digite el lado C de su Tringulo: ");
        double ladoC = scanner.nextDouble();


        if (ladoA == ladoB && ladoA == ladoC) {
        System.out.println("Su triangulo es un triangulo ÉQUILATERO");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
        System.out.println("Su triangulo es un triangulo ISÓSCELES");
        } else {
        System.out.println("Su triangulo es un triangulo ESCALENO");
        }
    

    System.out.println("¿Que más necesita calcular?");
    System.out.println("1. Calculo de ángulos");
    System.out.println("2. Calculo de área");
    System.out.println("3. Salir del programa");
    System.out.println("Elije una opción");


    int opcion = 0;

    do {
        opcion = scanner.nextInt();
    


    switch(opcion) {
        
        
        case 1:
            System.out.println("CALCULANDO ÁNGULOS");
        
            double cosA = Math.toDegrees(Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC)));
            double cosB = Math.toDegrees(Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC)));
            double cosC = Math.toDegrees(Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoA * ladoB)));

            System.out.println("El ángulo A de su triangulo es: " + cosA + "°");
            System.out.println("El ángulo B de su triangulo es: " + cosB + "°");
            System.out.println("El ángulo C de su triangulo es: " + cosC + "°");

            break;

        
            
        case 2:

            System.out.println("CALCULANDO ÁREA");

            System.out.println("Digite la altura de su triangulo: ");
            double altura = scanner.nextDouble();

            double area = (ladoC * altura) / 2;
            
            System.out.println("El area de su triangulo es: " + area);

            break;




        case 3:

            System.out.println("Deseo salir ya del programa");
            break;



        default:
            System.out.println("Opcion no válida, reinicie el programa e intentelo de nuevo");
            break;

        }

            System.out.println("Digite el número de la opción que desea realizar de nuevo");


} while (opcion != 3);
        
    

    scanner.close();

}


}