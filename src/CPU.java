public class CPU {
    Cache cache;

    public CPU(Cache cache){
        this.cache = cache;
    }

    public void request(int requestType, String address, int dataOut ){
        if (requestType == 0) /*READ*/ {
            System.out.println("\nCPU: read");
            int data_In = cache.requestFromCPU(0, address, 0,0);
            System.out.println("Data: "+ data_In);
        } else if (requestType == 1) /*WRITE*/ {
            System.out.println("\nCPU: write");
            System.out.println("Data: "+ dataOut);
            cache.requestFromCPU(1, address, dataOut, 0);
        }
    }

}
