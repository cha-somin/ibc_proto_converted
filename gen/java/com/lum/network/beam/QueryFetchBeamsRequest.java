// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/beam/query.proto

package com.lum.network.beam;

/**
 * Protobuf type {@code lum.network.beam.QueryFetchBeamsRequest}
 */
public final class QueryFetchBeamsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lum.network.beam.QueryFetchBeamsRequest)
    QueryFetchBeamsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFetchBeamsRequest.newBuilder() to construct.
  private QueryFetchBeamsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFetchBeamsRequest() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFetchBeamsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lum.network.beam.QueryProto.internal_static_lum_network_beam_QueryFetchBeamsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lum.network.beam.QueryProto.internal_static_lum_network_beam_QueryFetchBeamsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lum.network.beam.QueryFetchBeamsRequest.class, com.lum.network.beam.QueryFetchBeamsRequest.Builder.class);
  }

  public static final int PAGINATION_FIELD_NUMBER = 1;
  private com.cosmos.base.query.v1beta1.PageRequest pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;
  /**
   * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override public com.lum.network.beam.BeamState getState() {
    com.lum.network.beam.BeamState result = com.lum.network.beam.BeamState.forNumber(state_);
    return result == null ? com.lum.network.beam.BeamState.UNRECOGNIZED : result;
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
    if (pagination_ != null) {
      output.writeMessage(1, getPagination());
    }
    if (state_ != com.lum.network.beam.BeamState.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPagination());
    }
    if (state_ != com.lum.network.beam.BeamState.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
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
    if (!(obj instanceof com.lum.network.beam.QueryFetchBeamsRequest)) {
      return super.equals(obj);
    }
    com.lum.network.beam.QueryFetchBeamsRequest other = (com.lum.network.beam.QueryFetchBeamsRequest) obj;

    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
    if (state_ != other.state_) return false;
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
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.lum.network.beam.QueryFetchBeamsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.lum.network.beam.QueryFetchBeamsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.beam.QueryFetchBeamsRequest parseFrom(
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
  public static Builder newBuilder(com.lum.network.beam.QueryFetchBeamsRequest prototype) {
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
   * Protobuf type {@code lum.network.beam.QueryFetchBeamsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lum.network.beam.QueryFetchBeamsRequest)
      com.lum.network.beam.QueryFetchBeamsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.beam.QueryProto.internal_static_lum_network_beam_QueryFetchBeamsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.beam.QueryProto.internal_static_lum_network_beam_QueryFetchBeamsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.beam.QueryFetchBeamsRequest.class, com.lum.network.beam.QueryFetchBeamsRequest.Builder.class);
    }

    // Construct using com.lum.network.beam.QueryFetchBeamsRequest.newBuilder()
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
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lum.network.beam.QueryProto.internal_static_lum_network_beam_QueryFetchBeamsRequest_descriptor;
    }

    @java.lang.Override
    public com.lum.network.beam.QueryFetchBeamsRequest getDefaultInstanceForType() {
      return com.lum.network.beam.QueryFetchBeamsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.lum.network.beam.QueryFetchBeamsRequest build() {
      com.lum.network.beam.QueryFetchBeamsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lum.network.beam.QueryFetchBeamsRequest buildPartial() {
      com.lum.network.beam.QueryFetchBeamsRequest result = new com.lum.network.beam.QueryFetchBeamsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.lum.network.beam.QueryFetchBeamsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lum.network.beam.QueryFetchBeamsRequest) {
        return mergeFrom((com.lum.network.beam.QueryFetchBeamsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lum.network.beam.QueryFetchBeamsRequest other) {
      if (other == com.lum.network.beam.QueryFetchBeamsRequest.getDefaultInstance()) return this;
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.cosmos.base.query.v1beta1.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageRequest.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequest.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
    }

    private int state_ = 0;
    /**
     * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.lum.network.beam.BeamState getState() {
      com.lum.network.beam.BeamState result = com.lum.network.beam.BeamState.forNumber(state_);
      return result == null ? com.lum.network.beam.BeamState.UNRECOGNIZED : result;
    }
    /**
     * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.lum.network.beam.BeamState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.lum.network.beam.BeamState state = 2 [json_name = "state"];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lum.network.beam.QueryFetchBeamsRequest)
  }

  // @@protoc_insertion_point(class_scope:lum.network.beam.QueryFetchBeamsRequest)
  private static final com.lum.network.beam.QueryFetchBeamsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lum.network.beam.QueryFetchBeamsRequest();
  }

  public static com.lum.network.beam.QueryFetchBeamsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFetchBeamsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryFetchBeamsRequest>() {
    @java.lang.Override
    public QueryFetchBeamsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryFetchBeamsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFetchBeamsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lum.network.beam.QueryFetchBeamsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

