// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/maintainers/queries/maintainers/query_request.proto

package com.assetmantle.modules.maintainers.queries.maintainers;

/**
 * Protobuf type {@code assetmantle.modules.maintainers.queries.maintainers.QueryRequest}
 */
public final class QueryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:assetmantle.modules.maintainers.queries.maintainers.QueryRequest)
    QueryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRequest.newBuilder() to construct.
  private QueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.assetmantle.modules.maintainers.queries.maintainers.QueryRequestProto.internal_static_assetmantle_modules_maintainers_queries_maintainers_QueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.assetmantle.modules.maintainers.queries.maintainers.QueryRequestProto.internal_static_assetmantle_modules_maintainers_queries_maintainers_QueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest.class, com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest.Builder.class);
  }

  public static final int PAGE_REQUEST_FIELD_NUMBER = 1;
  private com.cosmos.base.query.v1beta1.PageRequest pageRequest_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
   * @return Whether the pageRequest field is set.
   */
  @java.lang.Override
  public boolean hasPageRequest() {
    return pageRequest_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
   * @return The pageRequest.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequest getPageRequest() {
    return pageRequest_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pageRequest_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPageRequestOrBuilder() {
    return pageRequest_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pageRequest_;
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
    if (pageRequest_ != null) {
      output.writeMessage(1, getPageRequest());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPageRequest());
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
    if (!(obj instanceof com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest)) {
      return super.equals(obj);
    }
    com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest other = (com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest) obj;

    if (hasPageRequest() != other.hasPageRequest()) return false;
    if (hasPageRequest()) {
      if (!getPageRequest()
          .equals(other.getPageRequest())) return false;
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
    if (hasPageRequest()) {
      hash = (37 * hash) + PAGE_REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getPageRequest().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest parseFrom(
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
  public static Builder newBuilder(com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest prototype) {
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
   * Protobuf type {@code assetmantle.modules.maintainers.queries.maintainers.QueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:assetmantle.modules.maintainers.queries.maintainers.QueryRequest)
      com.assetmantle.modules.maintainers.queries.maintainers.QueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.maintainers.queries.maintainers.QueryRequestProto.internal_static_assetmantle_modules_maintainers_queries_maintainers_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.maintainers.queries.maintainers.QueryRequestProto.internal_static_assetmantle_modules_maintainers_queries_maintainers_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest.class, com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest.Builder.class);
    }

    // Construct using com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest.newBuilder()
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
      pageRequest_ = null;
      if (pageRequestBuilder_ != null) {
        pageRequestBuilder_.dispose();
        pageRequestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.assetmantle.modules.maintainers.queries.maintainers.QueryRequestProto.internal_static_assetmantle_modules_maintainers_queries_maintainers_QueryRequest_descriptor;
    }

    @java.lang.Override
    public com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest getDefaultInstanceForType() {
      return com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest build() {
      com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest buildPartial() {
      com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest result = new com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageRequest_ = pageRequestBuilder_ == null
            ? pageRequest_
            : pageRequestBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest) {
        return mergeFrom((com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest other) {
      if (other == com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest.getDefaultInstance()) return this;
      if (other.hasPageRequest()) {
        mergePageRequest(other.getPageRequest());
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
                  getPageRequestFieldBuilder().getBuilder(),
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

    private com.cosmos.base.query.v1beta1.PageRequest pageRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> pageRequestBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     * @return Whether the pageRequest field is set.
     */
    public boolean hasPageRequest() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     * @return The pageRequest.
     */
    public com.cosmos.base.query.v1beta1.PageRequest getPageRequest() {
      if (pageRequestBuilder_ == null) {
        return pageRequest_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pageRequest_;
      } else {
        return pageRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    public Builder setPageRequest(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (pageRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pageRequest_ = value;
      } else {
        pageRequestBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    public Builder setPageRequest(
        com.cosmos.base.query.v1beta1.PageRequest.Builder builderForValue) {
      if (pageRequestBuilder_ == null) {
        pageRequest_ = builderForValue.build();
      } else {
        pageRequestBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    public Builder mergePageRequest(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (pageRequestBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          pageRequest_ != null &&
          pageRequest_ != com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance()) {
          getPageRequestBuilder().mergeFrom(value);
        } else {
          pageRequest_ = value;
        }
      } else {
        pageRequestBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    public Builder clearPageRequest() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageRequest_ = null;
      if (pageRequestBuilder_ != null) {
        pageRequestBuilder_.dispose();
        pageRequestBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequest.Builder getPageRequestBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPageRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPageRequestOrBuilder() {
      if (pageRequestBuilder_ != null) {
        return pageRequestBuilder_.getMessageOrBuilder();
      } else {
        return pageRequest_ == null ?
            com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pageRequest_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> 
        getPageRequestFieldBuilder() {
      if (pageRequestBuilder_ == null) {
        pageRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder>(
                getPageRequest(),
                getParentForChildren(),
                isClean());
        pageRequest_ = null;
      }
      return pageRequestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:assetmantle.modules.maintainers.queries.maintainers.QueryRequest)
  }

  // @@protoc_insertion_point(class_scope:assetmantle.modules.maintainers.queries.maintainers.QueryRequest)
  private static final com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest();
  }

  public static com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryRequest>() {
    @java.lang.Override
    public QueryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.assetmantle.modules.maintainers.queries.maintainers.QueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

