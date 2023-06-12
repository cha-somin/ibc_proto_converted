// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/group/v1alpha1/tx.proto

package com.regen.group.v1alpha1;

/**
 * <pre>
 * MsgCreateGroup is the Msg/CreateGroup request type.
 * </pre>
 *
 * Protobuf type {@code regen.group.v1alpha1.MsgCreateGroup}
 */
public final class MsgCreateGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.group.v1alpha1.MsgCreateGroup)
    MsgCreateGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateGroup.newBuilder() to construct.
  private MsgCreateGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateGroup() {
    admin_ = "";
    members_ = java.util.Collections.emptyList();
    metadata_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgCreateGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgCreateGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.group.v1alpha1.MsgCreateGroup.class, com.regen.group.v1alpha1.MsgCreateGroup.Builder.class);
  }

  public static final int ADMIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object admin_ = "";
  /**
   * <pre>
   * admin is the account address of the group admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The admin.
   */
  @java.lang.Override
  public java.lang.String getAdmin() {
    java.lang.Object ref = admin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      admin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * admin is the account address of the group admin.
   * </pre>
   *
   * <code>string admin = 1 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdminBytes() {
    java.lang.Object ref = admin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      admin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMBERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.regen.group.v1alpha1.Member> members_;
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.regen.group.v1alpha1.Member> getMembersList() {
    return members_;
  }
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.regen.group.v1alpha1.MemberOrBuilder> 
      getMembersOrBuilderList() {
    return members_;
  }
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getMembersCount() {
    return members_.size();
  }
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.regen.group.v1alpha1.Member getMembers(int index) {
    return members_.get(index);
  }
  /**
   * <pre>
   * members defines the group members.
   * </pre>
   *
   * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.regen.group.v1alpha1.MemberOrBuilder getMembersOrBuilder(
      int index) {
    return members_.get(index);
  }

  public static final int METADATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString metadata_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * metadata is any arbitrary metadata to attached to the group.
   * </pre>
   *
   * <code>bytes metadata = 3 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetadata() {
    return metadata_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, admin_);
    }
    for (int i = 0; i < members_.size(); i++) {
      output.writeMessage(2, members_.get(i));
    }
    if (!metadata_.isEmpty()) {
      output.writeBytes(3, metadata_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, admin_);
    }
    for (int i = 0; i < members_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, members_.get(i));
    }
    if (!metadata_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, metadata_);
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
    if (!(obj instanceof com.regen.group.v1alpha1.MsgCreateGroup)) {
      return super.equals(obj);
    }
    com.regen.group.v1alpha1.MsgCreateGroup other = (com.regen.group.v1alpha1.MsgCreateGroup) obj;

    if (!getAdmin()
        .equals(other.getAdmin())) return false;
    if (!getMembersList()
        .equals(other.getMembersList())) return false;
    if (!getMetadata()
        .equals(other.getMetadata())) return false;
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
    hash = (37 * hash) + ADMIN_FIELD_NUMBER;
    hash = (53 * hash) + getAdmin().hashCode();
    if (getMembersCount() > 0) {
      hash = (37 * hash) + MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMembersList().hashCode();
    }
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.group.v1alpha1.MsgCreateGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.group.v1alpha1.MsgCreateGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.group.v1alpha1.MsgCreateGroup parseFrom(
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
  public static Builder newBuilder(com.regen.group.v1alpha1.MsgCreateGroup prototype) {
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
   * MsgCreateGroup is the Msg/CreateGroup request type.
   * </pre>
   *
   * Protobuf type {@code regen.group.v1alpha1.MsgCreateGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.group.v1alpha1.MsgCreateGroup)
      com.regen.group.v1alpha1.MsgCreateGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgCreateGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgCreateGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.group.v1alpha1.MsgCreateGroup.class, com.regen.group.v1alpha1.MsgCreateGroup.Builder.class);
    }

    // Construct using com.regen.group.v1alpha1.MsgCreateGroup.newBuilder()
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
      admin_ = "";
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
      } else {
        members_ = null;
        membersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.group.v1alpha1.TxProto.internal_static_regen_group_v1alpha1_MsgCreateGroup_descriptor;
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.MsgCreateGroup getDefaultInstanceForType() {
      return com.regen.group.v1alpha1.MsgCreateGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.MsgCreateGroup build() {
      com.regen.group.v1alpha1.MsgCreateGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.group.v1alpha1.MsgCreateGroup buildPartial() {
      com.regen.group.v1alpha1.MsgCreateGroup result = new com.regen.group.v1alpha1.MsgCreateGroup(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.regen.group.v1alpha1.MsgCreateGroup result) {
      if (membersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          members_ = java.util.Collections.unmodifiableList(members_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.members_ = members_;
      } else {
        result.members_ = membersBuilder_.build();
      }
    }

    private void buildPartial0(com.regen.group.v1alpha1.MsgCreateGroup result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.admin_ = admin_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadata_ = metadata_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.group.v1alpha1.MsgCreateGroup) {
        return mergeFrom((com.regen.group.v1alpha1.MsgCreateGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.group.v1alpha1.MsgCreateGroup other) {
      if (other == com.regen.group.v1alpha1.MsgCreateGroup.getDefaultInstance()) return this;
      if (!other.getAdmin().isEmpty()) {
        admin_ = other.admin_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (membersBuilder_ == null) {
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
      } else {
        if (!other.members_.isEmpty()) {
          if (membersBuilder_.isEmpty()) {
            membersBuilder_.dispose();
            membersBuilder_ = null;
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
            membersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMembersFieldBuilder() : null;
          } else {
            membersBuilder_.addAllMessages(other.members_);
          }
        }
      }
      if (other.getMetadata() != com.google.protobuf.ByteString.EMPTY) {
        setMetadata(other.getMetadata());
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
              admin_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.regen.group.v1alpha1.Member m =
                  input.readMessage(
                      com.regen.group.v1alpha1.Member.parser(),
                      extensionRegistry);
              if (membersBuilder_ == null) {
                ensureMembersIsMutable();
                members_.add(m);
              } else {
                membersBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              metadata_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object admin_ = "";
    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @return The admin.
     */
    public java.lang.String getAdmin() {
      java.lang.Object ref = admin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        admin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @return The bytes for admin.
     */
    public com.google.protobuf.ByteString
        getAdminBytes() {
      java.lang.Object ref = admin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        admin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @param value The admin to set.
     * @return This builder for chaining.
     */
    public Builder setAdmin(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      admin_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdmin() {
      admin_ = getDefaultInstance().getAdmin();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin"];</code>
     * @param value The bytes for admin to set.
     * @return This builder for chaining.
     */
    public Builder setAdminBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      admin_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.regen.group.v1alpha1.Member> members_ =
      java.util.Collections.emptyList();
    private void ensureMembersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        members_ = new java.util.ArrayList<com.regen.group.v1alpha1.Member>(members_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.regen.group.v1alpha1.Member, com.regen.group.v1alpha1.Member.Builder, com.regen.group.v1alpha1.MemberOrBuilder> membersBuilder_;

    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.regen.group.v1alpha1.Member> getMembersList() {
      if (membersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(members_);
      } else {
        return membersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public int getMembersCount() {
      if (membersBuilder_ == null) {
        return members_.size();
      } else {
        return membersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public com.regen.group.v1alpha1.Member getMembers(int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);
      } else {
        return membersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMembers(
        int index, com.regen.group.v1alpha1.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
      } else {
        membersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMembers(
        int index, com.regen.group.v1alpha1.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.set(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMembers(com.regen.group.v1alpha1.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
      } else {
        membersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMembers(
        int index, com.regen.group.v1alpha1.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(index, value);
        onChanged();
      } else {
        membersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMembers(
        com.regen.group.v1alpha1.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder addMembers(
        int index, com.regen.group.v1alpha1.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllMembers(
        java.lang.Iterable<? extends com.regen.group.v1alpha1.Member> values) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, members_);
        onChanged();
      } else {
        membersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMembers() {
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        membersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeMembers(int index) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.remove(index);
        onChanged();
      } else {
        membersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public com.regen.group.v1alpha1.Member.Builder getMembersBuilder(
        int index) {
      return getMembersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public com.regen.group.v1alpha1.MemberOrBuilder getMembersOrBuilder(
        int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);  } else {
        return membersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.regen.group.v1alpha1.MemberOrBuilder> 
         getMembersOrBuilderList() {
      if (membersBuilder_ != null) {
        return membersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(members_);
      }
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public com.regen.group.v1alpha1.Member.Builder addMembersBuilder() {
      return getMembersFieldBuilder().addBuilder(
          com.regen.group.v1alpha1.Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public com.regen.group.v1alpha1.Member.Builder addMembersBuilder(
        int index) {
      return getMembersFieldBuilder().addBuilder(
          index, com.regen.group.v1alpha1.Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members defines the group members.
     * </pre>
     *
     * <code>repeated .regen.group.v1alpha1.Member members = 2 [json_name = "members", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.regen.group.v1alpha1.Member.Builder> 
         getMembersBuilderList() {
      return getMembersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.regen.group.v1alpha1.Member, com.regen.group.v1alpha1.Member.Builder, com.regen.group.v1alpha1.MemberOrBuilder> 
        getMembersFieldBuilder() {
      if (membersBuilder_ == null) {
        membersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.regen.group.v1alpha1.Member, com.regen.group.v1alpha1.Member.Builder, com.regen.group.v1alpha1.MemberOrBuilder>(
                members_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        members_ = null;
      }
      return membersBuilder_;
    }

    private com.google.protobuf.ByteString metadata_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the group.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMetadata() {
      return metadata_;
    }
    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the group.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
     * @param value The metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadata(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      metadata_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the group.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000004);
      metadata_ = getDefaultInstance().getMetadata();
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


    // @@protoc_insertion_point(builder_scope:regen.group.v1alpha1.MsgCreateGroup)
  }

  // @@protoc_insertion_point(class_scope:regen.group.v1alpha1.MsgCreateGroup)
  private static final com.regen.group.v1alpha1.MsgCreateGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.group.v1alpha1.MsgCreateGroup();
  }

  public static com.regen.group.v1alpha1.MsgCreateGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateGroup>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateGroup>() {
    @java.lang.Override
    public MsgCreateGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.group.v1alpha1.MsgCreateGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

