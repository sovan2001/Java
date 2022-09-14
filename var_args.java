public class var_args
{
    public static int sum(int ...arr)
    {
        //Available as int [] arr
        int sum = 0;
        for(int i:arr)  //Read as for i in arr
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Var args");
        System.out.println("The sum of 4 and 5 is " + sum(4,5));
        System.out.println("The sum of 4, 5 and 6 is " + sum(4,5,6));
        System.out.println("The sum of 4,5,6, and 7 is " + sum(4,5,6,7));
        System.out.println("The sum of Nothing is " + sum());
    }
    
}