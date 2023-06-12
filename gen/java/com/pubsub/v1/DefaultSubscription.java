// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/pubsub.proto

package com.pubsub.v1;

/**
 * <pre>
 * represents a default subscription voted in by governance that can be overridden by a subscriber
 * </pre>
 *
 * Protobuf type {@code pubsub.v1.DefaultSubscription}
 */
public final class DefaultSubscription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pubsub.v1.DefaultSubscription)
    DefaultSubscriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DefaultSubscription.newBuilder() to construct.
  private DefaultSubscription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DefaultSubscription() {
    subscriptionId_ = "";
    publisherDomain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DefaultSubscription();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pubsub.v1.PubsubProto.internal_static_pubsub_v1_DefaultSubscription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pubsub.v1.PubsubProto.internal_static_pubsub_v1_DefaultSubscription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pubsub.v1.DefaultSubscription.class, com.pubsub.v1.DefaultSubscription.Builder.class);
  }

  public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subscriptionId_ = "";
  /**
   * <pre>
   * arbitary string representing a subscription, max length of 128
   * </pre>
   *
   * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
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
   * <pre>
   * arbitary string representing a subscription, max length of 128
   * </pre>
   *
   * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
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

  public static final int PUBLISHER_DOMAIN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object publisherDomain_ = "";
  /**
   * <pre>
   * FQDN of the publisher, max length of 256
   * </pre>
   *
   * <code>string publisher_domain = 2 [json_name = "publisherDomain"];</code>
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
   * <pre>
   * FQDN of the publisher, max length of 256
   * </pre>
   *
   * <code>string publisher_domain = 2 [json_name = "publisherDomain"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriptionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscriptionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publisherDomain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, publisherDomain_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscriptionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscriptionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publisherDomain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, publisherDomain_);
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
    if (!(obj instanceof com.pubsub.v1.DefaultSubscription)) {
      return super.equals(obj);
    }
    com.pubsub.v1.DefaultSubscription other = (com.pubsub.v1.DefaultSubscription) obj;

    if (!getSubscriptionId()
        .equals(other.getSubscriptionId())) return false;
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
    hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriptionId().hashCode();
    hash = (37 * hash) + PUBLISHER_DOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getPublisherDomain().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pubsub.v1.DefaultSubscription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pubsub.v1.DefaultSubscription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pubsub.v1.DefaultSubscription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.DefaultSubscription parseFrom(
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
  public static Builder newBuilder(com.pubsub.v1.DefaultSubscription prototype) {
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
   * represents a default subscription voted in by governance that can be overridden by a subscriber
   * </pre>
   *
   * Protobuf type {@code pubsub.v1.DefaultSubscription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pubsub.v1.DefaultSubscription)
      com.pubsub.v1.DefaultSubscriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pubsub.v1.PubsubProto.internal_static_pubsub_v1_DefaultSubscription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pubsub.v1.PubsubProto.internal_static_pubsub_v1_DefaultSubscription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pubsub.v1.DefaultSubscription.class, com.pubsub.v1.DefaultSubscription.Builder.class);
    }

    // Construct using com.pubsub.v1.DefaultSubscription.newBuilder()
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
      subscriptionId_ = "";
      publisherDomain_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pubsub.v1.PubsubProto.internal_static_pubsub_v1_DefaultSubscription_descriptor;
    }

    @java.lang.Override
    public com.pubsub.v1.DefaultSubscription getDefaultInstanceForType() {
      return com.pubsub.v1.DefaultSubscription.getDefaultInstance();
    }

    @java.lang.Override
    public com.pubsub.v1.DefaultSubscription build() {
      com.pubsub.v1.DefaultSubscription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pubsub.v1.DefaultSubscription buildPartial() {
      com.pubsub.v1.DefaultSubscription result = new com.pubsub.v1.DefaultSubscription(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.pubsub.v1.DefaultSubscription result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscriptionId_ = subscriptionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.publisherDomain_ = publisherDomain_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pubsub.v1.DefaultSubscription) {
        return mergeFrom((com.pubsub.v1.DefaultSubscription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pubsub.v1.DefaultSubscription other) {
      if (other == com.pubsub.v1.DefaultSubscription.getDefaultInstance()) return this;
      if (!other.getSubscriptionId().isEmpty()) {
        subscriptionId_ = other.subscriptionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPublisherDomain().isEmpty()) {
        publisherDomain_ = other.publisherDomain_;
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
              subscriptionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              publisherDomain_ = input.readStringRequireUtf8();
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

    private java.lang.Object subscriptionId_ = "";
    /**
     * <pre>
     * arbitary string representing a subscription, max length of 128
     * </pre>
     *
     * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
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
     * <pre>
     * arbitary string representing a subscription, max length of 128
     * </pre>
     *
     * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
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
     * <pre>
     * arbitary string representing a subscription, max length of 128
     * </pre>
     *
     * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
     * @param value The subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subscriptionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * arbitary string representing a subscription, max length of 128
     * </pre>
     *
     * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscriptionId() {
      subscriptionId_ = getDefaultInstance().getSubscriptionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * arbitary string representing a subscription, max length of 128
     * </pre>
     *
     * <code>string subscription_id = 1 [json_name = "subscriptionId"];</code>
     * @param value The bytes for subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subscriptionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object publisherDomain_ = "";
    /**
     * <pre>
     * FQDN of the publisher, max length of 256
     * </pre>
     *
     * <code>string publisher_domain = 2 [json_name = "publisherDomain"];</code>
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
     * <pre>
     * FQDN of the publisher, max length of 256
     * </pre>
     *
     * <code>string publisher_domain = 2 [json_name = "publisherDomain"];</code>
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
     * <pre>
     * FQDN of the publisher, max length of 256
     * </pre>
     *
     * <code>string publisher_domain = 2 [json_name = "publisherDomain"];</code>
     * @param value The publisherDomain to set.
     * @return This builder for chaining.
     */
    public Builder setPublisherDomain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      publisherDomain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FQDN of the publisher, max length of 256
     * </pre>
     *
     * <code>string publisher_domain = 2 [json_name = "publisherDomain"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublisherDomain() {
      publisherDomain_ = getDefaultInstance().getPublisherDomain();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FQDN of the publisher, max length of 256
     * </pre>
     *
     * <code>string publisher_domain = 2 [json_name = "publisherDomain"];</code>
     * @param value The bytes for publisherDomain to set.
     * @return This builder for chaining.
     */
    public Builder setPublisherDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      publisherDomain_ = value;
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


    // @@protoc_insertion_point(builder_scope:pubsub.v1.DefaultSubscription)
  }

  // @@protoc_insertion_point(class_scope:pubsub.v1.DefaultSubscription)
  private static final com.pubsub.v1.DefaultSubscription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pubsub.v1.DefaultSubscription();
  }

  public static com.pubsub.v1.DefaultSubscription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DefaultSubscription>
      PARSER = new com.google.protobuf.AbstractParser<DefaultSubscription>() {
    @java.lang.Override
    public DefaultSubscription parsePartialFrom(
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

  public static com.google.protobuf.Parser<DefaultSubscription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DefaultSubscription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pubsub.v1.DefaultSubscription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

