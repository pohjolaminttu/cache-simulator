public class DRAM {
    private int[][] memory;
    private int rows;
    private int cols;

    /**
     *
     * @.pre size > 0 && Math.sqrt(size) % 1 == 0
     */
    public DRAM(int size){
            rows = (int)Math.sqrt(size);
            cols = rows; /*Tarvitaanko tätä, ehkä osotteiden setvimisessä?*/
            memory = new int[rows][cols];
        }
}
