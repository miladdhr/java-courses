public class GradeToScore {

    public static void main(String[] args) {
        // تعریف آرایه‌ای از گریدها
        char[] grades = {'A', 'B', 'C', 'A', 'D', 'B', 'F', 'C', 'A', 'B'};
        
        // ایجاد یک آرایه‌ی جدید برای نمرات
        int[] scores = new int[grades.length];
        
        // تبدیل گریدها به نمرات
        for (int i = 0; i < grades.length; i++) {
            scores[i] = convertGradeToScore(grades[i]);
        }
        
        // نمایش گریدها و نمرات
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade: " + grades[i] + ", Score: " + scores[i]);
        }
        
        // پیدا کردن نمره‌ی ماکزیمم
        int maxScore = findMaxScore(scores);
        System.out.println("The maximum score is: " + maxScore);
    }
    
    // متدی برای تبدیل گرید به نمره
    public static int convertGradeToScore(char grade) {
        switch (grade) {
            case 'A':
                return 90;
            case 'B':
                return 80;
            case 'C':
                return 70;
            case 'D':
                return 60;
            case 'F':
                return 50;
            default:
                return 0; // در صورت وجود گرید نامعتبر
        }
    }
    
    // متدی برای یافتن نمره‌ی ماکزیمم در آرایه‌ی نمرات
    public static int findMaxScore(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
}
