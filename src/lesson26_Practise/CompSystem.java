package lesson26_Practise;

abstract class CompSystem {
    public void start_stop (String startOrStop) {
        switch (startOrStop){
            case "start":
                System.out.println("Comp is turned on");
                break;
            case "stop":
                System.out.println("Comp is turned off");
                break;
            default:
                System.out.println("Choose right option");
        }
    }


}
