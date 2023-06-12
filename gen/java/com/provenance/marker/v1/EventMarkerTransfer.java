// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/marker.proto

package com.provenance.marker.v1;

/**
 * <pre>
 * EventMarkerTransfer event emitted when coins are transfered to from account to another
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.EventMarkerTransfer}
 */
public final class EventMarkerTransfer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.EventMarkerTransfer)
    EventMarkerTransferOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventMarkerTransfer.newBuilder() to construct.
  private EventMarkerTransfer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventMarkerTransfer() {
    amount_ = "";
    denom_ = "";
    administrator_ = "";
    toAddress_ = "";
    fromAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventMarkerTransfer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventMarkerTransfer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventMarkerTransfer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.marker.v1.EventMarkerTransfer.class, com.provenance.marker.v1.EventMarkerTransfer.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <code>string amount = 1 [json_name = "amount"];</code>
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
   * <code>string amount = 1 [json_name = "amount"];</code>
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

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADMINISTRATOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object administrator_ = "";
  /**
   * <code>string administrator = 3 [json_name = "administrator"];</code>
   * @return The administrator.
   */
  @java.lang.Override
  public java.lang.String getAdministrator() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      administrator_ = s;
      return s;
    }
  }
  /**
   * <code>string administrator = 3 [json_name = "administrator"];</code>
   * @return The bytes for administrator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdministratorBytes() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      administrator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_ADDRESS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toAddress_ = "";
  /**
   * <code>string to_address = 4 [json_name = "toAddress"];</code>
   * @return The toAddress.
   */
  @java.lang.Override
  public java.lang.String getToAddress() {
    java.lang.Object ref = toAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string to_address = 4 [json_name = "toAddress"];</code>
   * @return The bytes for toAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToAddressBytes() {
    java.lang.Object ref = toAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_ADDRESS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fromAddress_ = "";
  /**
   * <code>string from_address = 5 [json_name = "fromAddress"];</code>
   * @return The fromAddress.
   */
  @java.lang.Override
  public java.lang.String getFromAddress() {
    java.lang.Object ref = fromAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string from_address = 5 [json_name = "fromAddress"];</code>
   * @return The bytes for fromAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromAddressBytes() {
    java.lang.Object ref = fromAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(administrator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, administrator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, toAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fromAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, amount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(administrator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, administrator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, toAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fromAddress_);
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
    if (!(obj instanceof com.provenance.marker.v1.EventMarkerTransfer)) {
      return super.equals(obj);
    }
    com.provenance.marker.v1.EventMarkerTransfer other = (com.provenance.marker.v1.EventMarkerTransfer) obj;

    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getAdministrator()
        .equals(other.getAdministrator())) return false;
    if (!getToAddress()
        .equals(other.getToAddress())) return false;
    if (!getFromAddress()
        .equals(other.getFromAddress())) return false;
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + ADMINISTRATOR_FIELD_NUMBER;
    hash = (53 * hash) + getAdministrator().hashCode();
    hash = (37 * hash) + TO_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getToAddress().hashCode();
    hash = (37 * hash) + FROM_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getFromAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.marker.v1.EventMarkerTransfer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.marker.v1.EventMarkerTransfer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.EventMarkerTransfer parseFrom(
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
  public static Builder newBuilder(com.provenance.marker.v1.EventMarkerTransfer prototype) {
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
   * EventMarkerTransfer event emitted when coins are transfered to from account to another
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.EventMarkerTransfer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.EventMarkerTransfer)
      com.provenance.marker.v1.EventMarkerTransferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventMarkerTransfer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventMarkerTransfer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.marker.v1.EventMarkerTransfer.class, com.provenance.marker.v1.EventMarkerTransfer.Builder.class);
    }

    // Construct using com.provenance.marker.v1.EventMarkerTransfer.newBuilder()
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
      amount_ = "";
      denom_ = "";
      administrator_ = "";
      toAddress_ = "";
      fromAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.marker.v1.MarkerProto.internal_static_provenance_marker_v1_EventMarkerTransfer_descriptor;
    }

    @java.lang.Override
    public com.provenance.marker.v1.EventMarkerTransfer getDefaultInstanceForType() {
      return com.provenance.marker.v1.EventMarkerTransfer.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.marker.v1.EventMarkerTransfer build() {
      com.provenance.marker.v1.EventMarkerTransfer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.marker.v1.EventMarkerTransfer buildPartial() {
      com.provenance.marker.v1.EventMarkerTransfer result = new com.provenance.marker.v1.EventMarkerTransfer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.marker.v1.EventMarkerTransfer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.administrator_ = administrator_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.toAddress_ = toAddress_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.fromAddress_ = fromAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.marker.v1.EventMarkerTransfer) {
        return mergeFrom((com.provenance.marker.v1.EventMarkerTransfer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.marker.v1.EventMarkerTransfer other) {
      if (other == com.provenance.marker.v1.EventMarkerTransfer.getDefaultInstance()) return this;
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAdministrator().isEmpty()) {
        administrator_ = other.administrator_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getToAddress().isEmpty()) {
        toAddress_ = other.toAddress_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getFromAddress().isEmpty()) {
        fromAddress_ = other.fromAddress_;
        bitField0_ |= 0x00000010;
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
              amount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              administrator_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              toAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              fromAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 1 [json_name = "amount"];</code>
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
     * <code>string amount = 1 [json_name = "amount"];</code>
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
     * <code>string amount = 1 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 1 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 1 [json_name = "amount"];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object administrator_ = "";
    /**
     * <code>string administrator = 3 [json_name = "administrator"];</code>
     * @return The administrator.
     */
    public java.lang.String getAdministrator() {
      java.lang.Object ref = administrator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        administrator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string administrator = 3 [json_name = "administrator"];</code>
     * @return The bytes for administrator.
     */
    public com.google.protobuf.ByteString
        getAdministratorBytes() {
      java.lang.Object ref = administrator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        administrator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string administrator = 3 [json_name = "administrator"];</code>
     * @param value The administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministrator(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      administrator_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 3 [json_name = "administrator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdministrator() {
      administrator_ = getDefaultInstance().getAdministrator();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 3 [json_name = "administrator"];</code>
     * @param value The bytes for administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministratorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      administrator_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object toAddress_ = "";
    /**
     * <code>string to_address = 4 [json_name = "toAddress"];</code>
     * @return The toAddress.
     */
    public java.lang.String getToAddress() {
      java.lang.Object ref = toAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress"];</code>
     * @return The bytes for toAddress.
     */
    public com.google.protobuf.ByteString
        getToAddressBytes() {
      java.lang.Object ref = toAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress"];</code>
     * @param value The toAddress to set.
     * @return This builder for chaining.
     */
    public Builder setToAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toAddress_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToAddress() {
      toAddress_ = getDefaultInstance().getToAddress();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string to_address = 4 [json_name = "toAddress"];</code>
     * @param value The bytes for toAddress to set.
     * @return This builder for chaining.
     */
    public Builder setToAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toAddress_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object fromAddress_ = "";
    /**
     * <code>string from_address = 5 [json_name = "fromAddress"];</code>
     * @return The fromAddress.
     */
    public java.lang.String getFromAddress() {
      java.lang.Object ref = fromAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from_address = 5 [json_name = "fromAddress"];</code>
     * @return The bytes for fromAddress.
     */
    public com.google.protobuf.ByteString
        getFromAddressBytes() {
      java.lang.Object ref = fromAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from_address = 5 [json_name = "fromAddress"];</code>
     * @param value The fromAddress to set.
     * @return This builder for chaining.
     */
    public Builder setFromAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fromAddress_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string from_address = 5 [json_name = "fromAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFromAddress() {
      fromAddress_ = getDefaultInstance().getFromAddress();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string from_address = 5 [json_name = "fromAddress"];</code>
     * @param value The bytes for fromAddress to set.
     * @return This builder for chaining.
     */
    public Builder setFromAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fromAddress_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.EventMarkerTransfer)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.EventMarkerTransfer)
  private static final com.provenance.marker.v1.EventMarkerTransfer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.marker.v1.EventMarkerTransfer();
  }

  public static com.provenance.marker.v1.EventMarkerTransfer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventMarkerTransfer>
      PARSER = new com.google.protobuf.AbstractParser<EventMarkerTransfer>() {
    @java.lang.Override
    public EventMarkerTransfer parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventMarkerTransfer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventMarkerTransfer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.marker.v1.EventMarkerTransfer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

