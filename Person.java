/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertRemoveArrayList;

/**
 *
 * @author terr5020
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String sex;
    public Person(String n, int a){
        age=a;
        name=n;
    }
    public Person(String n, int a, String s){
        this(n,a);
        sex=s;
        
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }

    @Override
    public int compareTo(Person t) {
        String other=t.getName();
        return name.compareTo(other);
    }
}
