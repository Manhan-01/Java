public class Practice47 {

    public static void main(String args[]){
        // Move all zeros to end
        // int[] numbers = {1,2,0,3,0,4,5,0,6};
        // int n = numbers.length;
        // int[] result = new int[n];
        // int index = 0;
        // int zero = n-1;
        // for(int i=0;i<n;i++){
        //     result[i] = 0;
        // }

        // // for(int i:result){
        // //     System.out.print(i+" ");
        // // }

        // for(int i=0;i<n;i++){
        //     if(numbers[i] != 0){
        //         result[index] = numbers[i];
        //         index++;
        //     }
        // }

        // for(int a: result){
        //     System.out.print(a+" ");
        // }



        // Search Insert position LEETCODE #35
        // int[] odds = new int[5000];

        int[] odds = {1,3,5,8,9};
        int count = 0;
        int[] result = new int[odds.length];
        for(int i=0;i<10000;i++){
            if((i%2)!=0){
                odds[count] = i;
                count++;
            }
        }

        for(int i:result){
            System.out.print(i+" ");
        }
        
    }
}