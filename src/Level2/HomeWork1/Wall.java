package Level2.HomeWork1;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height) {this.height = height;}

    @java.lang.Override
    public boolean doIt(Competitor c) {
        return c.jump(height);
    }
}
