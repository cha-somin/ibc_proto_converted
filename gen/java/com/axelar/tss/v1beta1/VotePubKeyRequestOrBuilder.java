// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/v1beta1/tx.proto

package com.axelar.tss.v1beta1;

public interface VotePubKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.tss.v1beta1.VotePubKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  com.google.protobuf.ByteString getSender();

  /**
   * <code>.axelar.vote.exported.v1beta1.PollKey poll_key = 2 [json_name = "pollKey", (.gogoproto.nullable) = false];</code>
   * @return Whether the pollKey field is set.
   */
  boolean hasPollKey();
  /**
   * <code>.axelar.vote.exported.v1beta1.PollKey poll_key = 2 [json_name = "pollKey", (.gogoproto.nullable) = false];</code>
   * @return The pollKey.
   */
  com.axelar.vote.exported.v1beta1.PollKey getPollKey();
  /**
   * <code>.axelar.vote.exported.v1beta1.PollKey poll_key = 2 [json_name = "pollKey", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.vote.exported.v1beta1.PollKeyOrBuilder getPollKeyOrBuilder();

  /**
   * <code>.axelar.tss.tofnd.v1beta1.MessageOut.KeygenResult result = 3 [json_name = "result", (.gogoproto.nullable) = false];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.axelar.tss.tofnd.v1beta1.MessageOut.KeygenResult result = 3 [json_name = "result", (.gogoproto.nullable) = false];</code>
   * @return The result.
   */
  com.axelar.tss.tofnd.v1beta1.MessageOut.KeygenResult getResult();
  /**
   * <code>.axelar.tss.tofnd.v1beta1.MessageOut.KeygenResult result = 3 [json_name = "result", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.tss.tofnd.v1beta1.MessageOut.KeygenResultOrBuilder getResultOrBuilder();
}
