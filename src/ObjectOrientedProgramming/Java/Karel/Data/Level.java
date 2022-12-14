package ObjectOrientedProgramming.Java.Karel.Data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium level"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
