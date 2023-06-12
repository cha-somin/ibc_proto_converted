// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/provider/v2/genesis.proto

package com.sentinel.provider.v2;

/**
 * Protobuf type {@code sentinel.provider.v2.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentinel.provider.v2.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    providers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sentinel.provider.v2.GenesisProto.internal_static_sentinel_provider_v2_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sentinel.provider.v2.GenesisProto.internal_static_sentinel_provider_v2_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sentinel.provider.v2.GenesisState.class, com.sentinel.provider.v2.GenesisState.Builder.class);
  }

  public static final int PROVIDERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.sentinel.provider.v2.Provider> providers_;
  /**
   * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.sentinel.provider.v2.Provider> getProvidersList() {
    return providers_;
  }
  /**
   * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sentinel.provider.v2.ProviderOrBuilder> 
      getProvidersOrBuilderList() {
    return providers_;
  }
  /**
   * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getProvidersCount() {
    return providers_.size();
  }
  /**
   * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.provider.v2.Provider getProviders(int index) {
    return providers_.get(index);
  }
  /**
   * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.provider.v2.ProviderOrBuilder getProvidersOrBuilder(
      int index) {
    return providers_.get(index);
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private com.sentinel.provider.v2.Params params_;
  /**
   * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.sentinel.provider.v2.Params getParams() {
    return params_ == null ? com.sentinel.provider.v2.Params.getDefaultInstance() : params_;
  }
  /**
   * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.sentinel.provider.v2.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.sentinel.provider.v2.Params.getDefaultInstance() : params_;
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
    for (int i = 0; i < providers_.size(); i++) {
      output.writeMessage(1, providers_.get(i));
    }
    if (params_ != null) {
      output.writeMessage(2, getParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < providers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, providers_.get(i));
    }
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParams());
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
    if (!(obj instanceof com.sentinel.provider.v2.GenesisState)) {
      return super.equals(obj);
    }
    com.sentinel.provider.v2.GenesisState other = (com.sentinel.provider.v2.GenesisState) obj;

    if (!getProvidersList()
        .equals(other.getProvidersList())) return false;
    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
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
    if (getProvidersCount() > 0) {
      hash = (37 * hash) + PROVIDERS_FIELD_NUMBER;
      hash = (53 * hash) + getProvidersList().hashCode();
    }
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sentinel.provider.v2.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sentinel.provider.v2.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sentinel.provider.v2.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.provider.v2.GenesisState parseFrom(
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
  public static Builder newBuilder(com.sentinel.provider.v2.GenesisState prototype) {
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
   * Protobuf type {@code sentinel.provider.v2.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentinel.provider.v2.GenesisState)
      com.sentinel.provider.v2.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.provider.v2.GenesisProto.internal_static_sentinel_provider_v2_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.provider.v2.GenesisProto.internal_static_sentinel_provider_v2_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.provider.v2.GenesisState.class, com.sentinel.provider.v2.GenesisState.Builder.class);
    }

    // Construct using com.sentinel.provider.v2.GenesisState.newBuilder()
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
      if (providersBuilder_ == null) {
        providers_ = java.util.Collections.emptyList();
      } else {
        providers_ = null;
        providersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sentinel.provider.v2.GenesisProto.internal_static_sentinel_provider_v2_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.sentinel.provider.v2.GenesisState getDefaultInstanceForType() {
      return com.sentinel.provider.v2.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.sentinel.provider.v2.GenesisState build() {
      com.sentinel.provider.v2.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sentinel.provider.v2.GenesisState buildPartial() {
      com.sentinel.provider.v2.GenesisState result = new com.sentinel.provider.v2.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sentinel.provider.v2.GenesisState result) {
      if (providersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          providers_ = java.util.Collections.unmodifiableList(providers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.providers_ = providers_;
      } else {
        result.providers_ = providersBuilder_.build();
      }
    }

    private void buildPartial0(com.sentinel.provider.v2.GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sentinel.provider.v2.GenesisState) {
        return mergeFrom((com.sentinel.provider.v2.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sentinel.provider.v2.GenesisState other) {
      if (other == com.sentinel.provider.v2.GenesisState.getDefaultInstance()) return this;
      if (providersBuilder_ == null) {
        if (!other.providers_.isEmpty()) {
          if (providers_.isEmpty()) {
            providers_ = other.providers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProvidersIsMutable();
            providers_.addAll(other.providers_);
          }
          onChanged();
        }
      } else {
        if (!other.providers_.isEmpty()) {
          if (providersBuilder_.isEmpty()) {
            providersBuilder_.dispose();
            providersBuilder_ = null;
            providers_ = other.providers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            providersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProvidersFieldBuilder() : null;
          } else {
            providersBuilder_.addAllMessages(other.providers_);
          }
        }
      }
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
              com.sentinel.provider.v2.Provider m =
                  input.readMessage(
                      com.sentinel.provider.v2.Provider.parser(),
                      extensionRegistry);
              if (providersBuilder_ == null) {
                ensureProvidersIsMutable();
                providers_.add(m);
              } else {
                providersBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.util.List<com.sentinel.provider.v2.Provider> providers_ =
      java.util.Collections.emptyList();
    private void ensureProvidersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        providers_ = new java.util.ArrayList<com.sentinel.provider.v2.Provider>(providers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.provider.v2.Provider, com.sentinel.provider.v2.Provider.Builder, com.sentinel.provider.v2.ProviderOrBuilder> providersBuilder_;

    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.sentinel.provider.v2.Provider> getProvidersList() {
      if (providersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(providers_);
      } else {
        return providersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public int getProvidersCount() {
      if (providersBuilder_ == null) {
        return providers_.size();
      } else {
        return providersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.provider.v2.Provider getProviders(int index) {
      if (providersBuilder_ == null) {
        return providers_.get(index);
      } else {
        return providersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProviders(
        int index, com.sentinel.provider.v2.Provider value) {
      if (providersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProvidersIsMutable();
        providers_.set(index, value);
        onChanged();
      } else {
        providersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProviders(
        int index, com.sentinel.provider.v2.Provider.Builder builderForValue) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.set(index, builderForValue.build());
        onChanged();
      } else {
        providersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addProviders(com.sentinel.provider.v2.Provider value) {
      if (providersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProvidersIsMutable();
        providers_.add(value);
        onChanged();
      } else {
        providersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addProviders(
        int index, com.sentinel.provider.v2.Provider value) {
      if (providersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProvidersIsMutable();
        providers_.add(index, value);
        onChanged();
      } else {
        providersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addProviders(
        com.sentinel.provider.v2.Provider.Builder builderForValue) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.add(builderForValue.build());
        onChanged();
      } else {
        providersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addProviders(
        int index, com.sentinel.provider.v2.Provider.Builder builderForValue) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.add(index, builderForValue.build());
        onChanged();
      } else {
        providersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllProviders(
        java.lang.Iterable<? extends com.sentinel.provider.v2.Provider> values) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, providers_);
        onChanged();
      } else {
        providersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearProviders() {
      if (providersBuilder_ == null) {
        providers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        providersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeProviders(int index) {
      if (providersBuilder_ == null) {
        ensureProvidersIsMutable();
        providers_.remove(index);
        onChanged();
      } else {
        providersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.provider.v2.Provider.Builder getProvidersBuilder(
        int index) {
      return getProvidersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.provider.v2.ProviderOrBuilder getProvidersOrBuilder(
        int index) {
      if (providersBuilder_ == null) {
        return providers_.get(index);  } else {
        return providersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.sentinel.provider.v2.ProviderOrBuilder> 
         getProvidersOrBuilderList() {
      if (providersBuilder_ != null) {
        return providersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(providers_);
      }
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.provider.v2.Provider.Builder addProvidersBuilder() {
      return getProvidersFieldBuilder().addBuilder(
          com.sentinel.provider.v2.Provider.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.provider.v2.Provider.Builder addProvidersBuilder(
        int index) {
      return getProvidersFieldBuilder().addBuilder(
          index, com.sentinel.provider.v2.Provider.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.provider.v2.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.sentinel.provider.v2.Provider.Builder> 
         getProvidersBuilderList() {
      return getProvidersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.provider.v2.Provider, com.sentinel.provider.v2.Provider.Builder, com.sentinel.provider.v2.ProviderOrBuilder> 
        getProvidersFieldBuilder() {
      if (providersBuilder_ == null) {
        providersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sentinel.provider.v2.Provider, com.sentinel.provider.v2.Provider.Builder, com.sentinel.provider.v2.ProviderOrBuilder>(
                providers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        providers_ = null;
      }
      return providersBuilder_;
    }

    private com.sentinel.provider.v2.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sentinel.provider.v2.Params, com.sentinel.provider.v2.Params.Builder, com.sentinel.provider.v2.ParamsOrBuilder> paramsBuilder_;
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.sentinel.provider.v2.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.sentinel.provider.v2.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.sentinel.provider.v2.Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.sentinel.provider.v2.Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.sentinel.provider.v2.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          params_ != null &&
          params_ != com.sentinel.provider.v2.Params.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000002);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.provider.v2.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.sentinel.provider.v2.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.sentinel.provider.v2.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <code>.sentinel.provider.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sentinel.provider.v2.Params, com.sentinel.provider.v2.Params.Builder, com.sentinel.provider.v2.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sentinel.provider.v2.Params, com.sentinel.provider.v2.Params.Builder, com.sentinel.provider.v2.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sentinel.provider.v2.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:sentinel.provider.v2.GenesisState)
  private static final com.sentinel.provider.v2.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sentinel.provider.v2.GenesisState();
  }

  public static com.sentinel.provider.v2.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sentinel.provider.v2.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

