// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package com.cosmos.auth.v1beta1;

public interface QueryModuleAccountsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.auth.v1beta1.QueryModuleAccountsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.ModuleAccountI"];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getAccountsList();
  /**
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.ModuleAccountI"];</code>
   */
  com.google.protobuf.Any getAccounts(int index);
  /**
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.ModuleAccountI"];</code>
   */
  int getAccountsCount();
  /**
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.ModuleAccountI"];</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getAccountsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "cosmos.auth.v1beta1.ModuleAccountI"];</code>
   */
  com.google.protobuf.AnyOrBuilder getAccountsOrBuilder(
      int index);
}
