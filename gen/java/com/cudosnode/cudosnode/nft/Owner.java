// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/nft/nft.proto

package com.cudosnode.cudosnode.nft;

/**
 * <pre>
 * Owner defines a type of owner
 * </pre>
 *
 * Protobuf type {@code cudosnode.cudosnode.nft.Owner}
 */
public final class Owner extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cudosnode.cudosnode.nft.Owner)
    OwnerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Owner.newBuilder() to construct.
  private Owner(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Owner() {
    address_ = "";
    idCollections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Owner();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cudosnode.cudosnode.nft.NftProto.internal_static_cudosnode_cudosnode_nft_Owner_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cudosnode.cudosnode.nft.NftProto.internal_static_cudosnode_cudosnode_nft_Owner_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cudosnode.cudosnode.nft.Owner.class, com.cudosnode.cudosnode.nft.Owner.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address"];</code>
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
   * <code>string address = 1 [json_name = "address"];</code>
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

  public static final int ID_COLLECTIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.cudosnode.cudosnode.nft.IDCollection> idCollections_;
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.cudosnode.cudosnode.nft.IDCollection> getIdCollectionsList() {
    return idCollections_;
  }
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cudosnode.cudosnode.nft.IDCollectionOrBuilder> 
      getIdCollectionsOrBuilderList() {
    return idCollections_;
  }
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  @java.lang.Override
  public int getIdCollectionsCount() {
    return idCollections_.size();
  }
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  @java.lang.Override
  public com.cudosnode.cudosnode.nft.IDCollection getIdCollections(int index) {
    return idCollections_.get(index);
  }
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  @java.lang.Override
  public com.cudosnode.cudosnode.nft.IDCollectionOrBuilder getIdCollectionsOrBuilder(
      int index) {
    return idCollections_.get(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    for (int i = 0; i < idCollections_.size(); i++) {
      output.writeMessage(2, idCollections_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    for (int i = 0; i < idCollections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, idCollections_.get(i));
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
    if (!(obj instanceof com.cudosnode.cudosnode.nft.Owner)) {
      return super.equals(obj);
    }
    com.cudosnode.cudosnode.nft.Owner other = (com.cudosnode.cudosnode.nft.Owner) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getIdCollectionsList()
        .equals(other.getIdCollectionsList())) return false;
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
    if (getIdCollectionsCount() > 0) {
      hash = (37 * hash) + ID_COLLECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getIdCollectionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cudosnode.cudosnode.nft.Owner parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cudosnode.cudosnode.nft.Owner parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.Owner parseFrom(
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
  public static Builder newBuilder(com.cudosnode.cudosnode.nft.Owner prototype) {
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
   * Owner defines a type of owner
   * </pre>
   *
   * Protobuf type {@code cudosnode.cudosnode.nft.Owner}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cudosnode.cudosnode.nft.Owner)
      com.cudosnode.cudosnode.nft.OwnerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudosnode.cudosnode.nft.NftProto.internal_static_cudosnode_cudosnode_nft_Owner_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudosnode.cudosnode.nft.NftProto.internal_static_cudosnode_cudosnode_nft_Owner_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudosnode.cudosnode.nft.Owner.class, com.cudosnode.cudosnode.nft.Owner.Builder.class);
    }

    // Construct using com.cudosnode.cudosnode.nft.Owner.newBuilder()
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
      if (idCollectionsBuilder_ == null) {
        idCollections_ = java.util.Collections.emptyList();
      } else {
        idCollections_ = null;
        idCollectionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cudosnode.cudosnode.nft.NftProto.internal_static_cudosnode_cudosnode_nft_Owner_descriptor;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.Owner getDefaultInstanceForType() {
      return com.cudosnode.cudosnode.nft.Owner.getDefaultInstance();
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.Owner build() {
      com.cudosnode.cudosnode.nft.Owner result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.Owner buildPartial() {
      com.cudosnode.cudosnode.nft.Owner result = new com.cudosnode.cudosnode.nft.Owner(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cudosnode.cudosnode.nft.Owner result) {
      if (idCollectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          idCollections_ = java.util.Collections.unmodifiableList(idCollections_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.idCollections_ = idCollections_;
      } else {
        result.idCollections_ = idCollectionsBuilder_.build();
      }
    }

    private void buildPartial0(com.cudosnode.cudosnode.nft.Owner result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cudosnode.cudosnode.nft.Owner) {
        return mergeFrom((com.cudosnode.cudosnode.nft.Owner)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cudosnode.cudosnode.nft.Owner other) {
      if (other == com.cudosnode.cudosnode.nft.Owner.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (idCollectionsBuilder_ == null) {
        if (!other.idCollections_.isEmpty()) {
          if (idCollections_.isEmpty()) {
            idCollections_ = other.idCollections_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureIdCollectionsIsMutable();
            idCollections_.addAll(other.idCollections_);
          }
          onChanged();
        }
      } else {
        if (!other.idCollections_.isEmpty()) {
          if (idCollectionsBuilder_.isEmpty()) {
            idCollectionsBuilder_.dispose();
            idCollectionsBuilder_ = null;
            idCollections_ = other.idCollections_;
            bitField0_ = (bitField0_ & ~0x00000002);
            idCollectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIdCollectionsFieldBuilder() : null;
          } else {
            idCollectionsBuilder_.addAllMessages(other.idCollections_);
          }
        }
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.cudosnode.cudosnode.nft.IDCollection m =
                  input.readMessage(
                      com.cudosnode.cudosnode.nft.IDCollection.parser(),
                      extensionRegistry);
              if (idCollectionsBuilder_ == null) {
                ensureIdCollectionsIsMutable();
                idCollections_.add(m);
              } else {
                idCollectionsBuilder_.addMessage(m);
              }
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
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
     * <code>string address = 1 [json_name = "address"];</code>
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
     * <code>string address = 1 [json_name = "address"];</code>
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
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
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

    private java.util.List<com.cudosnode.cudosnode.nft.IDCollection> idCollections_ =
      java.util.Collections.emptyList();
    private void ensureIdCollectionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        idCollections_ = new java.util.ArrayList<com.cudosnode.cudosnode.nft.IDCollection>(idCollections_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cudosnode.cudosnode.nft.IDCollection, com.cudosnode.cudosnode.nft.IDCollection.Builder, com.cudosnode.cudosnode.nft.IDCollectionOrBuilder> idCollectionsBuilder_;

    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public java.util.List<com.cudosnode.cudosnode.nft.IDCollection> getIdCollectionsList() {
      if (idCollectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(idCollections_);
      } else {
        return idCollectionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public int getIdCollectionsCount() {
      if (idCollectionsBuilder_ == null) {
        return idCollections_.size();
      } else {
        return idCollectionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public com.cudosnode.cudosnode.nft.IDCollection getIdCollections(int index) {
      if (idCollectionsBuilder_ == null) {
        return idCollections_.get(index);
      } else {
        return idCollectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder setIdCollections(
        int index, com.cudosnode.cudosnode.nft.IDCollection value) {
      if (idCollectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdCollectionsIsMutable();
        idCollections_.set(index, value);
        onChanged();
      } else {
        idCollectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder setIdCollections(
        int index, com.cudosnode.cudosnode.nft.IDCollection.Builder builderForValue) {
      if (idCollectionsBuilder_ == null) {
        ensureIdCollectionsIsMutable();
        idCollections_.set(index, builderForValue.build());
        onChanged();
      } else {
        idCollectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder addIdCollections(com.cudosnode.cudosnode.nft.IDCollection value) {
      if (idCollectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdCollectionsIsMutable();
        idCollections_.add(value);
        onChanged();
      } else {
        idCollectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder addIdCollections(
        int index, com.cudosnode.cudosnode.nft.IDCollection value) {
      if (idCollectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdCollectionsIsMutable();
        idCollections_.add(index, value);
        onChanged();
      } else {
        idCollectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder addIdCollections(
        com.cudosnode.cudosnode.nft.IDCollection.Builder builderForValue) {
      if (idCollectionsBuilder_ == null) {
        ensureIdCollectionsIsMutable();
        idCollections_.add(builderForValue.build());
        onChanged();
      } else {
        idCollectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder addIdCollections(
        int index, com.cudosnode.cudosnode.nft.IDCollection.Builder builderForValue) {
      if (idCollectionsBuilder_ == null) {
        ensureIdCollectionsIsMutable();
        idCollections_.add(index, builderForValue.build());
        onChanged();
      } else {
        idCollectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder addAllIdCollections(
        java.lang.Iterable<? extends com.cudosnode.cudosnode.nft.IDCollection> values) {
      if (idCollectionsBuilder_ == null) {
        ensureIdCollectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, idCollections_);
        onChanged();
      } else {
        idCollectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder clearIdCollections() {
      if (idCollectionsBuilder_ == null) {
        idCollections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        idCollectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public Builder removeIdCollections(int index) {
      if (idCollectionsBuilder_ == null) {
        ensureIdCollectionsIsMutable();
        idCollections_.remove(index);
        onChanged();
      } else {
        idCollectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public com.cudosnode.cudosnode.nft.IDCollection.Builder getIdCollectionsBuilder(
        int index) {
      return getIdCollectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public com.cudosnode.cudosnode.nft.IDCollectionOrBuilder getIdCollectionsOrBuilder(
        int index) {
      if (idCollectionsBuilder_ == null) {
        return idCollections_.get(index);  } else {
        return idCollectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public java.util.List<? extends com.cudosnode.cudosnode.nft.IDCollectionOrBuilder> 
         getIdCollectionsOrBuilderList() {
      if (idCollectionsBuilder_ != null) {
        return idCollectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(idCollections_);
      }
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public com.cudosnode.cudosnode.nft.IDCollection.Builder addIdCollectionsBuilder() {
      return getIdCollectionsFieldBuilder().addBuilder(
          com.cudosnode.cudosnode.nft.IDCollection.getDefaultInstance());
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public com.cudosnode.cudosnode.nft.IDCollection.Builder addIdCollectionsBuilder(
        int index) {
      return getIdCollectionsFieldBuilder().addBuilder(
          index, com.cudosnode.cudosnode.nft.IDCollection.getDefaultInstance());
    }
    /**
     * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
     */
    public java.util.List<com.cudosnode.cudosnode.nft.IDCollection.Builder> 
         getIdCollectionsBuilderList() {
      return getIdCollectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cudosnode.cudosnode.nft.IDCollection, com.cudosnode.cudosnode.nft.IDCollection.Builder, com.cudosnode.cudosnode.nft.IDCollectionOrBuilder> 
        getIdCollectionsFieldBuilder() {
      if (idCollectionsBuilder_ == null) {
        idCollectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cudosnode.cudosnode.nft.IDCollection, com.cudosnode.cudosnode.nft.IDCollection.Builder, com.cudosnode.cudosnode.nft.IDCollectionOrBuilder>(
                idCollections_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        idCollections_ = null;
      }
      return idCollectionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cudosnode.cudosnode.nft.Owner)
  }

  // @@protoc_insertion_point(class_scope:cudosnode.cudosnode.nft.Owner)
  private static final com.cudosnode.cudosnode.nft.Owner DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cudosnode.cudosnode.nft.Owner();
  }

  public static com.cudosnode.cudosnode.nft.Owner getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Owner>
      PARSER = new com.google.protobuf.AbstractParser<Owner>() {
    @java.lang.Override
    public Owner parsePartialFrom(
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

  public static com.google.protobuf.Parser<Owner> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Owner> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cudosnode.cudosnode.nft.Owner getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

