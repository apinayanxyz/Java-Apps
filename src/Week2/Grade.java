package Week2;

public enum Grade{
    NS (0) ,F (39),D (49),C (59),B (69),A (100);

    private final int value;

    private Grade(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}