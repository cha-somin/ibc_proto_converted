// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: babylon/btclightclient/v1/params.proto

package com.babylon.btclightclient.v1;

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
      // @@protoc_insertion_point(interface_extends:babylon.btclightclient.v1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @return A list containing the insertHeadersAllowList.
     */
    java.util.List<java.lang.String>
        getInsertHeadersAllowListList();
    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @return The count of insertHeadersAllowList.
     */
    int getInsertHeadersAllowListCount();
    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @param index The index of the element to return.
     * @return The insertHeadersAllowList at the given index.
     */
    java.lang.String getInsertHeadersAllowList(int index);
    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the insertHeadersAllowList at the given index.
     */
    com.google.protobuf.ByteString
        getInsertHeadersAllowListBytes(int index);
  }
  /**
   * <pre>
   * Params defines the parameters for the module.
   * </pre>
   *
   * Protobuf type {@code babylon.btclightclient.v1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:babylon.btclightclient.v1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      insertHeadersAllowList_ =
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
      return com.babylon.btclightclient.v1.ParamsProto.internal_static_babylon_btclightclient_v1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.babylon.btclightclient.v1.ParamsProto.internal_static_babylon_btclightclient_v1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.babylon.btclightclient.v1.ParamsProto.Params.class, com.babylon.btclightclient.v1.ParamsProto.Params.Builder.class);
    }

    public static final int INSERT_HEADERS_ALLOW_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList insertHeadersAllowList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @return A list containing the insertHeadersAllowList.
     */
    public com.google.protobuf.ProtocolStringList
        getInsertHeadersAllowListList() {
      return insertHeadersAllowList_;
    }
    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @return The count of insertHeadersAllowList.
     */
    public int getInsertHeadersAllowListCount() {
      return insertHeadersAllowList_.size();
    }
    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @param index The index of the element to return.
     * @return The insertHeadersAllowList at the given index.
     */
    public java.lang.String getInsertHeadersAllowList(int index) {
      return insertHeadersAllowList_.get(index);
    }
    /**
     * <pre>
     * List of addresses which are allowed to insert headers to btc light client
     * if the list is empty, any address can insert headers
     * </pre>
     *
     * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the insertHeadersAllowList at the given index.
     */
    public com.google.protobuf.ByteString
        getInsertHeadersAllowListBytes(int index) {
      return insertHeadersAllowList_.getByteString(index);
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
      for (int i = 0; i < insertHeadersAllowList_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, insertHeadersAllowList_.getRaw(i));
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
        for (int i = 0; i < insertHeadersAllowList_.size(); i++) {
          dataSize += computeStringSizeNoTag(insertHeadersAllowList_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInsertHeadersAllowListList().size();
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
      if (!(obj instanceof com.babylon.btclightclient.v1.ParamsProto.Params)) {
        return super.equals(obj);
      }
      com.babylon.btclightclient.v1.ParamsProto.Params other = (com.babylon.btclightclient.v1.ParamsProto.Params) obj;

      if (!getInsertHeadersAllowListList()
          .equals(other.getInsertHeadersAllowListList())) return false;
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
      if (getInsertHeadersAllowListCount() > 0) {
        hash = (37 * hash) + INSERT_HEADERS_ALLOW_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getInsertHeadersAllowListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.babylon.btclightclient.v1.ParamsProto.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.babylon.btclightclient.v1.ParamsProto.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.babylon.btclightclient.v1.ParamsProto.Params parseFrom(
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
    public static Builder newBuilder(com.babylon.btclightclient.v1.ParamsProto.Params prototype) {
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
     * Params defines the parameters for the module.
     * </pre>
     *
     * Protobuf type {@code babylon.btclightclient.v1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:babylon.btclightclient.v1.Params)
        com.babylon.btclightclient.v1.ParamsProto.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.babylon.btclightclient.v1.ParamsProto.internal_static_babylon_btclightclient_v1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.babylon.btclightclient.v1.ParamsProto.internal_static_babylon_btclightclient_v1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.babylon.btclightclient.v1.ParamsProto.Params.class, com.babylon.btclightclient.v1.ParamsProto.Params.Builder.class);
      }

      // Construct using com.babylon.btclightclient.v1.ParamsProto.Params.newBuilder()
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
        insertHeadersAllowList_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.babylon.btclightclient.v1.ParamsProto.internal_static_babylon_btclightclient_v1_Params_descriptor;
      }

      @java.lang.Override
      public com.babylon.btclightclient.v1.ParamsProto.Params getDefaultInstanceForType() {
        return com.babylon.btclightclient.v1.ParamsProto.Params.getDefaultInstance();
      }

      @java.lang.Override
      public com.babylon.btclightclient.v1.ParamsProto.Params build() {
        com.babylon.btclightclient.v1.ParamsProto.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.babylon.btclightclient.v1.ParamsProto.Params buildPartial() {
        com.babylon.btclightclient.v1.ParamsProto.Params result = new com.babylon.btclightclient.v1.ParamsProto.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.babylon.btclightclient.v1.ParamsProto.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          insertHeadersAllowList_.makeImmutable();
          result.insertHeadersAllowList_ = insertHeadersAllowList_;
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
        if (other instanceof com.babylon.btclightclient.v1.ParamsProto.Params) {
          return mergeFrom((com.babylon.btclightclient.v1.ParamsProto.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.babylon.btclightclient.v1.ParamsProto.Params other) {
        if (other == com.babylon.btclightclient.v1.ParamsProto.Params.getDefaultInstance()) return this;
        if (!other.insertHeadersAllowList_.isEmpty()) {
          if (insertHeadersAllowList_.isEmpty()) {
            insertHeadersAllowList_ = other.insertHeadersAllowList_;
            bitField0_ |= 0x00000001;
          } else {
            ensureInsertHeadersAllowListIsMutable();
            insertHeadersAllowList_.addAll(other.insertHeadersAllowList_);
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
                ensureInsertHeadersAllowListIsMutable();
                insertHeadersAllowList_.add(s);
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

      private com.google.protobuf.LazyStringArrayList insertHeadersAllowList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureInsertHeadersAllowListIsMutable() {
        if (!insertHeadersAllowList_.isModifiable()) {
          insertHeadersAllowList_ = new com.google.protobuf.LazyStringArrayList(insertHeadersAllowList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @return A list containing the insertHeadersAllowList.
       */
      public com.google.protobuf.ProtocolStringList
          getInsertHeadersAllowListList() {
        insertHeadersAllowList_.makeImmutable();
        return insertHeadersAllowList_;
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @return The count of insertHeadersAllowList.
       */
      public int getInsertHeadersAllowListCount() {
        return insertHeadersAllowList_.size();
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @param index The index of the element to return.
       * @return The insertHeadersAllowList at the given index.
       */
      public java.lang.String getInsertHeadersAllowList(int index) {
        return insertHeadersAllowList_.get(index);
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @param index The index of the value to return.
       * @return The bytes of the insertHeadersAllowList at the given index.
       */
      public com.google.protobuf.ByteString
          getInsertHeadersAllowListBytes(int index) {
        return insertHeadersAllowList_.getByteString(index);
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @param index The index to set the value at.
       * @param value The insertHeadersAllowList to set.
       * @return This builder for chaining.
       */
      public Builder setInsertHeadersAllowList(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureInsertHeadersAllowListIsMutable();
        insertHeadersAllowList_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @param value The insertHeadersAllowList to add.
       * @return This builder for chaining.
       */
      public Builder addInsertHeadersAllowList(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureInsertHeadersAllowListIsMutable();
        insertHeadersAllowList_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @param values The insertHeadersAllowList to add.
       * @return This builder for chaining.
       */
      public Builder addAllInsertHeadersAllowList(
          java.lang.Iterable<java.lang.String> values) {
        ensureInsertHeadersAllowListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, insertHeadersAllowList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @return This builder for chaining.
       */
      public Builder clearInsertHeadersAllowList() {
        insertHeadersAllowList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of addresses which are allowed to insert headers to btc light client
       * if the list is empty, any address can insert headers
       * </pre>
       *
       * <code>repeated string insert_headers_allow_list = 1 [json_name = "insertHeadersAllowList"];</code>
       * @param value The bytes of the insertHeadersAllowList to add.
       * @return This builder for chaining.
       */
      public Builder addInsertHeadersAllowListBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureInsertHeadersAllowListIsMutable();
        insertHeadersAllowList_.add(value);
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


      // @@protoc_insertion_point(builder_scope:babylon.btclightclient.v1.Params)
    }

    // @@protoc_insertion_point(class_scope:babylon.btclightclient.v1.Params)
    private static final com.babylon.btclightclient.v1.ParamsProto.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.babylon.btclightclient.v1.ParamsProto.Params();
    }

    public static com.babylon.btclightclient.v1.ParamsProto.Params getDefaultInstance() {
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
    public com.babylon.btclightclient.v1.ParamsProto.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_babylon_btclightclient_v1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_babylon_btclightclient_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&babylon/btclightclient/v1/params.proto" +
      "\022\031babylon.btclightclient.v1\032\024gogoproto/g" +
      "ogo.proto\"I\n\006Params\0229\n\031insert_headers_al" +
      "low_list\030\001 \003(\tR\026insertHeadersAllowList:\004" +
      "\350\240\037\001B\350\001\n\035com.babylon.btclightclient.v1B\013" +
      "ParamsProtoZ6github.com/babylonchain/bab" +
      "ylon/x/btclightclient/types\242\002\003BBX\252\002\031Baby" +
      "lon.Btclightclient.V1\312\002\031Babylon\\Btclight" +
      "client\\V1\342\002%Babylon\\Btclightclient\\V1\\GP" +
      "BMetadata\352\002\033Babylon::Btclightclient::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_babylon_btclightclient_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_babylon_btclightclient_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_babylon_btclightclient_v1_Params_descriptor,
        new java.lang.String[] { "InsertHeadersAllowList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}