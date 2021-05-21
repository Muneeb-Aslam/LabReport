public class lab12{
    public static void main(String[] args) {
       child ch = new child();

       ch.move();
    }
}
 class grandParent{

    public void move(){
           System.out.println("Grand Parent Class");
    }
}
class parent extends grandParent{

    public void move(){
           super.move();
           System.out.println("Parent Class");
    }
}

 class child extends parent{
    public void move(){
        super.move();
        System.out.println("Child Class");
    }
}
