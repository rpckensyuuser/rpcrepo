package com.kensyu.service;

/**
 * 計算サービス
 */
public interface CalculatorService {
    /**
     * 引数1と引数2を足す
     * @param value1 計算対象1
     * @param value2 計算対象2
     * @return 計算結果
     */
    long add(long value1, long value2);

    /**
     * 引数1から引数2を引く
     * @param value1 計算対象1
     * @param value2 計算対象2
     * @return 計算結果
     */
    long subtraction(long value1, long value2);

}
