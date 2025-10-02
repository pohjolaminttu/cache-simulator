/*
In cache, there need to be blocks for temporarily saving data.
And they need to be initially empty.
------------------------------------
CACHE BLOCKS AND ADDRESSING LOGIC:
Size of cache is 16 bytes ( 16 x 8 = 128 bits )
Block is size of 1 <- I assume it means byte, so there is total of 16 blocks in cache
Because there is only one possible place inside a block, we don't need offset at all.
And due to 16 blocks, we need log_2(16)=4 bits to present index
There will be 64 / 16 = 4 bytes fitted in the same block. Therefore we need log_2(4)=2 bits to tag
Memory address is 6-bit long and that is enough also for cache. [2]tag[4]index[0]offset
-------------------------------------
READING
There need to be a way to check, if some specific data (it's address first) is in cache
IF NOT -> fetch it from memory and change validity pin to 1 (I think)

WRITING
probably first check if there is data -> modify and change the validity pin
send data and 1 (write) to memory
 */
public class Cache {
    private int size; //Due to given size of block is 1, here "size" means amount of the blocks
    private CacheBlock[] blocks;
    DRAM dram;

    public Cache(DRAM dram, int size){
        this.dram = dram;
        this.size = size;
        blocks = new CacheBlock[size];
    }

    class CacheBlock {
        int tag;
        boolean valid;
        int data;
        public CacheBlock(int tag, boolean valid, int data) {
            this.tag = tag;
            this.valid = valid;
            this.data = data;
        }
    }

    /**
     * Handles the request from CPU and operates either reading or writing method
     * Calls DRAM (memory) if READ is miss and always when WRITE
     * @.pre requestType == 1 || requestType == 0
     */
    public void requestFromCPU(int requestType, String address, int dataOut, int dataIn){
        /*START; parsing given address and check if MISS or HIT and print that*/
        String add = AddressParser.toCache(address);
        int index = AddressParser.cacheIndex(add);
        //if () //JATKA TÄSTÄ -----------------------------------------------------------------------------------------

        if (requestType == 0) /*READ*/ {
            System.out.print("read");
        } else if (requestType == 1) /*WRITE*/ {
            System.out.print("write");
        }
    }
}

