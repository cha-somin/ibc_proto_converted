// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pstake/liquidstakeibc/v1beta1/params.proto

package com.pstake.liquidstakeibc.v1beta1;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:pstake.liquidstakeibc.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * protocol admin address
     * </pre>
     *
     * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The adminAddress.
     */
    java.lang.String getAdminAddress();
    /**
     * <pre>
     * protocol admin address
     * </pre>
     *
     * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for adminAddress.
     */
    com.google.protobuf.ByteString
        getAdminAddressBytes();

    /**
     * <pre>
     * protocol fee address
     * </pre>
     *
     * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The feeAddress.
     */
    java.lang.String getFeeAddress();
    /**
     * <pre>
     * protocol fee address
     * </pre>
     *
     * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for feeAddress.
     */
    com.google.protobuf.ByteString
        getFeeAddressBytes();
  }
  /**
   * <pre>
   * Params defines the parameters for the module.
   * </pre>
   *
   * Protobuf type {@code pstake.liquidstakeibc.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:pstake.liquidstakeibc.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      adminAddress_ = "";
      feeAddress_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pstake.liquidstakeibc.v1beta1.ParamsProto.internal_static_pstake_liquidstakeibc_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pstake.liquidstakeibc.v1beta1.ParamsProto.internal_static_pstake_liquidstakeibc_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params.class, com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params.Builder.class);
    }

    public static final int ADMIN_ADDRESS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object adminAddress_ = "";
    /**
     * <pre>
     * protocol admin address
     * </pre>
     *
     * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The adminAddress.
     */
    @java.lang.Override
    public java.lang.String getAdminAddress() {
      java.lang.Object ref = adminAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adminAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * protocol admin address
     * </pre>
     *
     * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for adminAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAdminAddressBytes() {
      java.lang.Object ref = adminAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adminAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FEE_ADDRESS_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object feeAddress_ = "";
    /**
     * <pre>
     * protocol fee address
     * </pre>
     *
     * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The feeAddress.
     */
    @java.lang.Override
    public java.lang.String getFeeAddress() {
      java.lang.Object ref = feeAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feeAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * protocol fee address
     * </pre>
     *
     * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for feeAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeeAddressBytes() {
      java.lang.Object ref = feeAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feeAddress_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adminAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, adminAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeAddress_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, feeAddress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adminAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, adminAddress_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feeAddress_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, feeAddress_);
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
      if (!(obj instanceof com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params other = (com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params) obj;

      if (!getAdminAddress()
          .equals(other.getAdminAddress())) return false;
      if (!getFeeAddress()
          .equals(other.getFeeAddress())) return false;
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
      hash = (37 * hash) + ADMIN_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAdminAddress().hashCode();
      hash = (37 * hash) + FEE_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getFeeAddress().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params prototype) {
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
     * Params defines the parameters for the module.
     * </pre>
     *
     * Protobuf type {@code pstake.liquidstakeibc.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:pstake.liquidstakeibc.v1beta1.Params)
        com.pstake.liquidstakeibc.v1beta1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pstake.liquidstakeibc.v1beta1.ParamsProto.internal_static_pstake_liquidstakeibc_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pstake.liquidstakeibc.v1beta1.ParamsProto.internal_static_pstake_liquidstakeibc_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params.class, com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params.newBuilder()
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
        adminAddress_ = "";
        feeAddress_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pstake.liquidstakeibc.v1beta1.ParamsProto.internal_static_pstake_liquidstakeibc_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
        return com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params build() {
        com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params buildPartial() {
        com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params result = new com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.adminAddress_ = adminAddress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.feeAddress_ = feeAddress_;
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
        if (other instanceof com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params) {
          return mergeFrom((com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params other) {
        if (other == com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params.getDefaultInstance()) return this;
        if (!other.getAdminAddress().isEmpty()) {
          adminAddress_ = other.adminAddress_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getFeeAddress().isEmpty()) {
          feeAddress_ = other.feeAddress_;
          bitField0_ |= 0x00000002;
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
                adminAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                feeAddress_ = input.readStringRequireUtf8();
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

      private java.lang.Object adminAddress_ = "";
      /**
       * <pre>
       * protocol admin address
       * </pre>
       *
       * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @return The adminAddress.
       */
      public java.lang.String getAdminAddress() {
        java.lang.Object ref = adminAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          adminAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * protocol admin address
       * </pre>
       *
       * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @return The bytes for adminAddress.
       */
      public com.google.protobuf.ByteString
          getAdminAddressBytes() {
        java.lang.Object ref = adminAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          adminAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * protocol admin address
       * </pre>
       *
       * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @param value The adminAddress to set.
       * @return This builder for chaining.
       */
      public Builder setAdminAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        adminAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * protocol admin address
       * </pre>
       *
       * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAdminAddress() {
        adminAddress_ = getDefaultInstance().getAdminAddress();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * protocol admin address
       * </pre>
       *
       * <code>string admin_address = 1 [json_name = "adminAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @param value The bytes for adminAddress to set.
       * @return This builder for chaining.
       */
      public Builder setAdminAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        adminAddress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object feeAddress_ = "";
      /**
       * <pre>
       * protocol fee address
       * </pre>
       *
       * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @return The feeAddress.
       */
      public java.lang.String getFeeAddress() {
        java.lang.Object ref = feeAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          feeAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * protocol fee address
       * </pre>
       *
       * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @return The bytes for feeAddress.
       */
      public com.google.protobuf.ByteString
          getFeeAddressBytes() {
        java.lang.Object ref = feeAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          feeAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * protocol fee address
       * </pre>
       *
       * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @param value The feeAddress to set.
       * @return This builder for chaining.
       */
      public Builder setFeeAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        feeAddress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * protocol fee address
       * </pre>
       *
       * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @return This builder for chaining.
       */
      public Builder clearFeeAddress() {
        feeAddress_ = getDefaultInstance().getFeeAddress();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * protocol fee address
       * </pre>
       *
       * <code>string fee_address = 2 [json_name = "feeAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
       * @param value The bytes for feeAddress to set.
       * @return This builder for chaining.
       */
      public Builder setFeeAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        feeAddress_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:pstake.liquidstakeibc.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:pstake.liquidstakeibc.v1beta1.Params)
    private static final com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params();
    }

    public static com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
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

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.pstake.liquidstakeibc.v1beta1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pstake_liquidstakeibc_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pstake_liquidstakeibc_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*pstake/liquidstakeibc/v1beta1/params.p" +
      "roto\022\035pstake.liquidstakeibc.v1beta1\032\024gog" +
      "oproto/gogo.proto\032\031cosmos_proto/cosmos.p" +
      "roto\"\210\001\n\006Params\022=\n\radmin_address\030\001 \001(\tB\030" +
      "\322\264-\024cosmos.AddressStringR\014adminAddress\0229" +
      "\n\013fee_address\030\002 \001(\tB\030\322\264-\024cosmos.AddressS" +
      "tringR\nfeeAddress:\004\230\240\037\000B\207\002\n!com.pstake.l" +
      "iquidstakeibc.v1beta1B\013ParamsProtoZAgith" +
      "ub.com/persistenceOne/pstake-native/v2/x" +
      "/liquidstakeibc/types\242\002\003PLX\252\002\035Pstake.Liq" +
      "uidstakeibc.V1beta1\312\002\035Pstake\\Liquidstake" +
      "ibc\\V1beta1\342\002)Pstake\\Liquidstakeibc\\V1be" +
      "ta1\\GPBMetadata\352\002\037Pstake::Liquidstakeibc" +
      "::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_pstake_liquidstakeibc_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pstake_liquidstakeibc_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pstake_liquidstakeibc_v1beta1_Params_descriptor,
        new java.lang.String[] { "AdminAddress", "FeeAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}