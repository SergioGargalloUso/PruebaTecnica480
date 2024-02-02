public class CD extends Almacenamiento{

    public CD(String name, String brand, String content, int spaceCapacityByte) {
        super(name, brand, content, "CD", spaceCapacityByte);
        
    }

    public void burnIso() {
        System.out.println("Quemando la iso en el CD");
        
    }
    
}
