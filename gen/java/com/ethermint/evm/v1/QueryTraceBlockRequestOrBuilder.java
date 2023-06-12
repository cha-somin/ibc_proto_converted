// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/evm/v1/query.proto

package com.ethermint.evm.v1;

public interface QueryTraceBlockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ethermint.evm.v1.QueryTraceBlockRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * txs is an array of messages in the block
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.MsgEthereumTx txs = 1 [json_name = "txs"];</code>
   */
  java.util.List<com.ethermint.evm.v1.MsgEthereumTx> 
      getTxsList();
  /**
   * <pre>
   * txs is an array of messages in the block
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.MsgEthereumTx txs = 1 [json_name = "txs"];</code>
   */
  com.ethermint.evm.v1.MsgEthereumTx getTxs(int index);
  /**
   * <pre>
   * txs is an array of messages in the block
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.MsgEthereumTx txs = 1 [json_name = "txs"];</code>
   */
  int getTxsCount();
  /**
   * <pre>
   * txs is an array of messages in the block
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.MsgEthereumTx txs = 1 [json_name = "txs"];</code>
   */
  java.util.List<? extends com.ethermint.evm.v1.MsgEthereumTxOrBuilder> 
      getTxsOrBuilderList();
  /**
   * <pre>
   * txs is an array of messages in the block
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.MsgEthereumTx txs = 1 [json_name = "txs"];</code>
   */
  com.ethermint.evm.v1.MsgEthereumTxOrBuilder getTxsOrBuilder(
      int index);

  /**
   * <pre>
   * trace_config holds extra parameters to trace functions.
   * </pre>
   *
   * <code>.ethermint.evm.v1.TraceConfig trace_config = 3 [json_name = "traceConfig"];</code>
   * @return Whether the traceConfig field is set.
   */
  boolean hasTraceConfig();
  /**
   * <pre>
   * trace_config holds extra parameters to trace functions.
   * </pre>
   *
   * <code>.ethermint.evm.v1.TraceConfig trace_config = 3 [json_name = "traceConfig"];</code>
   * @return The traceConfig.
   */
  com.ethermint.evm.v1.TraceConfig getTraceConfig();
  /**
   * <pre>
   * trace_config holds extra parameters to trace functions.
   * </pre>
   *
   * <code>.ethermint.evm.v1.TraceConfig trace_config = 3 [json_name = "traceConfig"];</code>
   */
  com.ethermint.evm.v1.TraceConfigOrBuilder getTraceConfigOrBuilder();

  /**
   * <pre>
   * block_number of the traced block
   * </pre>
   *
   * <code>int64 block_number = 5 [json_name = "blockNumber"];</code>
   * @return The blockNumber.
   */
  long getBlockNumber();

  /**
   * <pre>
   * block_hash (hex) of the traced block
   * </pre>
   *
   * <code>string block_hash = 6 [json_name = "blockHash"];</code>
   * @return The blockHash.
   */
  java.lang.String getBlockHash();
  /**
   * <pre>
   * block_hash (hex) of the traced block
   * </pre>
   *
   * <code>string block_hash = 6 [json_name = "blockHash"];</code>
   * @return The bytes for blockHash.
   */
  com.google.protobuf.ByteString
      getBlockHashBytes();

  /**
   * <pre>
   * block_time of the traced block
   * </pre>
   *
   * <code>.google.protobuf.Timestamp block_time = 7 [json_name = "blockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the blockTime field is set.
   */
  boolean hasBlockTime();
  /**
   * <pre>
   * block_time of the traced block
   * </pre>
   *
   * <code>.google.protobuf.Timestamp block_time = 7 [json_name = "blockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The blockTime.
   */
  com.google.protobuf.Timestamp getBlockTime();
  /**
   * <pre>
   * block_time of the traced block
   * </pre>
   *
   * <code>.google.protobuf.Timestamp block_time = 7 [json_name = "blockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getBlockTimeOrBuilder();

  /**
   * <pre>
   * proposer_address is the address of the requested block
   * </pre>
   *
   * <code>bytes proposer_address = 8 [json_name = "proposerAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ConsAddress"];</code>
   * @return The proposerAddress.
   */
  com.google.protobuf.ByteString getProposerAddress();

  /**
   * <pre>
   * chain_id is the eip155 chain id parsed from the requested block header
   * </pre>
   *
   * <code>int64 chain_id = 9 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  long getChainId();
}
