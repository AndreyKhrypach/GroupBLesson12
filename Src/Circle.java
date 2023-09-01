public class Circle extends Figure{
    public static final float PI = 3.14f;
    private float radius;

    // конструктор зі зверненням до конструктора класа Figure
    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }


    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public float getArea() {
        return PI * radius * radius;
    }
}
