public static List<String> Reference = new ArrayList<String>();
public static List<String> Sorted = new ArrayList<String>(); 

public void sort() {
    //converting any lists to Arrays for sorting
    String[] Reference_Array = departureTime.toArray(new String[Reference.size()]);
    String[] Sorted_Array = Sorted.toArray(new String[Sorted.size()]);

    int lenD = Reference_Array.length;
    int j = 0;
    for(int i=0;i<lenD;i++){
        j = i;
        for(int k = i;k<lenD;k++){
            if(Reference_Array[j].compareTo(Reference_Array[k])>0){
                j = k;
            }
        }
        permutation(Reference_Array, i, j);
        permutation(Sorted_Array, i, j);
        //here do the same for other arrays
    }

    //convert arrays back to lists
    Reference = Arrays.asList(Reference_Array);
    Sorted = Arrays.asList(Sorted_Array);
}

private void permutation(String[] array, int i, int j) {
    String tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
}
