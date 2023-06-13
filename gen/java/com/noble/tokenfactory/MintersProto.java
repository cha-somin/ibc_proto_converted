// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/tokenfactory/minters.proto

package com.noble.tokenfactory;

public final class MintersProto {
  private MintersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MintersOrBuilder extends
      // @@protoc_insertion_point(interface_extends:noble.tokenfactory.Minters)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
     * @return Whether the allowance field is set.
     */
    boolean hasAllowance();
    /**
     * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
     * @return The allowance.
     */
    com.cosmos.base.v1beta1.CoinProto.Coin getAllowance();
    /**
     * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
     */
    com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder getAllowanceOrBuilder();
  }
  /**
   * Protobuf type {@code noble.tokenfactory.Minters}
   */
  public static final class Minters extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:noble.tokenfactory.Minters)
      MintersOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Minters.newBuilder() to construct.
    private Minters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Minters() {
      address_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Minters();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.tokenfactory.MintersProto.internal_static_noble_tokenfactory_Minters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.tokenfactory.MintersProto.internal_static_noble_tokenfactory_Minters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.tokenfactory.MintersProto.Minters.class, com.noble.tokenfactory.MintersProto.Minters.Builder.class);
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

    public static final int ALLOWANCE_FIELD_NUMBER = 2;
    private com.cosmos.base.v1beta1.CoinProto.Coin allowance_;
    /**
     * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
     * @return Whether the allowance field is set.
     */
    @java.lang.Override
    public boolean hasAllowance() {
      return allowance_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
     * @return The allowance.
     */
    @java.lang.Override
    public com.cosmos.base.v1beta1.CoinProto.Coin getAllowance() {
      return allowance_ == null ? com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : allowance_;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder getAllowanceOrBuilder() {
      return allowance_ == null ? com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : allowance_;
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
      if (allowance_ != null) {
        output.writeMessage(2, getAllowance());
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
      if (allowance_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAllowance());
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
      if (!(obj instanceof com.noble.tokenfactory.MintersProto.Minters)) {
        return super.equals(obj);
      }
      com.noble.tokenfactory.MintersProto.Minters other = (com.noble.tokenfactory.MintersProto.Minters) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (hasAllowance() != other.hasAllowance()) return false;
      if (hasAllowance()) {
        if (!getAllowance()
            .equals(other.getAllowance())) return false;
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
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      if (hasAllowance()) {
        hash = (37 * hash) + ALLOWANCE_FIELD_NUMBER;
        hash = (53 * hash) + getAllowance().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.noble.tokenfactory.MintersProto.Minters parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.noble.tokenfactory.MintersProto.Minters parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.noble.tokenfactory.MintersProto.Minters parseFrom(
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
    public static Builder newBuilder(com.noble.tokenfactory.MintersProto.Minters prototype) {
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
     * Protobuf type {@code noble.tokenfactory.Minters}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:noble.tokenfactory.Minters)
        com.noble.tokenfactory.MintersProto.MintersOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.noble.tokenfactory.MintersProto.internal_static_noble_tokenfactory_Minters_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.noble.tokenfactory.MintersProto.internal_static_noble_tokenfactory_Minters_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.noble.tokenfactory.MintersProto.Minters.class, com.noble.tokenfactory.MintersProto.Minters.Builder.class);
      }

      // Construct using com.noble.tokenfactory.MintersProto.Minters.newBuilder()
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
        allowance_ = null;
        if (allowanceBuilder_ != null) {
          allowanceBuilder_.dispose();
          allowanceBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.noble.tokenfactory.MintersProto.internal_static_noble_tokenfactory_Minters_descriptor;
      }

      @java.lang.Override
      public com.noble.tokenfactory.MintersProto.Minters getDefaultInstanceForType() {
        return com.noble.tokenfactory.MintersProto.Minters.getDefaultInstance();
      }

      @java.lang.Override
      public com.noble.tokenfactory.MintersProto.Minters build() {
        com.noble.tokenfactory.MintersProto.Minters result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.noble.tokenfactory.MintersProto.Minters buildPartial() {
        com.noble.tokenfactory.MintersProto.Minters result = new com.noble.tokenfactory.MintersProto.Minters(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.noble.tokenfactory.MintersProto.Minters result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.address_ = address_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.allowance_ = allowanceBuilder_ == null
              ? allowance_
              : allowanceBuilder_.build();
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
        if (other instanceof com.noble.tokenfactory.MintersProto.Minters) {
          return mergeFrom((com.noble.tokenfactory.MintersProto.Minters)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.noble.tokenfactory.MintersProto.Minters other) {
        if (other == com.noble.tokenfactory.MintersProto.Minters.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasAllowance()) {
          mergeAllowance(other.getAllowance());
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
                input.readMessage(
                    getAllowanceFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
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

      private com.cosmos.base.v1beta1.CoinProto.Coin allowance_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.base.v1beta1.CoinProto.Coin, com.cosmos.base.v1beta1.CoinProto.Coin.Builder, com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder> allowanceBuilder_;
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       * @return Whether the allowance field is set.
       */
      public boolean hasAllowance() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       * @return The allowance.
       */
      public com.cosmos.base.v1beta1.CoinProto.Coin getAllowance() {
        if (allowanceBuilder_ == null) {
          return allowance_ == null ? com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : allowance_;
        } else {
          return allowanceBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       */
      public Builder setAllowance(com.cosmos.base.v1beta1.CoinProto.Coin value) {
        if (allowanceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          allowance_ = value;
        } else {
          allowanceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       */
      public Builder setAllowance(
          com.cosmos.base.v1beta1.CoinProto.Coin.Builder builderForValue) {
        if (allowanceBuilder_ == null) {
          allowance_ = builderForValue.build();
        } else {
          allowanceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       */
      public Builder mergeAllowance(com.cosmos.base.v1beta1.CoinProto.Coin value) {
        if (allowanceBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            allowance_ != null &&
            allowance_ != com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance()) {
            getAllowanceBuilder().mergeFrom(value);
          } else {
            allowance_ = value;
          }
        } else {
          allowanceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       */
      public Builder clearAllowance() {
        bitField0_ = (bitField0_ & ~0x00000002);
        allowance_ = null;
        if (allowanceBuilder_ != null) {
          allowanceBuilder_.dispose();
          allowanceBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       */
      public com.cosmos.base.v1beta1.CoinProto.Coin.Builder getAllowanceBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getAllowanceFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       */
      public com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder getAllowanceOrBuilder() {
        if (allowanceBuilder_ != null) {
          return allowanceBuilder_.getMessageOrBuilder();
        } else {
          return allowance_ == null ?
              com.cosmos.base.v1beta1.CoinProto.Coin.getDefaultInstance() : allowance_;
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin allowance = 2 [json_name = "allowance", (.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.cosmos.base.v1beta1.CoinProto.Coin, com.cosmos.base.v1beta1.CoinProto.Coin.Builder, com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder> 
          getAllowanceFieldBuilder() {
        if (allowanceBuilder_ == null) {
          allowanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.cosmos.base.v1beta1.CoinProto.Coin, com.cosmos.base.v1beta1.CoinProto.Coin.Builder, com.cosmos.base.v1beta1.CoinProto.CoinOrBuilder>(
                  getAllowance(),
                  getParentForChildren(),
                  isClean());
          allowance_ = null;
        }
        return allowanceBuilder_;
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


      // @@protoc_insertion_point(builder_scope:noble.tokenfactory.Minters)
    }

    // @@protoc_insertion_point(class_scope:noble.tokenfactory.Minters)
    private static final com.noble.tokenfactory.MintersProto.Minters DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.noble.tokenfactory.MintersProto.Minters();
    }

    public static com.noble.tokenfactory.MintersProto.Minters getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Minters>
        PARSER = new com.google.protobuf.AbstractParser<Minters>() {
      @java.lang.Override
      public Minters parsePartialFrom(
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

    public static com.google.protobuf.Parser<Minters> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Minters> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.noble.tokenfactory.MintersProto.Minters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_noble_tokenfactory_Minters_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_noble_tokenfactory_Minters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n noble/tokenfactory/minters.proto\022\022nobl" +
      "e.tokenfactory\032\024gogoproto/gogo.proto\032\036co" +
      "smos/base/v1beta1/coin.proto\"b\n\007Minters\022" +
      "\030\n\007address\030\001 \001(\tR\007address\022=\n\tallowance\030\002" +
      " \001(\0132\031.cosmos.base.v1beta1.CoinB\004\310\336\037\000R\ta" +
      "llowanceB\311\001\n\026com.noble.tokenfactoryB\014Min" +
      "tersProtoZ:github.com/strangelove-ventur" +
      "es/noble/x/tokenfactory/types\242\002\003NTX\252\002\022No" +
      "ble.Tokenfactory\312\002\022Noble\\Tokenfactory\342\002\036" +
      "Noble\\Tokenfactory\\GPBMetadata\352\002\023Noble::" +
      "Tokenfactoryb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_noble_tokenfactory_Minters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_noble_tokenfactory_Minters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_noble_tokenfactory_Minters_descriptor,
        new java.lang.String[] { "Address", "Allowance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
