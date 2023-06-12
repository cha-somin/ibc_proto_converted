// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/lend.proto

package com.comdex.lend.v1beta1;

/**
 * Protobuf type {@code comdex.lend.v1beta1.Lend_rewards_tracker}
 */
public final class Lend_rewards_tracker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.lend.v1beta1.Lend_rewards_tracker)
    Lend_rewards_trackerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Lend_rewards_tracker.newBuilder() to construct.
  private Lend_rewards_tracker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Lend_rewards_tracker() {
    rewardsAccumulated_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Lend_rewards_tracker();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_Lend_rewards_tracker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_Lend_rewards_tracker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.lend.v1beta1.Lend_rewards_tracker.class, com.comdex.lend.v1beta1.Lend_rewards_tracker.Builder.class);
  }

  public static final int LENDING_ID_FIELD_NUMBER = 1;
  private long lendingId_ = 0L;
  /**
   * <code>uint64 lending_id = 1 [json_name = "lendingId", (.gogoproto.moretags) = "yaml:&#92;"lending_id&#92;""];</code>
   * @return The lendingId.
   */
  @java.lang.Override
  public long getLendingId() {
    return lendingId_;
  }

  public static final int REWARDS_ACCUMULATED_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rewardsAccumulated_ = "";
  /**
   * <code>string rewards_accumulated = 2 [json_name = "rewardsAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
   * @return The rewardsAccumulated.
   */
  @java.lang.Override
  public java.lang.String getRewardsAccumulated() {
    java.lang.Object ref = rewardsAccumulated_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewardsAccumulated_ = s;
      return s;
    }
  }
  /**
   * <code>string rewards_accumulated = 2 [json_name = "rewardsAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
   * @return The bytes for rewardsAccumulated.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRewardsAccumulatedBytes() {
    java.lang.Object ref = rewardsAccumulated_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rewardsAccumulated_ = b;
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
    if (lendingId_ != 0L) {
      output.writeUInt64(1, lendingId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardsAccumulated_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rewardsAccumulated_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lendingId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, lendingId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewardsAccumulated_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rewardsAccumulated_);
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
    if (!(obj instanceof com.comdex.lend.v1beta1.Lend_rewards_tracker)) {
      return super.equals(obj);
    }
    com.comdex.lend.v1beta1.Lend_rewards_tracker other = (com.comdex.lend.v1beta1.Lend_rewards_tracker) obj;

    if (getLendingId()
        != other.getLendingId()) return false;
    if (!getRewardsAccumulated()
        .equals(other.getRewardsAccumulated())) return false;
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
    hash = (37 * hash) + LENDING_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLendingId());
    hash = (37 * hash) + REWARDS_ACCUMULATED_FIELD_NUMBER;
    hash = (53 * hash) + getRewardsAccumulated().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.Lend_rewards_tracker parseFrom(
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
  public static Builder newBuilder(com.comdex.lend.v1beta1.Lend_rewards_tracker prototype) {
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
   * Protobuf type {@code comdex.lend.v1beta1.Lend_rewards_tracker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.lend.v1beta1.Lend_rewards_tracker)
      com.comdex.lend.v1beta1.Lend_rewards_trackerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_Lend_rewards_tracker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_Lend_rewards_tracker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.lend.v1beta1.Lend_rewards_tracker.class, com.comdex.lend.v1beta1.Lend_rewards_tracker.Builder.class);
    }

    // Construct using com.comdex.lend.v1beta1.Lend_rewards_tracker.newBuilder()
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
      lendingId_ = 0L;
      rewardsAccumulated_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.lend.v1beta1.LendProto.internal_static_comdex_lend_v1beta1_Lend_rewards_tracker_descriptor;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.Lend_rewards_tracker getDefaultInstanceForType() {
      return com.comdex.lend.v1beta1.Lend_rewards_tracker.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.Lend_rewards_tracker build() {
      com.comdex.lend.v1beta1.Lend_rewards_tracker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.Lend_rewards_tracker buildPartial() {
      com.comdex.lend.v1beta1.Lend_rewards_tracker result = new com.comdex.lend.v1beta1.Lend_rewards_tracker(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.lend.v1beta1.Lend_rewards_tracker result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lendingId_ = lendingId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rewardsAccumulated_ = rewardsAccumulated_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.lend.v1beta1.Lend_rewards_tracker) {
        return mergeFrom((com.comdex.lend.v1beta1.Lend_rewards_tracker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.lend.v1beta1.Lend_rewards_tracker other) {
      if (other == com.comdex.lend.v1beta1.Lend_rewards_tracker.getDefaultInstance()) return this;
      if (other.getLendingId() != 0L) {
        setLendingId(other.getLendingId());
      }
      if (!other.getRewardsAccumulated().isEmpty()) {
        rewardsAccumulated_ = other.rewardsAccumulated_;
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
              lendingId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              rewardsAccumulated_ = input.readStringRequireUtf8();
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

    private long lendingId_ ;
    /**
     * <code>uint64 lending_id = 1 [json_name = "lendingId", (.gogoproto.moretags) = "yaml:&#92;"lending_id&#92;""];</code>
     * @return The lendingId.
     */
    @java.lang.Override
    public long getLendingId() {
      return lendingId_;
    }
    /**
     * <code>uint64 lending_id = 1 [json_name = "lendingId", (.gogoproto.moretags) = "yaml:&#92;"lending_id&#92;""];</code>
     * @param value The lendingId to set.
     * @return This builder for chaining.
     */
    public Builder setLendingId(long value) {

      lendingId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 lending_id = 1 [json_name = "lendingId", (.gogoproto.moretags) = "yaml:&#92;"lending_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearLendingId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lendingId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object rewardsAccumulated_ = "";
    /**
     * <code>string rewards_accumulated = 2 [json_name = "rewardsAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @return The rewardsAccumulated.
     */
    public java.lang.String getRewardsAccumulated() {
      java.lang.Object ref = rewardsAccumulated_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewardsAccumulated_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rewards_accumulated = 2 [json_name = "rewardsAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @return The bytes for rewardsAccumulated.
     */
    public com.google.protobuf.ByteString
        getRewardsAccumulatedBytes() {
      java.lang.Object ref = rewardsAccumulated_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rewardsAccumulated_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rewards_accumulated = 2 [json_name = "rewardsAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @param value The rewardsAccumulated to set.
     * @return This builder for chaining.
     */
    public Builder setRewardsAccumulated(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rewardsAccumulated_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string rewards_accumulated = 2 [json_name = "rewardsAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardsAccumulated() {
      rewardsAccumulated_ = getDefaultInstance().getRewardsAccumulated();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string rewards_accumulated = 2 [json_name = "rewardsAccumulated", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"interest_accumulated&#92;""];</code>
     * @param value The bytes for rewardsAccumulated to set.
     * @return This builder for chaining.
     */
    public Builder setRewardsAccumulatedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rewardsAccumulated_ = value;
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


    // @@protoc_insertion_point(builder_scope:comdex.lend.v1beta1.Lend_rewards_tracker)
  }

  // @@protoc_insertion_point(class_scope:comdex.lend.v1beta1.Lend_rewards_tracker)
  private static final com.comdex.lend.v1beta1.Lend_rewards_tracker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.lend.v1beta1.Lend_rewards_tracker();
  }

  public static com.comdex.lend.v1beta1.Lend_rewards_tracker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Lend_rewards_tracker>
      PARSER = new com.google.protobuf.AbstractParser<Lend_rewards_tracker>() {
    @java.lang.Override
    public Lend_rewards_tracker parsePartialFrom(
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

  public static com.google.protobuf.Parser<Lend_rewards_tracker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Lend_rewards_tracker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.lend.v1beta1.Lend_rewards_tracker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

