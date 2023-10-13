package lesson8;

public class Phone {
    private String number;
    private String model;
    private int weight;
    private String callerName;

    public String getCallerName() {         // четвертое
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }


    public static void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public Phone(String number, int weight, String model) {   //пятое
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    public Phone(String number, String model) {    //шестое
        this.number = number;
        this.model = model;
    }

    public Phone() {        //седьмое

    }

    public static void printCharactOfPhones(Phone phone) {     //третье
        System.out.println(phone.model + " " + phone.number + " " + phone.weight);
    }


}
