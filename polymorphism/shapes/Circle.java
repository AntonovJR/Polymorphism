package polymorphism.shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {

        this.setRadius(radius);

        this.calculatePerimeter();

        this.calculateArea();

    }

    public final Double getRadius() {

        return radius;

    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(Math.PI*(getRadius()*2));
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI*getRadius()*getRadius());
    }

}

