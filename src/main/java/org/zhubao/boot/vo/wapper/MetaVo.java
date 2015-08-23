package org.zhubao.boot.vo.wapper;

import lombok.Data;

import org.zhubao.boot.util.Constants;

@Data
public class MetaVo {
    private int code = Constants.SUCCESS_CODE;
    private String message = Constants.SUCCESS_MESSAGE;
}
