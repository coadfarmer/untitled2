import java.util.HashMap;

/**
 * @Author: xjjiang
 * @Data: 2022/2/25 15:30
 * @Description:
 */
public class Demo1 {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","2");
        System.out.println(map);
        String s = "aaa";
        String s1 = "aaa";
        System.out.println(s == s1);
        try {
            throw new NullPointerException();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("111");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
