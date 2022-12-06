
public class java2_p640_ThreadEx10 {

    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup grp1 = new ThreadGroup("Group1");
        ThreadGroup grp2 = new ThreadGroup("Group2");

        ThreadGroup subGrp1 = new ThreadGroup(grp1, "subGroup1");

        grp1.setMaxPriority(3);

        Thread th1 = new Thread(grp1, "th1");
        Thread th2 = new Thread(subGrp1, "t2");
        Thread th3 = new Thread(grp2, "th3");

        th1.start();
        th2.start();
        th3.start();

        System.out.println(">>List of ThreadGroup : " + main.getName() + ", Active ThreadGroup: "
                + main.activeGroupCount() + ", Active Thread: " + main.activeCount());

        main.list();
    }

}
