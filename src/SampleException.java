public class SampleException {
        public static void main(String[] args) {
            try{
                int a=45,b=0;
                int c=a/b;
                System.out.println("result "+c);
            }
            catch (ArithmeticException e){
                System.out.println("Number cannot be divided by zero");

            }
            try {
                int num=Integer.parseInt("Ihsan");
                System.out.println(num);
            }
            catch (NumberFormatException e){
                System.out.println("Number format exception");
            }
            try{
                int a[]=new int[5];
                a[9]=9;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array index out of bounds");
            }
        }
}
