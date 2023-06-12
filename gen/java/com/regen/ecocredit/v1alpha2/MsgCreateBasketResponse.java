// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/tx.proto

package com.regen.ecocredit.v1alpha2;

/**
 * <pre>
 * MsgCreateBasketResponse is the Msg/CreateBasket response type.
 * </pre>
 *
 * Protobuf type {@code regen.ecocredit.v1alpha2.MsgCreateBasketResponse}
 */
public final class MsgCreateBasketResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.ecocredit.v1alpha2.MsgCreateBasketResponse)
    MsgCreateBasketResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateBasketResponse.newBuilder() to construct.
  private MsgCreateBasketResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateBasketResponse() {
    basketDenom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateBasketResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgCreateBasketResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgCreateBasketResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.class, com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.Builder.class);
  }

  public static final int BASKET_DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object basketDenom_ = "";
  /**
   * <pre>
   * basket_denom is the unique denomination ID of the newly created basket.
   * </pre>
   *
   * <code>string basket_denom = 1 [json_name = "basketDenom"];</code>
   * @return The basketDenom.
   */
  @java.lang.Override
  public java.lang.String getBasketDenom() {
    java.lang.Object ref = basketDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      basketDenom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * basket_denom is the unique denomination ID of the newly created basket.
   * </pre>
   *
   * <code>string basket_denom = 1 [json_name = "basketDenom"];</code>
   * @return The bytes for basketDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBasketDenomBytes() {
    java.lang.Object ref = basketDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      basketDenom_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(basketDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, basketDenom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(basketDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, basketDenom_);
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
    if (!(obj instanceof com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse)) {
      return super.equals(obj);
    }
    com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse other = (com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse) obj;

    if (!getBasketDenom()
        .equals(other.getBasketDenom())) return false;
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
    hash = (37 * hash) + BASKET_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getBasketDenom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse parseFrom(
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
  public static Builder newBuilder(com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse prototype) {
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
   * MsgCreateBasketResponse is the Msg/CreateBasket response type.
   * </pre>
   *
   * Protobuf type {@code regen.ecocredit.v1alpha2.MsgCreateBasketResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.ecocredit.v1alpha2.MsgCreateBasketResponse)
      com.regen.ecocredit.v1alpha2.MsgCreateBasketResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgCreateBasketResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgCreateBasketResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.class, com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.Builder.class);
    }

    // Construct using com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.newBuilder()
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
      basketDenom_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgCreateBasketResponse_descriptor;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse getDefaultInstanceForType() {
      return com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse build() {
      com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse buildPartial() {
      com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse result = new com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.basketDenom_ = basketDenom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse) {
        return mergeFrom((com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse other) {
      if (other == com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.getDefaultInstance()) return this;
      if (!other.getBasketDenom().isEmpty()) {
        basketDenom_ = other.basketDenom_;
        bitField0_ |= 0x00000001;
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
              basketDenom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object basketDenom_ = "";
    /**
     * <pre>
     * basket_denom is the unique denomination ID of the newly created basket.
     * </pre>
     *
     * <code>string basket_denom = 1 [json_name = "basketDenom"];</code>
     * @return The basketDenom.
     */
    public java.lang.String getBasketDenom() {
      java.lang.Object ref = basketDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        basketDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * basket_denom is the unique denomination ID of the newly created basket.
     * </pre>
     *
     * <code>string basket_denom = 1 [json_name = "basketDenom"];</code>
     * @return The bytes for basketDenom.
     */
    public com.google.protobuf.ByteString
        getBasketDenomBytes() {
      java.lang.Object ref = basketDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        basketDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * basket_denom is the unique denomination ID of the newly created basket.
     * </pre>
     *
     * <code>string basket_denom = 1 [json_name = "basketDenom"];</code>
     * @param value The basketDenom to set.
     * @return This builder for chaining.
     */
    public Builder setBasketDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      basketDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * basket_denom is the unique denomination ID of the newly created basket.
     * </pre>
     *
     * <code>string basket_denom = 1 [json_name = "basketDenom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBasketDenom() {
      basketDenom_ = getDefaultInstance().getBasketDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * basket_denom is the unique denomination ID of the newly created basket.
     * </pre>
     *
     * <code>string basket_denom = 1 [json_name = "basketDenom"];</code>
     * @param value The bytes for basketDenom to set.
     * @return This builder for chaining.
     */
    public Builder setBasketDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      basketDenom_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:regen.ecocredit.v1alpha2.MsgCreateBasketResponse)
  }

  // @@protoc_insertion_point(class_scope:regen.ecocredit.v1alpha2.MsgCreateBasketResponse)
  private static final com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse();
  }

  public static com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateBasketResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateBasketResponse>() {
    @java.lang.Override
    public MsgCreateBasketResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateBasketResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateBasketResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

