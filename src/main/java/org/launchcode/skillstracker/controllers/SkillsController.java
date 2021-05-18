package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class SkillsController {

    @GetMapping("{firstName}")
    public String helloThere(@PathVariable String firstName) {
        return "Hello, there " + firstName + "!";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello there, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "<form action='hello' method='get'>" +
                "<input type='text' name='name'>" +
                "<input type='submit' value='Say My Name!'>" +
                "</form>";
    }

//    @RequestMapping(value="")
//    public String displaySkills() {
//        String html = "<h1>Skills Tracker</h1>" +
//                "<h2>We have a few skills we would like to learn, Here is a list!</h2>" +
//                "<ol>" +
//                "<li>Java</li>" +
//                "<li>JavaScript</li>" +
//                "<li>TypeScript</li>" +
//                "</ol>";
//        return html;
//    }
//
//    @RequestMapping(value="form", method=RequestMethod.GET)
//    public String formSkills() {
//        String html = "<form method='post'>" +
//                "<Name:<br/>" +
//                "<input type='text' name ='name'/>" +
//                "<br>My favorite language:<br>" +
//                "<select name='firstChoice'" +
//                "<option value='Java'>Java</option>" +
//                "<option value='JavaScript'>JavaScript</option>" +
//                "<option value='Python'>Python</option>" +
//                "</select>" +
//                "<br>My second favorite language: <br>" +
//                "<select name ='secondChoice'>" +
//                "<option value='Java'><Java></option>" +
//                "<option value='JavaScript'><JavaScript></option>" +
//                "<option value='Python'><Python></option>" +
//                "</select>" +
//                "<br>My third favorite language:<br>" +
//                "<select name ='thirdChoice'>" +
//                "<option value='Java'><Java></option>" +
//                "<option value='JavaScript'><JavaScript></option>" +
//                "<option value='Python'><Python></option>" +
//                "</select><br>" +
//                "<input type='submit' value='Submit' />" +
//                "</form>";
//
//        return html;
//    }
//
//    @RequestMapping(value="form", method = RequestMethod.POST)
//    public String namePage(@RequestParam String name, String firstChoice, String secondChoice, String thirdChoice) {
//        String html = "<h1>" + name + "</h1>" +
//                "<ol>" +
//                "<li>" + firstChoice + "</li>" +
//                "<li>" + secondChoice + "</li>" +
//                "<li>" + thirdChoice + "</li>" +
//                "</ol>";
//                return html;
//    }

}
