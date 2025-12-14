public class a6_complex{
    private static class Complex {
        int real;
        int img;
        
        Complex(int a, int b) {
            real = a;
            img = b;
        }

        public Complex add(Complex B){
            return new Complex(this.real + B.real, this.img+B.img);
        }

        public void display(){
            System.out.println(this.real + " + " + this.img + "i");
        }
    }
    
    public static void main(String[] args){
        System.out.println("Hello World");

        Complex A = new Complex(1,2);
        Complex B = new Complex(3,4);

        Complex C = A.add(B);

        C.display();
    }
}