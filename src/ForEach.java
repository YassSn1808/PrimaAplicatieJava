public class ForEach {
    public static void main(String[] args) {
        int[] vectorOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 3; i < vectorOfInts.length; i++) {
            System.out.println("elementul de pe pozitia" + i + "este: " + vectorOfInts[i]);
            System.out.println("-----------------");
        }
        //for enhaced loop- for each
        for(int element : vectorOfInts){
            System.out.println("FOR2-Elementul este" +element);
        }
        System.out.println("-------------------");
        for(int i= 1 ; i< vectorOfInts.length; i= i+2){
            System.out.println("FOR3-Elementul de pe pozitia" +i+ "este" +vectorOfInts[i]);
        }
        System.out.println("----------------------");
        for(int i= 1; i< vectorOfInts.length; i= i+ 2){
            System.out.println("FOR4-Elementul de pe pozitia" +i+ "este: "+ vectorOfInts[i]);
        }
    }
}
