// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/service.proto

package com.irismod.service;

/**
 * <pre>
 * Response defines a standard for response
 * </pre>
 *
 * Protobuf type {@code irismod.service.Response}
 */
public final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.service.Response)
    ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
    provider_ = "";
    consumer_ = "";
    result_ = "";
    output_ = "";
    requestContextId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Response();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.service.ServiceProto.internal_static_irismod_service_Response_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.service.ServiceProto.internal_static_irismod_service_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.service.Response.class, com.irismod.service.Response.Builder.class);
  }

  public static final int PROVIDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object provider_ = "";
  /**
   * <code>string provider = 1 [json_name = "provider"];</code>
   * @return The provider.
   */
  @java.lang.Override
  public java.lang.String getProvider() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provider_ = s;
      return s;
    }
  }
  /**
   * <code>string provider = 1 [json_name = "provider"];</code>
   * @return The bytes for provider.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProviderBytes() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSUMER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object consumer_ = "";
  /**
   * <code>string consumer = 2 [json_name = "consumer"];</code>
   * @return The consumer.
   */
  @java.lang.Override
  public java.lang.String getConsumer() {
    java.lang.Object ref = consumer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consumer_ = s;
      return s;
    }
  }
  /**
   * <code>string consumer = 2 [json_name = "consumer"];</code>
   * @return The bytes for consumer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConsumerBytes() {
    java.lang.Object ref = consumer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      consumer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object result_ = "";
  /**
   * <code>string result = 3 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 3 [json_name = "result"];</code>
   * @return The bytes for result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object output_ = "";
  /**
   * <code>string output = 4 [json_name = "output"];</code>
   * @return The output.
   */
  @java.lang.Override
  public java.lang.String getOutput() {
    java.lang.Object ref = output_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      output_ = s;
      return s;
    }
  }
  /**
   * <code>string output = 4 [json_name = "output"];</code>
   * @return The bytes for output.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputBytes() {
    java.lang.Object ref = output_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      output_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_CONTEXT_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object requestContextId_ = "";
  /**
   * <code>string request_context_id = 5 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
   * @return The requestContextId.
   */
  @java.lang.Override
  public java.lang.String getRequestContextId() {
    java.lang.Object ref = requestContextId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestContextId_ = s;
      return s;
    }
  }
  /**
   * <code>string request_context_id = 5 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
   * @return The bytes for requestContextId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestContextIdBytes() {
    java.lang.Object ref = requestContextId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestContextId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_CONTEXT_BATCH_COUNTER_FIELD_NUMBER = 6;
  private long requestContextBatchCounter_ = 0L;
  /**
   * <code>uint64 request_context_batch_counter = 6 [json_name = "requestContextBatchCounter", (.gogoproto.moretags) = "yaml:&#92;"request_context_batch_counter&#92;""];</code>
   * @return The requestContextBatchCounter.
   */
  @java.lang.Override
  public long getRequestContextBatchCounter() {
    return requestContextBatchCounter_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(provider_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, provider_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consumer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, consumer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, result_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(output_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, output_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestContextId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, requestContextId_);
    }
    if (requestContextBatchCounter_ != 0L) {
      output.writeUInt64(6, requestContextBatchCounter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(provider_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, provider_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consumer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, consumer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, result_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(output_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, output_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestContextId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, requestContextId_);
    }
    if (requestContextBatchCounter_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, requestContextBatchCounter_);
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
    if (!(obj instanceof com.irismod.service.Response)) {
      return super.equals(obj);
    }
    com.irismod.service.Response other = (com.irismod.service.Response) obj;

    if (!getProvider()
        .equals(other.getProvider())) return false;
    if (!getConsumer()
        .equals(other.getConsumer())) return false;
    if (!getResult()
        .equals(other.getResult())) return false;
    if (!getOutput()
        .equals(other.getOutput())) return false;
    if (!getRequestContextId()
        .equals(other.getRequestContextId())) return false;
    if (getRequestContextBatchCounter()
        != other.getRequestContextBatchCounter()) return false;
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
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getProvider().hashCode();
    hash = (37 * hash) + CONSUMER_FIELD_NUMBER;
    hash = (53 * hash) + getConsumer().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
    hash = (53 * hash) + getOutput().hashCode();
    hash = (37 * hash) + REQUEST_CONTEXT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestContextId().hashCode();
    hash = (37 * hash) + REQUEST_CONTEXT_BATCH_COUNTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestContextBatchCounter());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.service.Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.service.Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.service.Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.service.Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.Response parseFrom(
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
  public static Builder newBuilder(com.irismod.service.Response prototype) {
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
   * Response defines a standard for response
   * </pre>
   *
   * Protobuf type {@code irismod.service.Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.service.Response)
      com.irismod.service.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.service.ServiceProto.internal_static_irismod_service_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.service.ServiceProto.internal_static_irismod_service_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.service.Response.class, com.irismod.service.Response.Builder.class);
    }

    // Construct using com.irismod.service.Response.newBuilder()
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
      provider_ = "";
      consumer_ = "";
      result_ = "";
      output_ = "";
      requestContextId_ = "";
      requestContextBatchCounter_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.service.ServiceProto.internal_static_irismod_service_Response_descriptor;
    }

    @java.lang.Override
    public com.irismod.service.Response getDefaultInstanceForType() {
      return com.irismod.service.Response.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.service.Response build() {
      com.irismod.service.Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.service.Response buildPartial() {
      com.irismod.service.Response result = new com.irismod.service.Response(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.service.Response result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.provider_ = provider_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.consumer_ = consumer_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.result_ = result_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.output_ = output_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.requestContextId_ = requestContextId_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.requestContextBatchCounter_ = requestContextBatchCounter_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.service.Response) {
        return mergeFrom((com.irismod.service.Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.service.Response other) {
      if (other == com.irismod.service.Response.getDefaultInstance()) return this;
      if (!other.getProvider().isEmpty()) {
        provider_ = other.provider_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getConsumer().isEmpty()) {
        consumer_ = other.consumer_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getOutput().isEmpty()) {
        output_ = other.output_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getRequestContextId().isEmpty()) {
        requestContextId_ = other.requestContextId_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getRequestContextBatchCounter() != 0L) {
        setRequestContextBatchCounter(other.getRequestContextBatchCounter());
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
              provider_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              consumer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              result_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              output_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              requestContextId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              requestContextBatchCounter_ = input.readUInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private java.lang.Object provider_ = "";
    /**
     * <code>string provider = 1 [json_name = "provider"];</code>
     * @return The provider.
     */
    public java.lang.String getProvider() {
      java.lang.Object ref = provider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string provider = 1 [json_name = "provider"];</code>
     * @return The bytes for provider.
     */
    public com.google.protobuf.ByteString
        getProviderBytes() {
      java.lang.Object ref = provider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string provider = 1 [json_name = "provider"];</code>
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      provider_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 1 [json_name = "provider"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      provider_ = getDefaultInstance().getProvider();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 1 [json_name = "provider"];</code>
     * @param value The bytes for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      provider_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object consumer_ = "";
    /**
     * <code>string consumer = 2 [json_name = "consumer"];</code>
     * @return The consumer.
     */
    public java.lang.String getConsumer() {
      java.lang.Object ref = consumer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string consumer = 2 [json_name = "consumer"];</code>
     * @return The bytes for consumer.
     */
    public com.google.protobuf.ByteString
        getConsumerBytes() {
      java.lang.Object ref = consumer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consumer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string consumer = 2 [json_name = "consumer"];</code>
     * @param value The consumer to set.
     * @return This builder for chaining.
     */
    public Builder setConsumer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      consumer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string consumer = 2 [json_name = "consumer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumer() {
      consumer_ = getDefaultInstance().getConsumer();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string consumer = 2 [json_name = "consumer"];</code>
     * @param value The bytes for consumer to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      consumer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 3 [json_name = "result"];</code>
     * @return The result.
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 3 [json_name = "result"];</code>
     * @return The bytes for result.
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 3 [json_name = "result"];</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      result_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 3 [json_name = "result"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      result_ = getDefaultInstance().getResult();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string result = 3 [json_name = "result"];</code>
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      result_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object output_ = "";
    /**
     * <code>string output = 4 [json_name = "output"];</code>
     * @return The output.
     */
    public java.lang.String getOutput() {
      java.lang.Object ref = output_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        output_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string output = 4 [json_name = "output"];</code>
     * @return The bytes for output.
     */
    public com.google.protobuf.ByteString
        getOutputBytes() {
      java.lang.Object ref = output_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        output_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string output = 4 [json_name = "output"];</code>
     * @param value The output to set.
     * @return This builder for chaining.
     */
    public Builder setOutput(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      output_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string output = 4 [json_name = "output"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOutput() {
      output_ = getDefaultInstance().getOutput();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string output = 4 [json_name = "output"];</code>
     * @param value The bytes for output to set.
     * @return This builder for chaining.
     */
    public Builder setOutputBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      output_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object requestContextId_ = "";
    /**
     * <code>string request_context_id = 5 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
     * @return The requestContextId.
     */
    public java.lang.String getRequestContextId() {
      java.lang.Object ref = requestContextId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestContextId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string request_context_id = 5 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
     * @return The bytes for requestContextId.
     */
    public com.google.protobuf.ByteString
        getRequestContextIdBytes() {
      java.lang.Object ref = requestContextId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestContextId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string request_context_id = 5 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
     * @param value The requestContextId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestContextId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      requestContextId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string request_context_id = 5 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestContextId() {
      requestContextId_ = getDefaultInstance().getRequestContextId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string request_context_id = 5 [json_name = "requestContextId", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
     * @param value The bytes for requestContextId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestContextIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      requestContextId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private long requestContextBatchCounter_ ;
    /**
     * <code>uint64 request_context_batch_counter = 6 [json_name = "requestContextBatchCounter", (.gogoproto.moretags) = "yaml:&#92;"request_context_batch_counter&#92;""];</code>
     * @return The requestContextBatchCounter.
     */
    @java.lang.Override
    public long getRequestContextBatchCounter() {
      return requestContextBatchCounter_;
    }
    /**
     * <code>uint64 request_context_batch_counter = 6 [json_name = "requestContextBatchCounter", (.gogoproto.moretags) = "yaml:&#92;"request_context_batch_counter&#92;""];</code>
     * @param value The requestContextBatchCounter to set.
     * @return This builder for chaining.
     */
    public Builder setRequestContextBatchCounter(long value) {

      requestContextBatchCounter_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 request_context_batch_counter = 6 [json_name = "requestContextBatchCounter", (.gogoproto.moretags) = "yaml:&#92;"request_context_batch_counter&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestContextBatchCounter() {
      bitField0_ = (bitField0_ & ~0x00000020);
      requestContextBatchCounter_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:irismod.service.Response)
  }

  // @@protoc_insertion_point(class_scope:irismod.service.Response)
  private static final com.irismod.service.Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.service.Response();
  }

  public static com.irismod.service.Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    @java.lang.Override
    public Response parsePartialFrom(
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

  public static com.google.protobuf.Parser<Response> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Response> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.service.Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

