// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/alloc/v1beta1/genesis.proto

package com.publicawesome.stargaze.alloc.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:publicawesome.stargaze.alloc.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params getParams();
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.ParamsOrBuilder getParamsOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the alloc module's genesis state.
   * </pre>
   *
   * Protobuf type {@code publicawesome.stargaze.alloc.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:publicawesome.stargaze.alloc.v1beta1.GenesisState)
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
      return com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState.class, com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 1;
    private com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params params_;
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params getParams() {
      return params_ == null ? com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # genesis/proto/state
     * </pre>
     *
     * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
      return params_ == null ? com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
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
      if (!(obj instanceof com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState other = (com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState) obj;

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

    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the alloc module's genesis state.
     * </pre>
     *
     * Protobuf type {@code publicawesome.stargaze.alloc.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:publicawesome.stargaze.alloc.v1beta1.GenesisState)
        com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState.class, com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState.newBuilder()
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
        return com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState build() {
        com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState buildPartial() {
        com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState result = new com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState result) {
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
        if (other instanceof com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState) {
          return mergeFrom((com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState other) {
        if (other == com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState.getDefaultInstance()) return this;
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

      private com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params, com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.Builder, com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.ParamsOrBuilder> paramsBuilder_;
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params value) {
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
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.Builder builderForValue) {
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
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params value) {
        if (paramsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            params_ != null &&
            params_ != com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.getDefaultInstance()) {
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
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
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
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.Builder getParamsBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      public com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <pre>
       * this line is used by starport scaffolding # genesis/proto/state
       * </pre>
       *
       * <code>.publicawesome.stargaze.alloc.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params, com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.Builder, com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params, com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.Params.Builder, com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.ParamsOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:publicawesome.stargaze.alloc.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:publicawesome.stargaze.alloc.v1beta1.GenesisState)
    private static final com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState();
    }

    public static com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.publicawesome.stargaze.alloc.v1beta1.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$stargaze/alloc/v1beta1/genesis.proto\022$" +
      "publicawesome.stargaze.alloc.v1beta1\032\024go" +
      "goproto/gogo.proto\032#stargaze/alloc/v1bet" +
      "a1/params.proto\"Z\n\014GenesisState\022J\n\006param" +
      "s\030\001 \001(\0132,.publicawesome.stargaze.alloc.v" +
      "1beta1.ParamsB\004\310\336\037\000R\006paramsB\237\002\n(com.publ" +
      "icawesome.stargaze.alloc.v1beta1B\014Genesi" +
      "sProtoZ4github.com/public-awesome/starga" +
      "ze/v11/x/alloc/types\242\002\003PSA\252\002$Publicaweso" +
      "me.Stargaze.Alloc.V1beta1\312\002$Publicawesom" +
      "e\\Stargaze\\Alloc\\V1beta1\342\0020Publicawesome" +
      "\\Stargaze\\Alloc\\V1beta1\\GPBMetadata\352\002\'Pu" +
      "blicawesome::Stargaze::Alloc::V1beta1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.getDescriptor(),
        });
    internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_publicawesome_stargaze_alloc_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.publicawesome.stargaze.alloc.v1beta1.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
