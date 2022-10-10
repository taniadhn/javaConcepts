package com.dehghan.javaconcepts.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewFeatures {

    public static void main(String[] args) {

        List<User> userName = new ArrayList<>();

        userName.add(new User( 1,"Nika"));
        userName.add(new User( 2, "Hadis"));
        userName.add(new User( 3,"Mahsa"));
        userName.add(new User( 4, "Sarina"));

        //forEach her bir Eleman için parantezler arası işlemi yapacak bize
        //user nedir burda diye soracak olursanız: Lamda Function: bir obje gibi
       // başka fonkdsyonların pes edilmesini sağlayan bir fonksyon tanımlama şekli. burdaki user bu
        //bu fonksyonun parametresi. parametre için yapılan işleride sağ tarafımızda yazıyoruz
/***
        userName.stream().forEach(user -> {
            System.out.println("Java8");
            System.out.println(user.toString());
        });
*/

        userName.stream().forEach(user -> user.talk());
        /*2.şekil*/
        userName.stream().forEach(User::talk); //User Class içindeki Methodlara :: şekilde referance gösteriyoruz. METHOD REFERENCE

        //Filter Ve saydım
    //   long count = userName.stream().filter(user -> user.id<2).count();
      //  System.out.println("Count" + count);
        List <User> filteredList = userName.stream().filter(user -> user.id<3).collect(Collectors.toList());
        System.out.println("filteredList");
        filteredList.stream().forEach(User::talk);

       List<User> mapList = userName.stream().map(user -> new User(user.id+100, user.name)).collect(Collectors.toList());

       mapList.stream().forEach(user -> System.out.println(user.toString()));

       //Bir Listeyi direk olarak başka tipede dönüştürebiliriz. Onun için toMap kullanacam
       Map<Integer, String> userMap= userName.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
       userMap.forEach((key,value)-> System.out.println(key +":"+ value));


    }
}
class User{


    protected  int id;
    protected String name;

    public User( int id, String name){

        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
//Burada User bize ismini söylüyor
    public  void  talk(){

        System.out.println("Hi, I am" + this.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}