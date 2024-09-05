// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: babylon/zoneconcierge/v1/genesis.proto

package com.babylon.zoneconcierge.v1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:babylon.zoneconcierge.v1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The portId.
     */
    java.lang.String getPortId();
    /**
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The bytes for portId.
     */
    com.google.protobuf.ByteString
        getPortIdBytes();

    /**
     * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    com.babylon.zoneconcierge.v1.ParamsProto.Params getParams();
    /**
     * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    com.babylon.zoneconcierge.v1.ParamsProto.ParamsOrBuilder getParamsOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the zoneconcierge module's genesis state.
   * </pre>
   *
   * Protobuf type {@code babylon.zoneconcierge.v1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:babylon.zoneconcierge.v1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      portId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.babylon.zoneconcierge.v1.GenesisProto.internal_static_babylon_zoneconcierge_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.babylon.zoneconcierge.v1.GenesisProto.internal_static_babylon_zoneconcierge_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.babylon.zoneconcierge.v1.GenesisProto.GenesisState.class, com.babylon.zoneconcierge.v1.GenesisProto.GenesisState.Builder.class);
    }

    public static final int PORT_ID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object portId_ = "";
    /**
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The portId.
     */
    @java.lang.Override
    public java.lang.String getPortId() {
      java.lang.Object ref = portId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portId_ = s;
        return s;
      }
    }
    /**
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The bytes for portId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPortIdBytes() {
      java.lang.Object ref = portId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        portId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMS_FIELD_NUMBER = 2;
    private com.babylon.zoneconcierge.v1.ParamsProto.Params params_;
    /**
     * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public com.babylon.zoneconcierge.v1.ParamsProto.Params getParams() {
      return params_ == null ? com.babylon.zoneconcierge.v1.ParamsProto.Params.getDefaultInstance() : params_;
    }
    /**
     * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.babylon.zoneconcierge.v1.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
      return params_ == null ? com.babylon.zoneconcierge.v1.ParamsProto.Params.getDefaultInstance() : params_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, portId_);
      }
      if (params_ != null) {
        output.writeMessage(2, getParams());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, portId_);
      }
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getParams());
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
      if (!(obj instanceof com.babylon.zoneconcierge.v1.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.babylon.zoneconcierge.v1.GenesisProto.GenesisState other = (com.babylon.zoneconcierge.v1.GenesisProto.GenesisState) obj;

      if (!getPortId()
          .equals(other.getPortId())) return false;
      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
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
      hash = (37 * hash) + PORT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPortId().hashCode();
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.babylon.zoneconcierge.v1.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the zoneconcierge module's genesis state.
     * </pre>
     *
     * Protobuf type {@code babylon.zoneconcierge.v1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:babylon.zoneconcierge.v1.GenesisState)
        com.babylon.zoneconcierge.v1.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.babylon.zoneconcierge.v1.GenesisProto.internal_static_babylon_zoneconcierge_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.babylon.zoneconcierge.v1.GenesisProto.internal_static_babylon_zoneconcierge_v1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.babylon.zoneconcierge.v1.GenesisProto.GenesisState.class, com.babylon.zoneconcierge.v1.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.babylon.zoneconcierge.v1.GenesisProto.GenesisState.newBuilder()
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
        portId_ = "";
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.babylon.zoneconcierge.v1.GenesisProto.internal_static_babylon_zoneconcierge_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.babylon.zoneconcierge.v1.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.babylon.zoneconcierge.v1.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.babylon.zoneconcierge.v1.GenesisProto.GenesisState build() {
        com.babylon.zoneconcierge.v1.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.babylon.zoneconcierge.v1.GenesisProto.GenesisState buildPartial() {
        com.babylon.zoneconcierge.v1.GenesisProto.GenesisState result = new com.babylon.zoneconcierge.v1.GenesisProto.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.babylon.zoneconcierge.v1.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.portId_ = portId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.params_ = paramsBuilder_ == null
              ? params_
              : paramsBuilder_.build();
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
        if (other instanceof com.babylon.zoneconcierge.v1.GenesisProto.GenesisState) {
          return mergeFrom((com.babylon.zoneconcierge.v1.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.babylon.zoneconcierge.v1.GenesisProto.GenesisState other) {
        if (other == com.babylon.zoneconcierge.v1.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (!other.getPortId().isEmpty()) {
          portId_ = other.portId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasParams()) {
          mergeParams(other.getParams());
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
                portId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getParamsFieldBuilder().getBuilder(),
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

      private java.lang.Object portId_ = "";
      /**
       * <code>string port_id = 1 [json_name = "portId"];</code>
       * @return The portId.
       */
      public java.lang.String getPortId() {
        java.lang.Object ref = portId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          portId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string port_id = 1 [json_name = "portId"];</code>
       * @return The bytes for portId.
       */
      public com.google.protobuf.ByteString
          getPortIdBytes() {
        java.lang.Object ref = portId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          portId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string port_id = 1 [json_name = "portId"];</code>
       * @param value The portId to set.
       * @return This builder for chaining.
       */
      public Builder setPortId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        portId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string port_id = 1 [json_name = "portId"];</code>
       * @return This builder for chaining.
       */
      public Builder clearPortId() {
        portId_ = getDefaultInstance().getPortId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string port_id = 1 [json_name = "portId"];</code>
       * @param value The bytes for portId to set.
       * @return This builder for chaining.
       */
      public Builder setPortIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        portId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private com.babylon.zoneconcierge.v1.ParamsProto.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.babylon.zoneconcierge.v1.ParamsProto.Params, com.babylon.zoneconcierge.v1.ParamsProto.Params.Builder, com.babylon.zoneconcierge.v1.ParamsProto.ParamsOrBuilder> paramsBuilder_;
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public com.babylon.zoneconcierge.v1.ParamsProto.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? com.babylon.zoneconcierge.v1.ParamsProto.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(com.babylon.zoneconcierge.v1.ParamsProto.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
        } else {
          paramsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          com.babylon.zoneconcierge.v1.ParamsProto.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(com.babylon.zoneconcierge.v1.ParamsProto.Params value) {
        if (paramsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            params_ != null &&
            params_ != com.babylon.zoneconcierge.v1.ParamsProto.Params.getDefaultInstance()) {
            getParamsBuilder().mergeFrom(value);
          } else {
            params_ = value;
          }
        } else {
          paramsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000002);
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.babylon.zoneconcierge.v1.ParamsProto.Params.Builder getParamsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.babylon.zoneconcierge.v1.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              com.babylon.zoneconcierge.v1.ParamsProto.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <code>.babylon.zoneconcierge.v1.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.babylon.zoneconcierge.v1.ParamsProto.Params, com.babylon.zoneconcierge.v1.ParamsProto.Params.Builder, com.babylon.zoneconcierge.v1.ParamsProto.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.babylon.zoneconcierge.v1.ParamsProto.Params, com.babylon.zoneconcierge.v1.ParamsProto.Params.Builder, com.babylon.zoneconcierge.v1.ParamsProto.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:babylon.zoneconcierge.v1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:babylon.zoneconcierge.v1.GenesisState)
    private static final com.babylon.zoneconcierge.v1.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.babylon.zoneconcierge.v1.GenesisProto.GenesisState();
    }

    public static com.babylon.zoneconcierge.v1.GenesisProto.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.babylon.zoneconcierge.v1.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_babylon_zoneconcierge_v1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_babylon_zoneconcierge_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&babylon/zoneconcierge/v1/genesis.proto" +
      "\022\030babylon.zoneconcierge.v1\032\024gogoproto/go" +
      "go.proto\032%babylon/zoneconcierge/v1/param" +
      "s.proto\"g\n\014GenesisState\022\027\n\007port_id\030\001 \001(\t" +
      "R\006portId\022>\n\006params\030\002 \001(\0132 .babylon.zonec" +
      "oncierge.v1.ParamsB\004\310\336\037\000R\006paramsB\343\001\n\034com" +
      ".babylon.zoneconcierge.v1B\014GenesisProtoZ" +
      "5github.com/babylonchain/babylon/x/zonec" +
      "oncierge/types\242\002\003BZX\252\002\030Babylon.Zoneconci" +
      "erge.V1\312\002\030Babylon\\Zoneconcierge\\V1\342\002$Bab" +
      "ylon\\Zoneconcierge\\V1\\GPBMetadata\352\002\032Baby" +
      "lon::Zoneconcierge::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.babylon.zoneconcierge.v1.ParamsProto.getDescriptor(),
        });
    internal_static_babylon_zoneconcierge_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_babylon_zoneconcierge_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_babylon_zoneconcierge_v1_GenesisState_descriptor,
        new java.lang.String[] { "PortId", "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.babylon.zoneconcierge.v1.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}