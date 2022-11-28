 abstract class Demo {
    public abstract void show();
    public void display() {
        System.out.print("Vikrant ");

    }
    
 }
abstract class Test extends Demo {
public void Show()
{
    System.out.print("Saini");

}
}
class Abs {
    public static void main(String[] args) {
        Test a = new Test();
            
        a.display();
        a.show();
        }    
}
