// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/query.proto

package com.pubsub.v1;

/**
 * Protobuf type {@code pubsub.v1.QuerySubscriberIntentRequest}
 */
public final class QuerySubscriberIntentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pubsub.v1.QuerySubscriberIntentRequest)
    QuerySubscriberIntentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySubscriberIntentRequest.newBuilder() to construct.
  private QuerySubscriberIntentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySubscriberIntentRequest() {
    subscriberAddress_ = "";
    subscriptionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySubscriberIntentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberIntentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberIntentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pubsub.v1.QuerySubscriberIntentRequest.class, com.pubsub.v1.QuerySubscriberIntentRequest.Builder.class);
  }

  public static final int SUBSCRIBER_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subscriberAddress_ = "";
  /**
   * <code>string subscriber_address = 1 [json_name = "subscriberAddress"];</code>
   * @return The subscriberAddress.
   */
  @java.lang.Override
  public java.lang.String getSubscriberAddress() {
    java.lang.Object ref = subscriberAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriberAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string subscriber_address = 1 [json_name = "subscriberAddress"];</code>
   * @return The bytes for subscriberAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubscriberAddressBytes() {
    java.lang.Object ref = subscriberAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscriberAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subscriptionId_ = "";
  /**
   * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
   * @return The subscriptionId.
   */
  @java.lang.Override
  public java.lang.String getSubscriptionId() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriptionId_ = s;
      return s;
    }
  }
  /**
   * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
   * @return The bytes for subscriptionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubscriptionIdBytes() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscriptionId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriberAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscriberAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriptionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subscriptionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriberAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscriberAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriptionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subscriptionId_);
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
    if (!(obj instanceof com.pubsub.v1.QuerySubscriberIntentRequest)) {
      return super.equals(obj);
    }
    com.pubsub.v1.QuerySubscriberIntentRequest other = (com.pubsub.v1.QuerySubscriberIntentRequest) obj;

    if (!getSubscriberAddress()
        .equals(other.getSubscriberAddress())) return false;
    if (!getSubscriptionId()
        .equals(other.getSubscriptionId())) return false;
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
    hash = (37 * hash) + SUBSCRIBER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriberAddress().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriptionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pubsub.v1.QuerySubscriberIntentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pubsub.v1.QuerySubscriberIntentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QuerySubscriberIntentRequest parseFrom(
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
  public static Builder newBuilder(com.pubsub.v1.QuerySubscriberIntentRequest prototype) {
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
   * Protobuf type {@code pubsub.v1.QuerySubscriberIntentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pubsub.v1.QuerySubscriberIntentRequest)
      com.pubsub.v1.QuerySubscriberIntentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberIntentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberIntentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pubsub.v1.QuerySubscriberIntentRequest.class, com.pubsub.v1.QuerySubscriberIntentRequest.Builder.class);
    }

    // Construct using com.pubsub.v1.QuerySubscriberIntentRequest.newBuilder()
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
      subscriberAddress_ = "";
      subscriptionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberIntentRequest_descriptor;
    }

    @java.lang.Override
    public com.pubsub.v1.QuerySubscriberIntentRequest getDefaultInstanceForType() {
      return com.pubsub.v1.QuerySubscriberIntentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.pubsub.v1.QuerySubscriberIntentRequest build() {
      com.pubsub.v1.QuerySubscriberIntentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pubsub.v1.QuerySubscriberIntentRequest buildPartial() {
      com.pubsub.v1.QuerySubscriberIntentRequest result = new com.pubsub.v1.QuerySubscriberIntentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.pubsub.v1.QuerySubscriberIntentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscriberAddress_ = subscriberAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subscriptionId_ = subscriptionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pubsub.v1.QuerySubscriberIntentRequest) {
        return mergeFrom((com.pubsub.v1.QuerySubscriberIntentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pubsub.v1.QuerySubscriberIntentRequest other) {
      if (other == com.pubsub.v1.QuerySubscriberIntentRequest.getDefaultInstance()) return this;
      if (!other.getSubscriberAddress().isEmpty()) {
        subscriberAddress_ = other.subscriberAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSubscriptionId().isEmpty()) {
        subscriptionId_ = other.subscriptionId_;
        bitField0_ |= 0x00000002;
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
              subscriberAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              subscriptionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object subscriberAddress_ = "";
    /**
     * <code>string subscriber_address = 1 [json_name = "subscriberAddress"];</code>
     * @return The subscriberAddress.
     */
    public java.lang.String getSubscriberAddress() {
      java.lang.Object ref = subscriberAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriberAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subscriber_address = 1 [json_name = "subscriberAddress"];</code>
     * @return The bytes for subscriberAddress.
     */
    public com.google.protobuf.ByteString
        getSubscriberAddressBytes() {
      java.lang.Object ref = subscriberAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscriberAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subscriber_address = 1 [json_name = "subscriberAddress"];</code>
     * @param value The subscriberAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriberAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subscriberAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string subscriber_address = 1 [json_name = "subscriberAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscriberAddress() {
      subscriberAddress_ = getDefaultInstance().getSubscriberAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string subscriber_address = 1 [json_name = "subscriberAddress"];</code>
     * @param value The bytes for subscriberAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriberAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subscriberAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object subscriptionId_ = "";
    /**
     * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
     * @return The subscriptionId.
     */
    public java.lang.String getSubscriptionId() {
      java.lang.Object ref = subscriptionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriptionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
     * @return The bytes for subscriptionId.
     */
    public com.google.protobuf.ByteString
        getSubscriptionIdBytes() {
      java.lang.Object ref = subscriptionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscriptionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
     * @param value The subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subscriptionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscriptionId() {
      subscriptionId_ = getDefaultInstance().getSubscriptionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string subscription_id = 2 [json_name = "subscriptionId"];</code>
     * @param value The bytes for subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subscriptionId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:pubsub.v1.QuerySubscriberIntentRequest)
  }

  // @@protoc_insertion_point(class_scope:pubsub.v1.QuerySubscriberIntentRequest)
  private static final com.pubsub.v1.QuerySubscriberIntentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pubsub.v1.QuerySubscriberIntentRequest();
  }

  public static com.pubsub.v1.QuerySubscriberIntentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySubscriberIntentRequest>
      PARSER = new com.google.protobuf.AbstractParser<QuerySubscriberIntentRequest>() {
    @java.lang.Override
    public QuerySubscriberIntentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySubscriberIntentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySubscriberIntentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pubsub.v1.QuerySubscriberIntentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

