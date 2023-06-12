// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/query.proto

package com.pubsub.v1;

/**
 * Protobuf type {@code pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest}
 */
public final class QueryPublisherIntentsByPublisherDomainRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest)
    QueryPublisherIntentsByPublisherDomainRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPublisherIntentsByPublisherDomainRequest.newBuilder() to construct.
  private QueryPublisherIntentsByPublisherDomainRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPublisherIntentsByPublisherDomainRequest() {
    publisherDomain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPublisherIntentsByPublisherDomainRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest.class, com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest.Builder.class);
  }

  public static final int PUBLISHER_DOMAIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object publisherDomain_ = "";
  /**
   * <code>string publisher_domain = 1 [json_name = "publisherDomain"];</code>
   * @return The publisherDomain.
   */
  @java.lang.Override
  public java.lang.String getPublisherDomain() {
    java.lang.Object ref = publisherDomain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publisherDomain_ = s;
      return s;
    }
  }
  /**
   * <code>string publisher_domain = 1 [json_name = "publisherDomain"];</code>
   * @return The bytes for publisherDomain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublisherDomainBytes() {
    java.lang.Object ref = publisherDomain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publisherDomain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publisherDomain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, publisherDomain_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publisherDomain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, publisherDomain_);
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
    if (!(obj instanceof com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest)) {
      return super.equals(obj);
    }
    com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest other = (com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest) obj;

    if (!getPublisherDomain()
        .equals(other.getPublisherDomain())) return false;
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
    hash = (37 * hash) + PUBLISHER_DOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getPublisherDomain().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest parseFrom(
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
  public static Builder newBuilder(com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest prototype) {
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
   * Protobuf type {@code pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest)
      com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest.class, com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest.Builder.class);
    }

    // Construct using com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest.newBuilder()
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
      publisherDomain_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest_descriptor;
    }

    @java.lang.Override
    public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest getDefaultInstanceForType() {
      return com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest build() {
      com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest buildPartial() {
      com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest result = new com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.publisherDomain_ = publisherDomain_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest) {
        return mergeFrom((com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest other) {
      if (other == com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest.getDefaultInstance()) return this;
      if (!other.getPublisherDomain().isEmpty()) {
        publisherDomain_ = other.publisherDomain_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              publisherDomain_ = input.readStringRequireUtf8();
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

    private java.lang.Object publisherDomain_ = "";
    /**
     * <code>string publisher_domain = 1 [json_name = "publisherDomain"];</code>
     * @return The publisherDomain.
     */
    public java.lang.String getPublisherDomain() {
      java.lang.Object ref = publisherDomain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publisherDomain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string publisher_domain = 1 [json_name = "publisherDomain"];</code>
     * @return The bytes for publisherDomain.
     */
    public com.google.protobuf.ByteString
        getPublisherDomainBytes() {
      java.lang.Object ref = publisherDomain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publisherDomain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string publisher_domain = 1 [json_name = "publisherDomain"];</code>
     * @param value The publisherDomain to set.
     * @return This builder for chaining.
     */
    public Builder setPublisherDomain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      publisherDomain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string publisher_domain = 1 [json_name = "publisherDomain"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublisherDomain() {
      publisherDomain_ = getDefaultInstance().getPublisherDomain();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string publisher_domain = 1 [json_name = "publisherDomain"];</code>
     * @param value The bytes for publisherDomain to set.
     * @return This builder for chaining.
     */
    public Builder setPublisherDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      publisherDomain_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest)
  }

  // @@protoc_insertion_point(class_scope:pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest)
  private static final com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest();
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPublisherIntentsByPublisherDomainRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryPublisherIntentsByPublisherDomainRequest>() {
    @java.lang.Override
    public QueryPublisherIntentsByPublisherDomainRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPublisherIntentsByPublisherDomainRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPublisherIntentsByPublisherDomainRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

