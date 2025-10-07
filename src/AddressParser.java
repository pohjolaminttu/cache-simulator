/**
 * In CPU we have addresses in hexadecimal form, 0x00 to 0x3F (String)
 * In cache we have addresses in binary form, 000000 to 111111 (String)
 * In DRAM we have addresses in decimal form, 0 to 63 (Integer)
 */
public class AddressParser {

    public static int toDram (String address) {
        int add = Integer.parseInt(address, 2);
        return add;
    }

    public static String toCache (Object address) {
        String add = "";
        if (address instanceof String)/*Comes from CPU*/ {
            add = Integer.toBinaryString(Integer.parseInt((String) address, 16));
        } else if (address instanceof Integer) /*Comes from DRAM*/ {
            add = Integer.toBinaryString((Integer) address);
        }
        return add;
    }

    public static int cacheIndex (String address) { //This method is for taking index out of address
        String index = address.substring(2); //We want 2-5 bits for index. 0-1 are for the tag
        return Integer.parseInt(index, 2);
    }

    public static int cacheTag (String address) {
        String tag = address.substring(0,2);
        return Integer.parseInt(tag, 2);
    }
}
