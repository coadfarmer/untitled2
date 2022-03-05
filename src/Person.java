/**
 * @Author: xjjiang
 * @Data: 2022/3/4 15:30
 * @Description:
 */

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author shuang.kou
 * @createTime 2020年06月15日 17:02:00
 */
public class Person {
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }


    public static void main(String[] args) {
        TreeMap<Person, String> treeMap = new TreeMap<>((person1, person2) -> person1.age - person2.getAge());
        treeMap.put(new Person(3), "person1");
        treeMap.put(new Person(18), "person2");
        treeMap.put(new Person(35), "person3");
        treeMap.put(new Person(16), "person4");
        treeMap.forEach((key, value) -> System.out.println(value));
    }
}

