public class Main {
    public static void main(String[] args) {
        Animal animal= new Animal(){
          public void makeSound(){
              System.out.println("Meow");
          }
        };

        animal.makeSound();
        Animal animal1= new Animal();
        animal1.makeSound();
    }
}
