package eduardobachiega.udacityreportcard;

import java.util.Map;

/**
 * Created by bachiega on 26/08/17.
 */

public class ReportCard {
    String schoolName;
    String studentName;
    Map<String, Integer> subjectsAndGrades; //A Map to school subjects and grades

    public ReportCard(String schoolName, String studentName,
                      Map<String, Integer> subjectsAndGrades) {
        this.schoolName = schoolName;
        this.studentName = studentName;
        this.subjectsAndGrades = subjectsAndGrades;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Map<String, Integer> getSubjectsAndGrades() {
        return subjectsAndGrades;
    }

    public void setSubjectsAndGrades(Map<String, Integer> subjectsAndGrades) {
        this.subjectsAndGrades = subjectsAndGrades;
    }

    @Override
    public String toString() {
        String formattedReportCard = String.format("School: %s%n", getSchoolName());
        formattedReportCard += String.format("Student: %s%n%nGrades%n%n", getStudentName());
        for (Map.Entry<String, Integer> subjectsAndGrades : getSubjectsAndGrades().entrySet()) {
            String subject = subjectsAndGrades.getKey();
            int grade = subjectsAndGrades.getValue();
            String gradeClassification;
            if (grade >= 90)
                gradeClassification = "A";
            else if (grade >= 80)
                gradeClassification = "B";
            else if (grade >= 70)
                gradeClassification = "C";
            else if (grade >= 60)
                gradeClassification = "D";
            else if (grade >= 50)
                gradeClassification = "E";
            else
                gradeClassification = "Failed";

            formattedReportCard += String.format("%s: %s%n", subject, gradeClassification);
        }
        return formattedReportCard;
    }
}
