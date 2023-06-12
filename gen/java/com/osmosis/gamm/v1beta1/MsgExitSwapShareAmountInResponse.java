// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/tx.proto

package com.osmosis.gamm.v1beta1;

/**
 * Protobuf type {@code osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse}
 */
public final class MsgExitSwapShareAmountInResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse)
    MsgExitSwapShareAmountInResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgExitSwapShareAmountInResponse.newBuilder() to construct.
  private MsgExitSwapShareAmountInResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgExitSwapShareAmountInResponse() {
    tokenOutAmount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgExitSwapShareAmountInResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.class, com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.Builder.class);
  }

  public static final int TOKEN_OUT_AMOUNT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tokenOutAmount_ = "";
  /**
   * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
   * @return The tokenOutAmount.
   */
  @java.lang.Override
  public java.lang.String getTokenOutAmount() {
    java.lang.Object ref = tokenOutAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tokenOutAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
   * @return The bytes for tokenOutAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenOutAmountBytes() {
    java.lang.Object ref = tokenOutAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tokenOutAmount_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenOutAmount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tokenOutAmount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenOutAmount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tokenOutAmount_);
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
    if (!(obj instanceof com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse)) {
      return super.equals(obj);
    }
    com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse other = (com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse) obj;

    if (!getTokenOutAmount()
        .equals(other.getTokenOutAmount())) return false;
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
    hash = (37 * hash) + TOKEN_OUT_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTokenOutAmount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse prototype) {
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
   * Protobuf type {@code osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse)
      com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.class, com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.Builder.class);
    }

    // Construct using com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.newBuilder()
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
      tokenOutAmount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse getDefaultInstanceForType() {
      return com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse build() {
      com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse buildPartial() {
      com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse result = new com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tokenOutAmount_ = tokenOutAmount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse) {
        return mergeFrom((com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse other) {
      if (other == com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.getDefaultInstance()) return this;
      if (!other.getTokenOutAmount().isEmpty()) {
        tokenOutAmount_ = other.tokenOutAmount_;
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
              tokenOutAmount_ = input.readStringRequireUtf8();
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

    private java.lang.Object tokenOutAmount_ = "";
    /**
     * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
     * @return The tokenOutAmount.
     */
    public java.lang.String getTokenOutAmount() {
      java.lang.Object ref = tokenOutAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tokenOutAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
     * @return The bytes for tokenOutAmount.
     */
    public com.google.protobuf.ByteString
        getTokenOutAmountBytes() {
      java.lang.Object ref = tokenOutAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenOutAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
     * @param value The tokenOutAmount to set.
     * @return This builder for chaining.
     */
    public Builder setTokenOutAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tokenOutAmount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenOutAmount() {
      tokenOutAmount_ = getDefaultInstance().getTokenOutAmount();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string token_out_amount = 1 [json_name = "tokenOutAmount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"token_out_amount&#92;""];</code>
     * @param value The bytes for tokenOutAmount to set.
     * @return This builder for chaining.
     */
    public Builder setTokenOutAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tokenOutAmount_ = value;
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


    // @@protoc_insertion_point(builder_scope:osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse)
  private static final com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse();
  }

  public static com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgExitSwapShareAmountInResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgExitSwapShareAmountInResponse>() {
    @java.lang.Override
    public MsgExitSwapShareAmountInResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgExitSwapShareAmountInResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgExitSwapShareAmountInResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

