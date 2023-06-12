// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/tokenfactory/v1beta1/tx.proto

package com.injective.tokenfactory.v1beta1;

/**
 * <pre>
 * MsgCreateDenomResponse is the return value of MsgCreateDenom
 * It returns the full string of the newly created denom
 * </pre>
 *
 * Protobuf type {@code injective.tokenfactory.v1beta1.MsgCreateDenomResponse}
 */
public final class MsgCreateDenomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.tokenfactory.v1beta1.MsgCreateDenomResponse)
    MsgCreateDenomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateDenomResponse.newBuilder() to construct.
  private MsgCreateDenomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateDenomResponse() {
    newTokenDenom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateDenomResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.tokenfactory.v1beta1.TxProto.internal_static_injective_tokenfactory_v1beta1_MsgCreateDenomResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.tokenfactory.v1beta1.TxProto.internal_static_injective_tokenfactory_v1beta1_MsgCreateDenomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse.class, com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse.Builder.class);
  }

  public static final int NEW_TOKEN_DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newTokenDenom_ = "";
  /**
   * <code>string new_token_denom = 1 [json_name = "newTokenDenom", (.gogoproto.moretags) = "yaml:&#92;"new_token_denom&#92;""];</code>
   * @return The newTokenDenom.
   */
  @java.lang.Override
  public java.lang.String getNewTokenDenom() {
    java.lang.Object ref = newTokenDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newTokenDenom_ = s;
      return s;
    }
  }
  /**
   * <code>string new_token_denom = 1 [json_name = "newTokenDenom", (.gogoproto.moretags) = "yaml:&#92;"new_token_denom&#92;""];</code>
   * @return The bytes for newTokenDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewTokenDenomBytes() {
    java.lang.Object ref = newTokenDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newTokenDenom_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newTokenDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, newTokenDenom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newTokenDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, newTokenDenom_);
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
    if (!(obj instanceof com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse)) {
      return super.equals(obj);
    }
    com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse other = (com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse) obj;

    if (!getNewTokenDenom()
        .equals(other.getNewTokenDenom())) return false;
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
    hash = (37 * hash) + NEW_TOKEN_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getNewTokenDenom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse parseFrom(
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
  public static Builder newBuilder(com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse prototype) {
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
   * MsgCreateDenomResponse is the return value of MsgCreateDenom
   * It returns the full string of the newly created denom
   * </pre>
   *
   * Protobuf type {@code injective.tokenfactory.v1beta1.MsgCreateDenomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.tokenfactory.v1beta1.MsgCreateDenomResponse)
      com.injective.tokenfactory.v1beta1.MsgCreateDenomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.tokenfactory.v1beta1.TxProto.internal_static_injective_tokenfactory_v1beta1_MsgCreateDenomResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.tokenfactory.v1beta1.TxProto.internal_static_injective_tokenfactory_v1beta1_MsgCreateDenomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse.class, com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse.Builder.class);
    }

    // Construct using com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse.newBuilder()
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
      newTokenDenom_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.tokenfactory.v1beta1.TxProto.internal_static_injective_tokenfactory_v1beta1_MsgCreateDenomResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse getDefaultInstanceForType() {
      return com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse build() {
      com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse buildPartial() {
      com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse result = new com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newTokenDenom_ = newTokenDenom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse) {
        return mergeFrom((com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse other) {
      if (other == com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse.getDefaultInstance()) return this;
      if (!other.getNewTokenDenom().isEmpty()) {
        newTokenDenom_ = other.newTokenDenom_;
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
              newTokenDenom_ = input.readStringRequireUtf8();
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

    private java.lang.Object newTokenDenom_ = "";
    /**
     * <code>string new_token_denom = 1 [json_name = "newTokenDenom", (.gogoproto.moretags) = "yaml:&#92;"new_token_denom&#92;""];</code>
     * @return The newTokenDenom.
     */
    public java.lang.String getNewTokenDenom() {
      java.lang.Object ref = newTokenDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newTokenDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string new_token_denom = 1 [json_name = "newTokenDenom", (.gogoproto.moretags) = "yaml:&#92;"new_token_denom&#92;""];</code>
     * @return The bytes for newTokenDenom.
     */
    public com.google.protobuf.ByteString
        getNewTokenDenomBytes() {
      java.lang.Object ref = newTokenDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newTokenDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string new_token_denom = 1 [json_name = "newTokenDenom", (.gogoproto.moretags) = "yaml:&#92;"new_token_denom&#92;""];</code>
     * @param value The newTokenDenom to set.
     * @return This builder for chaining.
     */
    public Builder setNewTokenDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newTokenDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string new_token_denom = 1 [json_name = "newTokenDenom", (.gogoproto.moretags) = "yaml:&#92;"new_token_denom&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewTokenDenom() {
      newTokenDenom_ = getDefaultInstance().getNewTokenDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string new_token_denom = 1 [json_name = "newTokenDenom", (.gogoproto.moretags) = "yaml:&#92;"new_token_denom&#92;""];</code>
     * @param value The bytes for newTokenDenom to set.
     * @return This builder for chaining.
     */
    public Builder setNewTokenDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newTokenDenom_ = value;
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


    // @@protoc_insertion_point(builder_scope:injective.tokenfactory.v1beta1.MsgCreateDenomResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.tokenfactory.v1beta1.MsgCreateDenomResponse)
  private static final com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse();
  }

  public static com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateDenomResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateDenomResponse>() {
    @java.lang.Override
    public MsgCreateDenomResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateDenomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateDenomResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.tokenfactory.v1beta1.MsgCreateDenomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

