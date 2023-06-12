// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/tx.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.MsgUpdateListing}
 */
public final class MsgUpdateListing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.MsgUpdateListing)
    MsgUpdateListingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateListing.newBuilder() to construct.
  private MsgUpdateListing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateListing() {
    creator_ = "";
    classId_ = "";
    nftId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateListing();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateListing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateListing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.MsgUpdateListing.class, com.likechain.likenft.v1.MsgUpdateListing.Builder.class);
  }

  public static final int CREATOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creator_ = "";
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  @java.lang.Override
  public java.lang.String getCreator() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creator_ = s;
      return s;
    }
  }
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatorBytes() {
    java.lang.Object ref = creator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLASS_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classId_ = "";
  /**
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

  public static final int NFT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nftId_ = "";
  /**
   * <code>string nft_id = 3 [json_name = "nftId"];</code>
   * @return The nftId.
   */
  @java.lang.Override
  public java.lang.String getNftId() {
    java.lang.Object ref = nftId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nftId_ = s;
      return s;
    }
  }
  /**
   * <code>string nft_id = 3 [json_name = "nftId"];</code>
   * @return The bytes for nftId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNftIdBytes() {
    java.lang.Object ref = nftId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nftId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  private long price_ = 0L;
  /**
   * <code>uint64 price = 4 [json_name = "price"];</code>
   * @return The price.
   */
  @java.lang.Override
  public long getPrice() {
    return price_;
  }

  public static final int EXPIRATION_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp expiration_;
  /**
   * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the expiration field is set.
   */
  @java.lang.Override
  public boolean hasExpiration() {
    return expiration_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The expiration.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpiration() {
    return expiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
  }
  /**
   * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpirationOrBuilder() {
    return expiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
  }

  public static final int FULL_PAY_TO_ROYALTY_FIELD_NUMBER = 6;
  private boolean fullPayToRoyalty_ = false;
  /**
   * <code>bool full_pay_to_royalty = 6 [json_name = "fullPayToRoyalty"];</code>
   * @return The fullPayToRoyalty.
   */
  @java.lang.Override
  public boolean getFullPayToRoyalty() {
    return fullPayToRoyalty_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, classId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nftId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nftId_);
    }
    if (price_ != 0L) {
      output.writeUInt64(4, price_);
    }
    if (expiration_ != null) {
      output.writeMessage(5, getExpiration());
    }
    if (fullPayToRoyalty_ != false) {
      output.writeBool(6, fullPayToRoyalty_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, creator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, classId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nftId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nftId_);
    }
    if (price_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, price_);
    }
    if (expiration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getExpiration());
    }
    if (fullPayToRoyalty_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, fullPayToRoyalty_);
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
    if (!(obj instanceof com.likechain.likenft.v1.MsgUpdateListing)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.MsgUpdateListing other = (com.likechain.likenft.v1.MsgUpdateListing) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (!getClassId()
        .equals(other.getClassId())) return false;
    if (!getNftId()
        .equals(other.getNftId())) return false;
    if (getPrice()
        != other.getPrice()) return false;
    if (hasExpiration() != other.hasExpiration()) return false;
    if (hasExpiration()) {
      if (!getExpiration()
          .equals(other.getExpiration())) return false;
    }
    if (getFullPayToRoyalty()
        != other.getFullPayToRoyalty()) return false;
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
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator().hashCode();
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    hash = (37 * hash) + NFT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNftId().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrice());
    if (hasExpiration()) {
      hash = (37 * hash) + EXPIRATION_FIELD_NUMBER;
      hash = (53 * hash) + getExpiration().hashCode();
    }
    hash = (37 * hash) + FULL_PAY_TO_ROYALTY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFullPayToRoyalty());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.MsgUpdateListing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.MsgUpdateListing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgUpdateListing parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.MsgUpdateListing prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.MsgUpdateListing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.MsgUpdateListing)
      com.likechain.likenft.v1.MsgUpdateListingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateListing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateListing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.MsgUpdateListing.class, com.likechain.likenft.v1.MsgUpdateListing.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.MsgUpdateListing.newBuilder()
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
      creator_ = "";
      classId_ = "";
      nftId_ = "";
      price_ = 0L;
      expiration_ = null;
      if (expirationBuilder_ != null) {
        expirationBuilder_.dispose();
        expirationBuilder_ = null;
      }
      fullPayToRoyalty_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateListing_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgUpdateListing getDefaultInstanceForType() {
      return com.likechain.likenft.v1.MsgUpdateListing.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgUpdateListing build() {
      com.likechain.likenft.v1.MsgUpdateListing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgUpdateListing buildPartial() {
      com.likechain.likenft.v1.MsgUpdateListing result = new com.likechain.likenft.v1.MsgUpdateListing(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.MsgUpdateListing result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creator_ = creator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.classId_ = classId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nftId_ = nftId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.price_ = price_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.expiration_ = expirationBuilder_ == null
            ? expiration_
            : expirationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.fullPayToRoyalty_ = fullPayToRoyalty_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.MsgUpdateListing) {
        return mergeFrom((com.likechain.likenft.v1.MsgUpdateListing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.MsgUpdateListing other) {
      if (other == com.likechain.likenft.v1.MsgUpdateListing.getDefaultInstance()) return this;
      if (!other.getCreator().isEmpty()) {
        creator_ = other.creator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNftId().isEmpty()) {
        nftId_ = other.nftId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPrice() != 0L) {
        setPrice(other.getPrice());
      }
      if (other.hasExpiration()) {
        mergeExpiration(other.getExpiration());
      }
      if (other.getFullPayToRoyalty() != false) {
        setFullPayToRoyalty(other.getFullPayToRoyalty());
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
              creator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              classId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              nftId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              price_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getExpirationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              fullPayToRoyalty_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private java.lang.Object creator_ = "";
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The creator.
     */
    public java.lang.String getCreator() {
      java.lang.Object ref = creator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return The bytes for creator.
     */
    public com.google.protobuf.ByteString
        getCreatorBytes() {
      java.lang.Object ref = creator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreator() {
      creator_ = getDefaultInstance().getCreator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string creator = 1 [json_name = "creator"];</code>
     * @param value The bytes for creator to set.
     * @return This builder for chaining.
     */
    public Builder setCreatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object classId_ = "";
    /**
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

    private java.lang.Object nftId_ = "";
    /**
     * <code>string nft_id = 3 [json_name = "nftId"];</code>
     * @return The nftId.
     */
    public java.lang.String getNftId() {
      java.lang.Object ref = nftId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nftId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nft_id = 3 [json_name = "nftId"];</code>
     * @return The bytes for nftId.
     */
    public com.google.protobuf.ByteString
        getNftIdBytes() {
      java.lang.Object ref = nftId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nftId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nft_id = 3 [json_name = "nftId"];</code>
     * @param value The nftId to set.
     * @return This builder for chaining.
     */
    public Builder setNftId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nftId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string nft_id = 3 [json_name = "nftId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNftId() {
      nftId_ = getDefaultInstance().getNftId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string nft_id = 3 [json_name = "nftId"];</code>
     * @param value The bytes for nftId to set.
     * @return This builder for chaining.
     */
    public Builder setNftIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nftId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long price_ ;
    /**
     * <code>uint64 price = 4 [json_name = "price"];</code>
     * @return The price.
     */
    @java.lang.Override
    public long getPrice() {
      return price_;
    }
    /**
     * <code>uint64 price = 4 [json_name = "price"];</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(long value) {

      price_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 price = 4 [json_name = "price"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      bitField0_ = (bitField0_ & ~0x00000008);
      price_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expiration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expirationBuilder_;
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the expiration field is set.
     */
    public boolean hasExpiration() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The expiration.
     */
    public com.google.protobuf.Timestamp getExpiration() {
      if (expirationBuilder_ == null) {
        return expiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
      } else {
        return expirationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setExpiration(com.google.protobuf.Timestamp value) {
      if (expirationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expiration_ = value;
      } else {
        expirationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setExpiration(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expirationBuilder_ == null) {
        expiration_ = builderForValue.build();
      } else {
        expirationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeExpiration(com.google.protobuf.Timestamp value) {
      if (expirationBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          expiration_ != null &&
          expiration_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getExpirationBuilder().mergeFrom(value);
        } else {
          expiration_ = value;
        }
      } else {
        expirationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearExpiration() {
      bitField0_ = (bitField0_ & ~0x00000010);
      expiration_ = null;
      if (expirationBuilder_ != null) {
        expirationBuilder_.dispose();
        expirationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpirationBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getExpirationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpirationOrBuilder() {
      if (expirationBuilder_ != null) {
        return expirationBuilder_.getMessageOrBuilder();
      } else {
        return expiration_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expiration_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpirationFieldBuilder() {
      if (expirationBuilder_ == null) {
        expirationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpiration(),
                getParentForChildren(),
                isClean());
        expiration_ = null;
      }
      return expirationBuilder_;
    }

    private boolean fullPayToRoyalty_ ;
    /**
     * <code>bool full_pay_to_royalty = 6 [json_name = "fullPayToRoyalty"];</code>
     * @return The fullPayToRoyalty.
     */
    @java.lang.Override
    public boolean getFullPayToRoyalty() {
      return fullPayToRoyalty_;
    }
    /**
     * <code>bool full_pay_to_royalty = 6 [json_name = "fullPayToRoyalty"];</code>
     * @param value The fullPayToRoyalty to set.
     * @return This builder for chaining.
     */
    public Builder setFullPayToRoyalty(boolean value) {

      fullPayToRoyalty_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool full_pay_to_royalty = 6 [json_name = "fullPayToRoyalty"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFullPayToRoyalty() {
      bitField0_ = (bitField0_ & ~0x00000020);
      fullPayToRoyalty_ = false;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.MsgUpdateListing)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.MsgUpdateListing)
  private static final com.likechain.likenft.v1.MsgUpdateListing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.MsgUpdateListing();
  }

  public static com.likechain.likenft.v1.MsgUpdateListing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateListing>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateListing>() {
    @java.lang.Override
    public MsgUpdateListing parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateListing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateListing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.MsgUpdateListing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

