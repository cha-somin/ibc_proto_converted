// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/query.proto

package com.pubsub.v1;

public interface QuerySubscriberIntentsBySubscriptionIDResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pubsub.v1.QuerySubscriberIntentsBySubscriptionIDResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 1 [json_name = "subscriberIntents"];</code>
   */
  java.util.List<com.pubsub.v1.SubscriberIntent> 
      getSubscriberIntentsList();
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 1 [json_name = "subscriberIntents"];</code>
   */
  com.pubsub.v1.SubscriberIntent getSubscriberIntents(int index);
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 1 [json_name = "subscriberIntents"];</code>
   */
  int getSubscriberIntentsCount();
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 1 [json_name = "subscriberIntents"];</code>
   */
  java.util.List<? extends com.pubsub.v1.SubscriberIntentOrBuilder> 
      getSubscriberIntentsOrBuilderList();
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 1 [json_name = "subscriberIntents"];</code>
   */
  com.pubsub.v1.SubscriberIntentOrBuilder getSubscriberIntentsOrBuilder(
      int index);
}
