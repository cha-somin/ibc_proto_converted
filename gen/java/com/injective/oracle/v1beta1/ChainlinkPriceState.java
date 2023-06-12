// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/oracle.proto

package com.injective.oracle.v1beta1;

/**
 * Protobuf type {@code injective.oracle.v1beta1.ChainlinkPriceState}
 */
public final class ChainlinkPriceState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.oracle.v1beta1.ChainlinkPriceState)
    ChainlinkPriceStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChainlinkPriceState.newBuilder() to construct.
  private ChainlinkPriceState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChainlinkPriceState() {
    feedId_ = "";
    answer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChainlinkPriceState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.oracle.v1beta1.OracleProto.internal_static_injective_oracle_v1beta1_ChainlinkPriceState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.oracle.v1beta1.OracleProto.internal_static_injective_oracle_v1beta1_ChainlinkPriceState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.oracle.v1beta1.ChainlinkPriceState.class, com.injective.oracle.v1beta1.ChainlinkPriceState.Builder.class);
  }

  public static final int FEED_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object feedId_ = "";
  /**
   * <code>string feed_id = 1 [json_name = "feedId"];</code>
   * @return The feedId.
   */
  @java.lang.Override
  public java.lang.String getFeedId() {
    java.lang.Object ref = feedId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feedId_ = s;
      return s;
    }
  }
  /**
   * <code>string feed_id = 1 [json_name = "feedId"];</code>
   * @return The bytes for feedId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeedIdBytes() {
    java.lang.Object ref = feedId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feedId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANSWER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object answer_ = "";
  /**
   * <code>string answer = 2 [json_name = "answer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The answer.
   */
  @java.lang.Override
  public java.lang.String getAnswer() {
    java.lang.Object ref = answer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      answer_ = s;
      return s;
    }
  }
  /**
   * <code>string answer = 2 [json_name = "answer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for answer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAnswerBytes() {
    java.lang.Object ref = answer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      answer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_ = 0L;
  /**
   * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int PRICE_STATE_FIELD_NUMBER = 4;
  private com.injective.oracle.v1beta1.PriceState priceState_;
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
   * @return Whether the priceState field is set.
   */
  @java.lang.Override
  public boolean hasPriceState() {
    return priceState_ != null;
  }
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
   * @return The priceState.
   */
  @java.lang.Override
  public com.injective.oracle.v1beta1.PriceState getPriceState() {
    return priceState_ == null ? com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
  }
  /**
   * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.injective.oracle.v1beta1.PriceStateOrBuilder getPriceStateOrBuilder() {
    return priceState_ == null ? com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feedId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, feedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(answer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, answer_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(3, timestamp_);
    }
    if (priceState_ != null) {
      output.writeMessage(4, getPriceState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feedId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, feedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(answer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, answer_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, timestamp_);
    }
    if (priceState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPriceState());
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
    if (!(obj instanceof com.injective.oracle.v1beta1.ChainlinkPriceState)) {
      return super.equals(obj);
    }
    com.injective.oracle.v1beta1.ChainlinkPriceState other = (com.injective.oracle.v1beta1.ChainlinkPriceState) obj;

    if (!getFeedId()
        .equals(other.getFeedId())) return false;
    if (!getAnswer()
        .equals(other.getAnswer())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (hasPriceState() != other.hasPriceState()) return false;
    if (hasPriceState()) {
      if (!getPriceState()
          .equals(other.getPriceState())) return false;
    }
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
    hash = (37 * hash) + FEED_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFeedId().hashCode();
    hash = (37 * hash) + ANSWER_FIELD_NUMBER;
    hash = (53 * hash) + getAnswer().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    if (hasPriceState()) {
      hash = (37 * hash) + PRICE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getPriceState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.ChainlinkPriceState parseFrom(
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
  public static Builder newBuilder(com.injective.oracle.v1beta1.ChainlinkPriceState prototype) {
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
   * Protobuf type {@code injective.oracle.v1beta1.ChainlinkPriceState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.oracle.v1beta1.ChainlinkPriceState)
      com.injective.oracle.v1beta1.ChainlinkPriceStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.oracle.v1beta1.OracleProto.internal_static_injective_oracle_v1beta1_ChainlinkPriceState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.oracle.v1beta1.OracleProto.internal_static_injective_oracle_v1beta1_ChainlinkPriceState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.oracle.v1beta1.ChainlinkPriceState.class, com.injective.oracle.v1beta1.ChainlinkPriceState.Builder.class);
    }

    // Construct using com.injective.oracle.v1beta1.ChainlinkPriceState.newBuilder()
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
      feedId_ = "";
      answer_ = "";
      timestamp_ = 0L;
      priceState_ = null;
      if (priceStateBuilder_ != null) {
        priceStateBuilder_.dispose();
        priceStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.oracle.v1beta1.OracleProto.internal_static_injective_oracle_v1beta1_ChainlinkPriceState_descriptor;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.ChainlinkPriceState getDefaultInstanceForType() {
      return com.injective.oracle.v1beta1.ChainlinkPriceState.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.ChainlinkPriceState build() {
      com.injective.oracle.v1beta1.ChainlinkPriceState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.ChainlinkPriceState buildPartial() {
      com.injective.oracle.v1beta1.ChainlinkPriceState result = new com.injective.oracle.v1beta1.ChainlinkPriceState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.oracle.v1beta1.ChainlinkPriceState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.feedId_ = feedId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.answer_ = answer_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.priceState_ = priceStateBuilder_ == null
            ? priceState_
            : priceStateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.oracle.v1beta1.ChainlinkPriceState) {
        return mergeFrom((com.injective.oracle.v1beta1.ChainlinkPriceState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.oracle.v1beta1.ChainlinkPriceState other) {
      if (other == com.injective.oracle.v1beta1.ChainlinkPriceState.getDefaultInstance()) return this;
      if (!other.getFeedId().isEmpty()) {
        feedId_ = other.feedId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAnswer().isEmpty()) {
        answer_ = other.answer_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.hasPriceState()) {
        mergePriceState(other.getPriceState());
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
              feedId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              answer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              timestamp_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getPriceStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object feedId_ = "";
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @return The feedId.
     */
    public java.lang.String getFeedId() {
      java.lang.Object ref = feedId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feedId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @return The bytes for feedId.
     */
    public com.google.protobuf.ByteString
        getFeedIdBytes() {
      java.lang.Object ref = feedId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feedId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @param value The feedId to set.
     * @return This builder for chaining.
     */
    public Builder setFeedId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      feedId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedId() {
      feedId_ = getDefaultInstance().getFeedId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @param value The bytes for feedId to set.
     * @return This builder for chaining.
     */
    public Builder setFeedIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      feedId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object answer_ = "";
    /**
     * <code>string answer = 2 [json_name = "answer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The answer.
     */
    public java.lang.String getAnswer() {
      java.lang.Object ref = answer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        answer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string answer = 2 [json_name = "answer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for answer.
     */
    public com.google.protobuf.ByteString
        getAnswerBytes() {
      java.lang.Object ref = answer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        answer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string answer = 2 [json_name = "answer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The answer to set.
     * @return This builder for chaining.
     */
    public Builder setAnswer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      answer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string answer = 2 [json_name = "answer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswer() {
      answer_ = getDefaultInstance().getAnswer();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string answer = 2 [json_name = "answer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @param value The bytes for answer to set.
     * @return This builder for chaining.
     */
    public Builder setAnswerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      answer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.injective.oracle.v1beta1.PriceState priceState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.oracle.v1beta1.PriceState, com.injective.oracle.v1beta1.PriceState.Builder, com.injective.oracle.v1beta1.PriceStateOrBuilder> priceStateBuilder_;
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     * @return Whether the priceState field is set.
     */
    public boolean hasPriceState() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     * @return The priceState.
     */
    public com.injective.oracle.v1beta1.PriceState getPriceState() {
      if (priceStateBuilder_ == null) {
        return priceState_ == null ? com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
      } else {
        return priceStateBuilder_.getMessage();
      }
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPriceState(com.injective.oracle.v1beta1.PriceState value) {
      if (priceStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        priceState_ = value;
      } else {
        priceStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPriceState(
        com.injective.oracle.v1beta1.PriceState.Builder builderForValue) {
      if (priceStateBuilder_ == null) {
        priceState_ = builderForValue.build();
      } else {
        priceStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergePriceState(com.injective.oracle.v1beta1.PriceState value) {
      if (priceStateBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          priceState_ != null &&
          priceState_ != com.injective.oracle.v1beta1.PriceState.getDefaultInstance()) {
          getPriceStateBuilder().mergeFrom(value);
        } else {
          priceState_ = value;
        }
      } else {
        priceStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearPriceState() {
      bitField0_ = (bitField0_ & ~0x00000008);
      priceState_ = null;
      if (priceStateBuilder_ != null) {
        priceStateBuilder_.dispose();
        priceStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     */
    public com.injective.oracle.v1beta1.PriceState.Builder getPriceStateBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getPriceStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     */
    public com.injective.oracle.v1beta1.PriceStateOrBuilder getPriceStateOrBuilder() {
      if (priceStateBuilder_ != null) {
        return priceStateBuilder_.getMessageOrBuilder();
      } else {
        return priceState_ == null ?
            com.injective.oracle.v1beta1.PriceState.getDefaultInstance() : priceState_;
      }
    }
    /**
     * <code>.injective.oracle.v1beta1.PriceState price_state = 4 [json_name = "priceState", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.oracle.v1beta1.PriceState, com.injective.oracle.v1beta1.PriceState.Builder, com.injective.oracle.v1beta1.PriceStateOrBuilder> 
        getPriceStateFieldBuilder() {
      if (priceStateBuilder_ == null) {
        priceStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.oracle.v1beta1.PriceState, com.injective.oracle.v1beta1.PriceState.Builder, com.injective.oracle.v1beta1.PriceStateOrBuilder>(
                getPriceState(),
                getParentForChildren(),
                isClean());
        priceState_ = null;
      }
      return priceStateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.oracle.v1beta1.ChainlinkPriceState)
  }

  // @@protoc_insertion_point(class_scope:injective.oracle.v1beta1.ChainlinkPriceState)
  private static final com.injective.oracle.v1beta1.ChainlinkPriceState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.oracle.v1beta1.ChainlinkPriceState();
  }

  public static com.injective.oracle.v1beta1.ChainlinkPriceState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChainlinkPriceState>
      PARSER = new com.google.protobuf.AbstractParser<ChainlinkPriceState>() {
    @java.lang.Override
    public ChainlinkPriceState parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChainlinkPriceState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChainlinkPriceState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.oracle.v1beta1.ChainlinkPriceState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

