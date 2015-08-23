package org.zhubao.boot.vo.wapper;

import lombok.Data;

@Data
public class ResponseVo<T> {

    private MetaVo meta = new MetaVo();
    private T data;
}
