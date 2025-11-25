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
        turtle.setPosition(200, 0);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < n; j++) {
                turtle.forward(50);
                turtle.right(360 / n);
            }
            turtle.right(50);
        }
        // Task 3: How many times does Turtle turn!
        
        
        // Extension 1:
        
        
        // Extension 2:

    }
}
