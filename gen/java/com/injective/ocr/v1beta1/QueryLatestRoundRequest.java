// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/query.proto

package com.injective.ocr.v1beta1;

/**
 * Protobuf type {@code injective.ocr.v1beta1.QueryLatestRoundRequest}
 */
public final class QueryLatestRoundRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.ocr.v1beta1.QueryLatestRoundRequest)
    QueryLatestRoundRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryLatestRoundRequest.newBuilder() to construct.
  private QueryLatestRoundRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryLatestRoundRequest() {
    feedId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryLatestRoundRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.ocr.v1beta1.QueryProto.internal_static_injective_ocr_v1beta1_QueryLatestRoundRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.ocr.v1beta1.QueryProto.internal_static_injective_ocr_v1beta1_QueryLatestRoundRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.ocr.v1beta1.QueryLatestRoundRequest.class, com.injective.ocr.v1beta1.QueryLatestRoundRequest.Builder.class);
  }

  public static final int FEED_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object feedId_ = "";
  /**
   * <code>string feed_id = 1 [json_name = "feedId"];</code>
   * @return The feedId.
   */
  @java.lang.Override
  public java.lang.String getFeedId() {
    java.lang.Object ref = feedId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feedId_ = s;
      return s;
    }
  }
  /**
   * <code>string feed_id = 1 [json_name = "feedId"];</code>
   * @return The bytes for feedId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeedIdBytes() {
    java.lang.Object ref = feedId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feedId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feedId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, feedId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feedId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, feedId_);
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
    if (!(obj instanceof com.injective.ocr.v1beta1.QueryLatestRoundRequest)) {
      return super.equals(obj);
    }
    com.injective.ocr.v1beta1.QueryLatestRoundRequest other = (com.injective.ocr.v1beta1.QueryLatestRoundRequest) obj;

    if (!getFeedId()
        .equals(other.getFeedId())) return false;
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
    hash = (37 * hash) + FEED_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFeedId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest parseFrom(
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
  public static Builder newBuilder(com.injective.ocr.v1beta1.QueryLatestRoundRequest prototype) {
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
   * Protobuf type {@code injective.ocr.v1beta1.QueryLatestRoundRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.ocr.v1beta1.QueryLatestRoundRequest)
      com.injective.ocr.v1beta1.QueryLatestRoundRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.ocr.v1beta1.QueryProto.internal_static_injective_ocr_v1beta1_QueryLatestRoundRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.ocr.v1beta1.QueryProto.internal_static_injective_ocr_v1beta1_QueryLatestRoundRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.ocr.v1beta1.QueryLatestRoundRequest.class, com.injective.ocr.v1beta1.QueryLatestRoundRequest.Builder.class);
    }

    // Construct using com.injective.ocr.v1beta1.QueryLatestRoundRequest.newBuilder()
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
      feedId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.ocr.v1beta1.QueryProto.internal_static_injective_ocr_v1beta1_QueryLatestRoundRequest_descriptor;
    }

    @java.lang.Override
    public com.injective.ocr.v1beta1.QueryLatestRoundRequest getDefaultInstanceForType() {
      return com.injective.ocr.v1beta1.QueryLatestRoundRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.ocr.v1beta1.QueryLatestRoundRequest build() {
      com.injective.ocr.v1beta1.QueryLatestRoundRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.ocr.v1beta1.QueryLatestRoundRequest buildPartial() {
      com.injective.ocr.v1beta1.QueryLatestRoundRequest result = new com.injective.ocr.v1beta1.QueryLatestRoundRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.ocr.v1beta1.QueryLatestRoundRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.feedId_ = feedId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.ocr.v1beta1.QueryLatestRoundRequest) {
        return mergeFrom((com.injective.ocr.v1beta1.QueryLatestRoundRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.ocr.v1beta1.QueryLatestRoundRequest other) {
      if (other == com.injective.ocr.v1beta1.QueryLatestRoundRequest.getDefaultInstance()) return this;
      if (!other.getFeedId().isEmpty()) {
        feedId_ = other.feedId_;
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
              feedId_ = input.readStringRequireUtf8();
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

    private java.lang.Object feedId_ = "";
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @return The feedId.
     */
    public java.lang.String getFeedId() {
      java.lang.Object ref = feedId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feedId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @return The bytes for feedId.
     */
    public com.google.protobuf.ByteString
        getFeedIdBytes() {
      java.lang.Object ref = feedId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feedId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @param value The feedId to set.
     * @return This builder for chaining.
     */
    public Builder setFeedId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      feedId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedId() {
      feedId_ = getDefaultInstance().getFeedId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string feed_id = 1 [json_name = "feedId"];</code>
     * @param value The bytes for feedId to set.
     * @return This builder for chaining.
     */
    public Builder setFeedIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      feedId_ = value;
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


    // @@protoc_insertion_point(builder_scope:injective.ocr.v1beta1.QueryLatestRoundRequest)
  }

  // @@protoc_insertion_point(class_scope:injective.ocr.v1beta1.QueryLatestRoundRequest)
  private static final com.injective.ocr.v1beta1.QueryLatestRoundRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.ocr.v1beta1.QueryLatestRoundRequest();
  }

  public static com.injective.ocr.v1beta1.QueryLatestRoundRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryLatestRoundRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryLatestRoundRequest>() {
    @java.lang.Override
    public QueryLatestRoundRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryLatestRoundRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryLatestRoundRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.ocr.v1beta1.QueryLatestRoundRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

