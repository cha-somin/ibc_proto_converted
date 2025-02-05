// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zrchain/policy/sign_method_passkey.proto

package com.zrchain.policy;

public final class SignMethodPasskeyProto {
  private SignMethodPasskeyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SignMethodPasskeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:zrchain.policy.SignMethodPasskey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes raw_id = 1 [json_name = "rawId"];</code>
     * @return The rawId.
     */
    com.google.protobuf.ByteString getRawId();

    /**
     * <code>bytes attestation_object = 2 [json_name = "attestationObject"];</code>
     * @return The attestationObject.
     */
    com.google.protobuf.ByteString getAttestationObject();

    /**
     * <code>bytes client_data_json = 3 [json_name = "clientDataJson"];</code>
     * @return The clientDataJson.
     */
    com.google.protobuf.ByteString getClientDataJson();

    /**
     * <code>bool active = 4 [json_name = "active"];</code>
     * @return The active.
     */
    boolean getActive();
  }
  /**
   * <pre>
   * SignMethodPasskey defines a structure containing passkey related data
   * </pre>
   *
   * Protobuf type {@code zrchain.policy.SignMethodPasskey}
   */
  public static final class SignMethodPasskey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:zrchain.policy.SignMethodPasskey)
      SignMethodPasskeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SignMethodPasskey.newBuilder() to construct.
    private SignMethodPasskey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SignMethodPasskey() {
      rawId_ = com.google.protobuf.ByteString.EMPTY;
      attestationObject_ = com.google.protobuf.ByteString.EMPTY;
      clientDataJson_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SignMethodPasskey();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zrchain.policy.SignMethodPasskeyProto.internal_static_zrchain_policy_SignMethodPasskey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zrchain.policy.SignMethodPasskeyProto.internal_static_zrchain_policy_SignMethodPasskey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey.class, com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey.Builder.class);
    }

    public static final int RAW_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString rawId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes raw_id = 1 [json_name = "rawId"];</code>
     * @return The rawId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRawId() {
      return rawId_;
    }

    public static final int ATTESTATION_OBJECT_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString attestationObject_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes attestation_object = 2 [json_name = "attestationObject"];</code>
     * @return The attestationObject.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAttestationObject() {
      return attestationObject_;
    }

    public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString clientDataJson_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes client_data_json = 3 [json_name = "clientDataJson"];</code>
     * @return The clientDataJson.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getClientDataJson() {
      return clientDataJson_;
    }

    public static final int ACTIVE_FIELD_NUMBER = 4;
    private boolean active_ = false;
    /**
     * <code>bool active = 4 [json_name = "active"];</code>
     * @return The active.
     */
    @java.lang.Override
    public boolean getActive() {
      return active_;
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
      if (!rawId_.isEmpty()) {
        output.writeBytes(1, rawId_);
      }
      if (!attestationObject_.isEmpty()) {
        output.writeBytes(2, attestationObject_);
      }
      if (!clientDataJson_.isEmpty()) {
        output.writeBytes(3, clientDataJson_);
      }
      if (active_ != false) {
        output.writeBool(4, active_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!rawId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, rawId_);
      }
      if (!attestationObject_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, attestationObject_);
      }
      if (!clientDataJson_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, clientDataJson_);
      }
      if (active_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, active_);
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
      if (!(obj instanceof com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey)) {
        return super.equals(obj);
      }
      com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey other = (com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey) obj;

      if (!getRawId()
          .equals(other.getRawId())) return false;
      if (!getAttestationObject()
          .equals(other.getAttestationObject())) return false;
      if (!getClientDataJson()
          .equals(other.getClientDataJson())) return false;
      if (getActive()
          != other.getActive()) return false;
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
      hash = (37 * hash) + RAW_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRawId().hashCode();
      hash = (37 * hash) + ATTESTATION_OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getAttestationObject().hashCode();
      hash = (37 * hash) + CLIENT_DATA_JSON_FIELD_NUMBER;
      hash = (53 * hash) + getClientDataJson().hashCode();
      hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getActive());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey parseFrom(
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
    public static Builder newBuilder(com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey prototype) {
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
     * SignMethodPasskey defines a structure containing passkey related data
     * </pre>
     *
     * Protobuf type {@code zrchain.policy.SignMethodPasskey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:zrchain.policy.SignMethodPasskey)
        com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zrchain.policy.SignMethodPasskeyProto.internal_static_zrchain_policy_SignMethodPasskey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zrchain.policy.SignMethodPasskeyProto.internal_static_zrchain_policy_SignMethodPasskey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey.class, com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey.Builder.class);
      }

      // Construct using com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey.newBuilder()
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
        rawId_ = com.google.protobuf.ByteString.EMPTY;
        attestationObject_ = com.google.protobuf.ByteString.EMPTY;
        clientDataJson_ = com.google.protobuf.ByteString.EMPTY;
        active_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zrchain.policy.SignMethodPasskeyProto.internal_static_zrchain_policy_SignMethodPasskey_descriptor;
      }

      @java.lang.Override
      public com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey getDefaultInstanceForType() {
        return com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey.getDefaultInstance();
      }

      @java.lang.Override
      public com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey build() {
        com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey buildPartial() {
        com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey result = new com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.rawId_ = rawId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.attestationObject_ = attestationObject_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.clientDataJson_ = clientDataJson_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.active_ = active_;
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
        if (other instanceof com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey) {
          return mergeFrom((com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey other) {
        if (other == com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey.getDefaultInstance()) return this;
        if (other.getRawId() != com.google.protobuf.ByteString.EMPTY) {
          setRawId(other.getRawId());
        }
        if (other.getAttestationObject() != com.google.protobuf.ByteString.EMPTY) {
          setAttestationObject(other.getAttestationObject());
        }
        if (other.getClientDataJson() != com.google.protobuf.ByteString.EMPTY) {
          setClientDataJson(other.getClientDataJson());
        }
        if (other.getActive() != false) {
          setActive(other.getActive());
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
                rawId_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                attestationObject_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                clientDataJson_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                active_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private com.google.protobuf.ByteString rawId_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes raw_id = 1 [json_name = "rawId"];</code>
       * @return The rawId.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getRawId() {
        return rawId_;
      }
      /**
       * <code>bytes raw_id = 1 [json_name = "rawId"];</code>
       * @param value The rawId to set.
       * @return This builder for chaining.
       */
      public Builder setRawId(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        rawId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes raw_id = 1 [json_name = "rawId"];</code>
       * @return This builder for chaining.
       */
      public Builder clearRawId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rawId_ = getDefaultInstance().getRawId();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString attestationObject_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes attestation_object = 2 [json_name = "attestationObject"];</code>
       * @return The attestationObject.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getAttestationObject() {
        return attestationObject_;
      }
      /**
       * <code>bytes attestation_object = 2 [json_name = "attestationObject"];</code>
       * @param value The attestationObject to set.
       * @return This builder for chaining.
       */
      public Builder setAttestationObject(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        attestationObject_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes attestation_object = 2 [json_name = "attestationObject"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAttestationObject() {
        bitField0_ = (bitField0_ & ~0x00000002);
        attestationObject_ = getDefaultInstance().getAttestationObject();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString clientDataJson_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes client_data_json = 3 [json_name = "clientDataJson"];</code>
       * @return The clientDataJson.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getClientDataJson() {
        return clientDataJson_;
      }
      /**
       * <code>bytes client_data_json = 3 [json_name = "clientDataJson"];</code>
       * @param value The clientDataJson to set.
       * @return This builder for chaining.
       */
      public Builder setClientDataJson(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        clientDataJson_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bytes client_data_json = 3 [json_name = "clientDataJson"];</code>
       * @return This builder for chaining.
       */
      public Builder clearClientDataJson() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clientDataJson_ = getDefaultInstance().getClientDataJson();
        onChanged();
        return this;
      }

      private boolean active_ ;
      /**
       * <code>bool active = 4 [json_name = "active"];</code>
       * @return The active.
       */
      @java.lang.Override
      public boolean getActive() {
        return active_;
      }
      /**
       * <code>bool active = 4 [json_name = "active"];</code>
       * @param value The active to set.
       * @return This builder for chaining.
       */
      public Builder setActive(boolean value) {

        active_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool active = 4 [json_name = "active"];</code>
       * @return This builder for chaining.
       */
      public Builder clearActive() {
        bitField0_ = (bitField0_ & ~0x00000008);
        active_ = false;
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


      // @@protoc_insertion_point(builder_scope:zrchain.policy.SignMethodPasskey)
    }

    // @@protoc_insertion_point(class_scope:zrchain.policy.SignMethodPasskey)
    private static final com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey();
    }

    public static com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SignMethodPasskey>
        PARSER = new com.google.protobuf.AbstractParser<SignMethodPasskey>() {
      @java.lang.Override
      public SignMethodPasskey parsePartialFrom(
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

    public static com.google.protobuf.Parser<SignMethodPasskey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SignMethodPasskey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.zrchain.policy.SignMethodPasskeyProto.SignMethodPasskey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zrchain_policy_SignMethodPasskey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zrchain_policy_SignMethodPasskey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(zrchain/policy/sign_method_passkey.pro" +
      "to\022\016zrchain.policy\"\233\001\n\021SignMethodPasskey" +
      "\022\025\n\006raw_id\030\001 \001(\014R\005rawId\022-\n\022attestation_o" +
      "bject\030\002 \001(\014R\021attestationObject\022(\n\020client" +
      "_data_json\030\003 \001(\014R\016clientDataJson\022\026\n\006acti" +
      "ve\030\004 \001(\010R\006activeB\274\001\n\022com.zrchain.policyB" +
      "\026SignMethodPasskeyProtoZ7github.com/Zenr" +
      "ock-Foundation/zrchain/v5/x/policy/types" +
      "\242\002\003ZPX\252\002\016Zrchain.Policy\312\002\016Zrchain\\Policy" +
      "\342\002\032Zrchain\\Policy\\GPBMetadata\352\002\017Zrchain:" +
      ":Policyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_zrchain_policy_SignMethodPasskey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zrchain_policy_SignMethodPasskey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zrchain_policy_SignMethodPasskey_descriptor,
        new java.lang.String[] { "RawId", "AttestationObject", "ClientDataJson", "Active", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
