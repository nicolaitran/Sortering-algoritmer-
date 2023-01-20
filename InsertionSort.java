class InsertionSort {

    public void sort(int[] array){
        for(int x = 0; x<array.length; x++){
            
            int y = x;

            while(y>0 && array[y-1]>array[y]){ //Hvis elementet til venstre er større enn y
                int tmp = array[y];
                array[y] = array[y-1];
                array[y-1] = tmp;
                y = y-1;
            }
        }
    }

    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        int[] liste = {24,5,2,6,10};
        s.sort(liste);
        for(int x = 0; x<liste.length;x++){
            System.out.println(liste[x]);
        }
    }
}
