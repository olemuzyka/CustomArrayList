package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = initPerson("Oleg", "Muzyka", 24);
        Person person2 = initPerson("Valik", "Punda", 26);
        Person person3 = initPerson("Alik", "Krivko", 27);
        Person person4 = initPerson("Oleg", "Nosenko", 28);
        Person person5 = initPerson("Oleg", "Vovk", 28);

        CustomArrayList<Person> customList = new CustomArrayList();
        System.out.println("//Testing methods of list");

        System.out.println("\t" + "Action 1:");
        System.out.println("//Add objects to the list");
        customList.add(person1);
        customList.add(person2);
        customList.add(person3);
        customList.add(person4);
        customList.add(person5);

        System.out.println("\t" + "Action 2:");
        System.out.println("//Calling method size");
        System.out.println(customList.size());

        System.out.println("\t" + "Action 3:");
        System.out.println("//Display our list");
        customList.display();

        System.out.println("\t" + "Action 4:");
        System.out.println("//Calling method get");
        System.out.println("//Enter incorrect index");
        System.out.println(customList.get(7));
        System.out.println("//Enter correct index");
        System.out.println(customList.get(2));

        System.out.println("\t" + "Action 5:");
        System.out.println("//Display our list");
        customList.display();

        System.out.println("\t" + "Action 6:");
        System.out.println("//Calling method isEmpty");
        System.out.print("Is empty:" + "\t");
        System.out.println(customList.isEmpty());

        System.out.println("\t" + "Action 7:");
        System.out.println("//Calling method removeForIndex");
        System.out.println("//Enter incorrect index");
        System.out.println(customList.removeForIndex(8));
        System.out.println("//Enter correct index");
        System.out.println(customList.removeForIndex(0));

        System.out.println("\t" + "Action 8:");
        System.out.println("//Calling method removeForObject");
        System.out.println("//Enter of object which is not contained in the list");
        System.out.println(customList.removeForObject(person1));
        System.out.println("//Enter of object which is contained in the list");
        System.out.println(customList.removeForObject(person2));

        System.out.println("\t" + "Action 9:");
        System.out.println("//Check size of list");
        System.out.println(customList.size());

        System.out.println("\t" + "Action 10:");
        System.out.println("//Calling method contains");
        System.out.println("//Enter of object which is not contained in the list");
        System.out.print("Contains:" + "\t");
        System.out.println(customList.contains(person2));
        System.out.println("//Enter of object which is contained in the list");
        System.out.print("Contains:" + "\t");
        System.out.println(customList.contains(person4));


        System.out.println("\t" + "Action 11:");
        System.out.println("//Display our list");
        customList.display();

        System.out.println("\t" + "Action 12:");
        System.out.println("//Clone list");
        CustomArrayList<Person> cloneList = new CustomArrayList();
        cloneList.display();

        System.out.println("\t" + "Action 13:");
        System.out.println("//Trying to assign object of customList to variable of type Person and display it");
        Person d = customList.get(2);
        System.out.println(d);

        System.out.println("\t" + "Action 14:");
        System.out.println("//Calling method indexOf");
        System.out.println("//Enter of object which is not contained in the list");
        System.out.println(customList.indexOf(person1));
        System.out.println("//Enter of object which is contained in the list");
        System.out.println(customList.indexOf(person4));

        System.out.println("\t" + "Action 15:");
        System.out.println("//Calling method toArray");
        customList.toArray();

        System.out.println("\t" + "Action 16:");
        System.out.println("//Calling method clear");
        customList.clear();

        System.out.println("\t" + "Action 17:");
        System.out.println("//Display our list");
        customList.display();

    }



    public static Person initPerson(String name, String secondName, int age) {
        Person person = new Person();
        person.setName(name);
        person.setSecondName(secondName);
        person.setAge(age);
        return person;
    }


}
