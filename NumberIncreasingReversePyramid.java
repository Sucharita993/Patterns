public class NumberIncreasingReversePyramid {
    

    public static void main(String[] args) {
        
        int size = 6;

        for (int i = 0; i <= size; i++) {
            
            for (int j = 1; j <= size-i; j++) {
                
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
