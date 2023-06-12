// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/query.proto

package com.axelar.nexus.v1beta1;

/**
 * <pre>
 * TransferFeeRequest represents a message that queries the fees charged by
 * the network for a cross-chain transfer
 * </pre>
 *
 * Protobuf type {@code axelar.nexus.v1beta1.TransferFeeRequest}
 */
public final class TransferFeeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.nexus.v1beta1.TransferFeeRequest)
    TransferFeeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferFeeRequest.newBuilder() to construct.
  private TransferFeeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferFeeRequest() {
    sourceChain_ = "";
    destinationChain_ = "";
    amount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferFeeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferFeeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferFeeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.nexus.v1beta1.TransferFeeRequest.class, com.axelar.nexus.v1beta1.TransferFeeRequest.Builder.class);
  }

  public static final int SOURCE_CHAIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceChain_ = "";
  /**
   * <code>string source_chain = 1 [json_name = "sourceChain"];</code>
   * @return The sourceChain.
   */
  @java.lang.Override
  public java.lang.String getSourceChain() {
    java.lang.Object ref = sourceChain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceChain_ = s;
      return s;
    }
  }
  /**
   * <code>string source_chain = 1 [json_name = "sourceChain"];</code>
   * @return The bytes for sourceChain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceChainBytes() {
    java.lang.Object ref = sourceChain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceChain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_CHAIN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationChain_ = "";
  /**
   * <code>string destination_chain = 2 [json_name = "destinationChain"];</code>
   * @return The destinationChain.
   */
  @java.lang.Override
  public java.lang.String getDestinationChain() {
    java.lang.Object ref = destinationChain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationChain_ = s;
      return s;
    }
  }
  /**
   * <code>string destination_chain = 2 [json_name = "destinationChain"];</code>
   * @return The bytes for destinationChain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationChainBytes() {
    java.lang.Object ref = destinationChain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationChain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceChain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceChain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationChain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationChain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceChain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceChain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationChain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationChain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amount_);
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
    if (!(obj instanceof com.axelar.nexus.v1beta1.TransferFeeRequest)) {
      return super.equals(obj);
    }
    com.axelar.nexus.v1beta1.TransferFeeRequest other = (com.axelar.nexus.v1beta1.TransferFeeRequest) obj;

    if (!getSourceChain()
        .equals(other.getSourceChain())) return false;
    if (!getDestinationChain()
        .equals(other.getDestinationChain())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
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
    hash = (37 * hash) + SOURCE_CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getSourceChain().hashCode();
    hash = (37 * hash) + DESTINATION_CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationChain().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.TransferFeeRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.nexus.v1beta1.TransferFeeRequest prototype) {
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
   * TransferFeeRequest represents a message that queries the fees charged by
   * the network for a cross-chain transfer
   * </pre>
   *
   * Protobuf type {@code axelar.nexus.v1beta1.TransferFeeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.nexus.v1beta1.TransferFeeRequest)
      com.axelar.nexus.v1beta1.TransferFeeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferFeeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferFeeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.nexus.v1beta1.TransferFeeRequest.class, com.axelar.nexus.v1beta1.TransferFeeRequest.Builder.class);
    }

    // Construct using com.axelar.nexus.v1beta1.TransferFeeRequest.newBuilder()
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
      sourceChain_ = "";
      destinationChain_ = "";
      amount_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_TransferFeeRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.TransferFeeRequest getDefaultInstanceForType() {
      return com.axelar.nexus.v1beta1.TransferFeeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.TransferFeeRequest build() {
      com.axelar.nexus.v1beta1.TransferFeeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.TransferFeeRequest buildPartial() {
      com.axelar.nexus.v1beta1.TransferFeeRequest result = new com.axelar.nexus.v1beta1.TransferFeeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.nexus.v1beta1.TransferFeeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceChain_ = sourceChain_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.destinationChain_ = destinationChain_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amount_ = amount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.nexus.v1beta1.TransferFeeRequest) {
        return mergeFrom((com.axelar.nexus.v1beta1.TransferFeeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.nexus.v1beta1.TransferFeeRequest other) {
      if (other == com.axelar.nexus.v1beta1.TransferFeeRequest.getDefaultInstance()) return this;
      if (!other.getSourceChain().isEmpty()) {
        sourceChain_ = other.sourceChain_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDestinationChain().isEmpty()) {
        destinationChain_ = other.destinationChain_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
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
              sourceChain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              destinationChain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              amount_ = input.readStringRequireUtf8();
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

    private java.lang.Object sourceChain_ = "";
    /**
     * <code>string source_chain = 1 [json_name = "sourceChain"];</code>
     * @return The sourceChain.
     */
    public java.lang.String getSourceChain() {
      java.lang.Object ref = sourceChain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceChain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string source_chain = 1 [json_name = "sourceChain"];</code>
     * @return The bytes for sourceChain.
     */
    public com.google.protobuf.ByteString
        getSourceChainBytes() {
      java.lang.Object ref = sourceChain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceChain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source_chain = 1 [json_name = "sourceChain"];</code>
     * @param value The sourceChain to set.
     * @return This builder for chaining.
     */
    public Builder setSourceChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sourceChain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string source_chain = 1 [json_name = "sourceChain"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceChain() {
      sourceChain_ = getDefaultInstance().getSourceChain();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string source_chain = 1 [json_name = "sourceChain"];</code>
     * @param value The bytes for sourceChain to set.
     * @return This builder for chaining.
     */
    public Builder setSourceChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sourceChain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object destinationChain_ = "";
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain"];</code>
     * @return The destinationChain.
     */
    public java.lang.String getDestinationChain() {
      java.lang.Object ref = destinationChain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationChain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain"];</code>
     * @return The bytes for destinationChain.
     */
    public com.google.protobuf.ByteString
        getDestinationChainBytes() {
      java.lang.Object ref = destinationChain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationChain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain"];</code>
     * @param value The destinationChain to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      destinationChain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationChain() {
      destinationChain_ = getDefaultInstance().getDestinationChain();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string destination_chain = 2 [json_name = "destinationChain"];</code>
     * @param value The bytes for destinationChain to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      destinationChain_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
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


    // @@protoc_insertion_point(builder_scope:axelar.nexus.v1beta1.TransferFeeRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.nexus.v1beta1.TransferFeeRequest)
  private static final com.axelar.nexus.v1beta1.TransferFeeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.nexus.v1beta1.TransferFeeRequest();
  }

  public static com.axelar.nexus.v1beta1.TransferFeeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferFeeRequest>
      PARSER = new com.google.protobuf.AbstractParser<TransferFeeRequest>() {
    @java.lang.Override
    public TransferFeeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransferFeeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferFeeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.nexus.v1beta1.TransferFeeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

