import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce la información del disco:");

        int tipo;
        do{
            System.out.println("Tipo de disco: \n 1.CD  2. Disco");
            tipo = scanner.nextInt();
        }while(tipo==1 || tipo==2);
        
        System.out.print("Nombre del disco: ");
        String name = scanner.nextLine();

        System.out.print("Marca del disco: ");
        String brand = scanner.nextLine();

        System.out.print("Contenido del disco texto: ");
        String content = scanner.nextLine();

        System.out.print("Capacidad del espacio en bytes: ");
        int spaceCapacityByte = scanner.nextInt();
        if(tipo==1){
            CD disco = new CD(name, brand, content, spaceCapacityByte);
            System.out.println(disco);
            disco.spin();

            disco.writeData();

            disco.readData();

            disco.burnIso();
        }else{
            Disco_Duro discodDuro = new Disco_Duro(name, brand, content, spaceCapacityByte);
            discodDuro.spin();

            discodDuro.writeData();

            discodDuro.readData();
            
            discodDuro.formatDisk();
        }
        
    }
    //He echo todo lo posible hasta dando nos han dado en la clase de 1, acabamos de empezar con herencias y esto es todo lo que he logrado... muchas gracias popr la oportuinidad.
}
