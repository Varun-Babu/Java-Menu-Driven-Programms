public class Main {
    public static int largeOrNot(int i,int j, int k){
        int a = Math.max(i,j);
        int b = Math.max(a,k);
        return b;
   }
    public static int smallOrNot(int i,int j, int k){
        int a = Math.min(i,j);
        int b = Math.min(a,k);
        return b;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");



    }
}