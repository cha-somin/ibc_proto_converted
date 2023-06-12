// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/oracle.proto

package com.oracle.v1;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:oracle.v1.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * OracleScriptID is ID of an oracle script
   * </pre>
   *
   * <code>uint64 oracle_script_id = 1 [json_name = "oracleScriptId", (.gogoproto.customname) = "OracleScriptID", (.gogoproto.casttype) = "OracleScriptID"];</code>
   * @return The oracleScriptId.
   */
  long getOracleScriptId();

  /**
   * <pre>
   * Calldata is the data used as argument params for the oracle script
   * </pre>
   *
   * <code>bytes calldata = 2 [json_name = "calldata"];</code>
   * @return The calldata.
   */
  com.google.protobuf.ByteString getCalldata();

  /**
   * <pre>
   * RequestedValidators is a list of validator addresses that are assigned for
   * fulfilling the request
   * </pre>
   *
   * <code>repeated string requested_validators = 3 [json_name = "requestedValidators"];</code>
   * @return A list containing the requestedValidators.
   */
  java.util.List<java.lang.String>
      getRequestedValidatorsList();
  /**
   * <pre>
   * RequestedValidators is a list of validator addresses that are assigned for
   * fulfilling the request
   * </pre>
   *
   * <code>repeated string requested_validators = 3 [json_name = "requestedValidators"];</code>
   * @return The count of requestedValidators.
   */
  int getRequestedValidatorsCount();
  /**
   * <pre>
   * RequestedValidators is a list of validator addresses that are assigned for
   * fulfilling the request
   * </pre>
   *
   * <code>repeated string requested_validators = 3 [json_name = "requestedValidators"];</code>
   * @param index The index of the element to return.
   * @return The requestedValidators at the given index.
   */
  java.lang.String getRequestedValidators(int index);
  /**
   * <pre>
   * RequestedValidators is a list of validator addresses that are assigned for
   * fulfilling the request
   * </pre>
   *
   * <code>repeated string requested_validators = 3 [json_name = "requestedValidators"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the requestedValidators at the given index.
   */
  com.google.protobuf.ByteString
      getRequestedValidatorsBytes(int index);

  /**
   * <pre>
   * MinCount is minimum number of validators required for fulfilling the
   * request
   * </pre>
   *
   * <code>uint64 min_count = 4 [json_name = "minCount"];</code>
   * @return The minCount.
   */
  long getMinCount();

  /**
   * <pre>
   * RequestHeight is block height that the request has been created
   * </pre>
   *
   * <code>int64 request_height = 5 [json_name = "requestHeight"];</code>
   * @return The requestHeight.
   */
  long getRequestHeight();

  /**
   * <pre>
   * RequestTime is timestamp of the chain's block which contains the request
   * </pre>
   *
   * <code>int64 request_time = 6 [json_name = "requestTime"];</code>
   * @return The requestTime.
   */
  long getRequestTime();

  /**
   * <pre>
   * ClientID is arbitrary id provided by requester.
   * It is used by client-side for referencing the request
   * </pre>
   *
   * <code>string client_id = 7 [json_name = "clientId", (.gogoproto.customname) = "ClientID"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * ClientID is arbitrary id provided by requester.
   * It is used by client-side for referencing the request
   * </pre>
   *
   * <code>string client_id = 7 [json_name = "clientId", (.gogoproto.customname) = "ClientID"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * RawRequests is a list of raw requests specified by execution of oracle
   * script
   * </pre>
   *
   * <code>repeated .oracle.v1.RawRequest raw_requests = 8 [json_name = "rawRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.oracle.v1.RawRequest> 
      getRawRequestsList();
  /**
   * <pre>
   * RawRequests is a list of raw requests specified by execution of oracle
   * script
   * </pre>
   *
   * <code>repeated .oracle.v1.RawRequest raw_requests = 8 [json_name = "rawRequests", (.gogoproto.nullable) = false];</code>
   */
  com.oracle.v1.RawRequest getRawRequests(int index);
  /**
   * <pre>
   * RawRequests is a list of raw requests specified by execution of oracle
   * script
   * </pre>
   *
   * <code>repeated .oracle.v1.RawRequest raw_requests = 8 [json_name = "rawRequests", (.gogoproto.nullable) = false];</code>
   */
  int getRawRequestsCount();
  /**
   * <pre>
   * RawRequests is a list of raw requests specified by execution of oracle
   * script
   * </pre>
   *
   * <code>repeated .oracle.v1.RawRequest raw_requests = 8 [json_name = "rawRequests", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.oracle.v1.RawRequestOrBuilder> 
      getRawRequestsOrBuilderList();
  /**
   * <pre>
   * RawRequests is a list of raw requests specified by execution of oracle
   * script
   * </pre>
   *
   * <code>repeated .oracle.v1.RawRequest raw_requests = 8 [json_name = "rawRequests", (.gogoproto.nullable) = false];</code>
   */
  com.oracle.v1.RawRequestOrBuilder getRawRequestsOrBuilder(
      int index);

  /**
   * <pre>
   * IBCChannel is an IBC channel info of the other chain, which contains a
   * channel and a port to allow bandchain connect to that chain. This field
   * allows other chain be able to request data from bandchain via IBC.
   * </pre>
   *
   * <code>.oracle.v1.IBCChannel ibc_channel = 9 [json_name = "ibcChannel", (.gogoproto.customname) = "IBCChannel"];</code>
   * @return Whether the ibcChannel field is set.
   */
  boolean hasIbcChannel();
  /**
   * <pre>
   * IBCChannel is an IBC channel info of the other chain, which contains a
   * channel and a port to allow bandchain connect to that chain. This field
   * allows other chain be able to request data from bandchain via IBC.
   * </pre>
   *
   * <code>.oracle.v1.IBCChannel ibc_channel = 9 [json_name = "ibcChannel", (.gogoproto.customname) = "IBCChannel"];</code>
   * @return The ibcChannel.
   */
  com.oracle.v1.IBCChannel getIbcChannel();
  /**
   * <pre>
   * IBCChannel is an IBC channel info of the other chain, which contains a
   * channel and a port to allow bandchain connect to that chain. This field
   * allows other chain be able to request data from bandchain via IBC.
   * </pre>
   *
   * <code>.oracle.v1.IBCChannel ibc_channel = 9 [json_name = "ibcChannel", (.gogoproto.customname) = "IBCChannel"];</code>
   */
  com.oracle.v1.IBCChannelOrBuilder getIbcChannelOrBuilder();

  /**
   * <pre>
   * ExecuteGas is amount of gas to reserve for executing
   * </pre>
   *
   * <code>uint64 execute_gas = 10 [json_name = "executeGas"];</code>
   * @return The executeGas.
   */
  long getExecuteGas();
}
