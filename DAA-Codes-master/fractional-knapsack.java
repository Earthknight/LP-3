/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.Comparator;

class Main{
    
    static class ItemValue{
        int value,weight;
        public ItemValue(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }
    
    private static double getMaxValue(ItemValue[] arr, int capacity){
        Arrays.sort(arr , new Comparator<ItemValue>(){
            public int compare(ItemValue item1 , ItemValue item2){
                double crp1 = new Double((double) item1.value / (double) item1.weight);
                double crp2 = new Double((double) item2.value / (double) item2.weight);
                if(crp1 < crp2){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
                    double totalValue = 0d;
            for(ItemValue i : arr){
                int currVal = (int) i.value;
                int currWt = (int) i.weight;
                if(capacity - currWt >= 0){
                    capacity = capacity - currWt;
                    totalValue += currVal;
                }else{
                    double fraction = ((double)capacity / (double)currWt);
                    capacity = (int) (capacity - (fraction * currWt));
                    totalValue += (fraction * currVal);
                    break;
                }
            }
            return totalValue;
    }
    
    public static void main(String args[]){
        ItemValue[] arr = {new ItemValue(60,10), new ItemValue(100,20), new ItemValue(120,30)};
        int capacity = 50;
        double maxvalue = getMaxValue(arr,capacity);
        System.out.println(maxvalue);
    }
}