public class fibonacci {
    public static void main (string[] args){
        int n = 9;

        int[] finonacci = new int[n];

        fibonacci[0]= 0;
        fibonacci[1]= 1;


        for (int i=2; i<n; i++){
        fibonacci[i]= fibonacci[i-1] + fibonacci[i-2]
        System.out.println(fibonacci[i] + " ");
    }

    //print fibonacci in reverse order
        System.out.println("Reverse order:");
        for(int i=n-1; i>=0; i--){
        System.out.print(finonacci[i]+ "");
}
    }

}