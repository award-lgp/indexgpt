public class multiplication {
    public static void main(String[] args) {
        System.out.println("Hello , This is lgp!");
        System.out.println("Here is 九九乘法表");
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
