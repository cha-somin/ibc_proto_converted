// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/prize_batch.proto

package com.lum.network.millions;

public final class PrizeBatchProto {
  private PrizeBatchProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PrizeBatchOrBuilder extends
      // @@protoc_insertion_point(interface_extends:lum.network.millions.PrizeBatch)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 pool_percent = 1 [json_name = "poolPercent"];</code>
     * @return The poolPercent.
     */
    long getPoolPercent();

    /**
     * <code>uint64 quantity = 2 [json_name = "quantity"];</code>
     * @return The quantity.
     */
    long getQuantity();

    /**
     * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The drawProbability.
     */
    java.lang.String getDrawProbability();
    /**
     * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for drawProbability.
     */
    com.google.protobuf.ByteString
        getDrawProbabilityBytes();
  }
  /**
   * Protobuf type {@code lum.network.millions.PrizeBatch}
   */
  public static final class PrizeBatch extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:lum.network.millions.PrizeBatch)
      PrizeBatchOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PrizeBatch.newBuilder() to construct.
    private PrizeBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PrizeBatch() {
      drawProbability_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PrizeBatch();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.millions.PrizeBatchProto.internal_static_lum_network_millions_PrizeBatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.millions.PrizeBatchProto.internal_static_lum_network_millions_PrizeBatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.millions.PrizeBatchProto.PrizeBatch.class, com.lum.network.millions.PrizeBatchProto.PrizeBatch.Builder.class);
    }

    public static final int POOL_PERCENT_FIELD_NUMBER = 1;
    private long poolPercent_ = 0L;
    /**
     * <code>uint64 pool_percent = 1 [json_name = "poolPercent"];</code>
     * @return The poolPercent.
     */
    @java.lang.Override
    public long getPoolPercent() {
      return poolPercent_;
    }

    public static final int QUANTITY_FIELD_NUMBER = 2;
    private long quantity_ = 0L;
    /**
     * <code>uint64 quantity = 2 [json_name = "quantity"];</code>
     * @return The quantity.
     */
    @java.lang.Override
    public long getQuantity() {
      return quantity_;
    }

    public static final int DRAW_PROBABILITY_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object drawProbability_ = "";
    /**
     * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The drawProbability.
     */
    @java.lang.Override
    public java.lang.String getDrawProbability() {
      java.lang.Object ref = drawProbability_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        drawProbability_ = s;
        return s;
      }
    }
    /**
     * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     * @return The bytes for drawProbability.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDrawProbabilityBytes() {
      java.lang.Object ref = drawProbability_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        drawProbability_ = b;
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
      if (poolPercent_ != 0L) {
        output.writeUInt64(1, poolPercent_);
      }
      if (quantity_ != 0L) {
        output.writeUInt64(2, quantity_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(drawProbability_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, drawProbability_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (poolPercent_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, poolPercent_);
      }
      if (quantity_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, quantity_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(drawProbability_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, drawProbability_);
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
      if (!(obj instanceof com.lum.network.millions.PrizeBatchProto.PrizeBatch)) {
        return super.equals(obj);
      }
      com.lum.network.millions.PrizeBatchProto.PrizeBatch other = (com.lum.network.millions.PrizeBatchProto.PrizeBatch) obj;

      if (getPoolPercent()
          != other.getPoolPercent()) return false;
      if (getQuantity()
          != other.getQuantity()) return false;
      if (!getDrawProbability()
          .equals(other.getDrawProbability())) return false;
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
      hash = (37 * hash) + POOL_PERCENT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPoolPercent());
      hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getQuantity());
      hash = (37 * hash) + DRAW_PROBABILITY_FIELD_NUMBER;
      hash = (53 * hash) + getDrawProbability().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch parseFrom(
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
    public static Builder newBuilder(com.lum.network.millions.PrizeBatchProto.PrizeBatch prototype) {
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
     * Protobuf type {@code lum.network.millions.PrizeBatch}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:lum.network.millions.PrizeBatch)
        com.lum.network.millions.PrizeBatchProto.PrizeBatchOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lum.network.millions.PrizeBatchProto.internal_static_lum_network_millions_PrizeBatch_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lum.network.millions.PrizeBatchProto.internal_static_lum_network_millions_PrizeBatch_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lum.network.millions.PrizeBatchProto.PrizeBatch.class, com.lum.network.millions.PrizeBatchProto.PrizeBatch.Builder.class);
      }

      // Construct using com.lum.network.millions.PrizeBatchProto.PrizeBatch.newBuilder()
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
        poolPercent_ = 0L;
        quantity_ = 0L;
        drawProbability_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lum.network.millions.PrizeBatchProto.internal_static_lum_network_millions_PrizeBatch_descriptor;
      }

      @java.lang.Override
      public com.lum.network.millions.PrizeBatchProto.PrizeBatch getDefaultInstanceForType() {
        return com.lum.network.millions.PrizeBatchProto.PrizeBatch.getDefaultInstance();
      }

      @java.lang.Override
      public com.lum.network.millions.PrizeBatchProto.PrizeBatch build() {
        com.lum.network.millions.PrizeBatchProto.PrizeBatch result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.lum.network.millions.PrizeBatchProto.PrizeBatch buildPartial() {
        com.lum.network.millions.PrizeBatchProto.PrizeBatch result = new com.lum.network.millions.PrizeBatchProto.PrizeBatch(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.lum.network.millions.PrizeBatchProto.PrizeBatch result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.poolPercent_ = poolPercent_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.quantity_ = quantity_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.drawProbability_ = drawProbability_;
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
        if (other instanceof com.lum.network.millions.PrizeBatchProto.PrizeBatch) {
          return mergeFrom((com.lum.network.millions.PrizeBatchProto.PrizeBatch)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lum.network.millions.PrizeBatchProto.PrizeBatch other) {
        if (other == com.lum.network.millions.PrizeBatchProto.PrizeBatch.getDefaultInstance()) return this;
        if (other.getPoolPercent() != 0L) {
          setPoolPercent(other.getPoolPercent());
        }
        if (other.getQuantity() != 0L) {
          setQuantity(other.getQuantity());
        }
        if (!other.getDrawProbability().isEmpty()) {
          drawProbability_ = other.drawProbability_;
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
              case 8: {
                poolPercent_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                quantity_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                drawProbability_ = input.readStringRequireUtf8();
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

      private long poolPercent_ ;
      /**
       * <code>uint64 pool_percent = 1 [json_name = "poolPercent"];</code>
       * @return The poolPercent.
       */
      @java.lang.Override
      public long getPoolPercent() {
        return poolPercent_;
      }
      /**
       * <code>uint64 pool_percent = 1 [json_name = "poolPercent"];</code>
       * @param value The poolPercent to set.
       * @return This builder for chaining.
       */
      public Builder setPoolPercent(long value) {

        poolPercent_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 pool_percent = 1 [json_name = "poolPercent"];</code>
       * @return This builder for chaining.
       */
      public Builder clearPoolPercent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        poolPercent_ = 0L;
        onChanged();
        return this;
      }

      private long quantity_ ;
      /**
       * <code>uint64 quantity = 2 [json_name = "quantity"];</code>
       * @return The quantity.
       */
      @java.lang.Override
      public long getQuantity() {
        return quantity_;
      }
      /**
       * <code>uint64 quantity = 2 [json_name = "quantity"];</code>
       * @param value The quantity to set.
       * @return This builder for chaining.
       */
      public Builder setQuantity(long value) {

        quantity_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 quantity = 2 [json_name = "quantity"];</code>
       * @return This builder for chaining.
       */
      public Builder clearQuantity() {
        bitField0_ = (bitField0_ & ~0x00000002);
        quantity_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object drawProbability_ = "";
      /**
       * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return The drawProbability.
       */
      public java.lang.String getDrawProbability() {
        java.lang.Object ref = drawProbability_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          drawProbability_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return The bytes for drawProbability.
       */
      public com.google.protobuf.ByteString
          getDrawProbabilityBytes() {
        java.lang.Object ref = drawProbability_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          drawProbability_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @param value The drawProbability to set.
       * @return This builder for chaining.
       */
      public Builder setDrawProbability(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        drawProbability_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDrawProbability() {
        drawProbability_ = getDefaultInstance().getDrawProbability();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string draw_probability = 3 [json_name = "drawProbability", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
       * @param value The bytes for drawProbability to set.
       * @return This builder for chaining.
       */
      public Builder setDrawProbabilityBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        drawProbability_ = value;
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


      // @@protoc_insertion_point(builder_scope:lum.network.millions.PrizeBatch)
    }

    // @@protoc_insertion_point(class_scope:lum.network.millions.PrizeBatch)
    private static final com.lum.network.millions.PrizeBatchProto.PrizeBatch DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.lum.network.millions.PrizeBatchProto.PrizeBatch();
    }

    public static com.lum.network.millions.PrizeBatchProto.PrizeBatch getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PrizeBatch>
        PARSER = new com.google.protobuf.AbstractParser<PrizeBatch>() {
      @java.lang.Override
      public PrizeBatch parsePartialFrom(
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

    public static com.google.protobuf.Parser<PrizeBatch> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PrizeBatch> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.lum.network.millions.PrizeBatchProto.PrizeBatch getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lum_network_millions_PrizeBatch_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lum_network_millions_PrizeBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&lum-network/millions/prize_batch.proto" +
      "\022\024lum.network.millions\032\024gogoproto/gogo.p" +
      "roto\"\246\001\n\nPrizeBatch\022!\n\014pool_percent\030\001 \001(" +
      "\004R\013poolPercent\022\032\n\010quantity\030\002 \001(\004R\010quanti" +
      "ty\022Y\n\020draw_probability\030\003 \001(\tB.\310\336\037\000\332\336\037&gi" +
      "thub.com/cosmos/cosmos-sdk/types.DecR\017dr" +
      "awProbabilityB\312\001\n\030com.lum.network.millio" +
      "nsB\017PrizeBatchProtoZ-github.com/lum-netw" +
      "ork/chain/x/millions/types\242\002\003LNM\252\002\024Lum.N" +
      "etwork.Millions\312\002\024Lum\\Network\\Millions\342\002" +
      " Lum\\Network\\Millions\\GPBMetadata\352\002\026Lum:" +
      ":Network::Millionsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_lum_network_millions_PrizeBatch_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lum_network_millions_PrizeBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lum_network_millions_PrizeBatch_descriptor,
        new java.lang.String[] { "PoolPercent", "Quantity", "DrawProbability", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}