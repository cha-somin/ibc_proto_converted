// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/superfluid/tx.proto

package com.osmosis.superfluid;

public interface MsgSuperfluidUndelegateAndUnbondLockResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.superfluid.MsgSuperfluidUndelegateAndUnbondLockResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * lock id of the new lock created for the remaining amount.
   * returns the original lockid if the unlocked amount is equal to the
   * original lock's amount.
   * </pre>
   *
   * <code>uint64 lock_id = 1 [json_name = "lockId"];</code>
   * @return The lockId.
   */
  long getLockId();
}
