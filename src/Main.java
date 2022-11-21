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
    public static void primeOrNot(int j){
        int flag =0;
        for(int i =1; i<=j; i++){
            if(j%i == 0){
                flag ++;
            }
        }
        if(flag==2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
    public static void evenOrNot(int i){
        if(i%2==0){
            System.out.println("Even no");
        }
        else{
            System.out.println("Not even");
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

           }
}