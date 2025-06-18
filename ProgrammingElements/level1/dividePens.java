public class dividePens {
        public static void dividePensFunction(int totalPens, int students) {
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
    public static void main(String[] args) {
        int totalPens = 100;
        int students = 6;
        dividePensFunction(totalPens, students);
    }
}
