package ex03;

import static java.lang.Math.sqrt;

public record Circulo(double raio) implements AreaFigura{
    private static final double pi = 3.14;
    @Override
    public double getArea() {
        return pi*sqrt(raio);
    }
}
