class Sortering{

    public void buble(int[] array, int lengde){

        for(int x = 0; x<lengde-1;x++){
            for(int y = 0; y<lengde-x-1; y++){
                if(array[y]>array[y+1]){
                    int tmp = array[y];
                    array[y] = array[y+1];
                    array[y+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sortering s = new Sortering();
        int[] liste = {1,6,43,2,7};
        s.buble(liste, liste.length);

        for(int x = 0; x<liste.length;x++){
            System.out.println(liste[x]);
        }
    }
}