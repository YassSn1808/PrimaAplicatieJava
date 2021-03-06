public class WhileDoWhile {
    public static void main (String [] args){
        int counter = 0;
        /*
        while (expresia este adevarata){
        blocul de cod
        }


    */
        while (counter < 25){
            System.out.println("counter-ul are valoarea" +counter);
            counter++;
        }
        System.out.println("------------------------------------");
        counter = 0;
        do{
            System.out.println("DOWHILE - counter-ul are valoarea" + counter);
            counter++;
        }while(counter < 25);
    }
}
