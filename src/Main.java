//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //We'll link DRAM, cache and CPU to each other for cohesion
        DRAM dram = new DRAM(64);

        Cache cache = new Cache(dram, 16);

        CPU cpu = new CPU(cache);

        //Here's the space for giving CPU commands for demonstration


    }
}