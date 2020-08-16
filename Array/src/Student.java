/**
 * @Author: 孔维一
 * @Data: 2020/8/15 5:53
 * @Version: 1.0.0
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice", 94));
        arr.addLast(new Student("Bob", 96));
        arr.addLast(new Student("Jane", 91));
        System.out.println(arr);
    }
}
