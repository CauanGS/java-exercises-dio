package ex03;

public record Retangulo(double lado, double altura) implements AreaFigura{
    @Override
    public double getArea() {
        return lado*altura;
    }
}
