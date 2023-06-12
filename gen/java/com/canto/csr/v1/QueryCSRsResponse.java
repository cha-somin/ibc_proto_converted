// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/csr/v1/query.proto

package com.canto.csr.v1;

/**
 * <pre>
 * QueryCSRsResponse is the response type for the Query/CSRs RPC method.
 * </pre>
 *
 * Protobuf type {@code canto.csr.v1.QueryCSRsResponse}
 */
public final class QueryCSRsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:canto.csr.v1.QueryCSRsResponse)
    QueryCSRsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCSRsResponse.newBuilder() to construct.
  private QueryCSRsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCSRsResponse() {
    csrs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCSRsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.canto.csr.v1.QueryProto.internal_static_canto_csr_v1_QueryCSRsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.canto.csr.v1.QueryProto.internal_static_canto_csr_v1_QueryCSRsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.canto.csr.v1.QueryCSRsResponse.class, com.canto.csr.v1.QueryCSRsResponse.Builder.class);
  }

  public static final int CSRS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.canto.csr.v1.CSR> csrs_;
  /**
   * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.canto.csr.v1.CSR> getCsrsList() {
    return csrs_;
  }
  /**
   * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.canto.csr.v1.CSROrBuilder> 
      getCsrsOrBuilderList() {
    return csrs_;
  }
  /**
   * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getCsrsCount() {
    return csrs_.size();
  }
  /**
   * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.canto.csr.v1.CSR getCsrs(int index) {
    return csrs_.get(index);
  }
  /**
   * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.canto.csr.v1.CSROrBuilder getCsrsOrBuilder(
      int index) {
    return csrs_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination for response
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
   * pagination for response
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
   * pagination for response
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
    for (int i = 0; i < csrs_.size(); i++) {
      output.writeMessage(1, csrs_.get(i));
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
    for (int i = 0; i < csrs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, csrs_.get(i));
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
    if (!(obj instanceof com.canto.csr.v1.QueryCSRsResponse)) {
      return super.equals(obj);
    }
    com.canto.csr.v1.QueryCSRsResponse other = (com.canto.csr.v1.QueryCSRsResponse) obj;

    if (!getCsrsList()
        .equals(other.getCsrsList())) return false;
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
    if (getCsrsCount() > 0) {
      hash = (37 * hash) + CSRS_FIELD_NUMBER;
      hash = (53 * hash) + getCsrsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.canto.csr.v1.QueryCSRsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.canto.csr.v1.QueryCSRsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.canto.csr.v1.QueryCSRsResponse parseFrom(
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
  public static Builder newBuilder(com.canto.csr.v1.QueryCSRsResponse prototype) {
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
   * QueryCSRsResponse is the response type for the Query/CSRs RPC method.
   * </pre>
   *
   * Protobuf type {@code canto.csr.v1.QueryCSRsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:canto.csr.v1.QueryCSRsResponse)
      com.canto.csr.v1.QueryCSRsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.canto.csr.v1.QueryProto.internal_static_canto_csr_v1_QueryCSRsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.canto.csr.v1.QueryProto.internal_static_canto_csr_v1_QueryCSRsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.canto.csr.v1.QueryCSRsResponse.class, com.canto.csr.v1.QueryCSRsResponse.Builder.class);
    }

    // Construct using com.canto.csr.v1.QueryCSRsResponse.newBuilder()
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
      if (csrsBuilder_ == null) {
        csrs_ = java.util.Collections.emptyList();
      } else {
        csrs_ = null;
        csrsBuilder_.clear();
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
      return com.canto.csr.v1.QueryProto.internal_static_canto_csr_v1_QueryCSRsResponse_descriptor;
    }

    @java.lang.Override
    public com.canto.csr.v1.QueryCSRsResponse getDefaultInstanceForType() {
      return com.canto.csr.v1.QueryCSRsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.canto.csr.v1.QueryCSRsResponse build() {
      com.canto.csr.v1.QueryCSRsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.canto.csr.v1.QueryCSRsResponse buildPartial() {
      com.canto.csr.v1.QueryCSRsResponse result = new com.canto.csr.v1.QueryCSRsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.canto.csr.v1.QueryCSRsResponse result) {
      if (csrsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          csrs_ = java.util.Collections.unmodifiableList(csrs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.csrs_ = csrs_;
      } else {
        result.csrs_ = csrsBuilder_.build();
      }
    }

    private void buildPartial0(com.canto.csr.v1.QueryCSRsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.canto.csr.v1.QueryCSRsResponse) {
        return mergeFrom((com.canto.csr.v1.QueryCSRsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.canto.csr.v1.QueryCSRsResponse other) {
      if (other == com.canto.csr.v1.QueryCSRsResponse.getDefaultInstance()) return this;
      if (csrsBuilder_ == null) {
        if (!other.csrs_.isEmpty()) {
          if (csrs_.isEmpty()) {
            csrs_ = other.csrs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCsrsIsMutable();
            csrs_.addAll(other.csrs_);
          }
          onChanged();
        }
      } else {
        if (!other.csrs_.isEmpty()) {
          if (csrsBuilder_.isEmpty()) {
            csrsBuilder_.dispose();
            csrsBuilder_ = null;
            csrs_ = other.csrs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            csrsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCsrsFieldBuilder() : null;
          } else {
            csrsBuilder_.addAllMessages(other.csrs_);
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
              com.canto.csr.v1.CSR m =
                  input.readMessage(
                      com.canto.csr.v1.CSR.parser(),
                      extensionRegistry);
              if (csrsBuilder_ == null) {
                ensureCsrsIsMutable();
                csrs_.add(m);
              } else {
                csrsBuilder_.addMessage(m);
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

    private java.util.List<com.canto.csr.v1.CSR> csrs_ =
      java.util.Collections.emptyList();
    private void ensureCsrsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        csrs_ = new java.util.ArrayList<com.canto.csr.v1.CSR>(csrs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.canto.csr.v1.CSR, com.canto.csr.v1.CSR.Builder, com.canto.csr.v1.CSROrBuilder> csrsBuilder_;

    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.canto.csr.v1.CSR> getCsrsList() {
      if (csrsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(csrs_);
      } else {
        return csrsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public int getCsrsCount() {
      if (csrsBuilder_ == null) {
        return csrs_.size();
      } else {
        return csrsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public com.canto.csr.v1.CSR getCsrs(int index) {
      if (csrsBuilder_ == null) {
        return csrs_.get(index);
      } else {
        return csrsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCsrs(
        int index, com.canto.csr.v1.CSR value) {
      if (csrsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCsrsIsMutable();
        csrs_.set(index, value);
        onChanged();
      } else {
        csrsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder setCsrs(
        int index, com.canto.csr.v1.CSR.Builder builderForValue) {
      if (csrsBuilder_ == null) {
        ensureCsrsIsMutable();
        csrs_.set(index, builderForValue.build());
        onChanged();
      } else {
        csrsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addCsrs(com.canto.csr.v1.CSR value) {
      if (csrsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCsrsIsMutable();
        csrs_.add(value);
        onChanged();
      } else {
        csrsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addCsrs(
        int index, com.canto.csr.v1.CSR value) {
      if (csrsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCsrsIsMutable();
        csrs_.add(index, value);
        onChanged();
      } else {
        csrsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addCsrs(
        com.canto.csr.v1.CSR.Builder builderForValue) {
      if (csrsBuilder_ == null) {
        ensureCsrsIsMutable();
        csrs_.add(builderForValue.build());
        onChanged();
      } else {
        csrsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addCsrs(
        int index, com.canto.csr.v1.CSR.Builder builderForValue) {
      if (csrsBuilder_ == null) {
        ensureCsrsIsMutable();
        csrs_.add(index, builderForValue.build());
        onChanged();
      } else {
        csrsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllCsrs(
        java.lang.Iterable<? extends com.canto.csr.v1.CSR> values) {
      if (csrsBuilder_ == null) {
        ensureCsrsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, csrs_);
        onChanged();
      } else {
        csrsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearCsrs() {
      if (csrsBuilder_ == null) {
        csrs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        csrsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeCsrs(int index) {
      if (csrsBuilder_ == null) {
        ensureCsrsIsMutable();
        csrs_.remove(index);
        onChanged();
      } else {
        csrsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public com.canto.csr.v1.CSR.Builder getCsrsBuilder(
        int index) {
      return getCsrsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public com.canto.csr.v1.CSROrBuilder getCsrsOrBuilder(
        int index) {
      if (csrsBuilder_ == null) {
        return csrs_.get(index);  } else {
        return csrsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.canto.csr.v1.CSROrBuilder> 
         getCsrsOrBuilderList() {
      if (csrsBuilder_ != null) {
        return csrsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(csrs_);
      }
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public com.canto.csr.v1.CSR.Builder addCsrsBuilder() {
      return getCsrsFieldBuilder().addBuilder(
          com.canto.csr.v1.CSR.getDefaultInstance());
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public com.canto.csr.v1.CSR.Builder addCsrsBuilder(
        int index) {
      return getCsrsFieldBuilder().addBuilder(
          index, com.canto.csr.v1.CSR.getDefaultInstance());
    }
    /**
     * <code>repeated .canto.csr.v1.CSR csrs = 1 [json_name = "csrs", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.canto.csr.v1.CSR.Builder> 
         getCsrsBuilderList() {
      return getCsrsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.canto.csr.v1.CSR, com.canto.csr.v1.CSR.Builder, com.canto.csr.v1.CSROrBuilder> 
        getCsrsFieldBuilder() {
      if (csrsBuilder_ == null) {
        csrsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.canto.csr.v1.CSR, com.canto.csr.v1.CSR.Builder, com.canto.csr.v1.CSROrBuilder>(
                csrs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        csrs_ = null;
      }
      return csrsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination for response
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
     * pagination for response
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
     * pagination for response
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
     * pagination for response
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
     * pagination for response
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
     * pagination for response
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
     * pagination for response
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
     * pagination for response
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
     * pagination for response
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


    // @@protoc_insertion_point(builder_scope:canto.csr.v1.QueryCSRsResponse)
  }

  // @@protoc_insertion_point(class_scope:canto.csr.v1.QueryCSRsResponse)
  private static final com.canto.csr.v1.QueryCSRsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.canto.csr.v1.QueryCSRsResponse();
  }

  public static com.canto.csr.v1.QueryCSRsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCSRsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryCSRsResponse>() {
    @java.lang.Override
    public QueryCSRsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCSRsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCSRsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.canto.csr.v1.QueryCSRsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

