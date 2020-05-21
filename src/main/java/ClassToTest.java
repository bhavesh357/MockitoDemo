public class ClassToTest {
    private final MyDataBase myDataBase;

    public ClassToTest(MyDataBase myDataBase) {
        this.myDataBase = myDataBase;
    }

    public boolean query(String id) {
        return myDataBase.query(id);
    }
}
