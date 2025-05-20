package ch15.lecture.p03map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // map: entry(key, value) 저장
        // 중복된 key 저장되지 않음, 순서 없음
        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("아침", "베이글");
        map.put("점심", "제육");
        map.put("저녁", "돈까스");
        map.put("저녁", "베이글");
        System.out.println(map);

        // entry 개수 반환
        int size = map.size();
        System.out.println("size = " + size);
        boolean empty = map.isEmpty();
        System.out.println("empty = " + empty);

        // key 존재 여부 확인
        boolean r1 = map.containsKey("아침");
        System.out.println("r1 = " + r1);
        boolean r2 = map.containsKey("간식");
        System.out.println("r2 = " + r2);

        // key를 통해 value 반환
        String v1 = map.get("아침");
        System.out.println("v1 = " + v1);
        String v2 = map.get("점심");
        System.out.println("v2 = " + v2);
        String v3 = map.get("간식");
        System.out.println("v3 = " + v3);   // null

        // key 집합(set) 얻기
        Set<String> keySet = map.keySet();
        System.out.println("keySet = " + keySet);

        // entry 삭제
        String v4 = map.remove("저녁");
        System.out.println(map);
        System.out.println("v4 = " + v4);
        String v5 = map.remove("간식");
        System.out.println("v5 = " + v5);   // null

        // values 반환
        map.put("저녁", "베이글");
        Collection<String> values = map.values();       //  List 형식
        System.out.println("values: " + values);
    }
}
