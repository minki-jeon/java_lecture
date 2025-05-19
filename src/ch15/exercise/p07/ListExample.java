package ch15.exercise.p07;

import java.util.List;

public class ListExample {
    //* Reference : [Book. 이것이 자바다] p.690
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
