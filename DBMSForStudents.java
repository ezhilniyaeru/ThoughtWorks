import java.util.ArrayList;

public record DBMSForStudents(int admissionNumber, String name, String grade) {

    static ArrayList<DBMSForStudents> students = new ArrayList<>();

    public static void insert(DBMSForStudents obj1) {
        students.add(new DBMSForStudents(obj1.admissionNumber, obj1.name, obj1.grade));
    }

    public static void removes(DBMSForStudents obj1) {
        students.removeIf(student -> student.admissionNumber == obj1.admissionNumber && student.name.equals(obj1.name) && student.grade.equals(obj1.grade));

    }

    public static void update(int index, DBMSForStudents obj1) {
        students.set(index, new DBMSForStudents(obj1.admissionNumber, obj1.name, obj1.grade));
    }

    public static void main(String[] args) {
        DBMSForStudents.insert(new DBMSForStudents(1, "aju", "five"));
        DBMSForStudents.insert(new DBMSForStudents(1, "aju", "five"));
        DBMSForStudents.insert(new DBMSForStudents(2, "motu", "five"));
        DBMSForStudents.insert(new DBMSForStudents(3, "mot", "five"));
        DBMSForStudents.removes(new DBMSForStudents(1, "aju", "five"));
        DBMSForStudents.update(0, new DBMSForStudents(3, "jai", "five"));
        DBMSForStudents.update(1, new DBMSForStudents(4, "jaibeen", "five"));
        
        for (DBMSForStudents student : students) {
            System.out.println("AdmissionNumber " + student.admissionNumber + " Name " + student.name + " Class " + student.grade);
        }
    }
}
