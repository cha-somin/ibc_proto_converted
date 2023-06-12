// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/msgs.proto

package com.gravity.v1;

public interface MsgValsetUpdatedClaimOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.MsgValsetUpdatedClaim)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 event_nonce = 1 [json_name = "eventNonce"];</code>
   * @return The eventNonce.
   */
  long getEventNonce();

  /**
   * <code>uint64 valset_nonce = 2 [json_name = "valsetNonce"];</code>
   * @return The valsetNonce.
   */
  long getValsetNonce();

  /**
   * <code>uint64 eth_block_height = 3 [json_name = "ethBlockHeight"];</code>
   * @return The ethBlockHeight.
   */
  long getEthBlockHeight();

  /**
   * <code>repeated .gravity.v1.BridgeValidator members = 4 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.gravity.v1.BridgeValidator> 
      getMembersList();
  /**
   * <code>repeated .gravity.v1.BridgeValidator members = 4 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.BridgeValidator getMembers(int index);
  /**
   * <code>repeated .gravity.v1.BridgeValidator members = 4 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  int getMembersCount();
  /**
   * <code>repeated .gravity.v1.BridgeValidator members = 4 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.gravity.v1.BridgeValidatorOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <code>repeated .gravity.v1.BridgeValidator members = 4 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.BridgeValidatorOrBuilder getMembersOrBuilder(
      int index);

  /**
   * <code>string reward_amount = 5 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The rewardAmount.
   */
  java.lang.String getRewardAmount();
  /**
   * <code>string reward_amount = 5 [json_name = "rewardAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for rewardAmount.
   */
  com.google.protobuf.ByteString
      getRewardAmountBytes();

  /**
   * <code>string reward_token = 6 [json_name = "rewardToken"];</code>
   * @return The rewardToken.
   */
  java.lang.String getRewardToken();
  /**
   * <code>string reward_token = 6 [json_name = "rewardToken"];</code>
   * @return The bytes for rewardToken.
   */
  com.google.protobuf.ByteString
      getRewardTokenBytes();

  /**
   * <code>string orchestrator = 7 [json_name = "orchestrator"];</code>
   * @return The orchestrator.
   */
  java.lang.String getOrchestrator();
  /**
   * <code>string orchestrator = 7 [json_name = "orchestrator"];</code>
   * @return The bytes for orchestrator.
   */
  com.google.protobuf.ByteString
      getOrchestratorBytes();
}
