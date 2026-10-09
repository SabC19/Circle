package circle;

/**
 * @author [Santiago]
 * @version 1.0
 * @since 2026-10-09
 */
public class Circle {
    
    private double x;
    
    private double y;
    
    private double radius;

    /**
     * @param x coordenada
     * @param y coordenada
     * @param radius
     */
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Calcula el diametro del circulo
     *
     * @return the diameter (2 * radius)
     */
    public double calculateDiameter() {
        return 2 * radius;
    }

    /**
     * @return the circumferencia (2 * PI * radius)
     */
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * @return la area del circulo (PI * radius^2)
     */
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}