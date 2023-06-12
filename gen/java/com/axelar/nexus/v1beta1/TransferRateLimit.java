// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/query.proto

package com.axelar.nexus.v1beta1;

/**
 * Protobuf type {@code axelar.nexus.v1beta1.TransferRateLimit}
 */
public final class TransferRateLimit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.nexus.v1beta1.TransferRateLimit)
    TransferRateLimitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferRateLimit.newBuilder() to construct.
  private TransferRateLimit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferRateLimit() {
    limit_ = com.google.protobuf.ByteString.EMPTY;
    incoming_ = com.google.protobuf.ByteString.EMPTY;
    outgoing_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferRateLimit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferRateLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferRateLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.nexus.v1beta1.TransferRateLimit.class, com.axelar.nexus.v1beta1.TransferRateLimit.Builder.class);
  }

  public static final int LIMIT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString limit_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes limit = 1 [json_name = "limit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The limit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLimit() {
    return limit_;
  }

  public static final int WINDOW_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration window_;
  /**
   * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the window field is set.
   */
  @java.lang.Override
  public boolean hasWindow() {
    return window_ != null;
  }
  /**
   * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The window.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getWindow() {
    return window_ == null ? com.google.protobuf.Duration.getDefaultInstance() : window_;
  }
  /**
   * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getWindowOrBuilder() {
    return window_ == null ? com.google.protobuf.Duration.getDefaultInstance() : window_;
  }

  public static final int INCOMING_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString incoming_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes incoming = 3 [json_name = "incoming", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The incoming.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIncoming() {
    return incoming_;
  }

  public static final int OUTGOING_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString outgoing_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes outgoing = 4 [json_name = "outgoing", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The outgoing.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOutgoing() {
    return outgoing_;
  }

  public static final int TIME_LEFT_FIELD_NUMBER = 5;
  private com.google.protobuf.Duration timeLeft_;
  /**
   * <pre>
   * time_left indicates the time left in the rate limit window
   * </pre>
   *
   * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the timeLeft field is set.
   */
  @java.lang.Override
  public boolean hasTimeLeft() {
    return timeLeft_ != null;
  }
  /**
   * <pre>
   * time_left indicates the time left in the rate limit window
   * </pre>
   *
   * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The timeLeft.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTimeLeft() {
    return timeLeft_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeLeft_;
  }
  /**
   * <pre>
   * time_left indicates the time left in the rate limit window
   * </pre>
   *
   * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTimeLeftOrBuilder() {
    return timeLeft_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeLeft_;
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
    if (!limit_.isEmpty()) {
      output.writeBytes(1, limit_);
    }
    if (window_ != null) {
      output.writeMessage(2, getWindow());
    }
    if (!incoming_.isEmpty()) {
      output.writeBytes(3, incoming_);
    }
    if (!outgoing_.isEmpty()) {
      output.writeBytes(4, outgoing_);
    }
    if (timeLeft_ != null) {
      output.writeMessage(5, getTimeLeft());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!limit_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, limit_);
    }
    if (window_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWindow());
    }
    if (!incoming_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, incoming_);
    }
    if (!outgoing_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, outgoing_);
    }
    if (timeLeft_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTimeLeft());
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
    if (!(obj instanceof com.axelar.nexus.v1beta1.TransferRateLimit)) {
      return super.equals(obj);
    }
    com.axelar.nexus.v1beta1.TransferRateLimit other = (com.axelar.nexus.v1beta1.TransferRateLimit) obj;

    if (!getLimit()
        .equals(other.getLimit())) return false;
    if (hasWindow() != other.hasWindow()) return false;
    if (hasWindow()) {
      if (!getWindow()
          .equals(other.getWindow())) return false;
    }
    if (!getIncoming()
        .equals(other.getIncoming())) return false;
    if (!getOutgoing()
        .equals(other.getOutgoing())) return false;
    if (hasTimeLeft() != other.hasTimeLeft()) return false;
    if (hasTimeLeft()) {
      if (!getTimeLeft()
          .equals(other.getTimeLeft())) return false;
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
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit().hashCode();
    if (hasWindow()) {
      hash = (37 * hash) + WINDOW_FIELD_NUMBER;
      hash = (53 * hash) + getWindow().hashCode();
    }
    hash = (37 * hash) + INCOMING_FIELD_NUMBER;
    hash = (53 * hash) + getIncoming().hashCode();
    hash = (37 * hash) + OUTGOING_FIELD_NUMBER;
    hash = (53 * hash) + getOutgoing().hashCode();
    if (hasTimeLeft()) {
      hash = (37 * hash) + TIME_LEFT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeLeft().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.nexus.v1beta1.TransferRateLimit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.nexus.v1beta1.TransferRateLimit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.TransferRateLimit parseFrom(
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
  public static Builder newBuilder(com.axelar.nexus.v1beta1.TransferRateLimit prototype) {
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
   * Protobuf type {@code axelar.nexus.v1beta1.TransferRateLimit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.nexus.v1beta1.TransferRateLimit)
      com.axelar.nexus.v1beta1.TransferRateLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferRateLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferRateLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.nexus.v1beta1.TransferRateLimit.class, com.axelar.nexus.v1beta1.TransferRateLimit.Builder.class);
    }

    // Construct using com.axelar.nexus.v1beta1.TransferRateLimit.newBuilder()
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
      limit_ = com.google.protobuf.ByteString.EMPTY;
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      incoming_ = com.google.protobuf.ByteString.EMPTY;
      outgoing_ = com.google.protobuf.ByteString.EMPTY;
      timeLeft_ = null;
      if (timeLeftBuilder_ != null) {
        timeLeftBuilder_.dispose();
        timeLeftBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferRateLimit_descriptor;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.TransferRateLimit getDefaultInstanceForType() {
      return com.axelar.nexus.v1beta1.TransferRateLimit.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.TransferRateLimit build() {
      com.axelar.nexus.v1beta1.TransferRateLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.TransferRateLimit buildPartial() {
      com.axelar.nexus.v1beta1.TransferRateLimit result = new com.axelar.nexus.v1beta1.TransferRateLimit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.nexus.v1beta1.TransferRateLimit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.window_ = windowBuilder_ == null
            ? window_
            : windowBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.incoming_ = incoming_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.outgoing_ = outgoing_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.timeLeft_ = timeLeftBuilder_ == null
            ? timeLeft_
            : timeLeftBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.nexus.v1beta1.TransferRateLimit) {
        return mergeFrom((com.axelar.nexus.v1beta1.TransferRateLimit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.nexus.v1beta1.TransferRateLimit other) {
      if (other == com.axelar.nexus.v1beta1.TransferRateLimit.getDefaultInstance()) return this;
      if (other.getLimit() != com.google.protobuf.ByteString.EMPTY) {
        setLimit(other.getLimit());
      }
      if (other.hasWindow()) {
        mergeWindow(other.getWindow());
      }
      if (other.getIncoming() != com.google.protobuf.ByteString.EMPTY) {
        setIncoming(other.getIncoming());
      }
      if (other.getOutgoing() != com.google.protobuf.ByteString.EMPTY) {
        setOutgoing(other.getOutgoing());
      }
      if (other.hasTimeLeft()) {
        mergeTimeLeft(other.getTimeLeft());
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
              limit_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getWindowFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              incoming_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              outgoing_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getTimeLeftFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private com.google.protobuf.ByteString limit_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes limit = 1 [json_name = "limit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The limit.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getLimit() {
      return limit_;
    }
    /**
     * <code>bytes limit = 1 [json_name = "limit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      limit_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes limit = 1 [json_name = "limit", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      limit_ = getDefaultInstance().getLimit();
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration window_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> windowBuilder_;
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the window field is set.
     */
    public boolean hasWindow() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The window.
     */
    public com.google.protobuf.Duration getWindow() {
      if (windowBuilder_ == null) {
        return window_ == null ? com.google.protobuf.Duration.getDefaultInstance() : window_;
      } else {
        return windowBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setWindow(com.google.protobuf.Duration value) {
      if (windowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        window_ = value;
      } else {
        windowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setWindow(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (windowBuilder_ == null) {
        window_ = builderForValue.build();
      } else {
        windowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder mergeWindow(com.google.protobuf.Duration value) {
      if (windowBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          window_ != null &&
          window_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getWindowBuilder().mergeFrom(value);
        } else {
          window_ = value;
        }
      } else {
        windowBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearWindow() {
      bitField0_ = (bitField0_ & ~0x00000002);
      window_ = null;
      if (windowBuilder_ != null) {
        windowBuilder_.dispose();
        windowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getWindowBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWindowFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getWindowOrBuilder() {
      if (windowBuilder_ != null) {
        return windowBuilder_.getMessageOrBuilder();
      } else {
        return window_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : window_;
      }
    }
    /**
     * <code>.google.protobuf.Duration window = 2 [json_name = "window", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getWindowFieldBuilder() {
      if (windowBuilder_ == null) {
        windowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getWindow(),
                getParentForChildren(),
                isClean());
        window_ = null;
      }
      return windowBuilder_;
    }

    private com.google.protobuf.ByteString incoming_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes incoming = 3 [json_name = "incoming", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The incoming.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getIncoming() {
      return incoming_;
    }
    /**
     * <code>bytes incoming = 3 [json_name = "incoming", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The incoming to set.
     * @return This builder for chaining.
     */
    public Builder setIncoming(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      incoming_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes incoming = 3 [json_name = "incoming", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncoming() {
      bitField0_ = (bitField0_ & ~0x00000004);
      incoming_ = getDefaultInstance().getIncoming();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString outgoing_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes outgoing = 4 [json_name = "outgoing", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The outgoing.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getOutgoing() {
      return outgoing_;
    }
    /**
     * <code>bytes outgoing = 4 [json_name = "outgoing", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The outgoing to set.
     * @return This builder for chaining.
     */
    public Builder setOutgoing(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      outgoing_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes outgoing = 4 [json_name = "outgoing", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOutgoing() {
      bitField0_ = (bitField0_ & ~0x00000008);
      outgoing_ = getDefaultInstance().getOutgoing();
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration timeLeft_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> timeLeftBuilder_;
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the timeLeft field is set.
     */
    public boolean hasTimeLeft() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return The timeLeft.
     */
    public com.google.protobuf.Duration getTimeLeft() {
      if (timeLeftBuilder_ == null) {
        return timeLeft_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeLeft_;
      } else {
        return timeLeftBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setTimeLeft(com.google.protobuf.Duration value) {
      if (timeLeftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeLeft_ = value;
      } else {
        timeLeftBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder setTimeLeft(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (timeLeftBuilder_ == null) {
        timeLeft_ = builderForValue.build();
      } else {
        timeLeftBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder mergeTimeLeft(com.google.protobuf.Duration value) {
      if (timeLeftBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          timeLeft_ != null &&
          timeLeft_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTimeLeftBuilder().mergeFrom(value);
        } else {
          timeLeft_ = value;
        }
      } else {
        timeLeftBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public Builder clearTimeLeft() {
      bitField0_ = (bitField0_ & ~0x00000010);
      timeLeft_ = null;
      if (timeLeftBuilder_ != null) {
        timeLeftBuilder_.dispose();
        timeLeftBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.Duration.Builder getTimeLeftBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getTimeLeftFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public com.google.protobuf.DurationOrBuilder getTimeLeftOrBuilder() {
      if (timeLeftBuilder_ != null) {
        return timeLeftBuilder_.getMessageOrBuilder();
      } else {
        return timeLeft_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : timeLeft_;
      }
    }
    /**
     * <pre>
     * time_left indicates the time left in the rate limit window
     * </pre>
     *
     * <code>.google.protobuf.Duration time_left = 5 [json_name = "timeLeft", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getTimeLeftFieldBuilder() {
      if (timeLeftBuilder_ == null) {
        timeLeftBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getTimeLeft(),
                getParentForChildren(),
                isClean());
        timeLeft_ = null;
      }
      return timeLeftBuilder_;
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


    // @@protoc_insertion_point(builder_scope:axelar.nexus.v1beta1.TransferRateLimit)
  }

  // @@protoc_insertion_point(class_scope:axelar.nexus.v1beta1.TransferRateLimit)
  private static final com.axelar.nexus.v1beta1.TransferRateLimit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.nexus.v1beta1.TransferRateLimit();
  }

  public static com.axelar.nexus.v1beta1.TransferRateLimit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferRateLimit>
      PARSER = new com.google.protobuf.AbstractParser<TransferRateLimit>() {
    @java.lang.Override
    public TransferRateLimit parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransferRateLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferRateLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.nexus.v1beta1.TransferRateLimit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

