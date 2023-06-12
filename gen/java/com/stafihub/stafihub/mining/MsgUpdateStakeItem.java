// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/mining/tx.proto

package com.stafihub.stafihub.mining;

/**
 * Protobuf type {@code stafihub.stafihub.mining.MsgUpdateStakeItem}
 */
public final class MsgUpdateStakeItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.mining.MsgUpdateStakeItem)
    MsgUpdateStakeItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateStakeItem.newBuilder() to construct.
  private MsgUpdateStakeItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateStakeItem() {
    creator_ = "";
    powerRewardRate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateStakeItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgUpdateStakeItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgUpdateStakeItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.mining.MsgUpdateStakeItem.class, com.stafihub.stafihub.mining.MsgUpdateStakeItem.Builder.class);
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

  public static final int INDEX_FIELD_NUMBER = 2;
  private int index_ = 0;
  /**
   * <code>uint32 index = 2 [json_name = "index", (.gogoproto.jsontag) = "index"];</code>
   * @return The index.
   */
  @java.lang.Override
  public int getIndex() {
    return index_;
  }

  public static final int STAKEPOOLINDEX_FIELD_NUMBER = 3;
  private int stakePoolIndex_ = 0;
  /**
   * <code>uint32 stakePoolIndex = 3 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
   * @return The stakePoolIndex.
   */
  @java.lang.Override
  public int getStakePoolIndex() {
    return stakePoolIndex_;
  }

  public static final int LOCKSECOND_FIELD_NUMBER = 4;
  private long lockSecond_ = 0L;
  /**
   * <code>uint64 lockSecond = 4 [json_name = "lockSecond", (.gogoproto.jsontag) = "lockSecond"];</code>
   * @return The lockSecond.
   */
  @java.lang.Override
  public long getLockSecond() {
    return lockSecond_;
  }

  public static final int POWERREWARDRATE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object powerRewardRate_ = "";
  /**
   * <code>string powerRewardRate = 5 [json_name = "powerRewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/stafihub/stafihub/utils.Dec"];</code>
   * @return The powerRewardRate.
   */
  @java.lang.Override
  public java.lang.String getPowerRewardRate() {
    java.lang.Object ref = powerRewardRate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      powerRewardRate_ = s;
      return s;
    }
  }
  /**
   * <code>string powerRewardRate = 5 [json_name = "powerRewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/stafihub/stafihub/utils.Dec"];</code>
   * @return The bytes for powerRewardRate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPowerRewardRateBytes() {
    java.lang.Object ref = powerRewardRate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      powerRewardRate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLE_FIELD_NUMBER = 6;
  private boolean enable_ = false;
  /**
   * <code>bool enable = 6 [json_name = "enable"];</code>
   * @return The enable.
   */
  @java.lang.Override
  public boolean getEnable() {
    return enable_;
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
    if (index_ != 0) {
      output.writeUInt32(2, index_);
    }
    if (stakePoolIndex_ != 0) {
      output.writeUInt32(3, stakePoolIndex_);
    }
    if (lockSecond_ != 0L) {
      output.writeUInt64(4, lockSecond_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(powerRewardRate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, powerRewardRate_);
    }
    if (enable_ != false) {
      output.writeBool(6, enable_);
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
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, index_);
    }
    if (stakePoolIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, stakePoolIndex_);
    }
    if (lockSecond_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, lockSecond_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(powerRewardRate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, powerRewardRate_);
    }
    if (enable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, enable_);
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
    if (!(obj instanceof com.stafihub.stafihub.mining.MsgUpdateStakeItem)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.mining.MsgUpdateStakeItem other = (com.stafihub.stafihub.mining.MsgUpdateStakeItem) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (getIndex()
        != other.getIndex()) return false;
    if (getStakePoolIndex()
        != other.getStakePoolIndex()) return false;
    if (getLockSecond()
        != other.getLockSecond()) return false;
    if (!getPowerRewardRate()
        .equals(other.getPowerRewardRate())) return false;
    if (getEnable()
        != other.getEnable()) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (37 * hash) + STAKEPOOLINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getStakePoolIndex();
    hash = (37 * hash) + LOCKSECOND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLockSecond());
    hash = (37 * hash) + POWERREWARDRATE_FIELD_NUMBER;
    hash = (53 * hash) + getPowerRewardRate().hashCode();
    hash = (37 * hash) + ENABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnable());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.mining.MsgUpdateStakeItem prototype) {
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
   * Protobuf type {@code stafihub.stafihub.mining.MsgUpdateStakeItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.mining.MsgUpdateStakeItem)
      com.stafihub.stafihub.mining.MsgUpdateStakeItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgUpdateStakeItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgUpdateStakeItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.mining.MsgUpdateStakeItem.class, com.stafihub.stafihub.mining.MsgUpdateStakeItem.Builder.class);
    }

    // Construct using com.stafihub.stafihub.mining.MsgUpdateStakeItem.newBuilder()
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
      index_ = 0;
      stakePoolIndex_ = 0;
      lockSecond_ = 0L;
      powerRewardRate_ = "";
      enable_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.mining.TxProto.internal_static_stafihub_stafihub_mining_MsgUpdateStakeItem_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.MsgUpdateStakeItem getDefaultInstanceForType() {
      return com.stafihub.stafihub.mining.MsgUpdateStakeItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.MsgUpdateStakeItem build() {
      com.stafihub.stafihub.mining.MsgUpdateStakeItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.mining.MsgUpdateStakeItem buildPartial() {
      com.stafihub.stafihub.mining.MsgUpdateStakeItem result = new com.stafihub.stafihub.mining.MsgUpdateStakeItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.mining.MsgUpdateStakeItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.index_ = index_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.stakePoolIndex_ = stakePoolIndex_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.lockSecond_ = lockSecond_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.powerRewardRate_ = powerRewardRate_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.enable_ = enable_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.mining.MsgUpdateStakeItem) {
        return mergeFrom((com.stafihub.stafihub.mining.MsgUpdateStakeItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.mining.MsgUpdateStakeItem other) {
      if (other == com.stafihub.stafihub.mining.MsgUpdateStakeItem.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.getStakePoolIndex() != 0) {
        setStakePoolIndex(other.getStakePoolIndex());
      }
      if (other.getLockSecond() != 0L) {
        setLockSecond(other.getLockSecond());
      }
      if (!other.getPowerRewardRate().isEmpty()) {
        powerRewardRate_ = other.powerRewardRate_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getEnable() != false) {
        setEnable(other.getEnable());
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
              index_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              stakePoolIndex_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              lockSecond_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              powerRewardRate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              enable_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private int index_ ;
    /**
     * <code>uint32 index = 2 [json_name = "index", (.gogoproto.jsontag) = "index"];</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }
    /**
     * <code>uint32 index = 2 [json_name = "index", (.gogoproto.jsontag) = "index"];</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {

      index_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 index = 2 [json_name = "index", (.gogoproto.jsontag) = "index"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      index_ = 0;
      onChanged();
      return this;
    }

    private int stakePoolIndex_ ;
    /**
     * <code>uint32 stakePoolIndex = 3 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
     * @return The stakePoolIndex.
     */
    @java.lang.Override
    public int getStakePoolIndex() {
      return stakePoolIndex_;
    }
    /**
     * <code>uint32 stakePoolIndex = 3 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
     * @param value The stakePoolIndex to set.
     * @return This builder for chaining.
     */
    public Builder setStakePoolIndex(int value) {

      stakePoolIndex_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 stakePoolIndex = 3 [json_name = "stakePoolIndex", (.gogoproto.jsontag) = "stakePoolIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStakePoolIndex() {
      bitField0_ = (bitField0_ & ~0x00000004);
      stakePoolIndex_ = 0;
      onChanged();
      return this;
    }

    private long lockSecond_ ;
    /**
     * <code>uint64 lockSecond = 4 [json_name = "lockSecond", (.gogoproto.jsontag) = "lockSecond"];</code>
     * @return The lockSecond.
     */
    @java.lang.Override
    public long getLockSecond() {
      return lockSecond_;
    }
    /**
     * <code>uint64 lockSecond = 4 [json_name = "lockSecond", (.gogoproto.jsontag) = "lockSecond"];</code>
     * @param value The lockSecond to set.
     * @return This builder for chaining.
     */
    public Builder setLockSecond(long value) {

      lockSecond_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 lockSecond = 4 [json_name = "lockSecond", (.gogoproto.jsontag) = "lockSecond"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLockSecond() {
      bitField0_ = (bitField0_ & ~0x00000008);
      lockSecond_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object powerRewardRate_ = "";
    /**
     * <code>string powerRewardRate = 5 [json_name = "powerRewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/stafihub/stafihub/utils.Dec"];</code>
     * @return The powerRewardRate.
     */
    public java.lang.String getPowerRewardRate() {
      java.lang.Object ref = powerRewardRate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        powerRewardRate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string powerRewardRate = 5 [json_name = "powerRewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/stafihub/stafihub/utils.Dec"];</code>
     * @return The bytes for powerRewardRate.
     */
    public com.google.protobuf.ByteString
        getPowerRewardRateBytes() {
      java.lang.Object ref = powerRewardRate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        powerRewardRate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string powerRewardRate = 5 [json_name = "powerRewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/stafihub/stafihub/utils.Dec"];</code>
     * @param value The powerRewardRate to set.
     * @return This builder for chaining.
     */
    public Builder setPowerRewardRate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      powerRewardRate_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string powerRewardRate = 5 [json_name = "powerRewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/stafihub/stafihub/utils.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPowerRewardRate() {
      powerRewardRate_ = getDefaultInstance().getPowerRewardRate();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string powerRewardRate = 5 [json_name = "powerRewardRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/stafihub/stafihub/utils.Dec"];</code>
     * @param value The bytes for powerRewardRate to set.
     * @return This builder for chaining.
     */
    public Builder setPowerRewardRateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      powerRewardRate_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private boolean enable_ ;
    /**
     * <code>bool enable = 6 [json_name = "enable"];</code>
     * @return The enable.
     */
    @java.lang.Override
    public boolean getEnable() {
      return enable_;
    }
    /**
     * <code>bool enable = 6 [json_name = "enable"];</code>
     * @param value The enable to set.
     * @return This builder for chaining.
     */
    public Builder setEnable(boolean value) {

      enable_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable = 6 [json_name = "enable"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnable() {
      bitField0_ = (bitField0_ & ~0x00000020);
      enable_ = false;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.mining.MsgUpdateStakeItem)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.mining.MsgUpdateStakeItem)
  private static final com.stafihub.stafihub.mining.MsgUpdateStakeItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.mining.MsgUpdateStakeItem();
  }

  public static com.stafihub.stafihub.mining.MsgUpdateStakeItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateStakeItem>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateStakeItem>() {
    @java.lang.Override
    public MsgUpdateStakeItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateStakeItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateStakeItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.mining.MsgUpdateStakeItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

