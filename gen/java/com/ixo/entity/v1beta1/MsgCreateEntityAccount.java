// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/entity/v1beta1/tx.proto

package com.ixo.entity.v1beta1;

/**
 * <pre>
 * create a module account for an entity, account details will be added as a
 * linkedEntity on entity iid doc where linkedEntity id is didfragment: did#name
 * </pre>
 *
 * Protobuf type {@code ixo.entity.v1beta1.MsgCreateEntityAccount}
 */
public final class MsgCreateEntityAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.entity.v1beta1.MsgCreateEntityAccount)
    MsgCreateEntityAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateEntityAccount.newBuilder() to construct.
  private MsgCreateEntityAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateEntityAccount() {
    id_ = "";
    name_ = "";
    ownerAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateEntityAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.entity.v1beta1.TxProto.internal_static_ixo_entity_v1beta1_MsgCreateEntityAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.entity.v1beta1.TxProto.internal_static_ixo_entity_v1beta1_MsgCreateEntityAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.entity.v1beta1.MsgCreateEntityAccount.class, com.ixo.entity.v1beta1.MsgCreateEntityAccount.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * entity id (did) to create account for
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * entity id (did) to create account for
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * name of account
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
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
   * <pre>
   * name of account
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
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

  public static final int OWNER_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ownerAddress_ = "";
  /**
   * <pre>
   * The owner_address used to sign this transaction.
   * </pre>
   *
   * <code>string owner_address = 3 [json_name = "ownerAddress"];</code>
   * @return The ownerAddress.
   */
  @java.lang.Override
  public java.lang.String getOwnerAddress() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ownerAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The owner_address used to sign this transaction.
   * </pre>
   *
   * <code>string owner_address = 3 [json_name = "ownerAddress"];</code>
   * @return The bytes for ownerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerAddressBytes() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ownerAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ownerAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ownerAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ownerAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ownerAddress_);
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
    if (!(obj instanceof com.ixo.entity.v1beta1.MsgCreateEntityAccount)) {
      return super.equals(obj);
    }
    com.ixo.entity.v1beta1.MsgCreateEntityAccount other = (com.ixo.entity.v1beta1.MsgCreateEntityAccount) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getOwnerAddress()
        .equals(other.getOwnerAddress())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + OWNER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOwnerAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount parseFrom(
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
  public static Builder newBuilder(com.ixo.entity.v1beta1.MsgCreateEntityAccount prototype) {
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
   * create a module account for an entity, account details will be added as a
   * linkedEntity on entity iid doc where linkedEntity id is didfragment: did#name
   * </pre>
   *
   * Protobuf type {@code ixo.entity.v1beta1.MsgCreateEntityAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.entity.v1beta1.MsgCreateEntityAccount)
      com.ixo.entity.v1beta1.MsgCreateEntityAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.entity.v1beta1.TxProto.internal_static_ixo_entity_v1beta1_MsgCreateEntityAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.entity.v1beta1.TxProto.internal_static_ixo_entity_v1beta1_MsgCreateEntityAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.entity.v1beta1.MsgCreateEntityAccount.class, com.ixo.entity.v1beta1.MsgCreateEntityAccount.Builder.class);
    }

    // Construct using com.ixo.entity.v1beta1.MsgCreateEntityAccount.newBuilder()
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
      id_ = "";
      name_ = "";
      ownerAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.entity.v1beta1.TxProto.internal_static_ixo_entity_v1beta1_MsgCreateEntityAccount_descriptor;
    }

    @java.lang.Override
    public com.ixo.entity.v1beta1.MsgCreateEntityAccount getDefaultInstanceForType() {
      return com.ixo.entity.v1beta1.MsgCreateEntityAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.entity.v1beta1.MsgCreateEntityAccount build() {
      com.ixo.entity.v1beta1.MsgCreateEntityAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.entity.v1beta1.MsgCreateEntityAccount buildPartial() {
      com.ixo.entity.v1beta1.MsgCreateEntityAccount result = new com.ixo.entity.v1beta1.MsgCreateEntityAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ixo.entity.v1beta1.MsgCreateEntityAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ownerAddress_ = ownerAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.entity.v1beta1.MsgCreateEntityAccount) {
        return mergeFrom((com.ixo.entity.v1beta1.MsgCreateEntityAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.entity.v1beta1.MsgCreateEntityAccount other) {
      if (other == com.ixo.entity.v1beta1.MsgCreateEntityAccount.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getOwnerAddress().isEmpty()) {
        ownerAddress_ = other.ownerAddress_;
        bitField0_ |= 0x00000004;
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              ownerAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * entity id (did) to create account for
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * entity id (did) to create account for
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * entity id (did) to create account for
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * entity id (did) to create account for
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * entity id (did) to create account for
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name of account
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
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
     * <pre>
     * name of account
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
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
     * <pre>
     * name of account
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of account
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of account
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object ownerAddress_ = "";
    /**
     * <pre>
     * The owner_address used to sign this transaction.
     * </pre>
     *
     * <code>string owner_address = 3 [json_name = "ownerAddress"];</code>
     * @return The ownerAddress.
     */
    public java.lang.String getOwnerAddress() {
      java.lang.Object ref = ownerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ownerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The owner_address used to sign this transaction.
     * </pre>
     *
     * <code>string owner_address = 3 [json_name = "ownerAddress"];</code>
     * @return The bytes for ownerAddress.
     */
    public com.google.protobuf.ByteString
        getOwnerAddressBytes() {
      java.lang.Object ref = ownerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The owner_address used to sign this transaction.
     * </pre>
     *
     * <code>string owner_address = 3 [json_name = "ownerAddress"];</code>
     * @param value The ownerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ownerAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The owner_address used to sign this transaction.
     * </pre>
     *
     * <code>string owner_address = 3 [json_name = "ownerAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwnerAddress() {
      ownerAddress_ = getDefaultInstance().getOwnerAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The owner_address used to sign this transaction.
     * </pre>
     *
     * <code>string owner_address = 3 [json_name = "ownerAddress"];</code>
     * @param value The bytes for ownerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ownerAddress_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:ixo.entity.v1beta1.MsgCreateEntityAccount)
  }

  // @@protoc_insertion_point(class_scope:ixo.entity.v1beta1.MsgCreateEntityAccount)
  private static final com.ixo.entity.v1beta1.MsgCreateEntityAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.entity.v1beta1.MsgCreateEntityAccount();
  }

  public static com.ixo.entity.v1beta1.MsgCreateEntityAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateEntityAccount>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateEntityAccount>() {
    @java.lang.Override
    public MsgCreateEntityAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateEntityAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateEntityAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.entity.v1beta1.MsgCreateEntityAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

