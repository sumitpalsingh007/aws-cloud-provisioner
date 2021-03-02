package com.cloudprovisioner;

import org.springframework.stereotype.Component;
import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Duration;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.sns.Topic;
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscription;
import software.amazon.awscdk.services.sqs.Queue;

public class AwsCloudProvisionerStack extends Stack {
    public AwsCloudProvisionerStack(final Construct parent, final String id) {
        this(parent, id, null);
    }

    public AwsCloudProvisionerStack(final Construct parent, final String id, final StackProps props) {
        super(parent, id, props);
        //topic.addSubscription(new SqsSubscription(queue));
    }

    public void provisionQueue(String id){
        final Queue queue = Queue.Builder.create(this, id)
                .visibilityTimeout(Duration.seconds(300))
                .build();
    }

    public void provisionTopic(String id){
        final Topic topic = Topic.Builder.create(this, id)
                .displayName("Topic Name-"+id)
                .build();
    }
}
