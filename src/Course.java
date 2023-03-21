public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int verbelNote;

    Course(String name,String code,String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.verbelNote = 0;
    }
    
    void addTeacher(Teacher t) {
        if(t.branch.equals(this.prefix)) this.courseTeacher = t;
        else System.out.println("Hatalı Atama ! Sayın " + t.name + " Bu Derse Atanamaz.");
    }

    void printTeacher(Teacher t) {
        if (t.branch.equals(this.prefix)) {
        System.out.println("Akademisyenin İsmi : "+t.name);
        System.out.println("Akademisyenin Dersi : "+this.name);
        System.out.println("Akademisyenin Numarası : "+t.mnpo);
        } else {
            System.out.println("Hatalı Giriş ! Lütfen Bilgileri Gözden Geçirin. ");
        }
    }
}
