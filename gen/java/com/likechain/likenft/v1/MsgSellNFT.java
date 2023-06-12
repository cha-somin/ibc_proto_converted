// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/tx.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.MsgSellNFT}
 */
public final class MsgSellNFT extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.MsgSellNFT)
    MsgSellNFTOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSellNFT.newBuilder() to construct.
  private MsgSellNFT(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSellNFT() {
    creator_ = "";
    classId_ = "";
    nftId_ = "";
    buyer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSellNFT();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgSellNFT_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgSellNFT_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.MsgSellNFT.class, com.likechain.likenft.v1.MsgSellNFT.Builder.class);
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

  public static final int BUYER_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object buyer_ = "";
  /**
   * <code>string buyer = 4 [json_name = "buyer"];</code>
   * @return The buyer.
   */
  @java.lang.Override
  public java.lang.String getBuyer() {
    java.lang.Object ref = buyer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      buyer_ = s;
      return s;
    }
  }
  /**
   * <code>string buyer = 4 [json_name = "buyer"];</code>
   * @return The bytes for buyer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBuyerBytes() {
    java.lang.Object ref = buyer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      buyer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 5;
  private long price_ = 0L;
  /**
   * <code>uint64 price = 5 [json_name = "price"];</code>
   * @return The price.
   */
  @java.lang.Override
  public long getPrice() {
    return price_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buyer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, buyer_);
    }
    if (price_ != 0L) {
      output.writeUInt64(5, price_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buyer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, buyer_);
    }
    if (price_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, price_);
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
    if (!(obj instanceof com.likechain.likenft.v1.MsgSellNFT)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.MsgSellNFT other = (com.likechain.likenft.v1.MsgSellNFT) obj;

    if (!getCreator()
        .equals(other.getCreator())) return false;
    if (!getClassId()
        .equals(other.getClassId())) return false;
    if (!getNftId()
        .equals(other.getNftId())) return false;
    if (!getBuyer()
        .equals(other.getBuyer())) return false;
    if (getPrice()
        != other.getPrice()) return false;
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
    hash = (37 * hash) + BUYER_FIELD_NUMBER;
    hash = (53 * hash) + getBuyer().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrice());
    hash = (37 * hash) + FULL_PAY_TO_ROYALTY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFullPayToRoyalty());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.MsgSellNFT parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.MsgSellNFT parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgSellNFT parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.MsgSellNFT prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.MsgSellNFT}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.MsgSellNFT)
      com.likechain.likenft.v1.MsgSellNFTOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgSellNFT_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgSellNFT_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.MsgSellNFT.class, com.likechain.likenft.v1.MsgSellNFT.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.MsgSellNFT.newBuilder()
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
      buyer_ = "";
      price_ = 0L;
      fullPayToRoyalty_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgSellNFT_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgSellNFT getDefaultInstanceForType() {
      return com.likechain.likenft.v1.MsgSellNFT.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgSellNFT build() {
      com.likechain.likenft.v1.MsgSellNFT result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgSellNFT buildPartial() {
      com.likechain.likenft.v1.MsgSellNFT result = new com.likechain.likenft.v1.MsgSellNFT(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.MsgSellNFT result) {
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
        result.buyer_ = buyer_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.price_ = price_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.fullPayToRoyalty_ = fullPayToRoyalty_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.MsgSellNFT) {
        return mergeFrom((com.likechain.likenft.v1.MsgSellNFT)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.MsgSellNFT other) {
      if (other == com.likechain.likenft.v1.MsgSellNFT.getDefaultInstance()) return this;
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
      if (!other.getBuyer().isEmpty()) {
        buyer_ = other.buyer_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getPrice() != 0L) {
        setPrice(other.getPrice());
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
            case 34: {
              buyer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              price_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object buyer_ = "";
    /**
     * <code>string buyer = 4 [json_name = "buyer"];</code>
     * @return The buyer.
     */
    public java.lang.String getBuyer() {
      java.lang.Object ref = buyer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buyer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string buyer = 4 [json_name = "buyer"];</code>
     * @return The bytes for buyer.
     */
    public com.google.protobuf.ByteString
        getBuyerBytes() {
      java.lang.Object ref = buyer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buyer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string buyer = 4 [json_name = "buyer"];</code>
     * @param value The buyer to set.
     * @return This builder for chaining.
     */
    public Builder setBuyer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      buyer_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string buyer = 4 [json_name = "buyer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBuyer() {
      buyer_ = getDefaultInstance().getBuyer();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string buyer = 4 [json_name = "buyer"];</code>
     * @param value The bytes for buyer to set.
     * @return This builder for chaining.
     */
    public Builder setBuyerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      buyer_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long price_ ;
    /**
     * <code>uint64 price = 5 [json_name = "price"];</code>
     * @return The price.
     */
    @java.lang.Override
    public long getPrice() {
      return price_;
    }
    /**
     * <code>uint64 price = 5 [json_name = "price"];</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(long value) {

      price_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 price = 5 [json_name = "price"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      bitField0_ = (bitField0_ & ~0x00000010);
      price_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.MsgSellNFT)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.MsgSellNFT)
  private static final com.likechain.likenft.v1.MsgSellNFT DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.MsgSellNFT();
  }

  public static com.likechain.likenft.v1.MsgSellNFT getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSellNFT>
      PARSER = new com.google.protobuf.AbstractParser<MsgSellNFT>() {
    @java.lang.Override
    public MsgSellNFT parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSellNFT> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSellNFT> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.MsgSellNFT getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

