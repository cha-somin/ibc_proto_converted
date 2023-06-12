// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pstake/lspersistence/v1beta1/tx.proto

package com.pstake.lspersistence.v1beta1;

/**
 * Protobuf type {@code pstake.lspersistence.v1beta1.MsgUpdateParams}
 */
public final class MsgUpdateParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pstake.lspersistence.v1beta1.MsgUpdateParams)
    MsgUpdateParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateParams.newBuilder() to construct.
  private MsgUpdateParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateParams() {
    authority_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pstake.lspersistence.v1beta1.TxProto.internal_static_pstake_lspersistence_v1beta1_MsgUpdateParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pstake.lspersistence.v1beta1.TxProto.internal_static_pstake_lspersistence_v1beta1_MsgUpdateParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pstake.lspersistence.v1beta1.MsgUpdateParams.class, com.pstake.lspersistence.v1beta1.MsgUpdateParams.Builder.class);
  }

  public static final int AUTHORITY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object authority_ = "";
  /**
   * <pre>
   * authority is the address that controls the module (defaults to x/gov unless overwritten).
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  @java.lang.Override
  public java.lang.String getAuthority() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authority_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * authority is the address that controls the module (defaults to x/gov unless overwritten).
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthorityBytes() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authority_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private com.pstake.lspersistence.v1beta1.Params params_;
  /**
   * <pre>
   * params defines the x/auth parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines the x/auth parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.pstake.lspersistence.v1beta1.Params getParams() {
    return params_ == null ? com.pstake.lspersistence.v1beta1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines the x/auth parameters to update.
   *
   * NOTE: All parameters must be supplied.
   * </pre>
   *
   * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.pstake.lspersistence.v1beta1.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.pstake.lspersistence.v1beta1.Params.getDefaultInstance() : params_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authority_);
    }
    if (params_ != null) {
      output.writeMessage(2, getParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authority_);
    }
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParams());
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
    if (!(obj instanceof com.pstake.lspersistence.v1beta1.MsgUpdateParams)) {
      return super.equals(obj);
    }
    com.pstake.lspersistence.v1beta1.MsgUpdateParams other = (com.pstake.lspersistence.v1beta1.MsgUpdateParams) obj;

    if (!getAuthority()
        .equals(other.getAuthority())) return false;
    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
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
    hash = (37 * hash) + AUTHORITY_FIELD_NUMBER;
    hash = (53 * hash) + getAuthority().hashCode();
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams parseFrom(
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
  public static Builder newBuilder(com.pstake.lspersistence.v1beta1.MsgUpdateParams prototype) {
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
   * Protobuf type {@code pstake.lspersistence.v1beta1.MsgUpdateParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pstake.lspersistence.v1beta1.MsgUpdateParams)
      com.pstake.lspersistence.v1beta1.MsgUpdateParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pstake.lspersistence.v1beta1.TxProto.internal_static_pstake_lspersistence_v1beta1_MsgUpdateParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pstake.lspersistence.v1beta1.TxProto.internal_static_pstake_lspersistence_v1beta1_MsgUpdateParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pstake.lspersistence.v1beta1.MsgUpdateParams.class, com.pstake.lspersistence.v1beta1.MsgUpdateParams.Builder.class);
    }

    // Construct using com.pstake.lspersistence.v1beta1.MsgUpdateParams.newBuilder()
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
      authority_ = "";
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pstake.lspersistence.v1beta1.TxProto.internal_static_pstake_lspersistence_v1beta1_MsgUpdateParams_descriptor;
    }

    @java.lang.Override
    public com.pstake.lspersistence.v1beta1.MsgUpdateParams getDefaultInstanceForType() {
      return com.pstake.lspersistence.v1beta1.MsgUpdateParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.pstake.lspersistence.v1beta1.MsgUpdateParams build() {
      com.pstake.lspersistence.v1beta1.MsgUpdateParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pstake.lspersistence.v1beta1.MsgUpdateParams buildPartial() {
      com.pstake.lspersistence.v1beta1.MsgUpdateParams result = new com.pstake.lspersistence.v1beta1.MsgUpdateParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.pstake.lspersistence.v1beta1.MsgUpdateParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authority_ = authority_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pstake.lspersistence.v1beta1.MsgUpdateParams) {
        return mergeFrom((com.pstake.lspersistence.v1beta1.MsgUpdateParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pstake.lspersistence.v1beta1.MsgUpdateParams other) {
      if (other == com.pstake.lspersistence.v1beta1.MsgUpdateParams.getDefaultInstance()) return this;
      if (!other.getAuthority().isEmpty()) {
        authority_ = other.authority_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
              authority_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object authority_ = "";
    /**
     * <pre>
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The authority.
     */
    public java.lang.String getAuthority() {
      java.lang.Object ref = authority_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authority_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for authority.
     */
    public com.google.protobuf.ByteString
        getAuthorityBytes() {
      java.lang.Object ref = authority_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authority_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthority(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      authority_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthority() {
      authority_ = getDefaultInstance().getAuthority();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * authority is the address that controls the module (defaults to x/gov unless overwritten).
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      authority_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.pstake.lspersistence.v1beta1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pstake.lspersistence.v1beta1.Params, com.pstake.lspersistence.v1beta1.Params.Builder, com.pstake.lspersistence.v1beta1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.pstake.lspersistence.v1beta1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.pstake.lspersistence.v1beta1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.pstake.lspersistence.v1beta1.Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.pstake.lspersistence.v1beta1.Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.pstake.lspersistence.v1beta1.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          params_ != null &&
          params_ != com.pstake.lspersistence.v1beta1.Params.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000002);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.pstake.lspersistence.v1beta1.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.pstake.lspersistence.v1beta1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.pstake.lspersistence.v1beta1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines the x/auth parameters to update.
     *
     * NOTE: All parameters must be supplied.
     * </pre>
     *
     * <code>.pstake.lspersistence.v1beta1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pstake.lspersistence.v1beta1.Params, com.pstake.lspersistence.v1beta1.Params.Builder, com.pstake.lspersistence.v1beta1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.pstake.lspersistence.v1beta1.Params, com.pstake.lspersistence.v1beta1.Params.Builder, com.pstake.lspersistence.v1beta1.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pstake.lspersistence.v1beta1.MsgUpdateParams)
  }

  // @@protoc_insertion_point(class_scope:pstake.lspersistence.v1beta1.MsgUpdateParams)
  private static final com.pstake.lspersistence.v1beta1.MsgUpdateParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pstake.lspersistence.v1beta1.MsgUpdateParams();
  }

  public static com.pstake.lspersistence.v1beta1.MsgUpdateParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateParams>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateParams>() {
    @java.lang.Override
    public MsgUpdateParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pstake.lspersistence.v1beta1.MsgUpdateParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

