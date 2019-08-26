package staticProxy;

public class DaoImp implements Dao {
    @Override
    public void save(Integer id) {
        System.out.println("已经存储了Id为"+id+"的用户");
    }
}
