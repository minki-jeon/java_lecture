package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    //* Reference : [Book. 이것이 자바다] p.687
    public static void main(String[] args) {
        // List 불변 컬렉션 생성
        List<String> immutableList1 = List.of("A", "B", "C");
//        immutableList1.add("D");      // 불가

        // Set 불변 컬렉션 생성
        Set<String> immutableSet1 = Set.of("A", "B", "C");
//        immutableSet1.remove("A");       // 불가

        // Map 불변 컬렉션 생성
        Map<Integer, String> immutableMap1 = Map.of(
                1, "A",
                2, "B",
                3, "C"
        );
//        immutableMap1.put(4, "D");      // 불가


        // copyOf : unmodifiable collection
        // Collections.unmodifiableList
        // Collections.unmodifiableSet
        // Collections.unmodifiableMap

        // Arrays.asList : 배열을 List로 생성하는 메소드
        String[] arr1 = {"a", "b", "c"};
        List<String> list2 = Arrays.asList(arr1);
        System.out.println(list2);
//        list2.add("d");
        list2.set(1, "d");
        System.out.println(list2);


        // List 컬렉션을 불변 컬렉션으로 복사
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        // Set 컬렉션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        // Map 컬렉션을 불변 컬렉션으로 복사
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        // 배열로부터 List 불변 컬렉션 생성
        String[] arr = {"A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);

    }
}
