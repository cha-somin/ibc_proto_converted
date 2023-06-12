// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/alloc/v1beta1/query.proto

package com.publicawesome.stargaze.alloc.v1beta1;

/**
 * <pre>
 * QueryParamsResponse is the response type for the Query/Params RPC method.
 * </pre>
 *
 * Protobuf type {@code publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse}
 */
public final class QueryParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse)
    QueryParamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryParamsResponse.newBuilder() to construct.
  private QueryParamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryParamsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryParamsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.publicawesome.stargaze.alloc.v1beta1.QueryProto.internal_static_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.publicawesome.stargaze.alloc.v1beta1.QueryProto.internal_static_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse.class, com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.publicawesome.stargaze.alloc.v1beta1.Params params_;
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.publicawesome.stargaze.alloc.v1beta1.Params getParams() {
    return params_ == null ? com.publicawesome.stargaze.alloc.v1beta1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.publicawesome.stargaze.alloc.v1beta1.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.publicawesome.stargaze.alloc.v1beta1.Params.getDefaultInstance() : params_;
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
    if (params_ != null) {
      output.writeMessage(1, getParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParams());
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
    if (!(obj instanceof com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse)) {
      return super.equals(obj);
    }
    com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse other = (com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse) obj;

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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse parseFrom(
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
  public static Builder newBuilder(com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse prototype) {
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
   * QueryParamsResponse is the response type for the Query/Params RPC method.
   * </pre>
   *
   * Protobuf type {@code publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse)
      com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.publicawesome.stargaze.alloc.v1beta1.QueryProto.internal_static_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.publicawesome.stargaze.alloc.v1beta1.QueryProto.internal_static_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse.class, com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse.Builder.class);
    }

    // Construct using com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse.newBuilder()
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
      return com.publicawesome.stargaze.alloc.v1beta1.QueryProto.internal_static_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse getDefaultInstanceForType() {
      return com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse build() {
      com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse buildPartial() {
      com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse result = new com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse) {
        return mergeFrom((com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse other) {
      if (other == com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse.getDefaultInstance()) return this;
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
              input.readMessage(
                  getParamsFieldBuilder().getBuilder(),
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

    private com.publicawesome.stargaze.alloc.v1beta1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.publicawesome.stargaze.alloc.v1beta1.Params, com.publicawesome.stargaze.alloc.v1beta1.Params.Builder, com.publicawesome.stargaze.alloc.v1beta1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.publicawesome.stargaze.alloc.v1beta1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.publicawesome.stargaze.alloc.v1beta1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.publicawesome.stargaze.alloc.v1beta1.Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.publicawesome.stargaze.alloc.v1beta1.Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.publicawesome.stargaze.alloc.v1beta1.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != com.publicawesome.stargaze.alloc.v1beta1.Params.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.publicawesome.stargaze.alloc.v1beta1.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.publicawesome.stargaze.alloc.v1beta1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.publicawesome.stargaze.alloc.v1beta1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.publicawesome.stargaze.alloc.v1beta1.Params, com.publicawesome.stargaze.alloc.v1beta1.Params.Builder, com.publicawesome.stargaze.alloc.v1beta1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.publicawesome.stargaze.alloc.v1beta1.Params, com.publicawesome.stargaze.alloc.v1beta1.Params.Builder, com.publicawesome.stargaze.alloc.v1beta1.ParamsOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse)
  private static final com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse();
  }

  public static com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryParamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryParamsResponse>() {
    @java.lang.Override
    public QueryParamsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryParamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryParamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

