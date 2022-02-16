package Level2.HomeWork1;



public class Cat implements Competitor {

    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
//        this.onDistance = true;
    }
//    public Cat() {
//        this(300, 3);
//    }

    @java.lang.Override
    public boolean run(int dist) {
        if (dist < maxRun) {
            System.out.println("Кот успешно пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Кот не смог пробежать " + dist + "м");
            return false;
        }
    }

    @java.lang.Override
    public boolean jump(int dist) {
        if (dist < maxJump) {
            System.out.println("Кот успешно перепрыгул " + dist + "м");
            return true;
        } else {
            System.out.println("Кот не смог перерпрыгнуть " + dist + "м");
            return false;
        }
    }
}
