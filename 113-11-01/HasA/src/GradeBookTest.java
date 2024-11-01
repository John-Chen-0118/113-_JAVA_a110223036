public class GradeBookTest {
    public static void main(String[] args){
        Student[] students = new Student[3];
        final int NUMBER_OF_STUDENTS = 3;
        students[0] = new Student( "A112221009" , "吳奇隆");
        students[1] = new Student( "A112221010" , "陳宏明");
        students[2] = new Student( "A112221011" , "林志玲");
        GradeBook gradeBook = new GradeBook("Java程式設計",students, NUMBER_OF_STUDENTS);
        gradeBook.processStudents();
        gradeBook.displayGradeReport();
    }
}
