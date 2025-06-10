class MyArray {
    int arr[];
    public static void main(String[] args){
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                arr[i] = i * i;
            }
            else {
                arr[i] = i;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}