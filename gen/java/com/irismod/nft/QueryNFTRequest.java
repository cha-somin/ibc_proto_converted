// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/nft/query.proto

package com.irismod.nft;

/**
 * <pre>
 * QueryNFTRequest is the request type for the Query/NFT RPC method
 * </pre>
 *
 * Protobuf type {@code irismod.nft.QueryNFTRequest}
 */
public final class QueryNFTRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.nft.QueryNFTRequest)
    QueryNFTRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryNFTRequest.newBuilder() to construct.
  private QueryNFTRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryNFTRequest() {
    denomId_ = "";
    tokenId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryNFTRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.nft.QueryProto.internal_static_irismod_nft_QueryNFTRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.nft.QueryProto.internal_static_irismod_nft_QueryNFTRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.nft.QueryNFTRequest.class, com.irismod.nft.QueryNFTRequest.Builder.class);
  }

  public static final int DENOM_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denomId_ = "";
  /**
   * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
   * @return The denomId.
   */
  @java.lang.Override
  public java.lang.String getDenomId() {
    java.lang.Object ref = denomId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denomId_ = s;
      return s;
    }
  }
  /**
   * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
   * @return The bytes for denomId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomIdBytes() {
    java.lang.Object ref = denomId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denomId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tokenId_ = "";
  /**
   * <code>string token_id = 2 [json_name = "tokenId", (.gogoproto.moretags) = "yaml:&#92;"token_id&#92;""];</code>
   * @return The tokenId.
   */
  @java.lang.Override
  public java.lang.String getTokenId() {
    java.lang.Object ref = tokenId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tokenId_ = s;
      return s;
    }
  }
  /**
   * <code>string token_id = 2 [json_name = "tokenId", (.gogoproto.moretags) = "yaml:&#92;"token_id&#92;""];</code>
   * @return The bytes for tokenId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenIdBytes() {
    java.lang.Object ref = tokenId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tokenId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denomId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denomId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tokenId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denomId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denomId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tokenId_);
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
    if (!(obj instanceof com.irismod.nft.QueryNFTRequest)) {
      return super.equals(obj);
    }
    com.irismod.nft.QueryNFTRequest other = (com.irismod.nft.QueryNFTRequest) obj;

    if (!getDenomId()
        .equals(other.getDenomId())) return false;
    if (!getTokenId()
        .equals(other.getTokenId())) return false;
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
    hash = (37 * hash) + DENOM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDenomId().hashCode();
    hash = (37 * hash) + TOKEN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTokenId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.nft.QueryNFTRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.nft.QueryNFTRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.nft.QueryNFTRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.nft.QueryNFTRequest parseFrom(
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
  public static Builder newBuilder(com.irismod.nft.QueryNFTRequest prototype) {
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
   * QueryNFTRequest is the request type for the Query/NFT RPC method
   * </pre>
   *
   * Protobuf type {@code irismod.nft.QueryNFTRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.nft.QueryNFTRequest)
      com.irismod.nft.QueryNFTRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.nft.QueryProto.internal_static_irismod_nft_QueryNFTRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.nft.QueryProto.internal_static_irismod_nft_QueryNFTRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.nft.QueryNFTRequest.class, com.irismod.nft.QueryNFTRequest.Builder.class);
    }

    // Construct using com.irismod.nft.QueryNFTRequest.newBuilder()
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
      denomId_ = "";
      tokenId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.nft.QueryProto.internal_static_irismod_nft_QueryNFTRequest_descriptor;
    }

    @java.lang.Override
    public com.irismod.nft.QueryNFTRequest getDefaultInstanceForType() {
      return com.irismod.nft.QueryNFTRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.nft.QueryNFTRequest build() {
      com.irismod.nft.QueryNFTRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.nft.QueryNFTRequest buildPartial() {
      com.irismod.nft.QueryNFTRequest result = new com.irismod.nft.QueryNFTRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.nft.QueryNFTRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denomId_ = denomId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tokenId_ = tokenId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.nft.QueryNFTRequest) {
        return mergeFrom((com.irismod.nft.QueryNFTRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.nft.QueryNFTRequest other) {
      if (other == com.irismod.nft.QueryNFTRequest.getDefaultInstance()) return this;
      if (!other.getDenomId().isEmpty()) {
        denomId_ = other.denomId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTokenId().isEmpty()) {
        tokenId_ = other.tokenId_;
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
            case 10: {
              denomId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              tokenId_ = input.readStringRequireUtf8();
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

    private java.lang.Object denomId_ = "";
    /**
     * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
     * @return The denomId.
     */
    public java.lang.String getDenomId() {
      java.lang.Object ref = denomId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denomId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
     * @return The bytes for denomId.
     */
    public com.google.protobuf.ByteString
        getDenomIdBytes() {
      java.lang.Object ref = denomId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denomId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
     * @param value The denomId to set.
     * @return This builder for chaining.
     */
    public Builder setDenomId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denomId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenomId() {
      denomId_ = getDefaultInstance().getDenomId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
     * @param value The bytes for denomId to set.
     * @return This builder for chaining.
     */
    public Builder setDenomIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denomId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object tokenId_ = "";
    /**
     * <code>string token_id = 2 [json_name = "tokenId", (.gogoproto.moretags) = "yaml:&#92;"token_id&#92;""];</code>
     * @return The tokenId.
     */
    public java.lang.String getTokenId() {
      java.lang.Object ref = tokenId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tokenId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token_id = 2 [json_name = "tokenId", (.gogoproto.moretags) = "yaml:&#92;"token_id&#92;""];</code>
     * @return The bytes for tokenId.
     */
    public com.google.protobuf.ByteString
        getTokenIdBytes() {
      java.lang.Object ref = tokenId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token_id = 2 [json_name = "tokenId", (.gogoproto.moretags) = "yaml:&#92;"token_id&#92;""];</code>
     * @param value The tokenId to set.
     * @return This builder for chaining.
     */
    public Builder setTokenId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tokenId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string token_id = 2 [json_name = "tokenId", (.gogoproto.moretags) = "yaml:&#92;"token_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenId() {
      tokenId_ = getDefaultInstance().getTokenId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string token_id = 2 [json_name = "tokenId", (.gogoproto.moretags) = "yaml:&#92;"token_id&#92;""];</code>
     * @param value The bytes for tokenId to set.
     * @return This builder for chaining.
     */
    public Builder setTokenIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tokenId_ = value;
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


    // @@protoc_insertion_point(builder_scope:irismod.nft.QueryNFTRequest)
  }

  // @@protoc_insertion_point(class_scope:irismod.nft.QueryNFTRequest)
  private static final com.irismod.nft.QueryNFTRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.nft.QueryNFTRequest();
  }

  public static com.irismod.nft.QueryNFTRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryNFTRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryNFTRequest>() {
    @java.lang.Override
    public QueryNFTRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryNFTRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryNFTRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.nft.QueryNFTRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

