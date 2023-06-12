// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/bridge/query.proto

package com.stafihub.stafihub.bridge;

/**
 * Protobuf type {@code stafihub.stafihub.bridge.QueryResourceidToDenomsResponse}
 */
public final class QueryResourceidToDenomsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.bridge.QueryResourceidToDenomsResponse)
    QueryResourceidToDenomsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryResourceidToDenomsResponse.newBuilder() to construct.
  private QueryResourceidToDenomsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryResourceidToDenomsResponse() {
    resourceidToDenoms_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryResourceidToDenomsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.bridge.QueryProto.internal_static_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.bridge.QueryProto.internal_static_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse.class, com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse.Builder.class);
  }

  public static final int RESOURCEIDTODENOMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.stafihub.stafihub.bridge.ResourceIdToDenom> resourceidToDenoms_;
  /**
   * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
   */
  @java.lang.Override
  public java.util.List<com.stafihub.stafihub.bridge.ResourceIdToDenom> getResourceidToDenomsList() {
    return resourceidToDenoms_;
  }
  /**
   * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.stafihub.stafihub.bridge.ResourceIdToDenomOrBuilder> 
      getResourceidToDenomsOrBuilderList() {
    return resourceidToDenoms_;
  }
  /**
   * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
   */
  @java.lang.Override
  public int getResourceidToDenomsCount() {
    return resourceidToDenoms_.size();
  }
  /**
   * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
   */
  @java.lang.Override
  public com.stafihub.stafihub.bridge.ResourceIdToDenom getResourceidToDenoms(int index) {
    return resourceidToDenoms_.get(index);
  }
  /**
   * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
   */
  @java.lang.Override
  public com.stafihub.stafihub.bridge.ResourceIdToDenomOrBuilder getResourceidToDenomsOrBuilder(
      int index) {
    return resourceidToDenoms_.get(index);
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
    for (int i = 0; i < resourceidToDenoms_.size(); i++) {
      output.writeMessage(1, resourceidToDenoms_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < resourceidToDenoms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, resourceidToDenoms_.get(i));
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
    if (!(obj instanceof com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse other = (com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse) obj;

    if (!getResourceidToDenomsList()
        .equals(other.getResourceidToDenomsList())) return false;
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
    if (getResourceidToDenomsCount() > 0) {
      hash = (37 * hash) + RESOURCEIDTODENOMS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceidToDenomsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse prototype) {
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
   * Protobuf type {@code stafihub.stafihub.bridge.QueryResourceidToDenomsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.bridge.QueryResourceidToDenomsResponse)
      com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.bridge.QueryProto.internal_static_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.bridge.QueryProto.internal_static_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse.class, com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse.Builder.class);
    }

    // Construct using com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse.newBuilder()
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
      if (resourceidToDenomsBuilder_ == null) {
        resourceidToDenoms_ = java.util.Collections.emptyList();
      } else {
        resourceidToDenoms_ = null;
        resourceidToDenomsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.bridge.QueryProto.internal_static_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse getDefaultInstanceForType() {
      return com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse build() {
      com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse buildPartial() {
      com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse result = new com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse result) {
      if (resourceidToDenomsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          resourceidToDenoms_ = java.util.Collections.unmodifiableList(resourceidToDenoms_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceidToDenoms_ = resourceidToDenoms_;
      } else {
        result.resourceidToDenoms_ = resourceidToDenomsBuilder_.build();
      }
    }

    private void buildPartial0(com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse) {
        return mergeFrom((com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse other) {
      if (other == com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse.getDefaultInstance()) return this;
      if (resourceidToDenomsBuilder_ == null) {
        if (!other.resourceidToDenoms_.isEmpty()) {
          if (resourceidToDenoms_.isEmpty()) {
            resourceidToDenoms_ = other.resourceidToDenoms_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceidToDenomsIsMutable();
            resourceidToDenoms_.addAll(other.resourceidToDenoms_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceidToDenoms_.isEmpty()) {
          if (resourceidToDenomsBuilder_.isEmpty()) {
            resourceidToDenomsBuilder_.dispose();
            resourceidToDenomsBuilder_ = null;
            resourceidToDenoms_ = other.resourceidToDenoms_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceidToDenomsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResourceidToDenomsFieldBuilder() : null;
          } else {
            resourceidToDenomsBuilder_.addAllMessages(other.resourceidToDenoms_);
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
              com.stafihub.stafihub.bridge.ResourceIdToDenom m =
                  input.readMessage(
                      com.stafihub.stafihub.bridge.ResourceIdToDenom.parser(),
                      extensionRegistry);
              if (resourceidToDenomsBuilder_ == null) {
                ensureResourceidToDenomsIsMutable();
                resourceidToDenoms_.add(m);
              } else {
                resourceidToDenomsBuilder_.addMessage(m);
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

    private java.util.List<com.stafihub.stafihub.bridge.ResourceIdToDenom> resourceidToDenoms_ =
      java.util.Collections.emptyList();
    private void ensureResourceidToDenomsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceidToDenoms_ = new java.util.ArrayList<com.stafihub.stafihub.bridge.ResourceIdToDenom>(resourceidToDenoms_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.stafihub.stafihub.bridge.ResourceIdToDenom, com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder, com.stafihub.stafihub.bridge.ResourceIdToDenomOrBuilder> resourceidToDenomsBuilder_;

    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public java.util.List<com.stafihub.stafihub.bridge.ResourceIdToDenom> getResourceidToDenomsList() {
      if (resourceidToDenomsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceidToDenoms_);
      } else {
        return resourceidToDenomsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public int getResourceidToDenomsCount() {
      if (resourceidToDenomsBuilder_ == null) {
        return resourceidToDenoms_.size();
      } else {
        return resourceidToDenomsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public com.stafihub.stafihub.bridge.ResourceIdToDenom getResourceidToDenoms(int index) {
      if (resourceidToDenomsBuilder_ == null) {
        return resourceidToDenoms_.get(index);
      } else {
        return resourceidToDenomsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder setResourceidToDenoms(
        int index, com.stafihub.stafihub.bridge.ResourceIdToDenom value) {
      if (resourceidToDenomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceidToDenomsIsMutable();
        resourceidToDenoms_.set(index, value);
        onChanged();
      } else {
        resourceidToDenomsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder setResourceidToDenoms(
        int index, com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder builderForValue) {
      if (resourceidToDenomsBuilder_ == null) {
        ensureResourceidToDenomsIsMutable();
        resourceidToDenoms_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceidToDenomsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder addResourceidToDenoms(com.stafihub.stafihub.bridge.ResourceIdToDenom value) {
      if (resourceidToDenomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceidToDenomsIsMutable();
        resourceidToDenoms_.add(value);
        onChanged();
      } else {
        resourceidToDenomsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder addResourceidToDenoms(
        int index, com.stafihub.stafihub.bridge.ResourceIdToDenom value) {
      if (resourceidToDenomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceidToDenomsIsMutable();
        resourceidToDenoms_.add(index, value);
        onChanged();
      } else {
        resourceidToDenomsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder addResourceidToDenoms(
        com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder builderForValue) {
      if (resourceidToDenomsBuilder_ == null) {
        ensureResourceidToDenomsIsMutable();
        resourceidToDenoms_.add(builderForValue.build());
        onChanged();
      } else {
        resourceidToDenomsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder addResourceidToDenoms(
        int index, com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder builderForValue) {
      if (resourceidToDenomsBuilder_ == null) {
        ensureResourceidToDenomsIsMutable();
        resourceidToDenoms_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceidToDenomsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder addAllResourceidToDenoms(
        java.lang.Iterable<? extends com.stafihub.stafihub.bridge.ResourceIdToDenom> values) {
      if (resourceidToDenomsBuilder_ == null) {
        ensureResourceidToDenomsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resourceidToDenoms_);
        onChanged();
      } else {
        resourceidToDenomsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder clearResourceidToDenoms() {
      if (resourceidToDenomsBuilder_ == null) {
        resourceidToDenoms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceidToDenomsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public Builder removeResourceidToDenoms(int index) {
      if (resourceidToDenomsBuilder_ == null) {
        ensureResourceidToDenomsIsMutable();
        resourceidToDenoms_.remove(index);
        onChanged();
      } else {
        resourceidToDenomsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder getResourceidToDenomsBuilder(
        int index) {
      return getResourceidToDenomsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public com.stafihub.stafihub.bridge.ResourceIdToDenomOrBuilder getResourceidToDenomsOrBuilder(
        int index) {
      if (resourceidToDenomsBuilder_ == null) {
        return resourceidToDenoms_.get(index);  } else {
        return resourceidToDenomsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public java.util.List<? extends com.stafihub.stafihub.bridge.ResourceIdToDenomOrBuilder> 
         getResourceidToDenomsOrBuilderList() {
      if (resourceidToDenomsBuilder_ != null) {
        return resourceidToDenomsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceidToDenoms_);
      }
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder addResourceidToDenomsBuilder() {
      return getResourceidToDenomsFieldBuilder().addBuilder(
          com.stafihub.stafihub.bridge.ResourceIdToDenom.getDefaultInstance());
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder addResourceidToDenomsBuilder(
        int index) {
      return getResourceidToDenomsFieldBuilder().addBuilder(
          index, com.stafihub.stafihub.bridge.ResourceIdToDenom.getDefaultInstance());
    }
    /**
     * <code>repeated .stafihub.stafihub.bridge.ResourceIdToDenom resourceidToDenoms = 1 [json_name = "resourceidToDenoms"];</code>
     */
    public java.util.List<com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder> 
         getResourceidToDenomsBuilderList() {
      return getResourceidToDenomsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.stafihub.stafihub.bridge.ResourceIdToDenom, com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder, com.stafihub.stafihub.bridge.ResourceIdToDenomOrBuilder> 
        getResourceidToDenomsFieldBuilder() {
      if (resourceidToDenomsBuilder_ == null) {
        resourceidToDenomsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.stafihub.stafihub.bridge.ResourceIdToDenom, com.stafihub.stafihub.bridge.ResourceIdToDenom.Builder, com.stafihub.stafihub.bridge.ResourceIdToDenomOrBuilder>(
                resourceidToDenoms_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        resourceidToDenoms_ = null;
      }
      return resourceidToDenomsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.bridge.QueryResourceidToDenomsResponse)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.bridge.QueryResourceidToDenomsResponse)
  private static final com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse();
  }

  public static com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryResourceidToDenomsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryResourceidToDenomsResponse>() {
    @java.lang.Override
    public QueryResourceidToDenomsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryResourceidToDenomsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryResourceidToDenomsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.bridge.QueryResourceidToDenomsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

