// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bcna/bcna/query.proto

package com.bitcannaglobal.bcna.bcna;

/**
 * Protobuf type {@code bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse}
 */
public final class QueryAllBitcannaidResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse)
    QueryAllBitcannaidResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAllBitcannaidResponse.newBuilder() to construct.
  private QueryAllBitcannaidResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAllBitcannaidResponse() {
    bitcannaid_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAllBitcannaidResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bitcannaglobal.bcna.bcna.QueryProto.internal_static_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bitcannaglobal.bcna.bcna.QueryProto.internal_static_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse.class, com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse.Builder.class);
  }

  public static final int BITCANNAID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.bitcannaglobal.bcna.bcna.Bitcannaid> bitcannaid_;
  /**
   * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.bitcannaglobal.bcna.bcna.Bitcannaid> getBitcannaidList() {
    return bitcannaid_;
  }
  /**
   * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.bitcannaglobal.bcna.bcna.BitcannaidOrBuilder> 
      getBitcannaidOrBuilderList() {
    return bitcannaid_;
  }
  /**
   * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getBitcannaidCount() {
    return bitcannaid_.size();
  }
  /**
   * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.bitcannaglobal.bcna.bcna.Bitcannaid getBitcannaid(int index) {
    return bitcannaid_.get(index);
  }
  /**
   * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.bitcannaglobal.bcna.bcna.BitcannaidOrBuilder getBitcannaidOrBuilder(
      int index) {
    return bitcannaid_.get(index);
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
    for (int i = 0; i < bitcannaid_.size(); i++) {
      output.writeMessage(1, bitcannaid_.get(i));
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
    for (int i = 0; i < bitcannaid_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bitcannaid_.get(i));
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
    if (!(obj instanceof com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse)) {
      return super.equals(obj);
    }
    com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse other = (com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse) obj;

    if (!getBitcannaidList()
        .equals(other.getBitcannaidList())) return false;
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
    if (getBitcannaidCount() > 0) {
      hash = (37 * hash) + BITCANNAID_FIELD_NUMBER;
      hash = (53 * hash) + getBitcannaidList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse parseFrom(
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
  public static Builder newBuilder(com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse prototype) {
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
   * Protobuf type {@code bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse)
      com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bitcannaglobal.bcna.bcna.QueryProto.internal_static_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bitcannaglobal.bcna.bcna.QueryProto.internal_static_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse.class, com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse.Builder.class);
    }

    // Construct using com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse.newBuilder()
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
      if (bitcannaidBuilder_ == null) {
        bitcannaid_ = java.util.Collections.emptyList();
      } else {
        bitcannaid_ = null;
        bitcannaidBuilder_.clear();
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
      return com.bitcannaglobal.bcna.bcna.QueryProto.internal_static_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse_descriptor;
    }

    @java.lang.Override
    public com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse getDefaultInstanceForType() {
      return com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse build() {
      com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse buildPartial() {
      com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse result = new com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse result) {
      if (bitcannaidBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bitcannaid_ = java.util.Collections.unmodifiableList(bitcannaid_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bitcannaid_ = bitcannaid_;
      } else {
        result.bitcannaid_ = bitcannaidBuilder_.build();
      }
    }

    private void buildPartial0(com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse) {
        return mergeFrom((com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse other) {
      if (other == com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse.getDefaultInstance()) return this;
      if (bitcannaidBuilder_ == null) {
        if (!other.bitcannaid_.isEmpty()) {
          if (bitcannaid_.isEmpty()) {
            bitcannaid_ = other.bitcannaid_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBitcannaidIsMutable();
            bitcannaid_.addAll(other.bitcannaid_);
          }
          onChanged();
        }
      } else {
        if (!other.bitcannaid_.isEmpty()) {
          if (bitcannaidBuilder_.isEmpty()) {
            bitcannaidBuilder_.dispose();
            bitcannaidBuilder_ = null;
            bitcannaid_ = other.bitcannaid_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bitcannaidBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBitcannaidFieldBuilder() : null;
          } else {
            bitcannaidBuilder_.addAllMessages(other.bitcannaid_);
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
              com.bitcannaglobal.bcna.bcna.Bitcannaid m =
                  input.readMessage(
                      com.bitcannaglobal.bcna.bcna.Bitcannaid.parser(),
                      extensionRegistry);
              if (bitcannaidBuilder_ == null) {
                ensureBitcannaidIsMutable();
                bitcannaid_.add(m);
              } else {
                bitcannaidBuilder_.addMessage(m);
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

    private java.util.List<com.bitcannaglobal.bcna.bcna.Bitcannaid> bitcannaid_ =
      java.util.Collections.emptyList();
    private void ensureBitcannaidIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bitcannaid_ = new java.util.ArrayList<com.bitcannaglobal.bcna.bcna.Bitcannaid>(bitcannaid_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bitcannaglobal.bcna.bcna.Bitcannaid, com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder, com.bitcannaglobal.bcna.bcna.BitcannaidOrBuilder> bitcannaidBuilder_;

    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.bitcannaglobal.bcna.bcna.Bitcannaid> getBitcannaidList() {
      if (bitcannaidBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bitcannaid_);
      } else {
        return bitcannaidBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public int getBitcannaidCount() {
      if (bitcannaidBuilder_ == null) {
        return bitcannaid_.size();
      } else {
        return bitcannaidBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public com.bitcannaglobal.bcna.bcna.Bitcannaid getBitcannaid(int index) {
      if (bitcannaidBuilder_ == null) {
        return bitcannaid_.get(index);
      } else {
        return bitcannaidBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder setBitcannaid(
        int index, com.bitcannaglobal.bcna.bcna.Bitcannaid value) {
      if (bitcannaidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBitcannaidIsMutable();
        bitcannaid_.set(index, value);
        onChanged();
      } else {
        bitcannaidBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder setBitcannaid(
        int index, com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder builderForValue) {
      if (bitcannaidBuilder_ == null) {
        ensureBitcannaidIsMutable();
        bitcannaid_.set(index, builderForValue.build());
        onChanged();
      } else {
        bitcannaidBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBitcannaid(com.bitcannaglobal.bcna.bcna.Bitcannaid value) {
      if (bitcannaidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBitcannaidIsMutable();
        bitcannaid_.add(value);
        onChanged();
      } else {
        bitcannaidBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBitcannaid(
        int index, com.bitcannaglobal.bcna.bcna.Bitcannaid value) {
      if (bitcannaidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBitcannaidIsMutable();
        bitcannaid_.add(index, value);
        onChanged();
      } else {
        bitcannaidBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBitcannaid(
        com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder builderForValue) {
      if (bitcannaidBuilder_ == null) {
        ensureBitcannaidIsMutable();
        bitcannaid_.add(builderForValue.build());
        onChanged();
      } else {
        bitcannaidBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBitcannaid(
        int index, com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder builderForValue) {
      if (bitcannaidBuilder_ == null) {
        ensureBitcannaidIsMutable();
        bitcannaid_.add(index, builderForValue.build());
        onChanged();
      } else {
        bitcannaidBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllBitcannaid(
        java.lang.Iterable<? extends com.bitcannaglobal.bcna.bcna.Bitcannaid> values) {
      if (bitcannaidBuilder_ == null) {
        ensureBitcannaidIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bitcannaid_);
        onChanged();
      } else {
        bitcannaidBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearBitcannaid() {
      if (bitcannaidBuilder_ == null) {
        bitcannaid_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bitcannaidBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeBitcannaid(int index) {
      if (bitcannaidBuilder_ == null) {
        ensureBitcannaidIsMutable();
        bitcannaid_.remove(index);
        onChanged();
      } else {
        bitcannaidBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder getBitcannaidBuilder(
        int index) {
      return getBitcannaidFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public com.bitcannaglobal.bcna.bcna.BitcannaidOrBuilder getBitcannaidOrBuilder(
        int index) {
      if (bitcannaidBuilder_ == null) {
        return bitcannaid_.get(index);  } else {
        return bitcannaidBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.bitcannaglobal.bcna.bcna.BitcannaidOrBuilder> 
         getBitcannaidOrBuilderList() {
      if (bitcannaidBuilder_ != null) {
        return bitcannaidBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bitcannaid_);
      }
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder addBitcannaidBuilder() {
      return getBitcannaidFieldBuilder().addBuilder(
          com.bitcannaglobal.bcna.bcna.Bitcannaid.getDefaultInstance());
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder addBitcannaidBuilder(
        int index) {
      return getBitcannaidFieldBuilder().addBuilder(
          index, com.bitcannaglobal.bcna.bcna.Bitcannaid.getDefaultInstance());
    }
    /**
     * <code>repeated .bitcannaglobal.bcna.bcna.Bitcannaid Bitcannaid = 1 [json_name = "Bitcannaid", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder> 
         getBitcannaidBuilderList() {
      return getBitcannaidFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bitcannaglobal.bcna.bcna.Bitcannaid, com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder, com.bitcannaglobal.bcna.bcna.BitcannaidOrBuilder> 
        getBitcannaidFieldBuilder() {
      if (bitcannaidBuilder_ == null) {
        bitcannaidBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bitcannaglobal.bcna.bcna.Bitcannaid, com.bitcannaglobal.bcna.bcna.Bitcannaid.Builder, com.bitcannaglobal.bcna.bcna.BitcannaidOrBuilder>(
                bitcannaid_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bitcannaid_ = null;
      }
      return bitcannaidBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse)
  }

  // @@protoc_insertion_point(class_scope:bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse)
  private static final com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse();
  }

  public static com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAllBitcannaidResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAllBitcannaidResponse>() {
    @java.lang.Override
    public QueryAllBitcannaidResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAllBitcannaidResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAllBitcannaidResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

