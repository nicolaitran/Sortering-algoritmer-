class QuickSort {
    
    public int partition(int[] array, int low, int high){
        int p = (int) Math.floor(low+high)/2; //Kanskje finne en bedre måte for pivot senere
        
        int tmp = array[high];
        array[high] = array[p];
        array[p] = tmp;

        int pivot = array[high];
        int left = low;
        int right = high -1;

        while(left<=right){
            while(left<=right && array[left]<=pivot){
                left = left +1;
            }
            while(right>=left && array[right] >= pivot){
                right = right-1;
            }
            if(left < right){
                int mid = array[left];
                array[left] = array[right];
                array[right] = mid;
            }
        }
        int n = array[left];
        array[left] = array[high];
        array[high] = n;
        return left;
    }

    public int[] quick(int[] array, int low, int high){
        if(low>=high){
            return array;
        }
        int p = partition(array, low, high);
        quick(array, low, p-1);
        quick(array, p+1, high);
        return array;
    } 

    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int[] liste = {10,2,5,11,64,1,0,34};
        s.quick(liste, 0, liste.length-1);
        for(int x = 0; x<liste.length;x++){
            System.out.println(liste[x]);
        }
    }
}
