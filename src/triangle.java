public class triangle extends shape {

    double base;
    double height;
    double half = 0.5;
    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area(double base,double height) {

        return half * base * height ;
    }
}
