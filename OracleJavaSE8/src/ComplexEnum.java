/**
 * @author linh.truongthe
 * Complex Enum with local field.
 */

public enum ComplexEnum {
    /**
     * ON
     */
    ON("Power on"),

    /**
     * OFF
     */
    OFF("Power off"),

    /**
     * SUSPEND
     */
    SUSPEND("Power suspend");

    private final String description;


    ComplexEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        System.out.println(ON.getDescription());

        System.out.println(ON.toString());
    }
}
