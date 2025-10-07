/**
 * The hardware of DRAM is organized in a matrix ( rows x columns )
 * But the memory locations are named in "serial numbers" so they have a particular order
 * In this simulator we localize the wanted memory location by those order sequential numbers
 * All the memory locations are initially empty
 */
import java.util.Random;

public class DRAM {
    private int[] memory; //The data in memory decimal number as instructed
    private int memorySize; //In bytes
    Random rand = new Random();

    public DRAM(int size){
            memorySize = size;
            memory = new int[memorySize];
    }

    //INITIALIZE RANDOM DATA TO DRAM ALLOWING TESTING
    public void initializeDram(){
        for (int i = 0; i < memorySize;  i++){
            memory[i] = rand.nextInt(9000);
        }
        System.out.println("...\n...\nDone!\n");
    }

    /**
     * Method checks whether the type of request is read or write, and do that in given address
     * @.pre requestType == 1 // requestType == 0
     */
    public Integer requestToMemory (int requestType, String address, int dataOut, int dataIn ) { //In my opinion we don't need dataIn here, but it was instructed, so I keep it like this
        int add = AddressParser.toDram(address);
        if (requestType == 0) /*READ*/ {
            System.out.println("Reading from DRAM...");
            return memory[add];
        } else /*WRITE, @.pre ensures there is no option for requestType other than 0 or 1*/{
            memory[add] = dataOut;
            System.out.println("Writing to DRAM...");
            return null; //We don't have to return anything when writing. But because read/write are in the same method, we need to return null here
        }
    }


}
