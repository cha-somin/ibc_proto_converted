// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/query.proto

package com.pubsub.v1;

/**
 * Protobuf type {@code pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse}
 */
public final class QueryPublisherIntentsByPublisherDomainResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse)
    QueryPublisherIntentsByPublisherDomainResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPublisherIntentsByPublisherDomainResponse.newBuilder() to construct.
  private QueryPublisherIntentsByPublisherDomainResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPublisherIntentsByPublisherDomainResponse() {
    publisherIntents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPublisherIntentsByPublisherDomainResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse.class, com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse.Builder.class);
  }

  public static final int PUBLISHER_INTENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.pubsub.v1.PublisherIntent> publisherIntents_;
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
   */
  @java.lang.Override
  public java.util.List<com.pubsub.v1.PublisherIntent> getPublisherIntentsList() {
    return publisherIntents_;
  }
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.pubsub.v1.PublisherIntentOrBuilder> 
      getPublisherIntentsOrBuilderList() {
    return publisherIntents_;
  }
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
   */
  @java.lang.Override
  public int getPublisherIntentsCount() {
    return publisherIntents_.size();
  }
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
   */
  @java.lang.Override
  public com.pubsub.v1.PublisherIntent getPublisherIntents(int index) {
    return publisherIntents_.get(index);
  }
  /**
   * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
   */
  @java.lang.Override
  public com.pubsub.v1.PublisherIntentOrBuilder getPublisherIntentsOrBuilder(
      int index) {
    return publisherIntents_.get(index);
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
    for (int i = 0; i < publisherIntents_.size(); i++) {
      output.writeMessage(1, publisherIntents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < publisherIntents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, publisherIntents_.get(i));
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
    if (!(obj instanceof com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse)) {
      return super.equals(obj);
    }
    com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse other = (com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse) obj;

    if (!getPublisherIntentsList()
        .equals(other.getPublisherIntentsList())) return false;
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
    if (getPublisherIntentsCount() > 0) {
      hash = (37 * hash) + PUBLISHER_INTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getPublisherIntentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse parseFrom(
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
  public static Builder newBuilder(com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse prototype) {
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
   * Protobuf type {@code pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse)
      com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse.class, com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse.Builder.class);
    }

    // Construct using com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse.newBuilder()
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
      if (publisherIntentsBuilder_ == null) {
        publisherIntents_ = java.util.Collections.emptyList();
      } else {
        publisherIntents_ = null;
        publisherIntentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pubsub.v1.QueryProto.internal_static_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse_descriptor;
    }

    @java.lang.Override
    public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse getDefaultInstanceForType() {
      return com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse build() {
      com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse buildPartial() {
      com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse result = new com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse result) {
      if (publisherIntentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          publisherIntents_ = java.util.Collections.unmodifiableList(publisherIntents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.publisherIntents_ = publisherIntents_;
      } else {
        result.publisherIntents_ = publisherIntentsBuilder_.build();
      }
    }

    private void buildPartial0(com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse) {
        return mergeFrom((com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse other) {
      if (other == com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse.getDefaultInstance()) return this;
      if (publisherIntentsBuilder_ == null) {
        if (!other.publisherIntents_.isEmpty()) {
          if (publisherIntents_.isEmpty()) {
            publisherIntents_ = other.publisherIntents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePublisherIntentsIsMutable();
            publisherIntents_.addAll(other.publisherIntents_);
          }
          onChanged();
        }
      } else {
        if (!other.publisherIntents_.isEmpty()) {
          if (publisherIntentsBuilder_.isEmpty()) {
            publisherIntentsBuilder_.dispose();
            publisherIntentsBuilder_ = null;
            publisherIntents_ = other.publisherIntents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            publisherIntentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPublisherIntentsFieldBuilder() : null;
          } else {
            publisherIntentsBuilder_.addAllMessages(other.publisherIntents_);
          }
        }
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
              com.pubsub.v1.PublisherIntent m =
                  input.readMessage(
                      com.pubsub.v1.PublisherIntent.parser(),
                      extensionRegistry);
              if (publisherIntentsBuilder_ == null) {
                ensurePublisherIntentsIsMutable();
                publisherIntents_.add(m);
              } else {
                publisherIntentsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.pubsub.v1.PublisherIntent> publisherIntents_ =
      java.util.Collections.emptyList();
    private void ensurePublisherIntentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        publisherIntents_ = new java.util.ArrayList<com.pubsub.v1.PublisherIntent>(publisherIntents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pubsub.v1.PublisherIntent, com.pubsub.v1.PublisherIntent.Builder, com.pubsub.v1.PublisherIntentOrBuilder> publisherIntentsBuilder_;

    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public java.util.List<com.pubsub.v1.PublisherIntent> getPublisherIntentsList() {
      if (publisherIntentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(publisherIntents_);
      } else {
        return publisherIntentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public int getPublisherIntentsCount() {
      if (publisherIntentsBuilder_ == null) {
        return publisherIntents_.size();
      } else {
        return publisherIntentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public com.pubsub.v1.PublisherIntent getPublisherIntents(int index) {
      if (publisherIntentsBuilder_ == null) {
        return publisherIntents_.get(index);
      } else {
        return publisherIntentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder setPublisherIntents(
        int index, com.pubsub.v1.PublisherIntent value) {
      if (publisherIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePublisherIntentsIsMutable();
        publisherIntents_.set(index, value);
        onChanged();
      } else {
        publisherIntentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder setPublisherIntents(
        int index, com.pubsub.v1.PublisherIntent.Builder builderForValue) {
      if (publisherIntentsBuilder_ == null) {
        ensurePublisherIntentsIsMutable();
        publisherIntents_.set(index, builderForValue.build());
        onChanged();
      } else {
        publisherIntentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder addPublisherIntents(com.pubsub.v1.PublisherIntent value) {
      if (publisherIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePublisherIntentsIsMutable();
        publisherIntents_.add(value);
        onChanged();
      } else {
        publisherIntentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder addPublisherIntents(
        int index, com.pubsub.v1.PublisherIntent value) {
      if (publisherIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePublisherIntentsIsMutable();
        publisherIntents_.add(index, value);
        onChanged();
      } else {
        publisherIntentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder addPublisherIntents(
        com.pubsub.v1.PublisherIntent.Builder builderForValue) {
      if (publisherIntentsBuilder_ == null) {
        ensurePublisherIntentsIsMutable();
        publisherIntents_.add(builderForValue.build());
        onChanged();
      } else {
        publisherIntentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder addPublisherIntents(
        int index, com.pubsub.v1.PublisherIntent.Builder builderForValue) {
      if (publisherIntentsBuilder_ == null) {
        ensurePublisherIntentsIsMutable();
        publisherIntents_.add(index, builderForValue.build());
        onChanged();
      } else {
        publisherIntentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder addAllPublisherIntents(
        java.lang.Iterable<? extends com.pubsub.v1.PublisherIntent> values) {
      if (publisherIntentsBuilder_ == null) {
        ensurePublisherIntentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, publisherIntents_);
        onChanged();
      } else {
        publisherIntentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder clearPublisherIntents() {
      if (publisherIntentsBuilder_ == null) {
        publisherIntents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        publisherIntentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public Builder removePublisherIntents(int index) {
      if (publisherIntentsBuilder_ == null) {
        ensurePublisherIntentsIsMutable();
        publisherIntents_.remove(index);
        onChanged();
      } else {
        publisherIntentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public com.pubsub.v1.PublisherIntent.Builder getPublisherIntentsBuilder(
        int index) {
      return getPublisherIntentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public com.pubsub.v1.PublisherIntentOrBuilder getPublisherIntentsOrBuilder(
        int index) {
      if (publisherIntentsBuilder_ == null) {
        return publisherIntents_.get(index);  } else {
        return publisherIntentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public java.util.List<? extends com.pubsub.v1.PublisherIntentOrBuilder> 
         getPublisherIntentsOrBuilderList() {
      if (publisherIntentsBuilder_ != null) {
        return publisherIntentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(publisherIntents_);
      }
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public com.pubsub.v1.PublisherIntent.Builder addPublisherIntentsBuilder() {
      return getPublisherIntentsFieldBuilder().addBuilder(
          com.pubsub.v1.PublisherIntent.getDefaultInstance());
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public com.pubsub.v1.PublisherIntent.Builder addPublisherIntentsBuilder(
        int index) {
      return getPublisherIntentsFieldBuilder().addBuilder(
          index, com.pubsub.v1.PublisherIntent.getDefaultInstance());
    }
    /**
     * <code>repeated .pubsub.v1.PublisherIntent publisher_intents = 1 [json_name = "publisherIntents"];</code>
     */
    public java.util.List<com.pubsub.v1.PublisherIntent.Builder> 
         getPublisherIntentsBuilderList() {
      return getPublisherIntentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pubsub.v1.PublisherIntent, com.pubsub.v1.PublisherIntent.Builder, com.pubsub.v1.PublisherIntentOrBuilder> 
        getPublisherIntentsFieldBuilder() {
      if (publisherIntentsBuilder_ == null) {
        publisherIntentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pubsub.v1.PublisherIntent, com.pubsub.v1.PublisherIntent.Builder, com.pubsub.v1.PublisherIntentOrBuilder>(
                publisherIntents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        publisherIntents_ = null;
      }
      return publisherIntentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse)
  }

  // @@protoc_insertion_point(class_scope:pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse)
  private static final com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse();
  }

  public static com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPublisherIntentsByPublisherDomainResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryPublisherIntentsByPublisherDomainResponse>() {
    @java.lang.Override
    public QueryPublisherIntentsByPublisherDomainResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPublisherIntentsByPublisherDomainResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPublisherIntentsByPublisherDomainResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

