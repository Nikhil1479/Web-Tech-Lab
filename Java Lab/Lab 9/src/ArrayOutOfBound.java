public class ArrayOutOfBound {
    public static void main(String[] args) {

        int[] a =new int[5];

        try{
            int x=a[10];

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
