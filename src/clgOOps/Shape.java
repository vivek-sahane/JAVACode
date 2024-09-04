package clgOOps;
//method overridding
class Shape {
    void draw() {
        System.out.println("Cannot say shape type");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square Shape");
    }
}

class Demo {
    public static void main(String[] args) {
        Shape r = new Square(); // Corrected the object creation
        r.draw(); // This will call the draw method of Square class
    }
}
