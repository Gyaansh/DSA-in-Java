
abstract class Animal {
    String color;
    
    Animal() {
        color = "brown";
    }
    
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
    
    void setColor(String color) {
        this.color = color;
    }
}
// class student{
    
// }
    public class OOPS {
        public static void main(String[] args) {
            Horse h = new Horse();
            h.walk();
        }
    }