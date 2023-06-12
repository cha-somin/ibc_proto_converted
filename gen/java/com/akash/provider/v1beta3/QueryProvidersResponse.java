// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/provider/v1beta3/query.proto

package com.akash.provider.v1beta3;

/**
 * <pre>
 * QueryProvidersResponse is response type for the Query/Providers RPC method
 * </pre>
 *
 * Protobuf type {@code akash.provider.v1beta3.QueryProvidersResponse}
 */
public final class QueryProvidersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.provider.v1beta3.QueryProvidersResponse)
    QueryProvidersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProvidersResponse.newBuilder() to construct.
  private QueryProvidersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProvidersResponse() {
    providers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProvidersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.provider.v1beta3.QueryProto.internal_static_akash_provider_v1beta3_QueryProvidersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.provider.v1beta3.QueryProto.internal_static_akash_provider_v1beta3_QueryProvidersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.provider.v1beta3.QueryProvidersResponse.class, com.akash.provider.v1beta3.QueryProvidersResponse.Builder.class);
  }

  public static final int PROVIDERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.akash.provider.v1beta3.Provider> providers_;
  /**
   * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  @java.lang.Override
  public java.util.List<com.akash.provider.v1beta3.Provider> getProvidersList() {
    return providers_;
  }
  /**
   * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.akash.provider.v1beta3.ProviderOrBuilder> 
      getProvidersOrBuilderList() {
    return providers_;
  }
  /**
   * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  @java.lang.Override
  public int getProvidersCount() {
    return providers_.size();
  }
  /**
   * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  @java.lang.Override
  public com.akash.provider.v1beta3.Provider getProviders(int index) {
    return providers_.get(index);
  }
  /**
   * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
   */
  @java.lang.Override
  public com.akash.provider.v1beta3.ProviderOrBuilder getProvidersOrBuilder(
      int index) {
    return providers_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
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
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.akash.provider.v1beta3.QueryProvidersResponse)) {
      return super.equals(obj);
    }
    com.akash.provider.v1beta3.QueryProvidersResponse other = (com.akash.provider.v1beta3.QueryProvidersResponse) obj;

    if (!getProvidersList()
        .equals(other.getProvidersList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.provider.v1beta3.QueryProvidersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.provider.v1beta3.QueryProvidersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.provider.v1beta3.QueryProvidersResponse parseFrom(
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
  public static Builder newBuilder(com.akash.provider.v1beta3.QueryProvidersResponse prototype) {
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
   * QueryProvidersResponse is response type for the Query/Providers RPC method
   * </pre>
   *
   * Protobuf type {@code akash.provider.v1beta3.QueryProvidersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.provider.v1beta3.QueryProvidersResponse)
      com.akash.provider.v1beta3.QueryProvidersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.provider.v1beta3.QueryProto.internal_static_akash_provider_v1beta3_QueryProvidersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.provider.v1beta3.QueryProto.internal_static_akash_provider_v1beta3_QueryProvidersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.provider.v1beta3.QueryProvidersResponse.class, com.akash.provider.v1beta3.QueryProvidersResponse.Builder.class);
    }

    // Construct using com.akash.provider.v1beta3.QueryProvidersResponse.newBuilder()
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
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.provider.v1beta3.QueryProto.internal_static_akash_provider_v1beta3_QueryProvidersResponse_descriptor;
    }

    @java.lang.Override
    public com.akash.provider.v1beta3.QueryProvidersResponse getDefaultInstanceForType() {
      return com.akash.provider.v1beta3.QueryProvidersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.provider.v1beta3.QueryProvidersResponse build() {
      com.akash.provider.v1beta3.QueryProvidersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.provider.v1beta3.QueryProvidersResponse buildPartial() {
      com.akash.provider.v1beta3.QueryProvidersResponse result = new com.akash.provider.v1beta3.QueryProvidersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.akash.provider.v1beta3.QueryProvidersResponse result) {
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

    private void buildPartial0(com.akash.provider.v1beta3.QueryProvidersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.provider.v1beta3.QueryProvidersResponse) {
        return mergeFrom((com.akash.provider.v1beta3.QueryProvidersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.provider.v1beta3.QueryProvidersResponse other) {
      if (other == com.akash.provider.v1beta3.QueryProvidersResponse.getDefaultInstance()) return this;
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
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.akash.provider.v1beta3.Provider m =
                  input.readMessage(
                      com.akash.provider.v1beta3.Provider.parser(),
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
                  getPaginationFieldBuilder().getBuilder(),
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

    private java.util.List<com.akash.provider.v1beta3.Provider> providers_ =
      java.util.Collections.emptyList();
    private void ensureProvidersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        providers_ = new java.util.ArrayList<com.akash.provider.v1beta3.Provider>(providers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.provider.v1beta3.Provider, com.akash.provider.v1beta3.Provider.Builder, com.akash.provider.v1beta3.ProviderOrBuilder> providersBuilder_;

    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public java.util.List<com.akash.provider.v1beta3.Provider> getProvidersList() {
      if (providersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(providers_);
      } else {
        return providersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public int getProvidersCount() {
      if (providersBuilder_ == null) {
        return providers_.size();
      } else {
        return providersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public com.akash.provider.v1beta3.Provider getProviders(int index) {
      if (providersBuilder_ == null) {
        return providers_.get(index);
      } else {
        return providersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public Builder setProviders(
        int index, com.akash.provider.v1beta3.Provider value) {
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public Builder setProviders(
        int index, com.akash.provider.v1beta3.Provider.Builder builderForValue) {
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public Builder addProviders(com.akash.provider.v1beta3.Provider value) {
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public Builder addProviders(
        int index, com.akash.provider.v1beta3.Provider value) {
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public Builder addProviders(
        com.akash.provider.v1beta3.Provider.Builder builderForValue) {
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public Builder addProviders(
        int index, com.akash.provider.v1beta3.Provider.Builder builderForValue) {
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public Builder addAllProviders(
        java.lang.Iterable<? extends com.akash.provider.v1beta3.Provider> values) {
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
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
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public com.akash.provider.v1beta3.Provider.Builder getProvidersBuilder(
        int index) {
      return getProvidersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public com.akash.provider.v1beta3.ProviderOrBuilder getProvidersOrBuilder(
        int index) {
      if (providersBuilder_ == null) {
        return providers_.get(index);  } else {
        return providersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public java.util.List<? extends com.akash.provider.v1beta3.ProviderOrBuilder> 
         getProvidersOrBuilderList() {
      if (providersBuilder_ != null) {
        return providersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(providers_);
      }
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public com.akash.provider.v1beta3.Provider.Builder addProvidersBuilder() {
      return getProvidersFieldBuilder().addBuilder(
          com.akash.provider.v1beta3.Provider.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public com.akash.provider.v1beta3.Provider.Builder addProvidersBuilder(
        int index) {
      return getProvidersFieldBuilder().addBuilder(
          index, com.akash.provider.v1beta3.Provider.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.provider.v1beta3.Provider providers = 1 [json_name = "providers", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Providers"];</code>
     */
    public java.util.List<com.akash.provider.v1beta3.Provider.Builder> 
         getProvidersBuilderList() {
      return getProvidersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.provider.v1beta3.Provider, com.akash.provider.v1beta3.Provider.Builder, com.akash.provider.v1beta3.ProviderOrBuilder> 
        getProvidersFieldBuilder() {
      if (providersBuilder_ == null) {
        providersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.akash.provider.v1beta3.Provider, com.akash.provider.v1beta3.Provider.Builder, com.akash.provider.v1beta3.ProviderOrBuilder>(
                providers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        providers_ = null;
      }
      return providersBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.provider.v1beta3.QueryProvidersResponse)
  }

  // @@protoc_insertion_point(class_scope:akash.provider.v1beta3.QueryProvidersResponse)
  private static final com.akash.provider.v1beta3.QueryProvidersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.provider.v1beta3.QueryProvidersResponse();
  }

  public static com.akash.provider.v1beta3.QueryProvidersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProvidersResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryProvidersResponse>() {
    @java.lang.Override
    public QueryProvidersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProvidersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProvidersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.provider.v1beta3.QueryProvidersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

