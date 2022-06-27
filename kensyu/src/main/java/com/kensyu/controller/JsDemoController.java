package com.kensyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JavaScriptデモ画面のコントローラー
 */
@RequestMapping("jsdemo/*")
@Controller
public class JsDemoController {

    /**
     * 初期表示
     *
     * ＠param model 画面のモデル
     * @return JavaScriptのデモ画面
     */
    @GetMapping("index")
    public String index(Model model) {

        return "jsdemo";

    }

}
