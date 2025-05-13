package ch08.exercise.p07;

public class MySqlDao implements DataAccessObject {
    //* Reference : [Book. 이것이 자바다] p.392

    private String db = "MySql DB";

    @Override
    public void select() {
        System.out.println(db + "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(db + "에 삽입");
    }

    @Override
    public void update() {
        System.out.println(db + "를 수정");
    }

    @Override
    public void delete() {
        System.out.println(db + "에서 삭제");
    }
}
