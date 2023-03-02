public class labeledforloop {
    public static void main(String[]args){
        i:
        for(int a=0;a<=10;a++){
            j:
            for(int b=0;b<=1;b++){
                h:
                for(int c=0;c<=10;c++){
                    System.out.println(c);
                    if(c==7){
                    break i;
                    }
                }
            }
        }
    }
}
