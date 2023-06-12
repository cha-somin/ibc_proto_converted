// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mars/incentives/v1beta1/tx.proto

package com.mars.incentives.v1beta1;

public interface MsgTerminateSchedulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mars.incentives.v1beta1.MsgTerminateSchedules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Authority is the account executing the safety fund spend.
   * It should be the gov module account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * Authority is the account executing the safety fund spend.
   * It should be the gov module account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * Ids is the array of identifiers of the incentives schedules which are to be
   * terminated.
   * </pre>
   *
   * <code>repeated uint64 ids = 2 [json_name = "ids"];</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.Long> getIdsList();
  /**
   * <pre>
   * Ids is the array of identifiers of the incentives schedules which are to be
   * terminated.
   * </pre>
   *
   * <code>repeated uint64 ids = 2 [json_name = "ids"];</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * Ids is the array of identifiers of the incentives schedules which are to be
   * terminated.
   * </pre>
   *
   * <code>repeated uint64 ids = 2 [json_name = "ids"];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  long getIds(int index);
}
