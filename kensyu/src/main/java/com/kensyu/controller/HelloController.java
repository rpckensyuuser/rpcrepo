package com.kensyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kensyu.service.CalculatorService;

/**
 * Hello画面のコントローラ
 */
@RequestMapping("hello/*")
@Controller
public class HelloController {
    /**
     * 計算サービスをインジェクション
     */
    @Autowired
    private CalculatorService calculatorService;

    /**
     * 初期表示
     *
     * @param model 画面のモデル
     * @return Hello画面
     */
    @GetMapping("world")
    public String index(Model model) {
        // valueに"Hello World."を設定
        model.addAttribute("value", "Hello World.");

        // 100 + 200の計算をする
        long totalValue = calculatorService.add(100, 200);

        // 計算結果を設定
        model.addAttribute("totalValue", totalValue);

        return "hello";
    }

    /**
     * 結果画面
     *
     * @param model 画面のモデル
     * @return result画面
     */
    @PostMapping("exetute")
    public String exetute(@RequestParam String text, Model model) {

        //valueに、文字を設定
        model.addAttribute("value", "前画面で、「" + text + "」と入力されました。");

        return "helloResult";
    }

}
