// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v2/allocation.proto

package com.sentinel.subscription.v2;

public final class AllocationProto {
  private AllocationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AllocationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.subscription.v2.Allocation)
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
     * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The grantedBytes.
     */
    java.lang.String getGrantedBytes();
    /**
     * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for grantedBytes.
     */
    com.google.protobuf.ByteString
        getGrantedBytesBytes();

    /**
     * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The utilisedBytes.
     */
    java.lang.String getUtilisedBytes();
    /**
     * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for utilisedBytes.
     */
    com.google.protobuf.ByteString
        getUtilisedBytesBytes();
  }
  /**
   * Protobuf type {@code sentinel.subscription.v2.Allocation}
   */
  public static final class Allocation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.subscription.v2.Allocation)
      AllocationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Allocation.newBuilder() to construct.
    private Allocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Allocation() {
      address_ = "";
      grantedBytes_ = "";
      utilisedBytes_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Allocation();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.subscription.v2.AllocationProto.internal_static_sentinel_subscription_v2_Allocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.subscription.v2.AllocationProto.internal_static_sentinel_subscription_v2_Allocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.subscription.v2.AllocationProto.Allocation.class, com.sentinel.subscription.v2.AllocationProto.Allocation.Builder.class);
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

    public static final int GRANTED_BYTES_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object grantedBytes_ = "";
    /**
     * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The grantedBytes.
     */
    @java.lang.Override
    public java.lang.String getGrantedBytes() {
      java.lang.Object ref = grantedBytes_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grantedBytes_ = s;
        return s;
      }
    }
    /**
     * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for grantedBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGrantedBytesBytes() {
      java.lang.Object ref = grantedBytes_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grantedBytes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UTILISED_BYTES_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object utilisedBytes_ = "";
    /**
     * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The utilisedBytes.
     */
    @java.lang.Override
    public java.lang.String getUtilisedBytes() {
      java.lang.Object ref = utilisedBytes_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        utilisedBytes_ = s;
        return s;
      }
    }
    /**
     * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for utilisedBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUtilisedBytesBytes() {
      java.lang.Object ref = utilisedBytes_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        utilisedBytes_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantedBytes_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, grantedBytes_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(utilisedBytes_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, utilisedBytes_);
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantedBytes_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, grantedBytes_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(utilisedBytes_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, utilisedBytes_);
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
      if (!(obj instanceof com.sentinel.subscription.v2.AllocationProto.Allocation)) {
        return super.equals(obj);
      }
      com.sentinel.subscription.v2.AllocationProto.Allocation other = (com.sentinel.subscription.v2.AllocationProto.Allocation) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!getGrantedBytes()
          .equals(other.getGrantedBytes())) return false;
      if (!getUtilisedBytes()
          .equals(other.getUtilisedBytes())) return false;
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
      hash = (37 * hash) + GRANTED_BYTES_FIELD_NUMBER;
      hash = (53 * hash) + getGrantedBytes().hashCode();
      hash = (37 * hash) + UTILISED_BYTES_FIELD_NUMBER;
      hash = (53 * hash) + getUtilisedBytes().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.subscription.v2.AllocationProto.Allocation parseFrom(
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
    public static Builder newBuilder(com.sentinel.subscription.v2.AllocationProto.Allocation prototype) {
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
     * Protobuf type {@code sentinel.subscription.v2.Allocation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.subscription.v2.Allocation)
        com.sentinel.subscription.v2.AllocationProto.AllocationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sentinel.subscription.v2.AllocationProto.internal_static_sentinel_subscription_v2_Allocation_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sentinel.subscription.v2.AllocationProto.internal_static_sentinel_subscription_v2_Allocation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sentinel.subscription.v2.AllocationProto.Allocation.class, com.sentinel.subscription.v2.AllocationProto.Allocation.Builder.class);
      }

      // Construct using com.sentinel.subscription.v2.AllocationProto.Allocation.newBuilder()
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
        grantedBytes_ = "";
        utilisedBytes_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sentinel.subscription.v2.AllocationProto.internal_static_sentinel_subscription_v2_Allocation_descriptor;
      }

      @java.lang.Override
      public com.sentinel.subscription.v2.AllocationProto.Allocation getDefaultInstanceForType() {
        return com.sentinel.subscription.v2.AllocationProto.Allocation.getDefaultInstance();
      }

      @java.lang.Override
      public com.sentinel.subscription.v2.AllocationProto.Allocation build() {
        com.sentinel.subscription.v2.AllocationProto.Allocation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sentinel.subscription.v2.AllocationProto.Allocation buildPartial() {
        com.sentinel.subscription.v2.AllocationProto.Allocation result = new com.sentinel.subscription.v2.AllocationProto.Allocation(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.sentinel.subscription.v2.AllocationProto.Allocation result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.address_ = address_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.grantedBytes_ = grantedBytes_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.utilisedBytes_ = utilisedBytes_;
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
        if (other instanceof com.sentinel.subscription.v2.AllocationProto.Allocation) {
          return mergeFrom((com.sentinel.subscription.v2.AllocationProto.Allocation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sentinel.subscription.v2.AllocationProto.Allocation other) {
        if (other == com.sentinel.subscription.v2.AllocationProto.Allocation.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getGrantedBytes().isEmpty()) {
          grantedBytes_ = other.grantedBytes_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getUtilisedBytes().isEmpty()) {
          utilisedBytes_ = other.utilisedBytes_;
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
                address_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                grantedBytes_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                utilisedBytes_ = input.readStringRequireUtf8();
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

      private java.lang.Object grantedBytes_ = "";
      /**
       * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The grantedBytes.
       */
      public java.lang.String getGrantedBytes() {
        java.lang.Object ref = grantedBytes_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          grantedBytes_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for grantedBytes.
       */
      public com.google.protobuf.ByteString
          getGrantedBytesBytes() {
        java.lang.Object ref = grantedBytes_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          grantedBytes_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The grantedBytes to set.
       * @return This builder for chaining.
       */
      public Builder setGrantedBytes(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        grantedBytes_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearGrantedBytes() {
        grantedBytes_ = getDefaultInstance().getGrantedBytes();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string granted_bytes = 2 [json_name = "grantedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for grantedBytes to set.
       * @return This builder for chaining.
       */
      public Builder setGrantedBytesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        grantedBytes_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object utilisedBytes_ = "";
      /**
       * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The utilisedBytes.
       */
      public java.lang.String getUtilisedBytes() {
        java.lang.Object ref = utilisedBytes_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          utilisedBytes_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for utilisedBytes.
       */
      public com.google.protobuf.ByteString
          getUtilisedBytesBytes() {
        java.lang.Object ref = utilisedBytes_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          utilisedBytes_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The utilisedBytes to set.
       * @return This builder for chaining.
       */
      public Builder setUtilisedBytes(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        utilisedBytes_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearUtilisedBytes() {
        utilisedBytes_ = getDefaultInstance().getUtilisedBytes();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string utilised_bytes = 3 [json_name = "utilisedBytes", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for utilisedBytes to set.
       * @return This builder for chaining.
       */
      public Builder setUtilisedBytesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        utilisedBytes_ = value;
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


      // @@protoc_insertion_point(builder_scope:sentinel.subscription.v2.Allocation)
    }

    // @@protoc_insertion_point(class_scope:sentinel.subscription.v2.Allocation)
    private static final com.sentinel.subscription.v2.AllocationProto.Allocation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sentinel.subscription.v2.AllocationProto.Allocation();
    }

    public static com.sentinel.subscription.v2.AllocationProto.Allocation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Allocation>
        PARSER = new com.google.protobuf.AbstractParser<Allocation>() {
      @java.lang.Override
      public Allocation parsePartialFrom(
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

    public static com.google.protobuf.Parser<Allocation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Allocation> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.sentinel.subscription.v2.AllocationProto.Allocation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_subscription_v2_Allocation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_subscription_v2_Allocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)sentinel/subscription/v2/allocation.pr" +
      "oto\022\030sentinel.subscription.v2\032\024gogoproto" +
      "/gogo.proto\"\322\001\n\nAllocation\022\030\n\007address\030\001 " +
      "\001(\tR\007address\022S\n\rgranted_bytes\030\002 \001(\tB.\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "IntR\014grantedBytes\022U\n\016utilised_bytes\030\003 \001(" +
      "\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/" +
      "types.IntR\rutilisedBytesB\356\001\n\034com.sentine" +
      "l.subscription.v2B\017AllocationProtoZ5gith" +
      "ub.com/sentinel-official/hub/x/subscript" +
      "ion/types\242\002\003SSX\252\002\030Sentinel.Subscription." +
      "V2\312\002\030Sentinel\\Subscription\\V2\342\002$Sentinel" +
      "\\Subscription\\V2\\GPBMetadata\352\002\032Sentinel:" +
      ":Subscription::V2\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_sentinel_subscription_v2_Allocation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_subscription_v2_Allocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_subscription_v2_Allocation_descriptor,
        new java.lang.String[] { "Address", "GrantedBytes", "UtilisedBytes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}