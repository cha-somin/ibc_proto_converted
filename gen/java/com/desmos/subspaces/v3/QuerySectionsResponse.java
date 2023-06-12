// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/subspaces/v3/query.proto

package com.desmos.subspaces.v3;

/**
 * <pre>
 * QuerySectionsResponse is the response type for Query/Sections RPC method
 * </pre>
 *
 * Protobuf type {@code desmos.subspaces.v3.QuerySectionsResponse}
 */
public final class QuerySectionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.subspaces.v3.QuerySectionsResponse)
    QuerySectionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySectionsResponse.newBuilder() to construct.
  private QuerySectionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySectionsResponse() {
    sections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySectionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QuerySectionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QuerySectionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.subspaces.v3.QuerySectionsResponse.class, com.desmos.subspaces.v3.QuerySectionsResponse.Builder.class);
  }

  public static final int SECTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.desmos.subspaces.v3.Section> sections_;
  /**
   * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.desmos.subspaces.v3.Section> getSectionsList() {
    return sections_;
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.desmos.subspaces.v3.SectionOrBuilder> 
      getSectionsOrBuilderList() {
    return sections_;
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getSectionsCount() {
    return sections_.size();
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.desmos.subspaces.v3.Section getSections(int index) {
    return sections_.get(index);
  }
  /**
   * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.desmos.subspaces.v3.SectionOrBuilder getSectionsOrBuilder(
      int index) {
    return sections_.get(index);
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
    for (int i = 0; i < sections_.size(); i++) {
      output.writeMessage(1, sections_.get(i));
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
    for (int i = 0; i < sections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sections_.get(i));
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
    if (!(obj instanceof com.desmos.subspaces.v3.QuerySectionsResponse)) {
      return super.equals(obj);
    }
    com.desmos.subspaces.v3.QuerySectionsResponse other = (com.desmos.subspaces.v3.QuerySectionsResponse) obj;

    if (!getSectionsList()
        .equals(other.getSectionsList())) return false;
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
    if (getSectionsCount() > 0) {
      hash = (37 * hash) + SECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSectionsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.subspaces.v3.QuerySectionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.subspaces.v3.QuerySectionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QuerySectionsResponse parseFrom(
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
  public static Builder newBuilder(com.desmos.subspaces.v3.QuerySectionsResponse prototype) {
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
   * QuerySectionsResponse is the response type for Query/Sections RPC method
   * </pre>
   *
   * Protobuf type {@code desmos.subspaces.v3.QuerySectionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.subspaces.v3.QuerySectionsResponse)
      com.desmos.subspaces.v3.QuerySectionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QuerySectionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QuerySectionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.subspaces.v3.QuerySectionsResponse.class, com.desmos.subspaces.v3.QuerySectionsResponse.Builder.class);
    }

    // Construct using com.desmos.subspaces.v3.QuerySectionsResponse.newBuilder()
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
      if (sectionsBuilder_ == null) {
        sections_ = java.util.Collections.emptyList();
      } else {
        sections_ = null;
        sectionsBuilder_.clear();
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
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QuerySectionsResponse_descriptor;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QuerySectionsResponse getDefaultInstanceForType() {
      return com.desmos.subspaces.v3.QuerySectionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QuerySectionsResponse build() {
      com.desmos.subspaces.v3.QuerySectionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QuerySectionsResponse buildPartial() {
      com.desmos.subspaces.v3.QuerySectionsResponse result = new com.desmos.subspaces.v3.QuerySectionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.desmos.subspaces.v3.QuerySectionsResponse result) {
      if (sectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sections_ = java.util.Collections.unmodifiableList(sections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sections_ = sections_;
      } else {
        result.sections_ = sectionsBuilder_.build();
      }
    }

    private void buildPartial0(com.desmos.subspaces.v3.QuerySectionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.subspaces.v3.QuerySectionsResponse) {
        return mergeFrom((com.desmos.subspaces.v3.QuerySectionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.subspaces.v3.QuerySectionsResponse other) {
      if (other == com.desmos.subspaces.v3.QuerySectionsResponse.getDefaultInstance()) return this;
      if (sectionsBuilder_ == null) {
        if (!other.sections_.isEmpty()) {
          if (sections_.isEmpty()) {
            sections_ = other.sections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSectionsIsMutable();
            sections_.addAll(other.sections_);
          }
          onChanged();
        }
      } else {
        if (!other.sections_.isEmpty()) {
          if (sectionsBuilder_.isEmpty()) {
            sectionsBuilder_.dispose();
            sectionsBuilder_ = null;
            sections_ = other.sections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSectionsFieldBuilder() : null;
          } else {
            sectionsBuilder_.addAllMessages(other.sections_);
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
              com.desmos.subspaces.v3.Section m =
                  input.readMessage(
                      com.desmos.subspaces.v3.Section.parser(),
                      extensionRegistry);
              if (sectionsBuilder_ == null) {
                ensureSectionsIsMutable();
                sections_.add(m);
              } else {
                sectionsBuilder_.addMessage(m);
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

    private java.util.List<com.desmos.subspaces.v3.Section> sections_ =
      java.util.Collections.emptyList();
    private void ensureSectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sections_ = new java.util.ArrayList<com.desmos.subspaces.v3.Section>(sections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.subspaces.v3.Section, com.desmos.subspaces.v3.Section.Builder, com.desmos.subspaces.v3.SectionOrBuilder> sectionsBuilder_;

    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.desmos.subspaces.v3.Section> getSectionsList() {
      if (sectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sections_);
      } else {
        return sectionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public int getSectionsCount() {
      if (sectionsBuilder_ == null) {
        return sections_.size();
      } else {
        return sectionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.Section getSections(int index) {
      if (sectionsBuilder_ == null) {
        return sections_.get(index);
      } else {
        return sectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder setSections(
        int index, com.desmos.subspaces.v3.Section value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.set(index, value);
        onChanged();
      } else {
        sectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder setSections(
        int index, com.desmos.subspaces.v3.Section.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.set(index, builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSections(com.desmos.subspaces.v3.Section value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.add(value);
        onChanged();
      } else {
        sectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSections(
        int index, com.desmos.subspaces.v3.Section value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.add(index, value);
        onChanged();
      } else {
        sectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSections(
        com.desmos.subspaces.v3.Section.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.add(builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSections(
        int index, com.desmos.subspaces.v3.Section.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.add(index, builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllSections(
        java.lang.Iterable<? extends com.desmos.subspaces.v3.Section> values) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sections_);
        onChanged();
      } else {
        sectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearSections() {
      if (sectionsBuilder_ == null) {
        sections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeSections(int index) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.remove(index);
        onChanged();
      } else {
        sectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.Section.Builder getSectionsBuilder(
        int index) {
      return getSectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.SectionOrBuilder getSectionsOrBuilder(
        int index) {
      if (sectionsBuilder_ == null) {
        return sections_.get(index);  } else {
        return sectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.desmos.subspaces.v3.SectionOrBuilder> 
         getSectionsOrBuilderList() {
      if (sectionsBuilder_ != null) {
        return sectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sections_);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.Section.Builder addSectionsBuilder() {
      return getSectionsFieldBuilder().addBuilder(
          com.desmos.subspaces.v3.Section.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.Section.Builder addSectionsBuilder(
        int index) {
      return getSectionsFieldBuilder().addBuilder(
          index, com.desmos.subspaces.v3.Section.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.subspaces.v3.Section sections = 1 [json_name = "sections", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.desmos.subspaces.v3.Section.Builder> 
         getSectionsBuilderList() {
      return getSectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.subspaces.v3.Section, com.desmos.subspaces.v3.Section.Builder, com.desmos.subspaces.v3.SectionOrBuilder> 
        getSectionsFieldBuilder() {
      if (sectionsBuilder_ == null) {
        sectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.desmos.subspaces.v3.Section, com.desmos.subspaces.v3.Section.Builder, com.desmos.subspaces.v3.SectionOrBuilder>(
                sections_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sections_ = null;
      }
      return sectionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:desmos.subspaces.v3.QuerySectionsResponse)
  }

  // @@protoc_insertion_point(class_scope:desmos.subspaces.v3.QuerySectionsResponse)
  private static final com.desmos.subspaces.v3.QuerySectionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.subspaces.v3.QuerySectionsResponse();
  }

  public static com.desmos.subspaces.v3.QuerySectionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySectionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySectionsResponse>() {
    @java.lang.Override
    public QuerySectionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySectionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySectionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.subspaces.v3.QuerySectionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

