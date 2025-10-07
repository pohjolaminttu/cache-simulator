//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //We'll link DRAM, cache and CPU to each other for cohesion
        DRAM dram = new DRAM(64);

        Cache cache = new Cache(dram, 16);

        CPU cpu = new CPU(cache);

        //Here's the space for giving CPU commands for demonstration
        //----------------------------------------------------------
        System.out.println("Saving random data to DRAM...");
        dram.initializeDram();
        //----------------------------------------------------------
        System.out.println("------------------------\nSending some reading requests to cache:");
        cpu.request(0, "00003F", 0);
        cpu.request(0,"000004",0);
        cpu.request(0,"00002D",0);
        cpu.request(0, "00003F", 0);

        System.out.println("\n------------------------\nSending some writing requests to cache:");
        cpu.request(1,"00003F", 3465);
        cpu.request(1, "00001E", 26);
        cpu.request(1, "00002D", 784);

        System.out.println("\n------------------------\nLet's see if writing requests changed data:");
        cpu.request(0, "00003F", 0);
        cpu.request(0,"00002D",0);
    }
}