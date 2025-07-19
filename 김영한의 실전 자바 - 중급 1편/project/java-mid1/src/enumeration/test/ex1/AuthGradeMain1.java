package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            System.out.println(
                    "grade = " + authGrade.name() +
                            ", level = " + authGrade.getLevel() +
                            ", 설명 = " + authGrade.getDescription()
            );
        }
    }
}
