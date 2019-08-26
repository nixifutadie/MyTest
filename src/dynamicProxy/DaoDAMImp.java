package dynamicProxy;

public class DaoDAMImp implements DaoDAM {
    @Override
    public void delete(String name){
    /**
     * 方法内可以调用其他对象方法，从而可以再代理类中做基于其他对象的操作而不改变其代码
     */
        System.out.println("已经删除了名字为"+name+"的用户");
    }
}
