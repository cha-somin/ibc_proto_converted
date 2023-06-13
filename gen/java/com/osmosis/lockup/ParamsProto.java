// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/lockup/params.proto

package com.osmosis.lockup;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:osmosis.lockup.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @return A list containing the forceUnlockAllowedAddresses.
     */
    java.util.List<java.lang.String>
        getForceUnlockAllowedAddressesList();
    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @return The count of forceUnlockAllowedAddresses.
     */
    int getForceUnlockAllowedAddressesCount();
    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @param index The index of the element to return.
     * @return The forceUnlockAllowedAddresses at the given index.
     */
    java.lang.String getForceUnlockAllowedAddresses(int index);
    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the forceUnlockAllowedAddresses at the given index.
     */
    com.google.protobuf.ByteString
        getForceUnlockAllowedAddressesBytes(int index);
  }
  /**
   * Protobuf type {@code osmosis.lockup.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:osmosis.lockup.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      forceUnlockAllowedAddresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.lockup.ParamsProto.internal_static_osmosis_lockup_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.lockup.ParamsProto.internal_static_osmosis_lockup_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.lockup.ParamsProto.Params.class, com.osmosis.lockup.ParamsProto.Params.Builder.class);
    }

    public static final int FORCE_UNLOCK_ALLOWED_ADDRESSES_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList forceUnlockAllowedAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @return A list containing the forceUnlockAllowedAddresses.
     */
    public com.google.protobuf.ProtocolStringList
        getForceUnlockAllowedAddressesList() {
      return forceUnlockAllowedAddresses_;
    }
    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @return The count of forceUnlockAllowedAddresses.
     */
    public int getForceUnlockAllowedAddressesCount() {
      return forceUnlockAllowedAddresses_.size();
    }
    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @param index The index of the element to return.
     * @return The forceUnlockAllowedAddresses at the given index.
     */
    public java.lang.String getForceUnlockAllowedAddresses(int index) {
      return forceUnlockAllowedAddresses_.get(index);
    }
    /**
     * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the forceUnlockAllowedAddresses at the given index.
     */
    public com.google.protobuf.ByteString
        getForceUnlockAllowedAddressesBytes(int index) {
      return forceUnlockAllowedAddresses_.getByteString(index);
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
      for (int i = 0; i < forceUnlockAllowedAddresses_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, forceUnlockAllowedAddresses_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < forceUnlockAllowedAddresses_.size(); i++) {
          dataSize += computeStringSizeNoTag(forceUnlockAllowedAddresses_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getForceUnlockAllowedAddressesList().size();
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
      if (!(obj instanceof com.osmosis.lockup.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.osmosis.lockup.ParamsProto.Params other = (com.osmosis.lockup.ParamsProto.Params) obj;

      if (!getForceUnlockAllowedAddressesList()
          .equals(other.getForceUnlockAllowedAddressesList())) return false;
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
      if (getForceUnlockAllowedAddressesCount() > 0) {
        hash = (37 * hash) + FORCE_UNLOCK_ALLOWED_ADDRESSES_FIELD_NUMBER;
        hash = (53 * hash) + getForceUnlockAllowedAddressesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.osmosis.lockup.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.osmosis.lockup.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.osmosis.lockup.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.osmosis.lockup.ParamsProto.Params prototype) {
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
     * Protobuf type {@code osmosis.lockup.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:osmosis.lockup.Params)
        com.osmosis.lockup.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.osmosis.lockup.ParamsProto.internal_static_osmosis_lockup_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.osmosis.lockup.ParamsProto.internal_static_osmosis_lockup_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.osmosis.lockup.ParamsProto.Params.class, com.osmosis.lockup.ParamsProto.Params.Builder.class);
      }

      // Construct using com.osmosis.lockup.ParamsProto.Params.newBuilder()
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
        forceUnlockAllowedAddresses_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.osmosis.lockup.ParamsProto.internal_static_osmosis_lockup_Params_descriptor;
      }

      @java.lang.Override
      public com.osmosis.lockup.ParamsProto.Params getDefaultInstanceForType() {
        return com.osmosis.lockup.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.osmosis.lockup.ParamsProto.Params build() {
        com.osmosis.lockup.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.osmosis.lockup.ParamsProto.Params buildPartial() {
        com.osmosis.lockup.ParamsProto.Params result = new com.osmosis.lockup.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.osmosis.lockup.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          forceUnlockAllowedAddresses_.makeImmutable();
          result.forceUnlockAllowedAddresses_ = forceUnlockAllowedAddresses_;
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
        if (other instanceof com.osmosis.lockup.ParamsProto.Params) {
          return mergeFrom((com.osmosis.lockup.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.osmosis.lockup.ParamsProto.Params other) {
        if (other == com.osmosis.lockup.ParamsProto.Params.getDefaultInstance()) return this;
        if (!other.forceUnlockAllowedAddresses_.isEmpty()) {
          if (forceUnlockAllowedAddresses_.isEmpty()) {
            forceUnlockAllowedAddresses_ = other.forceUnlockAllowedAddresses_;
            bitField0_ |= 0x00000001;
          } else {
            ensureForceUnlockAllowedAddressesIsMutable();
            forceUnlockAllowedAddresses_.addAll(other.forceUnlockAllowedAddresses_);
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureForceUnlockAllowedAddressesIsMutable();
                forceUnlockAllowedAddresses_.add(s);
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

      private com.google.protobuf.LazyStringArrayList forceUnlockAllowedAddresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureForceUnlockAllowedAddressesIsMutable() {
        if (!forceUnlockAllowedAddresses_.isModifiable()) {
          forceUnlockAllowedAddresses_ = new com.google.protobuf.LazyStringArrayList(forceUnlockAllowedAddresses_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @return A list containing the forceUnlockAllowedAddresses.
       */
      public com.google.protobuf.ProtocolStringList
          getForceUnlockAllowedAddressesList() {
        forceUnlockAllowedAddresses_.makeImmutable();
        return forceUnlockAllowedAddresses_;
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @return The count of forceUnlockAllowedAddresses.
       */
      public int getForceUnlockAllowedAddressesCount() {
        return forceUnlockAllowedAddresses_.size();
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @param index The index of the element to return.
       * @return The forceUnlockAllowedAddresses at the given index.
       */
      public java.lang.String getForceUnlockAllowedAddresses(int index) {
        return forceUnlockAllowedAddresses_.get(index);
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @param index The index of the value to return.
       * @return The bytes of the forceUnlockAllowedAddresses at the given index.
       */
      public com.google.protobuf.ByteString
          getForceUnlockAllowedAddressesBytes(int index) {
        return forceUnlockAllowedAddresses_.getByteString(index);
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @param index The index to set the value at.
       * @param value The forceUnlockAllowedAddresses to set.
       * @return This builder for chaining.
       */
      public Builder setForceUnlockAllowedAddresses(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureForceUnlockAllowedAddressesIsMutable();
        forceUnlockAllowedAddresses_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @param value The forceUnlockAllowedAddresses to add.
       * @return This builder for chaining.
       */
      public Builder addForceUnlockAllowedAddresses(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureForceUnlockAllowedAddressesIsMutable();
        forceUnlockAllowedAddresses_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @param values The forceUnlockAllowedAddresses to add.
       * @return This builder for chaining.
       */
      public Builder addAllForceUnlockAllowedAddresses(
          java.lang.Iterable<java.lang.String> values) {
        ensureForceUnlockAllowedAddressesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forceUnlockAllowedAddresses_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearForceUnlockAllowedAddresses() {
        forceUnlockAllowedAddresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string force_unlock_allowed_addresses = 1 [json_name = "forceUnlockAllowedAddresses", (.gogoproto.moretags) = "yaml:&#92;"force_unlock_allowed_address&#92;""];</code>
       * @param value The bytes of the forceUnlockAllowedAddresses to add.
       * @return This builder for chaining.
       */
      public Builder addForceUnlockAllowedAddressesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureForceUnlockAllowedAddressesIsMutable();
        forceUnlockAllowedAddresses_.add(value);
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


      // @@protoc_insertion_point(builder_scope:osmosis.lockup.Params)
    }

    // @@protoc_insertion_point(class_scope:osmosis.lockup.Params)
    private static final com.osmosis.lockup.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.osmosis.lockup.ParamsProto.Params();
    }

    public static com.osmosis.lockup.ParamsProto.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
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

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.osmosis.lockup.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_lockup_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_lockup_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033osmosis/lockup/params.proto\022\016osmosis.l" +
      "ockup\032\024gogoproto/gogo.proto\"v\n\006Params\022l\n" +
      "\036force_unlock_allowed_addresses\030\001 \003(\tB\'\362" +
      "\336\037#yaml:\"force_unlock_allowed_address\"R\033" +
      "forceUnlockAllowedAddressesB\254\001\n\022com.osmo" +
      "sis.lockupB\013ParamsProtoZ2github.com/osmo" +
      "sis-labs/osmosis/v15/x/lockup/types\242\002\003OL" +
      "X\252\002\016Osmosis.Lockup\312\002\016Osmosis\\Lockup\342\002\032Os" +
      "mosis\\Lockup\\GPBMetadata\352\002\017Osmosis::Lock" +
      "upb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_osmosis_lockup_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_lockup_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_lockup_Params_descriptor,
        new java.lang.String[] { "ForceUnlockAllowedAddresses", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
