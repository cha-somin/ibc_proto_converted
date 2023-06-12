// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/erc20/v1/query.proto

package com.evmos.erc20.v1;

/**
 * <pre>
 * QueryTokenPairResponse is the response type for the Query/TokenPair RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code evmos.erc20.v1.QueryTokenPairResponse}
 */
public final class QueryTokenPairResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:evmos.erc20.v1.QueryTokenPairResponse)
    QueryTokenPairResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTokenPairResponse.newBuilder() to construct.
  private QueryTokenPairResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTokenPairResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTokenPairResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.evmos.erc20.v1.QueryProto.internal_static_evmos_erc20_v1_QueryTokenPairResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.evmos.erc20.v1.QueryProto.internal_static_evmos_erc20_v1_QueryTokenPairResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.evmos.erc20.v1.QueryTokenPairResponse.class, com.evmos.erc20.v1.QueryTokenPairResponse.Builder.class);
  }

  public static final int TOKEN_PAIR_FIELD_NUMBER = 1;
  private com.evmos.erc20.v1.TokenPair tokenPair_;
  /**
   * <pre>
   * token_pairs returns the info about a registered token pair for the erc20 module
   * </pre>
   *
   * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokenPair field is set.
   */
  @java.lang.Override
  public boolean hasTokenPair() {
    return tokenPair_ != null;
  }
  /**
   * <pre>
   * token_pairs returns the info about a registered token pair for the erc20 module
   * </pre>
   *
   * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
   * @return The tokenPair.
   */
  @java.lang.Override
  public com.evmos.erc20.v1.TokenPair getTokenPair() {
    return tokenPair_ == null ? com.evmos.erc20.v1.TokenPair.getDefaultInstance() : tokenPair_;
  }
  /**
   * <pre>
   * token_pairs returns the info about a registered token pair for the erc20 module
   * </pre>
   *
   * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.evmos.erc20.v1.TokenPairOrBuilder getTokenPairOrBuilder() {
    return tokenPair_ == null ? com.evmos.erc20.v1.TokenPair.getDefaultInstance() : tokenPair_;
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
    if (tokenPair_ != null) {
      output.writeMessage(1, getTokenPair());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tokenPair_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTokenPair());
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
    if (!(obj instanceof com.evmos.erc20.v1.QueryTokenPairResponse)) {
      return super.equals(obj);
    }
    com.evmos.erc20.v1.QueryTokenPairResponse other = (com.evmos.erc20.v1.QueryTokenPairResponse) obj;

    if (hasTokenPair() != other.hasTokenPair()) return false;
    if (hasTokenPair()) {
      if (!getTokenPair()
          .equals(other.getTokenPair())) return false;
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
    if (hasTokenPair()) {
      hash = (37 * hash) + TOKEN_PAIR_FIELD_NUMBER;
      hash = (53 * hash) + getTokenPair().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.evmos.erc20.v1.QueryTokenPairResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.evmos.erc20.v1.QueryTokenPairResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.erc20.v1.QueryTokenPairResponse parseFrom(
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
  public static Builder newBuilder(com.evmos.erc20.v1.QueryTokenPairResponse prototype) {
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
   * QueryTokenPairResponse is the response type for the Query/TokenPair RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code evmos.erc20.v1.QueryTokenPairResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:evmos.erc20.v1.QueryTokenPairResponse)
      com.evmos.erc20.v1.QueryTokenPairResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.evmos.erc20.v1.QueryProto.internal_static_evmos_erc20_v1_QueryTokenPairResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.evmos.erc20.v1.QueryProto.internal_static_evmos_erc20_v1_QueryTokenPairResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.evmos.erc20.v1.QueryTokenPairResponse.class, com.evmos.erc20.v1.QueryTokenPairResponse.Builder.class);
    }

    // Construct using com.evmos.erc20.v1.QueryTokenPairResponse.newBuilder()
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
      tokenPair_ = null;
      if (tokenPairBuilder_ != null) {
        tokenPairBuilder_.dispose();
        tokenPairBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.evmos.erc20.v1.QueryProto.internal_static_evmos_erc20_v1_QueryTokenPairResponse_descriptor;
    }

    @java.lang.Override
    public com.evmos.erc20.v1.QueryTokenPairResponse getDefaultInstanceForType() {
      return com.evmos.erc20.v1.QueryTokenPairResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.evmos.erc20.v1.QueryTokenPairResponse build() {
      com.evmos.erc20.v1.QueryTokenPairResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.evmos.erc20.v1.QueryTokenPairResponse buildPartial() {
      com.evmos.erc20.v1.QueryTokenPairResponse result = new com.evmos.erc20.v1.QueryTokenPairResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.evmos.erc20.v1.QueryTokenPairResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tokenPair_ = tokenPairBuilder_ == null
            ? tokenPair_
            : tokenPairBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.evmos.erc20.v1.QueryTokenPairResponse) {
        return mergeFrom((com.evmos.erc20.v1.QueryTokenPairResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.evmos.erc20.v1.QueryTokenPairResponse other) {
      if (other == com.evmos.erc20.v1.QueryTokenPairResponse.getDefaultInstance()) return this;
      if (other.hasTokenPair()) {
        mergeTokenPair(other.getTokenPair());
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
                  getTokenPairFieldBuilder().getBuilder(),
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

    private com.evmos.erc20.v1.TokenPair tokenPair_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.evmos.erc20.v1.TokenPair, com.evmos.erc20.v1.TokenPair.Builder, com.evmos.erc20.v1.TokenPairOrBuilder> tokenPairBuilder_;
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     * @return Whether the tokenPair field is set.
     */
    public boolean hasTokenPair() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     * @return The tokenPair.
     */
    public com.evmos.erc20.v1.TokenPair getTokenPair() {
      if (tokenPairBuilder_ == null) {
        return tokenPair_ == null ? com.evmos.erc20.v1.TokenPair.getDefaultInstance() : tokenPair_;
      } else {
        return tokenPairBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTokenPair(com.evmos.erc20.v1.TokenPair value) {
      if (tokenPairBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenPair_ = value;
      } else {
        tokenPairBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTokenPair(
        com.evmos.erc20.v1.TokenPair.Builder builderForValue) {
      if (tokenPairBuilder_ == null) {
        tokenPair_ = builderForValue.build();
      } else {
        tokenPairBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeTokenPair(com.evmos.erc20.v1.TokenPair value) {
      if (tokenPairBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tokenPair_ != null &&
          tokenPair_ != com.evmos.erc20.v1.TokenPair.getDefaultInstance()) {
          getTokenPairBuilder().mergeFrom(value);
        } else {
          tokenPair_ = value;
        }
      } else {
        tokenPairBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearTokenPair() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tokenPair_ = null;
      if (tokenPairBuilder_ != null) {
        tokenPairBuilder_.dispose();
        tokenPairBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     */
    public com.evmos.erc20.v1.TokenPair.Builder getTokenPairBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTokenPairFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     */
    public com.evmos.erc20.v1.TokenPairOrBuilder getTokenPairOrBuilder() {
      if (tokenPairBuilder_ != null) {
        return tokenPairBuilder_.getMessageOrBuilder();
      } else {
        return tokenPair_ == null ?
            com.evmos.erc20.v1.TokenPair.getDefaultInstance() : tokenPair_;
      }
    }
    /**
     * <pre>
     * token_pairs returns the info about a registered token pair for the erc20 module
     * </pre>
     *
     * <code>.evmos.erc20.v1.TokenPair token_pair = 1 [json_name = "tokenPair", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.evmos.erc20.v1.TokenPair, com.evmos.erc20.v1.TokenPair.Builder, com.evmos.erc20.v1.TokenPairOrBuilder> 
        getTokenPairFieldBuilder() {
      if (tokenPairBuilder_ == null) {
        tokenPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.evmos.erc20.v1.TokenPair, com.evmos.erc20.v1.TokenPair.Builder, com.evmos.erc20.v1.TokenPairOrBuilder>(
                getTokenPair(),
                getParentForChildren(),
                isClean());
        tokenPair_ = null;
      }
      return tokenPairBuilder_;
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


    // @@protoc_insertion_point(builder_scope:evmos.erc20.v1.QueryTokenPairResponse)
  }

  // @@protoc_insertion_point(class_scope:evmos.erc20.v1.QueryTokenPairResponse)
  private static final com.evmos.erc20.v1.QueryTokenPairResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.evmos.erc20.v1.QueryTokenPairResponse();
  }

  public static com.evmos.erc20.v1.QueryTokenPairResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTokenPairResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTokenPairResponse>() {
    @java.lang.Override
    public QueryTokenPairResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTokenPairResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTokenPairResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.evmos.erc20.v1.QueryTokenPairResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

