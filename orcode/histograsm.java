import java.util.*;
public class histograsm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }

        arr[n] = 0;
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i=0; i<=n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int h = arr[st.pop()]; // heigth

                int r = i;
                int l = st.isEmpty() ? -1 : st.peek();

                int w = r - l - 1;

                max = Math.max(max, h *w);
            }
            st.push(i);
        }
        System.out.println(max);
    }
}


