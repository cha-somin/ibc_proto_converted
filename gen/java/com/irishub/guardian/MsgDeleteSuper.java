// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irishub/guardian/tx.proto

package com.irishub.guardian;

/**
 * <pre>
 * MsgDeleteSuper defines the properties of delete super account message
 * </pre>
 *
 * Protobuf type {@code irishub.guardian.MsgDeleteSuper}
 */
public final class MsgDeleteSuper extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irishub.guardian.MsgDeleteSuper)
    MsgDeleteSuperOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDeleteSuper.newBuilder() to construct.
  private MsgDeleteSuper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDeleteSuper() {
    address_ = "";
    deletedBy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDeleteSuper();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irishub.guardian.TxProto.internal_static_irishub_guardian_MsgDeleteSuper_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irishub.guardian.TxProto.internal_static_irishub_guardian_MsgDeleteSuper_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irishub.guardian.MsgDeleteSuper.class, com.irishub.guardian.MsgDeleteSuper.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELETED_BY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deletedBy_ = "";
  /**
   * <code>string deleted_by = 3 [json_name = "deletedBy"];</code>
   * @return The deletedBy.
   */
  @java.lang.Override
  public java.lang.String getDeletedBy() {
    java.lang.Object ref = deletedBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deletedBy_ = s;
      return s;
    }
  }
  /**
   * <code>string deleted_by = 3 [json_name = "deletedBy"];</code>
   * @return The bytes for deletedBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeletedByBytes() {
    java.lang.Object ref = deletedBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deletedBy_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deletedBy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deletedBy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deletedBy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deletedBy_);
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
    if (!(obj instanceof com.irishub.guardian.MsgDeleteSuper)) {
      return super.equals(obj);
    }
    com.irishub.guardian.MsgDeleteSuper other = (com.irishub.guardian.MsgDeleteSuper) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getDeletedBy()
        .equals(other.getDeletedBy())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + DELETED_BY_FIELD_NUMBER;
    hash = (53 * hash) + getDeletedBy().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irishub.guardian.MsgDeleteSuper parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irishub.guardian.MsgDeleteSuper parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irishub.guardian.MsgDeleteSuper parseFrom(
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
  public static Builder newBuilder(com.irishub.guardian.MsgDeleteSuper prototype) {
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
   * MsgDeleteSuper defines the properties of delete super account message
   * </pre>
   *
   * Protobuf type {@code irishub.guardian.MsgDeleteSuper}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irishub.guardian.MsgDeleteSuper)
      com.irishub.guardian.MsgDeleteSuperOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irishub.guardian.TxProto.internal_static_irishub_guardian_MsgDeleteSuper_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irishub.guardian.TxProto.internal_static_irishub_guardian_MsgDeleteSuper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irishub.guardian.MsgDeleteSuper.class, com.irishub.guardian.MsgDeleteSuper.Builder.class);
    }

    // Construct using com.irishub.guardian.MsgDeleteSuper.newBuilder()
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
      address_ = "";
      deletedBy_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irishub.guardian.TxProto.internal_static_irishub_guardian_MsgDeleteSuper_descriptor;
    }

    @java.lang.Override
    public com.irishub.guardian.MsgDeleteSuper getDefaultInstanceForType() {
      return com.irishub.guardian.MsgDeleteSuper.getDefaultInstance();
    }

    @java.lang.Override
    public com.irishub.guardian.MsgDeleteSuper build() {
      com.irishub.guardian.MsgDeleteSuper result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irishub.guardian.MsgDeleteSuper buildPartial() {
      com.irishub.guardian.MsgDeleteSuper result = new com.irishub.guardian.MsgDeleteSuper(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irishub.guardian.MsgDeleteSuper result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deletedBy_ = deletedBy_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irishub.guardian.MsgDeleteSuper) {
        return mergeFrom((com.irishub.guardian.MsgDeleteSuper)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irishub.guardian.MsgDeleteSuper other) {
      if (other == com.irishub.guardian.MsgDeleteSuper.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeletedBy().isEmpty()) {
        deletedBy_ = other.deletedBy_;
        bitField0_ |= 0x00000002;
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
            case 18: {
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              deletedBy_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object deletedBy_ = "";
    /**
     * <code>string deleted_by = 3 [json_name = "deletedBy"];</code>
     * @return The deletedBy.
     */
    public java.lang.String getDeletedBy() {
      java.lang.Object ref = deletedBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deletedBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deleted_by = 3 [json_name = "deletedBy"];</code>
     * @return The bytes for deletedBy.
     */
    public com.google.protobuf.ByteString
        getDeletedByBytes() {
      java.lang.Object ref = deletedBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deletedBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deleted_by = 3 [json_name = "deletedBy"];</code>
     * @param value The deletedBy to set.
     * @return This builder for chaining.
     */
    public Builder setDeletedBy(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deletedBy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string deleted_by = 3 [json_name = "deletedBy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeletedBy() {
      deletedBy_ = getDefaultInstance().getDeletedBy();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string deleted_by = 3 [json_name = "deletedBy"];</code>
     * @param value The bytes for deletedBy to set.
     * @return This builder for chaining.
     */
    public Builder setDeletedByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deletedBy_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:irishub.guardian.MsgDeleteSuper)
  }

  // @@protoc_insertion_point(class_scope:irishub.guardian.MsgDeleteSuper)
  private static final com.irishub.guardian.MsgDeleteSuper DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irishub.guardian.MsgDeleteSuper();
  }

  public static com.irishub.guardian.MsgDeleteSuper getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDeleteSuper>
      PARSER = new com.google.protobuf.AbstractParser<MsgDeleteSuper>() {
    @java.lang.Override
    public MsgDeleteSuper parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDeleteSuper> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDeleteSuper> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irishub.guardian.MsgDeleteSuper getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

