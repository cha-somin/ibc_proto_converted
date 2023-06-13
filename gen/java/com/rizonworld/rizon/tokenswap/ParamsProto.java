// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rizon/tokenswap/params.proto

package com.rizonworld.rizon.tokenswap;

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
      // @@protoc_insertion_point(interface_extends:rizonworld.rizon.tokenswap.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * swappable indicates whether tokenswap module is enabled or not
     * </pre>
     *
     * <code>bool swappable = 1 [json_name = "swappable", (.gogoproto.moretags) = "yaml:&#92;"swappable&#92;""];</code>
     * @return The swappable.
     */
    boolean getSwappable();

    /**
     * <pre>
     * signer is someone who can request tokenswap
     * </pre>
     *
     * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The signer.
     */
    java.lang.String getSigner();
    /**
     * <pre>
     * signer is someone who can request tokenswap
     * </pre>
     *
     * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The bytes for signer.
     */
    com.google.protobuf.ByteString
        getSignerBytes();

    /**
     * <pre>
     * limit is the maximum swappable amount
     * </pre>
     *
     * <code>int64 limit = 3 [json_name = "limit", (.gogoproto.moretags) = "yaml:&#92;"limit&#92;""];</code>
     * @return The limit.
     */
    long getLimit();
  }
  /**
   * <pre>
   * Params defines the parameters for the tokenswap module
   * </pre>
   *
   * Protobuf type {@code rizonworld.rizon.tokenswap.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:rizonworld.rizon.tokenswap.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      signer_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rizonworld.rizon.tokenswap.ParamsProto.internal_static_rizonworld_rizon_tokenswap_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rizonworld.rizon.tokenswap.ParamsProto.internal_static_rizonworld_rizon_tokenswap_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rizonworld.rizon.tokenswap.ParamsProto.Params.class, com.rizonworld.rizon.tokenswap.ParamsProto.Params.Builder.class);
    }

    public static final int SWAPPABLE_FIELD_NUMBER = 1;
    private boolean swappable_ = false;
    /**
     * <pre>
     * swappable indicates whether tokenswap module is enabled or not
     * </pre>
     *
     * <code>bool swappable = 1 [json_name = "swappable", (.gogoproto.moretags) = "yaml:&#92;"swappable&#92;""];</code>
     * @return The swappable.
     */
    @java.lang.Override
    public boolean getSwappable() {
      return swappable_;
    }

    public static final int SIGNER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object signer_ = "";
    /**
     * <pre>
     * signer is someone who can request tokenswap
     * </pre>
     *
     * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The signer.
     */
    @java.lang.Override
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * signer is someone who can request tokenswap
     * </pre>
     *
     * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
     * @return The bytes for signer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LIMIT_FIELD_NUMBER = 3;
    private long limit_ = 0L;
    /**
     * <pre>
     * limit is the maximum swappable amount
     * </pre>
     *
     * <code>int64 limit = 3 [json_name = "limit", (.gogoproto.moretags) = "yaml:&#92;"limit&#92;""];</code>
     * @return The limit.
     */
    @java.lang.Override
    public long getLimit() {
      return limit_;
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
      if (swappable_ != false) {
        output.writeBool(1, swappable_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signer_);
      }
      if (limit_ != 0L) {
        output.writeInt64(3, limit_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (swappable_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, swappable_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, signer_);
      }
      if (limit_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, limit_);
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
      if (!(obj instanceof com.rizonworld.rizon.tokenswap.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.rizonworld.rizon.tokenswap.ParamsProto.Params other = (com.rizonworld.rizon.tokenswap.ParamsProto.Params) obj;

      if (getSwappable()
          != other.getSwappable()) return false;
      if (!getSigner()
          .equals(other.getSigner())) return false;
      if (getLimit()
          != other.getLimit()) return false;
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
      hash = (37 * hash) + SWAPPABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSwappable());
      hash = (37 * hash) + SIGNER_FIELD_NUMBER;
      hash = (53 * hash) + getSigner().hashCode();
      hash = (37 * hash) + LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLimit());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.rizonworld.rizon.tokenswap.ParamsProto.Params prototype) {
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
     * Params defines the parameters for the tokenswap module
     * </pre>
     *
     * Protobuf type {@code rizonworld.rizon.tokenswap.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:rizonworld.rizon.tokenswap.Params)
        com.rizonworld.rizon.tokenswap.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.rizonworld.rizon.tokenswap.ParamsProto.internal_static_rizonworld_rizon_tokenswap_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.rizonworld.rizon.tokenswap.ParamsProto.internal_static_rizonworld_rizon_tokenswap_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.rizonworld.rizon.tokenswap.ParamsProto.Params.class, com.rizonworld.rizon.tokenswap.ParamsProto.Params.Builder.class);
      }

      // Construct using com.rizonworld.rizon.tokenswap.ParamsProto.Params.newBuilder()
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
        swappable_ = false;
        signer_ = "";
        limit_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.rizonworld.rizon.tokenswap.ParamsProto.internal_static_rizonworld_rizon_tokenswap_Params_descriptor;
      }

      @java.lang.Override
      public com.rizonworld.rizon.tokenswap.ParamsProto.Params getDefaultInstanceForType() {
        return com.rizonworld.rizon.tokenswap.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.rizonworld.rizon.tokenswap.ParamsProto.Params build() {
        com.rizonworld.rizon.tokenswap.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.rizonworld.rizon.tokenswap.ParamsProto.Params buildPartial() {
        com.rizonworld.rizon.tokenswap.ParamsProto.Params result = new com.rizonworld.rizon.tokenswap.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.rizonworld.rizon.tokenswap.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.swappable_ = swappable_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.signer_ = signer_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.limit_ = limit_;
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
        if (other instanceof com.rizonworld.rizon.tokenswap.ParamsProto.Params) {
          return mergeFrom((com.rizonworld.rizon.tokenswap.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.rizonworld.rizon.tokenswap.ParamsProto.Params other) {
        if (other == com.rizonworld.rizon.tokenswap.ParamsProto.Params.getDefaultInstance()) return this;
        if (other.getSwappable() != false) {
          setSwappable(other.getSwappable());
        }
        if (!other.getSigner().isEmpty()) {
          signer_ = other.signer_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getLimit() != 0L) {
          setLimit(other.getLimit());
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
                swappable_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                signer_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                limit_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private boolean swappable_ ;
      /**
       * <pre>
       * swappable indicates whether tokenswap module is enabled or not
       * </pre>
       *
       * <code>bool swappable = 1 [json_name = "swappable", (.gogoproto.moretags) = "yaml:&#92;"swappable&#92;""];</code>
       * @return The swappable.
       */
      @java.lang.Override
      public boolean getSwappable() {
        return swappable_;
      }
      /**
       * <pre>
       * swappable indicates whether tokenswap module is enabled or not
       * </pre>
       *
       * <code>bool swappable = 1 [json_name = "swappable", (.gogoproto.moretags) = "yaml:&#92;"swappable&#92;""];</code>
       * @param value The swappable to set.
       * @return This builder for chaining.
       */
      public Builder setSwappable(boolean value) {

        swappable_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * swappable indicates whether tokenswap module is enabled or not
       * </pre>
       *
       * <code>bool swappable = 1 [json_name = "swappable", (.gogoproto.moretags) = "yaml:&#92;"swappable&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearSwappable() {
        bitField0_ = (bitField0_ & ~0x00000001);
        swappable_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object signer_ = "";
      /**
       * <pre>
       * signer is someone who can request tokenswap
       * </pre>
       *
       * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
       * @return The signer.
       */
      public java.lang.String getSigner() {
        java.lang.Object ref = signer_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          signer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * signer is someone who can request tokenswap
       * </pre>
       *
       * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
       * @return The bytes for signer.
       */
      public com.google.protobuf.ByteString
          getSignerBytes() {
        java.lang.Object ref = signer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          signer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * signer is someone who can request tokenswap
       * </pre>
       *
       * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
       * @param value The signer to set.
       * @return This builder for chaining.
       */
      public Builder setSigner(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        signer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * signer is someone who can request tokenswap
       * </pre>
       *
       * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearSigner() {
        signer_ = getDefaultInstance().getSigner();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * signer is someone who can request tokenswap
       * </pre>
       *
       * <code>string signer = 2 [json_name = "signer", (.gogoproto.moretags) = "yaml:&#92;"signer&#92;""];</code>
       * @param value The bytes for signer to set.
       * @return This builder for chaining.
       */
      public Builder setSignerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        signer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private long limit_ ;
      /**
       * <pre>
       * limit is the maximum swappable amount
       * </pre>
       *
       * <code>int64 limit = 3 [json_name = "limit", (.gogoproto.moretags) = "yaml:&#92;"limit&#92;""];</code>
       * @return The limit.
       */
      @java.lang.Override
      public long getLimit() {
        return limit_;
      }
      /**
       * <pre>
       * limit is the maximum swappable amount
       * </pre>
       *
       * <code>int64 limit = 3 [json_name = "limit", (.gogoproto.moretags) = "yaml:&#92;"limit&#92;""];</code>
       * @param value The limit to set.
       * @return This builder for chaining.
       */
      public Builder setLimit(long value) {

        limit_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * limit is the maximum swappable amount
       * </pre>
       *
       * <code>int64 limit = 3 [json_name = "limit", (.gogoproto.moretags) = "yaml:&#92;"limit&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearLimit() {
        bitField0_ = (bitField0_ & ~0x00000004);
        limit_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:rizonworld.rizon.tokenswap.Params)
    }

    // @@protoc_insertion_point(class_scope:rizonworld.rizon.tokenswap.Params)
    private static final com.rizonworld.rizon.tokenswap.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.rizonworld.rizon.tokenswap.ParamsProto.Params();
    }

    public static com.rizonworld.rizon.tokenswap.ParamsProto.Params getDefaultInstance() {
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
    public com.rizonworld.rizon.tokenswap.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rizonworld_rizon_tokenswap_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rizonworld_rizon_tokenswap_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034rizon/tokenswap/params.proto\022\032rizonwor" +
      "ld.rizon.tokenswap\032\024gogoproto/gogo.proto" +
      "\"\225\001\n\006Params\0222\n\tswappable\030\001 \001(\010B\024\362\336\037\020yaml" +
      ":\"swappable\"R\tswappable\022)\n\006signer\030\002 \001(\tB" +
      "\021\362\336\037\ryaml:\"signer\"R\006signer\022&\n\005limit\030\003 \001(" +
      "\003B\020\362\336\037\014yaml:\"limit\"R\005limit:\004\230\240\037\000B\345\001\n\036com" +
      ".rizonworld.rizon.tokenswapB\013ParamsProto" +
      "Z.github.com/rizon-world/rizon/x/tokensw" +
      "ap/types\242\002\003RRT\252\002\032Rizonworld.Rizon.Tokens" +
      "wap\312\002\032Rizonworld\\Rizon\\Tokenswap\342\002&Rizon" +
      "world\\Rizon\\Tokenswap\\GPBMetadata\352\002\034Rizo" +
      "nworld::Rizon::Tokenswapb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_rizonworld_rizon_tokenswap_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rizonworld_rizon_tokenswap_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rizonworld_rizon_tokenswap_Params_descriptor,
        new java.lang.String[] { "Swappable", "Signer", "Limit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
