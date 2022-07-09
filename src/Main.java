public class Main {

    public static void main (String args[]) {

        /* a potential demo of how to use the PID controller to control
        motor power. NOTE: this takes ticks, not inches (use conversion function).
         */
        Motor m = new Motor();
        MovementPIDController pM = new MovementPIDController();

        m.setPower(pM.calculate(100, m.getCurrentPosition()));


    }

}
