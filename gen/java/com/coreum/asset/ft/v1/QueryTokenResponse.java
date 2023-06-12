// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/query.proto

package com.coreum.asset.ft.v1;

/**
 * Protobuf type {@code coreum.asset.ft.v1.QueryTokenResponse}
 */
public final class QueryTokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coreum.asset.ft.v1.QueryTokenResponse)
    QueryTokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTokenResponse.newBuilder() to construct.
  private QueryTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTokenResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTokenResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreum.asset.ft.v1.QueryTokenResponse.class, com.coreum.asset.ft.v1.QueryTokenResponse.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  private com.coreum.asset.ft.v1.Token token_;
  /**
   * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
   * @return Whether the token field is set.
   */
  @java.lang.Override
  public boolean hasToken() {
    return token_ != null;
  }
  /**
   * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
   * @return The token.
   */
  @java.lang.Override
  public com.coreum.asset.ft.v1.Token getToken() {
    return token_ == null ? com.coreum.asset.ft.v1.Token.getDefaultInstance() : token_;
  }
  /**
   * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.coreum.asset.ft.v1.TokenOrBuilder getTokenOrBuilder() {
    return token_ == null ? com.coreum.asset.ft.v1.Token.getDefaultInstance() : token_;
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
    if (token_ != null) {
      output.writeMessage(1, getToken());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (token_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getToken());
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
    if (!(obj instanceof com.coreum.asset.ft.v1.QueryTokenResponse)) {
      return super.equals(obj);
    }
    com.coreum.asset.ft.v1.QueryTokenResponse other = (com.coreum.asset.ft.v1.QueryTokenResponse) obj;

    if (hasToken() != other.hasToken()) return false;
    if (hasToken()) {
      if (!getToken()
          .equals(other.getToken())) return false;
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
    if (hasToken()) {
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.coreum.asset.ft.v1.QueryTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.coreum.asset.ft.v1.QueryTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.QueryTokenResponse parseFrom(
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
  public static Builder newBuilder(com.coreum.asset.ft.v1.QueryTokenResponse prototype) {
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
   * Protobuf type {@code coreum.asset.ft.v1.QueryTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coreum.asset.ft.v1.QueryTokenResponse)
      com.coreum.asset.ft.v1.QueryTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreum.asset.ft.v1.QueryTokenResponse.class, com.coreum.asset.ft.v1.QueryTokenResponse.Builder.class);
    }

    // Construct using com.coreum.asset.ft.v1.QueryTokenResponse.newBuilder()
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
      token_ = null;
      if (tokenBuilder_ != null) {
        tokenBuilder_.dispose();
        tokenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreum.asset.ft.v1.QueryProto.internal_static_coreum_asset_ft_v1_QueryTokenResponse_descriptor;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.QueryTokenResponse getDefaultInstanceForType() {
      return com.coreum.asset.ft.v1.QueryTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.QueryTokenResponse build() {
      com.coreum.asset.ft.v1.QueryTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.QueryTokenResponse buildPartial() {
      com.coreum.asset.ft.v1.QueryTokenResponse result = new com.coreum.asset.ft.v1.QueryTokenResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.coreum.asset.ft.v1.QueryTokenResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.token_ = tokenBuilder_ == null
            ? token_
            : tokenBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coreum.asset.ft.v1.QueryTokenResponse) {
        return mergeFrom((com.coreum.asset.ft.v1.QueryTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreum.asset.ft.v1.QueryTokenResponse other) {
      if (other == com.coreum.asset.ft.v1.QueryTokenResponse.getDefaultInstance()) return this;
      if (other.hasToken()) {
        mergeToken(other.getToken());
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
              input.readMessage(
                  getTokenFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.coreum.asset.ft.v1.Token token_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.coreum.asset.ft.v1.Token, com.coreum.asset.ft.v1.Token.Builder, com.coreum.asset.ft.v1.TokenOrBuilder> tokenBuilder_;
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     * @return Whether the token field is set.
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     * @return The token.
     */
    public com.coreum.asset.ft.v1.Token getToken() {
      if (tokenBuilder_ == null) {
        return token_ == null ? com.coreum.asset.ft.v1.Token.getDefaultInstance() : token_;
      } else {
        return tokenBuilder_.getMessage();
      }
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     */
    public Builder setToken(com.coreum.asset.ft.v1.Token value) {
      if (tokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        token_ = value;
      } else {
        tokenBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     */
    public Builder setToken(
        com.coreum.asset.ft.v1.Token.Builder builderForValue) {
      if (tokenBuilder_ == null) {
        token_ = builderForValue.build();
      } else {
        tokenBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeToken(com.coreum.asset.ft.v1.Token value) {
      if (tokenBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          token_ != null &&
          token_ != com.coreum.asset.ft.v1.Token.getDefaultInstance()) {
          getTokenBuilder().mergeFrom(value);
        } else {
          token_ = value;
        }
      } else {
        tokenBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearToken() {
      bitField0_ = (bitField0_ & ~0x00000001);
      token_ = null;
      if (tokenBuilder_ != null) {
        tokenBuilder_.dispose();
        tokenBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     */
    public com.coreum.asset.ft.v1.Token.Builder getTokenBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     */
    public com.coreum.asset.ft.v1.TokenOrBuilder getTokenOrBuilder() {
      if (tokenBuilder_ != null) {
        return tokenBuilder_.getMessageOrBuilder();
      } else {
        return token_ == null ?
            com.coreum.asset.ft.v1.Token.getDefaultInstance() : token_;
      }
    }
    /**
     * <code>.coreum.asset.ft.v1.Token token = 1 [json_name = "token", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.coreum.asset.ft.v1.Token, com.coreum.asset.ft.v1.Token.Builder, com.coreum.asset.ft.v1.TokenOrBuilder> 
        getTokenFieldBuilder() {
      if (tokenBuilder_ == null) {
        tokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.coreum.asset.ft.v1.Token, com.coreum.asset.ft.v1.Token.Builder, com.coreum.asset.ft.v1.TokenOrBuilder>(
                getToken(),
                getParentForChildren(),
                isClean());
        token_ = null;
      }
      return tokenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:coreum.asset.ft.v1.QueryTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:coreum.asset.ft.v1.QueryTokenResponse)
  private static final com.coreum.asset.ft.v1.QueryTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreum.asset.ft.v1.QueryTokenResponse();
  }

  public static com.coreum.asset.ft.v1.QueryTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTokenResponse>() {
    @java.lang.Override
    public QueryTokenResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.coreum.asset.ft.v1.QueryTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

