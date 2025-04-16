package controllers;

import models.Person;
import views.showConsole;

public class MetodosBusquedaBinario {
    private Person [] people;
    private showConsole pantalla;

    public MetodosBusquedaBinario(Person[] people) {
        this.people = people;
        this.pantalla=new showConsole();
        pantalla.showMessage("Metodo de Busqueda Binaria");
    }

    private int findPersonByCode (int code){
        int bajo =0;
        int alto= people.length;

        while (alto>=bajo) {
            int central=(alto+bajo)/2;
            if (people[central].getCode()==code){
                return central;
            }

            if (people[central].getCode()>code){
                alto=central-1;  //Izq

            }else{
                bajo=central+1;  //Derecha
            }
        }
        return -1;
    }

    public void showPerson(){
        int codeToFind=pantalla.inputCode();
        int indexPerson=findPersonByCode(codeToFind);
        if (indexPerson==-1){
            pantalla.showMessage("Persona con codigo: "+codeToFind+" Encontrada");
        }else{
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    // Antes de llamar a findPersonByName()
    private int findPersonByName(String name){

        if (people [0].getName().equals(name)){
            //return central;
        }

        if (people [0].getName().compareTo(name)>0){ 

        }
        return -1;
    }
}
