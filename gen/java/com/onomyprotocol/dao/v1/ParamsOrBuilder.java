// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: onomyprotocol/dao/v1/params.proto

package com.onomyprotocol.dao.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:onomyprotocol.dao.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the period of blocks to withdraw the dao staking reward
   * </pre>
   *
   * <code>int64 withdraw_reward_period = 1 [json_name = "withdrawRewardPeriod", (.gogoproto.moretags) = "yaml:&#92;"withdraw_reward_period&#92;""];</code>
   * @return The withdrawRewardPeriod.
   */
  long getWithdrawRewardPeriod();

  /**
   * <pre>
   * the rate of total dao's staking coins to keep unstaked
   * </pre>
   *
   * <code>bytes pool_rate = 2 [json_name = "poolRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"pool_rate&#92;""];</code>
   * @return The poolRate.
   */
  com.google.protobuf.ByteString getPoolRate();

  /**
   * <pre>
   * the max rage of total dao's staking coins to be allowed in proposals
   * </pre>
   *
   * <code>bytes max_proposal_rate = 3 [json_name = "maxProposalRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_proposal_rate&#92;""];</code>
   * @return The maxProposalRate.
   */
  com.google.protobuf.ByteString getMaxProposalRate();

  /**
   * <pre>
   * the max validator's commission to be staked by the dao
   * </pre>
   *
   * <code>bytes max_val_commission = 4 [json_name = "maxValCommission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"max_val_commission&#92;""];</code>
   * @return The maxValCommission.
   */
  com.google.protobuf.ByteString getMaxValCommission();
}
