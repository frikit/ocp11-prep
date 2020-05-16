package org.github.ocp.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Start...");
        System.out.println(map);
        map.put("OCA", "exam");
        System.out.println(map);
        //false because such ke + value doesnt exist in map
        System.out.println(map.replace("OCA", "exam2", "exam3"));
        //true and get replaced
        System.out.println(map.replace("OCA", "exam", "exam3"));
        //return previous value
        System.out.println(map.replace("OCA", "exam9"));
        System.out.println("END!!!");
    }
}
