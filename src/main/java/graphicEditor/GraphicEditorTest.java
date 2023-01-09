package graphicEditor;

public class GraphicEditorTest {

    public static void main(String[] args) {
        ShapeIdentificationService shapeIdentificationService = new ShapeIdentificationService();

        Circle circle = new Circle();
        Point point = new Point();
        Quad quad = new Quad();

        shapeIdentificationService.identifyShape(circle);
        circle.setColor("Green");
        circle.scale(80);
        point.setColor("Red");
        circle.offset(5,-100);
        quad.setColor("Yellow");
        quad.moveTo(55, 77);
        circle.moveTo(67,88);


    }





}
