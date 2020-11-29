import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t-->0){
            int N = sc.nextInt();sc.nextLine();
            long[] arr = new long[N];
            for(int i=0;i<N;i++)arr[i] = sc.nextLong();
            Stack<Integer> st = new Stack<>();
            int[] left = new int[N];
            Arrays.fill(left,-1);
            int[] right = new int[N];
            Arrays.fill(right,N);
            Stack<Integer> st1 = new Stack<>();

            for(int i=0;i<N;i++)
            {
                while(!st.isEmpty() && arr[st.peek()]>=arr[i])st.pop();
                if(!st.isEmpty())
                    left[i] = st.peek();
                st.push(i);
            }
            for(int i=N-1;i>=0;i--)
            {
                while(!st1.isEmpty() && arr[st1.peek()]>=arr[i])st1.pop();
                if(!st1.isEmpty())
                    right[i] = st1.peek();
                st1.push(i);
            }
            long max = -1000000;

            for(int i=0;i<N;i++)
            {
                long wid = right[i]-left[i]-1;

                max = Math.max(max,wid*arr[i]);
            }
            System.out.println(max);

        }

    }
}