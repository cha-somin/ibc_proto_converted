// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/payload.proto

package com.payload;

public interface NameTxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:payload.NameTx)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name updater
   * </pre>
   *
   * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * The name updater
   * </pre>
   *
   * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
   * @return The input.
   */
  com.payload.TxInput getInput();
  /**
   * <pre>
   * The name updater
   * </pre>
   *
   * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
   */
  com.payload.TxInputOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * The name to update or create
   * </pre>
   *
   * <code>string Name = 2 [json_name = "Name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name to update or create
   * </pre>
   *
   * <code>string Name = 2 [json_name = "Name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The data to store against the name
   * </pre>
   *
   * <code>string Data = 3 [json_name = "Data"];</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <pre>
   * The data to store against the name
   * </pre>
   *
   * <code>string Data = 3 [json_name = "Data"];</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <pre>
   * The fee to provide that will determine the length of the name lease
   * </pre>
   *
   * <code>uint64 Fee = 4 [json_name = "Fee"];</code>
   * @return The fee.
   */
  long getFee();
}
