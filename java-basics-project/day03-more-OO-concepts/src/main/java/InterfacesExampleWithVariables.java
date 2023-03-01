public class InterfacesExampleWithVariables {
    public static void main(String[] args) {
        System.out.println(Constants.PI);
        System.out.println(Constants.WITHDRAW_LIMIT);
        //Constants.WITHDRAW_LIMIT = 11;
    }
}

interface Constants {
    //All the variables are implicitly public, static and final
    String REQUIRED_MESSAGE = "This field is mandatory";
    int WITHDRAW_LIMIT = 10;
    double PI = 3.14d;
}
