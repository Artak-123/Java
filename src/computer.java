public class computer {
    private final String brand;
    private final String model;
    private final int year;
    private final String CPU;
    private final int ram;
    private final int storage;

    public computer(String brand, String model, int year, String CPU, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.CPU = CPU;
        this.ram = ram;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public void displaySpecifications() {
        System.out.println(" Brand " + brand);
        System.out.println(" model " + model);
        System.out.println(" year " + year);
        System.out.println(" CPU " + CPU);
        System.out.println(" ram " + ram + " GB ");
        System.out.println(" storage " + storage + " GB ");
    }
    public void runProgram(String ProgramName){
        System.out.println(" running program: " + ProgramName);
    }
}

class DemoComputer{
    public static void main(String[] args) {
        computer comp = new computer("Lenovo","ThinkPad",2022,"Strong",512, 512);
        comp.displaySpecifications();
        comp.runProgram(" Windows ");
    }
}