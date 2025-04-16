package controllers;

import models.Person;

public class MetodosOrdenamiento {

    public void sortByAge(Person[] people) {
        for (int i=0; i<people.length -1;i++){
            for (int j=0; j<people.length - i -1;j++){
                if (people[j].getCode() > people[j+1].getCode()){
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }

    public void sortByName(Person[] people){
        for (int i=0; i<people.length -1;i++){
            for (int j=0; j<people.length - i -1;j++){
                int resultadoComparacion = people[j].getName().compareTo(people[j+1].getName()) ;
                if (resultadoComparacion> 0 || (people[j].getName().compareTo(people[j+1].getName()) == 0
                && people[j].getCode() > people[j+1].getCode())){
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }  
}
