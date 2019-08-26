package staticProxy;

public class DaoProxy implements Dao {

    private DaoImp daoImp;

    public DaoProxy(DaoImp daoImp) {
        this.daoImp = daoImp;
    }

    @Override
    public void save(Integer id) {
        doStart();
        daoImp.save(id);
        doEnd();
    }

    public void doStart(){
        System.out.println("开始打印日志...");
    }

    public void doEnd(){
        System.out.println("结束打印日志...");
    }
}
