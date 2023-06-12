// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/query.proto

package com.osmosis.gamm.v1beta1;

/**
 * Protobuf type {@code osmosis.gamm.v1beta1.QueryPoolParamsResponse}
 */
public final class QueryPoolParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.gamm.v1beta1.QueryPoolParamsResponse)
    QueryPoolParamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPoolParamsResponse.newBuilder() to construct.
  private QueryPoolParamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPoolParamsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPoolParamsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryPoolParamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryPoolParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.class, com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.google.protobuf.Any params_;
  /**
   * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.google.protobuf.Any getParams() {
    return params_ == null ? com.google.protobuf.Any.getDefaultInstance() : params_;
  }
  /**
   * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.google.protobuf.Any.getDefaultInstance() : params_;
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
    if (!(obj instanceof com.osmosis.gamm.v1beta1.QueryPoolParamsResponse)) {
      return super.equals(obj);
    }
    com.osmosis.gamm.v1beta1.QueryPoolParamsResponse other = (com.osmosis.gamm.v1beta1.QueryPoolParamsResponse) obj;

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

  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.gamm.v1beta1.QueryPoolParamsResponse prototype) {
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
   * Protobuf type {@code osmosis.gamm.v1beta1.QueryPoolParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.gamm.v1beta1.QueryPoolParamsResponse)
      com.osmosis.gamm.v1beta1.QueryPoolParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryPoolParamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryPoolParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.class, com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.Builder.class);
    }

    // Construct using com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.newBuilder()
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
      return com.osmosis.gamm.v1beta1.QueryProto.internal_static_osmosis_gamm_v1beta1_QueryPoolParamsResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryPoolParamsResponse getDefaultInstanceForType() {
      return com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryPoolParamsResponse build() {
      com.osmosis.gamm.v1beta1.QueryPoolParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.QueryPoolParamsResponse buildPartial() {
      com.osmosis.gamm.v1beta1.QueryPoolParamsResponse result = new com.osmosis.gamm.v1beta1.QueryPoolParamsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.gamm.v1beta1.QueryPoolParamsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.gamm.v1beta1.QueryPoolParamsResponse) {
        return mergeFrom((com.osmosis.gamm.v1beta1.QueryPoolParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.gamm.v1beta1.QueryPoolParamsResponse other) {
      if (other == com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.getDefaultInstance()) return this;
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

    private com.google.protobuf.Any params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> paramsBuilder_;
    /**
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     * @return The params.
     */
    public com.google.protobuf.Any getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.google.protobuf.Any.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     */
    public Builder setParams(com.google.protobuf.Any value) {
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
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     */
    public Builder setParams(
        com.google.protobuf.Any.Builder builderForValue) {
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
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     */
    public Builder mergeParams(com.google.protobuf.Any value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != com.google.protobuf.Any.getDefaultInstance()) {
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
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
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
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     */
    public com.google.protobuf.Any.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : params_;
      }
    }
    /**
     * <code>.google.protobuf.Any params = 1 [json_name = "params"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:osmosis.gamm.v1beta1.QueryPoolParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.gamm.v1beta1.QueryPoolParamsResponse)
  private static final com.osmosis.gamm.v1beta1.QueryPoolParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.gamm.v1beta1.QueryPoolParamsResponse();
  }

  public static com.osmosis.gamm.v1beta1.QueryPoolParamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPoolParamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryPoolParamsResponse>() {
    @java.lang.Override
    public QueryPoolParamsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPoolParamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPoolParamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.gamm.v1beta1.QueryPoolParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

