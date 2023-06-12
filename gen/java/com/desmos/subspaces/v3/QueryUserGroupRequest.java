// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/subspaces/v3/query.proto

package com.desmos.subspaces.v3;

/**
 * <pre>
 * QueryUserGroupRequest is the request type for the Query/UserGroup RPC method
 * </pre>
 *
 * Protobuf type {@code desmos.subspaces.v3.QueryUserGroupRequest}
 */
public final class QueryUserGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.subspaces.v3.QueryUserGroupRequest)
    QueryUserGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUserGroupRequest.newBuilder() to construct.
  private QueryUserGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUserGroupRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryUserGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.subspaces.v3.QueryUserGroupRequest.class, com.desmos.subspaces.v3.QueryUserGroupRequest.Builder.class);
  }

  public static final int SUBSPACE_ID_FIELD_NUMBER = 1;
  private long subspaceId_ = 0L;
  /**
   * <pre>
   * Id of the subspace that contains the group
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  @java.lang.Override
  public long getSubspaceId() {
    return subspaceId_;
  }

  public static final int GROUP_ID_FIELD_NUMBER = 2;
  private int groupId_ = 0;
  /**
   * <pre>
   * Id of the group to query
   * </pre>
   *
   * <code>uint32 group_id = 2 [json_name = "groupId", (.gogoproto.moretags) = "yaml:&#92;"group_id&#92;""];</code>
   * @return The groupId.
   */
  @java.lang.Override
  public int getGroupId() {
    return groupId_;
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
    if (subspaceId_ != 0L) {
      output.writeUInt64(1, subspaceId_);
    }
    if (groupId_ != 0) {
      output.writeUInt32(2, groupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subspaceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, subspaceId_);
    }
    if (groupId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, groupId_);
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
    if (!(obj instanceof com.desmos.subspaces.v3.QueryUserGroupRequest)) {
      return super.equals(obj);
    }
    com.desmos.subspaces.v3.QueryUserGroupRequest other = (com.desmos.subspaces.v3.QueryUserGroupRequest) obj;

    if (getSubspaceId()
        != other.getSubspaceId()) return false;
    if (getGroupId()
        != other.getGroupId()) return false;
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
    hash = (37 * hash) + SUBSPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSubspaceId());
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.subspaces.v3.QueryUserGroupRequest parseFrom(
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
  public static Builder newBuilder(com.desmos.subspaces.v3.QueryUserGroupRequest prototype) {
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
   * QueryUserGroupRequest is the request type for the Query/UserGroup RPC method
   * </pre>
   *
   * Protobuf type {@code desmos.subspaces.v3.QueryUserGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.subspaces.v3.QueryUserGroupRequest)
      com.desmos.subspaces.v3.QueryUserGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.subspaces.v3.QueryUserGroupRequest.class, com.desmos.subspaces.v3.QueryUserGroupRequest.Builder.class);
    }

    // Construct using com.desmos.subspaces.v3.QueryUserGroupRequest.newBuilder()
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
      subspaceId_ = 0L;
      groupId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.desmos.subspaces.v3.QueryProto.internal_static_desmos_subspaces_v3_QueryUserGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserGroupRequest getDefaultInstanceForType() {
      return com.desmos.subspaces.v3.QueryUserGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserGroupRequest build() {
      com.desmos.subspaces.v3.QueryUserGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.subspaces.v3.QueryUserGroupRequest buildPartial() {
      com.desmos.subspaces.v3.QueryUserGroupRequest result = new com.desmos.subspaces.v3.QueryUserGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.desmos.subspaces.v3.QueryUserGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subspaceId_ = subspaceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupId_ = groupId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.subspaces.v3.QueryUserGroupRequest) {
        return mergeFrom((com.desmos.subspaces.v3.QueryUserGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.subspaces.v3.QueryUserGroupRequest other) {
      if (other == com.desmos.subspaces.v3.QueryUserGroupRequest.getDefaultInstance()) return this;
      if (other.getSubspaceId() != 0L) {
        setSubspaceId(other.getSubspaceId());
      }
      if (other.getGroupId() != 0) {
        setGroupId(other.getGroupId());
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
            case 8: {
              subspaceId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              groupId_ = input.readUInt32();
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

    private long subspaceId_ ;
    /**
     * <pre>
     * Id of the subspace that contains the group
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return The subspaceId.
     */
    @java.lang.Override
    public long getSubspaceId() {
      return subspaceId_;
    }
    /**
     * <pre>
     * Id of the subspace that contains the group
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @param value The subspaceId to set.
     * @return This builder for chaining.
     */
    public Builder setSubspaceId(long value) {

      subspaceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the subspace that contains the group
     * </pre>
     *
     * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubspaceId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subspaceId_ = 0L;
      onChanged();
      return this;
    }

    private int groupId_ ;
    /**
     * <pre>
     * Id of the group to query
     * </pre>
     *
     * <code>uint32 group_id = 2 [json_name = "groupId", (.gogoproto.moretags) = "yaml:&#92;"group_id&#92;""];</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }
    /**
     * <pre>
     * Id of the group to query
     * </pre>
     *
     * <code>uint32 group_id = 2 [json_name = "groupId", (.gogoproto.moretags) = "yaml:&#92;"group_id&#92;""];</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(int value) {

      groupId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Id of the group to query
     * </pre>
     *
     * <code>uint32 group_id = 2 [json_name = "groupId", (.gogoproto.moretags) = "yaml:&#92;"group_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      groupId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:desmos.subspaces.v3.QueryUserGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:desmos.subspaces.v3.QueryUserGroupRequest)
  private static final com.desmos.subspaces.v3.QueryUserGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.subspaces.v3.QueryUserGroupRequest();
  }

  public static com.desmos.subspaces.v3.QueryUserGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUserGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryUserGroupRequest>() {
    @java.lang.Override
    public QueryUserGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryUserGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUserGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.subspaces.v3.QueryUserGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

