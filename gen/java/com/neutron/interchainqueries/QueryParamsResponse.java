// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/interchainqueries/query.proto

package com.neutron.interchainqueries;

/**
 * <pre>
 * QueryParamsResponse is response type for the Query/Params RPC method.
 * </pre>
 *
 * Protobuf type {@code neutron.interchainqueries.QueryParamsResponse}
 */
public final class QueryParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:neutron.interchainqueries.QueryParamsResponse)
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
    return com.neutron.interchainqueries.QueryProto.internal_static_neutron_interchainqueries_QueryParamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.neutron.interchainqueries.QueryProto.internal_static_neutron_interchainqueries_QueryParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.neutron.interchainqueries.QueryParamsResponse.class, com.neutron.interchainqueries.QueryParamsResponse.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.neutron.interchainqueries.Params params_;
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.neutron.interchainqueries.Params getParams() {
    return params_ == null ? com.neutron.interchainqueries.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params holds all the parameters of this module.
   * </pre>
   *
   * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.neutron.interchainqueries.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.neutron.interchainqueries.Params.getDefaultInstance() : params_;
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
    if (!(obj instanceof com.neutron.interchainqueries.QueryParamsResponse)) {
      return super.equals(obj);
    }
    com.neutron.interchainqueries.QueryParamsResponse other = (com.neutron.interchainqueries.QueryParamsResponse) obj;

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

  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.neutron.interchainqueries.QueryParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.neutron.interchainqueries.QueryParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.interchainqueries.QueryParamsResponse parseFrom(
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
  public static Builder newBuilder(com.neutron.interchainqueries.QueryParamsResponse prototype) {
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
   * QueryParamsResponse is response type for the Query/Params RPC method.
   * </pre>
   *
   * Protobuf type {@code neutron.interchainqueries.QueryParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:neutron.interchainqueries.QueryParamsResponse)
      com.neutron.interchainqueries.QueryParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.neutron.interchainqueries.QueryProto.internal_static_neutron_interchainqueries_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.neutron.interchainqueries.QueryProto.internal_static_neutron_interchainqueries_QueryParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.neutron.interchainqueries.QueryParamsResponse.class, com.neutron.interchainqueries.QueryParamsResponse.Builder.class);
    }

    // Construct using com.neutron.interchainqueries.QueryParamsResponse.newBuilder()
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
      return com.neutron.interchainqueries.QueryProto.internal_static_neutron_interchainqueries_QueryParamsResponse_descriptor;
    }

    @java.lang.Override
    public com.neutron.interchainqueries.QueryParamsResponse getDefaultInstanceForType() {
      return com.neutron.interchainqueries.QueryParamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.neutron.interchainqueries.QueryParamsResponse build() {
      com.neutron.interchainqueries.QueryParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.neutron.interchainqueries.QueryParamsResponse buildPartial() {
      com.neutron.interchainqueries.QueryParamsResponse result = new com.neutron.interchainqueries.QueryParamsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.neutron.interchainqueries.QueryParamsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.neutron.interchainqueries.QueryParamsResponse) {
        return mergeFrom((com.neutron.interchainqueries.QueryParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.neutron.interchainqueries.QueryParamsResponse other) {
      if (other == com.neutron.interchainqueries.QueryParamsResponse.getDefaultInstance()) return this;
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

    private com.neutron.interchainqueries.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.neutron.interchainqueries.Params, com.neutron.interchainqueries.Params.Builder, com.neutron.interchainqueries.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.neutron.interchainqueries.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.neutron.interchainqueries.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.neutron.interchainqueries.Params value) {
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
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.neutron.interchainqueries.Params.Builder builderForValue) {
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
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.neutron.interchainqueries.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != com.neutron.interchainqueries.Params.getDefaultInstance()) {
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
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
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
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.interchainqueries.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.neutron.interchainqueries.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.neutron.interchainqueries.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params holds all the parameters of this module.
     * </pre>
     *
     * <code>.neutron.interchainqueries.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.neutron.interchainqueries.Params, com.neutron.interchainqueries.Params.Builder, com.neutron.interchainqueries.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.neutron.interchainqueries.Params, com.neutron.interchainqueries.Params.Builder, com.neutron.interchainqueries.ParamsOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:neutron.interchainqueries.QueryParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:neutron.interchainqueries.QueryParamsResponse)
  private static final com.neutron.interchainqueries.QueryParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.neutron.interchainqueries.QueryParamsResponse();
  }

  public static com.neutron.interchainqueries.QueryParamsResponse getDefaultInstance() {
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
  public com.neutron.interchainqueries.QueryParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

