public class Practice19 {

    
    public static void main(String args[]){
        int count =0;
        int nums[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                count++;
                System.out.print(nums[i][j] + " ");
                // System.out.println(count);

            }
            System.out.println();
        }
        // System.out.println(count);
    }
}