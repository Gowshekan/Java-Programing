public class Student implements Comparable<Student> {
    Integer id;
    String name;
    Integer mark1;
    Integer mark2;
    Integer mark3;
    Integer total;

    public Student(Integer id, String name, Integer mark1, Integer mark2, Integer mark3) {
        this.id = id;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.total = mark1 + mark2 + mark3;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMark1() {
        return mark1;
    }

    public Integer getMark2() {
        return mark2;
    }

    public Integer getMark3() {
        return mark3;
    }

    public Integer getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Student s) {
        return this.total.compareTo(s.total);
    }
}