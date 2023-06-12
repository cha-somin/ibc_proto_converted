// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/mining/tx.proto

package com.stafihub.stafihub.mining;

/**
 * Protobuf type {@code stafihub.stafihub.mining.MsgAddReward}
 */
public final class MsgAddReward extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.mining.MsgAddReward)
    MsgAddRewardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddReward.newBuilder() to construct.
  private MsgAddReward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddReward() {
    creator_ = "";
    addAmount_ = "";
    rewardPerSecond_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAddReward();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgAddReward_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgAddReward_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.mining.MsgAddReward.class, com.stafihub.stafihub.mining.MsgAddReward.Builder.class);
  }

  public static final int CREATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creator_ = "";
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  @java.lang.Override
  public java.lang.String getCreator() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creator_ = s;
      return s;
    }
  }
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatorBytes() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAKEPOOLINDEX_FIELD_NUMBER = 2;
  private int stakePoolIndex_ = 0;
  /**
   * <code>uint32 stakePoolIndex = 2 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
   * @return The stakePoolIndex.
   */
  @java.lang.Override
  public int getStakePoolIndex() {
    return stakePoolIndex_;
  }

  public static final int REWARDPOOLINDEX_FIELD_NUMBER = 3;
  private int rewardPoolIndex_ = 0;
  /**
   * <code>uint32 rewardPoolIndex = 3 [json_name = "rewardPoolIndex", (.gogoproto.jsontag) = "rewardPoolIndex"];</code>
   * @return The rewardPoolIndex.
   */
  @java.lang.Override
  public int getRewardPoolIndex() {
    return rewardPoolIndex_;
  }

  public static final int ADDAMOUNT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object addAmount_ = "";
  /**
   * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The addAmount.
   */
  @java.lang.Override
  public java.lang.String getAddAmount() {
    java.lang.Object ref = addAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for addAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddAmountBytes() {
    java.lang.Object ref = addAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIMESTAMP_FIELD_NUMBER = 5;
  private long startTimestamp_ = 0L;
  /**
   * <code>uint64 startTimestamp = 5 [json_name = "startTimestamp", (.gogoproto.jsontag) = "startTimestamp"];</code>
   * @return The startTimestamp.
   */
  @java.lang.Override
  public long getStartTimestamp() {
    return startTimestamp_;
  }

  public static final int REWARDPERSECOND_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardPerSecond_ = "";
  /**
   * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The rewardPerSecond.
   */
  @java.lang.Override
  public java.lang.String getRewardPerSecond() {
    java.lang.Object ref = rewardPerSecond_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardPerSecond_ = s;
      return s;
    }
  }
  /**
   * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for rewardPerSecond.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardPerSecondBytes() {
    java.lang.Object ref = rewardPerSecond_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardPerSecond_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, creator_);
    }
    if (stakePoolIndex_ != 0) {
      output.writeUInt32(2, stakePoolIndex_);
    }
    if (rewardPoolIndex_ != 0) {
      output.writeUInt32(3, rewardPoolIndex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(addAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, addAmount_);
    }
    if (startTimestamp_ != 0L) {
      output.writeUInt64(5, startTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardPerSecond_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, rewardPerSecond_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, creator_);
    }
    if (stakePoolIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, stakePoolIndex_);
    }
    if (rewardPoolIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, rewardPoolIndex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(addAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, addAmount_);
    }
    if (startTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, startTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardPerSecond_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, rewardPerSecond_);
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
    if (!(obj instanceof com.stafihub.stafihub.mining.MsgAddReward)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.mining.MsgAddReward other = (com.stafihub.stafihub.mining.MsgAddReward) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (getStakePoolIndex()
        != other.getStakePoolIndex()) return false;
    if (getRewardPoolIndex()
        != other.getRewardPoolIndex()) return false;
    if (!getAddAmount()
        .equals(other.getAddAmount())) return false;
    if (getStartTimestamp()
        != other.getStartTimestamp()) return false;
    if (!getRewardPerSecond()
        .equals(other.getRewardPerSecond())) return false;
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
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator().hashCode();
    hash = (37 * hash) + STAKEPOOLINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getStakePoolIndex();
    hash = (37 * hash) + REWARDPOOLINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getRewardPoolIndex();
    hash = (37 * hash) + ADDAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAddAmount().hashCode();
    hash = (37 * hash) + STARTTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTimestamp());
    hash = (37 * hash) + REWARDPERSECOND_FIELD_NUMBER;
    hash = (53 * hash) + getRewardPerSecond().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.mining.MsgAddReward parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.mining.MsgAddReward parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.mining.MsgAddReward parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.mining.MsgAddReward prototype) {
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
   * Protobuf type {@code stafihub.stafihub.mining.MsgAddReward}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.mining.MsgAddReward)
      com.stafihub.stafihub.mining.MsgAddRewardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgAddReward_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgAddReward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.mining.MsgAddReward.class, com.stafihub.stafihub.mining.MsgAddReward.Builder.class);
    }

    // Construct using com.stafihub.stafihub.mining.MsgAddReward.newBuilder()
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
      creator_ = "";
      stakePoolIndex_ = 0;
      rewardPoolIndex_ = 0;
      addAmount_ = "";
      startTimestamp_ = 0L;
      rewardPerSecond_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgAddReward_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.MsgAddReward getDefaultInstanceForType() {
      return com.stafihub.stafihub.mining.MsgAddReward.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.MsgAddReward build() {
      com.stafihub.stafihub.mining.MsgAddReward result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.MsgAddReward buildPartial() {
      com.stafihub.stafihub.mining.MsgAddReward result = new com.stafihub.stafihub.mining.MsgAddReward(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.mining.MsgAddReward result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stakePoolIndex_ = stakePoolIndex_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rewardPoolIndex_ = rewardPoolIndex_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.addAmount_ = addAmount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.startTimestamp_ = startTimestamp_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.rewardPerSecond_ = rewardPerSecond_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.mining.MsgAddReward) {
        return mergeFrom((com.stafihub.stafihub.mining.MsgAddReward)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.mining.MsgAddReward other) {
      if (other == com.stafihub.stafihub.mining.MsgAddReward.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getStakePoolIndex() != 0) {
        setStakePoolIndex(other.getStakePoolIndex());
      }
      if (other.getRewardPoolIndex() != 0) {
        setRewardPoolIndex(other.getRewardPoolIndex());
      }
      if (!other.getAddAmount().isEmpty()) {
        addAmount_ = other.addAmount_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getStartTimestamp() != 0L) {
        setStartTimestamp(other.getStartTimestamp());
      }
      if (!other.getRewardPerSecond().isEmpty()) {
        rewardPerSecond_ = other.rewardPerSecond_;
        bitField0_ |= 0x00000020;
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
            case 10: {
              creator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              stakePoolIndex_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              rewardPoolIndex_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              addAmount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              startTimestamp_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              rewardPerSecond_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private java.lang.Object creator_ = "";
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The creator.
     */
    public java.lang.String getCreator() {
      java.lang.Object ref = creator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The bytes for creator.
     */
    public com.google.protobuf.ByteString
        getCreatorBytes() {
      java.lang.Object ref = creator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreator() {
      creator_ = getDefaultInstance().getCreator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The bytes for creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int stakePoolIndex_ ;
    /**
     * <code>uint32 stakePoolIndex = 2 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
     * @return The stakePoolIndex.
     */
    @java.lang.Override
    public int getStakePoolIndex() {
      return stakePoolIndex_;
    }
    /**
     * <code>uint32 stakePoolIndex = 2 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
     * @param value The stakePoolIndex to set.
     * @return This builder for chaining.
     */
    public Builder setStakePoolIndex(int value) {

      stakePoolIndex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 stakePoolIndex = 2 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStakePoolIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      stakePoolIndex_ = 0;
      onChanged();
      return this;
    }

    private int rewardPoolIndex_ ;
    /**
     * <code>uint32 rewardPoolIndex = 3 [json_name = "rewardPoolIndex", (.gogoproto.jsontag) = "rewardPoolIndex"];</code>
     * @return The rewardPoolIndex.
     */
    @java.lang.Override
    public int getRewardPoolIndex() {
      return rewardPoolIndex_;
    }
    /**
     * <code>uint32 rewardPoolIndex = 3 [json_name = "rewardPoolIndex", (.gogoproto.jsontag) = "rewardPoolIndex"];</code>
     * @param value The rewardPoolIndex to set.
     * @return This builder for chaining.
     */
    public Builder setRewardPoolIndex(int value) {

      rewardPoolIndex_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rewardPoolIndex = 3 [json_name = "rewardPoolIndex", (.gogoproto.jsontag) = "rewardPoolIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardPoolIndex() {
      bitField0_ = (bitField0_ & ~0x00000004);
      rewardPoolIndex_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object addAmount_ = "";
    /**
     * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The addAmount.
     */
    public java.lang.String getAddAmount() {
      java.lang.Object ref = addAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for addAmount.
     */
    public com.google.protobuf.ByteString
        getAddAmountBytes() {
      java.lang.Object ref = addAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The addAmount to set.
     * @return This builder for chaining.
     */
    public Builder setAddAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      addAmount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddAmount() {
      addAmount_ = getDefaultInstance().getAddAmount();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string addAmount = 4 [json_name = "addAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for addAmount to set.
     * @return This builder for chaining.
     */
    public Builder setAddAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      addAmount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long startTimestamp_ ;
    /**
     * <code>uint64 startTimestamp = 5 [json_name = "startTimestamp", (.gogoproto.jsontag) = "startTimestamp"];</code>
     * @return The startTimestamp.
     */
    @java.lang.Override
    public long getStartTimestamp() {
      return startTimestamp_;
    }
    /**
     * <code>uint64 startTimestamp = 5 [json_name = "startTimestamp", (.gogoproto.jsontag) = "startTimestamp"];</code>
     * @param value The startTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimestamp(long value) {

      startTimestamp_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 startTimestamp = 5 [json_name = "startTimestamp", (.gogoproto.jsontag) = "startTimestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000010);
      startTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object rewardPerSecond_ = "";
    /**
     * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The rewardPerSecond.
     */
    public java.lang.String getRewardPerSecond() {
      java.lang.Object ref = rewardPerSecond_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardPerSecond_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for rewardPerSecond.
     */
    public com.google.protobuf.ByteString
        getRewardPerSecondBytes() {
      java.lang.Object ref = rewardPerSecond_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardPerSecond_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The rewardPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setRewardPerSecond(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardPerSecond_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardPerSecond() {
      rewardPerSecond_ = getDefaultInstance().getRewardPerSecond();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string rewardPerSecond = 6 [json_name = "rewardPerSecond", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for rewardPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setRewardPerSecondBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardPerSecond_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.mining.MsgAddReward)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.mining.MsgAddReward)
  private static final com.stafihub.stafihub.mining.MsgAddReward DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.mining.MsgAddReward();
  }

  public static com.stafihub.stafihub.mining.MsgAddReward getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddReward>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddReward>() {
    @java.lang.Override
    public MsgAddReward parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAddReward> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddReward> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.mining.MsgAddReward getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

