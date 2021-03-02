package com.cloudprovisioner.controller;

import com.cloudprovisioner.AwsCloudProvisionerStack;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import software.amazon.awscdk.core.App;

@RestController
public class ProvisioningController {

    @RequestMapping(value = "/queue", params = { "id" }, method = RequestMethod.GET)
    String provisionQueue(@RequestParam("id")String id){
       if(StringUtils.isEmpty(id)){
          return "id cant be empty";
       }
       if (!id.matches("^[A-Za-z][A-Za-z0-9]{1,254}$")){
           return "invalid queue id "+id;
       }
        App app = new App();
        AwsCloudProvisionerStack stack = new AwsCloudProvisionerStack(app, "AwsCloudProvisionerStack");
        stack.provisionQueue(id);
        app.synth();
        return "Success: Queue Created:- "+id;
    }

    @RequestMapping(value = "/topic", params = { "id" }, method = RequestMethod.GET)
    String provisionTopic(@RequestParam("id")String id){
        if(StringUtils.isEmpty(id)){
            return "id cant be empty";
        }
        if (!id.matches("^[A-Za-z][A-Za-z0-9]{1,254}$")){
            return "invalid queue id "+id;
        }
        App app = new App();
        AwsCloudProvisionerStack stack = new AwsCloudProvisionerStack(app, "AwsCloudProvisionerStack");
        stack.provisionTopic(id);
        app.synth();
        return "Success: Topic Created:- "+id;
    }
}
