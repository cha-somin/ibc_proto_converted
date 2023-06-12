// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/ecocredit/v1alpha2/tx.proto

package com.regen.ecocredit.v1alpha2;

/**
 * <pre>
 * MsgUpdateClassMetadata is the Msg/UpdateClassMetadata request type.
 * </pre>
 *
 * Protobuf type {@code regen.ecocredit.v1alpha2.MsgUpdateClassMetadata}
 */
public final class MsgUpdateClassMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.ecocredit.v1alpha2.MsgUpdateClassMetadata)
    MsgUpdateClassMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateClassMetadata.newBuilder() to construct.
  private MsgUpdateClassMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateClassMetadata() {
    admin_ = "";
    classId_ = "";
    metadata_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateClassMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.class, com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.Builder.class);
  }

  public static final int ADMIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object admin_ = "";
  /**
   * <pre>
   * admin is the address of the account that is the admin of the credit class.
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
   * admin is the address of the account that is the admin of the credit class.
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

  public static final int CLASS_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classId_ = "";
  /**
   * <pre>
   * class_id is the unique ID of the credit class.
   * </pre>
   *
   * <code>string class_id = 2 [json_name = "classId"];</code>
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
   * class_id is the unique ID of the credit class.
   * </pre>
   *
   * <code>string class_id = 2 [json_name = "classId"];</code>
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

  public static final int METADATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString metadata_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * metadata is the updated arbitrary metadata to be attached to the credit class.
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, classId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, classId_);
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
    if (!(obj instanceof com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata)) {
      return super.equals(obj);
    }
    com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata other = (com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata) obj;

    if (!getAdmin()
        .equals(other.getAdmin())) return false;
    if (!getClassId()
        .equals(other.getClassId())) return false;
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
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata parseFrom(
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
  public static Builder newBuilder(com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata prototype) {
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
   * MsgUpdateClassMetadata is the Msg/UpdateClassMetadata request type.
   * </pre>
   *
   * Protobuf type {@code regen.ecocredit.v1alpha2.MsgUpdateClassMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.ecocredit.v1alpha2.MsgUpdateClassMetadata)
      com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.class, com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.Builder.class);
    }

    // Construct using com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.newBuilder()
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
      classId_ = "";
      metadata_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.ecocredit.v1alpha2.TxProto.internal_static_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata_descriptor;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata getDefaultInstanceForType() {
      return com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata build() {
      com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata buildPartial() {
      com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata result = new com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.admin_ = admin_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.classId_ = classId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.metadata_ = metadata_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata) {
        return mergeFrom((com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata other) {
      if (other == com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.getDefaultInstance()) return this;
      if (!other.getAdmin().isEmpty()) {
        admin_ = other.admin_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              classId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
     * admin is the address of the account that is the admin of the credit class.
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
     * admin is the address of the account that is the admin of the credit class.
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
     * admin is the address of the account that is the admin of the credit class.
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
     * admin is the address of the account that is the admin of the credit class.
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
     * admin is the address of the account that is the admin of the credit class.
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

    private java.lang.Object classId_ = "";
    /**
     * <pre>
     * class_id is the unique ID of the credit class.
     * </pre>
     *
     * <code>string class_id = 2 [json_name = "classId"];</code>
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
     * class_id is the unique ID of the credit class.
     * </pre>
     *
     * <code>string class_id = 2 [json_name = "classId"];</code>
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
     * class_id is the unique ID of the credit class.
     * </pre>
     *
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @param value The classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * class_id is the unique ID of the credit class.
     * </pre>
     *
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassId() {
      classId_ = getDefaultInstance().getClassId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * class_id is the unique ID of the credit class.
     * </pre>
     *
     * <code>string class_id = 2 [json_name = "classId"];</code>
     * @param value The bytes for classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString metadata_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * metadata is the updated arbitrary metadata to be attached to the credit class.
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
     * metadata is the updated arbitrary metadata to be attached to the credit class.
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
     * metadata is the updated arbitrary metadata to be attached to the credit class.
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


    // @@protoc_insertion_point(builder_scope:regen.ecocredit.v1alpha2.MsgUpdateClassMetadata)
  }

  // @@protoc_insertion_point(class_scope:regen.ecocredit.v1alpha2.MsgUpdateClassMetadata)
  private static final com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata();
  }

  public static com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateClassMetadata>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateClassMetadata>() {
    @java.lang.Override
    public MsgUpdateClassMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateClassMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateClassMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

