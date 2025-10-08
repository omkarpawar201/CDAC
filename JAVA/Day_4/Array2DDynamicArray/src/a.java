public static int maxOfAll() {
    int[] temp = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        temp[i] = arr[i][0]; // assign 1 st element of the row
        for (int j = 0; j < arr[i].length; j++) {
            if (temp[i] < arr[i][j]) {
                temp[i] = arr[i][j];
            }
        }
    }

    return temp;
}