package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("yamada", 1, 59, "♀");
        Customer customer2 = new Customer("tanaka", 2, 55, "♂");

        System.out.println("顧客名：" + customer1.getName());
        System.out.println("id:" + customer1.getId());
        System.out.println("年齢:" + customer1.getOld());
        System.out.println("性別：" + customer1.getSex());

        System.out.println("顧客名：" + customer2.getName());
        System.out.println("id:" + customer2.getId());
        System.out.println("年齢:" + customer2.getOld());
        System.out.println("性別：" + customer2.getSex());
// Setter
        customer1.setOld(60);
        System.out.println("yamadaは" + customer1.getOld() + "歳になりました");

        int num = customer1.getOld();
        if (num >= 60) {
            System.out.println(customer1.getName() + "はシニア料金です。");
        } else if (num < 60) {
            System.out.println(customer1.getName() + "は一般料金です。");
        }
        int num2 = customer2.getOld();
        if (num2 >= 60) {
            System.out.println(customer2.getName() + "はシニア料金です。");
        } else if (num2 < 60) {
            System.out.println(customer2.getName() + "は一般料金です。");
        }
        {
// List
            List<String> names = new ArrayList<>();
            names.add("yamamoto");
            names.add("suzuki");
            names.add("miki");
// Map
            Map<String, String> userMap = new HashMap<>();
            userMap.put("yamamoto", "A組38番です。");
            userMap.put("suzuki", "B組11番です。");
            userMap.put("miki", "C組25番です。");
            System.out.println(names.size());
            System.out.println(names.get(0));
            System.out.println(names.get(1));
            System.out.println(names.get(2));
            System.out.println(userMap.get("yamamoto"));
            for (String name : names)
                if (name.equals("suzuki")) System.out.println(userMap.get(name));

        }
    }
}

