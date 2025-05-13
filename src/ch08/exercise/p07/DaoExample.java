package ch08.exercise.p07;

public class DaoExample {
    //* Reference : [Book. 이것이 자바다] p.392
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}
