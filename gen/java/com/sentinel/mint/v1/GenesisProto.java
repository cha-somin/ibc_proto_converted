// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/mint/v1/genesis.proto

package com.sentinel.mint.v1;

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
      // @@protoc_insertion_point(interface_extends:sentinel.mint.v1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    java.util.List<com.sentinel.mint.v1.InflationProto.Inflation> 
        getInflationsList();
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    com.sentinel.mint.v1.InflationProto.Inflation getInflations(int index);
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    int getInflationsCount();
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    java.util.List<? extends com.sentinel.mint.v1.InflationProto.InflationOrBuilder> 
        getInflationsOrBuilderList();
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    com.sentinel.mint.v1.InflationProto.InflationOrBuilder getInflationsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code sentinel.mint.v1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.mint.v1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      inflations_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.mint.v1.GenesisProto.GenesisState.class, com.sentinel.mint.v1.GenesisProto.GenesisState.Builder.class);
    }

    public static final int INFLATIONS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<com.sentinel.mint.v1.InflationProto.Inflation> inflations_;
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<com.sentinel.mint.v1.InflationProto.Inflation> getInflationsList() {
      return inflations_;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.sentinel.mint.v1.InflationProto.InflationOrBuilder> 
        getInflationsOrBuilderList() {
      return inflations_;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    @java.lang.Override
    public int getInflationsCount() {
      return inflations_.size();
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    @java.lang.Override
    public com.sentinel.mint.v1.InflationProto.Inflation getInflations(int index) {
      return inflations_.get(index);
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    @java.lang.Override
    public com.sentinel.mint.v1.InflationProto.InflationOrBuilder getInflationsOrBuilder(
        int index) {
      return inflations_.get(index);
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
      for (int i = 0; i < inflations_.size(); i++) {
        output.writeMessage(1, inflations_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < inflations_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, inflations_.get(i));
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
      if (!(obj instanceof com.sentinel.mint.v1.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.sentinel.mint.v1.GenesisProto.GenesisState other = (com.sentinel.mint.v1.GenesisProto.GenesisState) obj;

      if (!getInflationsList()
          .equals(other.getInflationsList())) return false;
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
      if (getInflationsCount() > 0) {
        hash = (37 * hash) + INFLATIONS_FIELD_NUMBER;
        hash = (53 * hash) + getInflationsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.sentinel.mint.v1.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.sentinel.mint.v1.GenesisProto.GenesisState prototype) {
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
     * Protobuf type {@code sentinel.mint.v1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.mint.v1.GenesisState)
        com.sentinel.mint.v1.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.sentinel.mint.v1.GenesisProto.GenesisState.class, com.sentinel.mint.v1.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.sentinel.mint.v1.GenesisProto.GenesisState.newBuilder()
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
        if (inflationsBuilder_ == null) {
          inflations_ = java.util.Collections.emptyList();
        } else {
          inflations_ = null;
          inflationsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.sentinel.mint.v1.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.sentinel.mint.v1.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.sentinel.mint.v1.GenesisProto.GenesisState build() {
        com.sentinel.mint.v1.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.sentinel.mint.v1.GenesisProto.GenesisState buildPartial() {
        com.sentinel.mint.v1.GenesisProto.GenesisState result = new com.sentinel.mint.v1.GenesisProto.GenesisState(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.sentinel.mint.v1.GenesisProto.GenesisState result) {
        if (inflationsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            inflations_ = java.util.Collections.unmodifiableList(inflations_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.inflations_ = inflations_;
        } else {
          result.inflations_ = inflationsBuilder_.build();
        }
      }

      private void buildPartial0(com.sentinel.mint.v1.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof com.sentinel.mint.v1.GenesisProto.GenesisState) {
          return mergeFrom((com.sentinel.mint.v1.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.sentinel.mint.v1.GenesisProto.GenesisState other) {
        if (other == com.sentinel.mint.v1.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (inflationsBuilder_ == null) {
          if (!other.inflations_.isEmpty()) {
            if (inflations_.isEmpty()) {
              inflations_ = other.inflations_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInflationsIsMutable();
              inflations_.addAll(other.inflations_);
            }
            onChanged();
          }
        } else {
          if (!other.inflations_.isEmpty()) {
            if (inflationsBuilder_.isEmpty()) {
              inflationsBuilder_.dispose();
              inflationsBuilder_ = null;
              inflations_ = other.inflations_;
              bitField0_ = (bitField0_ & ~0x00000001);
              inflationsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInflationsFieldBuilder() : null;
            } else {
              inflationsBuilder_.addAllMessages(other.inflations_);
            }
          }
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
                com.sentinel.mint.v1.InflationProto.Inflation m =
                    input.readMessage(
                        com.sentinel.mint.v1.InflationProto.Inflation.parser(),
                        extensionRegistry);
                if (inflationsBuilder_ == null) {
                  ensureInflationsIsMutable();
                  inflations_.add(m);
                } else {
                  inflationsBuilder_.addMessage(m);
                }
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

      private java.util.List<com.sentinel.mint.v1.InflationProto.Inflation> inflations_ =
        java.util.Collections.emptyList();
      private void ensureInflationsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          inflations_ = new java.util.ArrayList<com.sentinel.mint.v1.InflationProto.Inflation>(inflations_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.sentinel.mint.v1.InflationProto.Inflation, com.sentinel.mint.v1.InflationProto.Inflation.Builder, com.sentinel.mint.v1.InflationProto.InflationOrBuilder> inflationsBuilder_;

      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public java.util.List<com.sentinel.mint.v1.InflationProto.Inflation> getInflationsList() {
        if (inflationsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(inflations_);
        } else {
          return inflationsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public int getInflationsCount() {
        if (inflationsBuilder_ == null) {
          return inflations_.size();
        } else {
          return inflationsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public com.sentinel.mint.v1.InflationProto.Inflation getInflations(int index) {
        if (inflationsBuilder_ == null) {
          return inflations_.get(index);
        } else {
          return inflationsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder setInflations(
          int index, com.sentinel.mint.v1.InflationProto.Inflation value) {
        if (inflationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInflationsIsMutable();
          inflations_.set(index, value);
          onChanged();
        } else {
          inflationsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder setInflations(
          int index, com.sentinel.mint.v1.InflationProto.Inflation.Builder builderForValue) {
        if (inflationsBuilder_ == null) {
          ensureInflationsIsMutable();
          inflations_.set(index, builderForValue.build());
          onChanged();
        } else {
          inflationsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder addInflations(com.sentinel.mint.v1.InflationProto.Inflation value) {
        if (inflationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInflationsIsMutable();
          inflations_.add(value);
          onChanged();
        } else {
          inflationsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder addInflations(
          int index, com.sentinel.mint.v1.InflationProto.Inflation value) {
        if (inflationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInflationsIsMutable();
          inflations_.add(index, value);
          onChanged();
        } else {
          inflationsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder addInflations(
          com.sentinel.mint.v1.InflationProto.Inflation.Builder builderForValue) {
        if (inflationsBuilder_ == null) {
          ensureInflationsIsMutable();
          inflations_.add(builderForValue.build());
          onChanged();
        } else {
          inflationsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder addInflations(
          int index, com.sentinel.mint.v1.InflationProto.Inflation.Builder builderForValue) {
        if (inflationsBuilder_ == null) {
          ensureInflationsIsMutable();
          inflations_.add(index, builderForValue.build());
          onChanged();
        } else {
          inflationsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder addAllInflations(
          java.lang.Iterable<? extends com.sentinel.mint.v1.InflationProto.Inflation> values) {
        if (inflationsBuilder_ == null) {
          ensureInflationsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, inflations_);
          onChanged();
        } else {
          inflationsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder clearInflations() {
        if (inflationsBuilder_ == null) {
          inflations_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          inflationsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public Builder removeInflations(int index) {
        if (inflationsBuilder_ == null) {
          ensureInflationsIsMutable();
          inflations_.remove(index);
          onChanged();
        } else {
          inflationsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public com.sentinel.mint.v1.InflationProto.Inflation.Builder getInflationsBuilder(
          int index) {
        return getInflationsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public com.sentinel.mint.v1.InflationProto.InflationOrBuilder getInflationsOrBuilder(
          int index) {
        if (inflationsBuilder_ == null) {
          return inflations_.get(index);  } else {
          return inflationsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public java.util.List<? extends com.sentinel.mint.v1.InflationProto.InflationOrBuilder> 
           getInflationsOrBuilderList() {
        if (inflationsBuilder_ != null) {
          return inflationsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(inflations_);
        }
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public com.sentinel.mint.v1.InflationProto.Inflation.Builder addInflationsBuilder() {
        return getInflationsFieldBuilder().addBuilder(
            com.sentinel.mint.v1.InflationProto.Inflation.getDefaultInstance());
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public com.sentinel.mint.v1.InflationProto.Inflation.Builder addInflationsBuilder(
          int index) {
        return getInflationsFieldBuilder().addBuilder(
            index, com.sentinel.mint.v1.InflationProto.Inflation.getDefaultInstance());
      }
      /**
       * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
       */
      public java.util.List<com.sentinel.mint.v1.InflationProto.Inflation.Builder> 
           getInflationsBuilderList() {
        return getInflationsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.sentinel.mint.v1.InflationProto.Inflation, com.sentinel.mint.v1.InflationProto.Inflation.Builder, com.sentinel.mint.v1.InflationProto.InflationOrBuilder> 
          getInflationsFieldBuilder() {
        if (inflationsBuilder_ == null) {
          inflationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.sentinel.mint.v1.InflationProto.Inflation, com.sentinel.mint.v1.InflationProto.Inflation.Builder, com.sentinel.mint.v1.InflationProto.InflationOrBuilder>(
                  inflations_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          inflations_ = null;
        }
        return inflationsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:sentinel.mint.v1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:sentinel.mint.v1.GenesisState)
    private static final com.sentinel.mint.v1.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.sentinel.mint.v1.GenesisProto.GenesisState();
    }

    public static com.sentinel.mint.v1.GenesisProto.GenesisState getDefaultInstance() {
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
    public com.sentinel.mint.v1.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_mint_v1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_mint_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036sentinel/mint/v1/genesis.proto\022\020sentin" +
      "el.mint.v1\032\024gogoproto/gogo.proto\032 sentin" +
      "el/mint/v1/inflation.proto\"f\n\014GenesisSta" +
      "te\022V\n\ninflations\030\001 \003(\0132\033.sentinel.mint.v" +
      "1.InflationB\031\310\336\037\000\362\336\037\021yaml:\"inflations\"R\n" +
      "inflationsB\273\001\n\024com.sentinel.mint.v1B\014Gen" +
      "esisProtoZ-github.com/sentinel-official/" +
      "hub/x/mint/types\242\002\003SMX\252\002\020Sentinel.Mint.V" +
      "1\312\002\020Sentinel\\Mint\\V1\342\002\034Sentinel\\Mint\\V1\\" +
      "GPBMetadata\352\002\022Sentinel::Mint::V1\310\341\036\000\250\342\036\000" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.sentinel.mint.v1.InflationProto.getDescriptor(),
        });
    internal_static_sentinel_mint_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_mint_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_mint_v1_GenesisState_descriptor,
        new java.lang.String[] { "Inflations", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.sentinel.mint.v1.InflationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
