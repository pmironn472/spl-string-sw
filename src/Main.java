import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> devs = new ArrayList<>();

        devs.add("Johny");
        devs.add("Valerya");
        devs.add("Tatyana");
        devs.add("Peter");
        devs.add("Marry");

        for (String dev : devs) {
            System.out.println(dev.charAt(0) + " --> The intial of the name -->  " + dev);
        }

        System.out.println();


        int maxLength = devs.size();
        for (String dev : devs) {
            if (dev.length() > maxLength) {
                maxLength = dev.length();
                System.out.println("The longest name are --> " + dev + "  with the length of " + maxLength);
            }

        }

        //FIRST METHOD OF SWAPING
        String temp = devs.get(0);
        devs.set(0,devs.get(4));
        devs.set(4,temp);
        System.out.println(devs);

        System.out.println();


        //SECOND METHOD OF SWAPING
        Collections.swap(devs,0,4);

        System.out.println(devs);
    }


}


