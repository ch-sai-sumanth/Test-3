package com.Geekster.Test.Controller;



import com.Geekster.Test.Employee;
import com.Geekster.Test.SendMail.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class EmployeeController
{
    @Autowired
    @Qualifier("sumanth")
    Employee emp;

    @GetMapping(value = "/employee")
    public Employee getEmp()
    {
        //convert emp JSON data to string and send it to mail
        JSONObject json = new JSONObject(emp);

        String messege=json.toString();

        System.out.println("--------------------------"+messege);
      HandleMail mailer = new HandleMail();
        mailer.sendMail(messege);



        return emp;
    }
}
