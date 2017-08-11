package com.zhiqin.SpringMVC.commons.beans;

import net.sf.cglib.beans.BeanCopier;

/**
 * Created by zhangbinbin on 2017/8/11.
 */
public class BeanCopyUtils {
    public static void beanCopy(Object fromBean, Object toBean) {
        if (fromBean == null || toBean == null) {
            return;
        }
        BeanCopier b = BeanCopier.create(fromBean.getClass(), toBean.getClass(), false);
        b.copy(fromBean, toBean, null);
    }
}
