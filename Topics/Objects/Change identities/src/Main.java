class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        String name1 = p1.name;
        int age1 = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = name1;
        p2.age = age1;
    }
}