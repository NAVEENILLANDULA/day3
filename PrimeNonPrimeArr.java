import java.util.Arrays;
public class PrimeNonPrimeArr {

    public static boolean  isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={11,12,13,14,15,16,17,19};

        int primeCount=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(isPrime(n)){
                primeCount++;
            }
            
        }

        // System.out.println(primeCount);

        int prime[]=new int[primeCount];
        int[] nonPrime=new int[arr.length-primeCount];

        int p=0;
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                prime[p++]=arr[i];
            }
            else{
                nonPrime[n++]=arr[i];
            }
        }

        System.out.println(Arrays.toString(prime));
        System.out.println(Arrays.toString(nonPrime));
    }
    
}
