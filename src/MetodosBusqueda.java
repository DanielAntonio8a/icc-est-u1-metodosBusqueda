public class MetodosBusqueda {
    public int busquedaLineal(int [] array, int elemento){
        for (int i=0; i<array.length; i++){
            if (array[i]==elemento){
                return i;
            }
        }
        return -1;
    }
}
