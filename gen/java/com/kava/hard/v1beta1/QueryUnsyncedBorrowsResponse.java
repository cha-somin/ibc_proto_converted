// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/hard/v1beta1/query.proto

package com.kava.hard.v1beta1;

/**
 * <pre>
 * QueryUnsyncedBorrowsResponse is the response type for the Query/UnsyncedBorrows RPC method.
 * </pre>
 *
 * Protobuf type {@code kava.hard.v1beta1.QueryUnsyncedBorrowsResponse}
 */
public final class QueryUnsyncedBorrowsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.hard.v1beta1.QueryUnsyncedBorrowsResponse)
    QueryUnsyncedBorrowsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUnsyncedBorrowsResponse.newBuilder() to construct.
  private QueryUnsyncedBorrowsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUnsyncedBorrowsResponse() {
    borrows_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryUnsyncedBorrowsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse.class, com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse.Builder.class);
  }

  public static final int BORROWS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.kava.hard.v1beta1.BorrowResponse> borrows_;
  /**
   * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
   */
  @java.lang.Override
  public java.util.List<com.kava.hard.v1beta1.BorrowResponse> getBorrowsList() {
    return borrows_;
  }
  /**
   * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.kava.hard.v1beta1.BorrowResponseOrBuilder> 
      getBorrowsOrBuilderList() {
    return borrows_;
  }
  /**
   * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
   */
  @java.lang.Override
  public int getBorrowsCount() {
    return borrows_.size();
  }
  /**
   * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
   */
  @java.lang.Override
  public com.kava.hard.v1beta1.BorrowResponse getBorrows(int index) {
    return borrows_.get(index);
  }
  /**
   * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
   */
  @java.lang.Override
  public com.kava.hard.v1beta1.BorrowResponseOrBuilder getBorrowsOrBuilder(
      int index) {
    return borrows_.get(index);
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
    for (int i = 0; i < borrows_.size(); i++) {
      output.writeMessage(1, borrows_.get(i));
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
    for (int i = 0; i < borrows_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, borrows_.get(i));
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
    if (!(obj instanceof com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse)) {
      return super.equals(obj);
    }
    com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse other = (com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse) obj;

    if (!getBorrowsList()
        .equals(other.getBorrowsList())) return false;
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
    if (getBorrowsCount() > 0) {
      hash = (37 * hash) + BORROWS_FIELD_NUMBER;
      hash = (53 * hash) + getBorrowsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse parseFrom(
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
  public static Builder newBuilder(com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse prototype) {
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
   * QueryUnsyncedBorrowsResponse is the response type for the Query/UnsyncedBorrows RPC method.
   * </pre>
   *
   * Protobuf type {@code kava.hard.v1beta1.QueryUnsyncedBorrowsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.hard.v1beta1.QueryUnsyncedBorrowsResponse)
      com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse.class, com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse.Builder.class);
    }

    // Construct using com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse.newBuilder()
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
      if (borrowsBuilder_ == null) {
        borrows_ = java.util.Collections.emptyList();
      } else {
        borrows_ = null;
        borrowsBuilder_.clear();
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
      return com.kava.hard.v1beta1.QueryProto.internal_static_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse getDefaultInstanceForType() {
      return com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse build() {
      com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse buildPartial() {
      com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse result = new com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse result) {
      if (borrowsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          borrows_ = java.util.Collections.unmodifiableList(borrows_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.borrows_ = borrows_;
      } else {
        result.borrows_ = borrowsBuilder_.build();
      }
    }

    private void buildPartial0(com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse) {
        return mergeFrom((com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse other) {
      if (other == com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse.getDefaultInstance()) return this;
      if (borrowsBuilder_ == null) {
        if (!other.borrows_.isEmpty()) {
          if (borrows_.isEmpty()) {
            borrows_ = other.borrows_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBorrowsIsMutable();
            borrows_.addAll(other.borrows_);
          }
          onChanged();
        }
      } else {
        if (!other.borrows_.isEmpty()) {
          if (borrowsBuilder_.isEmpty()) {
            borrowsBuilder_.dispose();
            borrowsBuilder_ = null;
            borrows_ = other.borrows_;
            bitField0_ = (bitField0_ & ~0x00000001);
            borrowsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBorrowsFieldBuilder() : null;
          } else {
            borrowsBuilder_.addAllMessages(other.borrows_);
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
              com.kava.hard.v1beta1.BorrowResponse m =
                  input.readMessage(
                      com.kava.hard.v1beta1.BorrowResponse.parser(),
                      extensionRegistry);
              if (borrowsBuilder_ == null) {
                ensureBorrowsIsMutable();
                borrows_.add(m);
              } else {
                borrowsBuilder_.addMessage(m);
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

    private java.util.List<com.kava.hard.v1beta1.BorrowResponse> borrows_ =
      java.util.Collections.emptyList();
    private void ensureBorrowsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        borrows_ = new java.util.ArrayList<com.kava.hard.v1beta1.BorrowResponse>(borrows_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.hard.v1beta1.BorrowResponse, com.kava.hard.v1beta1.BorrowResponse.Builder, com.kava.hard.v1beta1.BorrowResponseOrBuilder> borrowsBuilder_;

    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public java.util.List<com.kava.hard.v1beta1.BorrowResponse> getBorrowsList() {
      if (borrowsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(borrows_);
      } else {
        return borrowsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public int getBorrowsCount() {
      if (borrowsBuilder_ == null) {
        return borrows_.size();
      } else {
        return borrowsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public com.kava.hard.v1beta1.BorrowResponse getBorrows(int index) {
      if (borrowsBuilder_ == null) {
        return borrows_.get(index);
      } else {
        return borrowsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder setBorrows(
        int index, com.kava.hard.v1beta1.BorrowResponse value) {
      if (borrowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBorrowsIsMutable();
        borrows_.set(index, value);
        onChanged();
      } else {
        borrowsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder setBorrows(
        int index, com.kava.hard.v1beta1.BorrowResponse.Builder builderForValue) {
      if (borrowsBuilder_ == null) {
        ensureBorrowsIsMutable();
        borrows_.set(index, builderForValue.build());
        onChanged();
      } else {
        borrowsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder addBorrows(com.kava.hard.v1beta1.BorrowResponse value) {
      if (borrowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBorrowsIsMutable();
        borrows_.add(value);
        onChanged();
      } else {
        borrowsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder addBorrows(
        int index, com.kava.hard.v1beta1.BorrowResponse value) {
      if (borrowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBorrowsIsMutable();
        borrows_.add(index, value);
        onChanged();
      } else {
        borrowsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder addBorrows(
        com.kava.hard.v1beta1.BorrowResponse.Builder builderForValue) {
      if (borrowsBuilder_ == null) {
        ensureBorrowsIsMutable();
        borrows_.add(builderForValue.build());
        onChanged();
      } else {
        borrowsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder addBorrows(
        int index, com.kava.hard.v1beta1.BorrowResponse.Builder builderForValue) {
      if (borrowsBuilder_ == null) {
        ensureBorrowsIsMutable();
        borrows_.add(index, builderForValue.build());
        onChanged();
      } else {
        borrowsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder addAllBorrows(
        java.lang.Iterable<? extends com.kava.hard.v1beta1.BorrowResponse> values) {
      if (borrowsBuilder_ == null) {
        ensureBorrowsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, borrows_);
        onChanged();
      } else {
        borrowsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder clearBorrows() {
      if (borrowsBuilder_ == null) {
        borrows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        borrowsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public Builder removeBorrows(int index) {
      if (borrowsBuilder_ == null) {
        ensureBorrowsIsMutable();
        borrows_.remove(index);
        onChanged();
      } else {
        borrowsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public com.kava.hard.v1beta1.BorrowResponse.Builder getBorrowsBuilder(
        int index) {
      return getBorrowsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public com.kava.hard.v1beta1.BorrowResponseOrBuilder getBorrowsOrBuilder(
        int index) {
      if (borrowsBuilder_ == null) {
        return borrows_.get(index);  } else {
        return borrowsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public java.util.List<? extends com.kava.hard.v1beta1.BorrowResponseOrBuilder> 
         getBorrowsOrBuilderList() {
      if (borrowsBuilder_ != null) {
        return borrowsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(borrows_);
      }
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public com.kava.hard.v1beta1.BorrowResponse.Builder addBorrowsBuilder() {
      return getBorrowsFieldBuilder().addBuilder(
          com.kava.hard.v1beta1.BorrowResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public com.kava.hard.v1beta1.BorrowResponse.Builder addBorrowsBuilder(
        int index) {
      return getBorrowsFieldBuilder().addBuilder(
          index, com.kava.hard.v1beta1.BorrowResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.hard.v1beta1.BorrowResponse borrows = 1 [json_name = "borrows", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "BorrowResponses"];</code>
     */
    public java.util.List<com.kava.hard.v1beta1.BorrowResponse.Builder> 
         getBorrowsBuilderList() {
      return getBorrowsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.hard.v1beta1.BorrowResponse, com.kava.hard.v1beta1.BorrowResponse.Builder, com.kava.hard.v1beta1.BorrowResponseOrBuilder> 
        getBorrowsFieldBuilder() {
      if (borrowsBuilder_ == null) {
        borrowsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kava.hard.v1beta1.BorrowResponse, com.kava.hard.v1beta1.BorrowResponse.Builder, com.kava.hard.v1beta1.BorrowResponseOrBuilder>(
                borrows_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        borrows_ = null;
      }
      return borrowsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.hard.v1beta1.QueryUnsyncedBorrowsResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.hard.v1beta1.QueryUnsyncedBorrowsResponse)
  private static final com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse();
  }

  public static com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUnsyncedBorrowsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryUnsyncedBorrowsResponse>() {
    @java.lang.Override
    public QueryUnsyncedBorrowsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryUnsyncedBorrowsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUnsyncedBorrowsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.hard.v1beta1.QueryUnsyncedBorrowsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

