// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/ed25519/keys.proto

package com.cosmos.crypto.ed25519;

public final class KeysProto {
  private KeysProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PubKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.crypto.ed25519.PubKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
     * @return The key.
     */
    com.google.protobuf.ByteString getKey();
  }
  /**
   * <pre>
   * PubKey is an ed25519 public key for handling Tendermint keys in SDK.
   * It's needed for Any serialization and SDK compatibility.
   * It must not be used in a non Tendermint key context because it doesn't implement
   * ADR-28. Nevertheless, you will like to use ed25519 in app user level
   * then you must create a new proto message and follow ADR-28 for Address construction.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.ed25519.PubKey}
   */
  public static final class PubKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.crypto.ed25519.PubKey)
      PubKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PubKey.newBuilder() to construct.
    private PubKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PubKey() {
      key_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PubKey();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.crypto.ed25519.KeysProto.PubKey.class, com.cosmos.crypto.ed25519.KeysProto.PubKey.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
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
      if (!key_.isEmpty()) {
        output.writeBytes(1, key_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!key_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, key_);
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
      if (!(obj instanceof com.cosmos.crypto.ed25519.KeysProto.PubKey)) {
        return super.equals(obj);
      }
      com.cosmos.crypto.ed25519.KeysProto.PubKey other = (com.cosmos.crypto.ed25519.KeysProto.PubKey) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PubKey parseFrom(
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
    public static Builder newBuilder(com.cosmos.crypto.ed25519.KeysProto.PubKey prototype) {
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
     * PubKey is an ed25519 public key for handling Tendermint keys in SDK.
     * It's needed for Any serialization and SDK compatibility.
     * It must not be used in a non Tendermint key context because it doesn't implement
     * ADR-28. Nevertheless, you will like to use ed25519 in app user level
     * then you must create a new proto message and follow ADR-28 for Address construction.
     * </pre>
     *
     * Protobuf type {@code cosmos.crypto.ed25519.PubKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.crypto.ed25519.PubKey)
        com.cosmos.crypto.ed25519.KeysProto.PubKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cosmos.crypto.ed25519.KeysProto.PubKey.class, com.cosmos.crypto.ed25519.KeysProto.PubKey.Builder.class);
      }

      // Construct using com.cosmos.crypto.ed25519.KeysProto.PubKey.newBuilder()
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
        key_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
      }

      @java.lang.Override
      public com.cosmos.crypto.ed25519.KeysProto.PubKey getDefaultInstanceForType() {
        return com.cosmos.crypto.ed25519.KeysProto.PubKey.getDefaultInstance();
      }

      @java.lang.Override
      public com.cosmos.crypto.ed25519.KeysProto.PubKey build() {
        com.cosmos.crypto.ed25519.KeysProto.PubKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cosmos.crypto.ed25519.KeysProto.PubKey buildPartial() {
        com.cosmos.crypto.ed25519.KeysProto.PubKey result = new com.cosmos.crypto.ed25519.KeysProto.PubKey(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.cosmos.crypto.ed25519.KeysProto.PubKey result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.key_ = key_;
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
        if (other instanceof com.cosmos.crypto.ed25519.KeysProto.PubKey) {
          return mergeFrom((com.cosmos.crypto.ed25519.KeysProto.PubKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cosmos.crypto.ed25519.KeysProto.PubKey other) {
        if (other == com.cosmos.crypto.ed25519.KeysProto.PubKey.getDefaultInstance()) return this;
        if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
          setKey(other.getKey());
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
                key_ = input.readBytes();
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

      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
       * @return The key.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getKey() {
        return key_;
      }
      /**
       * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        key_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
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


      // @@protoc_insertion_point(builder_scope:cosmos.crypto.ed25519.PubKey)
    }

    // @@protoc_insertion_point(class_scope:cosmos.crypto.ed25519.PubKey)
    private static final com.cosmos.crypto.ed25519.KeysProto.PubKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cosmos.crypto.ed25519.KeysProto.PubKey();
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PubKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PubKey>
        PARSER = new com.google.protobuf.AbstractParser<PubKey>() {
      @java.lang.Override
      public PubKey parsePartialFrom(
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

    public static com.google.protobuf.Parser<PubKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PubKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cosmos.crypto.ed25519.KeysProto.PubKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface PrivKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.crypto.ed25519.PrivKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
     * @return The key.
     */
    com.google.protobuf.ByteString getKey();
  }
  /**
   * <pre>
   * PrivKey defines a ed25519 private key.
   * NOTE: ed25519 keys must not be used in SDK apps except in a tendermint validator context.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.ed25519.PrivKey}
   */
  public static final class PrivKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.crypto.ed25519.PrivKey)
      PrivKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PrivKey.newBuilder() to construct.
    private PrivKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PrivKey() {
      key_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PrivKey();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.crypto.ed25519.KeysProto.PrivKey.class, com.cosmos.crypto.ed25519.KeysProto.PrivKey.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
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
      if (!key_.isEmpty()) {
        output.writeBytes(1, key_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!key_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, key_);
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
      if (!(obj instanceof com.cosmos.crypto.ed25519.KeysProto.PrivKey)) {
        return super.equals(obj);
      }
      com.cosmos.crypto.ed25519.KeysProto.PrivKey other = (com.cosmos.crypto.ed25519.KeysProto.PrivKey) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey parseFrom(
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
    public static Builder newBuilder(com.cosmos.crypto.ed25519.KeysProto.PrivKey prototype) {
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
     * PrivKey defines a ed25519 private key.
     * NOTE: ed25519 keys must not be used in SDK apps except in a tendermint validator context.
     * </pre>
     *
     * Protobuf type {@code cosmos.crypto.ed25519.PrivKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.crypto.ed25519.PrivKey)
        com.cosmos.crypto.ed25519.KeysProto.PrivKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cosmos.crypto.ed25519.KeysProto.PrivKey.class, com.cosmos.crypto.ed25519.KeysProto.PrivKey.Builder.class);
      }

      // Construct using com.cosmos.crypto.ed25519.KeysProto.PrivKey.newBuilder()
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
        key_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cosmos.crypto.ed25519.KeysProto.internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
      }

      @java.lang.Override
      public com.cosmos.crypto.ed25519.KeysProto.PrivKey getDefaultInstanceForType() {
        return com.cosmos.crypto.ed25519.KeysProto.PrivKey.getDefaultInstance();
      }

      @java.lang.Override
      public com.cosmos.crypto.ed25519.KeysProto.PrivKey build() {
        com.cosmos.crypto.ed25519.KeysProto.PrivKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.cosmos.crypto.ed25519.KeysProto.PrivKey buildPartial() {
        com.cosmos.crypto.ed25519.KeysProto.PrivKey result = new com.cosmos.crypto.ed25519.KeysProto.PrivKey(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.cosmos.crypto.ed25519.KeysProto.PrivKey result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.key_ = key_;
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
        if (other instanceof com.cosmos.crypto.ed25519.KeysProto.PrivKey) {
          return mergeFrom((com.cosmos.crypto.ed25519.KeysProto.PrivKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cosmos.crypto.ed25519.KeysProto.PrivKey other) {
        if (other == com.cosmos.crypto.ed25519.KeysProto.PrivKey.getDefaultInstance()) return this;
        if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
          setKey(other.getKey());
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
                key_ = input.readBytes();
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

      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
       * @return The key.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getKey() {
        return key_;
      }
      /**
       * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        key_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes key = 1 [json_name = "key", (.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
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


      // @@protoc_insertion_point(builder_scope:cosmos.crypto.ed25519.PrivKey)
    }

    // @@protoc_insertion_point(class_scope:cosmos.crypto.ed25519.PrivKey)
    private static final com.cosmos.crypto.ed25519.KeysProto.PrivKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cosmos.crypto.ed25519.KeysProto.PrivKey();
    }

    public static com.cosmos.crypto.ed25519.KeysProto.PrivKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PrivKey>
        PARSER = new com.google.protobuf.AbstractParser<PrivKey>() {
      @java.lang.Override
      public PrivKey parsePartialFrom(
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

    public static com.google.protobuf.Parser<PrivKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PrivKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.cosmos.crypto.ed25519.KeysProto.PrivKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/crypto/ed25519/keys.proto\022\025cosm" +
      "os.crypto.ed25519\032\021amino/amino.proto\032\024go" +
      "goproto/gogo.proto\"i\n\006PubKey\022.\n\003key\030\001 \001(" +
      "\014B\034\372\336\037\030crypto/ed25519.PublicKeyR\003key:/\230\240" +
      "\037\000\212\347\260*\030tendermint/PubKeyEd25519\222\347\260*\tkey_" +
      "field\"h\n\007PrivKey\022/\n\003key\030\001 \001(\014B\035\372\336\037\031crypt" +
      "o/ed25519.PrivateKeyR\003key:,\212\347\260*\031tendermi" +
      "nt/PrivKeyEd25519\222\347\260*\tkey_fieldB\314\001\n\031com." +
      "cosmos.crypto.ed25519B\tKeysProtoZ0github" +
      ".com/cosmos/cosmos-sdk/crypto/keys/ed255" +
      "19\242\002\003CCE\252\002\025Cosmos.Crypto.Ed25519\312\002\025Cosmo" +
      "s\\Crypto\\Ed25519\342\002!Cosmos\\Crypto\\Ed25519" +
      "\\GPBMetadata\352\002\027Cosmos::Crypto::Ed25519b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.amino.AminoProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cosmos_crypto_ed25519_PubKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_ed25519_PubKey_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_cosmos_crypto_ed25519_PrivKey_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_ed25519_PrivKey_descriptor,
        new java.lang.String[] { "Key", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.messageEncoding);
    registry.add(com.amino.AminoProto.name);
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.amino.AminoProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
