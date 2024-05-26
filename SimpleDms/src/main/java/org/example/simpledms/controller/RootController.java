package org.example.simpledms.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * fileName : RootController
 * author : kangtaegyung
 * date : 2022/06/14
 * description : 새로고침 시 자동 Redirect 클래스( 배포버전에는 새로고침 시 Not Found 발생함 )
 */
@Controller
public class RootController implements ErrorController {

    @GetMapping("/error")
    public String redirectRoot() {
        return "index.html";
    }
}
