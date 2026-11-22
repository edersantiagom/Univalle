import java.util.Scanner;

public class NotasMEI {



    NotasMEI () {}


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double calEspa = 0;
        double calMates = 0;
        double calIngl = 0;
        int opcion = 0;

        do {

            System.out.println("MENÚ DE PROMEDIOS");
            System.out.println("1. Matemáticas");
            System.out.println("2. Español");
            System.out.println("3. Inglés y Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
            
                case 1:
                
                System.out.println("CALCULANDO SU PROMEDIO DE MATEMÁTICAS");

        

                for (int i = 1; i <= 3; i++) {
                    System.out.println("Digite su nota" + i + ": ");
                    double notaM = scanner.nextDouble();

                    calMates += notaM;


                }

                double promedio = calMates / 3;


                System.out.println("Su promedio de matemáticas es: " + promedio);

            break;

            case 2: 
            
                System.out.println("CALCULANDO SU PROMEDIO DE ESPAÑOL");
        
        
                int g = 1;



                while (g <= 3) {

                    System.out.println("Digite su nota de español" + g + ": ");
                    double notaE = scanner.nextDouble();

                    calEspa += notaE;

                    g++;
            
                }

                double promedioE = calEspa / 3;

                System.out.println("Su promedio de español es: " + promedioE);

            break;


            case 3:


                System.out.println("CALCULANDO SU PROMEDIO DE INGLÉS");

                int i = 1;

                do {

                    System.out.println("Digite su nota" + i + ": ");
                    double notaI = scanner.nextDouble();

                    calIngl += notaI;


                    i++;



                } while (i <= 3);

                double promedioI = calIngl / 3;
                System.out.println("Su promedio de ingles es: " + promedioI);



            }

        } while (opcion != 3);
        
    
        scanner.close();
    


}


}