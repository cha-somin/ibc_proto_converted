// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/claims/v1beta1/authz.proto

package com.ixo.claims.v1beta1;

public interface EvaluateClaimConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.claims.v1beta1.EvaluateClaimConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection_id indicates to which Collection this claim belongs
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection_id indicates to which Collection this claim belongs
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * either collection_id or claim_ids is needed
   * </pre>
   *
   * <code>repeated string claim_ids = 2 [json_name = "claimIds"];</code>
   * @return A list containing the claimIds.
   */
  java.util.List<java.lang.String>
      getClaimIdsList();
  /**
   * <pre>
   * either collection_id or claim_ids is needed
   * </pre>
   *
   * <code>repeated string claim_ids = 2 [json_name = "claimIds"];</code>
   * @return The count of claimIds.
   */
  int getClaimIdsCount();
  /**
   * <pre>
   * either collection_id or claim_ids is needed
   * </pre>
   *
   * <code>repeated string claim_ids = 2 [json_name = "claimIds"];</code>
   * @param index The index of the element to return.
   * @return The claimIds at the given index.
   */
  java.lang.String getClaimIds(int index);
  /**
   * <pre>
   * either collection_id or claim_ids is needed
   * </pre>
   *
   * <code>repeated string claim_ids = 2 [json_name = "claimIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the claimIds at the given index.
   */
  com.google.protobuf.ByteString
      getClaimIdsBytes(int index);

  /**
   * <code>uint64 agent_quota = 3 [json_name = "agentQuota"];</code>
   * @return The agentQuota.
   */
  long getAgentQuota();

  /**
   * <pre>
   * if null then no before_date validation done
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before_date = 4 [json_name = "beforeDate", (.gogoproto.stdtime) = true];</code>
   * @return Whether the beforeDate field is set.
   */
  boolean hasBeforeDate();
  /**
   * <pre>
   * if null then no before_date validation done
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before_date = 4 [json_name = "beforeDate", (.gogoproto.stdtime) = true];</code>
   * @return The beforeDate.
   */
  com.google.protobuf.Timestamp getBeforeDate();
  /**
   * <pre>
   * if null then no before_date validation done
   * </pre>
   *
   * <code>.google.protobuf.Timestamp before_date = 4 [json_name = "beforeDate", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getBeforeDateOrBuilder();

  /**
   * <pre>
   * max custom amount evaluator can change, if empty list must use amount
   * defined in Token payments
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin max_custom_amount = 10 [json_name = "maxCustomAmount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getMaxCustomAmountList();
  /**
   * <pre>
   * max custom amount evaluator can change, if empty list must use amount
   * defined in Token payments
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin max_custom_amount = 10 [json_name = "maxCustomAmount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getMaxCustomAmount(int index);
  /**
   * <pre>
   * max custom amount evaluator can change, if empty list must use amount
   * defined in Token payments
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin max_custom_amount = 10 [json_name = "maxCustomAmount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getMaxCustomAmountCount();
  /**
   * <pre>
   * max custom amount evaluator can change, if empty list must use amount
   * defined in Token payments
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin max_custom_amount = 10 [json_name = "maxCustomAmount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getMaxCustomAmountOrBuilderList();
  /**
   * <pre>
   * max custom amount evaluator can change, if empty list must use amount
   * defined in Token payments
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin max_custom_amount = 10 [json_name = "maxCustomAmount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getMaxCustomAmountOrBuilder(
      int index);
}
