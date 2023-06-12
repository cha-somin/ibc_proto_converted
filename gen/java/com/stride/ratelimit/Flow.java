// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/ratelimit/ratelimit.proto

package com.stride.ratelimit;

/**
 * Protobuf type {@code stride.ratelimit.Flow}
 */
public final class Flow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.ratelimit.Flow)
    FlowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Flow.newBuilder() to construct.
  private Flow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Flow() {
    inflow_ = "";
    outflow_ = "";
    channelValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Flow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.ratelimit.RatelimitProto.internal_static_stride_ratelimit_Flow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.ratelimit.RatelimitProto.internal_static_stride_ratelimit_Flow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.ratelimit.Flow.class, com.stride.ratelimit.Flow.Builder.class);
  }

  public static final int INFLOW_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inflow_ = "";
  /**
   * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The inflow.
   */
  @java.lang.Override
  public java.lang.String getInflow() {
    java.lang.Object ref = inflow_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inflow_ = s;
      return s;
    }
  }
  /**
   * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for inflow.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInflowBytes() {
    java.lang.Object ref = inflow_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inflow_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTFLOW_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object outflow_ = "";
  /**
   * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The outflow.
   */
  @java.lang.Override
  public java.lang.String getOutflow() {
    java.lang.Object ref = outflow_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outflow_ = s;
      return s;
    }
  }
  /**
   * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for outflow.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutflowBytes() {
    java.lang.Object ref = outflow_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outflow_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_VALUE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object channelValue_ = "";
  /**
   * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The channelValue.
   */
  @java.lang.Override
  public java.lang.String getChannelValue() {
    java.lang.Object ref = channelValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelValue_ = s;
      return s;
    }
  }
  /**
   * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for channelValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelValueBytes() {
    java.lang.Object ref = channelValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelValue_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inflow_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inflow_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outflow_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, outflow_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, channelValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inflow_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inflow_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outflow_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, outflow_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, channelValue_);
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
    if (!(obj instanceof com.stride.ratelimit.Flow)) {
      return super.equals(obj);
    }
    com.stride.ratelimit.Flow other = (com.stride.ratelimit.Flow) obj;

    if (!getInflow()
        .equals(other.getInflow())) return false;
    if (!getOutflow()
        .equals(other.getOutflow())) return false;
    if (!getChannelValue()
        .equals(other.getChannelValue())) return false;
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
    hash = (37 * hash) + INFLOW_FIELD_NUMBER;
    hash = (53 * hash) + getInflow().hashCode();
    hash = (37 * hash) + OUTFLOW_FIELD_NUMBER;
    hash = (53 * hash) + getOutflow().hashCode();
    hash = (37 * hash) + CHANNEL_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getChannelValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.ratelimit.Flow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.ratelimit.Flow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.ratelimit.Flow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.ratelimit.Flow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.ratelimit.Flow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.ratelimit.Flow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.ratelimit.Flow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.ratelimit.Flow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.ratelimit.Flow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.ratelimit.Flow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.ratelimit.Flow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.ratelimit.Flow parseFrom(
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
  public static Builder newBuilder(com.stride.ratelimit.Flow prototype) {
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
   * Protobuf type {@code stride.ratelimit.Flow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.ratelimit.Flow)
      com.stride.ratelimit.FlowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.ratelimit.RatelimitProto.internal_static_stride_ratelimit_Flow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.ratelimit.RatelimitProto.internal_static_stride_ratelimit_Flow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.ratelimit.Flow.class, com.stride.ratelimit.Flow.Builder.class);
    }

    // Construct using com.stride.ratelimit.Flow.newBuilder()
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
      inflow_ = "";
      outflow_ = "";
      channelValue_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.ratelimit.RatelimitProto.internal_static_stride_ratelimit_Flow_descriptor;
    }

    @java.lang.Override
    public com.stride.ratelimit.Flow getDefaultInstanceForType() {
      return com.stride.ratelimit.Flow.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.ratelimit.Flow build() {
      com.stride.ratelimit.Flow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.ratelimit.Flow buildPartial() {
      com.stride.ratelimit.Flow result = new com.stride.ratelimit.Flow(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.ratelimit.Flow result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inflow_ = inflow_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.outflow_ = outflow_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.channelValue_ = channelValue_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.ratelimit.Flow) {
        return mergeFrom((com.stride.ratelimit.Flow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.ratelimit.Flow other) {
      if (other == com.stride.ratelimit.Flow.getDefaultInstance()) return this;
      if (!other.getInflow().isEmpty()) {
        inflow_ = other.inflow_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOutflow().isEmpty()) {
        outflow_ = other.outflow_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getChannelValue().isEmpty()) {
        channelValue_ = other.channelValue_;
        bitField0_ |= 0x00000004;
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
              inflow_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              outflow_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              channelValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object inflow_ = "";
    /**
     * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The inflow.
     */
    public java.lang.String getInflow() {
      java.lang.Object ref = inflow_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inflow_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for inflow.
     */
    public com.google.protobuf.ByteString
        getInflowBytes() {
      java.lang.Object ref = inflow_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inflow_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The inflow to set.
     * @return This builder for chaining.
     */
    public Builder setInflow(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inflow_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInflow() {
      inflow_ = getDefaultInstance().getInflow();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string inflow = 1 [json_name = "inflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for inflow to set.
     * @return This builder for chaining.
     */
    public Builder setInflowBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inflow_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object outflow_ = "";
    /**
     * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The outflow.
     */
    public java.lang.String getOutflow() {
      java.lang.Object ref = outflow_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outflow_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for outflow.
     */
    public com.google.protobuf.ByteString
        getOutflowBytes() {
      java.lang.Object ref = outflow_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outflow_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The outflow to set.
     * @return This builder for chaining.
     */
    public Builder setOutflow(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      outflow_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOutflow() {
      outflow_ = getDefaultInstance().getOutflow();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string outflow = 2 [json_name = "outflow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for outflow to set.
     * @return This builder for chaining.
     */
    public Builder setOutflowBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      outflow_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object channelValue_ = "";
    /**
     * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The channelValue.
     */
    public java.lang.String getChannelValue() {
      java.lang.Object ref = channelValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for channelValue.
     */
    public com.google.protobuf.ByteString
        getChannelValueBytes() {
      java.lang.Object ref = channelValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The channelValue to set.
     * @return This builder for chaining.
     */
    public Builder setChannelValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      channelValue_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelValue() {
      channelValue_ = getDefaultInstance().getChannelValue();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string channel_value = 3 [json_name = "channelValue", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for channelValue to set.
     * @return This builder for chaining.
     */
    public Builder setChannelValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      channelValue_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:stride.ratelimit.Flow)
  }

  // @@protoc_insertion_point(class_scope:stride.ratelimit.Flow)
  private static final com.stride.ratelimit.Flow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.ratelimit.Flow();
  }

  public static com.stride.ratelimit.Flow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Flow>
      PARSER = new com.google.protobuf.AbstractParser<Flow>() {
    @java.lang.Override
    public Flow parsePartialFrom(
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

  public static com.google.protobuf.Parser<Flow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Flow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.ratelimit.Flow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

