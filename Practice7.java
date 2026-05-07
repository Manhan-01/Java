public class Practice7 {

    public static void main(String args[]){

        //Creating word 3 List arrays to pick the word from each array
        String[] wordList1 = {"Hi","Hello","Hey","Mr/Mrs","Oii"};
        String[] wordList2 = {"Mandy","Dumms","Mahantesh","Shilpa"};
        String[] wordList3 = {"How are you?","Where are you?","What's the plan for this weekend","Have a great day!","Keep Smiling :)"};

        //Get the length of each arrays and store it in int var
        int words1 = wordList1.length;
        int words2 = wordList2.length;
        int words3 = wordList3.length;

        // System.out.println(words1);

        // genereate random number based on the word length
        java.util.Random randGen = new java.util.Random();
        int rand1 = randGen.nextInt(words1);
        int rand2 = randGen.nextInt(words2);
        int rand3 = randGen.nextInt(words3);

        // System.out.println(rand1);

        // stitch everything into a sentence and store it in a String var
        String result = wordList1[rand1]+" "+wordList2[rand2]+" "+wordList3[rand3];
        System.out.println(result);



    }
}