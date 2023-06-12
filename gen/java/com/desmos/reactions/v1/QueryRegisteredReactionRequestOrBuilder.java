// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reactions/v1/query.proto

package com.desmos.reactions.v1;

public interface QueryRegisteredReactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.reactions.v1.QueryRegisteredReactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace to query the registered reactions for
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId"];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Id of the registered reaction to query for
   * </pre>
   *
   * <code>uint32 reaction_id = 2 [json_name = "reactionId"];</code>
   * @return The reactionId.
   */
  int getReactionId();
}
