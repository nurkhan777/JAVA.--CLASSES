/* Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(),
    getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов.
    Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем
    информацией, должно быть объявлено несколько конструкторов.
        1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет,
            Курс, Группа.
        Создать массив объектов. Вывести:
        a) список студентов заданного факультета;
        b) списки студентов для каждого факультета и курса;
        c) список студентов, родившихся после заданного года;
        d) список учебной группы. */

public class Student {
    int id;
    String lastname;
    String name;
    String patronymic;
    int day;
    int month;
    int year;
    String address;
    int phone;
    String faculty;
    int course;
    String group;

    public Student(int id, String lastname, String name, String patronymic, int day, int month, int year, String address, int phone, String faculty, int course, String group) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
        this.patronymic = patronymic;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public static void main(String[] args) {
        Student[] student = new Student[5];

        student[0]=new Student(1,"One","Perviy","Pervovich",18,6,1992,"Astana",778863,"VT",3,"PVT01");
        student[1]=new Student(2,"Two","Vtoroy","Vtoroevich",28,12,1991,"Astana",778232,"VT",4,"PVT02");
        student[2]=new Student(3,"Three","Tretiy","Tretievich",15,3,1993,"Astana",778045,"IT",1,"PVT03");
        student[3]=new Student(4,"Four","Chetvertiy","Chetvertievich",7,7,1990,"Karagandy",775667,"IT",4,"PVT02");
        student[4]=new Student(5,"Five","Piyatiy","Piyatievich",5,5,1990,"Karagandy",708021,"IT",3,"PVT01");

        for (int a = 0; a < student.length; a++){
            if (student[a].year > 1990){
                System.out.println(student[a]);
            }

        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
