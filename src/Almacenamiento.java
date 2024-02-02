import java.util.Scanner;
public class Almacenamiento  {
        Scanner scanner = new Scanner(System.in);
        protected String name;
        protected String brand;
        protected String content;
        protected String discType;
        protected int spaceCapacityByte;
        protected static final String TYPE_CAPACITY = "byte";

        public String getName(){return name;}
        public void setName(String name) {
            this.name=name;
        }
    
        public String getBrand(){return brand;}
        public void setBrand(String brand) {
            this.brand=brand;
        }
    
        public String getContent(){return content;}
        public void setContent(String content) {
            this.content= this.content + " " + content;
        }

        public String getDiscType(){return discType;}
        public void setDiscType(String discType) {
            this.discType=discType;
        }

        public int getSpaceCapacityByte(){return spaceCapacityByte;}
        public void getSpaceCapacityByte(int spaceCapacityByte) {
            this.spaceCapacityByte=spaceCapacityByte;
        }

        public Almacenamiento(String name, String brand, String content, String discType, int spaceCapacityByte) {
        
            this.name = name;
            this.brand = brand;
            this.discType = discType;
            this.content = content;
            this.spaceCapacityByte = spaceCapacityByte;
            
        }

        public void spin() {
            System.out.println("El disco tipo "+ this.getDiscType() +" esta girando");
        }
    
        
        public void storeData(String addInfo) {
            String cds= "CD"; 
            if(cds.equals(this.getDiscType())){
                System.out.println("La información se esta añadiendo mediante laser al CD");
            }else{
                System.out.println("La información se esta añadiendo mediante cabezal magnetico al Disco Duro");
            }
            
            setContent(addInfo);
            System.out.println("la info a sido añadida");
        }
    
       
        public void writeData() {
            System.out.println("Que información quieres añadir");
            String addInfo = scanner.nextLine();
            this.storeData(addInfo);
        }
    
        
        public void readData() {
            String cds= "CD"; 
            if(cds.equals(this.getDiscType())){
                System.out.println("La información se esta leyendo mediante laser al CD");
            }else{
                System.out.println("La información se esta leyendo mediante cabezal magnetico al Disco Duro");
            }
            System.out.println(this.getContent());
        }
    
       
        public String toString() {
            String info=    " Nombre: " + getName() +
                            "\n Marca: " + getBrand() +
                            "\n Contenido: " + getContent() +
                            "\n Tipo de disco: " + getDiscType() +
                            "\n Espació en bytes: " + getSpaceCapacityByte();
            return info;
        }
    
}
