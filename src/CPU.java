public class CPU {
    Cache cache;

    public CPU(Cache cache){
        this.cache = cache;
    }

    public void request(int requestType, /*Address VAI Int address */ int dataOut ){
        if (requestType == 0) /*READ*/ {
            System.out.println("CPU: read");
            /* LÄHETETÄÄN PYYNTÖ CACHELLE, 0 + ADDRESS */
        } else if (requestType == 1) /*WRITE*/ {
            System.out.println("CPU: write");
            /* LÄHETETÄÄN PYYNTÖ CACHELLE, 0 + ADDRESS + DATAOUT */
        }
    }

}
