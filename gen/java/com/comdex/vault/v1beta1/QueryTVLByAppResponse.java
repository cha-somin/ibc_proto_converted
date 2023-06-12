// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/query.proto

package com.comdex.vault.v1beta1;

/**
 * Protobuf type {@code comdex.vault.v1beta1.QueryTVLByAppResponse}
 */
public final class QueryTVLByAppResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.vault.v1beta1.QueryTVLByAppResponse)
    QueryTVLByAppResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTVLByAppResponse.newBuilder() to construct.
  private QueryTVLByAppResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTVLByAppResponse() {
    collateralLocked_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTVLByAppResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.vault.v1beta1.QueryProto.internal_static_comdex_vault_v1beta1_QueryTVLByAppResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.vault.v1beta1.QueryProto.internal_static_comdex_vault_v1beta1_QueryTVLByAppResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.vault.v1beta1.QueryTVLByAppResponse.class, com.comdex.vault.v1beta1.QueryTVLByAppResponse.Builder.class);
  }

  public static final int COLLATERAL_LOCKED_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object collateralLocked_ = "";
  /**
   * <code>string collateral_locked = 1 [json_name = "collateralLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_locked&#92;""];</code>
   * @return The collateralLocked.
   */
  @java.lang.Override
  public java.lang.String getCollateralLocked() {
    java.lang.Object ref = collateralLocked_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collateralLocked_ = s;
      return s;
    }
  }
  /**
   * <code>string collateral_locked = 1 [json_name = "collateralLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_locked&#92;""];</code>
   * @return The bytes for collateralLocked.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollateralLockedBytes() {
    java.lang.Object ref = collateralLocked_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collateralLocked_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralLocked_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, collateralLocked_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collateralLocked_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, collateralLocked_);
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
    if (!(obj instanceof com.comdex.vault.v1beta1.QueryTVLByAppResponse)) {
      return super.equals(obj);
    }
    com.comdex.vault.v1beta1.QueryTVLByAppResponse other = (com.comdex.vault.v1beta1.QueryTVLByAppResponse) obj;

    if (!getCollateralLocked()
        .equals(other.getCollateralLocked())) return false;
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
    hash = (37 * hash) + COLLATERAL_LOCKED_FIELD_NUMBER;
    hash = (53 * hash) + getCollateralLocked().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.vault.v1beta1.QueryTVLByAppResponse prototype) {
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
   * Protobuf type {@code comdex.vault.v1beta1.QueryTVLByAppResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.vault.v1beta1.QueryTVLByAppResponse)
      com.comdex.vault.v1beta1.QueryTVLByAppResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.vault.v1beta1.QueryProto.internal_static_comdex_vault_v1beta1_QueryTVLByAppResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.vault.v1beta1.QueryProto.internal_static_comdex_vault_v1beta1_QueryTVLByAppResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.vault.v1beta1.QueryTVLByAppResponse.class, com.comdex.vault.v1beta1.QueryTVLByAppResponse.Builder.class);
    }

    // Construct using com.comdex.vault.v1beta1.QueryTVLByAppResponse.newBuilder()
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
      collateralLocked_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.vault.v1beta1.QueryProto.internal_static_comdex_vault_v1beta1_QueryTVLByAppResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.QueryTVLByAppResponse getDefaultInstanceForType() {
      return com.comdex.vault.v1beta1.QueryTVLByAppResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.QueryTVLByAppResponse build() {
      com.comdex.vault.v1beta1.QueryTVLByAppResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.vault.v1beta1.QueryTVLByAppResponse buildPartial() {
      com.comdex.vault.v1beta1.QueryTVLByAppResponse result = new com.comdex.vault.v1beta1.QueryTVLByAppResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.vault.v1beta1.QueryTVLByAppResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.collateralLocked_ = collateralLocked_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.vault.v1beta1.QueryTVLByAppResponse) {
        return mergeFrom((com.comdex.vault.v1beta1.QueryTVLByAppResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.vault.v1beta1.QueryTVLByAppResponse other) {
      if (other == com.comdex.vault.v1beta1.QueryTVLByAppResponse.getDefaultInstance()) return this;
      if (!other.getCollateralLocked().isEmpty()) {
        collateralLocked_ = other.collateralLocked_;
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
              collateralLocked_ = input.readStringRequireUtf8();
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

    private java.lang.Object collateralLocked_ = "";
    /**
     * <code>string collateral_locked = 1 [json_name = "collateralLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_locked&#92;""];</code>
     * @return The collateralLocked.
     */
    public java.lang.String getCollateralLocked() {
      java.lang.Object ref = collateralLocked_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collateralLocked_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string collateral_locked = 1 [json_name = "collateralLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_locked&#92;""];</code>
     * @return The bytes for collateralLocked.
     */
    public com.google.protobuf.ByteString
        getCollateralLockedBytes() {
      java.lang.Object ref = collateralLocked_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collateralLocked_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string collateral_locked = 1 [json_name = "collateralLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_locked&#92;""];</code>
     * @param value The collateralLocked to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralLocked(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      collateralLocked_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_locked = 1 [json_name = "collateralLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_locked&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearCollateralLocked() {
      collateralLocked_ = getDefaultInstance().getCollateralLocked();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string collateral_locked = 1 [json_name = "collateralLocked", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"collateral_locked&#92;""];</code>
     * @param value The bytes for collateralLocked to set.
     * @return This builder for chaining.
     */
    public Builder setCollateralLockedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      collateralLocked_ = value;
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


    // @@protoc_insertion_point(builder_scope:comdex.vault.v1beta1.QueryTVLByAppResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.vault.v1beta1.QueryTVLByAppResponse)
  private static final com.comdex.vault.v1beta1.QueryTVLByAppResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.vault.v1beta1.QueryTVLByAppResponse();
  }

  public static com.comdex.vault.v1beta1.QueryTVLByAppResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTVLByAppResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTVLByAppResponse>() {
    @java.lang.Override
    public QueryTVLByAppResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTVLByAppResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTVLByAppResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.vault.v1beta1.QueryTVLByAppResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

