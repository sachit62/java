// import java.io.*;
// import java.util.*;

// public class Main {
//     public static void printArr(int[] arr) {
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void print2DArr(int[][] arr) {
//         int n = arr.length;
//         int m = arr[0].length;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         PrintWriter out = new PrintWriter(System.out);

//         int t = Integer.parseInt(br.readLine());

//         while (t-- > 0) {
//             int n = Integer.parseInt(br.readLine());
//             String ip[] = br.readLine().split(" ");
//             String ip2[] = br.readLine().split(" ");
//             int a[] = new int[n];
//             int b[] = new int[n];

//             for (int i = 0; i < n; i++) {
//                 a[i] = Integer.parseInt(ip[i]);
//                 b[i] = Integer.parseInt(ip2[i]);
//             }

//             int diff = 0;
//             for (int i = 0; i < n; i++) {
//                 if (a[i] > b[i]) {
//                     diff += a[i] - b[i];
//                 }
//             }
//             System.out.println(diff + 1);
//         }

//         out.flush();
//         br.close();
//         out.close();
//     }
// }




// import java.io.*;
// import java.util.*;

// public class Main{
//     public static void printArr(int[] arr){
//         int n = arr.length;

//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void print2DArr(int[][] arr){
//         int n = arr.length;
//         int m = arr[0].length;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         PrintWriter out = new PrintWriter(System.out);

//         int t = Integer.parseInt(br.readLine());
        
//         while(t-->0){
//             int n = Integer.parseInt(br.readLine());

//             for(int i=0; i<n-1; i++){
//                 if(i%2==0){
//                     System.out.print(-1+" ");
//                 }
//                 else{
//                     System.out.print(3+" ");
//                 }
//             }

//             if(n%2==0){
//                 System.out.println(2);
//             }
//             else{
//                 System.out.println(-1);
//             }
//         }

//         out.flush();
//         br.close();
//         out.close();
//     }
// }




// import java.io.*;
// import java.util.*;

// public class Main{
//     public static void printArr(int[] arr){
//         int n = arr.length;

//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void print2DArr(int[][] arr){
//         int n = arr.length;
//         int m = arr[0].length;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         PrintWriter out = new PrintWriter(System.out);

//         int t = Integer.parseInt(br.readLine());
        
//         while(t-->0){
//             String ip[] = br.readLine().split(" ");
//             String ip2[] = br.readLine().split(" ");
//             String ip3[] = br.readLine().split(" ");

//             int n = Integer.parseInt(ip[0]);
//             int k = Integer.parseInt(ip[1]);

//             Map<Integer, Integer> A = new HashMap<>();
//             Map<Integer, Integer> B = new HashMap<>();
            
//             for(int i=0; i<n; i++){
//                 int a = Integer.parseInt(ip2[i]);
//                 int b = Integer.parseInt(ip3[i]);

//                 int temp = a%k;
//                 int temp2 = k-temp;
//                 int res;
//                 if(temp2==0){
//                     res = 0;
//                 }
//                 else{
//                     res = Math.min(temp, temp2);
//                 }
//                 A.put(res, A.getOrDefault(res,0)+1);

//                 temp = b%k;
//                 temp2 = k-temp;
//                 if(temp2==0){
//                     res = 0;
//                 }
//                 else{
//                     res = Math.min(temp, temp2);
//                 }
//                 B.put(res, B.getOrDefault(res,0)+1);
//             }

//             if(A.equals(B)){
//                 System.out.println("Yes");
//             }
//             else{
//                 System.out.println("No");
//             }
//         }

//         out.flush();
//         br.close();
//         out.close();
//     }
// }