package ch07;

public class InstanceofTest {
    public static void main(String args[]){
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("This is ch07.FireEngine instance.");
        }
        if(fe instanceof Car){
            System.out.println("This is a ch07.Car instance.");
        }
        if(fe instanceof Object){
            System.out.println("This is an Object instance.");
        }

        System.out.println(fe.getClass().getName());

    }
}
