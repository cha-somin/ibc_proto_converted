// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/ids/base/hash_id.proto

package com.assetmantle.schema.ids.base;

public final class HashIdProto {
  private HashIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HashIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.schema.ids.base.HashID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes i_d_bytes = 1 [json_name = "iDBytes"];</code>
     * @return The iDBytes.
     */
    com.google.protobuf.ByteString getIDBytes();
  }
  /**
   * Protobuf type {@code assetmantle.schema.ids.base.HashID}
   */
  public static final class HashID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.schema.ids.base.HashID)
      HashIDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HashID.newBuilder() to construct.
    private HashID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HashID() {
      iDBytes_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HashID();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.schema.ids.base.HashIdProto.internal_static_assetmantle_schema_ids_base_HashID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.schema.ids.base.HashIdProto.internal_static_assetmantle_schema_ids_base_HashID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.schema.ids.base.HashIdProto.HashID.class, com.assetmantle.schema.ids.base.HashIdProto.HashID.Builder.class);
    }

    public static final int I_D_BYTES_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString iDBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes i_d_bytes = 1 [json_name = "iDBytes"];</code>
     * @return The iDBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getIDBytes() {
      return iDBytes_;
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
      if (!iDBytes_.isEmpty()) {
        output.writeBytes(1, iDBytes_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!iDBytes_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, iDBytes_);
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
      if (!(obj instanceof com.assetmantle.schema.ids.base.HashIdProto.HashID)) {
        return super.equals(obj);
      }
      com.assetmantle.schema.ids.base.HashIdProto.HashID other = (com.assetmantle.schema.ids.base.HashIdProto.HashID) obj;

      if (!getIDBytes()
          .equals(other.getIDBytes())) return false;
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
      hash = (37 * hash) + I_D_BYTES_FIELD_NUMBER;
      hash = (53 * hash) + getIDBytes().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.schema.ids.base.HashIdProto.HashID parseFrom(
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
    public static Builder newBuilder(com.assetmantle.schema.ids.base.HashIdProto.HashID prototype) {
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
     * Protobuf type {@code assetmantle.schema.ids.base.HashID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.schema.ids.base.HashID)
        com.assetmantle.schema.ids.base.HashIdProto.HashIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.schema.ids.base.HashIdProto.internal_static_assetmantle_schema_ids_base_HashID_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.schema.ids.base.HashIdProto.internal_static_assetmantle_schema_ids_base_HashID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.schema.ids.base.HashIdProto.HashID.class, com.assetmantle.schema.ids.base.HashIdProto.HashID.Builder.class);
      }

      // Construct using com.assetmantle.schema.ids.base.HashIdProto.HashID.newBuilder()
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
        iDBytes_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.schema.ids.base.HashIdProto.internal_static_assetmantle_schema_ids_base_HashID_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.schema.ids.base.HashIdProto.HashID getDefaultInstanceForType() {
        return com.assetmantle.schema.ids.base.HashIdProto.HashID.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.schema.ids.base.HashIdProto.HashID build() {
        com.assetmantle.schema.ids.base.HashIdProto.HashID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.schema.ids.base.HashIdProto.HashID buildPartial() {
        com.assetmantle.schema.ids.base.HashIdProto.HashID result = new com.assetmantle.schema.ids.base.HashIdProto.HashID(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.assetmantle.schema.ids.base.HashIdProto.HashID result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.iDBytes_ = iDBytes_;
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
        if (other instanceof com.assetmantle.schema.ids.base.HashIdProto.HashID) {
          return mergeFrom((com.assetmantle.schema.ids.base.HashIdProto.HashID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.schema.ids.base.HashIdProto.HashID other) {
        if (other == com.assetmantle.schema.ids.base.HashIdProto.HashID.getDefaultInstance()) return this;
        if (other.getIDBytes() != com.google.protobuf.ByteString.EMPTY) {
          setIDBytes(other.getIDBytes());
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
                iDBytes_ = input.readBytes();
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

      private com.google.protobuf.ByteString iDBytes_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes i_d_bytes = 1 [json_name = "iDBytes"];</code>
       * @return The iDBytes.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getIDBytes() {
        return iDBytes_;
      }
      /**
       * <code>bytes i_d_bytes = 1 [json_name = "iDBytes"];</code>
       * @param value The iDBytes to set.
       * @return This builder for chaining.
       */
      public Builder setIDBytes(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        iDBytes_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes i_d_bytes = 1 [json_name = "iDBytes"];</code>
       * @return This builder for chaining.
       */
      public Builder clearIDBytes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        iDBytes_ = getDefaultInstance().getIDBytes();
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


      // @@protoc_insertion_point(builder_scope:assetmantle.schema.ids.base.HashID)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.schema.ids.base.HashID)
    private static final com.assetmantle.schema.ids.base.HashIdProto.HashID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.schema.ids.base.HashIdProto.HashID();
    }

    public static com.assetmantle.schema.ids.base.HashIdProto.HashID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HashID>
        PARSER = new com.google.protobuf.AbstractParser<HashID>() {
      @java.lang.Override
      public HashID parsePartialFrom(
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

    public static com.google.protobuf.Parser<HashID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HashID> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.schema.ids.base.HashIdProto.HashID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_HashID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_HashID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"assetmantle/ids/base/hash_id.proto\022\033as" +
      "setmantle.schema.ids.base\032\024gogoproto/gog" +
      "o.proto\"*\n\006HashID\022\032\n\ti_d_bytes\030\001 \001(\014R\007iD" +
      "Bytes:\004\210\240\037\000B\274\001\n\037com.assetmantle.schema.i" +
      "ds.baseB\013HashIdProto\242\002\004ASIB\252\002\033Assetmantl" +
      "e.Schema.Ids.Base\312\002\033Assetmantle\\Schema\\I" +
      "ds\\Base\342\002\'Assetmantle\\Schema\\Ids\\Base\\GP" +
      "BMetadata\352\002\036Assetmantle::Schema::Ids::Ba" +
      "seb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_HashID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_HashID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_HashID_descriptor,
        new java.lang.String[] { "IDBytes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
