// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/event.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.EventDeleteListing}
 */
public final class EventDeleteListing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.EventDeleteListing)
    EventDeleteListingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventDeleteListing.newBuilder() to construct.
  private EventDeleteListing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventDeleteListing() {
    classId_ = "";
    nftId_ = "";
    seller_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventDeleteListing();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventDeleteListing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventDeleteListing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.EventDeleteListing.class, com.likechain.likenft.v1.EventDeleteListing.Builder.class);
  }

  public static final int CLASS_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object classId_ = "";
  /**
   * <code>string class_id = 1 [json_name = "classId"];</code>
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
   * <code>string class_id = 1 [json_name = "classId"];</code>
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

  public static final int NFT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nftId_ = "";
  /**
   * <code>string nft_id = 2 [json_name = "nftId"];</code>
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
   * <code>string nft_id = 2 [json_name = "nftId"];</code>
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

  public static final int SELLER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object seller_ = "";
  /**
   * <code>string seller = 3 [json_name = "seller"];</code>
   * @return The seller.
   */
  @java.lang.Override
  public java.lang.String getSeller() {
    java.lang.Object ref = seller_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      seller_ = s;
      return s;
    }
  }
  /**
   * <code>string seller = 3 [json_name = "seller"];</code>
   * @return The bytes for seller.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSellerBytes() {
    java.lang.Object ref = seller_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      seller_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, classId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nftId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nftId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(seller_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, seller_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, classId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nftId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nftId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(seller_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, seller_);
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
    if (!(obj instanceof com.likechain.likenft.v1.EventDeleteListing)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.EventDeleteListing other = (com.likechain.likenft.v1.EventDeleteListing) obj;

    if (!getClassId()
        .equals(other.getClassId())) return false;
    if (!getNftId()
        .equals(other.getNftId())) return false;
    if (!getSeller()
        .equals(other.getSeller())) return false;
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
    hash = (37 * hash) + CLASS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClassId().hashCode();
    hash = (37 * hash) + NFT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNftId().hashCode();
    hash = (37 * hash) + SELLER_FIELD_NUMBER;
    hash = (53 * hash) + getSeller().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.EventDeleteListing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.EventDeleteListing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.EventDeleteListing parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.EventDeleteListing prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.EventDeleteListing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.EventDeleteListing)
      com.likechain.likenft.v1.EventDeleteListingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventDeleteListing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventDeleteListing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.EventDeleteListing.class, com.likechain.likenft.v1.EventDeleteListing.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.EventDeleteListing.newBuilder()
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
      classId_ = "";
      nftId_ = "";
      seller_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.EventProto.internal_static_likechain_likenft_v1_EventDeleteListing_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventDeleteListing getDefaultInstanceForType() {
      return com.likechain.likenft.v1.EventDeleteListing.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventDeleteListing build() {
      com.likechain.likenft.v1.EventDeleteListing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.EventDeleteListing buildPartial() {
      com.likechain.likenft.v1.EventDeleteListing result = new com.likechain.likenft.v1.EventDeleteListing(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.EventDeleteListing result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.classId_ = classId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nftId_ = nftId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.seller_ = seller_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.EventDeleteListing) {
        return mergeFrom((com.likechain.likenft.v1.EventDeleteListing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.EventDeleteListing other) {
      if (other == com.likechain.likenft.v1.EventDeleteListing.getDefaultInstance()) return this;
      if (!other.getClassId().isEmpty()) {
        classId_ = other.classId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNftId().isEmpty()) {
        nftId_ = other.nftId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSeller().isEmpty()) {
        seller_ = other.seller_;
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
              classId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              nftId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              seller_ = input.readStringRequireUtf8();
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

    private java.lang.Object classId_ = "";
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
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
     * <code>string class_id = 1 [json_name = "classId"];</code>
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
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @param value The classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      classId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClassId() {
      classId_ = getDefaultInstance().getClassId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     * @param value The bytes for classId to set.
     * @return This builder for chaining.
     */
    public Builder setClassIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      classId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object nftId_ = "";
    /**
     * <code>string nft_id = 2 [json_name = "nftId"];</code>
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
     * <code>string nft_id = 2 [json_name = "nftId"];</code>
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
     * <code>string nft_id = 2 [json_name = "nftId"];</code>
     * @param value The nftId to set.
     * @return This builder for chaining.
     */
    public Builder setNftId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nftId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string nft_id = 2 [json_name = "nftId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNftId() {
      nftId_ = getDefaultInstance().getNftId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string nft_id = 2 [json_name = "nftId"];</code>
     * @param value The bytes for nftId to set.
     * @return This builder for chaining.
     */
    public Builder setNftIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nftId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object seller_ = "";
    /**
     * <code>string seller = 3 [json_name = "seller"];</code>
     * @return The seller.
     */
    public java.lang.String getSeller() {
      java.lang.Object ref = seller_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        seller_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string seller = 3 [json_name = "seller"];</code>
     * @return The bytes for seller.
     */
    public com.google.protobuf.ByteString
        getSellerBytes() {
      java.lang.Object ref = seller_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        seller_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string seller = 3 [json_name = "seller"];</code>
     * @param value The seller to set.
     * @return This builder for chaining.
     */
    public Builder setSeller(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      seller_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string seller = 3 [json_name = "seller"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSeller() {
      seller_ = getDefaultInstance().getSeller();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string seller = 3 [json_name = "seller"];</code>
     * @param value The bytes for seller to set.
     * @return This builder for chaining.
     */
    public Builder setSellerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      seller_ = value;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.EventDeleteListing)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.EventDeleteListing)
  private static final com.likechain.likenft.v1.EventDeleteListing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.EventDeleteListing();
  }

  public static com.likechain.likenft.v1.EventDeleteListing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventDeleteListing>
      PARSER = new com.google.protobuf.AbstractParser<EventDeleteListing>() {
    @java.lang.Override
    public EventDeleteListing parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventDeleteListing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventDeleteListing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.EventDeleteListing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

