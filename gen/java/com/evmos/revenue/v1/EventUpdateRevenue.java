// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/revenue/v1/events.proto

package com.evmos.revenue.v1;

/**
 * <pre>
 * EventUpdateRevenue is an event emitted when a withdrawer address is updated for a contract.
 * </pre>
 *
 * Protobuf type {@code evmos.revenue.v1.EventUpdateRevenue}
 */
public final class EventUpdateRevenue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:evmos.revenue.v1.EventUpdateRevenue)
    EventUpdateRevenueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventUpdateRevenue.newBuilder() to construct.
  private EventUpdateRevenue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventUpdateRevenue() {
    contractAddress_ = "";
    deployerAddress_ = "";
    withdrawerAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventUpdateRevenue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.evmos.revenue.v1.EventsProto.internal_static_evmos_revenue_v1_EventUpdateRevenue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.evmos.revenue.v1.EventsProto.internal_static_evmos_revenue_v1_EventUpdateRevenue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.evmos.revenue.v1.EventUpdateRevenue.class, com.evmos.revenue.v1.EventUpdateRevenue.Builder.class);
  }

  public static final int CONTRACT_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contractAddress_ = "";
  /**
   * <pre>
   * contract_address in hex format
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The contractAddress.
   */
  @java.lang.Override
  public java.lang.String getContractAddress() {
    java.lang.Object ref = contractAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contractAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * contract_address in hex format
   * </pre>
   *
   * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
   * @return The bytes for contractAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContractAddressBytes() {
    java.lang.Object ref = contractAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contractAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYER_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deployerAddress_ = "";
  /**
   * <pre>
   * deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
   * sending the transaction which deploys the contract
   * </pre>
   *
   * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
   * @return The deployerAddress.
   */
  @java.lang.Override
  public java.lang.String getDeployerAddress() {
    java.lang.Object ref = deployerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployerAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
   * sending the transaction which deploys the contract
   * </pre>
   *
   * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
   * @return The bytes for deployerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeployerAddressBytes() {
    java.lang.Object ref = deployerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deployerAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WITHDRAWER_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object withdrawerAddress_ = "";
  /**
   * <pre>
   * withdrawer_address is the bech32 address of account receiving the transaction fees
   * </pre>
   *
   * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
   * @return The withdrawerAddress.
   */
  @java.lang.Override
  public java.lang.String getWithdrawerAddress() {
    java.lang.Object ref = withdrawerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      withdrawerAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * withdrawer_address is the bech32 address of account receiving the transaction fees
   * </pre>
   *
   * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
   * @return The bytes for withdrawerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWithdrawerAddressBytes() {
    java.lang.Object ref = withdrawerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      withdrawerAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contractAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployerAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployerAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawerAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, withdrawerAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contractAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contractAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployerAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployerAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(withdrawerAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, withdrawerAddress_);
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
    if (!(obj instanceof com.evmos.revenue.v1.EventUpdateRevenue)) {
      return super.equals(obj);
    }
    com.evmos.revenue.v1.EventUpdateRevenue other = (com.evmos.revenue.v1.EventUpdateRevenue) obj;

    if (!getContractAddress()
        .equals(other.getContractAddress())) return false;
    if (!getDeployerAddress()
        .equals(other.getDeployerAddress())) return false;
    if (!getWithdrawerAddress()
        .equals(other.getWithdrawerAddress())) return false;
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
    hash = (37 * hash) + CONTRACT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getContractAddress().hashCode();
    hash = (37 * hash) + DEPLOYER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDeployerAddress().hashCode();
    hash = (37 * hash) + WITHDRAWER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getWithdrawerAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.evmos.revenue.v1.EventUpdateRevenue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.evmos.revenue.v1.EventUpdateRevenue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.evmos.revenue.v1.EventUpdateRevenue parseFrom(
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
  public static Builder newBuilder(com.evmos.revenue.v1.EventUpdateRevenue prototype) {
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
   * EventUpdateRevenue is an event emitted when a withdrawer address is updated for a contract.
   * </pre>
   *
   * Protobuf type {@code evmos.revenue.v1.EventUpdateRevenue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:evmos.revenue.v1.EventUpdateRevenue)
      com.evmos.revenue.v1.EventUpdateRevenueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.evmos.revenue.v1.EventsProto.internal_static_evmos_revenue_v1_EventUpdateRevenue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.evmos.revenue.v1.EventsProto.internal_static_evmos_revenue_v1_EventUpdateRevenue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.evmos.revenue.v1.EventUpdateRevenue.class, com.evmos.revenue.v1.EventUpdateRevenue.Builder.class);
    }

    // Construct using com.evmos.revenue.v1.EventUpdateRevenue.newBuilder()
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
      contractAddress_ = "";
      deployerAddress_ = "";
      withdrawerAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.evmos.revenue.v1.EventsProto.internal_static_evmos_revenue_v1_EventUpdateRevenue_descriptor;
    }

    @java.lang.Override
    public com.evmos.revenue.v1.EventUpdateRevenue getDefaultInstanceForType() {
      return com.evmos.revenue.v1.EventUpdateRevenue.getDefaultInstance();
    }

    @java.lang.Override
    public com.evmos.revenue.v1.EventUpdateRevenue build() {
      com.evmos.revenue.v1.EventUpdateRevenue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.evmos.revenue.v1.EventUpdateRevenue buildPartial() {
      com.evmos.revenue.v1.EventUpdateRevenue result = new com.evmos.revenue.v1.EventUpdateRevenue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.evmos.revenue.v1.EventUpdateRevenue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contractAddress_ = contractAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deployerAddress_ = deployerAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.withdrawerAddress_ = withdrawerAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.evmos.revenue.v1.EventUpdateRevenue) {
        return mergeFrom((com.evmos.revenue.v1.EventUpdateRevenue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.evmos.revenue.v1.EventUpdateRevenue other) {
      if (other == com.evmos.revenue.v1.EventUpdateRevenue.getDefaultInstance()) return this;
      if (!other.getContractAddress().isEmpty()) {
        contractAddress_ = other.contractAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeployerAddress().isEmpty()) {
        deployerAddress_ = other.deployerAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getWithdrawerAddress().isEmpty()) {
        withdrawerAddress_ = other.withdrawerAddress_;
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
              contractAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              deployerAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              withdrawerAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object contractAddress_ = "";
    /**
     * <pre>
     * contract_address in hex format
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return The contractAddress.
     */
    public java.lang.String getContractAddress() {
      java.lang.Object ref = contractAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contractAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * contract_address in hex format
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return The bytes for contractAddress.
     */
    public com.google.protobuf.ByteString
        getContractAddressBytes() {
      java.lang.Object ref = contractAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contractAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * contract_address in hex format
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @param value The contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contractAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_address in hex format
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractAddress() {
      contractAddress_ = getDefaultInstance().getContractAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * contract_address in hex format
     * </pre>
     *
     * <code>string contract_address = 1 [json_name = "contractAddress"];</code>
     * @param value The bytes for contractAddress to set.
     * @return This builder for chaining.
     */
    public Builder setContractAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contractAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object deployerAddress_ = "";
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The deployerAddress.
     */
    public java.lang.String getDeployerAddress() {
      java.lang.Object ref = deployerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return The bytes for deployerAddress.
     */
    public com.google.protobuf.ByteString
        getDeployerAddressBytes() {
      java.lang.Object ref = deployerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @param value The deployerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDeployerAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deployerAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeployerAddress() {
      deployerAddress_ = getDefaultInstance().getDeployerAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
     * sending the transaction which deploys the contract
     * </pre>
     *
     * <code>string deployer_address = 2 [json_name = "deployerAddress"];</code>
     * @param value The bytes for deployerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDeployerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deployerAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object withdrawerAddress_ = "";
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @return The withdrawerAddress.
     */
    public java.lang.String getWithdrawerAddress() {
      java.lang.Object ref = withdrawerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        withdrawerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @return The bytes for withdrawerAddress.
     */
    public com.google.protobuf.ByteString
        getWithdrawerAddressBytes() {
      java.lang.Object ref = withdrawerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        withdrawerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @param value The withdrawerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawerAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      withdrawerAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithdrawerAddress() {
      withdrawerAddress_ = getDefaultInstance().getWithdrawerAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * withdrawer_address is the bech32 address of account receiving the transaction fees
     * </pre>
     *
     * <code>string withdrawer_address = 3 [json_name = "withdrawerAddress"];</code>
     * @param value The bytes for withdrawerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      withdrawerAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:evmos.revenue.v1.EventUpdateRevenue)
  }

  // @@protoc_insertion_point(class_scope:evmos.revenue.v1.EventUpdateRevenue)
  private static final com.evmos.revenue.v1.EventUpdateRevenue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.evmos.revenue.v1.EventUpdateRevenue();
  }

  public static com.evmos.revenue.v1.EventUpdateRevenue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventUpdateRevenue>
      PARSER = new com.google.protobuf.AbstractParser<EventUpdateRevenue>() {
    @java.lang.Override
    public EventUpdateRevenue parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventUpdateRevenue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventUpdateRevenue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.evmos.revenue.v1.EventUpdateRevenue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

