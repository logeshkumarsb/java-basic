public class recursion {
   public static int sumOf(int n){
       if(n==0){
           return 0;
       }
       int i=sumOf(n/10);
       int j=n%10;
       return j+i;
   } 
   public static long numOf(long n){
    if(n==0){
        return 0;
    }
    long i=numOf(n/10);
    return 1+i;
   } 
   public static int numOfz(int n){
       if(n==0){
           return -1;
       }
       int i=numOfz(n/10);
       int j=0;
       if(n%10==0){
           j=1;
       }
       return j+i;
   }
   public static int numOfz1(int n){
    if(n==0){
        return 1;
    } 
    int count=0;
     while(n!=0){
         int s=n%10;
         if(s==0){
             count++;
         }
         n=n/10;
     }
      return count;
}
public static boolean isPrime(int n,int i){     //recursion
    if(n<=2){
        return n==2?true:false;
    }
    if(n%i==0){
        return false;
    }
    if(i*i>n){
        return true;
    }
    return isPrime(n,i+1);
}
public static boolean isPrime2(int n){         //dp 
    boolean[] prime=new boolean[n+1];
    for(int i=2;i*i<=n;i++){
      for(int j=i*2;j<=n;j=j+i){
          prime[j]=true;
      }
    }
  return !prime[n];
}
public static double sqrt(int n){
    double root=0;
    int s=0;
    int e=n;
    while(s<n){
        int m=s+(e-s)/2;
        if(m*m==n){
            root=m;
            return root;
        }
        if(m*m>n){
            e=m-1;
        }
        else{
            s=m+1;
        }
    }
    double prec=0.5;
    for(int i=0;i<3;i++){
        while(root*root<=n){
           root=root+prec;
        }
       root=root-prec;
       prec=prec/10;
    }
    return root;
}
public static void range(int s,int e){
    int isPrime=0;                            //0  ->Prime   
    for(int i=s;i<=e;i++){                    //-1 ->non-prime
    for(int j=2;j*j<=i;j++){
         if(i%j==0){
            isPrime=-1;
            break;
          }
          else{
              isPrime=0;
          }
       }
      if(isPrime!=-1){
          System.out.print(i+" ");
      }
    }
}
   public static void main(String[] args) {
    System.out.printf("%.1f",sqrt(4));
       System.out.println(sumOf(455523));
       System.out.println(numOf(2233111));
       System.out.println(numOfz1(2030000000));
       System.out.println(isPrime(19999,2));
    //    range(2,2000);
    //    System.out.printf("%.3f",sqrt(4));
    //    System.out.println(isPrime2(19999));
   }
}
