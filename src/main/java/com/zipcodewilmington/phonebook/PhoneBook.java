package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> myMap;

    public PhoneBook(Map<String, List<String>> map) {

        this.myMap = map;
    }

    public PhoneBook() {
         this.myMap = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        myMap.put(name,numbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        myMap.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        myMap.remove(name);
    }

    public Boolean hasEntry(String name) {

        return myMap.containsKey(name);
    }

    public List<String> lookup(String name) {

        return null;
    }

    public String reverseLookup(String phoneNumber)  {

        return null;
    }

    public List<String> getAllContactNames() {
        ArrayList<String> contacts = new ArrayList<>(myMap.keySet());
        return contacts;
    }

    public Map<String, List<String>> getMap() {

        return myMap;
    }
}
