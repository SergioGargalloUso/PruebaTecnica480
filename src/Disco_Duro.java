import java.util.Scanner;

public class Disco_Duro extends Almacenamiento {
    Scanner scanner = new Scanner(System.in);
    public int format;
    public int getFormat(){return format;}
        public void setFormat(int format) {
            this.format=format;
        }
    public Disco_Duro(String name, String brand, String content, int spaceCapacityByte) {
        super(name, brand, content, "Disco Duro", spaceCapacityByte);
    }

    public void formatDisk() {
        System.out.println( "Que formato quieres añadir \n 1.fat32 2.exfat");
        int tipo= scanner.nextInt();
        this.setFormat(tipo);
        
    }
}
