public class Main {
    public static void main(String[] args) {

        System.out.println(verifyNumbers(5,10));
        pozitiveNegative(0);
        System.out.println(returnPozitiveNegative(200));
        printString("hellow word",5);
    }
    public static boolean verifyNumbers(int number1,int number2){
        if(number1+number2 >= 10 && number1+number2 <= 20){
            return true;
        }
        else {
            return false;
        }
    }
    public static void pozitiveNegative(int number){
        if(number >= 0){
            System.out.println("Число положительное");
        }
        else if(number < 0){
            System.out.println("Число отрицательное");
        }
    }
    public static boolean returnPozitiveNegative(int number){
        if(number >= 0){
            return true;
        }
        else {
           return false;
        }
    }
    public static void printString(String s,int count){
        for(int i = 0; i<count; i++){
            System.out.println(s);
        }
    }

}
