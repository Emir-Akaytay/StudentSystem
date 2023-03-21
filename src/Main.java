public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Emir","TR","555");
        Teacher t2 = new Teacher("Arda","MAT","554");
        Teacher t3 = new Teacher("Akın","FİZ","553");

        Course c1 = new Course("Türkçe","101","TR");
        Course c2 = new Course("Matematik","101","MAT");
        Course c3 = new Course("Fizik","101","FİZ");

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("Bora","123","4",c1,c2,c3);
        s1.addBulkExamNote(70,70,70);
        s1.addVerbelNote(80,80,80);
        s1.calcAvarage();
        s1.printNotesAndInfo();

        Student s2 = new Student("Kaan","124","4",c1,c2,c3);
        s2.addBulkExamNote(75,95,90);
        s2.addVerbelNote(85,100,100);
        s2.calcAvarage();
        s2.printNotesAndInfo();

        Student s3 = new Student("Erdal","125","4",c1,c2,c3);
        s3.addBulkExamNote(10,35,45);
        s3.addVerbelNote(40,50,50);
        s3.calcAvarage();
        s3.printNotesAndInfo();



    }
}
