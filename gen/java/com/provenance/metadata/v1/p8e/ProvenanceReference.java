// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package com.provenance.metadata.v1.p8e;

/**
 * <pre>
 * Deprecated: Do not use.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.p8e.ProvenanceReference}
 */
@java.lang.Deprecated public final class ProvenanceReference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.p8e.ProvenanceReference)
    ProvenanceReferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProvenanceReference.newBuilder() to construct.
  private ProvenanceReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProvenanceReference() {
    hash_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProvenanceReference();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_ProvenanceReference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_ProvenanceReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.p8e.ProvenanceReference.class, com.provenance.metadata.v1.p8e.ProvenanceReference.Builder.class);
  }

  public static final int SCOPE_UUID_FIELD_NUMBER = 1;
  private com.provenance.metadata.v1.p8e.UUID scopeUuid_;
  /**
   * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
   * @return Whether the scopeUuid field is set.
   */
  @java.lang.Override
  public boolean hasScopeUuid() {
    return scopeUuid_ != null;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
   * @return The scopeUuid.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.p8e.UUID getScopeUuid() {
    return scopeUuid_ == null ? com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : scopeUuid_;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.p8e.UUIDOrBuilder getScopeUuidOrBuilder() {
    return scopeUuid_ == null ? com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : scopeUuid_;
  }

  public static final int GROUP_UUID_FIELD_NUMBER = 2;
  private com.provenance.metadata.v1.p8e.UUID groupUuid_;
  /**
   * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
   * @return Whether the groupUuid field is set.
   */
  @java.lang.Override
  public boolean hasGroupUuid() {
    return groupUuid_ != null;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
   * @return The groupUuid.
   */
  @java.lang.Override
  public com.provenance.metadata.v1.p8e.UUID getGroupUuid() {
    return groupUuid_ == null ? com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : groupUuid_;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
   */
  @java.lang.Override
  public com.provenance.metadata.v1.p8e.UUIDOrBuilder getGroupUuidOrBuilder() {
    return groupUuid_ == null ? com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : groupUuid_;
  }

  public static final int HASH_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hash_ = "";
  /**
   * <code>string hash = 3 [json_name = "hash"];</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <code>string hash = 3 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (scopeUuid_ != null) {
      output.writeMessage(1, getScopeUuid());
    }
    if (groupUuid_ != null) {
      output.writeMessage(2, getGroupUuid());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scopeUuid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScopeUuid());
    }
    if (groupUuid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGroupUuid());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hash_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hash_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
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
    if (!(obj instanceof com.provenance.metadata.v1.p8e.ProvenanceReference)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.p8e.ProvenanceReference other = (com.provenance.metadata.v1.p8e.ProvenanceReference) obj;

    if (hasScopeUuid() != other.hasScopeUuid()) return false;
    if (hasScopeUuid()) {
      if (!getScopeUuid()
          .equals(other.getScopeUuid())) return false;
    }
    if (hasGroupUuid() != other.hasGroupUuid()) return false;
    if (hasGroupUuid()) {
      if (!getGroupUuid()
          .equals(other.getGroupUuid())) return false;
    }
    if (!getHash()
        .equals(other.getHash())) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    if (hasScopeUuid()) {
      hash = (37 * hash) + SCOPE_UUID_FIELD_NUMBER;
      hash = (53 * hash) + getScopeUuid().hashCode();
    }
    if (hasGroupUuid()) {
      hash = (37 * hash) + GROUP_UUID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupUuid().hashCode();
    }
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.p8e.ProvenanceReference parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.p8e.ProvenanceReference prototype) {
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
   * Deprecated: Do not use.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.p8e.ProvenanceReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.p8e.ProvenanceReference)
      com.provenance.metadata.v1.p8e.ProvenanceReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_ProvenanceReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_ProvenanceReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.p8e.ProvenanceReference.class, com.provenance.metadata.v1.p8e.ProvenanceReference.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.p8e.ProvenanceReference.newBuilder()
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
      scopeUuid_ = null;
      if (scopeUuidBuilder_ != null) {
        scopeUuidBuilder_.dispose();
        scopeUuidBuilder_ = null;
      }
      groupUuid_ = null;
      if (groupUuidBuilder_ != null) {
        groupUuidBuilder_.dispose();
        groupUuidBuilder_ = null;
      }
      hash_ = "";
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.p8e.P8eProto.internal_static_provenance_metadata_v1_p8e_ProvenanceReference_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.ProvenanceReference getDefaultInstanceForType() {
      return com.provenance.metadata.v1.p8e.ProvenanceReference.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.ProvenanceReference build() {
      com.provenance.metadata.v1.p8e.ProvenanceReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.p8e.ProvenanceReference buildPartial() {
      com.provenance.metadata.v1.p8e.ProvenanceReference result = new com.provenance.metadata.v1.p8e.ProvenanceReference(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.p8e.ProvenanceReference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scopeUuid_ = scopeUuidBuilder_ == null
            ? scopeUuid_
            : scopeUuidBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupUuid_ = groupUuidBuilder_ == null
            ? groupUuid_
            : groupUuidBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hash_ = hash_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.p8e.ProvenanceReference) {
        return mergeFrom((com.provenance.metadata.v1.p8e.ProvenanceReference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.p8e.ProvenanceReference other) {
      if (other == com.provenance.metadata.v1.p8e.ProvenanceReference.getDefaultInstance()) return this;
      if (other.hasScopeUuid()) {
        mergeScopeUuid(other.getScopeUuid());
      }
      if (other.hasGroupUuid()) {
        mergeGroupUuid(other.getGroupUuid());
      }
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              input.readMessage(
                  getScopeUuidFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getGroupUuidFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              hash_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.provenance.metadata.v1.p8e.UUID scopeUuid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.p8e.UUID, com.provenance.metadata.v1.p8e.UUID.Builder, com.provenance.metadata.v1.p8e.UUIDOrBuilder> scopeUuidBuilder_;
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     * @return Whether the scopeUuid field is set.
     */
    public boolean hasScopeUuid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     * @return The scopeUuid.
     */
    public com.provenance.metadata.v1.p8e.UUID getScopeUuid() {
      if (scopeUuidBuilder_ == null) {
        return scopeUuid_ == null ? com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : scopeUuid_;
      } else {
        return scopeUuidBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     */
    public Builder setScopeUuid(com.provenance.metadata.v1.p8e.UUID value) {
      if (scopeUuidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scopeUuid_ = value;
      } else {
        scopeUuidBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     */
    public Builder setScopeUuid(
        com.provenance.metadata.v1.p8e.UUID.Builder builderForValue) {
      if (scopeUuidBuilder_ == null) {
        scopeUuid_ = builderForValue.build();
      } else {
        scopeUuidBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     */
    public Builder mergeScopeUuid(com.provenance.metadata.v1.p8e.UUID value) {
      if (scopeUuidBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          scopeUuid_ != null &&
          scopeUuid_ != com.provenance.metadata.v1.p8e.UUID.getDefaultInstance()) {
          getScopeUuidBuilder().mergeFrom(value);
        } else {
          scopeUuid_ = value;
        }
      } else {
        scopeUuidBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     */
    public Builder clearScopeUuid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scopeUuid_ = null;
      if (scopeUuidBuilder_ != null) {
        scopeUuidBuilder_.dispose();
        scopeUuidBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     */
    public com.provenance.metadata.v1.p8e.UUID.Builder getScopeUuidBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScopeUuidFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     */
    public com.provenance.metadata.v1.p8e.UUIDOrBuilder getScopeUuidOrBuilder() {
      if (scopeUuidBuilder_ != null) {
        return scopeUuidBuilder_.getMessageOrBuilder();
      } else {
        return scopeUuid_ == null ?
            com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : scopeUuid_;
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID scope_uuid = 1 [json_name = "scopeUuid"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.p8e.UUID, com.provenance.metadata.v1.p8e.UUID.Builder, com.provenance.metadata.v1.p8e.UUIDOrBuilder> 
        getScopeUuidFieldBuilder() {
      if (scopeUuidBuilder_ == null) {
        scopeUuidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.p8e.UUID, com.provenance.metadata.v1.p8e.UUID.Builder, com.provenance.metadata.v1.p8e.UUIDOrBuilder>(
                getScopeUuid(),
                getParentForChildren(),
                isClean());
        scopeUuid_ = null;
      }
      return scopeUuidBuilder_;
    }

    private com.provenance.metadata.v1.p8e.UUID groupUuid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.p8e.UUID, com.provenance.metadata.v1.p8e.UUID.Builder, com.provenance.metadata.v1.p8e.UUIDOrBuilder> groupUuidBuilder_;
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     * @return Whether the groupUuid field is set.
     */
    public boolean hasGroupUuid() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     * @return The groupUuid.
     */
    public com.provenance.metadata.v1.p8e.UUID getGroupUuid() {
      if (groupUuidBuilder_ == null) {
        return groupUuid_ == null ? com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : groupUuid_;
      } else {
        return groupUuidBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     */
    public Builder setGroupUuid(com.provenance.metadata.v1.p8e.UUID value) {
      if (groupUuidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupUuid_ = value;
      } else {
        groupUuidBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     */
    public Builder setGroupUuid(
        com.provenance.metadata.v1.p8e.UUID.Builder builderForValue) {
      if (groupUuidBuilder_ == null) {
        groupUuid_ = builderForValue.build();
      } else {
        groupUuidBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     */
    public Builder mergeGroupUuid(com.provenance.metadata.v1.p8e.UUID value) {
      if (groupUuidBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          groupUuid_ != null &&
          groupUuid_ != com.provenance.metadata.v1.p8e.UUID.getDefaultInstance()) {
          getGroupUuidBuilder().mergeFrom(value);
        } else {
          groupUuid_ = value;
        }
      } else {
        groupUuidBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     */
    public Builder clearGroupUuid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      groupUuid_ = null;
      if (groupUuidBuilder_ != null) {
        groupUuidBuilder_.dispose();
        groupUuidBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     */
    public com.provenance.metadata.v1.p8e.UUID.Builder getGroupUuidBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGroupUuidFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     */
    public com.provenance.metadata.v1.p8e.UUIDOrBuilder getGroupUuidOrBuilder() {
      if (groupUuidBuilder_ != null) {
        return groupUuidBuilder_.getMessageOrBuilder();
      } else {
        return groupUuid_ == null ?
            com.provenance.metadata.v1.p8e.UUID.getDefaultInstance() : groupUuid_;
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.UUID group_uuid = 2 [json_name = "groupUuid"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.metadata.v1.p8e.UUID, com.provenance.metadata.v1.p8e.UUID.Builder, com.provenance.metadata.v1.p8e.UUIDOrBuilder> 
        getGroupUuidFieldBuilder() {
      if (groupUuidBuilder_ == null) {
        groupUuidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.metadata.v1.p8e.UUID, com.provenance.metadata.v1.p8e.UUID.Builder, com.provenance.metadata.v1.p8e.UUIDOrBuilder>(
                getGroupUuid(),
                getParentForChildren(),
                isClean());
        groupUuid_ = null;
      }
      return groupUuidBuilder_;
    }

    private java.lang.Object hash_ = "";
    /**
     * <code>string hash = 3 [json_name = "hash"];</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hash = 3 [json_name = "hash"];</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hash = 3 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 3 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      hash_ = getDefaultInstance().getHash();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 3 [json_name = "hash"];</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hash_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 4 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.p8e.ProvenanceReference)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.p8e.ProvenanceReference)
  private static final com.provenance.metadata.v1.p8e.ProvenanceReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.p8e.ProvenanceReference();
  }

  public static com.provenance.metadata.v1.p8e.ProvenanceReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProvenanceReference>
      PARSER = new com.google.protobuf.AbstractParser<ProvenanceReference>() {
    @java.lang.Override
    public ProvenanceReference parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProvenanceReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProvenanceReference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.p8e.ProvenanceReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

