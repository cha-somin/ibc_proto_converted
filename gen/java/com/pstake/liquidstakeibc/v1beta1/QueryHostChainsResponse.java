// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pstake/liquidstakeibc/v1beta1/query.proto

package com.pstake.liquidstakeibc.v1beta1;

/**
 * Protobuf type {@code pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse}
 */
public final class QueryHostChainsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse)
    QueryHostChainsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryHostChainsResponse.newBuilder() to construct.
  private QueryHostChainsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryHostChainsResponse() {
    hostChains_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryHostChainsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pstake.liquidstakeibc.v1beta1.QueryProto.internal_static_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pstake.liquidstakeibc.v1beta1.QueryProto.internal_static_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.class, com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.Builder.class);
  }

  public static final int HOST_CHAINS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.pstake.liquidstakeibc.v1beta1.HostChain> hostChains_;
  /**
   * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
   */
  @java.lang.Override
  public java.util.List<com.pstake.liquidstakeibc.v1beta1.HostChain> getHostChainsList() {
    return hostChains_;
  }
  /**
   * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.pstake.liquidstakeibc.v1beta1.HostChainOrBuilder> 
      getHostChainsOrBuilderList() {
    return hostChains_;
  }
  /**
   * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
   */
  @java.lang.Override
  public int getHostChainsCount() {
    return hostChains_.size();
  }
  /**
   * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
   */
  @java.lang.Override
  public com.pstake.liquidstakeibc.v1beta1.HostChain getHostChains(int index) {
    return hostChains_.get(index);
  }
  /**
   * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
   */
  @java.lang.Override
  public com.pstake.liquidstakeibc.v1beta1.HostChainOrBuilder getHostChainsOrBuilder(
      int index) {
    return hostChains_.get(index);
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
    for (int i = 0; i < hostChains_.size(); i++) {
      output.writeMessage(1, hostChains_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hostChains_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hostChains_.get(i));
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
    if (!(obj instanceof com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse)) {
      return super.equals(obj);
    }
    com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse other = (com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse) obj;

    if (!getHostChainsList()
        .equals(other.getHostChainsList())) return false;
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
    if (getHostChainsCount() > 0) {
      hash = (37 * hash) + HOST_CHAINS_FIELD_NUMBER;
      hash = (53 * hash) + getHostChainsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse parseFrom(
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
  public static Builder newBuilder(com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse prototype) {
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
   * Protobuf type {@code pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse)
      com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pstake.liquidstakeibc.v1beta1.QueryProto.internal_static_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pstake.liquidstakeibc.v1beta1.QueryProto.internal_static_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.class, com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.Builder.class);
    }

    // Construct using com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.newBuilder()
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
      if (hostChainsBuilder_ == null) {
        hostChains_ = java.util.Collections.emptyList();
      } else {
        hostChains_ = null;
        hostChainsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pstake.liquidstakeibc.v1beta1.QueryProto.internal_static_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse_descriptor;
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse getDefaultInstanceForType() {
      return com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse build() {
      com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse buildPartial() {
      com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse result = new com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse result) {
      if (hostChainsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hostChains_ = java.util.Collections.unmodifiableList(hostChains_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hostChains_ = hostChains_;
      } else {
        result.hostChains_ = hostChainsBuilder_.build();
      }
    }

    private void buildPartial0(com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse) {
        return mergeFrom((com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse other) {
      if (other == com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.getDefaultInstance()) return this;
      if (hostChainsBuilder_ == null) {
        if (!other.hostChains_.isEmpty()) {
          if (hostChains_.isEmpty()) {
            hostChains_ = other.hostChains_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHostChainsIsMutable();
            hostChains_.addAll(other.hostChains_);
          }
          onChanged();
        }
      } else {
        if (!other.hostChains_.isEmpty()) {
          if (hostChainsBuilder_.isEmpty()) {
            hostChainsBuilder_.dispose();
            hostChainsBuilder_ = null;
            hostChains_ = other.hostChains_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hostChainsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHostChainsFieldBuilder() : null;
          } else {
            hostChainsBuilder_.addAllMessages(other.hostChains_);
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
              com.pstake.liquidstakeibc.v1beta1.HostChain m =
                  input.readMessage(
                      com.pstake.liquidstakeibc.v1beta1.HostChain.parser(),
                      extensionRegistry);
              if (hostChainsBuilder_ == null) {
                ensureHostChainsIsMutable();
                hostChains_.add(m);
              } else {
                hostChainsBuilder_.addMessage(m);
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

    private java.util.List<com.pstake.liquidstakeibc.v1beta1.HostChain> hostChains_ =
      java.util.Collections.emptyList();
    private void ensureHostChainsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hostChains_ = new java.util.ArrayList<com.pstake.liquidstakeibc.v1beta1.HostChain>(hostChains_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pstake.liquidstakeibc.v1beta1.HostChain, com.pstake.liquidstakeibc.v1beta1.HostChain.Builder, com.pstake.liquidstakeibc.v1beta1.HostChainOrBuilder> hostChainsBuilder_;

    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public java.util.List<com.pstake.liquidstakeibc.v1beta1.HostChain> getHostChainsList() {
      if (hostChainsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hostChains_);
      } else {
        return hostChainsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public int getHostChainsCount() {
      if (hostChainsBuilder_ == null) {
        return hostChains_.size();
      } else {
        return hostChainsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public com.pstake.liquidstakeibc.v1beta1.HostChain getHostChains(int index) {
      if (hostChainsBuilder_ == null) {
        return hostChains_.get(index);
      } else {
        return hostChainsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder setHostChains(
        int index, com.pstake.liquidstakeibc.v1beta1.HostChain value) {
      if (hostChainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHostChainsIsMutable();
        hostChains_.set(index, value);
        onChanged();
      } else {
        hostChainsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder setHostChains(
        int index, com.pstake.liquidstakeibc.v1beta1.HostChain.Builder builderForValue) {
      if (hostChainsBuilder_ == null) {
        ensureHostChainsIsMutable();
        hostChains_.set(index, builderForValue.build());
        onChanged();
      } else {
        hostChainsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder addHostChains(com.pstake.liquidstakeibc.v1beta1.HostChain value) {
      if (hostChainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHostChainsIsMutable();
        hostChains_.add(value);
        onChanged();
      } else {
        hostChainsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder addHostChains(
        int index, com.pstake.liquidstakeibc.v1beta1.HostChain value) {
      if (hostChainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHostChainsIsMutable();
        hostChains_.add(index, value);
        onChanged();
      } else {
        hostChainsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder addHostChains(
        com.pstake.liquidstakeibc.v1beta1.HostChain.Builder builderForValue) {
      if (hostChainsBuilder_ == null) {
        ensureHostChainsIsMutable();
        hostChains_.add(builderForValue.build());
        onChanged();
      } else {
        hostChainsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder addHostChains(
        int index, com.pstake.liquidstakeibc.v1beta1.HostChain.Builder builderForValue) {
      if (hostChainsBuilder_ == null) {
        ensureHostChainsIsMutable();
        hostChains_.add(index, builderForValue.build());
        onChanged();
      } else {
        hostChainsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder addAllHostChains(
        java.lang.Iterable<? extends com.pstake.liquidstakeibc.v1beta1.HostChain> values) {
      if (hostChainsBuilder_ == null) {
        ensureHostChainsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hostChains_);
        onChanged();
      } else {
        hostChainsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder clearHostChains() {
      if (hostChainsBuilder_ == null) {
        hostChains_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hostChainsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public Builder removeHostChains(int index) {
      if (hostChainsBuilder_ == null) {
        ensureHostChainsIsMutable();
        hostChains_.remove(index);
        onChanged();
      } else {
        hostChainsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public com.pstake.liquidstakeibc.v1beta1.HostChain.Builder getHostChainsBuilder(
        int index) {
      return getHostChainsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public com.pstake.liquidstakeibc.v1beta1.HostChainOrBuilder getHostChainsOrBuilder(
        int index) {
      if (hostChainsBuilder_ == null) {
        return hostChains_.get(index);  } else {
        return hostChainsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public java.util.List<? extends com.pstake.liquidstakeibc.v1beta1.HostChainOrBuilder> 
         getHostChainsOrBuilderList() {
      if (hostChainsBuilder_ != null) {
        return hostChainsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hostChains_);
      }
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public com.pstake.liquidstakeibc.v1beta1.HostChain.Builder addHostChainsBuilder() {
      return getHostChainsFieldBuilder().addBuilder(
          com.pstake.liquidstakeibc.v1beta1.HostChain.getDefaultInstance());
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public com.pstake.liquidstakeibc.v1beta1.HostChain.Builder addHostChainsBuilder(
        int index) {
      return getHostChainsFieldBuilder().addBuilder(
          index, com.pstake.liquidstakeibc.v1beta1.HostChain.getDefaultInstance());
    }
    /**
     * <code>repeated .pstake.liquidstakeibc.v1beta1.HostChain host_chains = 1 [json_name = "hostChains"];</code>
     */
    public java.util.List<com.pstake.liquidstakeibc.v1beta1.HostChain.Builder> 
         getHostChainsBuilderList() {
      return getHostChainsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pstake.liquidstakeibc.v1beta1.HostChain, com.pstake.liquidstakeibc.v1beta1.HostChain.Builder, com.pstake.liquidstakeibc.v1beta1.HostChainOrBuilder> 
        getHostChainsFieldBuilder() {
      if (hostChainsBuilder_ == null) {
        hostChainsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pstake.liquidstakeibc.v1beta1.HostChain, com.pstake.liquidstakeibc.v1beta1.HostChain.Builder, com.pstake.liquidstakeibc.v1beta1.HostChainOrBuilder>(
                hostChains_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hostChains_ = null;
      }
      return hostChainsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse)
  }

  // @@protoc_insertion_point(class_scope:pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse)
  private static final com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse();
  }

  public static com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryHostChainsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryHostChainsResponse>() {
    @java.lang.Override
    public QueryHostChainsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryHostChainsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryHostChainsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

