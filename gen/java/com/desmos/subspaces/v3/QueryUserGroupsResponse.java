// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/subspaces/v3/query.proto

package com.desmos.subspaces.v3;

/**
 * <pre>
 * QueryUserGroupsResponse is the response type for the Query/UserGroups RPC
 * method
 * </pre>
 *
 * Protobuf type {@code desmos.subspaces.v3.QueryUserGroupsResponse}
 */
public final class QueryUserGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.subspaces.v3.QueryUserGroupsResponse)
    QueryUserGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUserGroupsResponse.newBuilder() to construct.
  private QueryUserGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUserGroupsResponse() {
    groups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryUserGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.subspaces.v3.QueryUserGroupsResponse.class, com.desmos.subspaces.v3.QueryUserGroupsResponse.Builder.class);
  }

  public static final int GROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.desmos.subspaces.v3.UserGroup> groups_;
  /**
   * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.desmos.subspaces.v3.UserGroup> getGroupsList() {
    return groups_;
  }
  /**
   * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.desmos.subspaces.v3.UserGroupOrBuilder> 
      getGroupsOrBuilderList() {
    return groups_;
  }
  /**
   * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getGroupsCount() {
    return groups_.size();
  }
  /**
   * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.desmos.subspaces.v3.UserGroup getGroups(int index) {
    return groups_.get(index);
  }
  /**
   * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.desmos.subspaces.v3.UserGroupOrBuilder getGroupsOrBuilder(
      int index) {
    return groups_.get(index);
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
    for (int i = 0; i < groups_.size(); i++) {
      output.writeMessage(1, groups_.get(i));
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
    for (int i = 0; i < groups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, groups_.get(i));
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
    if (!(obj instanceof com.desmos.subspaces.v3.QueryUserGroupsResponse)) {
      return super.equals(obj);
    }
    com.desmos.subspaces.v3.QueryUserGroupsResponse other = (com.desmos.subspaces.v3.QueryUserGroupsResponse) obj;

    if (!getGroupsList()
        .equals(other.getGroupsList())) return false;
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
    if (getGroupsCount() > 0) {
      hash = (37 * hash) + GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.desmos.subspaces.v3.QueryUserGroupsResponse prototype) {
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
   * QueryUserGroupsResponse is the response type for the Query/UserGroups RPC
   * method
   * </pre>
   *
   * Protobuf type {@code desmos.subspaces.v3.QueryUserGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.subspaces.v3.QueryUserGroupsResponse)
      com.desmos.subspaces.v3.QueryUserGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.subspaces.v3.QueryUserGroupsResponse.class, com.desmos.subspaces.v3.QueryUserGroupsResponse.Builder.class);
    }

    // Construct using com.desmos.subspaces.v3.QueryUserGroupsResponse.newBuilder()
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
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
      } else {
        groups_ = null;
        groupsBuilder_.clear();
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
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserGroupsResponse getDefaultInstanceForType() {
      return com.desmos.subspaces.v3.QueryUserGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserGroupsResponse build() {
      com.desmos.subspaces.v3.QueryUserGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserGroupsResponse buildPartial() {
      com.desmos.subspaces.v3.QueryUserGroupsResponse result = new com.desmos.subspaces.v3.QueryUserGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.desmos.subspaces.v3.QueryUserGroupsResponse result) {
      if (groupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          groups_ = java.util.Collections.unmodifiableList(groups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.groups_ = groups_;
      } else {
        result.groups_ = groupsBuilder_.build();
      }
    }

    private void buildPartial0(com.desmos.subspaces.v3.QueryUserGroupsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.subspaces.v3.QueryUserGroupsResponse) {
        return mergeFrom((com.desmos.subspaces.v3.QueryUserGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.subspaces.v3.QueryUserGroupsResponse other) {
      if (other == com.desmos.subspaces.v3.QueryUserGroupsResponse.getDefaultInstance()) return this;
      if (groupsBuilder_ == null) {
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
      } else {
        if (!other.groups_.isEmpty()) {
          if (groupsBuilder_.isEmpty()) {
            groupsBuilder_.dispose();
            groupsBuilder_ = null;
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupsFieldBuilder() : null;
          } else {
            groupsBuilder_.addAllMessages(other.groups_);
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
              com.desmos.subspaces.v3.UserGroup m =
                  input.readMessage(
                      com.desmos.subspaces.v3.UserGroup.parser(),
                      extensionRegistry);
              if (groupsBuilder_ == null) {
                ensureGroupsIsMutable();
                groups_.add(m);
              } else {
                groupsBuilder_.addMessage(m);
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

    private java.util.List<com.desmos.subspaces.v3.UserGroup> groups_ =
      java.util.Collections.emptyList();
    private void ensureGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        groups_ = new java.util.ArrayList<com.desmos.subspaces.v3.UserGroup>(groups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.subspaces.v3.UserGroup, com.desmos.subspaces.v3.UserGroup.Builder, com.desmos.subspaces.v3.UserGroupOrBuilder> groupsBuilder_;

    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.desmos.subspaces.v3.UserGroup> getGroupsList() {
      if (groupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(groups_);
      } else {
        return groupsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public int getGroupsCount() {
      if (groupsBuilder_ == null) {
        return groups_.size();
      } else {
        return groupsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.UserGroup getGroups(int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);
      } else {
        return groupsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder setGroups(
        int index, com.desmos.subspaces.v3.UserGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder setGroups(
        int index, com.desmos.subspaces.v3.UserGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder addGroups(com.desmos.subspaces.v3.UserGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder addGroups(
        int index, com.desmos.subspaces.v3.UserGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(index, value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder addGroups(
        com.desmos.subspaces.v3.UserGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder addGroups(
        int index, com.desmos.subspaces.v3.UserGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllGroups(
        java.lang.Iterable<? extends com.desmos.subspaces.v3.UserGroup> values) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, groups_);
        onChanged();
      } else {
        groupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearGroups() {
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeGroups(int index) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.remove(index);
        onChanged();
      } else {
        groupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.UserGroup.Builder getGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.UserGroupOrBuilder getGroupsOrBuilder(
        int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);  } else {
        return groupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.desmos.subspaces.v3.UserGroupOrBuilder> 
         getGroupsOrBuilderList() {
      if (groupsBuilder_ != null) {
        return groupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(groups_);
      }
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.UserGroup.Builder addGroupsBuilder() {
      return getGroupsFieldBuilder().addBuilder(
          com.desmos.subspaces.v3.UserGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public com.desmos.subspaces.v3.UserGroup.Builder addGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().addBuilder(
          index, com.desmos.subspaces.v3.UserGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .desmos.subspaces.v3.UserGroup groups = 1 [json_name = "groups", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.desmos.subspaces.v3.UserGroup.Builder> 
         getGroupsBuilderList() {
      return getGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.desmos.subspaces.v3.UserGroup, com.desmos.subspaces.v3.UserGroup.Builder, com.desmos.subspaces.v3.UserGroupOrBuilder> 
        getGroupsFieldBuilder() {
      if (groupsBuilder_ == null) {
        groupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.desmos.subspaces.v3.UserGroup, com.desmos.subspaces.v3.UserGroup.Builder, com.desmos.subspaces.v3.UserGroupOrBuilder>(
                groups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        groups_ = null;
      }
      return groupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:desmos.subspaces.v3.QueryUserGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:desmos.subspaces.v3.QueryUserGroupsResponse)
  private static final com.desmos.subspaces.v3.QueryUserGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.subspaces.v3.QueryUserGroupsResponse();
  }

  public static com.desmos.subspaces.v3.QueryUserGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUserGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryUserGroupsResponse>() {
    @java.lang.Override
    public QueryUserGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryUserGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUserGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.subspaces.v3.QueryUserGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

