public class Practice47 {

    public static void main(String args[]){
        // Move all zeros to end
        int[] numbers = {1,2,0,3,0,4,5,0,6};
        int n = numbers.length;
        int[] result = new int[n];
        int index = 0;
        int zero = n-1;
        for(int i=0;i<n;i++){
            result[i] = 0;
        }

        // for(int i:result){
        //     System.out.print(i+" ");
        // }

        for(int i=0;i<n;i++){
            if(numbers[i] != 0){
                result[index] = numbers[i];
                index++;
            }
        }

        for(int a: result){
            System.out.print(a+" ");
        }
        
    }
}