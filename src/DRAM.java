public class DRAM {
    private int[] memory;
    private int memorySize;

    public DRAM(int size){
            memorySize = size;
            memory = new int[memorySize];
    }

    /**
     * Method checks whether type of request is read or write, and do that in given address
     * @.pre requestType == 1 // requestType == 0
     */
    public void requestToMemory (int requestType, String address, int dataOut, int dataIn ) { //do we actually need dataIn here?
        int add = AddressParser.toDram(address);
        if (requestType == 0) /*READ*/ {

        }
    }


}
