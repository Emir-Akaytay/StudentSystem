public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int examNote1, int examNote2, int examNote3) {
        if (0 <= c1.examNote && c1.examNote <= 100) {
            c1.examNote = examNote1;
        }
        if (0 <= c2.examNote && c2.examNote <= 100) {
            c2.examNote = examNote2;
        }
        if (0 <= c3.examNote && c1.examNote <= 100) {
            c3.examNote = examNote3;
        } else {
            System.out.println("Hatalı Not Girişi ! Lütfen Bilgileri Gözden Geçirin.");
        }
    }

    void addVerbelNote(int verbelNote1, int verbelNote2, int verbelNote3) {
        if (0 <= c1.verbelNote && c1.verbelNote <= 100) {
            c1.verbelNote = verbelNote1;
        }
        if (0 <= c2.verbelNote && c2.verbelNote <= 100) {
            c2.verbelNote = verbelNote2;
        }
        if (0 <= c3.verbelNote && c1.verbelNote <= 100) {
            c3.verbelNote = verbelNote3;
        } else {
            System.out.println("Hatalı Not Girişi ! Lütfen Bilgileri Gözden Geçirin.");
        }
    }

    void calcAvarage() {
            double op1 = (c1.verbelNote * 0.20) + (c1.examNote * 0.80);
            double op2 = (c2.verbelNote * 0.20) + (c2.examNote * 0.80);
            double op3 = (c3.verbelNote * 0.20) + (c3.examNote * 0.80);
            this.avarage = (op1 + op2 + op3) / 3;
            isPass();
    }
    void isPass() {
        this.isPass = this.avarage >= 55;
    }

    void printNotesAndInfo() {
        System.out.println("==========");
        System.out.println("Öğrencinin İsmi : "+this.name);
        System.out.println("Öğrencinin Numarası : "+this.stuNo);
        System.out.println("Öğrencinin Sınıfı : "+this.classes);
        System.out.println("\nDersler : " +
                "\n\tTürkçe => Sınav:"+c1.examNote+"||Sözlü:"+c1.verbelNote+
                "\n\tMatematik => Sınav:"+c2.examNote+"||Sözlü:"+c2.verbelNote+
                "\n\tFizik => Sınav:"+c3.examNote+"||Sözlü:"+c3.verbelNote+"");
        System.out.println("\tOrtalama : "+this.avarage);
        if(isPass) {
            System.out.println("\nSınıf Geçme Durumu : Geçti");
        } else {
            System.out.println("\nSınıf Geçme Durumu : Geçemedi");
        }
        System.out.println("==========");
    }
}

