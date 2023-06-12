// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/query.proto

package com.regen.ecocredit.v1alpha2;

/**
 * <pre>
 * QueryClassesResponse is the Query/Classes response type.
 * </pre>
 *
 * Protobuf type {@code regen.ecocredit.v1alpha2.QueryClassesResponse}
 */
public final class QueryClassesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.ecocredit.v1alpha2.QueryClassesResponse)
    QueryClassesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClassesResponse.newBuilder() to construct.
  private QueryClassesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClassesResponse() {
    classes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClassesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryClassesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryClassesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.ecocredit.v1alpha2.QueryClassesResponse.class, com.regen.ecocredit.v1alpha2.QueryClassesResponse.Builder.class);
  }

  public static final int CLASSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.regen.ecocredit.v1alpha2.ClassInfo> classes_;
  /**
   * <pre>
   * classes are the fetched credit classes.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
   */
  @java.lang.Override
  public java.util.List<com.regen.ecocredit.v1alpha2.ClassInfo> getClassesList() {
    return classes_;
  }
  /**
   * <pre>
   * classes are the fetched credit classes.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.regen.ecocredit.v1alpha2.ClassInfoOrBuilder> 
      getClassesOrBuilderList() {
    return classes_;
  }
  /**
   * <pre>
   * classes are the fetched credit classes.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
   */
  @java.lang.Override
  public int getClassesCount() {
    return classes_.size();
  }
  /**
   * <pre>
   * classes are the fetched credit classes.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
   */
  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.ClassInfo getClasses(int index) {
    return classes_.get(index);
  }
  /**
   * <pre>
   * classes are the fetched credit classes.
   * </pre>
   *
   * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
   */
  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.ClassInfoOrBuilder getClassesOrBuilder(
      int index) {
    return classes_.get(index);
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
    for (int i = 0; i < classes_.size(); i++) {
      output.writeMessage(1, classes_.get(i));
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
    for (int i = 0; i < classes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, classes_.get(i));
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
    if (!(obj instanceof com.regen.ecocredit.v1alpha2.QueryClassesResponse)) {
      return super.equals(obj);
    }
    com.regen.ecocredit.v1alpha2.QueryClassesResponse other = (com.regen.ecocredit.v1alpha2.QueryClassesResponse) obj;

    if (!getClassesList()
        .equals(other.getClassesList())) return false;
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
    if (getClassesCount() > 0) {
      hash = (37 * hash) + CLASSES_FIELD_NUMBER;
      hash = (53 * hash) + getClassesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse parseFrom(
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
  public static Builder newBuilder(com.regen.ecocredit.v1alpha2.QueryClassesResponse prototype) {
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
   * QueryClassesResponse is the Query/Classes response type.
   * </pre>
   *
   * Protobuf type {@code regen.ecocredit.v1alpha2.QueryClassesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.ecocredit.v1alpha2.QueryClassesResponse)
      com.regen.ecocredit.v1alpha2.QueryClassesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryClassesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryClassesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.ecocredit.v1alpha2.QueryClassesResponse.class, com.regen.ecocredit.v1alpha2.QueryClassesResponse.Builder.class);
    }

    // Construct using com.regen.ecocredit.v1alpha2.QueryClassesResponse.newBuilder()
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
      if (classesBuilder_ == null) {
        classes_ = java.util.Collections.emptyList();
      } else {
        classes_ = null;
        classesBuilder_.clear();
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
      return com.regen.ecocredit.v1alpha2.QueryProto.internal_static_regen_ecocredit_v1alpha2_QueryClassesResponse_descriptor;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryClassesResponse getDefaultInstanceForType() {
      return com.regen.ecocredit.v1alpha2.QueryClassesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryClassesResponse build() {
      com.regen.ecocredit.v1alpha2.QueryClassesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.QueryClassesResponse buildPartial() {
      com.regen.ecocredit.v1alpha2.QueryClassesResponse result = new com.regen.ecocredit.v1alpha2.QueryClassesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.regen.ecocredit.v1alpha2.QueryClassesResponse result) {
      if (classesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          classes_ = java.util.Collections.unmodifiableList(classes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.classes_ = classes_;
      } else {
        result.classes_ = classesBuilder_.build();
      }
    }

    private void buildPartial0(com.regen.ecocredit.v1alpha2.QueryClassesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.ecocredit.v1alpha2.QueryClassesResponse) {
        return mergeFrom((com.regen.ecocredit.v1alpha2.QueryClassesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.ecocredit.v1alpha2.QueryClassesResponse other) {
      if (other == com.regen.ecocredit.v1alpha2.QueryClassesResponse.getDefaultInstance()) return this;
      if (classesBuilder_ == null) {
        if (!other.classes_.isEmpty()) {
          if (classes_.isEmpty()) {
            classes_ = other.classes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClassesIsMutable();
            classes_.addAll(other.classes_);
          }
          onChanged();
        }
      } else {
        if (!other.classes_.isEmpty()) {
          if (classesBuilder_.isEmpty()) {
            classesBuilder_.dispose();
            classesBuilder_ = null;
            classes_ = other.classes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            classesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClassesFieldBuilder() : null;
          } else {
            classesBuilder_.addAllMessages(other.classes_);
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
              com.regen.ecocredit.v1alpha2.ClassInfo m =
                  input.readMessage(
                      com.regen.ecocredit.v1alpha2.ClassInfo.parser(),
                      extensionRegistry);
              if (classesBuilder_ == null) {
                ensureClassesIsMutable();
                classes_.add(m);
              } else {
                classesBuilder_.addMessage(m);
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

    private java.util.List<com.regen.ecocredit.v1alpha2.ClassInfo> classes_ =
      java.util.Collections.emptyList();
    private void ensureClassesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        classes_ = new java.util.ArrayList<com.regen.ecocredit.v1alpha2.ClassInfo>(classes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.regen.ecocredit.v1alpha2.ClassInfo, com.regen.ecocredit.v1alpha2.ClassInfo.Builder, com.regen.ecocredit.v1alpha2.ClassInfoOrBuilder> classesBuilder_;

    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public java.util.List<com.regen.ecocredit.v1alpha2.ClassInfo> getClassesList() {
      if (classesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(classes_);
      } else {
        return classesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public int getClassesCount() {
      if (classesBuilder_ == null) {
        return classes_.size();
      } else {
        return classesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public com.regen.ecocredit.v1alpha2.ClassInfo getClasses(int index) {
      if (classesBuilder_ == null) {
        return classes_.get(index);
      } else {
        return classesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder setClasses(
        int index, com.regen.ecocredit.v1alpha2.ClassInfo value) {
      if (classesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassesIsMutable();
        classes_.set(index, value);
        onChanged();
      } else {
        classesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder setClasses(
        int index, com.regen.ecocredit.v1alpha2.ClassInfo.Builder builderForValue) {
      if (classesBuilder_ == null) {
        ensureClassesIsMutable();
        classes_.set(index, builderForValue.build());
        onChanged();
      } else {
        classesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder addClasses(com.regen.ecocredit.v1alpha2.ClassInfo value) {
      if (classesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassesIsMutable();
        classes_.add(value);
        onChanged();
      } else {
        classesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder addClasses(
        int index, com.regen.ecocredit.v1alpha2.ClassInfo value) {
      if (classesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClassesIsMutable();
        classes_.add(index, value);
        onChanged();
      } else {
        classesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder addClasses(
        com.regen.ecocredit.v1alpha2.ClassInfo.Builder builderForValue) {
      if (classesBuilder_ == null) {
        ensureClassesIsMutable();
        classes_.add(builderForValue.build());
        onChanged();
      } else {
        classesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder addClasses(
        int index, com.regen.ecocredit.v1alpha2.ClassInfo.Builder builderForValue) {
      if (classesBuilder_ == null) {
        ensureClassesIsMutable();
        classes_.add(index, builderForValue.build());
        onChanged();
      } else {
        classesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder addAllClasses(
        java.lang.Iterable<? extends com.regen.ecocredit.v1alpha2.ClassInfo> values) {
      if (classesBuilder_ == null) {
        ensureClassesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, classes_);
        onChanged();
      } else {
        classesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder clearClasses() {
      if (classesBuilder_ == null) {
        classes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        classesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public Builder removeClasses(int index) {
      if (classesBuilder_ == null) {
        ensureClassesIsMutable();
        classes_.remove(index);
        onChanged();
      } else {
        classesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public com.regen.ecocredit.v1alpha2.ClassInfo.Builder getClassesBuilder(
        int index) {
      return getClassesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public com.regen.ecocredit.v1alpha2.ClassInfoOrBuilder getClassesOrBuilder(
        int index) {
      if (classesBuilder_ == null) {
        return classes_.get(index);  } else {
        return classesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public java.util.List<? extends com.regen.ecocredit.v1alpha2.ClassInfoOrBuilder> 
         getClassesOrBuilderList() {
      if (classesBuilder_ != null) {
        return classesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(classes_);
      }
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public com.regen.ecocredit.v1alpha2.ClassInfo.Builder addClassesBuilder() {
      return getClassesFieldBuilder().addBuilder(
          com.regen.ecocredit.v1alpha2.ClassInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public com.regen.ecocredit.v1alpha2.ClassInfo.Builder addClassesBuilder(
        int index) {
      return getClassesFieldBuilder().addBuilder(
          index, com.regen.ecocredit.v1alpha2.ClassInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * classes are the fetched credit classes.
     * </pre>
     *
     * <code>repeated .regen.ecocredit.v1alpha2.ClassInfo classes = 1 [json_name = "classes"];</code>
     */
    public java.util.List<com.regen.ecocredit.v1alpha2.ClassInfo.Builder> 
         getClassesBuilderList() {
      return getClassesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.regen.ecocredit.v1alpha2.ClassInfo, com.regen.ecocredit.v1alpha2.ClassInfo.Builder, com.regen.ecocredit.v1alpha2.ClassInfoOrBuilder> 
        getClassesFieldBuilder() {
      if (classesBuilder_ == null) {
        classesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.regen.ecocredit.v1alpha2.ClassInfo, com.regen.ecocredit.v1alpha2.ClassInfo.Builder, com.regen.ecocredit.v1alpha2.ClassInfoOrBuilder>(
                classes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        classes_ = null;
      }
      return classesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:regen.ecocredit.v1alpha2.QueryClassesResponse)
  }

  // @@protoc_insertion_point(class_scope:regen.ecocredit.v1alpha2.QueryClassesResponse)
  private static final com.regen.ecocredit.v1alpha2.QueryClassesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.ecocredit.v1alpha2.QueryClassesResponse();
  }

  public static com.regen.ecocredit.v1alpha2.QueryClassesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClassesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClassesResponse>() {
    @java.lang.Override
    public QueryClassesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClassesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClassesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.QueryClassesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

