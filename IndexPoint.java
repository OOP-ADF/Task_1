public class IndexPoint {
    public static void main(String[] args) {
        
        System.out.println("MASUKKAN NILAI");
        Scanner nil = new Scanner(System.in);
        System.out.print("Nilai UTS: ");
        int nilUTS = nil.nextInt();
        System.out.print("Nilai UAS: ");
        int nilUAS = nil.nextInt();
        System.out.print("Nilai Kuis: ");
        int nilKuis = nil.nextInt();
        
        double nilakhir = ((nilUTS*0.35) + (nilUAS*0.4)+(nilKuis*0.25));
       
        
        if (nilakhir >= 85 && nilakhir <= 100) {
            System.out.println("Nilai akhir = " + nilakhir);
            System.out.println("Grade : Excellent");
        }
        else if (nilakhir >= 75 && nilakhir <= 85) {
            System.out.println("Nilai akhir = " + nilakhir);
            System.out.println("grade : Very Good");
        }
        else if (nilakhir >=65 && nilakhir <=74 ) {
            System.out.println("Nilai akhir = " + nilakhir);
            System.out.println("Grade : Good");
        }
        else if (nilakhir >=50 && nilakhir <= 64) {
            System.out.println("Nilai akhir = " + nilakhir);
            System.out.println("Grade: Accepted");
        }
        else if (nilakhir >= 49 && nilakhir <=0) {
            System.out.println("Nilai akhir = " + nilakhir);
            System.out.println("Grade : Failed");
        }
    }
}

