package ioc.dao;

public class InjectionDaoImpl implements InjectionDao {
    @Override
    public void save(String data) {
        System.out.println("保存数据：" + data);
    }
}
