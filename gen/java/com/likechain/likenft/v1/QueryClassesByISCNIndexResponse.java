// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/query.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.QueryClassesByISCNIndexResponse}
 */
public final class QueryClassesByISCNIndexResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.QueryClassesByISCNIndexResponse)
    QueryClassesByISCNIndexResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClassesByISCNIndexResponse.newBuilder() to construct.
  private QueryClassesByISCNIndexResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClassesByISCNIndexResponse() {
    classesByIscns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClassesByISCNIndexResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.QueryProto.internal_static_likechain_likenft_v1_QueryClassesByISCNIndexResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.QueryProto.internal_static_likechain_likenft_v1_QueryClassesByISCNIndexResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.class, com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.Builder.class);
  }

  public static final int CLASSES_BY_ISCNS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.likechain.likenft.v1.ClassesByISCN> classesByIscns_;
  /**
   * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.likechain.likenft.v1.ClassesByISCN> getClassesByIscnsList() {
    return classesByIscns_;
  }
  /**
   * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.likechain.likenft.v1.ClassesByISCNOrBuilder> 
      getClassesByIscnsOrBuilderList() {
    return classesByIscns_;
  }
  /**
   * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getClassesByIscnsCount() {
    return classesByIscns_.size();
  }
  /**
   * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.likechain.likenft.v1.ClassesByISCN getClassesByIscns(int index) {
    return classesByIscns_.get(index);
  }
  /**
   * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.likechain.likenft.v1.ClassesByISCNOrBuilder getClassesByIscnsOrBuilder(
      int index) {
    return classesByIscns_.get(index);
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
    for (int i = 0; i < classesByIscns_.size(); i++) {
      output.writeMessage(1, classesByIscns_.get(i));
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
    for (int i = 0; i < classesByIscns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, classesByIscns_.get(i));
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
    if (!(obj instanceof com.likechain.likenft.v1.QueryClassesByISCNIndexResponse)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.QueryClassesByISCNIndexResponse other = (com.likechain.likenft.v1.QueryClassesByISCNIndexResponse) obj;

    if (!getClassesByIscnsList()
        .equals(other.getClassesByIscnsList())) return false;
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
    if (getClassesByIscnsCount() > 0) {
      hash = (37 * hash) + CLASSES_BY_ISCNS_FIELD_NUMBER;
      hash = (53 * hash) + getClassesByIscnsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.QueryClassesByISCNIndexResponse prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.QueryClassesByISCNIndexResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.QueryClassesByISCNIndexResponse)
      com.likechain.likenft.v1.QueryClassesByISCNIndexResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.QueryProto.internal_static_likechain_likenft_v1_QueryClassesByISCNIndexResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.QueryProto.internal_static_likechain_likenft_v1_QueryClassesByISCNIndexResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.class, com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.newBuilder()
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
      if (classesByIscnsBuilder_ == null) {
        classesByIscns_ = java.util.Collections.emptyList();
      } else {
        classesByIscns_ = null;
        classesByIscnsBuilder_.clear();
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
      return com.likechain.likenft.v1.QueryProto.internal_static_likechain_likenft_v1_QueryClassesByISCNIndexResponse_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.QueryClassesByISCNIndexResponse getDefaultInstanceForType() {
      return com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.QueryClassesByISCNIndexResponse build() {
      com.likechain.likenft.v1.QueryClassesByISCNIndexResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.QueryClassesByISCNIndexResponse buildPartial() {
      com.likechain.likenft.v1.QueryClassesByISCNIndexResponse result = new com.likechain.likenft.v1.QueryClassesByISCNIndexResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.likechain.likenft.v1.QueryClassesByISCNIndexResponse result) {
      if (classesByIscnsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          classesByIscns_ = java.util.Collections.unmodifiableList(classesByIscns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.classesByIscns_ = classesByIscns_;
      } else {
        result.classesByIscns_ = classesByIscnsBuilder_.build();
      }
    }

    private void buildPartial0(com.likechain.likenft.v1.QueryClassesByISCNIndexResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.QueryClassesByISCNIndexResponse) {
        return mergeFrom((com.likechain.likenft.v1.QueryClassesByISCNIndexResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.QueryClassesByISCNIndexResponse other) {
      if (other == com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.getDefaultInstance()) return this;
      if (classesByIscnsBuilder_ == null) {
        if (!other.classesByIscns_.isEmpty()) {
          if (classesByIscns_.isEmpty()) {
            classesByIscns_ = other.classesByIscns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClassesByIscnsIsMutable();
            classesByIscns_.addAll(other.classesByIscns_);
          }
          onChanged();
        }
      } else {
        if (!other.classesByIscns_.isEmpty()) {
          if (classesByIscnsBuilder_.isEmpty()) {
            classesByIscnsBuilder_.dispose();
            classesByIscnsBuilder_ = null;
            classesByIscns_ = other.classesByIscns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            classesByIscnsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClassesByIscnsFieldBuilder() : null;
          } else {
            classesByIscnsBuilder_.addAllMessages(other.classesByIscns_);
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
              com.likechain.likenft.v1.ClassesByISCN m =
                  input.readMessage(
                      com.likechain.likenft.v1.ClassesByISCN.parser(),
                      extensionRegistry);
              if (classesByIscnsBuilder_ == null) {
                ensureClassesByIscnsIsMutable();
                classesByIscns_.add(m);
              } else {
                classesByIscnsBuilder_.addMessage(m);
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

    private java.util.List<com.likechain.likenft.v1.ClassesByISCN> classesByIscns_ =
      java.util.Collections.emptyList();
    private void ensureClassesByIscnsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        classesByIscns_ = new java.util.ArrayList<com.likechain.likenft.v1.ClassesByISCN>(classesByIscns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.likechain.likenft.v1.ClassesByISCN, com.likechain.likenft.v1.ClassesByISCN.Builder, com.likechain.likenft.v1.ClassesByISCNOrBuilder> classesByIscnsBuilder_;

    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.likechain.likenft.v1.ClassesByISCN> getClassesByIscnsList() {
      if (classesByIscnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(classesByIscns_);
      } else {
        return classesByIscnsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public int getClassesByIscnsCount() {
      if (classesByIscnsBuilder_ == null) {
        return classesByIscns_.size();
      } else {
        return classesByIscnsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.ClassesByISCN getClassesByIscns(int index) {
      if (classesByIscnsBuilder_ == null) {
        return classesByIscns_.get(index);
      } else {
        return classesByIscnsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder setClassesByIscns(
        int index, com.likechain.likenft.v1.ClassesByISCN value) {
      if (classesByIscnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassesByIscnsIsMutable();
        classesByIscns_.set(index, value);
        onChanged();
      } else {
        classesByIscnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder setClassesByIscns(
        int index, com.likechain.likenft.v1.ClassesByISCN.Builder builderForValue) {
      if (classesByIscnsBuilder_ == null) {
        ensureClassesByIscnsIsMutable();
        classesByIscns_.set(index, builderForValue.build());
        onChanged();
      } else {
        classesByIscnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClassesByIscns(com.likechain.likenft.v1.ClassesByISCN value) {
      if (classesByIscnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassesByIscnsIsMutable();
        classesByIscns_.add(value);
        onChanged();
      } else {
        classesByIscnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClassesByIscns(
        int index, com.likechain.likenft.v1.ClassesByISCN value) {
      if (classesByIscnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassesByIscnsIsMutable();
        classesByIscns_.add(index, value);
        onChanged();
      } else {
        classesByIscnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClassesByIscns(
        com.likechain.likenft.v1.ClassesByISCN.Builder builderForValue) {
      if (classesByIscnsBuilder_ == null) {
        ensureClassesByIscnsIsMutable();
        classesByIscns_.add(builderForValue.build());
        onChanged();
      } else {
        classesByIscnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClassesByIscns(
        int index, com.likechain.likenft.v1.ClassesByISCN.Builder builderForValue) {
      if (classesByIscnsBuilder_ == null) {
        ensureClassesByIscnsIsMutable();
        classesByIscns_.add(index, builderForValue.build());
        onChanged();
      } else {
        classesByIscnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllClassesByIscns(
        java.lang.Iterable<? extends com.likechain.likenft.v1.ClassesByISCN> values) {
      if (classesByIscnsBuilder_ == null) {
        ensureClassesByIscnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, classesByIscns_);
        onChanged();
      } else {
        classesByIscnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearClassesByIscns() {
      if (classesByIscnsBuilder_ == null) {
        classesByIscns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        classesByIscnsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeClassesByIscns(int index) {
      if (classesByIscnsBuilder_ == null) {
        ensureClassesByIscnsIsMutable();
        classesByIscns_.remove(index);
        onChanged();
      } else {
        classesByIscnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.ClassesByISCN.Builder getClassesByIscnsBuilder(
        int index) {
      return getClassesByIscnsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.ClassesByISCNOrBuilder getClassesByIscnsOrBuilder(
        int index) {
      if (classesByIscnsBuilder_ == null) {
        return classesByIscns_.get(index);  } else {
        return classesByIscnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.likechain.likenft.v1.ClassesByISCNOrBuilder> 
         getClassesByIscnsOrBuilderList() {
      if (classesByIscnsBuilder_ != null) {
        return classesByIscnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(classesByIscns_);
      }
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.ClassesByISCN.Builder addClassesByIscnsBuilder() {
      return getClassesByIscnsFieldBuilder().addBuilder(
          com.likechain.likenft.v1.ClassesByISCN.getDefaultInstance());
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.ClassesByISCN.Builder addClassesByIscnsBuilder(
        int index) {
      return getClassesByIscnsFieldBuilder().addBuilder(
          index, com.likechain.likenft.v1.ClassesByISCN.getDefaultInstance());
    }
    /**
     * <code>repeated .likechain.likenft.v1.ClassesByISCN classes_by_iscns = 1 [json_name = "classesByIscns", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.likechain.likenft.v1.ClassesByISCN.Builder> 
         getClassesByIscnsBuilderList() {
      return getClassesByIscnsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.likechain.likenft.v1.ClassesByISCN, com.likechain.likenft.v1.ClassesByISCN.Builder, com.likechain.likenft.v1.ClassesByISCNOrBuilder> 
        getClassesByIscnsFieldBuilder() {
      if (classesByIscnsBuilder_ == null) {
        classesByIscnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.likechain.likenft.v1.ClassesByISCN, com.likechain.likenft.v1.ClassesByISCN.Builder, com.likechain.likenft.v1.ClassesByISCNOrBuilder>(
                classesByIscns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        classesByIscns_ = null;
      }
      return classesByIscnsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.QueryClassesByISCNIndexResponse)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.QueryClassesByISCNIndexResponse)
  private static final com.likechain.likenft.v1.QueryClassesByISCNIndexResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.QueryClassesByISCNIndexResponse();
  }

  public static com.likechain.likenft.v1.QueryClassesByISCNIndexResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClassesByISCNIndexResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClassesByISCNIndexResponse>() {
    @java.lang.Override
    public QueryClassesByISCNIndexResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClassesByISCNIndexResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClassesByISCNIndexResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.QueryClassesByISCNIndexResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

