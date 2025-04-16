package controllers;

import models.Person;
import views.showConsole;

public class MetodosBusqueda {

    private Person[]people;

    private showConsole showConsole;

    public MetodosBusqueda(Person[] persons){
        showConsole=new showConsole();
        this.people=persons;
        showPerson();
    }


        public int busquedaLineal(int [] array, int elemento){
            for (int i=0; i<array.length; i++){
                if (array[i]==elemento){
                    return i;
                }
            }
            return -1;
        }
        
/*
 * @parametro code a buscar
 * @return posicion de la persona encontrada
 */


        public int findPersonByCoide (int code){
            for (int i=0; i<people.length; i++){
                if (people[i].getCode()==code){
                    return i;
                }
            }
            return -1;
        }


        public void showPerson (){
            int codeToFinf = showConsole.inputCode();
            int indexPerson = findPersonByCoide(codeToFinf);
            if (indexPerson>=0){
                showConsole.showMessage("Persona Con codigo "+codeToFinf+" Encontrada");
                showConsole.showMessage(people[indexPerson].toString()); // Que es lo que hace: muestra la persona  y son .toString () los metodos de la clase
        } else {
            showConsole.showMessage("Persona no encontrada");
            }
    }



    // public void showPersonByName(){
    //     String nameTofind =showConsole.inputName();
    //     int indexPerson = findPersonByName(nameTofind);
    // }

    // public void findPersonByName (){
    //     return -1;
    // }

}
