// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/sumtree/v1beta1/tree.proto

package com.osmosis.store.v1beta1;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.store.v1beta1.Node)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .osmosis.store.v1beta1.Child children = 1 [json_name = "children"];</code>
   */
  java.util.List<com.osmosis.store.v1beta1.Child> 
      getChildrenList();
  /**
   * <code>repeated .osmosis.store.v1beta1.Child children = 1 [json_name = "children"];</code>
   */
  com.osmosis.store.v1beta1.Child getChildren(int index);
  /**
   * <code>repeated .osmosis.store.v1beta1.Child children = 1 [json_name = "children"];</code>
   */
  int getChildrenCount();
  /**
   * <code>repeated .osmosis.store.v1beta1.Child children = 1 [json_name = "children"];</code>
   */
  java.util.List<? extends com.osmosis.store.v1beta1.ChildOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <code>repeated .osmosis.store.v1beta1.Child children = 1 [json_name = "children"];</code>
   */
  com.osmosis.store.v1beta1.ChildOrBuilder getChildrenOrBuilder(
      int index);
}
