public class Line extends Shape {

    public void draw() {
        super.draw();
        System.out.println("Draw line");
    }

    public void move(int x, int y) {
        System.out.println("move line");
    }

    public void rotate(int radian) {
        System.out.println("rotate line");
    }

}
