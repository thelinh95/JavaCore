/**
 * @author linh.truongthe
 * Simmple Enum.
 */

public enum PowerStateEnum {
    /*
     * on
     */
    ON,

    /*
        off
     */
    OFF,

    /*
        supspend
     */
    SUPSPEND;

    public class Computer {
        PowerStateEnum state;

        public void setState(PowerStateEnum state) {
            this.state = state;
        }
    }


    public static void main(String[] args) {
        Computer computer = PowerStateEnum.ON.new Computer();
        computer.setState(OFF);
    }
}
