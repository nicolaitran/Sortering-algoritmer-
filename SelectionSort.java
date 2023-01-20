class SelectionSort {
    
    public void sort(int[] array){
    
        for(int x = 0; x<array.length-1;x++){

            int minstePlass = x; //Sette det forste elemente som minste

            for(int y = x+1; y<array.length; y++){
                if(array[y]<array[minstePlass]){ //Sjekker om det neste elementet er mindre enn det minste
                minstePlass = y; //Setter elementet som minste
                }
            }

            int tmp = array[x];
            array[x] = minstePlass;
            array[minstePlass] = tmp;
            
        }
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] liste = {9,1,5,10,2};
        s.sort(liste);
        for(int x = 0; x<liste.length;x++){
            System.out.println(liste[x]);
        }
    }
}
