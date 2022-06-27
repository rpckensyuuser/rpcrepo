package com.kensyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CSSデモ画面のコントローラー
 */
@RequestMapping("cssdemo/*")
@Controller
public class CssDemoController {

    /**
     * 初期表示
     *
     * ＠param model 画面のモデル
     * @return CSSデモ画面
     */
    @GetMapping("index")
    public String index(Model model) {

        return "cssdemo";

    }

}
