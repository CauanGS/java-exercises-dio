package ex03;

import static java.lang.Math.sqrt;

public record Quadrado(double lado)  implements AreaFigura{

    @Override
    public double getArea() {
        return sqrt(lado);
    }
}
