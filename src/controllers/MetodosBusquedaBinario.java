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
            pantalla.showMessage("Persona con codigo: "+codeToFind+" Encontrada ");
        }else{
            pantalla.showMessage(people[indexPerson].toString());
        }
    }


    private int findPersonByName(String name) {
        int low = 0;
        int high = people.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = people[mid].getName().compareToIgnoreCase(name);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void showPersonByName() {
        String nameToFind = pantalla.inputName(); // método que debe pedir un nombre
        int index = findPersonByName(nameToFind);

        if (index == -1) {
            pantalla.showMessage("No se encontró ninguna persona con el nombre: " + nameToFind);
        } else {
            pantalla.showMessage("Persona encontrada: " + people[index].toString());
        }
    }
}
