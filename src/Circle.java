public class Circle{
    public class Main {

	}

	double radius;
    String color;

    public  Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
         radius = r ;
    }

    public double getRadius(){
        return radius;

    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}

