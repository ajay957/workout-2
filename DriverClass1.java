import java.util.*;
class Faculty{
    int facultyid;
    float salary;
}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowence;

    FullTimeFaculty(float basic,float allowence){
        this.basic=basic;
        this.allowence=allowence;
    }

    float salaryFull(){
        float salary1;
        salary1=(basic+allowence);
        return salary1;
    }

    void dispalyFull(){
        System.out.println(""+salaryFull());
    }
}
class PartTimeFaculty extends Faculty{
    int hour;
    float rate;
    PartTimeFaculty(int hour,float rate){
        this.hour=hour;
        this.rate=rate;
    }

    float salaryPart(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void displayPart(){
        System.out.println(""+salaryPart());
    }
}

public class DriverClass1{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basics and allowence:");
        FullTimeFaculty S1 = new FullTimeFaculty(sc.nextFloat(),sc.nextFloat());
        S1.dispalyFull();
        System.out.println("Enter hour and rate:");
        PartTimeFaculty S2 = new PartTimeFaculty(sc.nextInt(),sc.nextFloat());
        S2.displayPart();

    }
}
