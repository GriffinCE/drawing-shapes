public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle turtle = new Turtle();
        int n = 4;
        for (int i = 0; i < n; i++) {
            turtle.forward(50);
            turtle.right(360 / n);
        }
        
        // Task 2: Draw a regular shape many times
        turtle.up();
        turtle.setPosition(200, 0);
        turtle.down();
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < n; j++) {
                turtle.forward(50);
                turtle.right(360 / n);
            }
            turtle.right(50);
        }
        // Task 3: How many times does Turtle turn!
        turtle.up();
        turtle.setPosition(0, -200);
        turtle.down();
        int sum = 0;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < n; j++) {
                turtle.forward(50);
                turtle.right(360 / n);
                sum++;
            }
            turtle.right(50);
        }
        System.out.print("Turtle has turned " + sum + " times!");

        
        // Extension 1:
        
        
        // Extension 2:

    }
}
