// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/tx.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.MsgCreateOfferResponse}
 */
public final class MsgCreateOfferResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.MsgCreateOfferResponse)
    MsgCreateOfferResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateOfferResponse.newBuilder() to construct.
  private MsgCreateOfferResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateOfferResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateOfferResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateOfferResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateOfferResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.MsgCreateOfferResponse.class, com.likechain.likenft.v1.MsgCreateOfferResponse.Builder.class);
  }

  public static final int OFFER_FIELD_NUMBER = 1;
  private com.likechain.likenft.v1.Offer offer_;
  /**
   * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
   * @return Whether the offer field is set.
   */
  @java.lang.Override
  public boolean hasOffer() {
    return offer_ != null;
  }
  /**
   * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
   * @return The offer.
   */
  @java.lang.Override
  public com.likechain.likenft.v1.Offer getOffer() {
    return offer_ == null ? com.likechain.likenft.v1.Offer.getDefaultInstance() : offer_;
  }
  /**
   * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.likechain.likenft.v1.OfferOrBuilder getOfferOrBuilder() {
    return offer_ == null ? com.likechain.likenft.v1.Offer.getDefaultInstance() : offer_;
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
    if (offer_ != null) {
      output.writeMessage(1, getOffer());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (offer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOffer());
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
    if (!(obj instanceof com.likechain.likenft.v1.MsgCreateOfferResponse)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.MsgCreateOfferResponse other = (com.likechain.likenft.v1.MsgCreateOfferResponse) obj;

    if (hasOffer() != other.hasOffer()) return false;
    if (hasOffer()) {
      if (!getOffer()
          .equals(other.getOffer())) return false;
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
    if (hasOffer()) {
      hash = (37 * hash) + OFFER_FIELD_NUMBER;
      hash = (53 * hash) + getOffer().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgCreateOfferResponse parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.MsgCreateOfferResponse prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.MsgCreateOfferResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.MsgCreateOfferResponse)
      com.likechain.likenft.v1.MsgCreateOfferResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateOfferResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateOfferResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.MsgCreateOfferResponse.class, com.likechain.likenft.v1.MsgCreateOfferResponse.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.MsgCreateOfferResponse.newBuilder()
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
      offer_ = null;
      if (offerBuilder_ != null) {
        offerBuilder_.dispose();
        offerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgCreateOfferResponse_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgCreateOfferResponse getDefaultInstanceForType() {
      return com.likechain.likenft.v1.MsgCreateOfferResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgCreateOfferResponse build() {
      com.likechain.likenft.v1.MsgCreateOfferResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgCreateOfferResponse buildPartial() {
      com.likechain.likenft.v1.MsgCreateOfferResponse result = new com.likechain.likenft.v1.MsgCreateOfferResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.MsgCreateOfferResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.offer_ = offerBuilder_ == null
            ? offer_
            : offerBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.MsgCreateOfferResponse) {
        return mergeFrom((com.likechain.likenft.v1.MsgCreateOfferResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.MsgCreateOfferResponse other) {
      if (other == com.likechain.likenft.v1.MsgCreateOfferResponse.getDefaultInstance()) return this;
      if (other.hasOffer()) {
        mergeOffer(other.getOffer());
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
                  getOfferFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.likechain.likenft.v1.Offer offer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.likechain.likenft.v1.Offer, com.likechain.likenft.v1.Offer.Builder, com.likechain.likenft.v1.OfferOrBuilder> offerBuilder_;
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     * @return Whether the offer field is set.
     */
    public boolean hasOffer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     * @return The offer.
     */
    public com.likechain.likenft.v1.Offer getOffer() {
      if (offerBuilder_ == null) {
        return offer_ == null ? com.likechain.likenft.v1.Offer.getDefaultInstance() : offer_;
      } else {
        return offerBuilder_.getMessage();
      }
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOffer(com.likechain.likenft.v1.Offer value) {
      if (offerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        offer_ = value;
      } else {
        offerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOffer(
        com.likechain.likenft.v1.Offer.Builder builderForValue) {
      if (offerBuilder_ == null) {
        offer_ = builderForValue.build();
      } else {
        offerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeOffer(com.likechain.likenft.v1.Offer value) {
      if (offerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          offer_ != null &&
          offer_ != com.likechain.likenft.v1.Offer.getDefaultInstance()) {
          getOfferBuilder().mergeFrom(value);
        } else {
          offer_ = value;
        }
      } else {
        offerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearOffer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      offer_ = null;
      if (offerBuilder_ != null) {
        offerBuilder_.dispose();
        offerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.Offer.Builder getOfferBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOfferFieldBuilder().getBuilder();
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.OfferOrBuilder getOfferOrBuilder() {
      if (offerBuilder_ != null) {
        return offerBuilder_.getMessageOrBuilder();
      } else {
        return offer_ == null ?
            com.likechain.likenft.v1.Offer.getDefaultInstance() : offer_;
      }
    }
    /**
     * <code>.likechain.likenft.v1.Offer offer = 1 [json_name = "offer", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.likechain.likenft.v1.Offer, com.likechain.likenft.v1.Offer.Builder, com.likechain.likenft.v1.OfferOrBuilder> 
        getOfferFieldBuilder() {
      if (offerBuilder_ == null) {
        offerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.likechain.likenft.v1.Offer, com.likechain.likenft.v1.Offer.Builder, com.likechain.likenft.v1.OfferOrBuilder>(
                getOffer(),
                getParentForChildren(),
                isClean());
        offer_ = null;
      }
      return offerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.MsgCreateOfferResponse)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.MsgCreateOfferResponse)
  private static final com.likechain.likenft.v1.MsgCreateOfferResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.MsgCreateOfferResponse();
  }

  public static com.likechain.likenft.v1.MsgCreateOfferResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateOfferResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateOfferResponse>() {
    @java.lang.Override
    public MsgCreateOfferResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateOfferResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateOfferResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.MsgCreateOfferResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

