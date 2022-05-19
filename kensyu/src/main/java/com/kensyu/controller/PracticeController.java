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
 * practice画面のコントローラ
 */
@RequestMapping("practice/*")
@Controller
public class PracticeController {

    @Autowired
    private CalculatorService calculatorService;

    /**
     * 初期表示
     *
     * @param index 画面のモデル
     * @return practice画面
     */
    @GetMapping("index")
    public String index(Model model) {

        long num1 = 200;
        long num2 = 100;

        // 200 + 100の計算をする
        long totalValue = calculatorService.add(num1, num2);

        // 200 - 100の計算をする
        long subtractedValue = calculatorService.subtraction(num1, num2);

        // valueに出力する文字列を設定
        model.addAttribute("value1", "世界のHello world.");
        model.addAttribute("value2", "Hello world.");
        model.addAttribute("value3", "こんにちは世界。");
        model.addAttribute("value4", "Hej Verden.");
        model.addAttribute("value5", "計算してみた");

        //計算する値を設定
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);

        // 計算結果を設定
        model.addAttribute("totalValue", totalValue);
        model.addAttribute("subtractedValue", subtractedValue);

        return "practice";

    }

    /**
     * 結果画面
     *
     * @param model 画面のモデル
     * @return result画面
     */
    @PostMapping("exetute")
    public String exetute(@RequestParam String text1, @RequestParam String text2, Model model) {

        //valueに、文字を設定
        model.addAttribute("value", "前画面で、「" + text1 + "」と「" + text2 + "」が入力されました。");

        return "helloResult";
    }

}
