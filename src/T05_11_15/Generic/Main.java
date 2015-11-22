package T05_11_15.Generic;

import java.util.ArrayList;

/**
 * @author Vadim
 * Created by roma on 05.11.15.
 */
public class Main {
    public static void main(String[] args) {
        ExampleGeneric<String> petro = new ExampleGeneric<>();
        petro.setOb("Мужик");
        petro.showType();

        ArrayList<Integer> list = new ArrayList();
        list.get(0).longValue();



    }
}