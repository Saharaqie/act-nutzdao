package cn.pa4j.db;

import cn.hutool.db.DbUtil;
import org.nutz.dao.impl.NutDao;

import javax.inject.Singleton;

@Singleton
public class Ndao extends NutDao {
    public Ndao() {
        super(DbUtil.getDs());
    }
}
