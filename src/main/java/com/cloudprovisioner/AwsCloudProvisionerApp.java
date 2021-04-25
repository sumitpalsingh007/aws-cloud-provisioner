package com.cloudprovisioner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awscdk.core.App;

@SpringBootApplication
public class AwsCloudProvisionerApp {
    public static void main(final String[] args) {
        SpringApplication.run(AwsCloudProvisionerApp.class, args);
       /* App app = new App();

        new AwsCloudProvisionerStack(app, "AwsCloudProvisionerStack");

        app.synth();*/
    }
}
