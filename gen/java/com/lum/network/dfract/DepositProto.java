// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/dfract/deposit.proto

package com.lum.network.dfract;

public final class DepositProto {
  private DepositProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DepositOrBuilder extends
      // @@protoc_insertion_point(interface_extends:lum.network.dfract.Deposit)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @return The depositorAddress.
     */
    java.lang.String getDepositorAddress();
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @return The bytes for depositorAddress.
     */
    com.google.protobuf.ByteString
        getDepositorAddressBytes();

    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    boolean hasAmount();
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return The amount.
     */
    com.cosmos.base.v1beta1.CoinProto.Coin getAmount();
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder getAmountOrBuilder();

    /**
     * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the createdAt field is set.
     */
    boolean hasCreatedAt();
    /**
     * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The createdAt.
     */
    com.google.protobuf.Timestamp getCreatedAt();
    /**
     * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();
  }
  /**
   * Protobuf type {@code lum.network.dfract.Deposit}
   */
  public static final class Deposit extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:lum.network.dfract.Deposit)
      DepositOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Deposit.newBuilder() to construct.
    private Deposit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Deposit() {
      depositorAddress_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Deposit();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.dfract.DepositProto.internal_static_lum_network_dfract_Deposit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.dfract.DepositProto.internal_static_lum_network_dfract_Deposit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.dfract.DepositProto.Deposit.class, com.lum.network.dfract.DepositProto.Deposit.Builder.class);
    }

    public static final int DEPOSITOR_ADDRESS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object depositorAddress_ = "";
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @return The depositorAddress.
     */
    @java.lang.Override
    public java.lang.String getDepositorAddress() {
      java.lang.Object ref = depositorAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositorAddress_ = s;
        return s;
      }
    }
    /**
     * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
     * @return The bytes for depositorAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDepositorAddressBytes() {
      java.lang.Object ref = depositorAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AMOUNT_FIELD_NUMBER = 2;
    private com.cosmos.base.v1beta1.CoinProto.Coin amount_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    @java.lang.Override
    public boolean hasAmount() {
      return amount_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     * @return The amount.
     */
    @java.lang.Override
    public com.cosmos.base.v1beta1.CoinProto.Coin getAmount() {
      return amount_ == null ? com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : amount_;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder getAmountOrBuilder() {
      return amount_ == null ? com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : amount_;
    }

    public static final int CREATED_AT_FIELD_NUMBER = 3;
    private com.google.protobuf.Timestamp createdAt_;
    /**
     * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the createdAt field is set.
     */
    @java.lang.Override
    public boolean hasCreatedAt() {
      return createdAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The createdAt.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getCreatedAt() {
      return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
      return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositorAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, depositorAddress_);
      }
      if (amount_ != null) {
        output.writeMessage(2, getAmount());
      }
      if (createdAt_ != null) {
        output.writeMessage(3, getCreatedAt());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositorAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, depositorAddress_);
      }
      if (amount_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAmount());
      }
      if (createdAt_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getCreatedAt());
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
      if (!(obj instanceof com.lum.network.dfract.DepositProto.Deposit)) {
        return super.equals(obj);
      }
      com.lum.network.dfract.DepositProto.Deposit other = (com.lum.network.dfract.DepositProto.Deposit) obj;

      if (!getDepositorAddress()
          .equals(other.getDepositorAddress())) return false;
      if (hasAmount() != other.hasAmount()) return false;
      if (hasAmount()) {
        if (!getAmount()
            .equals(other.getAmount())) return false;
      }
      if (hasCreatedAt() != other.hasCreatedAt()) return false;
      if (hasCreatedAt()) {
        if (!getCreatedAt()
            .equals(other.getCreatedAt())) return false;
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
      hash = (37 * hash) + DEPOSITOR_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getDepositorAddress().hashCode();
      if (hasAmount()) {
        hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getAmount().hashCode();
      }
      if (hasCreatedAt()) {
        hash = (37 * hash) + CREATED_AT_FIELD_NUMBER;
        hash = (53 * hash) + getCreatedAt().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.lum.network.dfract.DepositProto.Deposit parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.lum.network.dfract.DepositProto.Deposit parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.dfract.DepositProto.Deposit parseFrom(
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
    public static Builder newBuilder(com.lum.network.dfract.DepositProto.Deposit prototype) {
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
     * Protobuf type {@code lum.network.dfract.Deposit}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:lum.network.dfract.Deposit)
        com.lum.network.dfract.DepositProto.DepositOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lum.network.dfract.DepositProto.internal_static_lum_network_dfract_Deposit_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lum.network.dfract.DepositProto.internal_static_lum_network_dfract_Deposit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lum.network.dfract.DepositProto.Deposit.class, com.lum.network.dfract.DepositProto.Deposit.Builder.class);
      }

      // Construct using com.lum.network.dfract.DepositProto.Deposit.newBuilder()
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
        depositorAddress_ = "";
        amount_ = null;
        if (amountBuilder_ != null) {
          amountBuilder_.dispose();
          amountBuilder_ = null;
        }
        createdAt_ = null;
        if (createdAtBuilder_ != null) {
          createdAtBuilder_.dispose();
          createdAtBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lum.network.dfract.DepositProto.internal_static_lum_network_dfract_Deposit_descriptor;
      }

      @java.lang.Override
      public com.lum.network.dfract.DepositProto.Deposit getDefaultInstanceForType() {
        return com.lum.network.dfract.DepositProto.Deposit.getDefaultInstance();
      }

      @java.lang.Override
      public com.lum.network.dfract.DepositProto.Deposit build() {
        com.lum.network.dfract.DepositProto.Deposit result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.lum.network.dfract.DepositProto.Deposit buildPartial() {
        com.lum.network.dfract.DepositProto.Deposit result = new com.lum.network.dfract.DepositProto.Deposit(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.lum.network.dfract.DepositProto.Deposit result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.depositorAddress_ = depositorAddress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.amount_ = amountBuilder_ == null
              ? amount_
              : amountBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.createdAt_ = createdAtBuilder_ == null
              ? createdAt_
              : createdAtBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lum.network.dfract.DepositProto.Deposit) {
          return mergeFrom((com.lum.network.dfract.DepositProto.Deposit)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lum.network.dfract.DepositProto.Deposit other) {
        if (other == com.lum.network.dfract.DepositProto.Deposit.getDefaultInstance()) return this;
        if (!other.getDepositorAddress().isEmpty()) {
          depositorAddress_ = other.depositorAddress_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasAmount()) {
          mergeAmount(other.getAmount());
        }
        if (other.hasCreatedAt()) {
          mergeCreatedAt(other.getCreatedAt());
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
                depositorAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getAmountFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getCreatedAtFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private java.lang.Object depositorAddress_ = "";
      /**
       * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
       * @return The depositorAddress.
       */
      public java.lang.String getDepositorAddress() {
        java.lang.Object ref = depositorAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          depositorAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
       * @return The bytes for depositorAddress.
       */
      public com.google.protobuf.ByteString
          getDepositorAddressBytes() {
        java.lang.Object ref = depositorAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          depositorAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
       * @param value The depositorAddress to set.
       * @return This builder for chaining.
       */
      public Builder setDepositorAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        depositorAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDepositorAddress() {
        depositorAddress_ = getDefaultInstance().getDepositorAddress();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string depositor_address = 1 [json_name = "depositorAddress"];</code>
       * @param value The bytes for depositorAddress to set.
       * @return This builder for chaining.
       */
      public Builder setDepositorAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        depositorAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private com.cosmos.base.v1beta1.CoinProto.Coin amount_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.base.v1beta1.CoinProto.Coin, com.cosmos.base.v1beta1.CoinProto.Coin.Builder, com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder> amountBuilder_;
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       * @return Whether the amount field is set.
       */
      public boolean hasAmount() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       * @return The amount.
       */
      public com.cosmos.base.v1beta1.CoinProto.Coin getAmount() {
        if (amountBuilder_ == null) {
          return amount_ == null ? com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : amount_;
        } else {
          return amountBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       */
      public Builder setAmount(com.cosmos.base.v1beta1.CoinProto.Coin value) {
        if (amountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          amount_ = value;
        } else {
          amountBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       */
      public Builder setAmount(
          com.cosmos.base.v1beta1.CoinProto.Coin.Builder builderForValue) {
        if (amountBuilder_ == null) {
          amount_ = builderForValue.build();
        } else {
          amountBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       */
      public Builder mergeAmount(com.cosmos.base.v1beta1.CoinProto.Coin value) {
        if (amountBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            amount_ != null &&
            amount_ != com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance()) {
            getAmountBuilder().mergeFrom(value);
          } else {
            amount_ = value;
          }
        } else {
          amountBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       */
      public Builder clearAmount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        amount_ = null;
        if (amountBuilder_ != null) {
          amountBuilder_.dispose();
          amountBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       */
      public com.cosmos.base.v1beta1.CoinProto.Coin.Builder getAmountBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getAmountFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       */
      public com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder getAmountOrBuilder() {
        if (amountBuilder_ != null) {
          return amountBuilder_.getMessageOrBuilder();
        } else {
          return amount_ == null ?
              com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : amount_;
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 2 [json_name = "amount", (.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.base.v1beta1.CoinProto.Coin, com.cosmos.base.v1beta1.CoinProto.Coin.Builder, com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder> 
          getAmountFieldBuilder() {
        if (amountBuilder_ == null) {
          amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.cosmos.base.v1beta1.CoinProto.Coin, com.cosmos.base.v1beta1.CoinProto.Coin.Builder, com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder>(
                  getAmount(),
                  getParentForChildren(),
                  isClean());
          amount_ = null;
        }
        return amountBuilder_;
      }

      private com.google.protobuf.Timestamp createdAt_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAtBuilder_;
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return Whether the createdAt field is set.
       */
      public boolean hasCreatedAt() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return The createdAt.
       */
      public com.google.protobuf.Timestamp getCreatedAt() {
        if (createdAtBuilder_ == null) {
          return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
        } else {
          return createdAtBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
        if (createdAtBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          createdAt_ = value;
        } else {
          createdAtBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setCreatedAt(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (createdAtBuilder_ == null) {
          createdAt_ = builderForValue.build();
        } else {
          createdAtBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
        if (createdAtBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            createdAt_ != null &&
            createdAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
            getCreatedAtBuilder().mergeFrom(value);
          } else {
            createdAt_ = value;
          }
        } else {
          createdAtBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder clearCreatedAt() {
        bitField0_ = (bitField0_ & ~0x00000004);
        createdAt_ = null;
        if (createdAtBuilder_ != null) {
          createdAtBuilder_.dispose();
          createdAtBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.Timestamp.Builder getCreatedAtBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCreatedAtFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
        if (createdAtBuilder_ != null) {
          return createdAtBuilder_.getMessageOrBuilder();
        } else {
          return createdAt_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 3 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getCreatedAtFieldBuilder() {
        if (createdAtBuilder_ == null) {
          createdAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getCreatedAt(),
                  getParentForChildren(),
                  isClean());
          createdAt_ = null;
        }
        return createdAtBuilder_;
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


      // @@protoc_insertion_point(builder_scope:lum.network.dfract.Deposit)
    }

    // @@protoc_insertion_point(class_scope:lum.network.dfract.Deposit)
    private static final com.lum.network.dfract.DepositProto.Deposit DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.lum.network.dfract.DepositProto.Deposit();
    }

    public static com.lum.network.dfract.DepositProto.Deposit getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Deposit>
        PARSER = new com.google.protobuf.AbstractParser<Deposit>() {
      @java.lang.Override
      public Deposit parsePartialFrom(
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

    public static com.google.protobuf.Parser<Deposit> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Deposit> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.lum.network.dfract.DepositProto.Deposit getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lum_network_dfract_Deposit_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lum_network_dfract_Deposit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n lum-network/dfract/deposit.proto\022\022lum." +
      "network.dfract\032\024gogoproto/gogo.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\032\036cosmos/ba" +
      "se/v1beta1/coin.proto\"\264\001\n\007Deposit\022+\n\021dep" +
      "ositor_address\030\001 \001(\tR\020depositorAddress\0227" +
      "\n\006amount\030\002 \001(\0132\031.cosmos.base.v1beta1.Coi" +
      "nB\004\310\336\037\000R\006amount\022C\n\ncreated_at\030\003 \001(\0132\032.go" +
      "ogle.protobuf.TimestampB\010\310\336\037\000\220\337\037\001R\tcreat" +
      "edAtB\273\001\n\026com.lum.network.dfractB\014Deposit" +
      "ProtoZ+github.com/lum-network/chain/x/df" +
      "ract/types\242\002\003LND\252\002\022Lum.Network.Dfract\312\002\022" +
      "Lum\\Network\\Dfract\342\002\036Lum\\Network\\Dfract\\" +
      "GPBMetadata\352\002\024Lum::Network::Dfractb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_lum_network_dfract_Deposit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lum_network_dfract_Deposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lum_network_dfract_Deposit_descriptor,
        new java.lang.String[] { "DepositorAddress", "Amount", "CreatedAt", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
