// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/query.proto

package com.pubsub.v1;

public interface QuerySubscribersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pubsub.v1.QuerySubscribersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 1 [json_name = "subscribers"];</code>
   */
  java.util.List<com.pubsub.v1.Subscriber> 
      getSubscribersList();
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 1 [json_name = "subscribers"];</code>
   */
  com.pubsub.v1.Subscriber getSubscribers(int index);
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 1 [json_name = "subscribers"];</code>
   */
  int getSubscribersCount();
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 1 [json_name = "subscribers"];</code>
   */
  java.util.List<? extends com.pubsub.v1.SubscriberOrBuilder> 
      getSubscribersOrBuilderList();
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 1 [json_name = "subscribers"];</code>
   */
  com.pubsub.v1.SubscriberOrBuilder getSubscribersOrBuilder(
      int index);
}
