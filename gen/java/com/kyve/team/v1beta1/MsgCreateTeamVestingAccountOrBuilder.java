// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/team/v1beta1/tx.proto

package com.kyve.team.v1beta1;

public interface MsgCreateTeamVestingAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.team.v1beta1.MsgCreateTeamVestingAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authority ...
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * authority ...
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * total_allocation is the number of tokens reserved for this team member.
   * </pre>
   *
   * <code>uint64 total_allocation = 2 [json_name = "totalAllocation"];</code>
   * @return The totalAllocation.
   */
  long getTotalAllocation();

  /**
   * <pre>
   * commencement is the unix timestamp of the member's official start date.
   * </pre>
   *
   * <code>uint64 commencement = 3 [json_name = "commencement"];</code>
   * @return The commencement.
   */
  long getCommencement();
}
