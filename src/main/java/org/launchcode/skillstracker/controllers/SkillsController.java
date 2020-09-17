package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/form")
        public String skillsForm() {
        return "<form method = 'POST' action = /form>" +
                "<label>Name:<br><input type = 'text' name = 'name'/></label><br>" +
                "<label>My favorite language:<br><select name='languages1'></label>" +
                "<option value='choice'>Please choose a language</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label><br>My second language:<br><select name='languages2'></label>" +
                "<option value='choice'>Please choose a language</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label><br>My third language:<br><select name='languages3'></label>" +
                "<option value='choice'>Please choose a language</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br><input type = 'submit' value = 'Submit' />" +
                "</form";
    }

    @GetMapping
    public String skillsList() {
        return  "<h1> Skills Tracker</h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li>React</li>" +
                "<li>Python</li>" +
                "<li>Java</li>" +
                "</ol>";
    }

    @PostMapping("/form")
        public String formResult(@RequestParam String name, @RequestParam String languages1, @RequestParam String languages2, @RequestParam String languages3) {
        return "<h1>" + name +"</h1><br>" +
                "<ol>" +
                "<li>" + languages1 + "</li>" +
                "<li>" + languages2 + "</li>" +
                "<li>" + languages3 + "</li>" +
                "</ol";
    }



}
