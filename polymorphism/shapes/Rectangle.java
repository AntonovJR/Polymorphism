package polymorphism.shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {

        this.setHeight(height); this.setWidth(width);

        this.calculatePerimeter(); this.calculateArea(); }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2*height+2*width);
    }

    @Override
    public void calculateArea() {
        setArea(height*width);
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
