// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/query.proto

package com.regen.ecocredit.v1alpha2;

/**
 * <pre>
 * QueryProjectsRequest is the Query/Projects request type.
 * </pre>
 *
 * Protobuf type {@code regen.ecocredit.v1alpha2.QueryProjectsRequest}
 */
public final class QueryProjectsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.ecocredit.v1alpha2.QueryProjectsRequest)
    QueryProjectsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProjectsRequest.newBuilder() to construct.
  private QueryProjectsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProjectsRequest() {
    classId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProjectsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.ecocredit.v1alpha2.QueryProjectsRequest.class, com.regen.ecocredit.v1alpha2.QueryProjectsRequest.Builder.class);
  }

  public static final int CLASS_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classId_ = "";
  /**
   * <pre>
   * class_id is the unique ID of credit class to query.
   * </pre>
   *
   * <code>string class_id = 1 [json_name = "classId"];</code>
   * @return The classId.
   */
  @java.lang.Override
  public java.lang.String getClassId() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * class_id is the unique ID of credit class to query.
   * </pre>
   *
   * <code>string class_id = 1 [json_name = "classId"];</code>
   * @return The bytes for classId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassIdBytes() {
    java.lang.Object ref = classId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageRequest pagination_;
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, classId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, classId_);
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
    if (!(obj instanceof com.regen.ecocredit.v1alpha2.QueryProjectsRequest)) {
      return super.equals(obj);
    }
    com.regen.ecocredit.v1alpha2.QueryProjectsRequest other = (com.regen.ecocredit.v1alpha2.QueryProjectsRequest) obj;

    if (!getClassId()
        .equals(other.getClassId())) return false;
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
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest parseFrom(
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
  public static Builder newBuilder(com.regen.ecocredit.v1alpha2.QueryProjectsRequest prototype) {
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
   * QueryProjectsRequest is the Query/Projects request type.
   * </pre>
   *
   * Protobuf type {@code regen.ecocredit.v1alpha2.QueryProjectsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.ecocredit.v1alpha2.QueryProjectsRequest)
      com.regen.ecocredit.v1alpha2.QueryProjectsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.ecocredit.v1alpha2.QueryProjectsRequest.class, com.regen.ecocredit.v1alpha2.QueryProjectsRequest.Builder.class);
    }

    // Construct using com.regen.ecocredit.v1alpha2.QueryProjectsRequest.newBuilder()
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
      classId_ = "";
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
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryProjectsRequest_descriptor;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryProjectsRequest getDefaultInstanceForType() {
      return com.regen.ecocredit.v1alpha2.QueryProjectsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryProjectsRequest build() {
      com.regen.ecocredit.v1alpha2.QueryProjectsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryProjectsRequest buildPartial() {
      com.regen.ecocredit.v1alpha2.QueryProjectsRequest result = new com.regen.ecocredit.v1alpha2.QueryProjectsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.ecocredit.v1alpha2.QueryProjectsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.classId_ = classId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.ecocredit.v1alpha2.QueryProjectsRequest) {
        return mergeFrom((com.regen.ecocredit.v1alpha2.QueryProjectsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.ecocredit.v1alpha2.QueryProjectsRequest other) {
      if (other == com.regen.ecocredit.v1alpha2.QueryProjectsRequest.getDefaultInstance()) return this;
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              classId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object classId_ = "";
    /**
     * <pre>
     * class_id is the unique ID of credit class to query.
     * </pre>
     *
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @return The classId.
     */
    public java.lang.String getClassId() {
      java.lang.Object ref = classId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * class_id is the unique ID of credit class to query.
     * </pre>
     *
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @return The bytes for classId.
     */
    public com.google.protobuf.ByteString
        getClassIdBytes() {
      java.lang.Object ref = classId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * class_id is the unique ID of credit class to query.
     * </pre>
     *
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @param value The classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * class_id is the unique ID of credit class to query.
     * </pre>
     *
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassId() {
      classId_ = getDefaultInstance().getClassId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * class_id is the unique ID of credit class to query.
     * </pre>
     *
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @param value The bytes for classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.query.v1beta1.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
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
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageRequest.Builder builderForValue) {
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
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance()) {
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
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
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
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequest.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
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
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
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


    // @@protoc_insertion_point(builder_scope:regen.ecocredit.v1alpha2.QueryProjectsRequest)
  }

  // @@protoc_insertion_point(class_scope:regen.ecocredit.v1alpha2.QueryProjectsRequest)
  private static final com.regen.ecocredit.v1alpha2.QueryProjectsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.ecocredit.v1alpha2.QueryProjectsRequest();
  }

  public static com.regen.ecocredit.v1alpha2.QueryProjectsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProjectsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryProjectsRequest>() {
    @java.lang.Override
    public QueryProjectsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProjectsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProjectsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.QueryProjectsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

