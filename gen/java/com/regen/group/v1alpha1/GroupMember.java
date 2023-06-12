// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/group/v1alpha1/types.proto

package com.regen.group.v1alpha1;

/**
 * <pre>
 * GroupMember represents the relationship between a group and a member.
 * </pre>
 *
 * Protobuf type {@code regen.group.v1alpha1.GroupMember}
 */
public final class GroupMember extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.group.v1alpha1.GroupMember)
    GroupMemberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupMember.newBuilder() to construct.
  private GroupMember(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupMember() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupMember();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.group.v1alpha1.TypesProto.internal_static_regen_group_v1alpha1_GroupMember_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.group.v1alpha1.TypesProto.internal_static_regen_group_v1alpha1_GroupMember_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.group.v1alpha1.GroupMember.class, com.regen.group.v1alpha1.GroupMember.Builder.class);
  }

  public static final int GROUP_ID_FIELD_NUMBER = 1;
  private long groupId_ = 0L;
  /**
   * <pre>
   * group_id is the unique ID of the group.
   * </pre>
   *
   * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
   * @return The groupId.
   */
  @java.lang.Override
  public long getGroupId() {
    return groupId_;
  }

  public static final int MEMBER_FIELD_NUMBER = 2;
  private com.regen.group.v1alpha1.Member member_;
  /**
   * <pre>
   * member is the member data.
   * </pre>
   *
   * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
   * @return Whether the member field is set.
   */
  @java.lang.Override
  public boolean hasMember() {
    return member_ != null;
  }
  /**
   * <pre>
   * member is the member data.
   * </pre>
   *
   * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
   * @return The member.
   */
  @java.lang.Override
  public com.regen.group.v1alpha1.Member getMember() {
    return member_ == null ? com.regen.group.v1alpha1.Member.getDefaultInstance() : member_;
  }
  /**
   * <pre>
   * member is the member data.
   * </pre>
   *
   * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
   */
  @java.lang.Override
  public com.regen.group.v1alpha1.MemberOrBuilder getMemberOrBuilder() {
    return member_ == null ? com.regen.group.v1alpha1.Member.getDefaultInstance() : member_;
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
    if (groupId_ != 0L) {
      output.writeUInt64(1, groupId_);
    }
    if (member_ != null) {
      output.writeMessage(2, getMember());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, groupId_);
    }
    if (member_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMember());
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
    if (!(obj instanceof com.regen.group.v1alpha1.GroupMember)) {
      return super.equals(obj);
    }
    com.regen.group.v1alpha1.GroupMember other = (com.regen.group.v1alpha1.GroupMember) obj;

    if (getGroupId()
        != other.getGroupId()) return false;
    if (hasMember() != other.hasMember()) return false;
    if (hasMember()) {
      if (!getMember()
          .equals(other.getMember())) return false;
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
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGroupId());
    if (hasMember()) {
      hash = (37 * hash) + MEMBER_FIELD_NUMBER;
      hash = (53 * hash) + getMember().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.group.v1alpha1.GroupMember parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.group.v1alpha1.GroupMember parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.group.v1alpha1.GroupMember parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.group.v1alpha1.GroupMember parseFrom(
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
  public static Builder newBuilder(com.regen.group.v1alpha1.GroupMember prototype) {
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
   * GroupMember represents the relationship between a group and a member.
   * </pre>
   *
   * Protobuf type {@code regen.group.v1alpha1.GroupMember}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.group.v1alpha1.GroupMember)
      com.regen.group.v1alpha1.GroupMemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.group.v1alpha1.TypesProto.internal_static_regen_group_v1alpha1_GroupMember_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.group.v1alpha1.TypesProto.internal_static_regen_group_v1alpha1_GroupMember_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.group.v1alpha1.GroupMember.class, com.regen.group.v1alpha1.GroupMember.Builder.class);
    }

    // Construct using com.regen.group.v1alpha1.GroupMember.newBuilder()
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
      groupId_ = 0L;
      member_ = null;
      if (memberBuilder_ != null) {
        memberBuilder_.dispose();
        memberBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.group.v1alpha1.TypesProto.internal_static_regen_group_v1alpha1_GroupMember_descriptor;
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.GroupMember getDefaultInstanceForType() {
      return com.regen.group.v1alpha1.GroupMember.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.GroupMember build() {
      com.regen.group.v1alpha1.GroupMember result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.GroupMember buildPartial() {
      com.regen.group.v1alpha1.GroupMember result = new com.regen.group.v1alpha1.GroupMember(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.group.v1alpha1.GroupMember result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.groupId_ = groupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.member_ = memberBuilder_ == null
            ? member_
            : memberBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.group.v1alpha1.GroupMember) {
        return mergeFrom((com.regen.group.v1alpha1.GroupMember)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.group.v1alpha1.GroupMember other) {
      if (other == com.regen.group.v1alpha1.GroupMember.getDefaultInstance()) return this;
      if (other.getGroupId() != 0L) {
        setGroupId(other.getGroupId());
      }
      if (other.hasMember()) {
        mergeMember(other.getMember());
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
              groupId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMemberFieldBuilder().getBuilder(),
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

    private long groupId_ ;
    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
     * @return The groupId.
     */
    @java.lang.Override
    public long getGroupId() {
      return groupId_;
    }
    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(long value) {

      groupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      groupId_ = 0L;
      onChanged();
      return this;
    }

    private com.regen.group.v1alpha1.Member member_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.regen.group.v1alpha1.Member, com.regen.group.v1alpha1.Member.Builder, com.regen.group.v1alpha1.MemberOrBuilder> memberBuilder_;
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     * @return Whether the member field is set.
     */
    public boolean hasMember() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     * @return The member.
     */
    public com.regen.group.v1alpha1.Member getMember() {
      if (memberBuilder_ == null) {
        return member_ == null ? com.regen.group.v1alpha1.Member.getDefaultInstance() : member_;
      } else {
        return memberBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     */
    public Builder setMember(com.regen.group.v1alpha1.Member value) {
      if (memberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        member_ = value;
      } else {
        memberBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     */
    public Builder setMember(
        com.regen.group.v1alpha1.Member.Builder builderForValue) {
      if (memberBuilder_ == null) {
        member_ = builderForValue.build();
      } else {
        memberBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     */
    public Builder mergeMember(com.regen.group.v1alpha1.Member value) {
      if (memberBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          member_ != null &&
          member_ != com.regen.group.v1alpha1.Member.getDefaultInstance()) {
          getMemberBuilder().mergeFrom(value);
        } else {
          member_ = value;
        }
      } else {
        memberBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     */
    public Builder clearMember() {
      bitField0_ = (bitField0_ & ~0x00000002);
      member_ = null;
      if (memberBuilder_ != null) {
        memberBuilder_.dispose();
        memberBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     */
    public com.regen.group.v1alpha1.Member.Builder getMemberBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMemberFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     */
    public com.regen.group.v1alpha1.MemberOrBuilder getMemberOrBuilder() {
      if (memberBuilder_ != null) {
        return memberBuilder_.getMessageOrBuilder();
      } else {
        return member_ == null ?
            com.regen.group.v1alpha1.Member.getDefaultInstance() : member_;
      }
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.regen.group.v1alpha1.Member member = 2 [json_name = "member"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.regen.group.v1alpha1.Member, com.regen.group.v1alpha1.Member.Builder, com.regen.group.v1alpha1.MemberOrBuilder> 
        getMemberFieldBuilder() {
      if (memberBuilder_ == null) {
        memberBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.regen.group.v1alpha1.Member, com.regen.group.v1alpha1.Member.Builder, com.regen.group.v1alpha1.MemberOrBuilder>(
                getMember(),
                getParentForChildren(),
                isClean());
        member_ = null;
      }
      return memberBuilder_;
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


    // @@protoc_insertion_point(builder_scope:regen.group.v1alpha1.GroupMember)
  }

  // @@protoc_insertion_point(class_scope:regen.group.v1alpha1.GroupMember)
  private static final com.regen.group.v1alpha1.GroupMember DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.group.v1alpha1.GroupMember();
  }

  public static com.regen.group.v1alpha1.GroupMember getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupMember>
      PARSER = new com.google.protobuf.AbstractParser<GroupMember>() {
    @java.lang.Override
    public GroupMember parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupMember> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupMember> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.group.v1alpha1.GroupMember getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

