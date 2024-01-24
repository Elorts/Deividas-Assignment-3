package com.coderscampus.assignment3;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
