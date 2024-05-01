package lesson26_Practise;

public class Motherboard extends CompSystem {
    Chipset chipsetType;
    String CPU_Type;
    String memoryType;
    String ATX_Type;
    int numberOfMemorySlots;
    boolean isFlashBIOS_Button;
    boolean isWifi;
    boolean isTypeC;


    public String getCPU_Type() {
        return CPU_Type;
    }

    public void setCPU_Type(String CPU_Type) {
        this.CPU_Type = CPU_Type;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public String getATX_Type() {
        return ATX_Type;
    }

    public void setATX_Type(String ATX_Type) {
        this.ATX_Type = ATX_Type;
    }

    public int getNumberOfMemorySlots() {
        return numberOfMemorySlots;
    }

    public void setNumberOfMemorySlots(int numberOfMemorySlots) {
        this.numberOfMemorySlots = numberOfMemorySlots;
    }

    public boolean isFlashBIOS_Button() {
        return isFlashBIOS_Button;
    }

    public void setFlashBIOS_Button(boolean flashBIOS_Button) {
        isFlashBIOS_Button = flashBIOS_Button;
    }

    public boolean isWifi() {
        return isWifi;
    }

    public void setWifi(boolean wifi) {
        isWifi = wifi;
    }

    public boolean isTypeC() {
        return isTypeC;
    }

    public void setTypeC(boolean typeC) {
        isTypeC = typeC;
    }

    public Motherboard(Chipset chipsetType, String CPU_Type, String memoryType, String ATX_Type, int numberOfMemorySlots, boolean isFlashBIOS_Button, boolean isWifi, boolean isTypeC) {
        this.chipsetType = chipsetType;
        this.CPU_Type = CPU_Type;
        this.memoryType = memoryType;
        this.ATX_Type = ATX_Type;
        this.numberOfMemorySlots = numberOfMemorySlots;
        this.isFlashBIOS_Button = isFlashBIOS_Button;
        this.isWifi = isWifi;
        this.isTypeC = isTypeC;
    }
}
