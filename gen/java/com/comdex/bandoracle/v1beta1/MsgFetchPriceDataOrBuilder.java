// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/bandoracle/v1beta1/tx.proto

package com.comdex.bandoracle.v1beta1;

public interface MsgFetchPriceDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.bandoracle.v1beta1.MsgFetchPriceData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>uint64 oracle_script_id = 2 [json_name = "oracleScriptId", (.gogoproto.customname) = "OracleScriptID", (.gogoproto.moretags) = "yaml:&#92;"oracle_script_id&#92;""];</code>
   * @return The oracleScriptId.
   */
  long getOracleScriptId();

  /**
   * <code>string source_channel = 3 [json_name = "sourceChannel"];</code>
   * @return The sourceChannel.
   */
  java.lang.String getSourceChannel();
  /**
   * <code>string source_channel = 3 [json_name = "sourceChannel"];</code>
   * @return The bytes for sourceChannel.
   */
  com.google.protobuf.ByteString
      getSourceChannelBytes();

  /**
   * <code>.comdex.bandoracle.v1beta1.FetchPriceCallData calldata = 4 [json_name = "calldata"];</code>
   * @return Whether the calldata field is set.
   */
  boolean hasCalldata();
  /**
   * <code>.comdex.bandoracle.v1beta1.FetchPriceCallData calldata = 4 [json_name = "calldata"];</code>
   * @return The calldata.
   */
  com.comdex.bandoracle.v1beta1.FetchPriceCallData getCalldata();
  /**
   * <code>.comdex.bandoracle.v1beta1.FetchPriceCallData calldata = 4 [json_name = "calldata"];</code>
   */
  com.comdex.bandoracle.v1beta1.FetchPriceCallDataOrBuilder getCalldataOrBuilder();

  /**
   * <code>uint64 ask_count = 5 [json_name = "askCount"];</code>
   * @return The askCount.
   */
  long getAskCount();

  /**
   * <code>uint64 min_count = 6 [json_name = "minCount"];</code>
   * @return The minCount.
   */
  long getMinCount();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin fee_limit = 7 [json_name = "feeLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getFeeLimitList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin fee_limit = 7 [json_name = "feeLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getFeeLimit(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin fee_limit = 7 [json_name = "feeLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getFeeLimitCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin fee_limit = 7 [json_name = "feeLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getFeeLimitOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin fee_limit = 7 [json_name = "feeLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getFeeLimitOrBuilder(
      int index);

  /**
   * <code>string request_key = 8 [json_name = "requestKey"];</code>
   * @return The requestKey.
   */
  java.lang.String getRequestKey();
  /**
   * <code>string request_key = 8 [json_name = "requestKey"];</code>
   * @return The bytes for requestKey.
   */
  com.google.protobuf.ByteString
      getRequestKeyBytes();

  /**
   * <code>uint64 prepare_gas = 9 [json_name = "prepareGas"];</code>
   * @return The prepareGas.
   */
  long getPrepareGas();

  /**
   * <code>uint64 execute_gas = 10 [json_name = "executeGas"];</code>
   * @return The executeGas.
   */
  long getExecuteGas();

  /**
   * <code>string client_id = 11 [json_name = "clientId", (.gogoproto.customname) = "ClientID"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 11 [json_name = "clientId", (.gogoproto.customname) = "ClientID"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>uint64 twa_batch_size = 12 [json_name = "twaBatchSize"];</code>
   * @return The twaBatchSize.
   */
  long getTwaBatchSize();

  /**
   * <code>int64 accepted_height_diff = 13 [json_name = "acceptedHeightDiff", (.gogoproto.moretags) = "yaml:&#92;"accepted_height_diff&#92;""];</code>
   * @return The acceptedHeightDiff.
   */
  long getAcceptedHeightDiff();
}
