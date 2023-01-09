package graphicEditor;

public class Point extends Shape implements Moveable, Colorable {
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



}
