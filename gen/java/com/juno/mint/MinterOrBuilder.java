// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/mint/mint.proto

package com.juno.mint;

public interface MinterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:juno.mint.Minter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * current annual inflation rate
   * </pre>
   *
   * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The inflation.
   */
  java.lang.String getInflation();
  /**
   * <pre>
   * current annual inflation rate
   * </pre>
   *
   * <code>string inflation = 1 [json_name = "inflation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for inflation.
   */
  com.google.protobuf.ByteString
      getInflationBytes();

  /**
   * <code>uint64 phase = 2 [json_name = "phase"];</code>
   * @return The phase.
   */
  long getPhase();

  /**
   * <code>uint64 start_phase_block = 3 [json_name = "startPhaseBlock", (.gogoproto.moretags) = "yaml:&#92;"start_phase_block&#92;""];</code>
   * @return The startPhaseBlock.
   */
  long getStartPhaseBlock();

  /**
   * <pre>
   * current annual expected provisions
   * </pre>
   *
   * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
   * @return The annualProvisions.
   */
  java.lang.String getAnnualProvisions();
  /**
   * <pre>
   * current annual expected provisions
   * </pre>
   *
   * <code>string annual_provisions = 4 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
   * @return The bytes for annualProvisions.
   */
  com.google.protobuf.ByteString
      getAnnualProvisionsBytes();

  /**
   * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
   * @return The targetSupply.
   */
  java.lang.String getTargetSupply();
  /**
   * <code>string target_supply = 5 [json_name = "targetSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"target_supply&#92;""];</code>
   * @return The bytes for targetSupply.
   */
  com.google.protobuf.ByteString
      getTargetSupplyBytes();
}
