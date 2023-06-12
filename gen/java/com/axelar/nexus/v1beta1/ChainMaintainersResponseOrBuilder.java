// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/query.proto

package com.axelar.nexus.v1beta1;

public interface ChainMaintainersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.nexus.v1beta1.ChainMaintainersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes maintainers = 1 [json_name = "maintainers", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @return A list containing the maintainers.
   */
  java.util.List<com.google.protobuf.ByteString> getMaintainersList();
  /**
   * <code>repeated bytes maintainers = 1 [json_name = "maintainers", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @return The count of maintainers.
   */
  int getMaintainersCount();
  /**
   * <code>repeated bytes maintainers = 1 [json_name = "maintainers", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @param index The index of the element to return.
   * @return The maintainers at the given index.
   */
  com.google.protobuf.ByteString getMaintainers(int index);
}
