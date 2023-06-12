// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/query.proto

package com.ibc.applications.transfer.v1;

/**
 * <pre>
 * QueryConnectionsResponse is the response type for the Query/DenomTraces RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code ibc.applications.transfer.v1.QueryDenomTracesResponse}
 */
public final class QueryDenomTracesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.transfer.v1.QueryDenomTracesResponse)
    QueryDenomTracesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomTracesResponse.newBuilder() to construct.
  private QueryDenomTracesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomTracesResponse() {
    denomTraces_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDenomTracesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomTracesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomTracesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.transfer.v1.QueryDenomTracesResponse.class, com.ibc.applications.transfer.v1.QueryDenomTracesResponse.Builder.class);
  }

  public static final int DENOM_TRACES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.ibc.applications.transfer.v1.DenomTrace> denomTraces_;
  /**
   * <pre>
   * denom_traces returns all denominations trace information.
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
   */
  @java.lang.Override
  public java.util.List<com.ibc.applications.transfer.v1.DenomTrace> getDenomTracesList() {
    return denomTraces_;
  }
  /**
   * <pre>
   * denom_traces returns all denominations trace information.
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ibc.applications.transfer.v1.DenomTraceOrBuilder> 
      getDenomTracesOrBuilderList() {
    return denomTraces_;
  }
  /**
   * <pre>
   * denom_traces returns all denominations trace information.
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
   */
  @java.lang.Override
  public int getDenomTracesCount() {
    return denomTraces_.size();
  }
  /**
   * <pre>
   * denom_traces returns all denominations trace information.
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
   */
  @java.lang.Override
  public com.ibc.applications.transfer.v1.DenomTrace getDenomTraces(int index) {
    return denomTraces_.get(index);
  }
  /**
   * <pre>
   * denom_traces returns all denominations trace information.
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
   */
  @java.lang.Override
  public com.ibc.applications.transfer.v1.DenomTraceOrBuilder getDenomTracesOrBuilder(
      int index) {
    return denomTraces_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
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
   * pagination defines the pagination in the response.
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
   * pagination defines the pagination in the response.
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
    for (int i = 0; i < denomTraces_.size(); i++) {
      output.writeMessage(1, denomTraces_.get(i));
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
    for (int i = 0; i < denomTraces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, denomTraces_.get(i));
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
    if (!(obj instanceof com.ibc.applications.transfer.v1.QueryDenomTracesResponse)) {
      return super.equals(obj);
    }
    com.ibc.applications.transfer.v1.QueryDenomTracesResponse other = (com.ibc.applications.transfer.v1.QueryDenomTracesResponse) obj;

    if (!getDenomTracesList()
        .equals(other.getDenomTracesList())) return false;
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
    if (getDenomTracesCount() > 0) {
      hash = (37 * hash) + DENOM_TRACES_FIELD_NUMBER;
      hash = (53 * hash) + getDenomTracesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse parseFrom(
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
  public static Builder newBuilder(com.ibc.applications.transfer.v1.QueryDenomTracesResponse prototype) {
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
   * QueryConnectionsResponse is the response type for the Query/DenomTraces RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code ibc.applications.transfer.v1.QueryDenomTracesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.transfer.v1.QueryDenomTracesResponse)
      com.ibc.applications.transfer.v1.QueryDenomTracesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomTracesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomTracesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.transfer.v1.QueryDenomTracesResponse.class, com.ibc.applications.transfer.v1.QueryDenomTracesResponse.Builder.class);
    }

    // Construct using com.ibc.applications.transfer.v1.QueryDenomTracesResponse.newBuilder()
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
      if (denomTracesBuilder_ == null) {
        denomTraces_ = java.util.Collections.emptyList();
      } else {
        denomTraces_ = null;
        denomTracesBuilder_.clear();
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
      return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomTracesResponse_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.QueryDenomTracesResponse getDefaultInstanceForType() {
      return com.ibc.applications.transfer.v1.QueryDenomTracesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.QueryDenomTracesResponse build() {
      com.ibc.applications.transfer.v1.QueryDenomTracesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.QueryDenomTracesResponse buildPartial() {
      com.ibc.applications.transfer.v1.QueryDenomTracesResponse result = new com.ibc.applications.transfer.v1.QueryDenomTracesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ibc.applications.transfer.v1.QueryDenomTracesResponse result) {
      if (denomTracesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          denomTraces_ = java.util.Collections.unmodifiableList(denomTraces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.denomTraces_ = denomTraces_;
      } else {
        result.denomTraces_ = denomTracesBuilder_.build();
      }
    }

    private void buildPartial0(com.ibc.applications.transfer.v1.QueryDenomTracesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.applications.transfer.v1.QueryDenomTracesResponse) {
        return mergeFrom((com.ibc.applications.transfer.v1.QueryDenomTracesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.transfer.v1.QueryDenomTracesResponse other) {
      if (other == com.ibc.applications.transfer.v1.QueryDenomTracesResponse.getDefaultInstance()) return this;
      if (denomTracesBuilder_ == null) {
        if (!other.denomTraces_.isEmpty()) {
          if (denomTraces_.isEmpty()) {
            denomTraces_ = other.denomTraces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDenomTracesIsMutable();
            denomTraces_.addAll(other.denomTraces_);
          }
          onChanged();
        }
      } else {
        if (!other.denomTraces_.isEmpty()) {
          if (denomTracesBuilder_.isEmpty()) {
            denomTracesBuilder_.dispose();
            denomTracesBuilder_ = null;
            denomTraces_ = other.denomTraces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            denomTracesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDenomTracesFieldBuilder() : null;
          } else {
            denomTracesBuilder_.addAllMessages(other.denomTraces_);
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
              com.ibc.applications.transfer.v1.DenomTrace m =
                  input.readMessage(
                      com.ibc.applications.transfer.v1.DenomTrace.parser(),
                      extensionRegistry);
              if (denomTracesBuilder_ == null) {
                ensureDenomTracesIsMutable();
                denomTraces_.add(m);
              } else {
                denomTracesBuilder_.addMessage(m);
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

    private java.util.List<com.ibc.applications.transfer.v1.DenomTrace> denomTraces_ =
      java.util.Collections.emptyList();
    private void ensureDenomTracesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        denomTraces_ = new java.util.ArrayList<com.ibc.applications.transfer.v1.DenomTrace>(denomTraces_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ibc.applications.transfer.v1.DenomTrace, com.ibc.applications.transfer.v1.DenomTrace.Builder, com.ibc.applications.transfer.v1.DenomTraceOrBuilder> denomTracesBuilder_;

    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public java.util.List<com.ibc.applications.transfer.v1.DenomTrace> getDenomTracesList() {
      if (denomTracesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(denomTraces_);
      } else {
        return denomTracesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public int getDenomTracesCount() {
      if (denomTracesBuilder_ == null) {
        return denomTraces_.size();
      } else {
        return denomTracesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public com.ibc.applications.transfer.v1.DenomTrace getDenomTraces(int index) {
      if (denomTracesBuilder_ == null) {
        return denomTraces_.get(index);
      } else {
        return denomTracesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder setDenomTraces(
        int index, com.ibc.applications.transfer.v1.DenomTrace value) {
      if (denomTracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDenomTracesIsMutable();
        denomTraces_.set(index, value);
        onChanged();
      } else {
        denomTracesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder setDenomTraces(
        int index, com.ibc.applications.transfer.v1.DenomTrace.Builder builderForValue) {
      if (denomTracesBuilder_ == null) {
        ensureDenomTracesIsMutable();
        denomTraces_.set(index, builderForValue.build());
        onChanged();
      } else {
        denomTracesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder addDenomTraces(com.ibc.applications.transfer.v1.DenomTrace value) {
      if (denomTracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDenomTracesIsMutable();
        denomTraces_.add(value);
        onChanged();
      } else {
        denomTracesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder addDenomTraces(
        int index, com.ibc.applications.transfer.v1.DenomTrace value) {
      if (denomTracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDenomTracesIsMutable();
        denomTraces_.add(index, value);
        onChanged();
      } else {
        denomTracesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder addDenomTraces(
        com.ibc.applications.transfer.v1.DenomTrace.Builder builderForValue) {
      if (denomTracesBuilder_ == null) {
        ensureDenomTracesIsMutable();
        denomTraces_.add(builderForValue.build());
        onChanged();
      } else {
        denomTracesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder addDenomTraces(
        int index, com.ibc.applications.transfer.v1.DenomTrace.Builder builderForValue) {
      if (denomTracesBuilder_ == null) {
        ensureDenomTracesIsMutable();
        denomTraces_.add(index, builderForValue.build());
        onChanged();
      } else {
        denomTracesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder addAllDenomTraces(
        java.lang.Iterable<? extends com.ibc.applications.transfer.v1.DenomTrace> values) {
      if (denomTracesBuilder_ == null) {
        ensureDenomTracesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, denomTraces_);
        onChanged();
      } else {
        denomTracesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder clearDenomTraces() {
      if (denomTracesBuilder_ == null) {
        denomTraces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        denomTracesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public Builder removeDenomTraces(int index) {
      if (denomTracesBuilder_ == null) {
        ensureDenomTracesIsMutable();
        denomTraces_.remove(index);
        onChanged();
      } else {
        denomTracesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public com.ibc.applications.transfer.v1.DenomTrace.Builder getDenomTracesBuilder(
        int index) {
      return getDenomTracesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public com.ibc.applications.transfer.v1.DenomTraceOrBuilder getDenomTracesOrBuilder(
        int index) {
      if (denomTracesBuilder_ == null) {
        return denomTraces_.get(index);  } else {
        return denomTracesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public java.util.List<? extends com.ibc.applications.transfer.v1.DenomTraceOrBuilder> 
         getDenomTracesOrBuilderList() {
      if (denomTracesBuilder_ != null) {
        return denomTracesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(denomTraces_);
      }
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public com.ibc.applications.transfer.v1.DenomTrace.Builder addDenomTracesBuilder() {
      return getDenomTracesFieldBuilder().addBuilder(
          com.ibc.applications.transfer.v1.DenomTrace.getDefaultInstance());
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public com.ibc.applications.transfer.v1.DenomTrace.Builder addDenomTracesBuilder(
        int index) {
      return getDenomTracesFieldBuilder().addBuilder(
          index, com.ibc.applications.transfer.v1.DenomTrace.getDefaultInstance());
    }
    /**
     * <pre>
     * denom_traces returns all denominations trace information.
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.DenomTrace denom_traces = 1 [json_name = "denomTraces", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Traces"];</code>
     */
    public java.util.List<com.ibc.applications.transfer.v1.DenomTrace.Builder> 
         getDenomTracesBuilderList() {
      return getDenomTracesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ibc.applications.transfer.v1.DenomTrace, com.ibc.applications.transfer.v1.DenomTrace.Builder, com.ibc.applications.transfer.v1.DenomTraceOrBuilder> 
        getDenomTracesFieldBuilder() {
      if (denomTracesBuilder_ == null) {
        denomTracesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ibc.applications.transfer.v1.DenomTrace, com.ibc.applications.transfer.v1.DenomTrace.Builder, com.ibc.applications.transfer.v1.DenomTraceOrBuilder>(
                denomTraces_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        denomTraces_ = null;
      }
      return denomTracesBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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
     * pagination defines the pagination in the response.
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.transfer.v1.QueryDenomTracesResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.transfer.v1.QueryDenomTracesResponse)
  private static final com.ibc.applications.transfer.v1.QueryDenomTracesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.transfer.v1.QueryDenomTracesResponse();
  }

  public static com.ibc.applications.transfer.v1.QueryDenomTracesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomTracesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomTracesResponse>() {
    @java.lang.Override
    public QueryDenomTracesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDenomTracesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomTracesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.transfer.v1.QueryDenomTracesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

