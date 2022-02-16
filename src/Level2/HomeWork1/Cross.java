package Level2.HomeWork1;

public class Cross implements Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @java.lang.Override
    public boolean doIt(Competitor c) {
        return c.run(dist);
    }
}
