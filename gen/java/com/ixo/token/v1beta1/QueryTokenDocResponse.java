// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/token/v1beta1/query.proto

package com.ixo.token.v1beta1;

/**
 * Protobuf type {@code ixo.token.v1beta1.QueryTokenDocResponse}
 */
public final class QueryTokenDocResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.token.v1beta1.QueryTokenDocResponse)
    QueryTokenDocResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTokenDocResponse.newBuilder() to construct.
  private QueryTokenDocResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTokenDocResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTokenDocResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.token.v1beta1.QueryProto.internal_static_ixo_token_v1beta1_QueryTokenDocResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.token.v1beta1.QueryProto.internal_static_ixo_token_v1beta1_QueryTokenDocResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.token.v1beta1.QueryTokenDocResponse.class, com.ixo.token.v1beta1.QueryTokenDocResponse.Builder.class);
  }

  public static final int TOKENDOC_FIELD_NUMBER = 1;
  private com.ixo.token.v1beta1.Token tokenDoc_;
  /**
   * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
   * @return Whether the tokenDoc field is set.
   */
  @java.lang.Override
  public boolean hasTokenDoc() {
    return tokenDoc_ != null;
  }
  /**
   * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
   * @return The tokenDoc.
   */
  @java.lang.Override
  public com.ixo.token.v1beta1.Token getTokenDoc() {
    return tokenDoc_ == null ? com.ixo.token.v1beta1.Token.getDefaultInstance() : tokenDoc_;
  }
  /**
   * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ixo.token.v1beta1.TokenOrBuilder getTokenDocOrBuilder() {
    return tokenDoc_ == null ? com.ixo.token.v1beta1.Token.getDefaultInstance() : tokenDoc_;
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
    if (tokenDoc_ != null) {
      output.writeMessage(1, getTokenDoc());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tokenDoc_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTokenDoc());
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
    if (!(obj instanceof com.ixo.token.v1beta1.QueryTokenDocResponse)) {
      return super.equals(obj);
    }
    com.ixo.token.v1beta1.QueryTokenDocResponse other = (com.ixo.token.v1beta1.QueryTokenDocResponse) obj;

    if (hasTokenDoc() != other.hasTokenDoc()) return false;
    if (hasTokenDoc()) {
      if (!getTokenDoc()
          .equals(other.getTokenDoc())) return false;
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
    if (hasTokenDoc()) {
      hash = (37 * hash) + TOKENDOC_FIELD_NUMBER;
      hash = (53 * hash) + getTokenDoc().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.token.v1beta1.QueryTokenDocResponse parseFrom(
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
  public static Builder newBuilder(com.ixo.token.v1beta1.QueryTokenDocResponse prototype) {
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
   * Protobuf type {@code ixo.token.v1beta1.QueryTokenDocResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.token.v1beta1.QueryTokenDocResponse)
      com.ixo.token.v1beta1.QueryTokenDocResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.token.v1beta1.QueryProto.internal_static_ixo_token_v1beta1_QueryTokenDocResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.token.v1beta1.QueryProto.internal_static_ixo_token_v1beta1_QueryTokenDocResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.token.v1beta1.QueryTokenDocResponse.class, com.ixo.token.v1beta1.QueryTokenDocResponse.Builder.class);
    }

    // Construct using com.ixo.token.v1beta1.QueryTokenDocResponse.newBuilder()
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
      tokenDoc_ = null;
      if (tokenDocBuilder_ != null) {
        tokenDocBuilder_.dispose();
        tokenDocBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.token.v1beta1.QueryProto.internal_static_ixo_token_v1beta1_QueryTokenDocResponse_descriptor;
    }

    @java.lang.Override
    public com.ixo.token.v1beta1.QueryTokenDocResponse getDefaultInstanceForType() {
      return com.ixo.token.v1beta1.QueryTokenDocResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.token.v1beta1.QueryTokenDocResponse build() {
      com.ixo.token.v1beta1.QueryTokenDocResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.token.v1beta1.QueryTokenDocResponse buildPartial() {
      com.ixo.token.v1beta1.QueryTokenDocResponse result = new com.ixo.token.v1beta1.QueryTokenDocResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ixo.token.v1beta1.QueryTokenDocResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tokenDoc_ = tokenDocBuilder_ == null
            ? tokenDoc_
            : tokenDocBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.token.v1beta1.QueryTokenDocResponse) {
        return mergeFrom((com.ixo.token.v1beta1.QueryTokenDocResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.token.v1beta1.QueryTokenDocResponse other) {
      if (other == com.ixo.token.v1beta1.QueryTokenDocResponse.getDefaultInstance()) return this;
      if (other.hasTokenDoc()) {
        mergeTokenDoc(other.getTokenDoc());
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
                  getTokenDocFieldBuilder().getBuilder(),
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

    private com.ixo.token.v1beta1.Token tokenDoc_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.token.v1beta1.Token, com.ixo.token.v1beta1.Token.Builder, com.ixo.token.v1beta1.TokenOrBuilder> tokenDocBuilder_;
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     * @return Whether the tokenDoc field is set.
     */
    public boolean hasTokenDoc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     * @return The tokenDoc.
     */
    public com.ixo.token.v1beta1.Token getTokenDoc() {
      if (tokenDocBuilder_ == null) {
        return tokenDoc_ == null ? com.ixo.token.v1beta1.Token.getDefaultInstance() : tokenDoc_;
      } else {
        return tokenDocBuilder_.getMessage();
      }
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTokenDoc(com.ixo.token.v1beta1.Token value) {
      if (tokenDocBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenDoc_ = value;
      } else {
        tokenDocBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     */
    public Builder setTokenDoc(
        com.ixo.token.v1beta1.Token.Builder builderForValue) {
      if (tokenDocBuilder_ == null) {
        tokenDoc_ = builderForValue.build();
      } else {
        tokenDocBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeTokenDoc(com.ixo.token.v1beta1.Token value) {
      if (tokenDocBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tokenDoc_ != null &&
          tokenDoc_ != com.ixo.token.v1beta1.Token.getDefaultInstance()) {
          getTokenDocBuilder().mergeFrom(value);
        } else {
          tokenDoc_ = value;
        }
      } else {
        tokenDocBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearTokenDoc() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tokenDoc_ = null;
      if (tokenDocBuilder_ != null) {
        tokenDocBuilder_.dispose();
        tokenDocBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     */
    public com.ixo.token.v1beta1.Token.Builder getTokenDocBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTokenDocFieldBuilder().getBuilder();
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     */
    public com.ixo.token.v1beta1.TokenOrBuilder getTokenDocOrBuilder() {
      if (tokenDocBuilder_ != null) {
        return tokenDocBuilder_.getMessageOrBuilder();
      } else {
        return tokenDoc_ == null ?
            com.ixo.token.v1beta1.Token.getDefaultInstance() : tokenDoc_;
      }
    }
    /**
     * <code>.ixo.token.v1beta1.Token tokenDoc = 1 [json_name = "tokenDoc", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ixo.token.v1beta1.Token, com.ixo.token.v1beta1.Token.Builder, com.ixo.token.v1beta1.TokenOrBuilder> 
        getTokenDocFieldBuilder() {
      if (tokenDocBuilder_ == null) {
        tokenDocBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ixo.token.v1beta1.Token, com.ixo.token.v1beta1.Token.Builder, com.ixo.token.v1beta1.TokenOrBuilder>(
                getTokenDoc(),
                getParentForChildren(),
                isClean());
        tokenDoc_ = null;
      }
      return tokenDocBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ixo.token.v1beta1.QueryTokenDocResponse)
  }

  // @@protoc_insertion_point(class_scope:ixo.token.v1beta1.QueryTokenDocResponse)
  private static final com.ixo.token.v1beta1.QueryTokenDocResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.token.v1beta1.QueryTokenDocResponse();
  }

  public static com.ixo.token.v1beta1.QueryTokenDocResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTokenDocResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTokenDocResponse>() {
    @java.lang.Override
    public QueryTokenDocResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTokenDocResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTokenDocResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.token.v1beta1.QueryTokenDocResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

