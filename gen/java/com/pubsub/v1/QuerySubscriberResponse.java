// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/query.proto

package com.pubsub.v1;

/**
 * Protobuf type {@code pubsub.v1.QuerySubscriberResponse}
 */
public final class QuerySubscriberResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pubsub.v1.QuerySubscriberResponse)
    QuerySubscriberResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySubscriberResponse.newBuilder() to construct.
  private QuerySubscriberResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySubscriberResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySubscriberResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pubsub.v1.QuerySubscriberResponse.class, com.pubsub.v1.QuerySubscriberResponse.Builder.class);
  }

  public static final int SUBSCRIBER_FIELD_NUMBER = 1;
  private com.pubsub.v1.Subscriber subscriber_;
  /**
   * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
   * @return Whether the subscriber field is set.
   */
  @java.lang.Override
  public boolean hasSubscriber() {
    return subscriber_ != null;
  }
  /**
   * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
   * @return The subscriber.
   */
  @java.lang.Override
  public com.pubsub.v1.Subscriber getSubscriber() {
    return subscriber_ == null ? com.pubsub.v1.Subscriber.getDefaultInstance() : subscriber_;
  }
  /**
   * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
   */
  @java.lang.Override
  public com.pubsub.v1.SubscriberOrBuilder getSubscriberOrBuilder() {
    return subscriber_ == null ? com.pubsub.v1.Subscriber.getDefaultInstance() : subscriber_;
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
    if (subscriber_ != null) {
      output.writeMessage(1, getSubscriber());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subscriber_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSubscriber());
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
    if (!(obj instanceof com.pubsub.v1.QuerySubscriberResponse)) {
      return super.equals(obj);
    }
    com.pubsub.v1.QuerySubscriberResponse other = (com.pubsub.v1.QuerySubscriberResponse) obj;

    if (hasSubscriber() != other.hasSubscriber()) return false;
    if (hasSubscriber()) {
      if (!getSubscriber()
          .equals(other.getSubscriber())) return false;
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
    if (hasSubscriber()) {
      hash = (37 * hash) + SUBSCRIBER_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriber().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pubsub.v1.QuerySubscriberResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pubsub.v1.QuerySubscriberResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QuerySubscriberResponse parseFrom(
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
  public static Builder newBuilder(com.pubsub.v1.QuerySubscriberResponse prototype) {
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
   * Protobuf type {@code pubsub.v1.QuerySubscriberResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pubsub.v1.QuerySubscriberResponse)
      com.pubsub.v1.QuerySubscriberResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pubsub.v1.QuerySubscriberResponse.class, com.pubsub.v1.QuerySubscriberResponse.Builder.class);
    }

    // Construct using com.pubsub.v1.QuerySubscriberResponse.newBuilder()
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
      subscriber_ = null;
      if (subscriberBuilder_ != null) {
        subscriberBuilder_.dispose();
        subscriberBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QuerySubscriberResponse_descriptor;
    }

    @java.lang.Override
    public com.pubsub.v1.QuerySubscriberResponse getDefaultInstanceForType() {
      return com.pubsub.v1.QuerySubscriberResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.pubsub.v1.QuerySubscriberResponse build() {
      com.pubsub.v1.QuerySubscriberResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pubsub.v1.QuerySubscriberResponse buildPartial() {
      com.pubsub.v1.QuerySubscriberResponse result = new com.pubsub.v1.QuerySubscriberResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.pubsub.v1.QuerySubscriberResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscriber_ = subscriberBuilder_ == null
            ? subscriber_
            : subscriberBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pubsub.v1.QuerySubscriberResponse) {
        return mergeFrom((com.pubsub.v1.QuerySubscriberResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pubsub.v1.QuerySubscriberResponse other) {
      if (other == com.pubsub.v1.QuerySubscriberResponse.getDefaultInstance()) return this;
      if (other.hasSubscriber()) {
        mergeSubscriber(other.getSubscriber());
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
                  getSubscriberFieldBuilder().getBuilder(),
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

    private com.pubsub.v1.Subscriber subscriber_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pubsub.v1.Subscriber, com.pubsub.v1.Subscriber.Builder, com.pubsub.v1.SubscriberOrBuilder> subscriberBuilder_;
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     * @return Whether the subscriber field is set.
     */
    public boolean hasSubscriber() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     * @return The subscriber.
     */
    public com.pubsub.v1.Subscriber getSubscriber() {
      if (subscriberBuilder_ == null) {
        return subscriber_ == null ? com.pubsub.v1.Subscriber.getDefaultInstance() : subscriber_;
      } else {
        return subscriberBuilder_.getMessage();
      }
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     */
    public Builder setSubscriber(com.pubsub.v1.Subscriber value) {
      if (subscriberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subscriber_ = value;
      } else {
        subscriberBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     */
    public Builder setSubscriber(
        com.pubsub.v1.Subscriber.Builder builderForValue) {
      if (subscriberBuilder_ == null) {
        subscriber_ = builderForValue.build();
      } else {
        subscriberBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     */
    public Builder mergeSubscriber(com.pubsub.v1.Subscriber value) {
      if (subscriberBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          subscriber_ != null &&
          subscriber_ != com.pubsub.v1.Subscriber.getDefaultInstance()) {
          getSubscriberBuilder().mergeFrom(value);
        } else {
          subscriber_ = value;
        }
      } else {
        subscriberBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     */
    public Builder clearSubscriber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subscriber_ = null;
      if (subscriberBuilder_ != null) {
        subscriberBuilder_.dispose();
        subscriberBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     */
    public com.pubsub.v1.Subscriber.Builder getSubscriberBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubscriberFieldBuilder().getBuilder();
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     */
    public com.pubsub.v1.SubscriberOrBuilder getSubscriberOrBuilder() {
      if (subscriberBuilder_ != null) {
        return subscriberBuilder_.getMessageOrBuilder();
      } else {
        return subscriber_ == null ?
            com.pubsub.v1.Subscriber.getDefaultInstance() : subscriber_;
      }
    }
    /**
     * <code>.pubsub.v1.Subscriber subscriber = 1 [json_name = "subscriber"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pubsub.v1.Subscriber, com.pubsub.v1.Subscriber.Builder, com.pubsub.v1.SubscriberOrBuilder> 
        getSubscriberFieldBuilder() {
      if (subscriberBuilder_ == null) {
        subscriberBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.pubsub.v1.Subscriber, com.pubsub.v1.Subscriber.Builder, com.pubsub.v1.SubscriberOrBuilder>(
                getSubscriber(),
                getParentForChildren(),
                isClean());
        subscriber_ = null;
      }
      return subscriberBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pubsub.v1.QuerySubscriberResponse)
  }

  // @@protoc_insertion_point(class_scope:pubsub.v1.QuerySubscriberResponse)
  private static final com.pubsub.v1.QuerySubscriberResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pubsub.v1.QuerySubscriberResponse();
  }

  public static com.pubsub.v1.QuerySubscriberResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySubscriberResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySubscriberResponse>() {
    @java.lang.Override
    public QuerySubscriberResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySubscriberResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySubscriberResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pubsub.v1.QuerySubscriberResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

