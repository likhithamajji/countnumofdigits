class countnumofdigits{
    public static void main(String[] args) {
        int n=243;
        countnumofdigits(n);
    }
    public static void countnumofdigits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}