// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/query.proto

package com.comdex.lend.v1beta1;

/**
 * Protobuf type {@code comdex.lend.v1beta1.QueryAssetToPairMappingResponse}
 */
public final class QueryAssetToPairMappingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.lend.v1beta1.QueryAssetToPairMappingResponse)
    QueryAssetToPairMappingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAssetToPairMappingResponse.newBuilder() to construct.
  private QueryAssetToPairMappingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAssetToPairMappingResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAssetToPairMappingResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryAssetToPairMappingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryAssetToPairMappingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.class, com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.Builder.class);
  }

  public static final int ASSETTOPAIRMAPPING_FIELD_NUMBER = 1;
  private com.comdex.lend.v1beta1.AssetToPairMapping assetToPairMapping_;
  /**
   * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
   * @return Whether the assetToPairMapping field is set.
   */
  @java.lang.Override
  public boolean hasAssetToPairMapping() {
    return assetToPairMapping_ != null;
  }
  /**
   * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
   * @return The assetToPairMapping.
   */
  @java.lang.Override
  public com.comdex.lend.v1beta1.AssetToPairMapping getAssetToPairMapping() {
    return assetToPairMapping_ == null ? com.comdex.lend.v1beta1.AssetToPairMapping.getDefaultInstance() : assetToPairMapping_;
  }
  /**
   * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
   */
  @java.lang.Override
  public com.comdex.lend.v1beta1.AssetToPairMappingOrBuilder getAssetToPairMappingOrBuilder() {
    return assetToPairMapping_ == null ? com.comdex.lend.v1beta1.AssetToPairMapping.getDefaultInstance() : assetToPairMapping_;
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
    if (assetToPairMapping_ != null) {
      output.writeMessage(1, getAssetToPairMapping());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetToPairMapping_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAssetToPairMapping());
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
    if (!(obj instanceof com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse)) {
      return super.equals(obj);
    }
    com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse other = (com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse) obj;

    if (hasAssetToPairMapping() != other.hasAssetToPairMapping()) return false;
    if (hasAssetToPairMapping()) {
      if (!getAssetToPairMapping()
          .equals(other.getAssetToPairMapping())) return false;
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
    if (hasAssetToPairMapping()) {
      hash = (37 * hash) + ASSETTOPAIRMAPPING_FIELD_NUMBER;
      hash = (53 * hash) + getAssetToPairMapping().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse prototype) {
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
   * Protobuf type {@code comdex.lend.v1beta1.QueryAssetToPairMappingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.lend.v1beta1.QueryAssetToPairMappingResponse)
      com.comdex.lend.v1beta1.QueryAssetToPairMappingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryAssetToPairMappingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryAssetToPairMappingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.class, com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.Builder.class);
    }

    // Construct using com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.newBuilder()
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
      assetToPairMapping_ = null;
      if (assetToPairMappingBuilder_ != null) {
        assetToPairMappingBuilder_.dispose();
        assetToPairMappingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryAssetToPairMappingResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse getDefaultInstanceForType() {
      return com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse build() {
      com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse buildPartial() {
      com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse result = new com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetToPairMapping_ = assetToPairMappingBuilder_ == null
            ? assetToPairMapping_
            : assetToPairMappingBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse) {
        return mergeFrom((com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse other) {
      if (other == com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.getDefaultInstance()) return this;
      if (other.hasAssetToPairMapping()) {
        mergeAssetToPairMapping(other.getAssetToPairMapping());
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
                  getAssetToPairMappingFieldBuilder().getBuilder(),
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

    private com.comdex.lend.v1beta1.AssetToPairMapping assetToPairMapping_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.lend.v1beta1.AssetToPairMapping, com.comdex.lend.v1beta1.AssetToPairMapping.Builder, com.comdex.lend.v1beta1.AssetToPairMappingOrBuilder> assetToPairMappingBuilder_;
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     * @return Whether the assetToPairMapping field is set.
     */
    public boolean hasAssetToPairMapping() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     * @return The assetToPairMapping.
     */
    public com.comdex.lend.v1beta1.AssetToPairMapping getAssetToPairMapping() {
      if (assetToPairMappingBuilder_ == null) {
        return assetToPairMapping_ == null ? com.comdex.lend.v1beta1.AssetToPairMapping.getDefaultInstance() : assetToPairMapping_;
      } else {
        return assetToPairMappingBuilder_.getMessage();
      }
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     */
    public Builder setAssetToPairMapping(com.comdex.lend.v1beta1.AssetToPairMapping value) {
      if (assetToPairMappingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assetToPairMapping_ = value;
      } else {
        assetToPairMappingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     */
    public Builder setAssetToPairMapping(
        com.comdex.lend.v1beta1.AssetToPairMapping.Builder builderForValue) {
      if (assetToPairMappingBuilder_ == null) {
        assetToPairMapping_ = builderForValue.build();
      } else {
        assetToPairMappingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     */
    public Builder mergeAssetToPairMapping(com.comdex.lend.v1beta1.AssetToPairMapping value) {
      if (assetToPairMappingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          assetToPairMapping_ != null &&
          assetToPairMapping_ != com.comdex.lend.v1beta1.AssetToPairMapping.getDefaultInstance()) {
          getAssetToPairMappingBuilder().mergeFrom(value);
        } else {
          assetToPairMapping_ = value;
        }
      } else {
        assetToPairMappingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     */
    public Builder clearAssetToPairMapping() {
      bitField0_ = (bitField0_ & ~0x00000001);
      assetToPairMapping_ = null;
      if (assetToPairMappingBuilder_ != null) {
        assetToPairMappingBuilder_.dispose();
        assetToPairMappingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     */
    public com.comdex.lend.v1beta1.AssetToPairMapping.Builder getAssetToPairMappingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAssetToPairMappingFieldBuilder().getBuilder();
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     */
    public com.comdex.lend.v1beta1.AssetToPairMappingOrBuilder getAssetToPairMappingOrBuilder() {
      if (assetToPairMappingBuilder_ != null) {
        return assetToPairMappingBuilder_.getMessageOrBuilder();
      } else {
        return assetToPairMapping_ == null ?
            com.comdex.lend.v1beta1.AssetToPairMapping.getDefaultInstance() : assetToPairMapping_;
      }
    }
    /**
     * <code>.comdex.lend.v1beta1.AssetToPairMapping AssetToPairMapping = 1 [json_name = "AssetToPairMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"asset_to_pair_mapping&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.lend.v1beta1.AssetToPairMapping, com.comdex.lend.v1beta1.AssetToPairMapping.Builder, com.comdex.lend.v1beta1.AssetToPairMappingOrBuilder> 
        getAssetToPairMappingFieldBuilder() {
      if (assetToPairMappingBuilder_ == null) {
        assetToPairMappingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.comdex.lend.v1beta1.AssetToPairMapping, com.comdex.lend.v1beta1.AssetToPairMapping.Builder, com.comdex.lend.v1beta1.AssetToPairMappingOrBuilder>(
                getAssetToPairMapping(),
                getParentForChildren(),
                isClean());
        assetToPairMapping_ = null;
      }
      return assetToPairMappingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:comdex.lend.v1beta1.QueryAssetToPairMappingResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.lend.v1beta1.QueryAssetToPairMappingResponse)
  private static final com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse();
  }

  public static com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAssetToPairMappingResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAssetToPairMappingResponse>() {
    @java.lang.Override
    public QueryAssetToPairMappingResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAssetToPairMappingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAssetToPairMappingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

