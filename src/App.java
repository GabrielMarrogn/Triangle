import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String entrada = br.readLine();
        String[] arr = entrada.split(" ");
        int[] nums = new int[4];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        
        bubbleSort(nums);

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int d = nums[3];

        if(d+c > a && d+a > c && a+c > d){
            System.out.println("S");
        }else if(d+c > b && b+c > d && d+b > c){
            System.out.println("S");
        }else if(a+b > c && b+c > a && a+c > b){
            System.out.println("S");
        }else if(a+b > d && b+d > a && a+d > b){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
            

    }

    public static int[] bubbleSort(int[] nums){
        for (int i = nums.length -1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (nums[k] > nums[k + 1]) {
                    int temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;

                }
            }
        }
        return nums;
    }
}
