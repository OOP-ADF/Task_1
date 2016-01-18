
/*
 I Nyoman Tri Budhi Palantra
 1301140089
 IF 38 09
 */
 
public class IndexPoint {
    public static void main(String[] args) {
        int uts;
        int uas;
        int quiz;
        float total;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input UTS Score : ");
        uts=input.nextInt();
        
        System.out.print("Input UAS Score : ");
        uas=input.nextInt();
        
        System.out.print("Input Qiuz Score : ");
        quiz=input.nextInt();
        System.out.println("=========================")
        total = (0.35*uts) + (0.4*uas) + (0.25*quiz);
        
        if (total>84 && total<=100)
        {
             System.out.println("Excellent");
        }
        else if(total>74 && total<=84)
        {
            System.out.println("Very Good");
        }
        else if(total>64 && total<=74)
        {
            System.out.println("Good");
        }
        else if(total>49 && total<=64)
        {
            System.out.println("Accepted");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
