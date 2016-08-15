

public class InterfaceTester
{
    public static void main()
    {
        ShapeInterface figure = new Square(3);
        print(figure);
        
        figure = new Pentagon(3);
        print(figure);
        
        figure = new Circle(3);
        print(figure);
    }
    
    public static void print(ShapeInterface figure)
    {
        System.out.println("\n"+getFigure(figure)+": "+figure.context()+"= "+figure.getSize());
        System.out.println("\tArea: "+figure.getArea()+"\n\tPerimeter: "+figure.getPerimeter());
    }
    
    public static String getFigure(ShapeInterface figure)
    {
        if(figure instanceof Square)
           return "Square";
        else if(figure instanceof Pentagon)
           return "Pentagon";
        else
           return "Circle";
    }
}
