// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/reward/v1/tx.proto

package com.provenance.reward.v1;

/**
 * <pre>
 * MsgClaimRewardsRequest is the request type for claiming reward from reward program RPC
 * </pre>
 *
 * Protobuf type {@code provenance.reward.v1.MsgClaimRewardsRequest}
 */
public final class MsgClaimRewardsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.reward.v1.MsgClaimRewardsRequest)
    MsgClaimRewardsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgClaimRewardsRequest.newBuilder() to construct.
  private MsgClaimRewardsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgClaimRewardsRequest() {
    rewardAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgClaimRewardsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.reward.v1.TxProto.internal_static_provenance_reward_v1_MsgClaimRewardsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.reward.v1.TxProto.internal_static_provenance_reward_v1_MsgClaimRewardsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.reward.v1.MsgClaimRewardsRequest.class, com.provenance.reward.v1.MsgClaimRewardsRequest.Builder.class);
  }

  public static final int REWARD_PROGRAM_ID_FIELD_NUMBER = 1;
  private long rewardProgramId_ = 0L;
  /**
   * <pre>
   * reward program id to claim rewards.
   * </pre>
   *
   * <code>uint64 reward_program_id = 1 [json_name = "rewardProgramId"];</code>
   * @return The rewardProgramId.
   */
  @java.lang.Override
  public long getRewardProgramId() {
    return rewardProgramId_;
  }

  public static final int REWARD_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardAddress_ = "";
  /**
   * <pre>
   * reward address and signer of msg to send claimed rewards to.
   * </pre>
   *
   * <code>string reward_address = 2 [json_name = "rewardAddress"];</code>
   * @return The rewardAddress.
   */
  @java.lang.Override
  public java.lang.String getRewardAddress() {
    java.lang.Object ref = rewardAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * reward address and signer of msg to send claimed rewards to.
   * </pre>
   *
   * <code>string reward_address = 2 [json_name = "rewardAddress"];</code>
   * @return The bytes for rewardAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardAddressBytes() {
    java.lang.Object ref = rewardAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (rewardProgramId_ != 0L) {
      output.writeUInt64(1, rewardProgramId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rewardAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rewardProgramId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, rewardProgramId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rewardAddress_);
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
    if (!(obj instanceof com.provenance.reward.v1.MsgClaimRewardsRequest)) {
      return super.equals(obj);
    }
    com.provenance.reward.v1.MsgClaimRewardsRequest other = (com.provenance.reward.v1.MsgClaimRewardsRequest) obj;

    if (getRewardProgramId()
        != other.getRewardProgramId()) return false;
    if (!getRewardAddress()
        .equals(other.getRewardAddress())) return false;
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
    hash = (37 * hash) + REWARD_PROGRAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRewardProgramId());
    hash = (37 * hash) + REWARD_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getRewardAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.reward.v1.MsgClaimRewardsRequest parseFrom(
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
  public static Builder newBuilder(com.provenance.reward.v1.MsgClaimRewardsRequest prototype) {
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
   * MsgClaimRewardsRequest is the request type for claiming reward from reward program RPC
   * </pre>
   *
   * Protobuf type {@code provenance.reward.v1.MsgClaimRewardsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.reward.v1.MsgClaimRewardsRequest)
      com.provenance.reward.v1.MsgClaimRewardsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.reward.v1.TxProto.internal_static_provenance_reward_v1_MsgClaimRewardsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.reward.v1.TxProto.internal_static_provenance_reward_v1_MsgClaimRewardsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.reward.v1.MsgClaimRewardsRequest.class, com.provenance.reward.v1.MsgClaimRewardsRequest.Builder.class);
    }

    // Construct using com.provenance.reward.v1.MsgClaimRewardsRequest.newBuilder()
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
      rewardProgramId_ = 0L;
      rewardAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.reward.v1.TxProto.internal_static_provenance_reward_v1_MsgClaimRewardsRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.reward.v1.MsgClaimRewardsRequest getDefaultInstanceForType() {
      return com.provenance.reward.v1.MsgClaimRewardsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.reward.v1.MsgClaimRewardsRequest build() {
      com.provenance.reward.v1.MsgClaimRewardsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.reward.v1.MsgClaimRewardsRequest buildPartial() {
      com.provenance.reward.v1.MsgClaimRewardsRequest result = new com.provenance.reward.v1.MsgClaimRewardsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.reward.v1.MsgClaimRewardsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rewardProgramId_ = rewardProgramId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rewardAddress_ = rewardAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.reward.v1.MsgClaimRewardsRequest) {
        return mergeFrom((com.provenance.reward.v1.MsgClaimRewardsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.reward.v1.MsgClaimRewardsRequest other) {
      if (other == com.provenance.reward.v1.MsgClaimRewardsRequest.getDefaultInstance()) return this;
      if (other.getRewardProgramId() != 0L) {
        setRewardProgramId(other.getRewardProgramId());
      }
      if (!other.getRewardAddress().isEmpty()) {
        rewardAddress_ = other.rewardAddress_;
        bitField0_ |= 0x00000002;
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
              rewardProgramId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              rewardAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private long rewardProgramId_ ;
    /**
     * <pre>
     * reward program id to claim rewards.
     * </pre>
     *
     * <code>uint64 reward_program_id = 1 [json_name = "rewardProgramId"];</code>
     * @return The rewardProgramId.
     */
    @java.lang.Override
    public long getRewardProgramId() {
      return rewardProgramId_;
    }
    /**
     * <pre>
     * reward program id to claim rewards.
     * </pre>
     *
     * <code>uint64 reward_program_id = 1 [json_name = "rewardProgramId"];</code>
     * @param value The rewardProgramId to set.
     * @return This builder for chaining.
     */
    public Builder setRewardProgramId(long value) {

      rewardProgramId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * reward program id to claim rewards.
     * </pre>
     *
     * <code>uint64 reward_program_id = 1 [json_name = "rewardProgramId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardProgramId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rewardProgramId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object rewardAddress_ = "";
    /**
     * <pre>
     * reward address and signer of msg to send claimed rewards to.
     * </pre>
     *
     * <code>string reward_address = 2 [json_name = "rewardAddress"];</code>
     * @return The rewardAddress.
     */
    public java.lang.String getRewardAddress() {
      java.lang.Object ref = rewardAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * reward address and signer of msg to send claimed rewards to.
     * </pre>
     *
     * <code>string reward_address = 2 [json_name = "rewardAddress"];</code>
     * @return The bytes for rewardAddress.
     */
    public com.google.protobuf.ByteString
        getRewardAddressBytes() {
      java.lang.Object ref = rewardAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * reward address and signer of msg to send claimed rewards to.
     * </pre>
     *
     * <code>string reward_address = 2 [json_name = "rewardAddress"];</code>
     * @param value The rewardAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * reward address and signer of msg to send claimed rewards to.
     * </pre>
     *
     * <code>string reward_address = 2 [json_name = "rewardAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardAddress() {
      rewardAddress_ = getDefaultInstance().getRewardAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * reward address and signer of msg to send claimed rewards to.
     * </pre>
     *
     * <code>string reward_address = 2 [json_name = "rewardAddress"];</code>
     * @param value The bytes for rewardAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRewardAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardAddress_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:provenance.reward.v1.MsgClaimRewardsRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.reward.v1.MsgClaimRewardsRequest)
  private static final com.provenance.reward.v1.MsgClaimRewardsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.reward.v1.MsgClaimRewardsRequest();
  }

  public static com.provenance.reward.v1.MsgClaimRewardsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgClaimRewardsRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgClaimRewardsRequest>() {
    @java.lang.Override
    public MsgClaimRewardsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgClaimRewardsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgClaimRewardsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.reward.v1.MsgClaimRewardsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

