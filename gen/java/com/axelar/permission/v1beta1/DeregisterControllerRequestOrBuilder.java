// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/permission/v1beta1/tx.proto

package com.axelar.permission.v1beta1;

public interface DeregisterControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.permission.v1beta1.DeregisterControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  com.google.protobuf.ByteString getSender();

  /**
   * <code>bytes controller = 2 [json_name = "controller", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The controller.
   */
  com.google.protobuf.ByteString getController();
}
