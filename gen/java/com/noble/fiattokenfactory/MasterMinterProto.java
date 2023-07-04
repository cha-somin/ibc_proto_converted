// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/fiattokenfactory/master_minter.proto

package com.noble.fiattokenfactory;

public final class MasterMinterProto {
  private MasterMinterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MasterMinterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:noble.fiattokenfactory.MasterMinter)
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
  }
  /**
   * Protobuf type {@code noble.fiattokenfactory.MasterMinter}
   */
  public static final class MasterMinter extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:noble.fiattokenfactory.MasterMinter)
      MasterMinterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MasterMinter.newBuilder() to construct.
    private MasterMinter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MasterMinter() {
      address_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MasterMinter();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.fiattokenfactory.MasterMinterProto.internal_static_noble_fiattokenfactory_MasterMinter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.fiattokenfactory.MasterMinterProto.internal_static_noble_fiattokenfactory_MasterMinter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.fiattokenfactory.MasterMinterProto.MasterMinter.class, com.noble.fiattokenfactory.MasterMinterProto.MasterMinter.Builder.class);
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
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.noble.fiattokenfactory.MasterMinterProto.MasterMinter)) {
        return super.equals(obj);
      }
      com.noble.fiattokenfactory.MasterMinterProto.MasterMinter other = (com.noble.fiattokenfactory.MasterMinterProto.MasterMinter) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter parseFrom(
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
    public static Builder newBuilder(com.noble.fiattokenfactory.MasterMinterProto.MasterMinter prototype) {
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
     * Protobuf type {@code noble.fiattokenfactory.MasterMinter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:noble.fiattokenfactory.MasterMinter)
        com.noble.fiattokenfactory.MasterMinterProto.MasterMinterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.noble.fiattokenfactory.MasterMinterProto.internal_static_noble_fiattokenfactory_MasterMinter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.noble.fiattokenfactory.MasterMinterProto.internal_static_noble_fiattokenfactory_MasterMinter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.noble.fiattokenfactory.MasterMinterProto.MasterMinter.class, com.noble.fiattokenfactory.MasterMinterProto.MasterMinter.Builder.class);
      }

      // Construct using com.noble.fiattokenfactory.MasterMinterProto.MasterMinter.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.noble.fiattokenfactory.MasterMinterProto.internal_static_noble_fiattokenfactory_MasterMinter_descriptor;
      }

      @java.lang.Override
      public com.noble.fiattokenfactory.MasterMinterProto.MasterMinter getDefaultInstanceForType() {
        return com.noble.fiattokenfactory.MasterMinterProto.MasterMinter.getDefaultInstance();
      }

      @java.lang.Override
      public com.noble.fiattokenfactory.MasterMinterProto.MasterMinter build() {
        com.noble.fiattokenfactory.MasterMinterProto.MasterMinter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.noble.fiattokenfactory.MasterMinterProto.MasterMinter buildPartial() {
        com.noble.fiattokenfactory.MasterMinterProto.MasterMinter result = new com.noble.fiattokenfactory.MasterMinterProto.MasterMinter(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.noble.fiattokenfactory.MasterMinterProto.MasterMinter result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.address_ = address_;
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
        if (other instanceof com.noble.fiattokenfactory.MasterMinterProto.MasterMinter) {
          return mergeFrom((com.noble.fiattokenfactory.MasterMinterProto.MasterMinter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.noble.fiattokenfactory.MasterMinterProto.MasterMinter other) {
        if (other == com.noble.fiattokenfactory.MasterMinterProto.MasterMinter.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
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
                address_ = input.readStringRequireUtf8();
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


      // @@protoc_insertion_point(builder_scope:noble.fiattokenfactory.MasterMinter)
    }

    // @@protoc_insertion_point(class_scope:noble.fiattokenfactory.MasterMinter)
    private static final com.noble.fiattokenfactory.MasterMinterProto.MasterMinter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.noble.fiattokenfactory.MasterMinterProto.MasterMinter();
    }

    public static com.noble.fiattokenfactory.MasterMinterProto.MasterMinter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MasterMinter>
        PARSER = new com.google.protobuf.AbstractParser<MasterMinter>() {
      @java.lang.Override
      public MasterMinter parsePartialFrom(
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

    public static com.google.protobuf.Parser<MasterMinter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MasterMinter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.MasterMinterProto.MasterMinter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_noble_fiattokenfactory_MasterMinter_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_noble_fiattokenfactory_MasterMinter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*noble/fiattokenfactory/master_minter.p" +
      "roto\022\026noble.fiattokenfactory\"(\n\014MasterMi" +
      "nter\022\030\n\007address\030\001 \001(\tR\007addressB\346\001\n\032com.n" +
      "oble.fiattokenfactoryB\021MasterMinterProto" +
      "Z>github.com/strangelove-ventures/noble/" +
      "x/fiattokenfactory/types\242\002\003NFX\252\002\026Noble.F" +
      "iattokenfactory\312\002\026Noble\\Fiattokenfactory" +
      "\342\002\"Noble\\Fiattokenfactory\\GPBMetadata\352\002\027" +
      "Noble::Fiattokenfactoryb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_noble_fiattokenfactory_MasterMinter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_noble_fiattokenfactory_MasterMinter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_noble_fiattokenfactory_MasterMinter_descriptor,
        new java.lang.String[] { "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}