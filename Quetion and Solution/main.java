public class main {

    public static void main(String[] args) {
        
        int num = 232324;
        int n = 2;
        int count = 0; 
        while (num > 0){
            int rem = num% 10;
            if(rem == n){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}

