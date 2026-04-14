public class Practice20 {

    public static void main(String args[]){

        java.util.Random randNum = new java.util.Random();

        int nums[][] = new int[3][4];

        // Printing the full array;
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                nums[i][j] = randNum.nextInt(10);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        } 
        System.out.println();


        // Print a row in the array;

        for(int i=0;i<4;i++){
            System.out.print(nums[0][i]+" ");
        }

        System.out.println();
        System.out.println();


        // Print a column in the array;
        for(int i=0;i<3;i++){
            System.out.println(nums[i][0]);
        }

        // Print diagonal numbers of an array
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(nums[i][j] != nums[i][i]){
                    System.out.print(0+ " ");
                }else{
                    System.out.print(nums[i][i]);
                }
            }
            System.out.println();
        }

        }
}