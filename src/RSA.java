import java.util.*;
import java.math.*;
public class RSA
{

static BigInteger p,q,n,phi,e,d;
static int bitlength=256;
static Random R = new Random();
static Scanner S = new Scanner(System.in); public static void main(String args[])
{
System.out.println("random no. = "+R);
p=BigInteger.probablePrime(bitlength, R);
System.out.println("p = "+p);
q=BigInteger.probablePrime(bitlength, R);
System.out.println("q= "+q);
n=p.multiply(q);
System.out.println("n = "+n);
phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
System.out.println("phi = "+p.subtract(BigInteger.ONE));
e=BigInteger.probablePrime(bitlength/2, R);
while(phi.gcd(e).compareTo(BigInteger.ONE)!=0 && e.compareTo(phi)<0)
e.add(BigInteger.ONE);
d=e.modInverse(phi);
String msg;
System.out.print("Enter The Message : ");
msg=S.nextLine();
byte[] msg_arr = msg.getBytes();
System.out.println("Message In Bytes : " + Arrays.toString(msg_arr));
byte[] en = encrypt(msg_arr);
System.out.println("Encrypted Byte String : " + Arrays.toString(en));
byte[] de = decrypt(en);
System.out.println("Decrypted Byte String : " + Arrays.toString(de));
System.out.println("Received Message : " + new String(de));
}
public static byte[] encrypt(byte[] a)
{
return (new BigInteger(a)).modPow(e, n).toByteArray();
}
public static byte[] decrypt(byte[] en)
{
return (new BigInteger(en)).modPow(d, n).toByteArray();
}
}