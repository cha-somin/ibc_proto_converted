// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * QueryClientStatesResponse is the response type for the Query/ClientStates RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.QueryClientStatesResponse}
 */
public final class QueryClientStatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.QueryClientStatesResponse)
    QueryClientStatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClientStatesResponse.newBuilder() to construct.
  private QueryClientStatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClientStatesResponse() {
    clientStates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClientStatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryClientStatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryClientStatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.client.v1.QueryClientStatesResponse.class, com.ibc.core.client.v1.QueryClientStatesResponse.Builder.class);
  }

  public static final int CLIENT_STATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.ibc.core.client.v1.IdentifiedClientState> clientStates_;
  /**
   * <pre>
   * list of stored ClientStates of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.ibc.core.client.v1.IdentifiedClientState> getClientStatesList() {
    return clientStates_;
  }
  /**
   * <pre>
   * list of stored ClientStates of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ibc.core.client.v1.IdentifiedClientStateOrBuilder> 
      getClientStatesOrBuilderList() {
    return clientStates_;
  }
  /**
   * <pre>
   * list of stored ClientStates of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
   */
  @java.lang.Override
  public int getClientStatesCount() {
    return clientStates_.size();
  }
  /**
   * <pre>
   * list of stored ClientStates of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
   */
  @java.lang.Override
  public com.ibc.core.client.v1.IdentifiedClientState getClientStates(int index) {
    return clientStates_.get(index);
  }
  /**
   * <pre>
   * list of stored ClientStates of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
   */
  @java.lang.Override
  public com.ibc.core.client.v1.IdentifiedClientStateOrBuilder getClientStatesOrBuilder(
      int index) {
    return clientStates_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination response
   * </pre>
   *
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
    for (int i = 0; i < clientStates_.size(); i++) {
      output.writeMessage(1, clientStates_.get(i));
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
    for (int i = 0; i < clientStates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, clientStates_.get(i));
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
    if (!(obj instanceof com.ibc.core.client.v1.QueryClientStatesResponse)) {
      return super.equals(obj);
    }
    com.ibc.core.client.v1.QueryClientStatesResponse other = (com.ibc.core.client.v1.QueryClientStatesResponse) obj;

    if (!getClientStatesList()
        .equals(other.getClientStatesList())) return false;
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
    if (getClientStatesCount() > 0) {
      hash = (37 * hash) + CLIENT_STATES_FIELD_NUMBER;
      hash = (53 * hash) + getClientStatesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.core.client.v1.QueryClientStatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.core.client.v1.QueryClientStatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.QueryClientStatesResponse parseFrom(
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
  public static Builder newBuilder(com.ibc.core.client.v1.QueryClientStatesResponse prototype) {
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
   * QueryClientStatesResponse is the response type for the Query/ClientStates RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.QueryClientStatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.QueryClientStatesResponse)
      com.ibc.core.client.v1.QueryClientStatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryClientStatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryClientStatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.client.v1.QueryClientStatesResponse.class, com.ibc.core.client.v1.QueryClientStatesResponse.Builder.class);
    }

    // Construct using com.ibc.core.client.v1.QueryClientStatesResponse.newBuilder()
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
      if (clientStatesBuilder_ == null) {
        clientStates_ = java.util.Collections.emptyList();
      } else {
        clientStates_ = null;
        clientStatesBuilder_.clear();
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
      return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryClientStatesResponse_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.QueryClientStatesResponse getDefaultInstanceForType() {
      return com.ibc.core.client.v1.QueryClientStatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.client.v1.QueryClientStatesResponse build() {
      com.ibc.core.client.v1.QueryClientStatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.QueryClientStatesResponse buildPartial() {
      com.ibc.core.client.v1.QueryClientStatesResponse result = new com.ibc.core.client.v1.QueryClientStatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ibc.core.client.v1.QueryClientStatesResponse result) {
      if (clientStatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          clientStates_ = java.util.Collections.unmodifiableList(clientStates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.clientStates_ = clientStates_;
      } else {
        result.clientStates_ = clientStatesBuilder_.build();
      }
    }

    private void buildPartial0(com.ibc.core.client.v1.QueryClientStatesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.core.client.v1.QueryClientStatesResponse) {
        return mergeFrom((com.ibc.core.client.v1.QueryClientStatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.client.v1.QueryClientStatesResponse other) {
      if (other == com.ibc.core.client.v1.QueryClientStatesResponse.getDefaultInstance()) return this;
      if (clientStatesBuilder_ == null) {
        if (!other.clientStates_.isEmpty()) {
          if (clientStates_.isEmpty()) {
            clientStates_ = other.clientStates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClientStatesIsMutable();
            clientStates_.addAll(other.clientStates_);
          }
          onChanged();
        }
      } else {
        if (!other.clientStates_.isEmpty()) {
          if (clientStatesBuilder_.isEmpty()) {
            clientStatesBuilder_.dispose();
            clientStatesBuilder_ = null;
            clientStates_ = other.clientStates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            clientStatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClientStatesFieldBuilder() : null;
          } else {
            clientStatesBuilder_.addAllMessages(other.clientStates_);
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
              com.ibc.core.client.v1.IdentifiedClientState m =
                  input.readMessage(
                      com.ibc.core.client.v1.IdentifiedClientState.parser(),
                      extensionRegistry);
              if (clientStatesBuilder_ == null) {
                ensureClientStatesIsMutable();
                clientStates_.add(m);
              } else {
                clientStatesBuilder_.addMessage(m);
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

    private java.util.List<com.ibc.core.client.v1.IdentifiedClientState> clientStates_ =
      java.util.Collections.emptyList();
    private void ensureClientStatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        clientStates_ = new java.util.ArrayList<com.ibc.core.client.v1.IdentifiedClientState>(clientStates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ibc.core.client.v1.IdentifiedClientState, com.ibc.core.client.v1.IdentifiedClientState.Builder, com.ibc.core.client.v1.IdentifiedClientStateOrBuilder> clientStatesBuilder_;

    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public java.util.List<com.ibc.core.client.v1.IdentifiedClientState> getClientStatesList() {
      if (clientStatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clientStates_);
      } else {
        return clientStatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public int getClientStatesCount() {
      if (clientStatesBuilder_ == null) {
        return clientStates_.size();
      } else {
        return clientStatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public com.ibc.core.client.v1.IdentifiedClientState getClientStates(int index) {
      if (clientStatesBuilder_ == null) {
        return clientStates_.get(index);
      } else {
        return clientStatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder setClientStates(
        int index, com.ibc.core.client.v1.IdentifiedClientState value) {
      if (clientStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientStatesIsMutable();
        clientStates_.set(index, value);
        onChanged();
      } else {
        clientStatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder setClientStates(
        int index, com.ibc.core.client.v1.IdentifiedClientState.Builder builderForValue) {
      if (clientStatesBuilder_ == null) {
        ensureClientStatesIsMutable();
        clientStates_.set(index, builderForValue.build());
        onChanged();
      } else {
        clientStatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder addClientStates(com.ibc.core.client.v1.IdentifiedClientState value) {
      if (clientStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientStatesIsMutable();
        clientStates_.add(value);
        onChanged();
      } else {
        clientStatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder addClientStates(
        int index, com.ibc.core.client.v1.IdentifiedClientState value) {
      if (clientStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientStatesIsMutable();
        clientStates_.add(index, value);
        onChanged();
      } else {
        clientStatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder addClientStates(
        com.ibc.core.client.v1.IdentifiedClientState.Builder builderForValue) {
      if (clientStatesBuilder_ == null) {
        ensureClientStatesIsMutable();
        clientStates_.add(builderForValue.build());
        onChanged();
      } else {
        clientStatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder addClientStates(
        int index, com.ibc.core.client.v1.IdentifiedClientState.Builder builderForValue) {
      if (clientStatesBuilder_ == null) {
        ensureClientStatesIsMutable();
        clientStates_.add(index, builderForValue.build());
        onChanged();
      } else {
        clientStatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder addAllClientStates(
        java.lang.Iterable<? extends com.ibc.core.client.v1.IdentifiedClientState> values) {
      if (clientStatesBuilder_ == null) {
        ensureClientStatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clientStates_);
        onChanged();
      } else {
        clientStatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder clearClientStates() {
      if (clientStatesBuilder_ == null) {
        clientStates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        clientStatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public Builder removeClientStates(int index) {
      if (clientStatesBuilder_ == null) {
        ensureClientStatesIsMutable();
        clientStates_.remove(index);
        onChanged();
      } else {
        clientStatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public com.ibc.core.client.v1.IdentifiedClientState.Builder getClientStatesBuilder(
        int index) {
      return getClientStatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public com.ibc.core.client.v1.IdentifiedClientStateOrBuilder getClientStatesOrBuilder(
        int index) {
      if (clientStatesBuilder_ == null) {
        return clientStates_.get(index);  } else {
        return clientStatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public java.util.List<? extends com.ibc.core.client.v1.IdentifiedClientStateOrBuilder> 
         getClientStatesOrBuilderList() {
      if (clientStatesBuilder_ != null) {
        return clientStatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clientStates_);
      }
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public com.ibc.core.client.v1.IdentifiedClientState.Builder addClientStatesBuilder() {
      return getClientStatesFieldBuilder().addBuilder(
          com.ibc.core.client.v1.IdentifiedClientState.getDefaultInstance());
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public com.ibc.core.client.v1.IdentifiedClientState.Builder addClientStatesBuilder(
        int index) {
      return getClientStatesFieldBuilder().addBuilder(
          index, com.ibc.core.client.v1.IdentifiedClientState.getDefaultInstance());
    }
    /**
     * <pre>
     * list of stored ClientStates of the chain.
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState client_states = 1 [json_name = "clientStates", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    public java.util.List<com.ibc.core.client.v1.IdentifiedClientState.Builder> 
         getClientStatesBuilderList() {
      return getClientStatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ibc.core.client.v1.IdentifiedClientState, com.ibc.core.client.v1.IdentifiedClientState.Builder, com.ibc.core.client.v1.IdentifiedClientStateOrBuilder> 
        getClientStatesFieldBuilder() {
      if (clientStatesBuilder_ == null) {
        clientStatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ibc.core.client.v1.IdentifiedClientState, com.ibc.core.client.v1.IdentifiedClientState.Builder, com.ibc.core.client.v1.IdentifiedClientStateOrBuilder>(
                clientStates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        clientStates_ = null;
      }
      return clientStatesBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
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
     * <pre>
     * pagination response
     * </pre>
     *
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
     * <pre>
     * pagination response
     * </pre>
     *
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
     * <pre>
     * pagination response
     * </pre>
     *
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
     * <pre>
     * pagination response
     * </pre>
     *
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
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
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
     * <pre>
     * pagination response
     * </pre>
     *
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.QueryClientStatesResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.QueryClientStatesResponse)
  private static final com.ibc.core.client.v1.QueryClientStatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.client.v1.QueryClientStatesResponse();
  }

  public static com.ibc.core.client.v1.QueryClientStatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClientStatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClientStatesResponse>() {
    @java.lang.Override
    public QueryClientStatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClientStatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClientStatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.client.v1.QueryClientStatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

