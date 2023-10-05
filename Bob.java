
public class Bob implements Runnable {
    private int positionX, positionY, round;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor, int round) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        this.round = round;
    }
    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(5);
        bob.speed(20);

        bob.forward(200);
            bob.right(90);
            bob.forward(200);
            bob.right(90);
            bob.forward(200);
            bob.right(90);
            bob.forward(200);
            bob.right(45);
            bob.forward(140);
            bob.right(90);
            bob.forward(140);
            bob.right(45);
            bob.up();
            bob.forward(200);
            bob.right(90);
            bob.forward(130);
            bob.right(90);
            bob.down();
            bob.forward(80); // น่าจะประตู
            bob.right(90);
            bob.forward(60);
            bob.right(90);
            bob.forward(80);
            bob.up();
            bob.right(90);
            bob.forward(20);
            bob.right(90);
            bob.forward(30);
            bob.right(90);
            bob.down();
            bob.forward(2); //กลอนประตู
            bob.up();
            bob.forward(20);
            bob.left(90);
            bob.forward(80);
            bob.down();
            bob.forward(40); // window
            bob.left(90);
            bob.forward(60);
            bob.left(90);
            bob.forward(40);
            bob.left(90);
            bob.forward(60);
            bob.up();
            bob.left(180); // ทำเส้นหน้าต่างแนวตั้ง
            bob.forward(30);
            bob.right(90);
            bob.down();
            bob.forward(40);
            bob.up();
            bob.left(90); // ทำเส้นหน้าต่างแนวนอน
            bob.forward(30);
            bob.left(90);
            bob.forward(20);
            bob.left(90);
            bob.down();
            bob.forward(60);
    }
}