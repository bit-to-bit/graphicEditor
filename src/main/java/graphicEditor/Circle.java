package graphicEditor;

public class Circle extends Shape implements Moveable, Scaleable, Colorable {
    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void setColor(String color) {
        System.out.println("Color " + color + " was set to " + getShapeName());
    }

    @Override
    public void moveTo(int x, int y) {
        System.out.println("The " + getShapeName() + " was moved to coordinates (x,y) = (" + x + "," + y + ")");
    }

    @Override
    public void offset(int x, int y) {
        System.out.println("The " + getShapeName() + " was offset on " + x + " px by 0X and " + y + " px by 0Y");

    }

    @Override
    public void scale(int percentScale) {
        System.out.println("The scale of the " + getShapeName() + " has been changed to " + percentScale + " percent");

    }
}
