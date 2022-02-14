import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int mat, phys, tur, chem, msc;
        
        int num_courses = 5;
        double avg;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Math: ");
        mat = input.nextInt();
        if (mat < 0 || 100 < mat) {
            mat = 0;
            num_courses -=1;
        }
        
        System.out.print("Physics: ");
        phys = input.nextInt();
        if (phys < 0 || 100 < phys) {
            phys = 0;
            num_courses -=1;
        }
        
        System.out.print("Turkish: ");
        tur = input.nextInt();
        if (tur < 0 || 100 < tur) {
            tur = 0;
            num_courses -=1;
        }
        
        System.out.print("Chemistry: ");
        chem = input.nextInt();
        if (chem < 0 || 100 < chem) {
            chem = 0;
            num_courses -=1;
        }
        
        System.out.print("Music: ");
        msc = input.nextInt();
        if (msc < 0 || 100 < msc) {
            msc = 0;
            num_courses -=1;
        }
        
        avg = (double)(mat + phys + tur + chem + msc)/num_courses;
        
        if (55 <= avg) {
            
            System.out.print("Passed with " + avg);
        } else {
            
            System.out.print("Failed with " + avg);
        }
        
    }
}
