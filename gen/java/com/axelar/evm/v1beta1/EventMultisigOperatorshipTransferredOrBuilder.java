// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/types.proto

package com.axelar.evm.v1beta1;

public interface EventMultisigOperatorshipTransferredOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.evm.v1beta1.EventMultisigOperatorshipTransferred)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes new_operators = 3 [json_name = "newOperators", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
   * @return A list containing the newOperators.
   */
  java.util.List<com.google.protobuf.ByteString> getNewOperatorsList();
  /**
   * <code>repeated bytes new_operators = 3 [json_name = "newOperators", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
   * @return The count of newOperators.
   */
  int getNewOperatorsCount();
  /**
   * <code>repeated bytes new_operators = 3 [json_name = "newOperators", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
   * @param index The index of the element to return.
   * @return The newOperators at the given index.
   */
  com.google.protobuf.ByteString getNewOperators(int index);

  /**
   * <code>bytes new_threshold = 4 [json_name = "newThreshold", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
   * @return The newThreshold.
   */
  com.google.protobuf.ByteString getNewThreshold();

  /**
   * <code>repeated bytes new_weights = 5 [json_name = "newWeights", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
   * @return A list containing the newWeights.
   */
  java.util.List<com.google.protobuf.ByteString> getNewWeightsList();
  /**
   * <code>repeated bytes new_weights = 5 [json_name = "newWeights", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
   * @return The count of newWeights.
   */
  int getNewWeightsCount();
  /**
   * <code>repeated bytes new_weights = 5 [json_name = "newWeights", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Uint"];</code>
   * @param index The index of the element to return.
   * @return The newWeights at the given index.
   */
  com.google.protobuf.ByteString getNewWeights(int index);
}
