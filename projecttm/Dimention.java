
package projecttm;


public class Dimention {
    private int width;
    private int height;
    private String dimention;

    public Dimention(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDimention() {
        return dimention;
    }

    public void setDimention(int width, int height) {
        this.dimention = String.format("%d@%d", width, height);
    }

    @Override
    public String toString() {
        setDimention(width,height);
        return (String.format("%d@%d", getWidth(), getHeight()));
    }    
}
