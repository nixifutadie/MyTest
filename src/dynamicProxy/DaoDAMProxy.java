package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaoDAMProxy implements InvocationHandler {

    private  Object targe;

    //绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
    public  Object newProxyInstance(){
        return Proxy.newProxyInstance(targe.getClass().getClassLoader(),targe.getClass().getInterfaces(),this);
    }

    public void setTarge(Object targeGet){
        this.targe = targeGet;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doStart();
        //该invoke方法返回的值是被代理接口的一个实现类
        Object invoke = method.invoke(targe, args);
        doEnd();
        return invoke;
    }



    public void doStart(){
        System.out.println("开始打印日志...");
    }

    public void doEnd(){
        System.out.println("结束打印日志...");
    }
}
