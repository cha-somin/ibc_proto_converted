// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/shield/v1alpha1/query.proto

package com.shentu.shield.v1alpha1;

public interface QueryPurchasesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shentu.shield.v1alpha1.QueryPurchasesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .shentu.shield.v1alpha1.Purchase purchases = 1 [json_name = "purchases", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.shentu.shield.v1alpha1.Purchase> 
      getPurchasesList();
  /**
   * <code>repeated .shentu.shield.v1alpha1.Purchase purchases = 1 [json_name = "purchases", (.gogoproto.nullable) = false];</code>
   */
  com.shentu.shield.v1alpha1.Purchase getPurchases(int index);
  /**
   * <code>repeated .shentu.shield.v1alpha1.Purchase purchases = 1 [json_name = "purchases", (.gogoproto.nullable) = false];</code>
   */
  int getPurchasesCount();
  /**
   * <code>repeated .shentu.shield.v1alpha1.Purchase purchases = 1 [json_name = "purchases", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.shentu.shield.v1alpha1.PurchaseOrBuilder> 
      getPurchasesOrBuilderList();
  /**
   * <code>repeated .shentu.shield.v1alpha1.Purchase purchases = 1 [json_name = "purchases", (.gogoproto.nullable) = false];</code>
   */
  com.shentu.shield.v1alpha1.PurchaseOrBuilder getPurchasesOrBuilder(
      int index);
}
