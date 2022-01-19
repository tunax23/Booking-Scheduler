//generate Students ID
//defines each student

public class Student {
    private ClassCode ID;  //7 characters, first 4 index = classCode, last 3 index = number
    private static int Number=0;
    //overloads above method, for existing student ID


    public ClassCode getID() {
        return ID;
    }

    public void setID(ClassCode ID) {
        this.ID = ID;
    }

    public Student(char level, int grade, int index) {
        //super();
        Number++;
        this.ID = new ClassCode(level, grade, index, Number);

    }

    public Student(char level, int grade, int index, int number) {
        //super();
        this.ID = new ClassCode(level, grade, index, number);
    }

    public char getStudentLevel() {
        return this.getID().getLevel();
    }

    public int getStudentIndex()
    {
        return this.getID().getIndex();
    }

    public int getStudentGrade() {
        return this.getID().getGrade();
    }



}
