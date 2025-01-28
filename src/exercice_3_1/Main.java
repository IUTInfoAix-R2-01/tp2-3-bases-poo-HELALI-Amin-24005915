package exercice_3_1;

public class Main {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.1, 4.05);
        MyComplex c2 = new MyComplex(1.5, 2.5);

        System.out.println("c1 : " + c1); 
        System.out.println("c2 : " + c2); 

        System.out.println("c1 est reel ? " + c1.isReal()); 
        System.out.println("c1 est imaginaire ? " + c1.isImaginary()); 

        System.out.println("Magnitude de c1 : " + c1.magnitude());  
        c1.addInto(c2);
        System.out.println("c1 apres ajout : " + c1); 

        MyComplex c3 = c1.addNew(c2);
        System.out.println("c3 (c1 + c2) : " + c3); 

        System.out.println("c1 egale a c2 ? " + c1.equals(c2));
        System.out.println("c1 egale a (4.6, 6.55) ? " + c1.equals(4.6, 6.55)); 
    }
}
