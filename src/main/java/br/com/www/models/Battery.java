package br.com.www.models;

public class Battery {
    private Integer level;

    public Battery(Integer startLevel) {
        if (startLevel < 0) {
            System.out.println("Incompatible battery level. The battery level has been changed to 0%.");
            this.level = 0;
        } else if (startLevel > 100) {
            System.out.println("Incompatible battery level. The battery level has been changed to 100%.");
            this.level = 100;
        } else {
            this.level = startLevel;
        }
    }

    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer newLevel) {
        if (newLevel > 100 || newLevel < 0) {
            System.out.println("Incompatible battery level. The battery level hasn't been changed.");
        } else {
            this.level = newLevel;
        }
    }

    public void showStatus() {
        if (level == 0) {
            System.out.printf("Status: No battery (%d%%).%n",
                    level);
        } else if (level <= 20) {
            System.out.printf("Status: Low battery (%d%%).%n",
                    level);
        } else if (level <= 79) {
            System.out.printf("Status: Battery ok (%d%%).%n",
                    level);
        } else {
            System.out.printf("Status: Full battery (%d%%).%n",
                    level);
        }
    }

    public static void main(String[] args) {
        Battery battery = new Battery(5);
        battery.showStatus();
    }
}
