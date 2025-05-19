package ch15.exercise.p07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    //* Reference : [Book. 이것이 자바다] p.690
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));

        return list;
    }
}
