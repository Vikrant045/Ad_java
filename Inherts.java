class Emp{
    String d = "jai";
    int id = 01;
}
class Inherts extends Emp {
    String d = "ho";
    public static void main(String args[])
    {
        Inherts p = new Inherts();
        System.out.println(p.d);
    }
}