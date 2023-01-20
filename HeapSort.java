class HeapSort {
    
    public void bubbleDown(int[] array, int i, int n){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && array[largest]<array[left]){
            int tmp = array[largest];
            array[largest] = array[left];
            array[left] = tmp;
        }
        if(right<n && array[largest]<array[right]){
            int tmp = array[largest];
            array[largest] = array[right];
            array[right] = tmp;
        }
        if(i != largest){
            int tmp = array[largest];
            array[largest] = array[i];
            array[i] = tmp;
            bubbleDown(array, largest, n);
        }
    }

    public void maxHeap(int[] array, int n){
        int teller = (int) Math.floor(n/2);
        for(int i = teller; i>=0; i--){
            bubbleDown(array, i, n);
        }
    }

    public void sort(int[] array){
        maxHeap(array, array.length);
        int str = array.length-1;
        for(int i = str; i>=0; i--){
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            bubbleDown(array, 0, i);
        }
    }

    

    public static void main(String[] args) {
        HeapSort s = new HeapSort();
        int[] liste = {9,1,5,10,2,7,11,42};
        s.sort(liste);
        for(int x = 0; x<=liste.length-1;x++){
            System.out.println(liste[x]);
        }
    }
}
