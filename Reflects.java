
import java.lang.Class;
import java.lang.reflect.*;

class Animal {
  public  Animal(){

    }
   protected Animal(int age){

    }


}

// put this class in different Dog.java file
 class Dog extends Animal {

   
    
  public void display() {
    System.out.println("I am a dog.");
  }
}

// put this in Main.java file
class Reflects {
  public static void main(String[] args) {
    try {

        Dog d1 = new Dog();
        
        Class c1 = d1.getClass();

        String name = c1.getName();
        System.out.println(" Name of the class = "+name);
           
        int modifer = c1.getModifiers();
        String st = Modifier.toString(modifer);
        System.out.println(" modifier of the class = "+st);



        Class suprr = c1.getSuperclass();
        System.out.println(" Name of the Super_class = "+suprr.getName());


        Constructor[] constructors  = suprr.getDeclaredConstructors();

        for (Constructor co : constructors) {

            System.out.println("Constructor name > "+co.getName());

            int a = co.getModifiers();
            String s =Modifier.toString(a);
            System.out.println(" Modifier > "+s);
            System.out.println("parameters > "+co.getParameterCount());

            
        }



   
     
    
    }

    catch (Exception e) {
      e.printStackTrace();
    }
  }
}