// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/callbacks.proto

package com.stride.stakeibc;

/**
 * Protobuf type {@code stride.stakeibc.Rebalancing}
 */
public final class Rebalancing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.stakeibc.Rebalancing)
    RebalancingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rebalancing.newBuilder() to construct.
  private Rebalancing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rebalancing() {
    srcValidator_ = "";
    dstValidator_ = "";
    amt_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Rebalancing();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_Rebalancing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_Rebalancing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.stakeibc.Rebalancing.class, com.stride.stakeibc.Rebalancing.Builder.class);
  }

  public static final int SRC_VALIDATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object srcValidator_ = "";
  /**
   * <code>string src_validator = 1 [json_name = "srcValidator"];</code>
   * @return The srcValidator.
   */
  @java.lang.Override
  public java.lang.String getSrcValidator() {
    java.lang.Object ref = srcValidator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      srcValidator_ = s;
      return s;
    }
  }
  /**
   * <code>string src_validator = 1 [json_name = "srcValidator"];</code>
   * @return The bytes for srcValidator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSrcValidatorBytes() {
    java.lang.Object ref = srcValidator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      srcValidator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DST_VALIDATOR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dstValidator_ = "";
  /**
   * <code>string dst_validator = 2 [json_name = "dstValidator"];</code>
   * @return The dstValidator.
   */
  @java.lang.Override
  public java.lang.String getDstValidator() {
    java.lang.Object ref = dstValidator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dstValidator_ = s;
      return s;
    }
  }
  /**
   * <code>string dst_validator = 2 [json_name = "dstValidator"];</code>
   * @return The bytes for dstValidator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDstValidatorBytes() {
    java.lang.Object ref = dstValidator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dstValidator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amt_ = "";
  /**
   * <code>string amt = 3 [json_name = "amt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The amt.
   */
  @java.lang.Override
  public java.lang.String getAmt() {
    java.lang.Object ref = amt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amt_ = s;
      return s;
    }
  }
  /**
   * <code>string amt = 3 [json_name = "amt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for amt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmtBytes() {
    java.lang.Object ref = amt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amt_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(srcValidator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, srcValidator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dstValidator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dstValidator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amt_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(srcValidator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, srcValidator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dstValidator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dstValidator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amt_);
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
    if (!(obj instanceof com.stride.stakeibc.Rebalancing)) {
      return super.equals(obj);
    }
    com.stride.stakeibc.Rebalancing other = (com.stride.stakeibc.Rebalancing) obj;

    if (!getSrcValidator()
        .equals(other.getSrcValidator())) return false;
    if (!getDstValidator()
        .equals(other.getDstValidator())) return false;
    if (!getAmt()
        .equals(other.getAmt())) return false;
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
    hash = (37 * hash) + SRC_VALIDATOR_FIELD_NUMBER;
    hash = (53 * hash) + getSrcValidator().hashCode();
    hash = (37 * hash) + DST_VALIDATOR_FIELD_NUMBER;
    hash = (53 * hash) + getDstValidator().hashCode();
    hash = (37 * hash) + AMT_FIELD_NUMBER;
    hash = (53 * hash) + getAmt().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.stakeibc.Rebalancing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.stakeibc.Rebalancing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.stakeibc.Rebalancing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.Rebalancing parseFrom(
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
  public static Builder newBuilder(com.stride.stakeibc.Rebalancing prototype) {
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
   * Protobuf type {@code stride.stakeibc.Rebalancing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.stakeibc.Rebalancing)
      com.stride.stakeibc.RebalancingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_Rebalancing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_Rebalancing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.stakeibc.Rebalancing.class, com.stride.stakeibc.Rebalancing.Builder.class);
    }

    // Construct using com.stride.stakeibc.Rebalancing.newBuilder()
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
      srcValidator_ = "";
      dstValidator_ = "";
      amt_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.stakeibc.CallbacksProto.internal_static_stride_stakeibc_Rebalancing_descriptor;
    }

    @java.lang.Override
    public com.stride.stakeibc.Rebalancing getDefaultInstanceForType() {
      return com.stride.stakeibc.Rebalancing.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.stakeibc.Rebalancing build() {
      com.stride.stakeibc.Rebalancing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.stakeibc.Rebalancing buildPartial() {
      com.stride.stakeibc.Rebalancing result = new com.stride.stakeibc.Rebalancing(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.stakeibc.Rebalancing result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.srcValidator_ = srcValidator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dstValidator_ = dstValidator_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amt_ = amt_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.stakeibc.Rebalancing) {
        return mergeFrom((com.stride.stakeibc.Rebalancing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.stakeibc.Rebalancing other) {
      if (other == com.stride.stakeibc.Rebalancing.getDefaultInstance()) return this;
      if (!other.getSrcValidator().isEmpty()) {
        srcValidator_ = other.srcValidator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDstValidator().isEmpty()) {
        dstValidator_ = other.dstValidator_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAmt().isEmpty()) {
        amt_ = other.amt_;
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
              srcValidator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              dstValidator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              amt_ = input.readStringRequireUtf8();
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

    private java.lang.Object srcValidator_ = "";
    /**
     * <code>string src_validator = 1 [json_name = "srcValidator"];</code>
     * @return The srcValidator.
     */
    public java.lang.String getSrcValidator() {
      java.lang.Object ref = srcValidator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        srcValidator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string src_validator = 1 [json_name = "srcValidator"];</code>
     * @return The bytes for srcValidator.
     */
    public com.google.protobuf.ByteString
        getSrcValidatorBytes() {
      java.lang.Object ref = srcValidator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        srcValidator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string src_validator = 1 [json_name = "srcValidator"];</code>
     * @param value The srcValidator to set.
     * @return This builder for chaining.
     */
    public Builder setSrcValidator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      srcValidator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string src_validator = 1 [json_name = "srcValidator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSrcValidator() {
      srcValidator_ = getDefaultInstance().getSrcValidator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string src_validator = 1 [json_name = "srcValidator"];</code>
     * @param value The bytes for srcValidator to set.
     * @return This builder for chaining.
     */
    public Builder setSrcValidatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      srcValidator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object dstValidator_ = "";
    /**
     * <code>string dst_validator = 2 [json_name = "dstValidator"];</code>
     * @return The dstValidator.
     */
    public java.lang.String getDstValidator() {
      java.lang.Object ref = dstValidator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dstValidator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dst_validator = 2 [json_name = "dstValidator"];</code>
     * @return The bytes for dstValidator.
     */
    public com.google.protobuf.ByteString
        getDstValidatorBytes() {
      java.lang.Object ref = dstValidator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dstValidator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dst_validator = 2 [json_name = "dstValidator"];</code>
     * @param value The dstValidator to set.
     * @return This builder for chaining.
     */
    public Builder setDstValidator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dstValidator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string dst_validator = 2 [json_name = "dstValidator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDstValidator() {
      dstValidator_ = getDefaultInstance().getDstValidator();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string dst_validator = 2 [json_name = "dstValidator"];</code>
     * @param value The bytes for dstValidator to set.
     * @return This builder for chaining.
     */
    public Builder setDstValidatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dstValidator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object amt_ = "";
    /**
     * <code>string amt = 3 [json_name = "amt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The amt.
     */
    public java.lang.String getAmt() {
      java.lang.Object ref = amt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amt = 3 [json_name = "amt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for amt.
     */
    public com.google.protobuf.ByteString
        getAmtBytes() {
      java.lang.Object ref = amt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amt = 3 [json_name = "amt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The amt to set.
     * @return This builder for chaining.
     */
    public Builder setAmt(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string amt = 3 [json_name = "amt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmt() {
      amt_ = getDefaultInstance().getAmt();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string amt = 3 [json_name = "amt", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for amt to set.
     * @return This builder for chaining.
     */
    public Builder setAmtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amt_ = value;
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


    // @@protoc_insertion_point(builder_scope:stride.stakeibc.Rebalancing)
  }

  // @@protoc_insertion_point(class_scope:stride.stakeibc.Rebalancing)
  private static final com.stride.stakeibc.Rebalancing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.stakeibc.Rebalancing();
  }

  public static com.stride.stakeibc.Rebalancing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rebalancing>
      PARSER = new com.google.protobuf.AbstractParser<Rebalancing>() {
    @java.lang.Override
    public Rebalancing parsePartialFrom(
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

  public static com.google.protobuf.Parser<Rebalancing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rebalancing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.stakeibc.Rebalancing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

