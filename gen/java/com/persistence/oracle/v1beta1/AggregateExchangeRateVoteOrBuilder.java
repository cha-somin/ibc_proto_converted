// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: persistence/oracle/v1beta1/oracle.proto

package com.persistence.oracle.v1beta1;

public interface AggregateExchangeRateVoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:persistence.oracle.v1beta1.AggregateExchangeRateVote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .persistence.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  java.util.List<com.persistence.oracle.v1beta1.ExchangeRateTuple> 
      getExchangeRateTuplesList();
  /**
   * <code>repeated .persistence.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  com.persistence.oracle.v1beta1.ExchangeRateTuple getExchangeRateTuples(int index);
  /**
   * <code>repeated .persistence.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  int getExchangeRateTuplesCount();
  /**
   * <code>repeated .persistence.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  java.util.List<? extends com.persistence.oracle.v1beta1.ExchangeRateTupleOrBuilder> 
      getExchangeRateTuplesOrBuilderList();
  /**
   * <code>repeated .persistence.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [json_name = "exchangeRateTuples", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
   */
  com.persistence.oracle.v1beta1.ExchangeRateTupleOrBuilder getExchangeRateTuplesOrBuilder(
      int index);

  /**
   * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The voter.
   */
  java.lang.String getVoter();
  /**
   * <code>string voter = 2 [json_name = "voter", (.gogoproto.moretags) = "yaml:&#92;"voter&#92;"", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for voter.
   */
  com.google.protobuf.ByteString
      getVoterBytes();
}
