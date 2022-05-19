package com.kensyu.service.impl;

import org.springframework.stereotype.Service;

import com.kensyu.service.CalculatorService;

/***
 * 計算サービスの実装クラス
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

    /*
     *  {@inheritDoc}
     */
    @Override
    public long add(long value1, long value2) {
        // 足し算した結果を返却
        return value1 + value2;
    }

    @Override
    public long subtraction(long value1, long value2) {
        // 引き算した結果を返却
        return value1 - value2;
    }

}
