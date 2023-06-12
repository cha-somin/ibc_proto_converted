// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/fiattokenfactory/query.proto

package com.noble.fiattokenfactory;

/**
 * Protobuf type {@code noble.fiattokenfactory.QueryAllMintersResponse}
 */
public final class QueryAllMintersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:noble.fiattokenfactory.QueryAllMintersResponse)
    QueryAllMintersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAllMintersResponse.newBuilder() to construct.
  private QueryAllMintersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAllMintersResponse() {
    minters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAllMintersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryAllMintersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryAllMintersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.noble.fiattokenfactory.QueryAllMintersResponse.class, com.noble.fiattokenfactory.QueryAllMintersResponse.Builder.class);
  }

  public static final int MINTERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.noble.fiattokenfactory.Minters> minters_;
  /**
   * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.noble.fiattokenfactory.Minters> getMintersList() {
    return minters_;
  }
  /**
   * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.noble.fiattokenfactory.MintersOrBuilder> 
      getMintersOrBuilderList() {
    return minters_;
  }
  /**
   * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getMintersCount() {
    return minters_.size();
  }
  /**
   * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.noble.fiattokenfactory.Minters getMinters(int index) {
    return minters_.get(index);
  }
  /**
   * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.noble.fiattokenfactory.MintersOrBuilder getMintersOrBuilder(
      int index) {
    return minters_.get(index);
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
    for (int i = 0; i < minters_.size(); i++) {
      output.writeMessage(1, minters_.get(i));
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
    for (int i = 0; i < minters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, minters_.get(i));
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
    if (!(obj instanceof com.noble.fiattokenfactory.QueryAllMintersResponse)) {
      return super.equals(obj);
    }
    com.noble.fiattokenfactory.QueryAllMintersResponse other = (com.noble.fiattokenfactory.QueryAllMintersResponse) obj;

    if (!getMintersList()
        .equals(other.getMintersList())) return false;
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
    if (getMintersCount() > 0) {
      hash = (37 * hash) + MINTERS_FIELD_NUMBER;
      hash = (53 * hash) + getMintersList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.QueryAllMintersResponse parseFrom(
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
  public static Builder newBuilder(com.noble.fiattokenfactory.QueryAllMintersResponse prototype) {
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
   * Protobuf type {@code noble.fiattokenfactory.QueryAllMintersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:noble.fiattokenfactory.QueryAllMintersResponse)
      com.noble.fiattokenfactory.QueryAllMintersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryAllMintersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryAllMintersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.fiattokenfactory.QueryAllMintersResponse.class, com.noble.fiattokenfactory.QueryAllMintersResponse.Builder.class);
    }

    // Construct using com.noble.fiattokenfactory.QueryAllMintersResponse.newBuilder()
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
      if (mintersBuilder_ == null) {
        minters_ = java.util.Collections.emptyList();
      } else {
        minters_ = null;
        mintersBuilder_.clear();
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
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryAllMintersResponse_descriptor;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryAllMintersResponse getDefaultInstanceForType() {
      return com.noble.fiattokenfactory.QueryAllMintersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryAllMintersResponse build() {
      com.noble.fiattokenfactory.QueryAllMintersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryAllMintersResponse buildPartial() {
      com.noble.fiattokenfactory.QueryAllMintersResponse result = new com.noble.fiattokenfactory.QueryAllMintersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.noble.fiattokenfactory.QueryAllMintersResponse result) {
      if (mintersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          minters_ = java.util.Collections.unmodifiableList(minters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.minters_ = minters_;
      } else {
        result.minters_ = mintersBuilder_.build();
      }
    }

    private void buildPartial0(com.noble.fiattokenfactory.QueryAllMintersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.noble.fiattokenfactory.QueryAllMintersResponse) {
        return mergeFrom((com.noble.fiattokenfactory.QueryAllMintersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.noble.fiattokenfactory.QueryAllMintersResponse other) {
      if (other == com.noble.fiattokenfactory.QueryAllMintersResponse.getDefaultInstance()) return this;
      if (mintersBuilder_ == null) {
        if (!other.minters_.isEmpty()) {
          if (minters_.isEmpty()) {
            minters_ = other.minters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMintersIsMutable();
            minters_.addAll(other.minters_);
          }
          onChanged();
        }
      } else {
        if (!other.minters_.isEmpty()) {
          if (mintersBuilder_.isEmpty()) {
            mintersBuilder_.dispose();
            mintersBuilder_ = null;
            minters_ = other.minters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mintersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMintersFieldBuilder() : null;
          } else {
            mintersBuilder_.addAllMessages(other.minters_);
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
              com.noble.fiattokenfactory.Minters m =
                  input.readMessage(
                      com.noble.fiattokenfactory.Minters.parser(),
                      extensionRegistry);
              if (mintersBuilder_ == null) {
                ensureMintersIsMutable();
                minters_.add(m);
              } else {
                mintersBuilder_.addMessage(m);
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

    private java.util.List<com.noble.fiattokenfactory.Minters> minters_ =
      java.util.Collections.emptyList();
    private void ensureMintersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        minters_ = new java.util.ArrayList<com.noble.fiattokenfactory.Minters>(minters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.noble.fiattokenfactory.Minters, com.noble.fiattokenfactory.Minters.Builder, com.noble.fiattokenfactory.MintersOrBuilder> mintersBuilder_;

    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.noble.fiattokenfactory.Minters> getMintersList() {
      if (mintersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(minters_);
      } else {
        return mintersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public int getMintersCount() {
      if (mintersBuilder_ == null) {
        return minters_.size();
      } else {
        return mintersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.Minters getMinters(int index) {
      if (mintersBuilder_ == null) {
        return minters_.get(index);
      } else {
        return mintersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMinters(
        int index, com.noble.fiattokenfactory.Minters value) {
      if (mintersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMintersIsMutable();
        minters_.set(index, value);
        onChanged();
      } else {
        mintersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMinters(
        int index, com.noble.fiattokenfactory.Minters.Builder builderForValue) {
      if (mintersBuilder_ == null) {
        ensureMintersIsMutable();
        minters_.set(index, builderForValue.build());
        onChanged();
      } else {
        mintersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMinters(com.noble.fiattokenfactory.Minters value) {
      if (mintersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMintersIsMutable();
        minters_.add(value);
        onChanged();
      } else {
        mintersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMinters(
        int index, com.noble.fiattokenfactory.Minters value) {
      if (mintersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMintersIsMutable();
        minters_.add(index, value);
        onChanged();
      } else {
        mintersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMinters(
        com.noble.fiattokenfactory.Minters.Builder builderForValue) {
      if (mintersBuilder_ == null) {
        ensureMintersIsMutable();
        minters_.add(builderForValue.build());
        onChanged();
      } else {
        mintersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMinters(
        int index, com.noble.fiattokenfactory.Minters.Builder builderForValue) {
      if (mintersBuilder_ == null) {
        ensureMintersIsMutable();
        minters_.add(index, builderForValue.build());
        onChanged();
      } else {
        mintersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllMinters(
        java.lang.Iterable<? extends com.noble.fiattokenfactory.Minters> values) {
      if (mintersBuilder_ == null) {
        ensureMintersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, minters_);
        onChanged();
      } else {
        mintersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMinters() {
      if (mintersBuilder_ == null) {
        minters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mintersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeMinters(int index) {
      if (mintersBuilder_ == null) {
        ensureMintersIsMutable();
        minters_.remove(index);
        onChanged();
      } else {
        mintersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.Minters.Builder getMintersBuilder(
        int index) {
      return getMintersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.MintersOrBuilder getMintersOrBuilder(
        int index) {
      if (mintersBuilder_ == null) {
        return minters_.get(index);  } else {
        return mintersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.noble.fiattokenfactory.MintersOrBuilder> 
         getMintersOrBuilderList() {
      if (mintersBuilder_ != null) {
        return mintersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(minters_);
      }
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.Minters.Builder addMintersBuilder() {
      return getMintersFieldBuilder().addBuilder(
          com.noble.fiattokenfactory.Minters.getDefaultInstance());
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.Minters.Builder addMintersBuilder(
        int index) {
      return getMintersFieldBuilder().addBuilder(
          index, com.noble.fiattokenfactory.Minters.getDefaultInstance());
    }
    /**
     * <code>repeated .noble.fiattokenfactory.Minters minters = 1 [json_name = "minters", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.noble.fiattokenfactory.Minters.Builder> 
         getMintersBuilderList() {
      return getMintersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.noble.fiattokenfactory.Minters, com.noble.fiattokenfactory.Minters.Builder, com.noble.fiattokenfactory.MintersOrBuilder> 
        getMintersFieldBuilder() {
      if (mintersBuilder_ == null) {
        mintersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.noble.fiattokenfactory.Minters, com.noble.fiattokenfactory.Minters.Builder, com.noble.fiattokenfactory.MintersOrBuilder>(
                minters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        minters_ = null;
      }
      return mintersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:noble.fiattokenfactory.QueryAllMintersResponse)
  }

  // @@protoc_insertion_point(class_scope:noble.fiattokenfactory.QueryAllMintersResponse)
  private static final com.noble.fiattokenfactory.QueryAllMintersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.noble.fiattokenfactory.QueryAllMintersResponse();
  }

  public static com.noble.fiattokenfactory.QueryAllMintersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAllMintersResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAllMintersResponse>() {
    @java.lang.Override
    public QueryAllMintersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAllMintersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAllMintersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.noble.fiattokenfactory.QueryAllMintersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

