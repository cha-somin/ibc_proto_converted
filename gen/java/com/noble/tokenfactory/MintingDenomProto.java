// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/tokenfactory/minting_denom.proto

package com.noble.tokenfactory;

public final class MintingDenomProto {
  private MintingDenomProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MintingDenomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:noble.tokenfactory.MintingDenom)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The denom.
     */
    java.lang.String getDenom();
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    com.google.protobuf.ByteString
        getDenomBytes();
  }
  /**
   * Protobuf type {@code noble.tokenfactory.MintingDenom}
   */
  public static final class MintingDenom extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:noble.tokenfactory.MintingDenom)
      MintingDenomOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MintingDenom.newBuilder() to construct.
    private MintingDenom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MintingDenom() {
      denom_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MintingDenom();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.tokenfactory.MintingDenomProto.internal_static_noble_tokenfactory_MintingDenom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.tokenfactory.MintingDenomProto.internal_static_noble_tokenfactory_MintingDenom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.tokenfactory.MintingDenomProto.MintingDenom.class, com.noble.tokenfactory.MintingDenomProto.MintingDenom.Builder.class);
    }

    public static final int DENOM_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The denom.
     */
    @java.lang.Override
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
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
      if (!(obj instanceof com.noble.tokenfactory.MintingDenomProto.MintingDenom)) {
        return super.equals(obj);
      }
      com.noble.tokenfactory.MintingDenomProto.MintingDenom other = (com.noble.tokenfactory.MintingDenomProto.MintingDenom) obj;

      if (!getDenom()
          .equals(other.getDenom())) return false;
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
      hash = (37 * hash) + DENOM_FIELD_NUMBER;
      hash = (53 * hash) + getDenom().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom parseFrom(
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
    public static Builder newBuilder(com.noble.tokenfactory.MintingDenomProto.MintingDenom prototype) {
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
     * Protobuf type {@code noble.tokenfactory.MintingDenom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:noble.tokenfactory.MintingDenom)
        com.noble.tokenfactory.MintingDenomProto.MintingDenomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.noble.tokenfactory.MintingDenomProto.internal_static_noble_tokenfactory_MintingDenom_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.noble.tokenfactory.MintingDenomProto.internal_static_noble_tokenfactory_MintingDenom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.noble.tokenfactory.MintingDenomProto.MintingDenom.class, com.noble.tokenfactory.MintingDenomProto.MintingDenom.Builder.class);
      }

      // Construct using com.noble.tokenfactory.MintingDenomProto.MintingDenom.newBuilder()
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
        denom_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.noble.tokenfactory.MintingDenomProto.internal_static_noble_tokenfactory_MintingDenom_descriptor;
      }

      @java.lang.Override
      public com.noble.tokenfactory.MintingDenomProto.MintingDenom getDefaultInstanceForType() {
        return com.noble.tokenfactory.MintingDenomProto.MintingDenom.getDefaultInstance();
      }

      @java.lang.Override
      public com.noble.tokenfactory.MintingDenomProto.MintingDenom build() {
        com.noble.tokenfactory.MintingDenomProto.MintingDenom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.noble.tokenfactory.MintingDenomProto.MintingDenom buildPartial() {
        com.noble.tokenfactory.MintingDenomProto.MintingDenom result = new com.noble.tokenfactory.MintingDenomProto.MintingDenom(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.noble.tokenfactory.MintingDenomProto.MintingDenom result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.denom_ = denom_;
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
        if (other instanceof com.noble.tokenfactory.MintingDenomProto.MintingDenom) {
          return mergeFrom((com.noble.tokenfactory.MintingDenomProto.MintingDenom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.noble.tokenfactory.MintingDenomProto.MintingDenom other) {
        if (other == com.noble.tokenfactory.MintingDenomProto.MintingDenom.getDefaultInstance()) return this;
        if (!other.getDenom().isEmpty()) {
          denom_ = other.denom_;
          bitField0_ |= 0x00000001;
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
                denom_ = input.readStringRequireUtf8();
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

      private java.lang.Object denom_ = "";
      /**
       * <code>string denom = 1 [json_name = "denom"];</code>
       * @return The denom.
       */
      public java.lang.String getDenom() {
        java.lang.Object ref = denom_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          denom_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string denom = 1 [json_name = "denom"];</code>
       * @return The bytes for denom.
       */
      public com.google.protobuf.ByteString
          getDenomBytes() {
        java.lang.Object ref = denom_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          denom_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string denom = 1 [json_name = "denom"];</code>
       * @param value The denom to set.
       * @return This builder for chaining.
       */
      public Builder setDenom(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        denom_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string denom = 1 [json_name = "denom"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDenom() {
        denom_ = getDefaultInstance().getDenom();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string denom = 1 [json_name = "denom"];</code>
       * @param value The bytes for denom to set.
       * @return This builder for chaining.
       */
      public Builder setDenomBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        denom_ = value;
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:noble.tokenfactory.MintingDenom)
    }

    // @@protoc_insertion_point(class_scope:noble.tokenfactory.MintingDenom)
    private static final com.noble.tokenfactory.MintingDenomProto.MintingDenom DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.noble.tokenfactory.MintingDenomProto.MintingDenom();
    }

    public static com.noble.tokenfactory.MintingDenomProto.MintingDenom getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MintingDenom>
        PARSER = new com.google.protobuf.AbstractParser<MintingDenom>() {
      @java.lang.Override
      public MintingDenom parsePartialFrom(
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

    public static com.google.protobuf.Parser<MintingDenom> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MintingDenom> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.noble.tokenfactory.MintingDenomProto.MintingDenom getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_noble_tokenfactory_MintingDenom_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_noble_tokenfactory_MintingDenom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&noble/tokenfactory/minting_denom.proto" +
      "\022\022noble.tokenfactory\"$\n\014MintingDenom\022\024\n\005" +
      "denom\030\001 \001(\tR\005denomB\316\001\n\026com.noble.tokenfa" +
      "ctoryB\021MintingDenomProtoZ:github.com/str" +
      "angelove-ventures/noble/x/tokenfactory/t" +
      "ypes\242\002\003NTX\252\002\022Noble.Tokenfactory\312\002\022Noble\\" +
      "Tokenfactory\342\002\036Noble\\Tokenfactory\\GPBMet" +
      "adata\352\002\023Noble::Tokenfactoryb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_noble_tokenfactory_MintingDenom_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_noble_tokenfactory_MintingDenom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_noble_tokenfactory_MintingDenom_descriptor,
        new java.lang.String[] { "Denom", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}