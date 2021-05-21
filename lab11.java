public class lab11{
    public static void main(String[] args) {
       child ch = new child();

       ch.move();
    }
}
 class parent{

    public void move(){
           System.out.println("Parent Class");
    }
}
 class child extends parent{
    public void move(){
        super.move();
        System.out.println("Child Class");
    }
}
