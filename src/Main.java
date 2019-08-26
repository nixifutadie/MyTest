import dynamicProxy.DaoDAM;
import dynamicProxy.DaoDAMImp;
import dynamicProxy.DaoDAMProxy;
import staticProxy.Dao;
import staticProxy.DaoImp;
import staticProxy.DaoProxy;

public class Main {

    public static void main(String[] args) {
        /**
         * 静态代理只能服务于一个接口，若要服务多个接口代理类则需要实现多个接口方法，耦合高而且每次改动则都需要改动
         * 动态代理则不要，因为只有在运行时才知道调用的是哪个接口那个方法，说白了静态是写死的，动态是活的
         * 静态代理事先知道要代理的是什么，而动态代理不知道要代理什么东西，只有在运行时才知道。
         */

        /*DaoImp daoImp = new DaoImp();

        DaoProxy daoProxy = new DaoProxy(daoImp);

        daoProxy.save(111);
*/

        DaoDAMImp daoDAMImp = new DaoDAMImp();
        DaoDAMProxy daoDAMProxy = new DaoDAMProxy();
        daoDAMProxy.setTarge(daoDAMImp);
        DaoDAM instance = (DaoDAM) daoDAMProxy.newProxyInstance();
        instance.delete("YY");
    }
}
