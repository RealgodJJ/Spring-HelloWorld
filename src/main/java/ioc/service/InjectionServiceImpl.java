package ioc.service;

import ioc.dao.InjectionDao;
import ioc.dao.InjectionDaoImpl;

public class InjectionServiceImpl implements InjectionService {
    private InjectionDao injectionDao;

    public InjectionServiceImpl(InjectionDaoImpl injectionDao) {
        this.injectionDao = injectionDao;
    }

    public InjectionServiceImpl() {

    }

    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    @Override
    public void save(String data) {
        System.out.println("Service接收参数如下：\n" + data);
        data += ":" + this.hashCode();
        injectionDao.save(data);
    }
}
