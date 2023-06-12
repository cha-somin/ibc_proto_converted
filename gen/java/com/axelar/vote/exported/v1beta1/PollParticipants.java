// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/vote/exported/v1beta1/types.proto

package com.axelar.vote.exported.v1beta1;

/**
 * <pre>
 * PollParticipants should be embedded in poll events in other modules
 * </pre>
 *
 * Protobuf type {@code axelar.vote.exported.v1beta1.PollParticipants}
 */
public final class PollParticipants extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.vote.exported.v1beta1.PollParticipants)
    PollParticipantsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PollParticipants.newBuilder() to construct.
  private PollParticipants(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PollParticipants() {
    participants_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PollParticipants();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.vote.exported.v1beta1.TypesProto.internal_static_axelar_vote_exported_v1beta1_PollParticipants_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.vote.exported.v1beta1.TypesProto.internal_static_axelar_vote_exported_v1beta1_PollParticipants_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.vote.exported.v1beta1.PollParticipants.class, com.axelar.vote.exported.v1beta1.PollParticipants.Builder.class);
  }

  public static final int POLL_ID_FIELD_NUMBER = 1;
  private long pollId_ = 0L;
  /**
   * <code>uint64 poll_id = 1 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "PollID", (.gogoproto.customname) = "PollID"];</code>
   * @return The pollId.
   */
  @java.lang.Override
  public long getPollId() {
    return pollId_;
  }

  public static final int PARTICIPANTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> participants_;
  /**
   * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @return A list containing the participants.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getParticipantsList() {
    return participants_;
  }
  /**
   * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @return The count of participants.
   */
  public int getParticipantsCount() {
    return participants_.size();
  }
  /**
   * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @param index The index of the element to return.
   * @return The participants at the given index.
   */
  public com.google.protobuf.ByteString getParticipants(int index) {
    return participants_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pollId_ != 0L) {
      output.writeUInt64(1, pollId_);
    }
    for (int i = 0; i < participants_.size(); i++) {
      output.writeBytes(2, participants_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pollId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, pollId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < participants_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(participants_.get(i));
      }
      size += dataSize;
      size += 1 * getParticipantsList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.axelar.vote.exported.v1beta1.PollParticipants)) {
      return super.equals(obj);
    }
    com.axelar.vote.exported.v1beta1.PollParticipants other = (com.axelar.vote.exported.v1beta1.PollParticipants) obj;

    if (getPollId()
        != other.getPollId()) return false;
    if (!getParticipantsList()
        .equals(other.getParticipantsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + POLL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPollId());
    if (getParticipantsCount() > 0) {
      hash = (37 * hash) + PARTICIPANTS_FIELD_NUMBER;
      hash = (53 * hash) + getParticipantsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.vote.exported.v1beta1.PollParticipants parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.vote.exported.v1beta1.PollParticipants parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.vote.exported.v1beta1.PollParticipants parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.axelar.vote.exported.v1beta1.PollParticipants prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * PollParticipants should be embedded in poll events in other modules
   * </pre>
   *
   * Protobuf type {@code axelar.vote.exported.v1beta1.PollParticipants}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.vote.exported.v1beta1.PollParticipants)
      com.axelar.vote.exported.v1beta1.PollParticipantsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.vote.exported.v1beta1.TypesProto.internal_static_axelar_vote_exported_v1beta1_PollParticipants_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.vote.exported.v1beta1.TypesProto.internal_static_axelar_vote_exported_v1beta1_PollParticipants_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.vote.exported.v1beta1.PollParticipants.class, com.axelar.vote.exported.v1beta1.PollParticipants.Builder.class);
    }

    // Construct using com.axelar.vote.exported.v1beta1.PollParticipants.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pollId_ = 0L;
      participants_ = java.util.Collections.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.vote.exported.v1beta1.TypesProto.internal_static_axelar_vote_exported_v1beta1_PollParticipants_descriptor;
    }

    @java.lang.Override
    public com.axelar.vote.exported.v1beta1.PollParticipants getDefaultInstanceForType() {
      return com.axelar.vote.exported.v1beta1.PollParticipants.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.vote.exported.v1beta1.PollParticipants build() {
      com.axelar.vote.exported.v1beta1.PollParticipants result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.vote.exported.v1beta1.PollParticipants buildPartial() {
      com.axelar.vote.exported.v1beta1.PollParticipants result = new com.axelar.vote.exported.v1beta1.PollParticipants(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.axelar.vote.exported.v1beta1.PollParticipants result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        participants_ = java.util.Collections.unmodifiableList(participants_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.participants_ = participants_;
    }

    private void buildPartial0(com.axelar.vote.exported.v1beta1.PollParticipants result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pollId_ = pollId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.vote.exported.v1beta1.PollParticipants) {
        return mergeFrom((com.axelar.vote.exported.v1beta1.PollParticipants)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.vote.exported.v1beta1.PollParticipants other) {
      if (other == com.axelar.vote.exported.v1beta1.PollParticipants.getDefaultInstance()) return this;
      if (other.getPollId() != 0L) {
        setPollId(other.getPollId());
      }
      if (!other.participants_.isEmpty()) {
        if (participants_.isEmpty()) {
          participants_ = other.participants_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureParticipantsIsMutable();
          participants_.addAll(other.participants_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              pollId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.protobuf.ByteString v = input.readBytes();
              ensureParticipantsIsMutable();
              participants_.add(v);
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long pollId_ ;
    /**
     * <code>uint64 poll_id = 1 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "PollID", (.gogoproto.customname) = "PollID"];</code>
     * @return The pollId.
     */
    @java.lang.Override
    public long getPollId() {
      return pollId_;
    }
    /**
     * <code>uint64 poll_id = 1 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "PollID", (.gogoproto.customname) = "PollID"];</code>
     * @param value The pollId to set.
     * @return This builder for chaining.
     */
    public Builder setPollId(long value) {

      pollId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 poll_id = 1 [json_name = "pollId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "PollID", (.gogoproto.customname) = "PollID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPollId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pollId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> participants_ = java.util.Collections.emptyList();
    private void ensureParticipantsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        participants_ = new java.util.ArrayList<com.google.protobuf.ByteString>(participants_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @return A list containing the participants.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getParticipantsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(participants_) : participants_;
    }
    /**
     * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @return The count of participants.
     */
    public int getParticipantsCount() {
      return participants_.size();
    }
    /**
     * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param index The index of the element to return.
     * @return The participants at the given index.
     */
    public com.google.protobuf.ByteString getParticipants(int index) {
      return participants_.get(index);
    }
    /**
     * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param index The index to set the value at.
     * @param value The participants to set.
     * @return This builder for chaining.
     */
    public Builder setParticipants(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureParticipantsIsMutable();
      participants_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param value The participants to add.
     * @return This builder for chaining.
     */
    public Builder addParticipants(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureParticipantsIsMutable();
      participants_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param values The participants to add.
     * @return This builder for chaining.
     */
    public Builder addAllParticipants(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureParticipantsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, participants_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes participants = 2 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParticipants() {
      participants_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:axelar.vote.exported.v1beta1.PollParticipants)
  }

  // @@protoc_insertion_point(class_scope:axelar.vote.exported.v1beta1.PollParticipants)
  private static final com.axelar.vote.exported.v1beta1.PollParticipants DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.vote.exported.v1beta1.PollParticipants();
  }

  public static com.axelar.vote.exported.v1beta1.PollParticipants getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PollParticipants>
      PARSER = new com.google.protobuf.AbstractParser<PollParticipants>() {
    @java.lang.Override
    public PollParticipants parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PollParticipants> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PollParticipants> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.vote.exported.v1beta1.PollParticipants getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

