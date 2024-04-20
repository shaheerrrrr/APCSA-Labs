public class Circle {
    private double radius;
    private String color;
    private double area;

    public Circle()
    {
        color = "red";
        radius = 1;
    }

    public Circle(int r, String c)
    {
        color = c;
        radius = r;
    }
    
    public void setRadius(int r)
    {
        radius = r;
    }

    public void setColor(String c)
    {
        color = c;
    }

    public double getArea()
    {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public String toString()
    {
        return "Radius: " + radius + "cm\nArea: " + area + " square cm\nColor: " + color;
    }

    public static void main(String[] args)
    {
        Circle zero = new Circle();
        Circle two = new Circle(4, "Purple");

        System.out.println(zero + "\n" + two);

        zero.setColor("Blue");
        two.setColor("red");

        System.out.println(zero + "\n" + two);
    }
}