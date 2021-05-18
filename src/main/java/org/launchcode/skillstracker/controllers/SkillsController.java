package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.isNull;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("{firstName}")
    public String helloThere(@PathVariable String firstName) {
        return "Hello, there " + firstName + "!";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "ambassadorialGreeting")
    public String createMessage(@RequestParam String name, String language) {
        if (language.equals("english")) {
            return "Hello, " + name + "!";
        } else if (language.equals("french")) {
            return "Bonjour, " + name + "!";
        } else if (language.equals("japanese")) {
            return "Kon'nichiwa, " + name + "!";
        } else if (language.equals("chinese")) {
            return "Ni hao, " + name + "!";
        } else if (language.equals("spanish")) {
            return "Hola, " + name + "!";
        } else {
            return "That doesn't make sense!";
        }
    }

    @GetMapping("form")
    public String helloForm() {
        return "<form action='ambassadorialGreeting' method='post'>" +
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                "<option value='english' default='true'>English</option>" +
                "<option value ='french'>French</option>" +
                "<option value='japanese'>Japanese</option>" +
                "<option value='chinese'>Chinese</option>" +
                "<option value='spanish'>Spanish</option>" +
                "</select>" +
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
