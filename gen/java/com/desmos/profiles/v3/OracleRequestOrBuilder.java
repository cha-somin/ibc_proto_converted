// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/models_app_links.proto

package com.desmos.profiles.v3;

public interface OracleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v3.OracleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID is the ID of the request
   * </pre>
   *
   * <code>uint64 id = 1 [json_name = "id", (.gogoproto.customname) = "ID", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * OracleScriptID is ID of an oracle script
   * </pre>
   *
   * <code>uint64 oracle_script_id = 2 [json_name = "oracleScriptId", (.gogoproto.customname) = "OracleScriptID", (.gogoproto.moretags) = "yaml:&#92;"oracle_script_id&#92;""];</code>
   * @return The oracleScriptId.
   */
  long getOracleScriptId();

  /**
   * <pre>
   * CallData contains the data used to perform the oracle request
   * </pre>
   *
   * <code>.desmos.profiles.v3.OracleRequest.CallData call_data = 3 [json_name = "callData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"call_data&#92;""];</code>
   * @return Whether the callData field is set.
   */
  boolean hasCallData();
  /**
   * <pre>
   * CallData contains the data used to perform the oracle request
   * </pre>
   *
   * <code>.desmos.profiles.v3.OracleRequest.CallData call_data = 3 [json_name = "callData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"call_data&#92;""];</code>
   * @return The callData.
   */
  com.desmos.profiles.v3.OracleRequest.CallData getCallData();
  /**
   * <pre>
   * CallData contains the data used to perform the oracle request
   * </pre>
   *
   * <code>.desmos.profiles.v3.OracleRequest.CallData call_data = 3 [json_name = "callData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"call_data&#92;""];</code>
   */
  com.desmos.profiles.v3.OracleRequest.CallDataOrBuilder getCallDataOrBuilder();

  /**
   * <pre>
   * ClientID represents the ID of the client that has called the oracle script
   * </pre>
   *
   * <code>string client_id = 4 [json_name = "clientId", (.gogoproto.customname) = "ClientID", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * ClientID represents the ID of the client that has called the oracle script
   * </pre>
   *
   * <code>string client_id = 4 [json_name = "clientId", (.gogoproto.customname) = "ClientID", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();
}
