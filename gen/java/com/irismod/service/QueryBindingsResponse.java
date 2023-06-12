// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/query.proto

package com.irismod.service;

/**
 * <pre>
 * QueryDefinitionsResponse is response type for the Query/Bindings RPC method
 * </pre>
 *
 * Protobuf type {@code irismod.service.QueryBindingsResponse}
 */
public final class QueryBindingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.service.QueryBindingsResponse)
    QueryBindingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBindingsResponse.newBuilder() to construct.
  private QueryBindingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBindingsResponse() {
    serviceBindings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBindingsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.service.QueryProto.internal_static_irismod_service_QueryBindingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.service.QueryProto.internal_static_irismod_service_QueryBindingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.service.QueryBindingsResponse.class, com.irismod.service.QueryBindingsResponse.Builder.class);
  }

  public static final int SERVICE_BINDINGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.irismod.service.ServiceBinding> serviceBindings_;
  /**
   * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
   */
  @java.lang.Override
  public java.util.List<com.irismod.service.ServiceBinding> getServiceBindingsList() {
    return serviceBindings_;
  }
  /**
   * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.irismod.service.ServiceBindingOrBuilder> 
      getServiceBindingsOrBuilderList() {
    return serviceBindings_;
  }
  /**
   * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
   */
  @java.lang.Override
  public int getServiceBindingsCount() {
    return serviceBindings_.size();
  }
  /**
   * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
   */
  @java.lang.Override
  public com.irismod.service.ServiceBinding getServiceBindings(int index) {
    return serviceBindings_.get(index);
  }
  /**
   * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
   */
  @java.lang.Override
  public com.irismod.service.ServiceBindingOrBuilder getServiceBindingsOrBuilder(
      int index) {
    return serviceBindings_.get(index);
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
    for (int i = 0; i < serviceBindings_.size(); i++) {
      output.writeMessage(1, serviceBindings_.get(i));
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
    for (int i = 0; i < serviceBindings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, serviceBindings_.get(i));
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
    if (!(obj instanceof com.irismod.service.QueryBindingsResponse)) {
      return super.equals(obj);
    }
    com.irismod.service.QueryBindingsResponse other = (com.irismod.service.QueryBindingsResponse) obj;

    if (!getServiceBindingsList()
        .equals(other.getServiceBindingsList())) return false;
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
    if (getServiceBindingsCount() > 0) {
      hash = (37 * hash) + SERVICE_BINDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getServiceBindingsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.service.QueryBindingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.service.QueryBindingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.service.QueryBindingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.service.QueryBindingsResponse parseFrom(
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
  public static Builder newBuilder(com.irismod.service.QueryBindingsResponse prototype) {
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
   * QueryDefinitionsResponse is response type for the Query/Bindings RPC method
   * </pre>
   *
   * Protobuf type {@code irismod.service.QueryBindingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.service.QueryBindingsResponse)
      com.irismod.service.QueryBindingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.service.QueryProto.internal_static_irismod_service_QueryBindingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.service.QueryProto.internal_static_irismod_service_QueryBindingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.service.QueryBindingsResponse.class, com.irismod.service.QueryBindingsResponse.Builder.class);
    }

    // Construct using com.irismod.service.QueryBindingsResponse.newBuilder()
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
      if (serviceBindingsBuilder_ == null) {
        serviceBindings_ = java.util.Collections.emptyList();
      } else {
        serviceBindings_ = null;
        serviceBindingsBuilder_.clear();
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
      return com.irismod.service.QueryProto.internal_static_irismod_service_QueryBindingsResponse_descriptor;
    }

    @java.lang.Override
    public com.irismod.service.QueryBindingsResponse getDefaultInstanceForType() {
      return com.irismod.service.QueryBindingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.service.QueryBindingsResponse build() {
      com.irismod.service.QueryBindingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.service.QueryBindingsResponse buildPartial() {
      com.irismod.service.QueryBindingsResponse result = new com.irismod.service.QueryBindingsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.irismod.service.QueryBindingsResponse result) {
      if (serviceBindingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          serviceBindings_ = java.util.Collections.unmodifiableList(serviceBindings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.serviceBindings_ = serviceBindings_;
      } else {
        result.serviceBindings_ = serviceBindingsBuilder_.build();
      }
    }

    private void buildPartial0(com.irismod.service.QueryBindingsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.service.QueryBindingsResponse) {
        return mergeFrom((com.irismod.service.QueryBindingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.service.QueryBindingsResponse other) {
      if (other == com.irismod.service.QueryBindingsResponse.getDefaultInstance()) return this;
      if (serviceBindingsBuilder_ == null) {
        if (!other.serviceBindings_.isEmpty()) {
          if (serviceBindings_.isEmpty()) {
            serviceBindings_ = other.serviceBindings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServiceBindingsIsMutable();
            serviceBindings_.addAll(other.serviceBindings_);
          }
          onChanged();
        }
      } else {
        if (!other.serviceBindings_.isEmpty()) {
          if (serviceBindingsBuilder_.isEmpty()) {
            serviceBindingsBuilder_.dispose();
            serviceBindingsBuilder_ = null;
            serviceBindings_ = other.serviceBindings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serviceBindingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServiceBindingsFieldBuilder() : null;
          } else {
            serviceBindingsBuilder_.addAllMessages(other.serviceBindings_);
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
              com.irismod.service.ServiceBinding m =
                  input.readMessage(
                      com.irismod.service.ServiceBinding.parser(),
                      extensionRegistry);
              if (serviceBindingsBuilder_ == null) {
                ensureServiceBindingsIsMutable();
                serviceBindings_.add(m);
              } else {
                serviceBindingsBuilder_.addMessage(m);
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

    private java.util.List<com.irismod.service.ServiceBinding> serviceBindings_ =
      java.util.Collections.emptyList();
    private void ensureServiceBindingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        serviceBindings_ = new java.util.ArrayList<com.irismod.service.ServiceBinding>(serviceBindings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.irismod.service.ServiceBinding, com.irismod.service.ServiceBinding.Builder, com.irismod.service.ServiceBindingOrBuilder> serviceBindingsBuilder_;

    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public java.util.List<com.irismod.service.ServiceBinding> getServiceBindingsList() {
      if (serviceBindingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(serviceBindings_);
      } else {
        return serviceBindingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public int getServiceBindingsCount() {
      if (serviceBindingsBuilder_ == null) {
        return serviceBindings_.size();
      } else {
        return serviceBindingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public com.irismod.service.ServiceBinding getServiceBindings(int index) {
      if (serviceBindingsBuilder_ == null) {
        return serviceBindings_.get(index);
      } else {
        return serviceBindingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder setServiceBindings(
        int index, com.irismod.service.ServiceBinding value) {
      if (serviceBindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceBindingsIsMutable();
        serviceBindings_.set(index, value);
        onChanged();
      } else {
        serviceBindingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder setServiceBindings(
        int index, com.irismod.service.ServiceBinding.Builder builderForValue) {
      if (serviceBindingsBuilder_ == null) {
        ensureServiceBindingsIsMutable();
        serviceBindings_.set(index, builderForValue.build());
        onChanged();
      } else {
        serviceBindingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder addServiceBindings(com.irismod.service.ServiceBinding value) {
      if (serviceBindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceBindingsIsMutable();
        serviceBindings_.add(value);
        onChanged();
      } else {
        serviceBindingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder addServiceBindings(
        int index, com.irismod.service.ServiceBinding value) {
      if (serviceBindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceBindingsIsMutable();
        serviceBindings_.add(index, value);
        onChanged();
      } else {
        serviceBindingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder addServiceBindings(
        com.irismod.service.ServiceBinding.Builder builderForValue) {
      if (serviceBindingsBuilder_ == null) {
        ensureServiceBindingsIsMutable();
        serviceBindings_.add(builderForValue.build());
        onChanged();
      } else {
        serviceBindingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder addServiceBindings(
        int index, com.irismod.service.ServiceBinding.Builder builderForValue) {
      if (serviceBindingsBuilder_ == null) {
        ensureServiceBindingsIsMutable();
        serviceBindings_.add(index, builderForValue.build());
        onChanged();
      } else {
        serviceBindingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder addAllServiceBindings(
        java.lang.Iterable<? extends com.irismod.service.ServiceBinding> values) {
      if (serviceBindingsBuilder_ == null) {
        ensureServiceBindingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, serviceBindings_);
        onChanged();
      } else {
        serviceBindingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder clearServiceBindings() {
      if (serviceBindingsBuilder_ == null) {
        serviceBindings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serviceBindingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public Builder removeServiceBindings(int index) {
      if (serviceBindingsBuilder_ == null) {
        ensureServiceBindingsIsMutable();
        serviceBindings_.remove(index);
        onChanged();
      } else {
        serviceBindingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public com.irismod.service.ServiceBinding.Builder getServiceBindingsBuilder(
        int index) {
      return getServiceBindingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public com.irismod.service.ServiceBindingOrBuilder getServiceBindingsOrBuilder(
        int index) {
      if (serviceBindingsBuilder_ == null) {
        return serviceBindings_.get(index);  } else {
        return serviceBindingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public java.util.List<? extends com.irismod.service.ServiceBindingOrBuilder> 
         getServiceBindingsOrBuilderList() {
      if (serviceBindingsBuilder_ != null) {
        return serviceBindingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(serviceBindings_);
      }
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public com.irismod.service.ServiceBinding.Builder addServiceBindingsBuilder() {
      return getServiceBindingsFieldBuilder().addBuilder(
          com.irismod.service.ServiceBinding.getDefaultInstance());
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public com.irismod.service.ServiceBinding.Builder addServiceBindingsBuilder(
        int index) {
      return getServiceBindingsFieldBuilder().addBuilder(
          index, com.irismod.service.ServiceBinding.getDefaultInstance());
    }
    /**
     * <code>repeated .irismod.service.ServiceBinding service_bindings = 1 [json_name = "serviceBindings"];</code>
     */
    public java.util.List<com.irismod.service.ServiceBinding.Builder> 
         getServiceBindingsBuilderList() {
      return getServiceBindingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.irismod.service.ServiceBinding, com.irismod.service.ServiceBinding.Builder, com.irismod.service.ServiceBindingOrBuilder> 
        getServiceBindingsFieldBuilder() {
      if (serviceBindingsBuilder_ == null) {
        serviceBindingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.irismod.service.ServiceBinding, com.irismod.service.ServiceBinding.Builder, com.irismod.service.ServiceBindingOrBuilder>(
                serviceBindings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        serviceBindings_ = null;
      }
      return serviceBindingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:irismod.service.QueryBindingsResponse)
  }

  // @@protoc_insertion_point(class_scope:irismod.service.QueryBindingsResponse)
  private static final com.irismod.service.QueryBindingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.service.QueryBindingsResponse();
  }

  public static com.irismod.service.QueryBindingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryBindingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryBindingsResponse>() {
    @java.lang.Override
    public QueryBindingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryBindingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryBindingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.service.QueryBindingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

