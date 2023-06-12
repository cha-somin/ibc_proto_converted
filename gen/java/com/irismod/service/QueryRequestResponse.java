// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/query.proto

package com.irismod.service;

/**
 * <pre>
 * QueryRequestResponse is response type for the Query/Request RPC method
 * </pre>
 *
 * Protobuf type {@code irismod.service.QueryRequestResponse}
 */
public final class QueryRequestResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.service.QueryRequestResponse)
    QueryRequestResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRequestResponse.newBuilder() to construct.
  private QueryRequestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRequestResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRequestResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.service.QueryProto.internal_static_irismod_service_QueryRequestResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.service.QueryProto.internal_static_irismod_service_QueryRequestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.service.QueryRequestResponse.class, com.irismod.service.QueryRequestResponse.Builder.class);
  }

  public static final int REQUEST_FIELD_NUMBER = 1;
  private com.irismod.service.Request request_;
  /**
   * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
   * @return Whether the request field is set.
   */
  @java.lang.Override
  public boolean hasRequest() {
    return request_ != null;
  }
  /**
   * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
   * @return The request.
   */
  @java.lang.Override
  public com.irismod.service.Request getRequest() {
    return request_ == null ? com.irismod.service.Request.getDefaultInstance() : request_;
  }
  /**
   * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
   */
  @java.lang.Override
  public com.irismod.service.RequestOrBuilder getRequestOrBuilder() {
    return request_ == null ? com.irismod.service.Request.getDefaultInstance() : request_;
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
    if (request_ != null) {
      output.writeMessage(1, getRequest());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (request_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequest());
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
    if (!(obj instanceof com.irismod.service.QueryRequestResponse)) {
      return super.equals(obj);
    }
    com.irismod.service.QueryRequestResponse other = (com.irismod.service.QueryRequestResponse) obj;

    if (hasRequest() != other.hasRequest()) return false;
    if (hasRequest()) {
      if (!getRequest()
          .equals(other.getRequest())) return false;
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
    if (hasRequest()) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequest().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.service.QueryRequestResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.service.QueryRequestResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.service.QueryRequestResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.QueryRequestResponse parseFrom(
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
  public static Builder newBuilder(com.irismod.service.QueryRequestResponse prototype) {
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
   * QueryRequestResponse is response type for the Query/Request RPC method
   * </pre>
   *
   * Protobuf type {@code irismod.service.QueryRequestResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.service.QueryRequestResponse)
      com.irismod.service.QueryRequestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.service.QueryProto.internal_static_irismod_service_QueryRequestResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.service.QueryProto.internal_static_irismod_service_QueryRequestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.service.QueryRequestResponse.class, com.irismod.service.QueryRequestResponse.Builder.class);
    }

    // Construct using com.irismod.service.QueryRequestResponse.newBuilder()
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
      request_ = null;
      if (requestBuilder_ != null) {
        requestBuilder_.dispose();
        requestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.service.QueryProto.internal_static_irismod_service_QueryRequestResponse_descriptor;
    }

    @java.lang.Override
    public com.irismod.service.QueryRequestResponse getDefaultInstanceForType() {
      return com.irismod.service.QueryRequestResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.service.QueryRequestResponse build() {
      com.irismod.service.QueryRequestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.service.QueryRequestResponse buildPartial() {
      com.irismod.service.QueryRequestResponse result = new com.irismod.service.QueryRequestResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.service.QueryRequestResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.request_ = requestBuilder_ == null
            ? request_
            : requestBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.service.QueryRequestResponse) {
        return mergeFrom((com.irismod.service.QueryRequestResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.service.QueryRequestResponse other) {
      if (other == com.irismod.service.QueryRequestResponse.getDefaultInstance()) return this;
      if (other.hasRequest()) {
        mergeRequest(other.getRequest());
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
                  getRequestFieldBuilder().getBuilder(),
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

    private com.irismod.service.Request request_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.irismod.service.Request, com.irismod.service.Request.Builder, com.irismod.service.RequestOrBuilder> requestBuilder_;
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     * @return Whether the request field is set.
     */
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     * @return The request.
     */
    public com.irismod.service.Request getRequest() {
      if (requestBuilder_ == null) {
        return request_ == null ? com.irismod.service.Request.getDefaultInstance() : request_;
      } else {
        return requestBuilder_.getMessage();
      }
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     */
    public Builder setRequest(com.irismod.service.Request value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
      } else {
        requestBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     */
    public Builder setRequest(
        com.irismod.service.Request.Builder builderForValue) {
      if (requestBuilder_ == null) {
        request_ = builderForValue.build();
      } else {
        requestBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     */
    public Builder mergeRequest(com.irismod.service.Request value) {
      if (requestBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          request_ != null &&
          request_ != com.irismod.service.Request.getDefaultInstance()) {
          getRequestBuilder().mergeFrom(value);
        } else {
          request_ = value;
        }
      } else {
        requestBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     */
    public Builder clearRequest() {
      bitField0_ = (bitField0_ & ~0x00000001);
      request_ = null;
      if (requestBuilder_ != null) {
        requestBuilder_.dispose();
        requestBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     */
    public com.irismod.service.Request.Builder getRequestBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     */
    public com.irismod.service.RequestOrBuilder getRequestOrBuilder() {
      if (requestBuilder_ != null) {
        return requestBuilder_.getMessageOrBuilder();
      } else {
        return request_ == null ?
            com.irismod.service.Request.getDefaultInstance() : request_;
      }
    }
    /**
     * <code>.irismod.service.Request request = 1 [json_name = "request"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.irismod.service.Request, com.irismod.service.Request.Builder, com.irismod.service.RequestOrBuilder> 
        getRequestFieldBuilder() {
      if (requestBuilder_ == null) {
        requestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.irismod.service.Request, com.irismod.service.Request.Builder, com.irismod.service.RequestOrBuilder>(
                getRequest(),
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      return requestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:irismod.service.QueryRequestResponse)
  }

  // @@protoc_insertion_point(class_scope:irismod.service.QueryRequestResponse)
  private static final com.irismod.service.QueryRequestResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.service.QueryRequestResponse();
  }

  public static com.irismod.service.QueryRequestResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRequestResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryRequestResponse>() {
    @java.lang.Override
    public QueryRequestResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRequestResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRequestResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.service.QueryRequestResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

