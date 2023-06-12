// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/genesis.proto

package com.pubsub.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pubsub.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pubsub.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.pubsub.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.pubsub.v1.Params getParams();
  /**
   * <code>.pubsub.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.pubsub.v1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <code>repeated .pubsub.v1.Publisher publishers = 2 [json_name = "publishers"];</code>
   */
  java.util.List<com.pubsub.v1.Publisher> 
      getPublishersList();
  /**
   * <code>repeated .pubsub.v1.Publisher publishers = 2 [json_name = "publishers"];</code>
   */
  com.pubsub.v1.Publisher getPublishers(int index);
  /**
   * <code>repeated .pubsub.v1.Publisher publishers = 2 [json_name = "publishers"];</code>
   */
  int getPublishersCount();
  /**
   * <code>repeated .pubsub.v1.Publisher publishers = 2 [json_name = "publishers"];</code>
   */
  java.util.List<? extends com.pubsub.v1.PublisherOrBuilder> 
      getPublishersOrBuilderList();
  /**
   * <code>repeated .pubsub.v1.Publisher publishers = 2 [json_name = "publishers"];</code>
   */
  com.pubsub.v1.PublisherOrBuilder getPublishersOrBuilder(
      int index);

  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 3 [json_name = "subscribers"];</code>
   */
  java.util.List<com.pubsub.v1.Subscriber> 
      getSubscribersList();
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 3 [json_name = "subscribers"];</code>
   */
  com.pubsub.v1.Subscriber getSubscribers(int index);
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 3 [json_name = "subscribers"];</code>
   */
  int getSubscribersCount();
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 3 [json_name = "subscribers"];</code>
   */
  java.util.List<? extends com.pubsub.v1.SubscriberOrBuilder> 
      getSubscribersOrBuilderList();
  /**
   * <code>repeated .pubsub.v1.Subscriber subscribers = 3 [json_name = "subscribers"];</code>
   */
  com.pubsub.v1.SubscriberOrBuilder getSubscribersOrBuilder(
      int index);

  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 4 [json_name = "publisherIntents"];</code>
   */
  java.util.List<com.pubsub.v1.PublisherIntent> 
      getPublisherIntentsList();
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 4 [json_name = "publisherIntents"];</code>
   */
  com.pubsub.v1.PublisherIntent getPublisherIntents(int index);
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 4 [json_name = "publisherIntents"];</code>
   */
  int getPublisherIntentsCount();
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 4 [json_name = "publisherIntents"];</code>
   */
  java.util.List<? extends com.pubsub.v1.PublisherIntentOrBuilder> 
      getPublisherIntentsOrBuilderList();
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 4 [json_name = "publisherIntents"];</code>
   */
  com.pubsub.v1.PublisherIntentOrBuilder getPublisherIntentsOrBuilder(
      int index);

  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 5 [json_name = "subscriberIntents"];</code>
   */
  java.util.List<com.pubsub.v1.SubscriberIntent> 
      getSubscriberIntentsList();
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 5 [json_name = "subscriberIntents"];</code>
   */
  com.pubsub.v1.SubscriberIntent getSubscriberIntents(int index);
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 5 [json_name = "subscriberIntents"];</code>
   */
  int getSubscriberIntentsCount();
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 5 [json_name = "subscriberIntents"];</code>
   */
  java.util.List<? extends com.pubsub.v1.SubscriberIntentOrBuilder> 
      getSubscriberIntentsOrBuilderList();
  /**
   * <code>repeated .pubsub.v1.SubscriberIntent subscriber_intents = 5 [json_name = "subscriberIntents"];</code>
   */
  com.pubsub.v1.SubscriberIntentOrBuilder getSubscriberIntentsOrBuilder(
      int index);

  /**
   * <code>repeated .pubsub.v1.DefaultSubscription default_subscriptions = 6 [json_name = "defaultSubscriptions"];</code>
   */
  java.util.List<com.pubsub.v1.DefaultSubscription> 
      getDefaultSubscriptionsList();
  /**
   * <code>repeated .pubsub.v1.DefaultSubscription default_subscriptions = 6 [json_name = "defaultSubscriptions"];</code>
   */
  com.pubsub.v1.DefaultSubscription getDefaultSubscriptions(int index);
  /**
   * <code>repeated .pubsub.v1.DefaultSubscription default_subscriptions = 6 [json_name = "defaultSubscriptions"];</code>
   */
  int getDefaultSubscriptionsCount();
  /**
   * <code>repeated .pubsub.v1.DefaultSubscription default_subscriptions = 6 [json_name = "defaultSubscriptions"];</code>
   */
  java.util.List<? extends com.pubsub.v1.DefaultSubscriptionOrBuilder> 
      getDefaultSubscriptionsOrBuilderList();
  /**
   * <code>repeated .pubsub.v1.DefaultSubscription default_subscriptions = 6 [json_name = "defaultSubscriptions"];</code>
   */
  com.pubsub.v1.DefaultSubscriptionOrBuilder getDefaultSubscriptionsOrBuilder(
      int index);
}
