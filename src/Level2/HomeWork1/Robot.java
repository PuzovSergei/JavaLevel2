package Level2.HomeWork1;

public class Robot implements Competitor {
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
//    public Robot() {
//        this(10000, 5);
//    }

    @java.lang.Override
    public boolean run(int dist) {
        if (dist < maxRun) {
            System.out.println("Робот успешно пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + dist + "м");
            return false;
        }
    }

    @java.lang.Override
    public boolean jump(int dist) {
        if (dist < maxJump) {
            System.out.println("Робот успешно перепрыгул " + dist + "м");
            return true;
        } else {
            System.out.println("Робот не смог перерпрыгнуть " + dist + "м");
            return false;
        }
    }
}

