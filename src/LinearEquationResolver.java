import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh a*x+b=c");
        float a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so a= ");
        a=scanner.nextFloat();
        System.out.println("Nhap so b= ");
        b=scanner.nextFloat();
        System.out.print("Nhap so c= ");
        c=scanner.nextFloat();
        if(a!=0)
        {
            float answer=(c-b)/a;
            System.out.println("Ket qua bang = "+answer);
        }
        else
            {
                if(b==0)
                {
                        System.out.println("Phuong trinh vo so nghiem");
                }
                else
                    {
                        System.out.println("Phuong trinh vo nghiem");
                    }
            }
    }
}
