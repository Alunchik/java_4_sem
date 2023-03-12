package task6.builder;

public class Product {
    private int a;
    private int b;
    private int c;

    public Product() {
        super();
    }

    public Product(int a, int b, int c) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

}
