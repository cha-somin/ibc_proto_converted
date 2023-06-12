// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datadeal/v2alpha1/tx.proto

package com.panacea.datadeal.v2alpha1;

/**
 * <pre>
 *MsgCreateDealResponse defines the Msg/CreateDeal response type.
 * </pre>
 *
 * Protobuf type {@code panacea.datadeal.v2alpha1.MsgCreateDealResponse}
 */
public final class MsgCreateDealResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.datadeal.v2alpha1.MsgCreateDealResponse)
    MsgCreateDealResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateDealResponse.newBuilder() to construct.
  private MsgCreateDealResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateDealResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateDealResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.datadeal.v2alpha1.TxProto.internal_static_panacea_datadeal_v2alpha1_MsgCreateDealResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.datadeal.v2alpha1.TxProto.internal_static_panacea_datadeal_v2alpha1_MsgCreateDealResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.datadeal.v2alpha1.MsgCreateDealResponse.class, com.panacea.datadeal.v2alpha1.MsgCreateDealResponse.Builder.class);
  }

  public static final int DEAL_ID_FIELD_NUMBER = 1;
  private long dealId_ = 0L;
  /**
   * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
   * @return The dealId.
   */
  @java.lang.Override
  public long getDealId() {
    return dealId_;
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
    if (dealId_ != 0L) {
      output.writeUInt64(1, dealId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dealId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, dealId_);
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
    if (!(obj instanceof com.panacea.datadeal.v2alpha1.MsgCreateDealResponse)) {
      return super.equals(obj);
    }
    com.panacea.datadeal.v2alpha1.MsgCreateDealResponse other = (com.panacea.datadeal.v2alpha1.MsgCreateDealResponse) obj;

    if (getDealId()
        != other.getDealId()) return false;
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
    hash = (37 * hash) + DEAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDealId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse parseFrom(
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
  public static Builder newBuilder(com.panacea.datadeal.v2alpha1.MsgCreateDealResponse prototype) {
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
   *MsgCreateDealResponse defines the Msg/CreateDeal response type.
   * </pre>
   *
   * Protobuf type {@code panacea.datadeal.v2alpha1.MsgCreateDealResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.datadeal.v2alpha1.MsgCreateDealResponse)
      com.panacea.datadeal.v2alpha1.MsgCreateDealResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.datadeal.v2alpha1.TxProto.internal_static_panacea_datadeal_v2alpha1_MsgCreateDealResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.datadeal.v2alpha1.TxProto.internal_static_panacea_datadeal_v2alpha1_MsgCreateDealResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.datadeal.v2alpha1.MsgCreateDealResponse.class, com.panacea.datadeal.v2alpha1.MsgCreateDealResponse.Builder.class);
    }

    // Construct using com.panacea.datadeal.v2alpha1.MsgCreateDealResponse.newBuilder()
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
      dealId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.datadeal.v2alpha1.TxProto.internal_static_panacea_datadeal_v2alpha1_MsgCreateDealResponse_descriptor;
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha1.MsgCreateDealResponse getDefaultInstanceForType() {
      return com.panacea.datadeal.v2alpha1.MsgCreateDealResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha1.MsgCreateDealResponse build() {
      com.panacea.datadeal.v2alpha1.MsgCreateDealResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha1.MsgCreateDealResponse buildPartial() {
      com.panacea.datadeal.v2alpha1.MsgCreateDealResponse result = new com.panacea.datadeal.v2alpha1.MsgCreateDealResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.panacea.datadeal.v2alpha1.MsgCreateDealResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dealId_ = dealId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.datadeal.v2alpha1.MsgCreateDealResponse) {
        return mergeFrom((com.panacea.datadeal.v2alpha1.MsgCreateDealResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.datadeal.v2alpha1.MsgCreateDealResponse other) {
      if (other == com.panacea.datadeal.v2alpha1.MsgCreateDealResponse.getDefaultInstance()) return this;
      if (other.getDealId() != 0L) {
        setDealId(other.getDealId());
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
            case 8: {
              dealId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long dealId_ ;
    /**
     * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
     * @return The dealId.
     */
    @java.lang.Override
    public long getDealId() {
      return dealId_;
    }
    /**
     * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
     * @param value The dealId to set.
     * @return This builder for chaining.
     */
    public Builder setDealId(long value) {

      dealId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDealId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dealId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:panacea.datadeal.v2alpha1.MsgCreateDealResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.datadeal.v2alpha1.MsgCreateDealResponse)
  private static final com.panacea.datadeal.v2alpha1.MsgCreateDealResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.datadeal.v2alpha1.MsgCreateDealResponse();
  }

  public static com.panacea.datadeal.v2alpha1.MsgCreateDealResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateDealResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateDealResponse>() {
    @java.lang.Override
    public MsgCreateDealResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateDealResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateDealResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.datadeal.v2alpha1.MsgCreateDealResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

