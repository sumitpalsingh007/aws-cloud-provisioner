package com.myorg;

import software.amazon.awscdk.core.App;

public final class AwsCloudProvisionerApp {
    public static void main(final String[] args) {
        App app = new App();

        new AwsCloudProvisionerStack(app, "AwsCloudProvisionerStack");

        app.synth();
    }
}
