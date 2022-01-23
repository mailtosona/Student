package model;

public class student implements studentinterface{
    private final String studentName;
    private int id;


  // private String studentName;
    private Grade grade;
    private Group group;
    private String secretNickName;


    //constructor
    public student(String studentName,Grade grade,Group group,String nickName) {
        this.studentName = studentName;
        this.grade = grade;
        this.group = group;
        this.secretNickName = nickName;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setStudentname(String studentName) {
        studentName = studentName;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setSecretNickName(String secretNickName) {
        this.secretNickName = secretNickName;
    }
    public String getStudentname() {
        return studentName;
    }

    public Grade getGrade() {
        return grade;
    }

    public Group getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }


    @Override
    public String getName(student student) {
        return student.getStudentname();
    }

    @Override
    public char upgrade(student student) {
        char grade = student.getGrade().getGrade();
        return (char) (grade-1);
    }

    @Override
    public char downGrade(student student) {
        char grade = student.getGrade().getGrade();
        return (char) (grade+1);
    }

    @Override
    public int updateGroup(student student) {
        int group = student.getGroup().getGroup();
        return (char) (group+1);
    }

}
