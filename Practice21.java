// Here we are practicing the array problems given by chatgpt

import java.util.Scanner;

public class Practice21 {

    public static void main(String args[]){
        // int nums[][] = new int[3][3];
        int nums[][] = {
            {1,2,3},
            {4,21,6},
            {7,8,21}
        };


        // Print all elements row wise
        // for(int i=0;i<3;i++){
        //     for (int j=0;j<3;j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Print each row in new line
        // for(int i=0;i<3;i++){
        //     System.out.print(nums[0][i]+" ");
        // }

        // Print column 
        // for(int i=0;i<3;i++){
        //     System.out.println(nums[i][0]);
        // }

        // Print specific row;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();

        // if(n<3){
        //     for(int i=0;i<3;i++){
        //     System.out.print(nums[n][i] + " ");
        //     }
        // }else{
        //     System.out.println("Enter valid number");
        // }


        // Print specific column
        // for(int i=0;i<3;i++){
        //     System.out.println(nums[i][n]);
        // }


        // Sum of all elements in each row;
        // System.out.println("Enter row name to find sum of its all elements");
        // int n = sc.nextInt();
        // int sum =0;
        // for(int i=0;i<3;i++){
        //         sum=sum+nums[n][i];
        // }
        // System.out.println(sum);



        // sum of all array pushed into an array(not worked)
        // int res[] ={};
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         sum=sum+nums[i][j];
        //     }
        //     // System.out.println(sum);
        //     res[i] = sum;
        // }
        // System.out.println(res);


        // Find maximum element
        // int max = 0;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if(nums[i][j] > max){
        //             max = nums[i][j];
        //         }
        //     }
        // }
        // System.out.println("Largest number in array is : "+max);



        // Count even and odd numbers
        int even = 0;
        int odd = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(nums[i][j]%2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
        }    
        System.out.println("Even : "+even+" odd : "+odd);    


    }    
}