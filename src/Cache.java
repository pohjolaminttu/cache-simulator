/*
In cache, there need to be blocks for temporarily saving data.
And they need to be initially empty.

READING
There need to be a way to check, if some specific data (it's address first) is in cache
IF NOT -> fetch it from memory and change validity pin to 1 (I think)

WRITING
probably first check if there is data -> modify and change the validity pin
send data and 1 (write) to memory
 */
public class Cache {
    /*blocks etc structure where to save staff*/
    public Cache(){}

    /**
     * Handles the request from CPU and operates either reading or writing method
     * Calls DRAM (memory) if READ is miss and always when WRITE
     * @.pre requestType == 1 || requestType == 0
     */
    public void requestFromCPU(int requestType, /*Address / int address, */ int dataOut){
        /*START; parsing given address and check if MISS or HIT and print that*/
        if (requestType == 0) /*READ*/ {
            System.out.print("read");
        } else if (requestType == 1) /*WRITE*/ {
            System.out.print("write");
        }
    }
}

