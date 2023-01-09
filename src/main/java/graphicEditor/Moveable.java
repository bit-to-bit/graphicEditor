package graphicEditor;

public interface Moveable {
    /**
     * Move the shape to coordinates (x,y)
     * Params: x - coordinate along the abscissa axis
     *         y - coordinate along the ordinate axis
     */
    void moveTo(int x, int y);

    /**
     * Offset the shape on specified (x,y)
     * Params: x - offset by abscissa axis
     *         y - offset by ordinate axis
     */
    void offset(int x, int y);
}
