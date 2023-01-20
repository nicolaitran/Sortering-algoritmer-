class MergeSort2{

    public void mergeSort(int[] array){
        int i = array.length;
        if(i<2){
            return;
        }

        int midten = i/2;
        int venstre[] = new int[midten];
        int hoyre[] = new int[i-midten];

        for(int x = 0; x<midten; x++){
            venstre[x] = array[x];
        }
        for(int x = midten; x<i; x++){
            hoyre[x-midten] = array[x];
        }
        mergeSort(venstre);
        mergeSort(hoyre);

        merge(array, venstre, hoyre, midten, i-midten);

    }

    public void merge(int[] array, int[] venstre, int[] hoyre, int v, int h){
        int x = 0;
        int i = 0;
        int y = 0;

        while(x<v && i<h){
            if(venstre[x]<=hoyre[i]){
                array[y++] = venstre[x++];
            }
            else{
                array[y++] = hoyre[i++];
            }
        }
        while(x<v){
            array[y++] = venstre[x++];
        }
        while(i<h){
            array[y++] = hoyre[i++];
        }
    }

    public static void main(String[] args) {
        MergeSort2 s = new MergeSort2();
        int[] liste = {24,5,2,6,10,1,33,0,8};
        s.mergeSort(liste);
        for(int x = 0; x<liste.length;x++){
            System.out.println(liste[x]);
        }
    }
}