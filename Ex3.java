public class Ex3 {
   public static void main(String[] args){
   int a, b, c, d, e, f;
   a = 100;
   b = a + 200;
   c = a*b;
   d = (c+b)/a;
   e = d%10;
   f = ((a+c)*(d-e))*2;
  f /= 1000;
  a += f;
System.out.println("a="+ a+"\nb="+b+"\n c="+c+"\n d="+d+"\n e="+e+"\n f="+f); }
}