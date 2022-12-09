
public class google_Thread_RobotRace {

    public static void main(String[] args) {
        RobotRace robotA = new RobotRace("로봇 A");
        RobotRace robotB = new RobotRace("로봇 B");
        RobotRace robotC = new RobotRace("로봇 C");

        robotA.start();
        robotB.start();
        robotC.start();
    }

}

class RobotRace extends Thread {
    public RobotRace(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "가" + i * 10 + "m전진");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}
