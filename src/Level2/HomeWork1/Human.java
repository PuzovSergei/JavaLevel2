package Level2.HomeWork1;

public class Human implements Competitor{
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
//        this.onDistance = true;
    }
//    public Human() {
//        this(3000, 2);
//    }

    @java.lang.Override
    public boolean run(int dist) {
        if (dist < maxRun) {
            System.out.println("Человек успешно пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Человек не смог пробежать " + dist + "м");
            return false;
        }
    }

    @java.lang.Override
    public boolean jump(int dist) {
        if (dist < maxJump) {
            System.out.println("Человек успешно перепрыгул " + dist + "м");
            return true;
        } else {
            System.out.println("Человек не смог перерпрыгнуть " + dist + "м");
            return false;
        }
    }
}
