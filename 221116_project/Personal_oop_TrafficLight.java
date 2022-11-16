class Traffic_Light {
    private boolean redLight = false;
    private boolean orangeLight = false;
    private boolean greenLight = false;

    public Traffic_Light() {
    }

    public Traffic_Light(boolean redLight, boolean orangeLight, boolean greenLight) {
        this.redLight = redLight;
        this.orangeLight = orangeLight;
        this.greenLight = greenLight;
    }
    /*
     * public void setVehicleLightOn(boolean redLight) {
     * try {
     * System.out.println("빨간불입니다.");
     * Thread.sleep(10000);
     * this.redLight=redLight;
     * } catch(InterruptedException e) {
     * 
     * }
     * }
     */

    public void VehicleLightOn() {
        do {
            try {
                System.out.println("빨간불입니다.");
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
            try {
                System.out.println("주황불입니다.");
                Thread.sleep(4000);

            } catch (InterruptedException e) {

            }
            try {
                System.out.println("초록불입니다.");
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
        } while (true);
    }

    /*
     * public boolean getVehicleLightOn() {
     * if(redLight==false) {
     * return this.redLight;
     * } else if(orangeLight==false) {
     * return this.orangeLight;
     * } else {
     * return this.greenLight;
     * }
     * }
     */

    public void PassengerLightOn() {
        do {
            try {
                System.out.println("빨간불입니다.");
                Thread.sleep(30000);
            } catch (InterruptedException e) {

            }
            try {
                System.out.println("초록불입니다.");
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
            try {
                System.out.println("초록불이 깜빡입니다.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
        } while (true);
    }

}

public class Personal_oop_TrafficLight {

    public static void main(String[] args) {
        Traffic_Light tl = new Traffic_Light();
        tl.VehicleLightOn();
        tl.PassengerLightOn();
    }

}
