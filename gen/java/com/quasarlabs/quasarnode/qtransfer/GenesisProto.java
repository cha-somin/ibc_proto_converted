// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quasar/qtransfer/genesis.proto

package com.quasarlabs.quasarnode.qtransfer;

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
      // @@protoc_insertion_point(interface_extends:quasarlabs.quasarnode.qtransfer.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params getParams();
    /**
     * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    com.quasarlabs.quasarnode.qtransfer.ParamsProto.ParamsOrBuilder getParamsOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the qtransfer module's genesis state.
   * </pre>
   *
   * Protobuf type {@code quasarlabs.quasarnode.qtransfer.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:quasarlabs.quasarnode.qtransfer.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quasarlabs.quasarnode.qtransfer.GenesisProto.internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quasarlabs.quasarnode.qtransfer.GenesisProto.internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState.class, com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 1;
    private com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params params_;
    /**
     * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params getParams() {
      return params_ == null ? com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.getDefaultInstance() : params_;
    }
    /**
     * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.quasarlabs.quasarnode.qtransfer.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
      return params_ == null ? com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.getDefaultInstance() : params_;
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
      if (params_ != null) {
        output.writeMessage(1, getParams());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getParams());
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
      if (!(obj instanceof com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState other = (com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState) obj;

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
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the qtransfer module's genesis state.
     * </pre>
     *
     * Protobuf type {@code quasarlabs.quasarnode.qtransfer.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:quasarlabs.quasarnode.qtransfer.GenesisState)
        com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.quasarlabs.quasarnode.qtransfer.GenesisProto.internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.quasarlabs.quasarnode.qtransfer.GenesisProto.internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState.class, com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState.newBuilder()
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
        return com.quasarlabs.quasarnode.qtransfer.GenesisProto.internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState build() {
        com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState buildPartial() {
        com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState result = new com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
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
        if (other instanceof com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState) {
          return mergeFrom((com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState other) {
        if (other == com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState.getDefaultInstance()) return this;
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
                input.readMessage(
                    getParamsFieldBuilder().getBuilder(),
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

      private com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params, com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.Builder, com.quasarlabs.quasarnode.qtransfer.ParamsProto.ParamsOrBuilder> paramsBuilder_;
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
        } else {
          paramsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params value) {
        if (paramsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            params_ != null &&
            params_ != com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.getDefaultInstance()) {
            getParamsBuilder().mergeFrom(value);
          } else {
            params_ = value;
          }
        } else {
          paramsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000001);
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.Builder getParamsBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.quasarlabs.quasarnode.qtransfer.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <code>.quasarlabs.quasarnode.qtransfer.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params, com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.Builder, com.quasarlabs.quasarnode.qtransfer.ParamsProto.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params, com.quasarlabs.quasarnode.qtransfer.ParamsProto.Params.Builder, com.quasarlabs.quasarnode.qtransfer.ParamsProto.ParamsOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:quasarlabs.quasarnode.qtransfer.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:quasarlabs.quasarnode.qtransfer.GenesisState)
    private static final com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState();
    }

    public static com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.quasarlabs.quasarnode.qtransfer.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036quasar/qtransfer/genesis.proto\022\037quasar" +
      "labs.quasarnode.qtransfer\032\024gogoproto/gog" +
      "o.proto\032\035quasar/qtransfer/params.proto\"U" +
      "\n\014GenesisState\022E\n\006params\030\001 \001(\0132\'.quasarl" +
      "abs.quasarnode.qtransfer.ParamsB\004\310\336\037\000R\006p" +
      "aramsB\203\002\n#com.quasarlabs.quasarnode.qtra" +
      "nsferB\014GenesisProtoZ2github.com/quasarla" +
      "bs/quasarnode/x/qtransfer/types\242\002\003QQQ\252\002\037" +
      "Quasarlabs.Quasarnode.Qtransfer\312\002\037Quasar" +
      "labs\\Quasarnode\\Qtransfer\342\002+Quasarlabs\\Q" +
      "uasarnode\\Qtransfer\\GPBMetadata\352\002!Quasar" +
      "labs::Quasarnode::Qtransferb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.quasarlabs.quasarnode.qtransfer.ParamsProto.getDescriptor(),
        });
    internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quasarlabs_quasarnode_qtransfer_GenesisState_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.quasarlabs.quasarnode.qtransfer.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
